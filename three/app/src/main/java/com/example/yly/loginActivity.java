package com.example.yly;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by 94282 on 2018/3/23.
 */


public class loginActivity extends Activity
{
    //按钮声明
    private Button btnReturn;	//返回按钮	**********没做*********
    private Button btnLogin;	//登录按钮
    private Button btnReg;		//注册按钮
    private Button btnForget;	//忘记密码按钮

    //输入声明
    private EditText Number;	//输入的电话号码
    private EditText Password;	//输入的密码

    //得到的字符串声明
    private String number;		//输入的电话号码的字符串
    private String password;	//输入的密码的字符串

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //隐藏状态栏
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);

        //隐藏时间   好像是与上面二选一
        //getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        //给按钮赋值
        btnLogin	= (Button) this.findViewById(R.id.LoginLoginButton);
        btnReg		= (Button) this.findViewById(R.id.LoginRegisterButton);
        btnForget	= (Button) this.findViewById(R.id.LoginForgetButton);

        //给输入框赋值
        Number		= (EditText) this.findViewById(R.id.LoginNumberText);
        Password	= (EditText) this.findViewById(R.id.LoginPasswordText);

        //添加监听事件
        btnLogin .setOnClickListener(new loginButtonListener());
        btnReg	  .setOnClickListener(new registerButtonListener());
        btnForget.setOnClickListener(new forgetButtonListener());
    }

    class loginButtonListener implements OnClickListener
    {
        public void onClick(View v)
        {
            //判断电话号码是否为空
            if(Number.getText().toString().length() != 0)
                number = Number.getText().toString();
            else
            {
                resetText();//清空账号密码
                Toast.makeText(loginActivity.this, "电话号码不能为空", Toast.LENGTH_SHORT).show();
                return;
            }

            //判断密码是否为空
            if(Password.getText().toString().length() != 0)
                password = Password.getText().toString();
            else
            {
                Toast.makeText(loginActivity.this, "密码不能为空", Toast.LENGTH_SHORT).show();
                return;
            }

            //****判断账号密码是否对应****
            if(number.equals("1") && password.equals("1"))//***********记得修改***********
            {
                //清屏
                resetText();

                Intent intent = new Intent();
                intent.setClass(loginActivity.this, mainActivity.class);

                loginActivity.this.startActivity(intent);
            }
            else
            {
                Password.setText("");//清除密码，让用户重新输入密码

                Toast.makeText(loginActivity.this, "账号密码错误，请重新输入", Toast.LENGTH_SHORT).show();
            }
        }
    }

    class registerButtonListener implements OnClickListener
    {
        public void onClick(View v)//跳转到另一个界面
        {
            Intent intent = new Intent();
            intent.setClass(loginActivity.this, registerActivity.class);

            //清屏
            resetText();

            loginActivity.this.startActivityForResult(intent, 1);
        }
    }

    class forgetButtonListener implements OnClickListener
    {
        public void onClick(View v)//跳转到另一个界面
        {
/*
			Intent intent = new Intent();
			intent.setClass(loginActivity.this, forgetActivity.class);

			//清屏
			resetText();

			loginActivity.this.startActivity(intent);
*/
            Toast.makeText(loginActivity.this, "跳转到忘记密码界面", Toast.LENGTH_SHORT).show();
        }
    }

    //清屏
    private void resetText()
    {
        Number.setText("");
        Password.setText("");
    }
}
