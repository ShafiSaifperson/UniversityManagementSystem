package universitymanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.List;
public class AssignCoursesGUI extends JFrame{
    private JList<String> facultyList;
    private JList<String> courseList;
    private DefaultListModel<String> facultyModel;
    private DefaultListModel<String> courseModel;
    private JButton assignButton;
    private Map<String, List<String>> facultyCourseAssignments;

    public AssignCoursesGUI(List<FacultyInformation> faculties, String[] courses) {
        super("Assign Courses to Faculty");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        facultyCourseAssignments = new HashMap<>();

        // Faculty list setup
        facultyModel = new DefaultListModel<>();
        for (FacultyInformation faculty : faculties) {
            facultyModel.addElement(faculty.getName());
        }
        facultyList = new JList<>(facultyModel);
        facultyList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        JScrollPane facultyScrollPane = new JScrollPane(facultyList);

        // Course list setup
        courseModel = new DefaultListModel<>();
        for (String course : courses) {
            courseModel.addElement(course);
        }
        courseList = new JList<>(courseModel);
        courseList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        JScrollPane courseScrollPane = new JScrollPane(courseList);

        // Assign button
        assignButton = new JButton("Assign Courses");
        assignButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                assignCourses();
            }
        });

        // Layout setup
        JPanel listPanel = new JPanel(new GridLayout(1, 2));
        listPanel.add(new JLabel("Select Faculties:"));
        listPanel.add(new JLabel("Select Courses:"));
        listPanel.add(facultyScrollPane);
        listPanel.add(courseScrollPane);

        add(listPanel, BorderLayout.CENTER);
        add(assignButton, BorderLayout.SOUTH);
    }

    private void assignCourses() {
        List<String> selectedFaculties = facultyList.getSelectedValuesList();
        List<String> selectedCourses = courseList.getSelectedValuesList();

        if (selectedFaculties.isEmpty() || selectedCourses.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please select at least one faculty and one course.");
            return;
        }

        for (String facultyName : selectedFaculties) {
            facultyCourseAssignments.putIfAbsent(facultyName, new ArrayList<>());
            facultyCourseAssignments.get(facultyName).addAll(selectedCourses);
        }

        JOptionPane.showMessageDialog(this, "Courses assigned successfully!");
    }

    public Map<String, List<String>> getFacultyCourseAssignments() {
        return facultyCourseAssignments;
    }
}

