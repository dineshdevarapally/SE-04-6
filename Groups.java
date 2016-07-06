package screens;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Groups extends JFrame {

    public Groups() {
        JPanel p = new JPanel();
        JButton Jb1 = new JButton("Add");
        JButton Jb2 = new JButton("Update");
        JButton Jb3 = new JButton("Delete");
        JButton Jb4 = new JButton("Save");
        JLabel lb = new JLabel("Groups List");
        setSize(850, 600);
        setTitle("Test Schedule");
        setLocation(250, 50);
        getContentPane().setBackground(Color.lightGray);
        setVisible(true);
        Font f2 = new Font("SansSherif", Font.BOLD, 18);
        lb.setFont(f2);
        final JTextArea txtarea = new JTextArea("Group 1\nGroup 2\n");
        txtarea.setBounds(300, 130, 220, 220);
        //txtarea.setFont(f2);
        txtarea.setBackground(Color.lightGray);
        txtarea.setEditable(false);
        txtarea.setEditable(false);
        lb.setBounds(350, 10, 200, 40);
        Jb1.setBounds(290, 390, 70, 20);
        Jb2.setBounds(370, 390, 100, 20);
        Jb3.setBounds(480, 390, 70, 20);
        Jb2.setEnabled(true);
        p.setLayout(null);
        getContentPane().add(p);
        //  add(p);
        p.add(txtarea);
        p.add(Jb1);
        p.add(Jb2);
        p.add(Jb3);
        p.add(lb);
        final String[] lines = txtarea.getText().split("\n");
        Jb1.addActionListener(new ActionListener() {
            String msg = "Enter the Group that you want to add";

            public void actionPerformed(ActionEvent ae) {
                String AddData = JOptionPane.showInputDialog(null, msg);

                if (AddData.equalsIgnoreCase(lines[0]) || AddData.equalsIgnoreCase(lines[1])) {
                    JOptionPane.showMessageDialog(null, "The Entered Group already exists", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    txtarea.append(AddData + "\n");
                }
            }

        });
        Jb2.addActionListener(new ActionListener() {
            String msg2 = "Enter the Group Name that you want to Update";
            String msg3 = "Enter to update with!!";

            public void actionPerformed(ActionEvent ae) {
                String update = JOptionPane.showInputDialog(null, msg2);
                String ReplaceBy = JOptionPane.showInputDialog(null, msg3);
               // int start=txtarea2.getText().indexOf(update);

                if (update.equalsIgnoreCase(lines[0]) || update.equalsIgnoreCase(lines[1])) {
                    int start = txtarea.getText().indexOf(update);
                    if (start >= 0 && update.length() > 0) {
                        txtarea.replaceRange(ReplaceBy, start, start
                                + update.length());

                    }

                    JOptionPane.showMessageDialog(null, "The Group has been Updated", "Success", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "The Entered Group Name doesn't exists", "Error", JOptionPane.ERROR_MESSAGE);
                    // txtarea2.append(AddData+"\n");
                }
            }
        });

        Jb3.addActionListener(new ActionListener() {
            String msg = "Enter the Group Name that you want to Delete";

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
