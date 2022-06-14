package zhandou;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static denglu.playgame.ys;

public class sibai implements ActionListener {
    JDialog sb=new JDialog(ys,"游戏失败",true);
    JPanel sbjp = new JPanel();
    JLabel sb1 = new JLabel("游戏失败，很遗憾");
    JButton sb2 = new JButton("江湖告辞");
    sibai() {
        sb.setBounds(600, 350, 200, 200);

        sb.setLayout(null);
        sbjp.setLayout(null);
        sbjp.setBounds(0, 0, 200, 200);
        sb1.setBounds(30,0,200,100);
        sb2.setBounds(50, 100, 100, 50);

        sb2.addActionListener(this);

        sb.add(sbjp);
        sbjp.add(sb1);
        sbjp.add(sb2);
        sb.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==sb2){
            System.exit(0);
        }
    }
}
