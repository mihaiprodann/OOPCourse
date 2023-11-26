import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class MainForm {

    public static String[] locations = {"Bucuresti", "Slatina", "Budesti", "Chiajna", "Voluntari"};

    public static ArrayList<Person> persons = new ArrayList<>();

    public static void create() {

        JFrame frame = new JFrame("Employee Management System");

        // Frame settings
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new FlowLayout(FlowLayout.LEFT));
        Box mainBox = Box.createVerticalBox();
        mainBox.setAlignmentX(Component.LEFT_ALIGNMENT);

        // Employee name
        JLabel employeeNameLabel = new JLabel("Name");
        JTextField employeeNameTextField = new JTextField();
        employeeNameTextField.setMaximumSize(new Dimension(200, 30));

        Box nameBox = Box.createHorizontalBox();
        nameBox.add(employeeNameLabel);
        nameBox.add(Box.createHorizontalStrut(10));
        nameBox.add(employeeNameTextField);
        nameBox.setAlignmentX(Component.LEFT_ALIGNMENT);


        // Employee gender
        JLabel employeeGenderLabel = new JLabel("Gender");

        ButtonGroup genderGroup = new ButtonGroup();
        JRadioButton maleGender = new JRadioButton("Male");
        JRadioButton femaleGender = new JRadioButton("Female");
        genderGroup.add(maleGender);
        genderGroup.add(femaleGender);

        Box genderBox = Box.createHorizontalBox();
        genderBox.add(employeeGenderLabel);
        genderBox.add(Box.createHorizontalStrut(10));
        genderBox.add(maleGender);
        genderBox.add(Box.createHorizontalStrut(10));
        genderBox.add(femaleGender);
        genderBox.setAlignmentX(Component.LEFT_ALIGNMENT);
        maleGender.setSelected(true);

        // Employee job description
        JLabel employeeJobDescriptionLabel = new JLabel("Job Description");
        JTextArea employeeJobDescriptionTextArea = new JTextArea(10, 20);
        employeeJobDescriptionTextArea.setLineWrap(true);
        employeeJobDescriptionTextArea.setWrapStyleWord(true);

        JScrollPane jobDescriptionScrollPane = new JScrollPane(employeeJobDescriptionTextArea);
        jobDescriptionScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        Box jobDescriptionBox = Box.createHorizontalBox();
        jobDescriptionBox.setAlignmentX(Component.LEFT_ALIGNMENT);
        jobDescriptionBox.add(employeeJobDescriptionLabel);
        jobDescriptionBox.add(Box.createHorizontalStrut(10));
        jobDescriptionBox.add(jobDescriptionScrollPane);



        // Employee experience
        JLabel employeeExperienceLabel = new JLabel("Experience in years");
        JTextField employeeExperienceTextField = new JTextField(2);

        employeeExperienceTextField.setEditable(false);

        JSlider employeeExperienceSlider = new JSlider(0, 10, 0);
        employeeExperienceSlider.setMaximumSize(new Dimension(160, 20));
        employeeExperienceSlider.setValue(1);

        employeeExperienceSlider.addChangeListener(e -> {
            employeeExperienceTextField.setText(String.valueOf(employeeExperienceSlider.getValue()));
        });

        Box experienceBox = Box.createHorizontalBox();
        experienceBox.add(employeeExperienceLabel);
        experienceBox.add(Box.createHorizontalStrut(10));
        experienceBox.add(employeeExperienceTextField);
        experienceBox.add(Box.createHorizontalStrut(10));
        experienceBox.add(employeeExperienceSlider);
        experienceBox.setAlignmentX(Component.LEFT_ALIGNMENT);


        // Employee location
        JLabel employeeLocationLabel = new JLabel("Location");
        JComboBox employeeLocationComboBox = new JComboBox();
        employeeLocationComboBox.setMaximumSize(new Dimension(200, 30));
        for (String location : locations) {
            employeeLocationComboBox.addItem(location);
        }

        Box locationBox = Box.createHorizontalBox();
        locationBox.add(employeeLocationLabel);
        locationBox.add(Box.createHorizontalStrut(10));
        locationBox.add(employeeLocationComboBox);
        locationBox.setAlignmentX(Component.LEFT_ALIGNMENT);


        // Add button
        JButton addButton = new JButton("Add");

        addButton.addActionListener(e -> {
            Person person = new Person(
                    employeeNameTextField.getText(),
                    maleGender.isSelected(),
                    employeeJobDescriptionTextArea.getText(),
                    employeeExperienceSlider.getValue(),
                    (String) employeeLocationComboBox.getSelectedItem()
            );
            persons.add(person);
            JOptionPane.showMessageDialog(frame, "Employee added successfully!");

            employeeNameTextField.setText("");
            maleGender.setSelected(true);
            employeeJobDescriptionTextArea.setText("");
            employeeExperienceSlider.setValue(1);
            employeeLocationComboBox.setSelectedIndex(0);
        });

        // Show all button
        JButton ShowAllButton = new JButton("Show All");

        ShowAllButton.addActionListener(e -> {
            for (Person person : persons) {
                System.out.println("Person #" + (persons.indexOf(person) + 1));
                System.out.println(person);
            }
        });


        JButton SaveAllButton = new JButton("Save All");

        SaveAllButton.addActionListener(e -> {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("persons.txt"))) {
                for (Person person : persons) {
                    writer.write(person.toString());
                    writer.newLine();
                }

                JOptionPane.showMessageDialog(frame, "Persons saved successfully!");
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });

        Box buttonBox = Box.createHorizontalBox();
        buttonBox.add(addButton);
        buttonBox.add(Box.createHorizontalStrut(10));
        buttonBox.add(ShowAllButton);
        buttonBox.add(Box.createHorizontalStrut(10));
        buttonBox.add(SaveAllButton);
        buttonBox.setAlignmentX(Component.LEFT_ALIGNMENT);


        // Add all boxes to the main box
        mainBox.add(Box.createVerticalStrut(10));
        mainBox.add(nameBox);
        mainBox.add(Box.createVerticalStrut(10));
        mainBox.add(genderBox);
        mainBox.add(Box.createVerticalStrut(10));
        mainBox.add(jobDescriptionBox);
        mainBox.add(Box.createVerticalStrut(10));
        mainBox.add(experienceBox);
        mainBox.add(Box.createVerticalStrut(10));
        mainBox.add(locationBox);
        mainBox.add(Box.createVerticalStrut(10));
        mainBox.add(buttonBox);

        // Display the frame
        frame.add(mainBox);
        frame.setVisible(true);
    }

}