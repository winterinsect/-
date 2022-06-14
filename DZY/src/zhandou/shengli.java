package zhandou;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static denglu.playgame.ys;

public class shengli implements ActionListener {
    JDialog sl=new JDialog(ys,"游戏胜利",true);
    JPanel sljp = new JPanel();
    JLabel sl1 = new JLabel("游戏胜利，恭喜您");
    JButton sl2 = new JButton("恭喜胜利");
    shengli() {
        sl.setBounds(600, 350, 200, 200);

        sl.setLayout(null);
        sljp.setLayout(null);
        sljp.setBounds(0, 0, 200, 200);
        sl1.setBounds(30,0,200,100);
        sl2.setBounds(50, 100, 100, 50);

    sl2.addActionListener(this);

        sl.add(sljp);
        sljp.add(sl1);
        sljp.add(sl2);
        sl.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    if (e.getSource()==sl2){
        System.exit(0);
    }
    }
}
