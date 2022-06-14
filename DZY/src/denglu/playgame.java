package denglu;

import javax.swing.*;

public class playgame {
    public static JFrame ys = new JFrame("原神");
    playgame(){
        ys.setBounds(50, 30, 1400, 900);
        ys.add(new denglujiemian());
        ys.setVisible(true);
        ys.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new playgame();
    }

}
