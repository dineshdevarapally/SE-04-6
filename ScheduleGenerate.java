
package screens;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
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
import javax.swing.table.TableColumnModel;

public class ScheduleGenerate extends JFrame{
    
    public ScheduleGenerate(){
    JPanel p = new JPanel();
    JPanel btnpanel=new JPanel();
    p.setLayout(new BorderLayout());
    p.setSize(850, 400);
        btnpanel.setSize(50, 590);
        btnpanel.setLayout(new FlowLayout());
       // JButton Jb1 = new JButton("Add");
       // JButton Jb2 = new JButton("Update");
       // JButton Jb3 = new JButton("Delete");
        JButton Jb4=new JButton("Save");
        setSize(850, 600);
        setTitle("Schedule Generate");
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
        btnpanel.add(Jb4);
        setResizable(false);
        Object row_Data[][] = {{"Fall 2016 ", "Open", "CENG-5013-91(6166) HDL Design", "        ","08/29/2016-12/16/2016 Web Based Internet Monday Tuesday Wednesday Thursday Friday Time to be announced Rooms to be announced", "Dr Steve Maher", "24/25/0", "3.00", "          ", "Graduate"},
        {"Fall 2016", "Open", "CENG-5033-01(7180) Software Systems Engineering", "        ","08/29/2016-12/21/2016 Lecture Days to be announced 6:00pm - 9:30pm Rooms to be announced", "Staff", "24/25/0", "3.00", "          ", "Graduate"},
        {"Fall 2016", "Open", "CENG-5033-02(7297) Software Systems Engineering", "        ","10/27/2016-12/15/2016 Lecture Days to be announced 6:00pm - 9:30pm Prince Engineering Center", "Dr Colin Doyle", "19/25/0", "3.00", "          ", "Graduate"},
        {"Fall 2016", "Open", "CENG-5033-01(7283) Advanced Computer Architecture", "        ","08/29/2016-10/17/2016 Lecture Days to be announced 6:00pm - 9:30pm Noble Science Wing", "Mr Joe Watson", "11/15/0", "3.00", "          ", "Graduate"},
        {"Fall 2016", "Open", "CENG-5033-02(7351) Advanced Computer Architecture","        ", "10/24/2016-12/12/2016 Lecture Days to be announced 6:00pm - 9:30pm Noble Science Wing", "Mr Joe Watson", "25/25/0", "3.00", "          ", "Graduate"},
        {"Fall 2016", "Open", "CENG-5613-02(5895) Object Oriented Software Eng","        ", "08/29/2016-10/17/2016 Lecture Days to be announced 6:00pm - 9:30pm Prince Engineering Center", "Mr Nicolas Grounds", "9/25/0", "3.00", "          ", "Graduate"},
        {"Fall 2016", "Open", "CENG-5813-02(5895) Object Oriented Software Eng","        ", "08/29/2016-10/17/2016 Lecture Days to be announced 6:00pm - 9:30pm Prince Engineering Center", "Mr Peter Paton", "9/25/0", "3.00", "          ", "Graduate"},
        {"Fall 2016", "Open", "CENG-5022-02(5895) Object Oriented Software Eng","        ", "08/29/2016-10/17/2016 Lecture Days to be announced 6:00pm - 9:30pm Prince Engineering Center", "Mr Nicolas Grounds", "30/25/0", "3.00", "          ", "Graduate"},
        {"Fall 2016", "Open", "CENG-5613-02(5895) Object Oriented Software Eng","        ", "08/29/2016-10/17/2016 Lecture Days to be announced 6:00pm - 9:30pm Prince Engineering Center", "Dr Colin Doyle", "8/25/0", "3.00", "          ", "Graduate"},
        {"Fall 2016", "Open", "CENG-5633-02(5895) Object Oriented Software Eng","        ", "08/29/2016-10/17/2016 Lecture Days to be announced 6:00pm - 9:30pm Prince Engineering Center", "Dr Steve Maher", "12/25/0", "3.00", "          ", "Graduate"},
        {"Fall 2016", "Open", "CENG-5013-02(5895) Object Oriented Software Eng","        ", "08/29/2016-10/17/2016 Lecture Days to be announced 6:00pm - 9:30pm Prince Engineering Center", "Mr Nicolas Grounds", "19/25/0", "3.00", "          ", "Graduate"},
        {"Fall 2016", "Open", "CENG-5213-02(5895) Object Oriented Software Eng","        ", "08/29/2016-10/17/2016 Lecture Days to be announced 6:00pm - 9:30pm Prince Engineering Center", "Mr Nicolas Grounds", "17/25/0", "3.00", "          ", "Graduate"},
        {"Fall 2016", "Open", "CENG-5633-02(5895) Object Oriented Software Eng","        ", "08/29/2016-10/17/2016 Lecture Days to be announced 6:00pm - 9:30pm Prince Engineering Center", "Staff", "9/25/0", "3.00", "          ", "Graduate"},
        {"Fall 2016", "Open", "CENG-5613-02(5895) Object Oriented Software Eng","        ", "08/29/2016-10/17/2016 Lecture Days to be announced 6:00pm - 9:30pm Prince Engineering Center", "Mr Joe Watson", "6/25/0", "3.00", "          ", "Graduate"}};
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
        p.add(scrollPane);
       add(p, BorderLayout.NORTH);
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
        
        
        Jb4.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent ae) {
                try{
        File file = new File("C:\\Users\\Anish\\Documents\\NetBeansProjects\\screens\\src\\screens\\ScheduleGenerate.txt");
          if(!file.exists()){
              file.createNewFile();
          }
          FileWriter fw=new FileWriter(file.getAbsoluteFile());
         BufferedWriter bw=new BufferedWriter(fw);
   for(int i=0;i<table.getRowCount();i++){
       for(int j=0;j<table.getColumnCount();j++){
           bw.write(table.getModel().getValueAt(i,j)+"");
       }
       bw.write("\n_________\n");
   }
   bw.close();
   fw.close();   
                    JOptionPane.showMessageDialog(null, "Saved Successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
   MenuScreen men=new MenuScreen();
        }catch(Exception ex){
        ex.printStackTrace();
    }

            }   
        });
        

    /*    Jb1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                dispose();
                DegreePlanAddScreen add = new DegreePlanAddScreen();
            }
        });
        Jb2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                dispose();
                DegreePlanUpdateScreen add = new DegreePlanUpdateScreen();
            }
        });
        Jb4.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent ae) {
                try{
        File file = new File("C:\\Users\\sendt\\Documents\\NetBeansProjects\\Screens\\src\\screens\\DegreePlan.txt");
          if(!file.exists()){
              file.createNewFile();
          }
          FileWriter fw=new FileWriter(file.getAbsoluteFile());
         BufferedWriter bw=new BufferedWriter(fw);
   for(int i=0;i<table.getRowCount();i++){
       for(int j=0;j<table.getColumnCount();j++){
           bw.write(table.getModel().getValueAt(i,j)+"");
       }
       bw.write("\n_________\n");
   }
   bw.close();
   fw.close();   
   JOptionPane.showMessageDialog(null, "Saved Successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
        }catch(Exception ex){
        ex.printStackTrace();
    }

            }   
        });
        
        
        */
}
}
