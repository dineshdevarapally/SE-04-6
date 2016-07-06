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

public class universityeditScreen extends JFrame {

    String AddData;
    String AddData1;
    String AddData2;
    String AddData3;

    public universityeditScreen() {
        JPanel p = new JPanel();
        JLabel lb = new JLabel("University Edit");
        JLabel lb2 = new JLabel("Name");
        JLabel lb3 = new JLabel("Registration");
        JLabel lb4 = new JLabel("CoursesOffered");
        JLabel lb5 = new JLabel("Graduate Schools");
        JButton b1 = new JButton("Add");
        JButton b2 = new JButton("Update");
        JButton b3 = new JButton("Delete");
        JButton b4 = new JButton("Add");
        JButton b5 = new JButton("Update");
        JButton b6 = new JButton("Delete");
        JButton b7 = new JButton("Save");
        JButton b8 = new JButton("Cancel");
        final JTextField txt = new JTextField("Name");
        JTextField txt2 = new JTextField("Open");
        final JTextArea txtarea = new JTextArea(
"2012SP\n2012SU\n2012FA\n2013SP\n2013SU\n2013FA\n2014SP\n2014SU\n2014FA\n2015SP\n");
        final JTextArea txtarea2 = new JTextArea("GSECS\n");
     //   JScrollPane scrollone=new JScrollPane(txtarea);
      //  scrollone.setVisible(true);
        setSize(850, 600);
        txt2.setEditable(false);
        txtarea2.setWrapStyleWord(true);

        setTitle("University Edit Screen");
        setLocation(250, 50);
        setVisible(true);
        setResizable(false);
        p.setLayout(null);
        lb.setBounds(350, 10, 200, 40);
        Font f = new Font("SansSherif", Font.BOLD, 20);
        Font f2 = new Font("SansSherif", Font.LAYOUT_LEFT_TO_RIGHT, 14);
        lb.setFont(f);
        lb2.setBounds(220, 70, 100, 40);
        lb3.setBounds(220, 110, 100, 40);
        lb4.setBounds(510, 130, 140, 80);
        lb5.setBounds(290, 130, 140, 80);
        lb4.setVisible(true);
        txt.setBounds(320, 80, 350, 30);
        txt2.setBounds(320, 120, 250, 30);
        txtarea.setBounds(480, 190, 200, 200);
        txtarea.setFont(f2);
        txtarea.setEditable(false);
        txtarea.setVisible(true);
        txtarea2.setBounds(230, 190, 200, 200);
        txtarea2.setFont(f2);
        txtarea2.setEditable(false);
        b1.setBounds(190, 410, 70, 20);
        b2.setBounds(270, 410, 100, 20);
        b3.setBounds(380, 410, 70, 20);
        b2.setEnabled(true);
        b4.setBounds(470, 410, 70, 20);
        b5.setBounds(550, 410, 100, 20);
        b4.setEnabled(true);
        b6.setBounds(660, 410, 70, 20);
        b7.setBounds(340, 470, 100, 30);
        b8.setBounds(460, 470, 100, 30);
        b7.setBackground(Color.lightGray);
        b8.setBackground(Color.lightGray);
        p.add(lb);
        p.add(lb2);
        p.add(txt);
        p.add(lb3);
        p.add(txt2);
        p.add(txtarea2);
        p.add(txtarea);
        p.add(lb4);
        
     //   getContentPane().add(scrollone);
       // p.add(scrollone);
        p.add(lb5);
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);
        p.add(b5);
        p.add(b6);
        p.add(b7);
        p.add(b8);
        getContentPane().add(p);
        txt.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) {
                if (txt.getText().trim().equals("Name")) {
                    txt.setText("");
                }
            }

            public void focusLost(FocusEvent e) {
                if (txt.getText().trim().equals("")) {
                    txt.setText("Name");
                }
            }
        });

        b7.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                JOptionPane.showMessageDialog(null, "Saved Successfully", "Saved", JOptionPane.INFORMATION_MESSAGE);
                setVisible(false);
                dispose();
                MenuScreen menuscreen = new MenuScreen();
            }

        });

        b8.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                setVisible(false);
                dispose();
                MenuScreen menuscreen = new MenuScreen();
            }
        });
        final String[] lines = txtarea2.getText().split("\n");
        b1.addActionListener(new ActionListener() {
            String msg = "Enter the Grad School that you want to add";

            public void actionPerformed(ActionEvent ae) {
                AddData = JOptionPane.showInputDialog(null, msg);

                if (AddData.equalsIgnoreCase(lines[0])) {
                    JOptionPane.showMessageDialog(null, "The Entered School already exists", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    txtarea2.append(AddData + "\n");
                }
            }

        });
        b2.addActionListener(new ActionListener() {
            String msg2 = "Enter the Graduate School that you want to Update";
            String msg3 = "Enter to update with!!";

            public void actionPerformed(ActionEvent ae) {
                String update = JOptionPane.showInputDialog(null, msg2);
                String ReplaceBy = JOptionPane.showInputDialog(null, msg3);
               // int start=txtarea2.getText().indexOf(update);

                if (update.equalsIgnoreCase(lines[0])) {
                    int start = txtarea2.getText().indexOf(update);
                    if (start >= 0 && update.length() > 0) {
                        txtarea2.replaceRange(ReplaceBy, start, start
                                + update.length());

                    }

                    JOptionPane.showMessageDialog(null, "The Graduate School has been Updated", "Success", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "The Entered Graduate School doesn't exists", "Error", JOptionPane.ERROR_MESSAGE);
                    // txtarea2.append(AddData+"\n");
                }
            }
        });

        b3.addActionListener(new ActionListener() {
            String msg = "Enter the Semester that you want to Delete";

            public void actionPerformed(ActionEvent ae) {
                txtarea2.setText(" ");
                JOptionPane.showMessageDialog(null, "Successfully Deleted", "Success", JOptionPane.INFORMATION_MESSAGE);

            }

        });
        final String[] lines2 = txtarea.getText().split("\n");
        b4.addActionListener(new ActionListener() {
            String Semester = "Enter a Semeseter to Add!!";

            public void actionPerformed(ActionEvent ae) {
                AddData1 = JOptionPane.showInputDialog(null, Semester);
                if (AddData1.equalsIgnoreCase(lines2[0]) || AddData1.equalsIgnoreCase(lines2[1]) || AddData1.equalsIgnoreCase(lines2[2])
                || AddData1.equalsIgnoreCase(lines2[3])   || AddData1.equalsIgnoreCase(lines2[4]) || AddData1.equalsIgnoreCase(lines2[5])
                        || AddData1.equalsIgnoreCase(lines2[6])
                        || AddData1.equalsIgnoreCase(lines2[7])
                        || AddData1.equalsIgnoreCase(lines2[8]) || AddData1.equalsIgnoreCase(lines2[9]))
                     {
                    JOptionPane.showMessageDialog(null, "The Entered Semester already exists", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    txtarea.append(AddData1 + "\n");
                }
            }

        });
        b5.addActionListener(new ActionListener() {
            String msg4 = "Enter the Semester Number that you want to Update";
            String msg5 = "Enter to update with!!";

            public void actionPerformed(ActionEvent ae) {
                String updateSem = JOptionPane.showInputDialog(null, msg4);
                String ReplaceBySem = JOptionPane.showInputDialog(null, msg5);
                // int start=txtarea2.getText().indexOf(update);
                if (updateSem.equalsIgnoreCase(lines2[0]) || updateSem.equalsIgnoreCase(lines2[1]) || updateSem.equalsIgnoreCase(lines2[2])
                        || updateSem.equalsIgnoreCase(lines2[3])
                        || updateSem.equalsIgnoreCase(lines2[4])|| updateSem.equalsIgnoreCase(lines2[5])
                        || updateSem.equalsIgnoreCase(lines2[6])
                        || updateSem.equalsIgnoreCase(lines2[7])
                        || updateSem.equalsIgnoreCase(lines2[8])
                        || updateSem.equalsIgnoreCase(lines2[9])) {
                    int start = txtarea.getText().indexOf(updateSem);
                    if (start >= 0 && updateSem.length() > 0) {
                        txtarea.replaceRange(ReplaceBySem, start, start
                                + updateSem.length());

                    }
                    JOptionPane.showMessageDialog(null, "The Semester's List has been Updated", "Success", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "The Entered Semester Number doesn't exists", "Error", JOptionPane.ERROR_MESSAGE);
                    // txtarea2.append(AddData+"\n");
                }
            }
        });
        b6.addActionListener(new ActionListener() {
            String msg = "Enter the Semester that you want to Delete";

            public void actionPerformed(ActionEvent ae) {
                txtarea.setText(" ");
                JOptionPane.showMessageDialog(null, "Successfully Deleted", "Success", JOptionPane.INFORMATION_MESSAGE);

            }

        });

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }
}
