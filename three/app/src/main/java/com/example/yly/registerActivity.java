package com.example.yly;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.ToggleButton;

/**
 * Created by 94282 on 2018/3/23.
 */

public class registerActivity extends Activity
{
    //按钮声明
    private Button btnReturn;	         //返回按钮
    private Button btnSendMessage;	 //发送验证码按钮
    private Button btnRegister;        //注册按钮
    private ToggleButton btnSeeorNoSee;//看密码按钮

    //输入声明
    private EditText UserPhone;	//输入的电话号码
    private EditText Message;	    //输入的验证码
    private EditText UserName;	    //输入的用户名
    private EditText Password;	    //输入的密码

    //得到的输入
    private String userPhone;   //得到的电话号码
    private String message;     //得到的验证码
    private String userName;    //得到的用户名
    private String password;    //得到的密码

    //密码是否可见
    private Boolean passwordCanSee = false;

    //返回的intent
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        intent = getIntent();

        //给按钮赋值
        btnReturn       = (Button) this.findViewById(R.id.RegisterReturn);
        btnSendMessage = (Button) this.findViewById(R.id.RegisterSendMessage);
        btnRegister    = (Button) this.findViewById(R.id.ResgisterButton);
        btnSeeorNoSee  = (ToggleButton) this.findViewById(R.id.RegisterSeeOrNoSee);

        //给文本赋值
        UserPhone = (EditText) this.findViewById(R.id.registerUserPhone);
        Message   = (EditText) this.findViewById(R.id.registerMessage);
        UserName  = (EditText) this.findViewById(R.id.registerUserName);
        Password  = (EditText) this.findViewById(R.id.registerPassword);

        //添加监听事件
        btnReturn.setOnClickListener(new ReturnButtonListener());
        btnSendMessage.setOnClickListener(new SendMessageButtonListener());
        btnSeeorNoSee.setOnClickListener(new SeeOrNoSeeButtonListener());
        btnRegister.setOnClickListener(new RegisterButtonListener());
    }

    //返回按钮
    class ReturnButtonListener implements View.OnClickListener
    {
        public void onClick(View v)//返回登录界面
        {
            registerActivity.this.setResult(1, intent);
            registerActivity.this.finish();
        }
    }

    //获取验证码按钮
    class SendMessageButtonListener implements View.OnClickListener
    {
        public void onClick(View v)//发送一条验证码
        {
            Toast.makeText(registerActivity.this, "后期设置成发出验证码", Toast.LENGTH_SHORT).show();
        }
    }

    //密码是否可见按钮
    class SeeOrNoSeeButtonListener implements View.OnClickListener
    {

        public void onClick(View v)//设置密码可见
        {

            if(passwordCanSee)
            {
                passwordCanSee = false;
                Password.setInputType(0x81);
                Password.setSelection(Password.getText().length());
            }
                else
            {
                passwordCanSee = true;
                Password.setInputType(0x90);
                Password.setSelection(Password.getText().length());
            }

        }
    }

    //注册按钮
    class RegisterButtonListener implements View.OnClickListener
    {
        public void onClick(View v)//注册
        {
            //判断电话号码是否为空
            if(UserPhone.getText().toString().length() != 0)
                userPhone = UserPhone.getText().toString();
            else
            {
                Toast.makeText(registerActivity.this, "电话号码不能为空", Toast.LENGTH_SHORT).show();
                return;
            }

            //判断验证码是否为空
            if(Message.getText().toString().length() != 0)
                message = Message.getText().toString();
            else
            {
                Toast.makeText(registerActivity.this, "验证码不能为空", Toast.LENGTH_SHORT).show();
                return;
            }

            //判断用户名是否为空
            if(UserName.getText().toString().length() != 0)
                userName = UserName.getText().toString();
            else
            {
                Toast.makeText(registerActivity.this, "用户名不能为空", Toast.LENGTH_SHORT).show();
                return;
            }

            //判断密码是否为空
            if(Password.getText().toString().length() >= 6)
                password = Password.getText().toString();
            else
            {
                Toast.makeText(registerActivity.this, "密码不足6位", Toast.LENGTH_SHORT).show();
                return;
            }

            //**************添加验证码判断和密码判断**************

            Toast.makeText(registerActivity.this, "注册成功", Toast.LENGTH_SHORT).show();

            registerActivity.this.setResult(1, intent);
            registerActivity.this.finish();

        }
    }
}
