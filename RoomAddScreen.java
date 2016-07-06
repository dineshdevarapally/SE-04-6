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

public class RoomAddScreen extends JFrame {

    public RoomAddScreen(final DefaultTableModel TableModel) {
        JPanel p1 = new JPanel();
        DefaultListModel list = new DefaultListModel();
        final List<String> list1 = new ArrayList<String>();
        list.addElement("Computer Science");
        list.addElement("Electrical Engineering");
        list.addElement("Chemical Engineering");
        list.addElement("Software Engineering");
        JButton Jb = new JButton("Confirm");
        JButton Jb2 = new JButton("Cancel");
        JLabel lb = new JLabel("Add Rooms");
        JLabel lb1 = new JLabel("Building");
        JLabel lb2 = new JLabel("Number");
        JLabel lb3 = new JLabel("Capacity");

        final JTextField txt1 = new JTextField("Building");
        final JTextField txt2 = new JTextField("Number");
        final JTextField txt3 = new JTextField("Capacity");

        JScrollPane ListScrollPane = new JScrollPane(txt2);
        p1.add(ListScrollPane);
        setTitle("Add Rooms");
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

        lb2.setBounds(230, 110, 150, 50);
        lb3.setBounds(230, 150, 150, 50);

        Jb.setBounds(350, 270, 80, 30);
        Jb.setVisible(true);
        Jb.setBackground(Color.gray);
        Jb2.setBounds(500, 270, 80, 30);
        Jb2.setVisible(true);
        Jb2.setBackground(Color.gray);
        getContentPane().add(p1);
        txt1.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) {
                if (txt1.getText().trim().equals("Building")) {
                    txt1.setText("");
                }
            }

            public void focusLost(FocusEvent e) {
                if (txt1.getText().trim().equals("")) {
                    txt1.setText("Building");
                }
            }
        });
        txt2.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) {
                if (txt2.getText().trim().equals("Number")) {
                    txt2.setText("");
                }
            }

            public void focusLost(FocusEvent e) {
                if (txt2.getText().trim().equals("")) {
                    txt2.setText("Number");
                }
            }
        });

        txt3.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) {
                if (txt3.getText().trim().equals("Capacity")) {
                    txt3.setText("");
                }
            }

            public void focusLost(FocusEvent e) {
                if (txt3.getText().trim().equals("")) {
                    txt3.setText("Capacity");
                }
            }
        });

        p1.add(lb);
        p1.add(lb1);
        p1.add(txt1);
        p1.add(txt2);
        p1.add(txt3);
        p1.add(lb2);
        p1.add(lb3);
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
         //   list1.add(txt4.getText());
       // }
       // if(!txt5.getText().trim().equals("Type")){
         //   list1.add(txt5.getText());
       // }
       // if(!txt6.getText().trim().equals("Courses")){
          //  list1.add(txt6.getText());
       // }
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
