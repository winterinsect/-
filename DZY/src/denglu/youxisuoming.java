package denglu;

import javax.swing.*;

import java.awt.*;

import static denglu.playgame.ys;

public class youxisuoming {
    JDialog yxsm=new JDialog(ys,"游戏说明",true);
    JPanel yxsmjp = new JPanel();
    JScrollPane yxsmgdt=new JScrollPane();
    JTextArea yxsmjta=new JTextArea();
    Font f = new Font("宋体",Font.PLAIN,20);
    youxisuoming(){

        yxsm.setBounds(250,300,1000,380);
        yxsmjp.setBounds(0,0,1000,380);
        yxsmjp.setLayout(null);
        //yxsmgdt.setBounds(0,0,400,400);
        //yxsmgdt.setViewportView(yxsmjta);
        yxsmjta.setBounds(0,0,1000,380);
        yxsmjta.setFont(f);
        yxsmjta.append("选择角色面板：先点击下方的角色姓名按钮，再点击右侧角色位置按钮，就可以实现角色的选择。\n" +
                "选择关卡面板：点击下方的选择关卡按钮，实现关卡的选择。\n" +
                "\n" +
                "战斗界面：右下方的按钮是您进行游戏的方式，代号1-3是屏幕中从左到右您所选择的角色代号，\n" +
                "进行不同的点击操作会释放不同的技能。同时您点击的按钮会消失，按钮将从右向左补齐。\n" +
                "您的每次操作会增加游戏回合数，当回合数到达一定程度，敌人会向你攻击，\n" +
                "如果迟迟不能将敌人打败，敌人将会对你发动致命一击。\n" +
                "\n" +
                "一消技能：点击两次同一按钮即可释放技能，伤害较低。\n" +
                "二消技能：当左右或上下按钮代号相同时，便可分别点击这两个按钮释放技能，伤害适中。\n" +
                "四消技能：当4个组成正方型的按钮代号相同时，便可点击正方形对角线上的两个按钮释放技能，伤害较高。\n" +
                "\n" +
                "（提示：努力拼凑出四消技能才是胜利的关键。）\n" +
                "\n");
        yxsm.add(yxsmjp);
        yxsmjp.add(yxsmjta);
        yxsm.setVisible(true);
    }
}
