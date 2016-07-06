package screens;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ImportStudentCourses extends JFrame {
    String[] path;
    public ImportStudentCourses() {
        JPanel p = new JPanel();
        final JFileChooser FileSelection = new JFileChooser();
        JButton Jb1 = new JButton("Browse");
        JButton Jb2 = new JButton("Import");
        final JTextField txt1 = new JTextField("CSV");
        JLabel lb = new JLabel("Import Student Courses");
        JLabel lb1 = new JLabel("CSV");
        setTitle("Import Student Courses");
        setLocation(250, 50);
        setSize(850, 600);
        setVisible(true);
        setResizable(false);
        p.setLayout(null);
        getContentPane().add(p);
        add(p);
        lb.setBounds(320, 5, 250, 30);
        Font f = new Font("SansSherif", Font.BOLD, 20);
        lb.setFont(f);
        lb1.setBounds(100, 80, 50, 20);

        txt1.setBounds(160, 80, 300, 30);
        Jb1.setBounds(500, 85, 90, 25);
        Jb1.setBackground(Color.lightGray);
        Jb2.setBounds(640, 85, 90, 25);
        Jb2.setBackground(Color.lightGray);

        p.add(lb);
        p.add(lb1);
        p.add(txt1);
        p.add(Jb1);
        p.add(Jb2);
        txt1.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) {
                if (txt1.getText().trim().equals("CSV")) {
                    txt1.setText("");
                }
            }

            public void focusLost(FocusEvent e) {
                if (txt1.getText().trim().equals("")) {
                    txt1.setText("CSV");
                }
            }
        });

        Jb1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                FileSelection.showOpenDialog(null);
                File file = FileSelection.getSelectedFile();
                if (!file.getName().endsWith("CSV")) {
                    JOptionPane.showMessageDialog(null, "Please select only .CSV file.", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    txt1.setText(file.getName());
                    JOptionPane.showMessageDialog(null, "The Student Courses file is successfully imported", "Success", JOptionPane.INFORMATION_MESSAGE);
                    
                }

            }

        });
        
        Jb2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                try { 
                    if(txt1.getText().equalsIgnoreCase(" ")){
                        
                    }
                    else{
                    path=txt1.getText().split(".CSV");
                    }         
                    ImportStudentCoursesTable table=new ImportStudentCoursesTable(path);
                } catch (IOException ex) {
                    Logger.getLogger(ImportStudentCourses.class.getName()).log(Level.SEVERE, null, ex);
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
