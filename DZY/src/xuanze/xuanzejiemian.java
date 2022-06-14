package xuanze;

import xuanze.js.ab;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static com.sun.deploy.uitoolkit.ToolkitStore.dispose;
import static denglu.playgame.ys;
import static xuanze.jsshengcheng.jssc;
import static xuanze.jsshengcheng.jsxz;

public class xuanzejiemian extends JPanel implements ActionListener {
    JLabel lh1 = new JLabel();//立绘
    JLabel lh2 = new JLabel();
    JLabel lh3 = new JLabel();
    JLabel lh4 = new JLabel();
    JLabel lh5 = new JLabel();
    JButton xyb=new JButton("下一步");
    JButton xz1=new JButton("安柏");
    JButton xz2=new JButton("芭芭拉");
    JButton xz3=new JButton("刻晴");
    JButton xz4=new JButton("神里绫华");
    JButton xz5=new JButton("温迪");
    JButton js1=new JButton("角色1");
    JButton js2=new JButton("角色2");
    JButton js3=new JButton("角色3");
    JLabel  js1ts=new JLabel("角色1：");
    JLabel  js2ts=new JLabel("角色2：");
    JLabel  js3ts=new JLabel("角色3：");
    byte xzxh;//选择序号
    public static byte js1xh;//防止重复,不止了直接用它为角色生成类赋值
    public static byte js2xh;
    public static byte js3xh;
    private Image image =new ImageIcon("E:\\DZY\\src\\tp\\蒙德海滩.jpg").getImage();


    public xuanzejiemian(){
        setBounds(50, 30, 1400, 900);
        setLayout(null);

        lh1.setIcon(new ImageIcon("E:\\DZY\\src\\tp\\安柏.jpg"));
        lh1.setBounds(10,180,200,400);
        lh2.setIcon(new ImageIcon("E:\\DZY\\src\\tp\\芭芭拉.jpg"));
        lh2.setBounds(230,180,200,400);
        lh3.setIcon(new ImageIcon("E:\\DZY\\src\\tp\\刻晴.jpg"));
        lh3.setBounds(450,180,200,400);
        lh4.setIcon(new ImageIcon("E:\\DZY\\src\\tp\\神里绫华.jpg"));
        lh4.setBounds(670,180,200,400);
        lh5.setIcon(new ImageIcon("E:\\DZY\\src\\tp\\温迪.jpg"));
        lh5.setBounds(890,180,200,400);

        xyb.setBounds(1200,0,120,80);
        xz1.setBounds(60,600,100,50);
        xz2.setBounds(280,600,100,50);
        xz3.setBounds(500,600,100,50);
        xz4.setBounds(720,600,100,50);
        xz5.setBounds(940,600,100,50);

        js1.setBounds(1100,200,100,50);
        js2.setBounds(1100,400,100,50);
        js3.setBounds(1100,600,100,50);

        js1ts.setBounds(1100,300,200,50);
        js2ts.setBounds(1100,500,200,50);
        js3ts.setBounds(1100,700,200,50);

        xyb.addActionListener(this);
        xz1.addActionListener(this);
        xz2.addActionListener(this);
        xz3.addActionListener(this);
        xz4.addActionListener(this);
        xz5.addActionListener(this);
        js1.addActionListener(this);
        js2.addActionListener(this);
        js3.addActionListener(this);

        add(xyb);
        add(lh1);
        add(lh2);
        add(lh3);
        add(lh4);
        add(lh5);
        add(xz1);
        add(xz2);
        add(xz3);
        add(xz4);
        add(xz5);
        add(js1);
        add(js2);
        add(js3);
        add(js1ts);
        add(js2ts);
        add(js3ts);

    }
    protected void paintComponent(Graphics g) {
        g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==js1){
                switch (xzxh) {
                    case 1:
                        js1ts.setText("安柏");
                        js1xh = 1;
                        //测试
                        jssc();
                        break;
                    case 2:
                        js1ts.setText("芭芭拉");
                        js1xh = 2;
                        break;
                    case 3:
                        js1ts.setText("刻晴");
                        js1xh = 3;
                        break;
                    case 4:
                        js1ts.setText("神里绫华");
                        js1xh = 4;
                        break;
                    case 5:
                        js1ts.setText("温迪");
                        js1xh = 5;
                        break;
                }
                //赶进度，重复的问题以后再修复
                /*if(js1xh>0&&js2xh>0&&js3xh>0&&(js1xh==js2xh||js2xh==js3xh||js1xh==js3xh)){
                    js1ts.setText("选择角色重复");
                    js1xh=0;
                }*/
                xzxh = 0;

        }
        if (e.getSource()==js2){


                switch (xzxh) {
                    case 1:
                        js2ts.setText("安柏");
                        js2xh = 1;
                        break;
                    case 2:
                        js2ts.setText("芭芭拉");
                        js2xh = 2;
                        break;
                    case 3:
                        js2ts.setText("刻晴");
                        js2xh = 3;
                        break;
                    case 4:
                        js2ts.setText("神里绫华");
                        js2xh = 4;
                        break;
                    case 5:
                        js2ts.setText("温迪");
                        js2xh = 5;
                        break;
                }
                xzxh = 0;
           /* if(js1xh>0&&js2xh>0&&js3xh>0&&(js1xh==js2xh||js2xh==js3xh||js1xh==js3xh)){
                js2ts.setText("选择角色重复");
                js2xh=0;
            }*/
        }
        if (e.getSource()==js3){

                switch (xzxh) {
                    case 1:
                        js3ts.setText("安柏");
                        js3xh = 1;
                        break;
                    case 2:
                        js3ts.setText("芭芭拉");
                        js3xh = 2;
                        break;
                    case 3:
                        js3ts.setText("刻晴");
                        js3xh = 3;
                        break;
                    case 4:
                        js3ts.setText("神里绫华");
                        js3xh = 4;
                        break;
                    case 5:
                        js3ts.setText("温迪");
                        js3xh = 5;
                        break;
                }
                xzxh = 0;
           /* if(js1xh>0&&js2xh>0&&js3xh>0&&(js1xh==js2xh||js2xh==js3xh||js1xh==js3xh)){
                js2ts.setText("选择角色重复");
                js2xh=0;
            }*/
        }
        if (e.getSource()==xz1){
            xzxh=1;
        }
        if (e.getSource()==xz2){
            xzxh=2;
        }
        if (e.getSource()==xz3){
            xzxh=3;
        }
        if (e.getSource()==xz4){
            xzxh=4;
        }
        if (e.getSource()==xz5){
            xzxh=5;
        }
        if (e.getSource()==xyb){
            setVisible(false);// 本窗口隐藏,
            ys.add(new xuanzhedirenjiemian());// 新窗口显示
            try {
                dispose();//本窗口销毁,释放内存资源
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

        }
}
