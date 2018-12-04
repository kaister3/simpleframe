import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ButtonFrame extends JFrame {
    private JPanel buttonPanel;//属性：按钮面板
    private static final int DEFAULT_WIDTH = 300;//长宽
    private static final int DEFAULT_HEIGHT = 200;

    public ButtonFrame() {//构造方法
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        JButton yellowButton = new JButton("Yellow");//声明三个按钮
        JButton blueButton = new JButton("Blue");
        JButton redButton = new JButton("Red");

        buttonPanel = new JPanel();

        buttonPanel.add(yellowButton);//加按钮
        buttonPanel.add(blueButton);
        buttonPanel.add(redButton);

        add(buttonPanel);//加面板

        ColorAction yellowAction = new ColorAction(Color.yellow);//三个事件监听的实例
        ColorAction blueAction = new ColorAction(Color.blue);
        ColorAction redAction = new ColorAction(Color.red);

        yellowButton.addActionListener(yellowAction);//添加事件监听器
        blueButton.addActionListener(blueAction);
        redButton.addActionListener(redAction);
    }

    private class ColorAction implements ActionListener {//是一个事件监听器的实现
        private Color backgroundColor;

        public ColorAction(Color c) {
            backgroundColor = c;
        }

        public void actionPerformed(ActionEvent event) {
            buttonPanel.setBackground(backgroundColor);
        }
    }
}

