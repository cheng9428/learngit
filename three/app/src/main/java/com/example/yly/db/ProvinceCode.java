package com.example.yly.db;

public class ProvinceCode
{
    public static int getProvinceCode(String province_name)
    {
        Province[] provinceArray =
                {
                        new Province(1, "北京"),
                        new Province(2, "上海"),
                        new Province(3, "天津"),
                        new Province(4, "重庆"),
                        new Province(5, "香港"),

                        new Province(6, "澳门"),
                        new Province(7, "台湾"),
                        new Province(8, "黑龙江"),
                        new Province(9, "吉林"),
                        new Province(10, "辽宁"),

                        new Province(11, "内蒙古"),
                        new Province(12, "河北"),
                        new Province(13, "河南"),
                        new Province(14, "山西"),
                        new Province(15, "山东"),

                        new Province(16, "江苏"),
                        new Province(17, "浙江"),
                        new Province(18, "福建"),
                        new Province(19, "江西"),
                        new Province(20, "安徽"),

                        new Province(21, "湖北"),
                        new Province(22, "湖南"),
                        new Province(23, "广东"),
                        new Province(24, "广西"),
                        new Province(25, "海南"),

                        new Province(26, "贵州"),
                        new Province(27, "云南"),
                        new Province(28, "四川"),
                        new Province(29, "西藏"),
                        new Province(30, "陕西"),

                        new Province(31, "宁夏"),
                        new Province(32, "甘肃"),
                        new Province(33, "青海"),
                        new Province(34, "新疆")
                };

        for(Province p : provinceArray)
        {
            if(p.provinceName.equals(province_name))
                return p.provinceCode;
        }

        return 0;
    }
}

class Province
{
    public String provinceName;
    public int provinceCode;

    public Province(int code, String province )
    {
        provinceName = province;
        provinceCode = code;
    }
}
