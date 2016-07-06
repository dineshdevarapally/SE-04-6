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
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TestScheduleScreen extends JFrame {

    public TestScheduleScreen() {
        JPanel p = new JPanel();
        JButton Jb1 = new JButton("Test");
        JTextArea Jtxt = new JTextArea();
        JComboBox txt1 = new JComboBox();
        JLabel lb = new JLabel("Schedule Test");
        JLabel lb1 = new JLabel("Semester number");
        setTitle("Schedule Test");
        setLocation(250, 50);
        setSize(850, 600);
        setVisible(true);
        setResizable(false);
        p.setLayout(null);
        getContentPane().add(p);
        add(p);
        lb.setBounds(350, 5, 200, 30);
        Font f = new Font("SansSherif", Font.BOLD, 20);
        lb.setFont(f);
        lb1.setBounds(300, 50, 130, 20);

        txt1.setBounds(440, 50, 130, 20);
        Jtxt.setBounds(20, 120, 810, 400);
        Jb1.setBounds(370, 90, 100, 20);
        Jb1.setBackground(Color.lightGray);

        p.add(lb);
        p.add(lb1);
        p.add(txt1);
        p.add(Jtxt);
        p.add(Jb1);
        Jtxt.setBackground(Color.GRAY);
        Jtxt.setEditable(false);
        Jb1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                TestSchedule txt = new TestSchedule();
            }

        });
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }
}
