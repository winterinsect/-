package zhandou;

import xuanze.jsshengcheng;

//import static xuanze.xzjmcuhua.jf;
import static zhandou.shengchenganniu.d;
import static zhandou.zhandoujiemian.*;
import static zhandou.zhandoujiemian.drxl;

public class panding {
public static byte time=1;
public static byte drcd;
public static byte drkygj;
   static byte anzt=1;//判断按钮的状态0=未点击，1=第一次点击，2=第二次点击
    static byte ax;static byte bx=-1;static byte ay;static byte by=-1;static byte ad;static byte bd=-1;
    //a和b 的x,y坐标和状态
   static void pd(){
        if (ad==bd){
            if(ax==bx&&ay==by){
                System.out.println("满足了1消的前置条件"+"axay:"+ax+ay+"bxby:"+bx+by);
                if (ad == 1){
                    jineng.x1a();
                }else if(ad == 2){
                    jineng.x1b();
                }else if(ad == 3){
                    jineng.x1c();
                }

                //System.out.println("执行完技能方法后"+"axay:"+ax+ay+"bxby:"+bx+by);
                xiaochu.x1(); ggff();
            }
            else if(ay==by&&ax==bx+1){
                if (ad == 1){
                    jineng.x2a();
                }else if(ad == 2){
                    jineng.x2b();
                }else if(ad == 3){
                    jineng.x2c();
                }
                xiaochu.x2(); ggff();
                //time++;zhandoujiemian.time.setText("time:"+String.valueOf(time));drgj();xiaocu.x2();xiaocu.ancxfz();ancz();
            }
            else if(ay==by&&ax==bx-1){
                if (ad == 1){
                    jineng.x2a();
                }else if(ad == 2){
                    jineng.x2b();
                }else if(ad == 3){
                    jineng.x2c();
                }
                xiaochu.x2(); ggff();
                //time++;zhandoujiemian.time.setText("time:"+String.valueOf(time));drgj();xiaocu.x2();xiaocu.ancxfz();ancz();
            }
            else if(ax==bx&&ay==by+1){
                if (ad == 1){
                    jineng.x2a();
                }else if(ad == 2){
                    jineng.x2b();
                }else if(ad == 3){
                    jineng.x2c();
                }
                xiaochu.sxx2(); ggff();
                //time++;zhandoujiemian.time.setText("time:"+String.valueOf(time)); drgj();xiaocu.sxx2();xiaocu.ancxfz();ancz();
            }
            else if(ax==bx&&ay==by-1){
                if (ad == 1){
                    jineng.x2a();
                }else if(ad == 2){
                    jineng.x2b();
                }else if(ad == 3){
                    jineng.x2c();
                }
                xiaochu.sxx2(); ggff();
                //time++;zhandoujiemian.time.setText("time:"+String.valueOf(time)); drgj();xiaocu.sxx2();xiaocu.ancxfz();ancz();
            }
            else if (ax==bx+1&&ay==by+1) {
                if (ad == d[ay - 2][ax - 1] && ad == d[ay - 1][ax - 2]) {
                    if (ad == 1) {
                        jineng.x4a();
                    } else if (ad == 2) {
                        jineng.x4b();
                    } else if (ad == 3) {
                        jineng.x4c();
                    }
                    xiaochu.x4();ggff();
                    //time++;zhandoujiemian.time.setText("time:"+String.valueOf(time)); drgj();xiaocu.x4();xiaocu.ancxfz();ancz();}
                }
            }
            else if (ax==bx+1&&ay==by-1){
                if(ad==d[ay][ax-1]&&ad==d[ay-1][ax-2]){//数组越界了，怎么处理
                if (ad == 1){
                    jineng.x4a();
                }else if(ad == 2){
                    jineng.x4b();
                }else if(ad == 3){
                    jineng.x4c();
                }
                    xiaochu.x4();ggff();
                //time++;zhandoujiemian.time.setText("time:"+String.valueOf(time));drgj(); xiaocu.x4();xiaocu.ancxfz();ancz();
                }
            }
            else if (ax==bx-1&&ay==by+1){
                if (ad==d[ay-2][ax-1]&&ad==d[ay-1][ax]) {
                    if (ad == 1) {
                        jineng.x4a();
                    } else if (ad == 2) {
                        jineng.x4b();
                    } else if (ad == 3) {
                        jineng.x4c();
                    }

                xiaochu.x4();ggff();
                //time++;zhandoujiemian.time.setText("time:"+String.valueOf(time));drgj(); xiaocu.x4();xiaocu.ancxfz();ancz();
                }
            }
            else if (ax==bx-1&&ay==by-1){
                // 测试System.out.println(ax+","+ay+","+bx+","+by+",");

              if(ad==d[ay][ax-1]&&ad==d[ay-1][ax]) {
                    if (ad == 1) {
                        jineng.x4a();
                    } else if (ad == 2) {
                        jineng.x4b();
                    } else if (ad == 3) {
                        jineng.x4c();
                    }
                  xiaochu.x4();ggff();
                    //time++;zhandoujiemian.time.setText("time:"+String.valueOf(time));drgj();xiaocu.x4();xiaocu.ancxfz();ancz();
                }
            }
            else {
                if (anzt>1) {
                    ancz();//将按钮的B状态改为A状态
                }
                //测试
                System.out.println("ad=bd但请重新点击，按钮坐标为"+ax+""+ay+"按钮状态为"+anzt);
            }

        }else if(bx!=-1){//按钮被点击，b状态被调用，此时让它回到初始状态
            if (anzt>1) {
                ancz();//将按钮的B状态改为A状态
            }
            //测试
            System.out.println("请重新点击，按钮坐标为"+ax+""+ay+"按钮状态为"+anzt);
        }
    }
    static void ancz(){//按钮重置、
        ax=bx;ay=by;ad=bd;anzt=1;bx=-1;by=-1;bd=-1;//重复两次会有bug,所以在点错后要添加anzt>1的条件来限定重复重置
}

    static void drgj(){//敌人攻击
        if(time%3==0){//让敌人释放技能的前置条件，因为和time回合数有关，所以放在ancz里面
            drcd++;
            drkygj++;
            jineng.drgj();
        }
    }
    static void xlgb(){//血量改变
        js1xl.setText(jsshengcheng.jsxl1+"/"+jsxl1max);
        js2xl.setText(jsshengcheng.jsxl2+"/"+jsxl2max);
        js3xl.setText(jsshengcheng.jsxl3+"/"+jsxl3max);
        drxl.setText(jsshengcheng.drxl+"/"+drxlmax);
    }
    static void slpd(){//胜利判断
        if(jsshengcheng.drxl<=0){
            //jsshengcheng.drxl=0;
            //弹出一个新面板
            new shengli();
            System.out.println("游戏胜利，恭喜您");
        }
        if(jsshengcheng.jsxl1<=0||jsshengcheng.jsxl2<=0||jsshengcheng.jsxl3<=0){
            new sibai();
            System.out.println("游戏失败");
        }
    }
    static void ggff(){//公共方法，提高了可维护性，同样降低了效率
        time++;
        zhandoujiemian.time.setText("  time:"+String.valueOf(time));//让计数器增加
        drgj();xlgb();slpd();
        xiaochu.ancxfz();ancz();
    }
}
