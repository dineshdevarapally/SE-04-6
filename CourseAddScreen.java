package screens;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

public class CourseAddScreen extends JFrame {

    public CourseAddScreen(final DefaultTableModel TableModel) {
        JPanel p1 = new JPanel();
        DefaultListModel list = new DefaultListModel();
       // DefaultListModel list = new DefaultListModel();
        final List<String> list1 = new ArrayList<String>();
        list.addElement("Computer Science");
        list.addElement("Electrical Engineering");
        list.addElement("Chemical Engineering");
        list.addElement("Software Engineering");
        JButton Jb = new JButton("Confirm");
        JButton Jb2 = new JButton("Cancel");
        JLabel lb = new JLabel("Add Course");
        JLabel lb1 = new JLabel("CourseCode");
        JLabel lb2 = new JLabel("CourseName");
        JLabel lb3 = new JLabel("CourseDescription");
        JLabel lb4 = new JLabel("CourseHours");
        JLabel lb5 = new JLabel("CourseCapacity");
        JLabel lb6 = new JLabel("OfferedFall");
        JLabel lb7 = new JLabel("OfferedSpring");
        JLabel lb8 = new JLabel("OfferedSummer");
        JLabel lb9 = new JLabel("CoursePrereqs");
        JLabel lb10 = new JLabel("Teachers");

       // JTextField txt = new JTextField("Add Course");
        final JTextField txt1 = new JTextField("CourseCode");
        final JTextField txt2 = new JTextField("CourseName");
        final JTextField txt3 = new JTextField("CourseDescription");
        final JTextField txt4 = new JTextField("CourseHours");
        final JTextField txt5 = new JTextField("CourseCapacity");
        final JTextField txt6 = new JTextField("OfferedFall");
        final JTextField txt7 = new JTextField("OfferedSpring");
        final JTextField txt8 = new JTextField("OfferedSummer");
        final JTextField txt9 = new JTextField("CoursePrereqs");
        final JTextField txt10 = new JTextField("Teachers");
        JScrollPane ListScrollPane = new JScrollPane(txt2);
        p1.add(ListScrollPane);
        setTitle("Add Course");
        setLocation(250, 50);
        setSize(850, 600);
        setVisible(true);
        setResizable(false);
        p1.setLayout(null);
        lb.setBounds(350, 10, 250, 50);
        Font f = new Font("SansSherif", Font.BOLD, 20);
        lb.setFont(f);
        lb1.setBounds(230, 70, 130, 50);
        txt1.setBounds(400, 80, 230, 30);
        txt2.setBounds(400, 120, 230, 30);
        txt3.setBounds(400, 160, 230, 30);
        txt4.setBounds(400, 200, 230, 30);
        txt5.setBounds(400, 240, 230, 30);
        txt6.setBounds(400, 280, 230, 30);
        txt7.setBounds(400, 320, 230, 30);
        txt8.setBounds(400, 360, 230, 30);
        txt9.setBounds(400, 400, 230, 30);
        txt10.setBounds(400, 440, 230, 30);
        lb2.setBounds(230, 110, 150, 50);
        lb3.setBounds(230, 150, 150, 50);
        lb4.setBounds(230, 190, 150, 50);
        lb5.setBounds(230, 230, 150, 50);
        lb6.setBounds(230, 270, 150, 50);
        lb7.setBounds(230, 310, 150, 50);
        lb8.setBounds(230, 350, 150, 50);
        lb9.setBounds(230, 390, 150, 50);
        lb10.setBounds(230, 430, 150, 50);

        Jb.setBounds(350, 490, 80, 30);
        Jb.setVisible(true);
        Jb.setBackground(Color.gray);
        Jb2.setBounds(500, 490, 80, 30);
        Jb2.setVisible(true);
        Jb2.setBackground(Color.gray);
        getContentPane().add(p1);
        txt1.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) {
                if (txt1.getText().trim().equals("CourseCode")) {
                    txt1.setText("");
                }
            }

