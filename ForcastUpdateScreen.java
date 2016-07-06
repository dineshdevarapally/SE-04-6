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

public class ForcastUpdateScreen extends JFrame {

   public ForcastUpdateScreen(final DefaultTableModel TableModel,final JTable table) {
        JPanel p1 = new JPanel();
        DefaultListModel list = new DefaultListModel();
         final List<String> list1 = new ArrayList<String>();
        list.addElement("Computer Science");
        list.addElement("Electrical Engineering");
        list.addElement("Chemical Engineering");
        list.addElement("Software Engineering");
        JButton Jb = new JButton("Confirm");
        JButton Jb2 = new JButton("Cancel");
        JLabel lb = new JLabel("Update Forcast");
        JLabel lb1 = new JLabel("DegreeCode");
        JLabel lb2 = new JLabel("GradeSchool");
        JLabel lb3 = new JLabel("DegreeName");
        JLabel lb4 = new JLabel("Forcast");

        final JTextField txt1 = new JTextField("DegreeCode");
        final JTextField txt2 = new JTextField("GradeSchool");
        final JTextField txt3 = new JTextField("DegreeName");
        final JTextField txt4 = new JTextField("Forcast");

        JScrollPane ListScrollPane = new JScrollPane(txt2);
        p1.add(ListScrollPane);
        setTitle("Add Forcaast");
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

        lb2.setBounds(230, 110, 150, 50);
        lb3.setBounds(230, 150, 130, 50);
        txt3.setBounds(400, 160, 230, 30);
        lb4.setBounds(230, 190, 130, 50);
        txt4.setBounds(400, 200, 230, 30);

        Jb.setBounds(350, 270, 80, 30);
        Jb.setVisible(true);
        Jb.setBackground(Color.gray);
        Jb2.setBounds(500, 270, 80, 30);
        Jb2.setVisible(true);
        Jb2.setBackground(Color.gray);
        getContentPane().add(p1);
        txt1.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) {
                if (txt1.getText().trim().equals("DegreeCode")) {
                    txt1.setText("");
                }
            }

            public void focusLost(FocusEvent e) {
                if (txt1.getText().trim().equals("")) {
                    txt1.setText("DegreeCode");
                }
            }
        });
        txt2.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) {
                if (txt2.getText().trim().equals("GradeSchool")) {
                    txt2.setText("");
                }
            }

            public void focusLost(FocusEvent e) {
                if (txt2.getText().trim().equals("")) {
                    txt2.setText("GradeSchool");
                }
            }
        });
        txt3.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) {
                if (txt3.getText().trim().equals("DegreeName")) {
                    txt3.setText("");
                }
            }

            public void focusLost(FocusEvent e) {
                if (txt3.getText().trim().equals("")) {
                    txt3.setText("DegreeName");
                }
            }
        });
        txt4.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) {
                if (txt4.getText().trim().equals("Forcast")) {
                    txt4.setText("");
                }
            }

            public void focusLost(FocusEvent e) {
                if (txt4.getText().trim().equals("")) {
                    txt4.setText("Forcast");
                }
            }
        });

        p1.add(lb);
        p1.add(lb1);
          p1.add(lb3);
            p1.add(lb4);
        p1.add(txt1);
        p1.add(txt2);
        p1.add(txt3);
        p1.add(txt4);
        p1.add(lb2);
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
            //list1.add(txt5.getText());
       // }
       // if(!txt6.getText().trim().equals("Courses")){
           // list1.add(txt6.getText());
       // }
               // TableModel.addRow(list1.toArray());
            table.repaint();
                String Value=(String) table.getValueAt(0,0);
                if(Value.equalsIgnoreCase(txt1.getText())){
                    table.setValueAt(txt2.getText(), 0, 1);
                    table.setValueAt(txt3.getText(), 0, 2);
                    table.setValueAt(txt4.getText(), 0, 3);
                 //   table.setValueAt(txt5.getText(), 0, 4);
                  //  table.setValueAt(txt6.getText(), 0, 5);
                }
                TableModel.fireTableDataChanged();
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
                JOptionPane.showMessageDialog(null, "Forcast Updated Successfully", "Confirmation", JOptionPane.INFORMATION_MESSAGE);
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
