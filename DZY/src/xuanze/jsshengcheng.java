package xuanze;
import xuanze.dr.*;


import xuanze.js.*;
import zhandou.zhandoujiemian;

import javax.swing.*;


public class jsshengcheng {
    public  static String js1;
    public  static String js2;
    public  static String js3;
    public  static String dr;
    public  static  int jsxl1;
    public  static  int jsxl2;
    public  static  int jsxl3;
    public  static  byte js1dh;
    public  static  byte js2dh;
    public  static  byte js3dh;
    public  static  byte drdh;
    public  static  int drxl;

    public  static  byte jsxz;//角色选择——1：为js1赋值，2：为js2赋值，

    public  static  ImageIcon lvab=new ImageIcon("E:\\DZY\\src\\tp\\安柏.jpg");
    public  static  ImageIcon lvbbl=new ImageIcon("E:\\DZY\\src\\tp\\芭芭拉.jpg");
    public  static  ImageIcon lvkq=new ImageIcon("E:\\DZY\\src\\tp\\刻晴.jpg");
    public  static  ImageIcon lvsllh=new ImageIcon("E:\\DZY\\src\\tp\\神里绫华.jpg");
    public  static  ImageIcon lvwd=new ImageIcon("E:\\DZY\\src\\tp\\温迪.jpg");
    public  static  ImageIcon lvfml=new ImageIcon("E:\\DZY\\src\\tp\\风魔龙.jpg");
    public  static  ImageIcon lvgz=new ImageIcon("E:\\DZY\\src\\tp\\公子.jpg");
    public  static  ImageIcon lvns=new ImageIcon("E:\\DZY\\src\\tp\\女士.jpg");

    public static void jssc(){//根据jsxz的数值不同为js123赋值
        //确定角色名：js1，角色血量：jsxl1，直接在战斗面板生成立绘

        switch (xuanzejiemian.js1xh){//用人物类的dh是一个错误
            case 1:new ab();
                js1=ab.name;//直接加入到战斗面板里面就不需要中间变量了
                jsxl1=ab.xl;//打错了
                js1dh=ab.dh;
                zhandoujiemian.lh1.setIcon(lvab);
                break;
                //测试System.out.println(js1+""+jsxl1+ab.xl);
            case 2:js1=bbl.name;
                jsxl1=bbl.xl;
                js1dh=bbl.dh;
                zhandoujiemian.lh1.setIcon(lvbbl);
                break;
            case 3:js1=kq.name;
                jsxl1=kq.xl;
                js1dh=kq.dh;
                zhandoujiemian.lh1.setIcon(lvkq);
                break;
            case 4:js1=sllh.name;
                jsxl1=sllh.xl;
                js1dh=sllh.dh;
                zhandoujiemian.lh1.setIcon(lvsllh);
                break;
            case 5:js1=wd.name;
                jsxl1=wd.xl;
                js1dh=wd.dh;
                zhandoujiemian.lh1.setIcon(lvwd);
                break;
        }

        switch (xuanzejiemian.js2xh){
            case 1:js2=ab.name;
                jsxl2=ab.xl;
                js2dh=ab.dh;
                zhandoujiemian.lh2.setIcon(lvab);
                break;
            case 2:js2=bbl.name;
                jsxl2=bbl.xl;
                js2dh=bbl.dh;
                zhandoujiemian.lh2.setIcon(lvbbl);
                break;
            case 3:js2=kq.name;
                jsxl2=kq.xl;
                js2dh=kq.dh;
                zhandoujiemian.lh2.setIcon(lvkq);
                break;
            case 4:js2=sllh.name;
                jsxl2=sllh.xl;
                js2dh=sllh.dh;
                zhandoujiemian.lh2.setIcon(lvsllh);
                break;
            case 5:js2=wd.name;
                jsxl2=wd.xl;
                js2dh=wd.dh;
                zhandoujiemian.lh2.setIcon(lvwd);
                break;
        }

        switch (xuanzejiemian.js3xh){
            case 1:js3=ab.name;
                jsxl3=ab.xl;
                js3dh=ab.dh;
                zhandoujiemian.lh3.setIcon(lvab);
                break;
            case 2:js3=bbl.name;
                jsxl3=bbl.xl;
                js3dh=bbl.dh;
                zhandoujiemian.lh3.setIcon(lvbbl);
                break;
            case 3:js3=kq.name;
                jsxl3=kq.xl;
                js3dh=kq.dh;
                zhandoujiemian.lh3.setIcon(lvkq);
                break;
            case 4:js3=sllh.name;
                jsxl3=sllh.xl;
                js3dh=sllh.dh;
                zhandoujiemian.lh3.setIcon(lvsllh);
                break;
            case 5:js3=wd.name;
                jsxl3=wd.xl;
                js3dh=wd.dh;
                zhandoujiemian.lh3.setIcon(lvwd);
                break;
        }
    //敌人生成也放在这里
        switch (xuanzhedirenjiemian.drxh){
            case 1:
                dr= fml.drname;
                drxl=fml.drxl;
                drdh=fml.drdh;

                zhandoujiemian.drlh.setIcon(lvfml);
                break;
            case 2:
                dr= gz.drname;
                drxl=gz.drxl;
                drdh=gz.drdh;

                zhandoujiemian.drlh.setIcon(lvgz);
                break;
            case 3:
                dr= ns.drname;
                drxl= ns.drxl;
                drdh=ns.drdh;

                zhandoujiemian.drlh.setIcon(lvns);
                break;
        }
        zhandoujiemian.js1.setText(js1);
        zhandoujiemian.js2.setText(js2);
        zhandoujiemian.js3.setText(js3);
        zhandoujiemian.dr.setText(dr);
    }

    }

