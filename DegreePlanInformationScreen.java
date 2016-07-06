package screens;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
//import java.lang.;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedWriter;
import java.io.File;
import com.csvreader.CsvReader;
import java.awt.List;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import au.com.bytecode.opencsv.CSVReader;
import java.awt.FlowLayout;
import java.io.IOException;
import javax.swing.table.DefaultTableModel;

public class DegreePlanInformationScreen extends JFrame {

    @SuppressWarnings("empty-statement")
    public DegreePlanInformationScreen() throws FileNotFoundException, IOException {
        JPanel toppanel = new JPanel();
        JPanel btnpanel = new JPanel();
        toppanel.setLayout(new BorderLayout());
        btnpanel.setLayout(new FlowLayout());
        JButton Jb1 = new JButton("Add");
        JButton Jb2 = new JButton("Update");
        JButton Jb3 = new JButton("Delete");
        JButton Jb4 = new JButton("Save");
        setSize(850, 600);
        setTitle("Degree Plan Information");
        setLocation(250, 50);
        getContentPane().setBackground(Color.lightGray);
        setVisible(true);
        Jb1.setBounds(250, 570, 70, 30);
        Jb1.setVisible(true);
        Jb2.setBounds(370, 570, 90, 30);
        Jb2.setVisible(true);
        Jb3.setBounds(510, 570, 70, 30);
        Jb3.setVisible(true);
        toppanel.setSize(850, 400);
        btnpanel.setSize(50, 590);
        Jb4.setBounds(380, 380, 70, 30);
        Jb4.setVisible(true);
        btnpanel.add(Jb1);
        btnpanel.add(Jb2);
        btnpanel.add(Jb3);
        btnpanel.add(Jb4);
        setResizable(false);
        Object row_Data[][] = {{". ", "       ", "        ", "       ", "        ", "         "}, {". ", "       ", "        ", "       ", "        ", "         "}, {". ", "       ", "        ", "       ", "        ", "         "}, {". ", "       ", "        ", "       ", "        ", "         "},
        {". ", "       ", "        ", "       ", "        ", "         "},
        {". ", "       ", "        ", "       ", "        ", "         "}};
        //   Object column_names[] = {"  ", "Name", "Title", "Load", "Courses", "Days"};
        CSVReader reader = new CSVReader(new FileReader("C:\\Users\\Anish\\Documents\\NetBeansProjects\\screens\\src\\screens\\TestDataDegreePlanReq.csv"));
        java.util.List<String[]> myEntries = reader.readAll();
        Object[] columnnames;
        columnnames = (String[]) myEntries.get(0);
        final DefaultTableModel tableModel = new DefaultTableModel(columnnames, myEntries.size() - 1);
        int rowcount = tableModel.getRowCount();
        for (int x = 0; x < rowcount + 1; x++) {
            int columnnumber = 0;
            // if x = 0 this is the first row...skip it... data used for columnnames
            if (x > 0) {
                for (String thiscellvalue : (String[]) myEntries.get(x)) {
                    tableModel.setValueAt(thiscellvalue, x - 1, columnnumber);
                    columnnumber++;
                }
            }

        }
        final JTable table = new JTable(tableModel);
        //  JTable table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(34, 640, 830, 400);
        scrollPane.setViewportView(table);
        //add(scrollPane, BorderLayout.CENTER);
        table.getTableHeader().setFont(new Font("Tahoma", Font.BOLD, 12));
        table.getTableHeader().setBackground(Color.DARK_GRAY);
        table.getTableHeader().setForeground(Color.white);
        table.setBackground(Color.WHITE);
        table.setForeground(Color.BLACK);
        table.setDragEnabled(false);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        JTableHeader header = table.getTableHeader();
        header.setPreferredSize(new Dimension(scrollPane.getWidth(), 89));
        //table.repaint();
        table.getTableHeader().setReorderingAllowed(false);
        table.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        //table.setSelectionBackground(new Color(255,0,51))ta;
        table.setFont(new Font("Tahoma", Font.BOLD, 10));
        table.setVisible(true);
        table.setRowHeight(0, 50);
        table.setRowMargin(5);
        TableColumnModel columnModel = table.getColumnModel();
        columnModel.getColumn(1).setWidth(100);
        columnModel.getColumn(0).setPreferredWidth(20);
        columnModel.getColumn(2).setWidth(100);
        //  table.setRowHeight(50);
        table.setRowHeight(20);
        table.getTableHeader().setColumnModel(columnModel);
        toppanel.add(scrollPane);
        add(toppanel, BorderLayout.NORTH);
        // toppanel.add(btnpanel,BorderLayout.SOUTH);
        add(btnpanel, BorderLayout.CENTER);
        revalidate();
        repaint();
        scrollPane.setVisible(true);
        getContentPane().setBackground(Color.DARK_GRAY);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        Jb1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               // setVisible(false);
               // dispose();
                DegreePlanAddScreen add = new DegreePlanAddScreen(tableModel);
            }
        });
        Jb2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               // setVisible(false);
                //dispose();
                DegreePlanUpdateScreen add = new DegreePlanUpdateScreen(tableModel,table);
            }
        });
        Jb4.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    File file = new File("C:\\Users\\Anish\\Documents\\NetBeansProjects\\screens\\src\\screens\\DegreePlan.txt");
                    if (!file.exists()) {
                        file.createNewFile();
                    }
                    FileWriter fw = new FileWriter(file.getAbsoluteFile());
                    BufferedWriter bw = new BufferedWriter(fw);
                    for (int i = 0; i < table.getRowCount(); i++) {
                        for (int j = 0; j < table.getColumnCount(); j++) {
                            bw.write(table.getModel().getValueAt(i, j) + "");
                        }
                        bw.write("\n_________\n");
                    }
                    bw.close();
                    fw.close();
                    JOptionPane.showMessageDialog(null, "Saved Successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
                    MenuScreen menu = new MenuScreen();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }

            }
        });
      //  table.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
       Jb3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int rowCount = tableModel.getRowCount();
                
                    
                if (table.getSelectedRow() != -1) {
            // remove selected row from the model
            tableModel.removeRow(table.getSelectedRow());
            JOptionPane.showMessageDialog(null, "Row Deleted Successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
        }
            
            
        

    }
            });
}
}
