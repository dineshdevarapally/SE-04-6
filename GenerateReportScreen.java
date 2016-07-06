package screens;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class GenerateReportScreen extends JFrame {

    public GenerateReportScreen() {
        JPanel p = new JPanel();
        JButton Jb1 = new JButton("Generate");
        JButton Jb2 = new JButton("Print");
        JTextArea Jtxt = new JTextArea();
        JComboBox txt1 = new JComboBox();
        JComboBox txt2 = new JComboBox();
        JLabel lb = new JLabel("Student Report");
        JLabel lb1 = new JLabel("Select Main Report");
        JLabel lb2 = new JLabel("Select Sub Report Type");
        setTitle("Student Report");
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
        lb1.setBounds(60, 55, 150, 20);

        txt1.setBounds(220, 50, 130, 30);
        lb2.setBounds(370, 55, 150, 30);
        txt2.setBounds(530, 50, 130, 30);
        Jtxt.setBounds(20, 100, 810, 400);
        Jb1.setBounds(690, 55, 100, 20);
        Jb1.setBackground(Color.lightGray);
        Jb2.setBounds(390, 520, 80, 30);
        Jb2.setBackground(Color.lightGray);

        p.add(lb);
        p.add(lb1);
        p.add(txt1);
        p.add(txt2);
        p.add(lb2);
        p.add(Jtxt);
        p.add(Jb1);
        p.add(Jb2);
        Jtxt.setBackground(Color.GRAY);
        Jtxt.setEditable(false);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        
        Jb2.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent ae) {
                   JOptionPane.showMessageDialog(null, "Printed Successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
            }
            
            
        });

    }
}
