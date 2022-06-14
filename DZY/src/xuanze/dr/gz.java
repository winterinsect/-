package xuanze.dr;

import xuanze.diren;
import zhandou.panding;

import java.util.Random;

import static xuanze.jsshengcheng.*;
import static zhandou.zhandoujiemian.zhandoujilu;

public class gz extends diren {
    public static String  drname="公子";
    public static byte drdh=2;
    public static int drxl=10000;
    public static byte drsx=2;
    public static byte drcd=0;//敌人攻击cd
    public static byte drkygj=0;//敌人可以攻击，两个标记放一起在能攻击
    public static void drgj(){//敌人攻击
        if(panding.time>20){
            jsxl1=0;jsxl2=0;jsxl3=0;
            System.out.println("您被公子秒杀了");
            zhandoujilu.append("您被公子秒杀了\n");
        }
        if(drcd>0){
            if (drcd%2==1&&drkygj==1){
                int sh=470+ new Random().nextInt(60);
                int xr=1+new Random().nextInt(3);
                if (xr==1){
                    jsxl1-=sh;
                    zhandoujilu.append("公子对"+js1+"造成"+sh+"点伤害\n");
                    zhandoujilu.append("\n");
                }else if (xr==2){
                    jsxl2-=sh;
                    zhandoujilu.append("公子对"+js2+"造成"+sh+"点伤害\n");
                    zhandoujilu.append("\n");
                }else if (xr==3){
                    jsxl3-=sh;
                    zhandoujilu.append("公子对"+js3+"造成"+sh+"点伤害\n");
                    zhandoujilu.append("\n");
                }
                System.out.println("公子进行第一种攻击");

                panding.drkygj--;
                //再写一个显示角色血量的方法--抽象类里
            }else if (drcd%2==0&&drkygj==1){
                System.out.println("公子进行第二种攻击");
                int sh=470+ new Random().nextInt(60);
                jsxl1-=sh;jsxl2-=sh;jsxl3-=sh;
                zhandoujilu.append("公子进行全体攻击，对所有人造成"+sh+"点伤害\n");
                zhandoujilu.append("\n");
                panding.drkygj--;
            }
        }

    }
}
