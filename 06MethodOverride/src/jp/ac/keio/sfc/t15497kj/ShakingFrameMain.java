package jp.ac.keio.sfc.t15497kj;

import javax.swing.*;
import java.awt.*;

public class ShakingFrameMain {
    public static void main(String[] args) {
        ShakingFrame frame = new ShakingFrame();
        frame.setPreferredSize(new Dimension(300, 300));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        frame.shake();
    }
}