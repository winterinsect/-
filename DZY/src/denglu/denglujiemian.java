package denglu;

import xuanze.xuanzejiemian;
import xuanze.xzjmcuhua;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static com.sun.deploy.uitoolkit.ToolkitStore.dispose;
import static denglu.playgame.ys;

public class denglujiemian extends JPanel implements ActionListener {
    JButton ksyx=new JButton("开始游戏");
    JButton yxsm=new JButton("游戏说明");
    private Image image =new ImageIcon("E:\\DZY\\src\\tp\\登陆.jpg").getImage();
    public denglujiemian(){
        setBounds(50, 30, 1400, 900);
        setLayout(null);
        ksyx.setBounds(600,600,200,100);
        ksyx.addActionListener(this);
        yxsm.setBounds(1250,750,100,50);
        yxsm.addActionListener(this);
        add(ksyx);add(yxsm);
    }

    // 固定背景图片，允许这个JPanel可以在图片上添加其他组件
    protected void paintComponent(Graphics g) {
        g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==ksyx){
            setVisible(false);// 本窗口隐藏,
            ys.add(new xuanzejiemian());// 新窗口显示
            try {
                dispose();//本窗口销毁,释放内存资源
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        if(e.getSource()==yxsm){
            new youxisuoming();
        }
    }
}
