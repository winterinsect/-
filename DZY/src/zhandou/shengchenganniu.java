package zhandou;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;


class shengchenganniu extends JPanel implements ActionListener {
  public  static byte [][] d=new byte [2][7];//按钮的代号
    static JButton x1y1=new JButton();
    static JButton x2y1=new JButton();
    static JButton x3y1=new JButton();
    static JButton x4y1=new JButton();
    static JButton x5y1=new JButton();
    static JButton x6y1=new JButton();
    static JButton x7y1=new JButton();
    static JButton x1y2=new JButton();
    static JButton x2y2=new JButton();
    static JButton x3y2=new JButton();
    static JButton x4y2=new JButton();
    static JButton x5y2=new JButton();
    static JButton x6y2=new JButton();
    static JButton x7y2=new JButton();





    public shengchenganniu(){
        setLayout(null);
        setBackground(null);//设置背景透明
        setOpaque(false);//设置背景透明
        huizianniu();
    }
    /* 绘制按钮 */
    private void huizianniu() {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j <7 ; j++) {
                int sjs=1+ new Random().nextInt(3);
                d[i][j]= (byte) sjs;
            }
        }
        int xjl=0;


        x1y1.setText(" "+d[0][0]);
        x1y1.setBounds(xjl,0,70,70);xjl+=80;

        x2y1.setText(" "+d[0][1]);
        x2y1.setBounds(xjl,0,70,70);xjl+=80;

        x3y1.setText(" "+d[0][2]);
        x3y1.setBounds(xjl,0,70,70);xjl+=80;

        x4y1.setText(" "+d[0][3]);
        x4y1.setBounds(xjl,0,70,70);xjl+=80;

        x5y1.setText(" "+d[0][4]);
        x5y1.setBounds(xjl,0,70,70);xjl+=80;

        x6y1.setText(" "+d[0][5]);
        x6y1.setBounds(xjl,0,70,70);xjl+=80;

        x7y1.setText(" "+d[0][6]);
        x7y1.setBounds(xjl,0,70,70);xjl=0;


        x1y2.setText(" "+d[1][0]);
        x1y2.setBounds(xjl,80,70,70);xjl+=80;

        x2y2.setText(" "+d[1][1]);
        x2y2.setBounds(xjl,80,70,70);xjl+=80;

        x3y2.setText(" "+d[1][2]);
        x3y2.setBounds(xjl,80,70,70);xjl+=80;

        x4y2.setText(" "+d[1][3]);
        x4y2.setBounds(xjl,80,70,70);xjl+=80;

        x5y2.setText(" "+d[1][4]);
        x5y2.setBounds(xjl,80,70,70);xjl+=80;

        x6y2.setText(" "+d[1][5]);
        x6y2.setBounds(xjl,80,70,70);xjl+=80;

        x7y2.setText(" "+d[1][6]);
        x7y2.setBounds(xjl,80,70,70);

        x1y1.addActionListener(this);
        x2y1.addActionListener(this);
        x3y1.addActionListener(this);
        x4y1.addActionListener(this);
        x5y1.addActionListener(this);
        x6y1.addActionListener(this);
        x7y1.addActionListener(this);
        x1y2.addActionListener(this);
        x2y2.addActionListener(this);
        x3y2.addActionListener(this);
        x4y2.addActionListener(this);
        x5y2.addActionListener(this);
        x6y2.addActionListener(this);
        x7y2.addActionListener(this);
        this.add(x1y1);this.add(x2y1);this.add(x3y1);this.add(x4y1);this.add(x5y1);this.add(x6y1);this.add(x7y1);this.add(x1y2);this.add(x2y2);this.add(x3y2);this.add(x4y2);this.add(x5y2);this.add(x6y2);this.add(x7y2);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==x1y1){
            //测试：System.out.println("点击的按钮是x1y1,anzt="+panding.anzt);
            if(panding.anzt==1){
                panding.ad= d[0][0];
                panding.ax=1;
                panding.ay=1;
                //测试： System.out.println("监听器实现anzt=1");
            }else if (panding.anzt==2){
                panding.bd= d[0][0];
                panding.bx=1;
                panding.by=1;
                //测试：System.out.println("监听器实现anzt=2");
            }
            panding.anzt++;
            panding.pd();
        }
        if (e.getSource()==x2y1){

                if(panding.anzt==1){
                    panding.ad= d[0][1];
                    panding.ax=2;
                    panding.ay=1;
                }else if (panding.anzt==2){
                    panding.bd= d[0][1];
                    panding.bx=2;
                    panding.by=1;
                }
                panding.anzt++;
                panding.pd();
        }
        if (e.getSource()==x3y1){
                    if(panding.anzt==1){
                        panding.ad= d[0][2];
                        panding.ax=3;
                        panding.ay=1;
                    }else if (panding.anzt==2){
                        panding.bd= d[0][2];
                        panding.bx=3;
                        panding.by=1;
                    }
                    panding.anzt++;
                    panding.pd();
        }
        if (e.getSource()==x4y1){
                    if(panding.anzt==1){
                        panding.ad= d[0][3];
                        panding.ax=4;
                        panding.ay=1;
                    }else if (panding.anzt==2){
                        panding.bd= d[0][3];
                        panding.bx=4;
                        panding.by=1;
                    }
                    panding.anzt++;
                    panding.pd();
        }
        if (e.getSource()==x5y1){
                    if(panding.anzt==1){
                        panding.ad= d[0][4];
                        panding.ax=5;
                        panding.ay=1;
                    }else if (panding.anzt==2){
                        panding.bd= d[0][4];
                        panding.bx=5;
                        panding.by=1;
                    }
                    panding.anzt++;
                    panding.pd();
        }
        if (e.getSource()==x6y1){
                    if(panding.anzt==1){
                        panding.ad= d[0][5];
                        panding.ax=6;
                        panding.ay=1;
                    }else if (panding.anzt==2){
                        panding.bd= d[0][5];
                        panding.bx=6;

                        panding.by=1;
                    }
                    panding.anzt++;
                    panding.pd();
        }
        if (e.getSource()==x7y1){
                    if(panding.anzt==1){
                        panding.ad= d[0][6];
                        panding.ax=7;
                        panding.ay=1;
                    }else if (panding.anzt==2){
                        panding.bd= d[0][6];
                        panding.bx=7;
                        panding.by=1;
                    }
                    panding.anzt++;
                    panding.pd();
        }

        if (e.getSource()==x1y2){
            if(panding.anzt==1){
                panding.ad= d[1][0];
                panding.ax=1;
                panding.ay=2;
            }else if (panding.anzt==2){
                panding.bd= d[1][0];
                panding.bx=1;
                panding.by=2;
            }
            panding.anzt++;
            panding.pd();
        }
        if (e.getSource()==x2y2){
                    if(panding.anzt==1){
                        panding.ad= d[1][1];
                        panding.ax=2;
                        panding.ay=2;
                    }else if (panding.anzt==2){
                        panding.bd= d[1][1];
                        panding.bx=2;
                        panding.by=2;
                    }
                    panding.anzt++;
                    panding.pd();
        }
        if (e.getSource()==x3y2){
            if(panding.anzt==1){
                panding.ad= d[1][2];
                panding.ax=3;
                panding.ay=2;
            }else if (panding.anzt==2){
                panding.bd= d[1][2];
                panding.bx=3;
                panding.by=2;
            }
            panding.anzt++;
            panding.pd();
        }
        if (e.getSource()==x4y2){
            if(panding.anzt==1){
                panding.ad= d[1][3];
                panding.ax=4;
                panding.ay=2;
            }else if (panding.anzt==2){
                panding.bd= d[1][3];
                panding.bx=4;
                panding.by=2;
            }
            panding.anzt++;
            panding.pd();
        }
        if (e.getSource()==x5y2){
            if(panding.anzt==1){
                panding.ad= d[1][4];
                panding.ax=5;
                panding.ay=2;
            }else if (panding.anzt==2){
                panding.bd= d[1][4];
                panding.bx=5;
                panding.by=2;
            }
            panding.anzt++;
            panding.pd();
        }
        if (e.getSource()==x6y2){
            if(panding.anzt==1){
                panding.ad= d[1][5];
                panding.ax=6;
                panding.ay=2;
            }else if (panding.anzt==2){
                panding.bd= d[1][5];
                panding.bx=6;
                panding.by=2;
            }
            panding.anzt++;
            panding.pd();
        }
        if (e.getSource()==x7y2){
            if(panding.anzt==1){
                panding.ad= d[1][6];
                panding.ax=7;
                panding.ay=2;
            }else if (panding.anzt==2){
                panding.bd= d[1][6];
                panding.bx=7;
                panding.by=2;
            }
            panding.anzt++;
            panding.pd();
        }

    }
}