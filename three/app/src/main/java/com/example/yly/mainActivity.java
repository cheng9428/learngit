package com.example.yly;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.yly.db.CityCode;
import com.example.yly.db.ProvinceCode;
import com.example.yly.gson.County;
import com.example.yly.util.HttpUtil;
import com.example.yly.util.Utility;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

public class mainActivity extends Activity
{
    private ProgressDialog progressDialog;

    //文本声明
    private TextView UserNameText;		//用户名文字框
    private TextView UserAddressText;   	//地址文字框

    //按钮声明
    private Button btnChangeLeft;		    //切换手环按钮左
    private Button btnChangeRight;		//切换手环按钮右
    private Button btnHealthRight;		//健康状况按钮右
    private Button btnGPSRight;			//定位按钮右
    private Button btnEmotionRight;		//情绪检测按钮右
    private Button btnServer;			    //上门服务按钮
    private ImageButton btnIMG;		    //头像按钮
    private ImageButton btnHealthLeft;	//健康状况按钮左
    private ImageButton btnGPSLeft;		//定位按钮左
    private ImageButton btnEmotionLeft;	//情绪检测按钮左

    //省份、城市、区县
    private String provinceName;//省份
    private String cityName;     //城市
    private String countyName;   //区县

    //省份、城市 的id
    private int provinceId;//省份id
    private int cityId;     //城市id

    //weatherId
    private String weatherIdIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //给文本赋值
        UserNameText    = (TextView) this.findViewById(R.id.MainUserName);
        UserAddressText = (TextView) this.findViewById(R.id.MainAddress);

        //给按钮赋值
        btnChangeLeft	    = (Button) this.findViewById(R.id.MainChangeLeft);
        btnChangeRight  	= (Button) this.findViewById(R.id.MainChangeRight);
        btnHealthRight  	= (Button) this.findViewById(R.id.MainHealthRight);
        btnGPSRight		= (Button) this.findViewById(R.id.MainGPSRight);
        btnEmotionRight 	= (Button) this.findViewById(R.id.MainEmotionRight);
        btnServer		    = (Button) this.findViewById(R.id.LoginLoginButton);
        btnIMG			    = (ImageButton) this.findViewById(R.id.MainIMG);
        btnHealthLeft	    = (ImageButton) this.findViewById(R.id.MainHealthLeft);
        btnGPSLeft		    = (ImageButton) this.findViewById(R.id.MainGPSLeft);
        btnEmotionLeft  	= (ImageButton) this.findViewById(R.id.MainEmotionLeft);

        //添加监听事件
        btnIMG			    .setOnClickListener(new IMGButtonListener());
        btnChangeLeft   	.setOnClickListener(new ChangeButtonListener());
        btnChangeRight  	.setOnClickListener(new ChangeButtonListener());
        btnHealthLeft	    .setOnClickListener(new HealthButtonListener());
        btnHealthRight  	.setOnClickListener(new HealthButtonListener());
        btnGPSLeft		    .setOnClickListener(new GPSButtonListener());
        btnGPSRight		.setOnClickListener(new GPSButtonListener());
        btnEmotionLeft  	.setOnClickListener(new EmotionButtonListener());
        btnEmotionRight	.setOnClickListener(new EmotionButtonListener());
        btnServer		    .setOnClickListener(new ServerButtonListener());


        //******此处调用数据库*****
        UserNameText.setText("曹恩大傻逼");
        //btnIMG.setBackground();       //设置头像框

        //******此处调用GPS*******
        UserAddressText.setText("湖南、长沙、岳麓");
        provinceName = "湖南";
        cityName = "长沙";
        countyName = "岳麓";

        //遍历省份
        provinceId = ProvinceCode.getProvinceCode(provinceName);

        //遍历城市
        cityId = CityCode.getCityCode(cityName, provinceId);
    }

    class IMGButtonListener implements OnClickListener
    {
        public void onClick(View v)//跳转到头像界面
        {
            Toast.makeText(mainActivity.this, "跳转到头像界面", Toast.LENGTH_SHORT).show();
        }
    }

    class ChangeButtonListener implements OnClickListener
    {
        public void onClick(View v)//跳转到切换手环号界面
        {
            Toast.makeText(mainActivity.this, "跳转到切换手环号界面", Toast.LENGTH_SHORT).show();
        }
    }

    class GPSButtonListener implements OnClickListener
    {
        public void onClick(View v)//跳转到定位界面
        {
            Toast.makeText(mainActivity.this, "跳转到定位界面", Toast.LENGTH_SHORT).show();
        }
    }

    class HealthButtonListener implements OnClickListener
    {
        public void onClick(View v)//跳转到健康状况界面
        {
            Toast.makeText(mainActivity.this, "跳转到健康状况界面", Toast.LENGTH_SHORT).show();
        }
    }

    class EmotionButtonListener implements OnClickListener
    {
        public void onClick(View v)//跳转到情绪检测界面
        {
            Toast.makeText(mainActivity.this, "跳转到情绪检测界面", Toast.LENGTH_SHORT).show();
        }
    }

    class ServerButtonListener implements OnClickListener
    {
        public void onClick(View v)//跳转到天气服务界面
        {
            showProgressDialog();//显示加载界面

            queryFromServer();
        }
    }

    // 根据传入的地址从服务器上查询省市县数据。
    private void queryFromServer()
    {
        String address = "http://guolin.tech/api/china/" + provinceId + "/" + cityId;
        HttpUtil.sendOkHttpRequest(address, new Callback()
        {
            @Override
            public void onResponse(Call call, Response response) throws IOException
            {
                final String responseText = response.body().string();
                final County county = Utility.handleCountyResponse(responseText, countyName);
                runOnUiThread(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        if (county != null)
                        {
                            weatherIdIntent = county.weatherId;
                            closeProgressDialog();

                            Intent intent = new Intent();
                            intent.setClass(mainActivity.this, weatherActivity.class);

                            intent.putExtra("weather_id", weatherIdIntent);

                            mainActivity.this.startActivityForResult(intent, 1);
                        }
                        else
                        {
                            closeProgressDialog();
                            Toast.makeText(mainActivity.this, "获取信息失败", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }

            @Override
            public void onFailure(Call call, IOException e)
            {
                e.printStackTrace();
                runOnUiThread(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        closeProgressDialog();
                        Toast.makeText(mainActivity.this, "获取信息失败", Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });
    }

    //显示进度对话框
    private void showProgressDialog()
    {
        if (progressDialog == null)
        {
            progressDialog = new ProgressDialog(this);
            progressDialog.setMessage("正在加载...");
            progressDialog.setCanceledOnTouchOutside(false);
        }
        progressDialog.show();
    }

    // 关闭进度对话框
    public void closeProgressDialog()
    {
        if (progressDialog != null)
        {
            progressDialog.dismiss();
        }
    }

}
