package com.umeng.soexample;

import android.app.Application;

import com.umeng.commonsdk.UMConfigure;
import com.umeng.socialize.Config;
import com.umeng.socialize.PlatformConfig;

public class CommonApplication extends Application {

    @Override
    public void onCreate() {

        super.onCreate();

        // 设置友盟组件的LOG日志的开关，默认为false
        UMConfigure.setLogEnabled(true);
        // 初始化组件化基础库, 统计SDK/推送SDK/分享SDK都必须调用此初始化接口
        // 参数二 友盟APP_KEY  参数二 渠道名称(分享可以不用)  参数三是类型  参数四是推送用的可以为""
        UMConfigure.init(this, "59892f08310c9307b60023d0", "Umeng", UMConfigure.DEVICE_TYPE_PHONE, "");
        // 开启ShareSDK debug模式，方便定位错误，具体错误检查方式可以查看 http://dev.umeng.com/social/android/quick-integration 的报错必看，正式发布，请关闭该模式
        Config.DEBUG = true;
    }

    /*  代码块的描述: 各个平台的配置 配置三方平台的appkey：，建议放在全局Application或者程序入口 */
    static {
        PlatformConfig.setAlipay("2015111700822536");
        PlatformConfig.setDing("dingoalmlnohc0wggfedpk");
        // 豆瓣RENREN平台目前只能在服务器端配置
        PlatformConfig.setDropbox("oz8v5apet3arcdy", "h7p2pjbzkkxt02a");
        // 邮件
        // 印象笔记
        // facebook
        // flickr
        // foursquare
        // gplus
        // instagram
        PlatformConfig.setKakao("e4f60e065048eb031e235c806b31c70f");
        // line
        // linkedin
        PlatformConfig.setPinterest("1439206");
        // pocket
        PlatformConfig.setQQZone("100424468", "c7394704798a158208a74ab60104f0ba");
        // renren
        // 短信
        // 腾讯微博
        // tumblr
        PlatformConfig.setTwitter("3aIN7fuF685MuZ7jtXkQxalyi", "MK6FEYG63eWcpDFgRYw4w9puJhzDl0tyuqWjZ3M7XJuuG7mMbO");
        PlatformConfig.setVKontakte("5764965", "5My6SNliAaLxEm3Lyd9J");
        PlatformConfig.setWeixin("wxdc1e388c3822c80b", "3baf1193c85774b3fd9d18447d76cab0");
        // whatsapp
        PlatformConfig.setSinaWeibo("3921700954", "04b48b094faeb16683c32669824ebdad", "http://sns.whalecloud.com");
        PlatformConfig.setYixin("yxc0614e80c9304c11b0391514d09f13bf");
        // ynote
    }
}
