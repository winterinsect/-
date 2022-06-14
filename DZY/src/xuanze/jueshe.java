package xuanze;

import zhandou.zhandoujiemian;

import static xuanze.jsshengcheng.dr;
import static xuanze.jsshengcheng.drxl;
import static zhandou.zhandoujiemian.zhandoujilu;

public abstract class jueshe {
public static String name;
public static int xl;//血量
public static byte sx;//属性
//public static byte dh;//人物代号
public static byte lh;//没写备注就不知道它是什么了，知道了是立绘
public abstract void cx();//重写抽象方法，但是实际上没用
public static  int sh;

    public static void jsx1() {};

    public static void jsx2(){};

    public static void jsx4(){};
    public static void jn(){//在具体角色类里面重写一次
        zhandoujilu.append(name+"对"+ dr+"造成了"+sh+"点伤害\n");
        drxl-=sh;
        zhandoujilu.append(dr+"血量为"+drxl+"\n");
    };




//立绘直接用方法添加
}
