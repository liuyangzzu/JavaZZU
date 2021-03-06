package ch08;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIDemo {
    private JButton btn_login;
    private JPanel panel1;
    private JButton btn_cancel;
    private JTextField username;
    private JTextField password;

    public GUIDemo() {
        btn_login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("登录用户名:" + username.getText());
                if (username.getText().equals("zzu"))
                    JOptionPane.showMessageDialog(null, "登陆成功。 Hello " + username.getText(), "Hello world", JOptionPane.INFORMATION_MESSAGE);
                else
                    JOptionPane.showMessageDialog(null, "登陆失败!", "Alert", JOptionPane.ERROR_MESSAGE);
            }
        });
        btn_cancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                username.setText("");
                password.setText("");
            }
        });

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("GUI FirstGUIDemo");
        frame.setContentPane(new GUIDemo().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocation(400, 300);
        frame.setVisible(true);
    }

}
