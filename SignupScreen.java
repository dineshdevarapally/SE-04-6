package screens;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class SignupScreen extends JFrame {
    
    public SignupScreen() {
        JPanel p1 = new JPanel();
        JButton Jb = new JButton("SignUp");
        JLabel lb = new JLabel("SIGNUP");
        JLabel lb1 = new JLabel("Full Name");
        JLabel lb2 = new JLabel("Reg Number");
        JLabel lb3 = new JLabel("Course");
        JLabel lb4 = new JLabel("University");
        JLabel lb5 = new JLabel("Email ID");
        JLabel lb6 = new JLabel("Password");
        JLabel lb7 = new JLabel("Confirm Password");
        final JTextField txt1 = new JTextField("Full Name");
        final JTextField txt2 = new JTextField("Reg Number");
        final JTextField txt3 = new JTextField("Course");
        final JTextField txt4 = new JTextField("University");
        final JTextField txt5 = new JTextField("Email ID");
        final JPasswordField txt6 = new JPasswordField();
        final JPasswordField txt7 = new JPasswordField();
        setTitle("SignUp Screen");
        setLocation(250, 50);
        setSize(850, 600);
        setVisible(true);
        setResizable(false);
        p1.setLayout(null);
        lb.setBounds(410, 20, 130, 50);
        Font f = new Font("SansSherif", Font.BOLD, 20);
        lb.setFont(f);
        lb1.setBounds(230, 75, 130, 50);
        txt1.setBounds(350, 80, 200, 30);
        txt2.setBounds(350, 130, 200, 30);
        txt3.setBounds(350, 180, 200, 30);
        txt4.setBounds(350, 230, 200, 30);
        txt5.setBounds(350, 280, 200, 30);
        txt6.setBounds(350, 330, 200, 30);
        txt7.setBounds(350, 380, 200, 30);
        lb2.setBounds(230, 120, 130, 50);
        lb3.setBounds(230, 170, 130, 50);
        lb4.setBounds(230, 220, 130, 50);
        lb5.setBounds(230, 270, 130, 50);
        lb6.setBounds(230, 320, 130, 50);
        lb7.setBounds(230, 370, 130, 50);
        Jb.setBounds(410, 430, 80, 30);
        Jb.setVisible(true);
        Jb.setBackground(Color.gray);
        getContentPane().add(p1);
        txt1.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) {
                if (txt1.getText().trim().equals("Full Name")) {
                    txt1.setText("");
                }
            }
            
            public void focusLost(FocusEvent e) {
                if (txt1.getText().trim().equals("")) {
                    txt1.setText("Full Name");
                }
            }
        });
        txt2.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) {
                if (txt2.getText().trim().equals("Reg Number")) {
                    txt2.setText("");
                }
            }
            
            public void focusLost(FocusEvent e) {
                if (txt2.getText().trim().equals("")) {
                    txt2.setText("Reg Number");
                }
            }
        });
        txt3.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) {
                if (txt3.getText().trim().equals("Course")) {
                    txt3.setText("");
                }
            }
            
            public void focusLost(FocusEvent e) {
                if (txt3.getText().trim().equals("")) {
                    txt3.setText("Course");
                }
            }
        });
        txt4.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) {
                if (txt4.getText().trim().equals("University")) {
                    txt4.setText("");
                }
            }
            
            public void focusLost(FocusEvent e) {
                if (txt4.getText().trim().equals("")) {
                    txt4.setText("University Name");
                }
                
            }
        });
        txt5.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) {
                if (txt5.getText().trim().equals("Email ID")) {
                    txt5.setText("");
                }
                
            }
            
            public void focusLost(FocusEvent e) {
                if (txt5.getText().trim().equals("")) {
                    txt5.setText("Email ID");
                }
                
            }
        });
        
        p1.add(lb);
        p1.add(lb1);
        p1.add(txt1);
        p1.add(txt2);
        p1.add(txt3);
        p1.add(txt4);
        p1.add(txt5);
        p1.add(txt6);
        p1.add(txt7);
        p1.add(lb2);
        p1.add(lb3);
        p1.add(lb4);
        p1.add(lb5);
        p1.add(lb6);
        p1.add(lb7);
        p1.add(Jb);
        
        Jb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (!txt1.getText().trim().equals("") && !txt1.getText().trim().equals("Full Name")
                        && !txt2.getText().trim().equals("") && !txt2.getText().trim().equals("Reg Number")
                        && !txt3.getText().trim().equals("") && !txt3.getText().trim().equals("Course")
                        && !txt4.getText().trim().equals("") && !txt4.getText().trim().equals("University")
                        && !txt5.getText().trim().equals("") && !txt5.getText().trim().equals("Email ID")
                        && !txt6.getText().trim().equals("") && !txt7.getText().trim().equals("")) {
                    JOptionPane.showMessageDialog(null, "Successfully SignedUp!!", "Success", JOptionPane.INFORMATION_MESSAGE);
                    LoginScreen lgscreen = new LoginScreen();
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
