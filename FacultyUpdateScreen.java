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
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.RowFilter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class FacultyUpdateScreen extends JFrame {

    public FacultyUpdateScreen(final DefaultTableModel TableModel, final JTable table) {
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
        JLabel lb = new JLabel("Update Faculty");
        JLabel lb1 = new JLabel("LastName");
        JLabel lb2 = new JLabel("FirstName");
        JLabel lb3 = new JLabel("GradSchool");
        JLabel lb4 = new JLabel("Degree");
        JLabel lb5 = new JLabel("Title");
        JLabel lb6 = new JLabel("DaysToTeach");
        JLabel lb7 = new JLabel("MaxLoadFall");
        JLabel lb8 = new JLabel("MaxLoadSpring");
        JLabel lb9 = new JLabel("MaxLoadSummer");
    //    JLabel lb10 = new JLabel("Teachers");

       // JTextField txt = new JTextField("Add Course");
        final JTextField txt1 = new JTextField("LastName");
        final JTextField txt2 = new JTextField("FirstName");
        final JTextField txt3 = new JTextField("GradSchool");
        final JTextField txt4 = new JTextField("Degree");
        final JTextField txt5 = new JTextField("Title");
        final JTextField txt6 = new JTextField("DaysToTeach");
        final JTextField txt7 = new JTextField("MaxLoadFall");
        final JTextField txt8 = new JTextField("MaxLoadSpring");
        final JTextField txt9 = new JTextField("MaxLoadSummer");
        //JTextField txt10 = new JTextField("Teachers");
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
       // txt10.setBounds(400, 440, 230, 30);
        lb2.setBounds(230, 110, 150, 50);
        lb3.setBounds(230, 150, 150, 50);
        lb4.setBounds(230, 190, 150, 50);
        lb5.setBounds(230, 230, 150, 50);
        lb6.setBounds(230, 270, 150, 50);
        lb7.setBounds(230, 310, 150, 50);
        lb8.setBounds(230, 350, 150, 50);
        lb9.setBounds(230, 390, 150, 50);
      //  lb10.setBounds(230, 430, 150, 50);

        Jb.setBounds(350, 490, 80, 30);
        Jb.setVisible(true);
        Jb.setBackground(Color.gray);
        Jb2.setBounds(500, 490, 80, 30);
        Jb2.setVisible(true);
        Jb2.setBackground(Color.gray);
        getContentPane().add(p1);
        txt1.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) {
                if (txt1.getText().trim().equals("LastName")) {
                    txt1.setText("");
                }
            }

            public void focusLost(FocusEvent e) {
                if (txt1.getText().trim().equals("")) {
                    txt1.setText("LastName");
                }
            }
        });
        txt2.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) {
                if (txt2.getText().trim().equals("FirstName")) {
                    txt2.setText("");
                }
            }

            public void focusLost(FocusEvent e) {
                if (txt2.getText().trim().equals("")) {
                    txt2.setText("FirstName");
                }
            }
        });

        txt3.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) {
                if (txt3.getText().trim().equals("GradSchool")) {
                    txt3.setText("");
                }
            }

            public void focusLost(FocusEvent e) {
                if (txt3.getText().trim().equals("")) {
                    txt3.setText("GradSchool");
                }
            }
        });
        txt4.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) {
                if (txt4.getText().trim().equals("Degree")) {
                    txt4.setText("");
                }
            }

            public void focusLost(FocusEvent e) {
                if (txt4.getText().trim().equals("")) {
                    txt4.setText("Degree");
                }

            }
        });
        txt5.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) {
                if (txt5.getText().trim().equals("Title")) {
                    txt5.setText("");
                }

            }

            public void focusLost(FocusEvent e) {
                if (txt5.getText().trim().equals("")) {
                    txt5.setText("Title");
                }

            }
        });
        txt6.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) {
                if (txt6.getText().trim().equals("DaysToTeach")) {
                    txt6.setText("");
                }

            }

            public void focusLost(FocusEvent e) {
                if (txt6.getText().trim().equals("")) {
                    txt6.setText("DaysToTeach");
                }

            }
        });
        txt7.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) {
                if (txt7.getText().trim().equals("MaxLoadFall")) {
                    txt7.setText("");
                }

            }

            public void focusLost(FocusEvent e) {
                if (txt7.getText().trim().equals("")) {
                    txt7.setText("MaxLoadFall");
                }

            }
        });
        txt8.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) {
                if (txt8.getText().trim().equals("MaxLoadSpring")) {
                    txt8.setText("");
                }

            }

            public void focusLost(FocusEvent e) {
                if (txt8.getText().trim().equals("")) {
                    txt8.setText("MaxLoadSpring");
                }

            }
        });
        txt9.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) {
                if (txt9.getText().trim().equals("MaxLoadSummer")) {
                    txt9.setText("");
                }

            }

            public void focusLost(FocusEvent e) {
                if (txt9.getText().trim().equals("")) {
                    txt9.setText("MaxLoadSummer");
                }

            }
        });
      /*  txt10.addFocusListener(new FocusListener() {
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
*/
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
       // p1.add(txt10);
        p1.add(lb2);
        p1.add(lb3);
        p1.add(lb4);
        p1.add(lb5);
        p1.add(lb6);
        p1.add(lb7);
        p1.add(lb8);
        p1.add(lb9);
        //p1.add(lb10);
        p1.add(Jb);
        p1.add(Jb2);

        ListScrollPane.setVisible(true);
 final TableRowSorter<DefaultTableModel> rowSorter = new TableRowSorter<>(TableModel);
       table.setRowSorter(rowSorter);
        txt1.getDocument().addDocumentListener(new DocumentListener(){

            @Override
            public void insertUpdate(DocumentEvent de) {
                String text = txt1.getText();

                if (text.trim().length() == 0) {
                    rowSorter.setRowFilter(null);
                } else {
                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
                table.repaint();
                TableModel.fireTableDataChanged();
            }

            @Override
            public void removeUpdate(DocumentEvent de) {
                String text = txt1.getText();

                if (text.trim().length() == 0) {
                    rowSorter.setRowFilter(null);
                } else {
                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
                table.repaint();
                TableModel.fireTableDataChanged();
            }

            @Override
            public void changedUpdate(DocumentEvent de) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                
            }

        });
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
          //  list1.add(txt10.getText());
             table.repaint();
                String Value=(String) table.getValueAt(0,0);
                if(Value.equalsIgnoreCase(txt1.getText())){
                    table.setValueAt(txt2.getText(), 0, 1);
                    table.setValueAt(txt3.getText(), 0, 2);
                    table.setValueAt(txt4.getText(), 0, 3);
                    table.setValueAt(txt5.getText(), 0, 4);
                    table.setValueAt(txt6.getText(), 0, 5);
                    table.setValueAt(txt7.getText(), 0, 6);
                    table.setValueAt(txt8.getText(), 0, 7);
                    table.setValueAt(txt9.getText(), 0, 8);
                  //  table.setValueAt(txt10.getText(), 0, 9);
                  //  table.setValueAt(txt6.getText(), 0, 5);
                }
             //   TableModel.fireTableDataChanged();
               // TableModel.addRow(list1.toArray());
             //   TableModel.fireTableDataChanged();
                //TableModel.addRow(list1.toArray());
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
                JOptionPane.showMessageDialog(null, "Faculy Updated Successfully", "Confirmation", JOptionPane.INFORMATION_MESSAGE);
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
