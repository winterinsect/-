package zhandou;

import java.util.Random;

import static zhandou.panding.*;
import static zhandou.shengchenganniu.*;

public class xiaochu {
    public static void x1(){
        System.out.println("实现了1消方法");
        if (ax<7) {
        for (int i = ax; i <= 6 ; i++) {
        d[ay-1][i-1]=d[ay-1][i];//ay改为ay-1
            // i!!!

        }
    }
        d[ay-1][6]= (byte) (1+ new Random().nextInt(3));//ay改为ay-1
        //zhandoujiemian.zhandoujilu.append("1消成功");
    }

    public static void x2(){//先判断axay与bxby哪个小
        System.out.println("实现了2消方法");
        if(ax<bx){
            if (ax<6) {
                for (int i = ax; i <= 5; i++) {
                    d[ay-1][i-1] = d[ay-1][i + 1];
                }
            }
        }else if (ax>bx){
            if (bx<6) {
                for (int i = bx; i <= 5; i++) {
                    d[by-1][i-1] = d[by-1][i + 1];
                }
            }
        }
        d[ay-1][5]= (byte) (1+ new Random().nextInt(3));
        d[ay-1][6]= (byte) (1+ new Random().nextInt(3));
        //zhandoujiemian.zhandoujilu.append("2消成功");
    }
    public static void sxx2(){//上下二消
        System.out.println("实现了2消方法");
            if (ax<7) {
                for (int i = ax; i < 7; i++) {
                    d[ay-1][i-1] = d[ay-1][i];
                }

                for (int i = bx; i < 7; i++) {
                    d[by-1][i-1] = d[by-1][i];
                }
            }
        d[ay-1][6]= (byte) (1+ new Random().nextInt(3));
        d[by-1][6]= (byte) (1+ new Random().nextInt(3));
        //zhandoujiemian.zhandoujilu.append("上下2消成功");
    }

    public static void x4(){
        System.out.println("实现了4消方法");
        // &&ad==d[ax][ay+1]&&ad==d[ax+1][ay]
        //这个应该写进panding里面
        if(ax<bx&&ay<by){//两个不行，写4个
            if (ax<6) {
                for (int i = ax; i < 6; i++) {
                    d[ay-1][i-1] = d[ay-1][i + 1];
                    d[ay][i-1] = d[ay][i+1];
                }
            }
        }else if(ax<bx&&ay>by){
            if (ax<6) {
                for (int i = ax; i < 6; i++) {
                    d[ay-2][i-1] = d[ay-2][i + 1];
                    d[ay-1][i-1] = d[ay-1][i+1];
                }
            }
        }else if(ax>bx&&ay>by){
            if (bx<6) {
                for (int i = bx; i < 6; i++) {
                    d[by-1][i-1] = d[by-1][i + 1];
                    d[by][i-1] = d[by][i+1];
                }
            }
        }else if (ax>bx&&ay<by){
            if (bx<6) {
                for (int i = bx; i < 6; i++) {
                    d[by-2][i-1] = d[by-2][i + 1];
                    d[by-1][i-1] = d[ay-1][i+1];
                }
            }
        }
        d[ay-1][6]= (byte) (1+ new Random().nextInt(3));
        d[ay-1][5]= (byte) (1+ new Random().nextInt(3));
        d[by-1][6]= (byte) (1+ new Random().nextInt(3));
        d[by-1][5]= (byte) (1+ new Random().nextInt(3));
        //zhandoujiemian.zhandoujilu.append("4消成功");
    }
    public static void ancxfz(){//按钮重新赋值
        System.out.println("实现了按钮重新赋值");
        x1y1.setText(" "+d[0][0]);
        x2y1.setText(" "+d[0][1]);
        x3y1.setText(" "+d[0][2]);
        x4y1.setText(" "+d[0][3]);
        x5y1.setText(" "+d[0][4]);
        x6y1.setText(" "+d[0][5]);
        x7y1.setText(" "+d[0][6]);
        x1y2.setText(" "+d[1][0]);
        x2y2.setText(" "+d[1][1]);
        x3y2.setText(" "+d[1][2]);
        x4y2.setText(" "+d[1][3]);
        x5y2.setText(" "+d[1][4]);
        x6y2.setText(" "+d[1][5]);
        x7y2.setText(" "+d[1][6]);
    }
}
