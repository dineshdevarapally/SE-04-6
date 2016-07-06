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
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ScheduleDisplayScreen extends JFrame {

    public ScheduleDisplayScreen() {
        JPanel p = new JPanel();
        JButton Jb1 = new JButton("Generate");
        JButton Jb2 = new JButton("Print");
        JTextArea Jtxt = new JTextArea();
        JComboBox txt1 = new JComboBox();
        final JTextField txt2 = new JTextField("Section fill %");
        final JTextField txt3 = new JTextField("Section Overage %");
        JLabel lb = new JLabel("Schedule Display");
        JLabel lb1 = new JLabel("Semester Number");
        JLabel lb2 = new JLabel("Section fill %");
        JLabel lb3 = new JLabel("Section Overage %");
        setTitle("Schedule");
        setLocation(250, 50);
        setSize(850, 600);
        setVisible(true);
        setResizable(false);
        p.setLayout(null);
        getContentPane().add(p);
        add(p);
        lb.setBounds(330, 5, 200, 30);
        Font f = new Font("SansSherif", Font.BOLD, 20);
        lb.setFont(f);
        lb1.setBounds(20, 50, 130, 20);

        txt1.setBounds(160, 50, 100, 20);
        lb2.setBounds(290, 50, 100, 20);
        txt2.setBounds(400, 50, 100, 20);
        lb3.setBounds(520, 50, 120, 20);
        txt3.setBounds(660, 50, 120, 20);
        Jtxt.setBounds(20, 120, 810, 400);
        Jb1.setBounds(370, 90, 100, 20);
        Jb1.setBackground(Color.lightGray);
        Jb2.setBounds(370, 530, 100, 25);
        Jb2.setBackground(Color.lightGray);
        p.add(lb);
        p.add(lb1);
        p.add(txt1);
        p.add(lb2);
        p.add(txt2);
        p.add(lb3);
        p.add(txt3);
        p.add(Jtxt);
        p.add(Jb1);
        p.add(Jb2);
        Jtxt.setBackground(Color.GRAY);
        Jtxt.setEditable(false);

        txt2.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) {
                if (txt2.getText().trim().equals("Section fill %")) {
                    txt2.setText("");
                }
            }

            public void focusLost(FocusEvent e) {
                if (txt2.getText().trim().equals("")) {
                    txt2.setText("Section fill %");
                }
            }
        });
        txt3.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) {
                if (txt3.getText().trim().equals("Section Overage %")) {
                    txt3.setText("");
                }
            }

            public void focusLost(FocusEvent e) {
                if (txt3.getText().trim().equals("")) {
                    txt3.setText("Section Overage %");
                }
            }
        });

        Jb1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                ScheduleGenerate sch = new ScheduleGenerate();
            }
        });
        Jb2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                JOptionPane.showMessageDialog(null, "Printed Successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
            }

        });
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }
}
