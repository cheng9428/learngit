package com.example.yly.db;

import org.litepal.crud.DataSupport;

public class CityCode extends DataSupport
{
    public static int getCityCode(String city_name, int province_Id)
    {
        City[][] CityArray = new City[35][];

        CityArray[0] = new City[]{};

        CityArray[1] = new City[]
                {
                        new City(1, "北京")
                };

        CityArray[2] = new City[]
                {
                        new City(2, "上海")
                };

        CityArray[3] = new City[]
                {
                        new City(3, "天津")
                };

        CityArray[4] = new City[]
                {
                        new City(4, "重庆")
                };

        CityArray[5] = new City[]
                {
                        new City(5, "香港")
                };

        CityArray[6] = new City[]
                {
                        new City(6, "澳门")
                };

        CityArray[7] = new City[]
                {
                        new City(7, "台北"),
                        new City(8, "高雄"),
                        new City(9, "台中"),
                };

        CityArray[8] = new City[]
                {
                        new City(10, "哈尔滨"),new City(11, "齐齐哈尔"),new City(12, "牡丹江"),new City(13, "佳木斯"),new City(14, "绥化"),
                        new City(15, "黑河"),new City(16, "大兴安岭"),new City(17, "伊春"),new City(18, "大庆"),new City(19, "鸡西"),
                        new City(20, "鹤岗"),new City(21, "双鸭山")
                };

        CityArray[9] = new City[]
                {
                        new City(22, "长春"),new City(23, "吉林"),new City(24, "延吉"),new City(25, "四平"),new City(26, "通化"),
                        new City(27, "白城"),new City(28, "辽源"),new City(29, "松原"),new City(30, "白山")
                };

        CityArray[10] = new City[]
                {
                        new City(31, "沈阳"),new City(32, "大连"),new City(33, "鞍山"),new City(34, "抚顺"),new City(35, "本溪"),
                        new City(36, "丹东"),new City(37, "锦州"),new City(38, "营口"),new City(39, "阜新"),new City(40, "辽阳"),
                        new City(41, "铁岭"),new City(42, "朝阳"),new City(43, "盘锦"),new City(44, "葫芦岛")
                };

        CityArray[11] = new City[]
                {
                        new City(45, "呼和浩特"),new City(46, "包头"),new City(47, "乌海"),new City(48, "集宁"),new City(49, "通辽"),
                        new City(50, "赤峰"),new City(51, "鄂尔多斯"),new City(52, "临河"),new City(53, "锡林浩特"),new City(54, "海拉尔"),
                        new City(55, "乌兰浩特"),new City(56, "阿左旗")
                };

        CityArray[12] = new City[]
                {
                        new City(57, "石家庄"),new City(58, "保定"),new City(59, "张家口"),new City(60, "唐山"),new City(61, "廊坊"),
                        new City(62, "沧州"),new City(63, "衡水"),new City(64, "邢台"),new City(65, "邯郸"),new City(66, "秦皇岛")
                };

        CityArray[13] = new City[]
                {
                        new City(67, "郑州"),new City(68, "安阳"),new City(69, "新乡"),new City(70, "许昌"),new City(71, "平顶山"),
                        new City(72, "信阳"),new City(73, "南阳"),new City(74, "开封"),new City(75, "洛阳"),new City(76, "商丘"),
                        new City(77, "焦作"),new City(78, "鹤壁"),new City(79, "濮阳"),new City(80, "周口"),new City(81, "漯河"),
                        new City(82, "驻马店"),new City(83, "三门峡"),new City(84, "济源")
                };

        CityArray[14] = new City[]
                {
                        new City(85, "太原"),new City(86, "大同"), new City(87, "阳泉"),new City(88, "晋中"),new City(89, "长治"),
                        new City(90, "晋城"),new City(91, "临汾"), new City(92, "运城"),new City(93, "朔州"),new City(94, "忻州"),
                        new City(95, "离石")
                };

        CityArray[15] = new City[]
                {
                        new City(96, "济南"),new City(97, "青岛"), new City(98, "淄博"),new City(99, "德州"),new City(100, "烟台"),
                        new City(101, "潍坊"),new City(102, "济宁"), new City(103, "泰安"),new City(104, "临沂"),new City(105, "菏泽"),
                        new City(106, "滨州"),new City(107, "东营"), new City(108, "威海"),new City(109, "枣庄"),new City(110, "日照"),
                        new City(111, "莱芜"),new City(112, "聊城")
                };

        CityArray[16] = new City[]
                {
                        new City(113, "南京"),new City(114, "无锡"), new City(115, "镇江"),new City(116, "苏州"),new City(117, "南通"),
                        new City(118, "扬州"),new City(119, "盐城"), new City(120, "徐州"),new City(121, "淮安"),new City(122, "连云港"),
                        new City(123, "常州"),new City(124, "泰州"), new City(125, "宿迁")
                };

        CityArray[17] = new City[]
                {
                        new City(126, "杭州"),new City(127, "湖州"), new City(128, "嘉兴"),new City(129, "宁波"),new City(130, "绍兴"),
                        new City(131, "台州"),new City(132, "温州"), new City(133, "丽水"),new City(134, "金华"),new City(135, "衢州"),
                        new City(136, "舟山")
                };

        CityArray[18] = new City[]
                {
                        new City(137, "福州"),new City(138, "钓鱼岛"), new City(139, "厦门"),new City(140, "宁德"),new City(141, "莆田"),
                        new City(142, "泉州"),new City(143, "漳州"), new City(144, "龙岩"),new City(145, "三明"),new City(146, "南平")
                };

        CityArray[19] = new City[]
                {
                        new City(147, "南昌"),new City(148, "九江"), new City(149, "上饶"),new City(150, "抚州"),new City(151, "宜春"),
                        new City(152, "吉安"),new City(153, "赣州"), new City(154, "景德镇"),new City(155, "萍乡"),new City(156, "新余"),
                        new City(156, "鹰潭")
                };

        CityArray[20] = new City[]
                {
                        new City(158, "合肥"),new City(159, "蚌埠"), new City(160, "芜湖"),new City(161, "淮南"),new City(162, "马鞍山"),
                        new City(163, "安庆"),new City(164, "宿州"), new City(165, "阜阳"),new City(166, "亳州"),new City(167, "黄山"),
                        new City(168, "滁州"),new City(169, "淮北"), new City(170, "铜陵"),new City(171, "宣城"),new City(172, "六安"),
                        new City(173, "池州")
                };

        CityArray[21] = new City[]
                {
                        new City(174, "武汉"),new City(175, "襄阳"), new City(176, "鄂州"),new City(177, "孝感"),new City(178, "黄冈"),
                        new City(179, "黄石"),new City(180, "咸宁"), new City(181, "荆州"),new City(182, "宜昌"),new City(183, "恩施"),
                        new City(184, "十堰"),new City(185, "神农架"), new City(186, "随州"),new City(187, "荆门"),new City(188, "天门"),
                        new City(189, "仙桃"),new City(190, "潜江")
                };

        CityArray[22] = new City[]
                {
                        new City(191, "长沙"),new City(192, "湘潭"), new City(193, "株洲"),new City(194, "衡阳"),new City(195, "郴州"),
                        new City(196, "常德"),new City(197, "益阳"), new City(198, "娄底"),new City(199, "邵阳"),new City(200, "岳阳"),
                        new City(201, "张家界"),new City(202, "怀化"), new City(203, "永州"),new City(204, "吉首")
                };

        CityArray[23] = new City[]
                {
                        new City(205, "合肥"),new City(206, "蚌埠"), new City(207, "芜湖"),new City(208, "淮南"),new City(209, "马鞍山"),
                        new City(210, "安庆"),new City(211, "宿州"), new City(212, "阜阳"),new City(213, "亳州"),new City(214, "黄山"),
                        new City(215, "滁州"),new City(216, "淮北"), new City(217, "铜陵"),new City(218, "宣城"),new City(219, "六安"),
                        new City(220, "合肥"),new City(221, "蚌埠"), new City(222, "芜湖"),new City(223, "淮南"),new City(224, "马鞍山"),
                        new City(350, "安庆")
                };

        CityArray[24] = new City[]
                {
                        new City(226, "南宁"),new City(227, "崇左"), new City(228, "柳州"),new City(229, "来宾"),new City(230, "桂林"),
                        new City(231, "梧州"),new City(232, "贺州"), new City(233, "贵港"),new City(234, "玉林"),new City(235, "百色"),
                        new City(236, "钦州"),new City(237, "河池"), new City(238, "北海"),new City(239, "防城港")
                };

        CityArray[25] = new City[]
                {
                        new City(240, "海口"), new City(241, "三亚")
                };

        CityArray[26] = new City[]
                {
                        new City(242, "贵阳"),new City(243, "遵义"), new City(244, "安顺"),new City(245, "都匀"),new City(246, "凯里"),
                        new City(247, "铜仁"),new City(248, "毕节"), new City(249, "水城"),new City(250, "兴义")
                };

        CityArray[27] = new City[]
                {
                        new City(251, "昆明"),new City(252, "大理"), new City(253, "红河"),new City(254, "曲靖"),new City(255, "保山"),
                        new City(256, "文山"),new City(257, "玉溪"), new City(258, "楚雄"),new City(259, "普洱"),new City(260, "昭通"),
                        new City(261, "临沧"),new City(262, "怒江"), new City(263, "香格里拉"),new City(264, "丽江"),new City(265, "德宏"),
                        new City(266, "景洪")
                };

        CityArray[28] = new City[]
                {
                        new City(267, "成都"),new City(268, "攀枝花"), new City(269, "自贡"),new City(270, "绵阳"),new City(271, "南充"),
                        new City(272, "达州"),new City(273, "遂宁"), new City(274, "广安"),new City(275, "巴中"),new City(276, "泸州"),
                        new City(277, "宜宾"),new City(278, "内江"), new City(279, "资阳"),new City(280, "乐山"),new City(271, "眉山"),
                        new City(282, "凉山"),new City(283, "雅安"), new City(284, "甘孜"),new City(285, "阿坝"),new City(286, "德阳"),
                        new City(287, "广元")
                };

        CityArray[29] = new City[]
                {
                        new City(288, "拉萨"),new City(289, "日喀则"), new City(290, "山南"),new City(291, "林芝"),new City(292, "昌都"),
                        new City(293, "那曲"),new City(294, "阿里")
                };

        CityArray[30] = new City[]
                {
                        new City(295, "西安"),new City(296, "三原"), new City(297, "延长"),new City(298, "榆林"),new City(299, "渭南"),
                        new City(300, "商洛"),new City(301, "安康"), new City(302, "汉中"),new City(303, "宝鸡"),new City(304, "铜川"),
                        new City(305, "杨凌")
                };

        CityArray[31] = new City[]
                {
                        new City(306, "银川"),new City(307, "石嘴山"), new City(308, "吴忠"),new City(309, "固原"),new City(310, "中卫"),
                };

        CityArray[32] = new City[]
                {
                        new City(311, "兰州"),new City(312, "定西"), new City(313, "平凉"),new City(314, "庆阳"),new City(315, "武威"),
                        new City(316, "金昌"),new City(317, "张掖"), new City(318, "酒泉"),new City(319, "天水"),new City(320, "武都"),
                        new City(321, "临夏"),new City(322, "合作"), new City(323, "白银"),new City(324, "嘉峪关")
                };

        CityArray[33] = new City[]
                {
                        new City(325, "西宁"),new City(326, "海东"), new City(327, "黄南"),new City(328, "海南"),new City(329, "果洛"),
                        new City(330, "玉树"),new City(331, "海西"), new City(332, "海北"),new City(333, "格尔木")
                };

        CityArray[34] = new City[]
                {
                        new City(334, "乌鲁木齐"),new City(335, "克拉玛依"), new City(336, "石河子"),new City(337, "昌吉"),new City(338, "吐鲁番"),
                        new City(339, "库尔勒"),new City(340, "阿拉尔"), new City(341, "阿克苏"),new City(342, "喀什"),new City(343, "伊宁"),
                        new City(344, "塔城"),new City(345, "哈密"), new City(346, "和田"),new City(347, "阿勒泰"),new City(348, "阿图什"),
                        new City(349, "博乐")
                };

        for(City c : CityArray[province_Id])
        {
            if(c.cityName.equals(city_name))
                return c.cityCode;
        }

        return CityArray[province_Id][0].cityCode;
    }
}

class City
{
    public String cityName;
    public int cityCode;

    public City(int code, String city )
    {
        cityName = city;    //
        cityCode = code;    //
    }
}
