import com.sun.glass.ui.Screen;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * 简单图形界面
 */
public class SimpleFrameTest {
    public static void main(String[] args){
        EventQueue.invokeLater(()->{
            ButtonFrame frame = new ButtonFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