            public void focusLost(FocusEvent e) {
                if (txt1.getText().trim().equals("")) {
                    txt1.setText("CourseCode");
                }
            }
        });
        txt2.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) {
                if (txt2.getText().trim().equals("CourseName")) {
                    txt2.setText("");
                }
            }

            public void focusLost(FocusEvent e) {
                if (txt2.getText().trim().equals("")) {
                    txt2.setText("CourseName");
                }
            }
        });

        txt3.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) {
                if (txt3.getText().trim().equals("CourseDescription")) {
                    txt3.setText("");
                }
            }

            public void focusLost(FocusEvent e) {
                if (txt3.getText().trim().equals("")) {
                    txt3.setText("CourseDescription");
                }
            }
        });
        txt4.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) {
                if (txt4.getText().trim().equals("CourseHours")) {
                    txt4.setText("");
                }
            }

            public void focusLost(FocusEvent e) {
                if (txt4.getText().trim().equals("")) {
                    txt4.setText("CourseHours");
                }

            }
        });
        txt5.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) {
                if (txt5.getText().trim().equals("CourseCapacity")) {
                    txt5.setText("");
                }

            }

            public void focusLost(FocusEvent e) {
                if (txt5.getText().trim().equals("")) {
                    txt5.setText("CourseCapacity");
                }

            }
        });
        txt6.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) {
                if (txt6.getText().trim().equals("OfferedFall")) {
                    txt6.setText("");
                }

            }

            public void focusLost(FocusEvent e) {
                if (txt6.getText().trim().equals("")) {
                    txt6.setText("OfferedFall");
                }

            }
        });
        txt7.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) {
                if (txt7.getText().trim().equals("OfferedSpring")) {
                    txt7.setText("");
                }

            }

            public void focusLost(FocusEvent e) {
                if (txt7.getText().trim().equals("")) {
                    txt7.setText("OfferedSpring");
                }

            }
        });
        txt8.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) {
                if (txt8.getText().trim().equals("OfferedSummer")) {
                    txt8.setText("");
                }

            }

            public void focusLost(FocusEvent e) {
                if (txt8.getText().trim().equals("")) {
                    txt8.setText("OfferedSummer");
                }

            }
        });
        txt9.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) {
                if (txt9.getText().trim().equals("CoursePrereqs")) {
                    txt9.setText("");
                }

            }

            public void focusLost(FocusEvent e) {
                if (txt9.getText().trim().equals("")) {
                    txt9.setText("CoursePrereqs");
                }

            }
        });
        txt10.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) {
                if (txt10.getText().trim().equals("Teachers")) {
                    txt10.setText("");
                }

            }

            public void focusLost(FocusEvent e) {
                if (txt10.getText().trim().equals("")) {
                    txt10.setText("Teachers");
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
        p1.add(txt8);
        p1.add(txt9);
        p1.add(txt10);
        p1.add(lb2);
        p1.add(lb3);
        p1.add(lb4);
        p1.add(lb5);
        p1.add(lb6);
        p1.add(lb7);
        p1.add(lb8);
        p1.add(lb9);
        p1.add(lb10);
        p1.add(Jb);
        p1.add(Jb2);

        ListScrollPane.setVisible(true);

        Jb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                  list1.add(txt1.getText());
       // }
       // if(!txt2.getText().trim().equals("Discription")){
            list1.add(txt2.getText());
       // }
       // if(!txt3.getText().trim().equals("Code")){
            list1.add(txt3.getText());
        //}
       // if(!txt4.getText().trim().equals("Hours")){
            list1.add(txt4.getText());
       // }
       // if(!txt5.getText().trim().equals("Type")){
            list1.add(txt5.getText());
       // }
       // if(!txt6.getText().trim().equals("Courses")){
            list1.add(txt6.getText());
       // }
            list1.add(txt7.getText());
            list1.add(txt8.getText());
            list1.add(txt9.getText());
            list1.add(txt10.getText());
                TableModel.addRow(list1.toArray());
                TableModel.fireTableDataChanged();
            /*    try { 
                    FileWriter pw = new FileWriter("C:\\Users\\sendt\\Documents\\NetBeansProjects\\Screens\\src\\screens\\TestDataDegreePlanReq.csv",true);
                    pw.append(txt1.getText());
                    pw.append(",");
                    pw.append(txt2.getText());
                    pw.append(",");
                    pw.append(txt3.getText());
                    pw.append(",");
                    pw.append(txt4.getText());
                    pw.append(",");
                    pw.append(txt5.getText());
                    pw.append(",");
                    pw.append(txt6.getText());
                    pw.append("\n");
                    pw.flush();
                    pw.close();
                    
                } catch (IOException ex) {
                    Logger.getLogger(DegreePlanAddScreen.class.getName()).log(Level.SEVERE, null, ex);
                }
                */
                JOptionPane.showMessageDialog(null, "Degree Plan Added Successfully", "Confirmation", JOptionPane.INFORMATION_MESSAGE);
                setVisible(false);
                dispose();
              //      DegreePlanInformationScreen degree = new DegreePlanInformationScreen();
              //  } catch (IOException ex) {
              //      Logger.getLogger(DegreePlanAddScreen.class.getName()).log(Level.SEVERE, null, ex);
               // }
            }
        });
        Jb2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                dispose();
                MenuScreen degree = new MenuScreen();
            }
        });

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
