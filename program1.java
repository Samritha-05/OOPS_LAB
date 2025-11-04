package exp10gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class program1 extends JFrame implements ActionListener {
    JTextField txtName;
    JRadioButton rMale, rFemale;
    JCheckBox cApple, cSamsung, cRedmi, cOnePlus;
    JComboBox<String> colorBox;
    JButton btnSave;

    public program1() {
        setTitle("Register");
        setSize(400, 350);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

 



        JLabel lblName = new JLabel("Name:");
        lblName.setBounds(40, 30, 60, 20);
        add(lblName);

        txtName = new JTextField();
        txtName.setBounds(120, 30, 150, 25);
        add(txtName);

        JLabel lblGender = new JLabel("Gender:");
        lblGender.setBounds(40, 70, 80, 20);
        add(lblGender);

        rMale = new JRadioButton("Male");
        rFemale = new JRadioButton("Female");
        rMale.setBounds(120, 70, 60, 20);
        rFemale.setBounds(180, 70, 80, 20);

        ButtonGroup bg = new ButtonGroup();
        bg.add(rMale);
        bg.add(rFemale);

        add(rMale);
        add(rFemale);

        JLabel lblModel = new JLabel("Model:");
        lblModel.setBounds(40, 110, 80, 20);
        add(lblModel);

        cApple = new JCheckBox("Apple");
        cSamsung = new JCheckBox("Samsung");
        cRedmi = new JCheckBox("Redmi");
        cOnePlus = new JCheckBox("OnePlus");

        cApple.setBounds(120, 110, 70, 20);
        cSamsung.setBounds(190, 110, 80, 20);

 



        cRedmi.setBounds(120, 140, 70, 20);
        cOnePlus.setBounds(190, 140, 80, 20);

        add(cApple); add(cSamsung); add(cRedmi); add(cOnePlus);

        JLabel lblColor = new JLabel("Color:");
        lblColor.setBounds(40, 180, 80, 20);
        add(lblColor);

        String colors[] = {"Black", "White", "Blue", "Red"};
        colorBox = new JComboBox<>(colors);
        colorBox.setBounds(120, 180, 150, 25);
        add(colorBox);

        btnSave = new JButton("Save");
        btnSave.setBounds(150, 230, 80, 30);
        add(btnSave);

        btnSave.addActionListener(this);

        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {

        String name = txtName.getText();
        String gender = rMale.isSelected() ? "Male" : "Female";
        String models = "";
        if (cApple.isSelected()) models += "Apple ";
        if (cSamsung.isSelected()) models += "Samsung ";
        if (cRedmi.isSelected()) models += "Redmi ";
        if (cOnePlus.isSelected()) models += "OnePlus ";

        String color = (String) colorBox.getSelectedItem();


 



        new DisplayFrame(name, gender, models, color);
    }

    public static void main(String[] args) {
        new program1();
    }
}

class DisplayFrame extends JFrame {

    public DisplayFrame(String name, String gender, String model, String color) {

        setTitle("Display");
        setSize(350, 250);
        setLayout(new FlowLayout());

        JLabel lbl = new JLabel("<html>Name: " + name +
                "<br>Gender: " + gender +
                "<br>Model: " + model +
                "<br>Color: " + color + "</html>");

        JButton ok = new JButton("OK");
        ok.addActionListener(e -> dispose());

        add(lbl);
        add(ok);

        setVisible(true);
    }
}



