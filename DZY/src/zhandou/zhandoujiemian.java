package zhandou;


import denglu.denglujiemian;
import denglu.playgame;
import xuanze.jsshengcheng;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static com.sun.deploy.uitoolkit.ToolkitStore.dispose;
import static denglu.playgame.ys;
import static xuanze.jsshengcheng.*;


public class zhandoujiemian extends JPanel implements ActionListener {
    JButton shezi=new JButton("返回");//退出按钮
    public static JLabel time=new JLabel("  time:"+panding.time);//时间
    xuetiao xt1=new xuetiao();//血条1
    JScrollPane zdjlgdt=new JScrollPane();//战斗记录滚动条
    public static JTextArea zhandoujilu=new JTextArea();//战斗记录
    shengchenganniu scan=new shengchenganniu();//生成按钮
    public static JButton js1=new JButton();
    public static JButton js2=new JButton();
    public static JButton js3=new JButton();
    public static JButton dr=new JButton();

    public static JLabel lh1 = new JLabel();
    public static JLabel lh2 = new JLabel();
    public static JLabel lh3 = new JLabel();
    public static JLabel drlh = new JLabel();

    public static JLabel js1xl = new JLabel();
    public static JLabel js2xl = new JLabel();
    public static JLabel js3xl = new JLabel();
    public static JLabel drxl = new JLabel();
    public static int jsxl1max;
    public static int jsxl2max;
    public static int jsxl3max;
    public static int drxlmax;

    private final Image image =new ImageIcon("E:\\DZY\\src\\tp\\蛇神之首.jpg").getImage();
    Font f = new Font("宋体",Font.PLAIN,20);


    public zhandoujiemian() {

        setBounds(50, 30, 1400, 900);
        setLayout(null);


        shezi.setBounds(0,0,60,50);
        shezi.addActionListener(this);

        time.setBounds(80,0,50,50);
        time.setOpaque(true);
        time.setBackground(Color.white);

        zdjlgdt.setBounds(0,700,300,150);
        zdjlgdt.setViewportView(zhandoujilu);
       // zhandoujilu.setBounds(0,700,300,200);-将战斗记录面板放进滚动条中，setViewportView()就不用设置bound了
        scan.setBounds(800,700,560,160);

        //xt1.setBounds(0,100,50,30);


        js1.setBounds(50,600,100,50);
        js2.setBounds(270,600,100,50);
        js3.setBounds(490,600,100,50);
        dr.setBounds(1100,600,100,50);
        lh1.setBounds(10,180,200,400);
        lh2.setBounds(230,180,200,400);
        lh3.setBounds(450,180,200,400);
        drlh.setBounds(1000,180,300,400);

       js1xl.setBounds(60,120,200,50);
       js2xl.setBounds(290,120,200,50);
       js3xl.setBounds(500,120,200,50);
       drxl.setBounds(1100,120,200,50);


        jssc();
             jsxl1max=jsshengcheng.jsxl1;
             jsxl2max=jsshengcheng.jsxl2;
             jsxl3max=jsshengcheng.jsxl3;
             drxlmax=jsshengcheng.drxl;

        js1xl.setText(jsshengcheng.jsxl1+"/"+jsxl1max);
        js2xl.setText(jsshengcheng.jsxl2+"/"+jsxl2max);
        js3xl.setText(jsshengcheng.jsxl3+"/"+jsxl3max);
        drxl.setText(jsshengcheng.drxl+"/"+drxlmax);

        /*js1xl.setOpaque(true);
        js1xl.setBackground(Color.white);
        js2xl.setOpaque(true);
        js2xl.setBackground(Color.white);
        js3xl.setOpaque(true);
        js3xl.setBackground(Color.white);
        drxl.setOpaque(true);
        drxl.setBackground(Color.white);*/

        js1xl.setFont(f);
        js1xl.setForeground(Color.red);
        js2xl.setFont(f);
        js2xl.setForeground(Color.red);
        js3xl.setFont(f);
        js3xl.setForeground(Color.red);
        drxl.setFont(f);
        drxl.setForeground(Color.red);

        add(shezi);add(time);
        add(xt1);
        add(js1xl);add(js2xl);add(js3xl);add(drxl);
        add(lh1);add(lh2);add(lh3);add(drlh);
        add(js1);add(js2);add(js3);add(dr);
        add(zdjlgdt);
        add(scan);


    }
    protected void paintComponent(Graphics g) {
        g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);
    }

    public void actionPerformed(ActionEvent e) {
 if(e.getSource()==shezi){
     setVisible(false);// 本窗口隐藏,
     ys.add(new denglujiemian());// 新窗口显示
     try {
         dispose();//本窗口销毁,释放内存资源
     } catch (Exception ex) {
         ex.printStackTrace();
     }
 }
    }

}
