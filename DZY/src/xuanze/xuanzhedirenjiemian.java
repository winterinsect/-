package xuanze;

import zhandou.zdjmcusihua;
import zhandou.zhandoujiemian;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static com.sun.deploy.uitoolkit.ToolkitStore.dispose;
import static denglu.playgame.ys;

public class xuanzhedirenjiemian extends JPanel implements ActionListener {
    JLabel lhdr1 = new JLabel();//立绘
    JLabel lhdr2 = new JLabel();
    JLabel lhdr3 = new JLabel();
    JRadioButton dr1=new JRadioButton("风魔龙");
    JRadioButton dr2=new JRadioButton("公子");
    JRadioButton dr3=new JRadioButton("女士");
    ButtonGroup buttonGroup=new ButtonGroup();
    public static byte drxh;
    JButton xyb=new JButton("下一步");
    private Image image =new ImageIcon("E:\\DZY\\src\\tp\\绝云间.jpg").getImage();
   xuanzhedirenjiemian(){
       setBounds(50, 30, 1400, 900);
       setLayout(null);
       lhdr1.setIcon(new ImageIcon("E:\\DZY\\src\\tp\\风魔龙.jpg"));
       lhdr1.setBounds(10,180,300,400);
       lhdr2.setIcon(new ImageIcon("E:\\DZY\\src\\tp\\公子.jpg"));
       lhdr2.setBounds(330,180,300,400);
       lhdr3.setIcon(new ImageIcon("E:\\DZY\\src\\tp\\女士.jpg"));
       lhdr3.setBounds(650,180,300,400);

       dr1.setBounds(140,600,100,50);
       dr2.setBounds(460,600,100,50);
       dr3.setBounds(780,600,100,50);
       xyb.setBounds(1200,0,120,80);

        buttonGroup.add(dr1);
        buttonGroup.add(dr2);
        buttonGroup.add(dr3);

        dr1.addActionListener(this);
        dr2.addActionListener(this);
        dr3.addActionListener(this);
        xyb.addActionListener(this);
       add(lhdr1);
       add(lhdr2);
       add(lhdr3);
       add(dr1);
       add(dr2);
       add(dr3);
       add(xyb);
   }
    protected void paintComponent(Graphics g) {
        g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
if (e.getSource()==dr1){
    drxh=1;
    System.out.println(drxh);
}else if (e.getSource()==dr2){
    drxh=2;
    System.out.println(drxh);
}else if (e.getSource()==dr3){
    drxh=3;
    System.out.println(drxh);
}
if (e.getSource()==xyb){

    setVisible(false);// 本窗口隐藏,
    ys.add(new zhandoujiemian());// 新窗口显示
    try {
        dispose();//本窗口销毁,释放内存资源
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
    }

}
