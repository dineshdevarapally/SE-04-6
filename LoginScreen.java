package screens;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

public class LoginScreen extends JFrame {

    public LoginScreen() {
        JButton Jb = new JButton("Login");
        JButton Jb2 = new JButton("Signup");
        JPanel p1 = new JPanel();
        JLabel lb = new JLabel(" username");
        JLabel lb2 = new JLabel("password");
        JLabel lb3 = new JLabel();
        final JTextField txt = new JTextField("username");
        final JPasswordField txt2 = new JPasswordField(10);
        setSize(850, 600);
        setTitle("LoginUser");
        setLocation(250, 50);
        setResizable(false);
        setVisible(true);
        p1.setLayout(null);
        txt.setBounds(380, 200, 200, 30);
        txt.setVisible(true);
        txt2.setBounds(380, 250, 200, 30);
        txt2.setVisible(true);
        lb.setBounds(280, 160, 100, 100);
        lb.setVisible(true);
        lb2.setBounds(280, 210, 100, 100);
        lb2.setVisible(true);
        lb3.setBounds(450, 150, 130, 50);
        lb3.setVisible(true);
        lb3.setText("LOGIN");
        Font f = new Font("SansSherif", Font.BOLD, 20);
        lb3.setFont(f);
        lb3.setBackground(Color.lightGray);
        Jb.setBounds(440, 300, 70, 30);
        Jb.setVisible(true);
        Jb.setBackground(Color.gray);
       // Jb2.setBounds(500, 300, 80, 30);
        //Jb2.setVisible(true);
       // Jb2.setBackground(Color.gray);
        p1.add(lb3);
        p1.add(lb);
        p1.add(txt);
        p1.add(lb2);
        p1.add(txt2);
        p1.add(Jb);
       // p1.add(Jb2);
        getContentPane().add(p1);
        Jb2.setVisible(false);
        Jb2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                SignupScreen sgnUp = new SignupScreen();
            }
        });

        txt.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) {
                if (txt.getText().trim().equals("username")) {
                    txt.setText("");
                }
            }

            public void focusLost(FocusEvent e) {
                if (txt.getText().trim().equals("")) {
                    txt.setText("username");
                }
            }
        });
        Jb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (!txt.getText().trim().equals("") && !txt.getText().trim().equals("username")
                        && !txt2.getText().trim().equals("")) {
                    if (txt.getText().equalsIgnoreCase("admin")) {
                        JOptionPane.showMessageDialog(null, "Successfully LoggedIn", "Success", JOptionPane.INFORMATION_MESSAGE);
                        setVisible(false);
                        dispose();
                        AdminMenuScreen menu = new AdminMenuScreen();
                    } else if(txt.getText().equalsIgnoreCase("director")){
                        JOptionPane.showMessageDialog(null, "Successfully LoggedIn", "Success", JOptionPane.INFORMATION_MESSAGE);
                        setVisible(false);
                        dispose();
                        MenuScreen menu = new MenuScreen();
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Wrong Username or Password", "Eroor", JOptionPane.ERROR_MESSAGE);
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Fill all the TextFields", "Error", JOptionPane.ERROR_MESSAGE);
                }

            }

        });

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }

}
