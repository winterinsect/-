package xuanze.js;

import xuanze.jsshengcheng;
import xuanze.jueshe;
import zhandou.panding;

import java.util.Random;

import static xuanze.dr.fml.drname;
import static xuanze.dr.fml.drxl;
import static xuanze.jsshengcheng.dr;
import static zhandou.zhandoujiemian.zhandoujilu;

public class sllh extends jueshe {
    public static String name="神里绫华";
    public static int xl=2100;
    public static byte sx=4;//冰
    public static byte dh=4;
    public void cx() {}
    public static void jn(){//在具体角色类里面重写一次
        zhandoujilu.append("回合"+ panding.time+"\n");
        zhandoujilu.append(name+"对"+ jsshengcheng.dr+"造成了"+sh+"点伤害\n");
        jsshengcheng.drxl-=sh;
        zhandoujilu.append(jsshengcheng.dr+"血量为"+ jsshengcheng.drxl+"\n");
        zhandoujilu.append("\n");
    };
    public static void jsx1() {
        sh=470+ new Random().nextInt(60);//随机数来造成数值的随机
        //可以添加 if (drsx==1){sh=sh*1.5}实现了属性的克制
        jn();
    }


    public static void jsx2() {
        sh=970+ new Random().nextInt(60);
        jn();
    }


    public static void jsx4() {
        sh=1470+ new Random().nextInt(60);
        jn();
    }

}
