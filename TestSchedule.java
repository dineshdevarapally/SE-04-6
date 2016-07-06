package screens;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;

public class TestSchedule extends JFrame {

    public TestSchedule() {
        JPanel p = new JPanel();
       // JButton Jb1 = new JButton("Add");
        // JButton Jb2 = new JButton("Update");
        // JButton Jb3 = new JButton("Delete");
        JButton Jb4 = new JButton("Save");
        setSize(850, 600);
        setTitle("Test Schedule");
        setLocation(250, 50);
        getContentPane().setBackground(Color.lightGray);
        setVisible(true);
        //Jb1.setBounds(250, 450, 70, 30);
        //Jb1.setVisible(true);
        //Jb2.setBounds(370, 450, 90, 30);
        //Jb2.setVisible(true);
        //Jb3.setBounds(510, 450, 70, 30);
        //Jb3.setVisible(true);
        Jb4.setBounds(370, 430, 70, 30);
        //add(Jb1);
        //add(Jb2);
        //add(Jb3);
        add(Jb4);
        setResizable(false);
        Object row_Data[][] = {{"Fall 2016 ", "Open", "        ", "       ", "        ", "         ", "        ", "          ", "        ", "          ", "          "},
        {"Fall 2016", "Open", "        ", "       ", "        ", "         ", "        ", "          ", "        ", "          ", "          "},
        {"Fall 2016", "Open", "        ", "       ", "        ", "         ", "        ", "          ", "        ", "          ", "          "},
        {"Fall 2016", "Open", "        ", "       ", "        ", "         ", "        ", "          ", "        ", "          ", "          "},
        {"Fall 2016", "Open", "        ", "       ", "        ", "         ", "        ", "          ", "        ", "          ", "          "},
        {"Fall 2016", "Open", "        ", "       ", "        ", "         ", "        ", "          ", "        ", "          ", "          "}};
        Object column_names[] = {"Term", "Status", "Section Name and Title", "Location", "Meeting Information", "Faculty",
            "Available/Capacity/Waitlist", "Credits", "CEU's", "Academic Level"};
        final JTable table = new JTable(row_Data, column_names);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(34, 640, 830, 400);
        scrollPane.setViewportView(table);
        add(scrollPane, BorderLayout.CENTER);
        table.getTableHeader().setFont(new Font("Tahoma", Font.BOLD, 12));
        table.getTableHeader().setBackground(Color.DARK_GRAY);
        table.getTableHeader().setForeground(Color.white);
        table.setBackground(Color.WHITE);
        table.setForeground(Color.BLACK);
        table.setDragEnabled(false);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        JTableHeader header = table.getTableHeader();
        header.setPreferredSize(new Dimension(scrollPane.getWidth(), 89));
        table.getTableHeader().setReorderingAllowed(false);
        table.setFont(new Font("Tahoma", Font.BOLD, 10));
        table.setVisible(true);
        table.setRowHeight(0, 50);
        table.setRowMargin(5);
        table.setRowHeight(30);
     //   TableColumnModel columnModel3 = table.getColumnModel();
        // columnModel3.getColumn(0).setPreferredWidth(20);
        // columnModel3.getColumn(1).setPreferredWidth(38);
        // columnModel3.getColumn(2).setPreferredWidth(68);
        // columnModel3.getColumn(3).setPreferredWidth(30);
        // columnModel3.getColumn(4).setPreferredWidth(40);
        // table.setRowHeight(1, 80);
        // table.setRowHeight(25);
        TableColumn column = null;
        for (int i = 0; i < 5; i++) {
            column = table.getColumnModel().getColumn(i);
            if (i == 1) {
                column.setPreferredWidth(15); //third column is bigger
            } else {
                column.setPreferredWidth(50);
            }
        }

        //table.getTableHeader().setColumnModel(columnModel3);
        //  table.setColumnModel(columnModel3);
        add(scrollPane);
        revalidate();
        repaint();
        scrollPane.setVisible(true);
        getContentPane().setBackground(Color.DARK_GRAY);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        Jb4.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    File file = new File("C:\\Users\\Anish\\Documents\\NetBeansProjects\\screens\\src\\screens\\TestSchedule.txt");
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
                    MenuScreen men = new MenuScreen();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }

            }
        });
    }
}
