package screens;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class AdminMenuScreen extends JFrame {

    public AdminMenuScreen() {
        JPanel p = new JPanel();
        JLabel lb = new JLabel("Welcome to Course Schedulling System");
        Font f = new Font("SansSherif", Font.BOLD | Font.ITALIC, 20);
        JMenuBar menubar = new JMenuBar();
        p.setLayout(null);
        add(p);
        lb.setBounds(240, 200, 400, 70);
        lb.setFont(f);
        getContentPane().add(p);
        p.add(lb);
        p.setBackground(Color.WHITE);
        JMenu mainmenu = new JMenu("Maintenance");
        JMenu schedulemenu = new JMenu("Schedule");
        JMenu importmenu = new JMenu("Import");
        JMenu reportmenu = new JMenu("Report");
        JMenu loginmenu = new JMenu("Login");

        setSize(850, 600);
        setTitle("Menu");
        setLocation(250, 50);
        setVisible(true);
        setResizable(false);
        JMenuItem item0 = new JMenuItem("University Edit");
        item0.setActionCommand("University Edit");
        JMenuItem item1 = new JMenuItem("Degree Plan");
        item1.setActionCommand("Degree Plan");
        JMenuItem item2 = new JMenuItem("Course");
        item2.setActionCommand("Course");
        JMenuItem item3 = new JMenuItem("Faculty");
        item3.setActionCommand("Faculty");
        JMenuItem item4 = new JMenuItem("Rooms");
        item4.setActionCommand("Rooms");
        JMenuItem item5 = new JMenuItem("Section");
        item5.setActionCommand("Section");
        JMenuItem item6 = new JMenuItem("Forcast");
        item6.setActionCommand("Forcast");
        JMenuItem item7 = new JMenuItem("Generate");
        item7.setActionCommand("Generate");
        JMenuItem item8 = new JMenuItem("Test");
        item8.setActionCommand("Test");
        JMenuItem item9 = new JMenuItem("Update");
        item9.setActionCommand("Update");
        JMenuItem item10 = new JMenuItem("Student Information");
        item10.setActionCommand("Student Information");
        JMenuItem item11 = new JMenuItem("Student Course");
        item11.setActionCommand("Student Course");
        JMenuItem item12 = new JMenuItem("Schedule");
        item12.setActionCommand("Schedule");
        JMenuItem item13 = new JMenuItem("Student");
        item13.setActionCommand("Student");
        JMenuItem item141 = new JMenuItem("Groups");
        item141.setActionCommand("Groups");
        JMenuItem item14 = new JMenuItem("Logout");
        item14.setActionCommand("Logout");

        mainmenu.add(item0);
        mainmenu.add(item1);
        mainmenu.add(item2);
        mainmenu.add(item3);
        mainmenu.add(item4);
        mainmenu.add(item5);
        mainmenu.add(item6);
        mainmenu.addSeparator();
        schedulemenu.add(item7);
        schedulemenu.add(item8);
        schedulemenu.add(item9);
        schedulemenu.addSeparator();
        importmenu.add(item10);
        importmenu.add(item11);
        importmenu.addSeparator();
        reportmenu.add(item12);
        reportmenu.add(item13);
        reportmenu.addSeparator();
        loginmenu.add(item141);
        loginmenu.add(item14);
        menubar.add(mainmenu);
        menubar.add(schedulemenu);
        menubar.add(importmenu);
        menubar.add(reportmenu);
        menubar.add(loginmenu);
        setJMenuBar(menubar);
        setVisible(true);
        importmenu.setEnabled(false);
        schedulemenu.setEnabled(false);
        //importmenu.setVisible(false);
        // schedulemenu.setVisible(false);
        setResizable(false);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        item0.addActionListener(new MenuItemListener());
        item1.addActionListener(new MenuItemListener());
        item2.addActionListener(new MenuItemListener());
        item3.addActionListener(new MenuItemListener());
        item4.addActionListener(new MenuItemListener());
        item5.addActionListener(new MenuItemListener());
        item6.addActionListener(new MenuItemListener());
        item7.addActionListener(new MenuItemListener());
        item8.addActionListener(new MenuItemListener());
        item9.addActionListener(new MenuItemListener());
        item10.addActionListener(new MenuItemListener());
        item11.addActionListener(new MenuItemListener());
        item12.addActionListener(new MenuItemListener());
        item13.addActionListener(new MenuItemListener());
        item141.addActionListener(new MenuItemListener());
        item14.addActionListener(new MenuItemListener());
    }

    class MenuItemListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            if (e.getActionCommand().equals("University Edit")) {
                universityeditScreen degree = new universityeditScreen();
            }
            if (e.getActionCommand().equals("Degree Plan")) {
                try {
                    DegreePlanInformationScreen degree = new DegreePlanInformationScreen();
                } catch (IOException ex) {
                    Logger.getLogger(AdminMenuScreen.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (e.getActionCommand().equals("Course")) {
                try {
                    CourseInformationScreen course = new CourseInformationScreen();
                } catch (IOException ex) {
                    Logger.getLogger(AdminMenuScreen.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (e.getActionCommand().equals("Faculty")) {
                try {
                    FacultyInformationScreen faculty = new FacultyInformationScreen();
                } catch (IOException ex) {
                    Logger.getLogger(AdminMenuScreen.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (e.getActionCommand().equals("Rooms")) {
                RoomInformationScreen room = new RoomInformationScreen();
            }
            if (e.getActionCommand().equals("Forcast")) {
                try {
                    ForcastInformationScreen forcast = new ForcastInformationScreen();
                } catch (IOException ex) {
                    Logger.getLogger(AdminMenuScreen.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (e.getActionCommand().equals("Schedule")) {
                ScheduleDisplayScreen schedule = new ScheduleDisplayScreen();
            }
            if (e.getActionCommand().equals("Generate")) {
                ScheduleGenerate schedulegenerate = new ScheduleGenerate();
            }
            if (e.getActionCommand().equals("Test")) {
                TestScheduleScreen test = new TestScheduleScreen();
            }
            if (e.getActionCommand().equals("Student Information")) {
                ImportStudentScreen studentinfo = new ImportStudentScreen();
            }
            if (e.getActionCommand().equals("Student Course")) {
                ImportStudentCourses studentcourse = new ImportStudentCourses();
            }
            if (e.getActionCommand().equals("Student")) {
                GenerateReportScreen report = new GenerateReportScreen();
            }
            if (e.getActionCommand().equals("Groups")) {
                // JOptionPane.showMessageDialog(null, "Good Bye :-)", "Confirmation", JOptionPane.INFORMATION_MESSAGE);
                Groups grp = new Groups();
            }
            if (e.getActionCommand().equals("Logout")) {
                JOptionPane.showMessageDialog(null, "Good Bye :-)", "Confirmation", JOptionPane.INFORMATION_MESSAGE);
                LoginScreen login = new LoginScreen();
            }

        }

    }

}
