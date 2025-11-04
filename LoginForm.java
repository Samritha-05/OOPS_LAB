package exp10gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 


public class LoginForm extends JFrame implements ActionListener {

    JTextField txtUser;
    JPasswordField txtPass;
    JButton btnLogin;

    public LoginForm() {
        setTitle("Swing Application");
        setSize(400, 250);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel lblUser = new JLabel("Username");
        lblUser.setBounds(50, 50, 100, 30);
        add(lblUser);
        txtUser = new JTextField();
        txtUser.setBounds(150, 50, 150, 30);
        add(txtUser);

        JLabel lblPass = new JLabel("Password");
        lblPass.setBounds(50, 100, 100, 30);
        add(lblPass);
        txtPass = new JPasswordField();
        txtPass.setBounds(150, 100, 150, 30);
        add(txtPass);

 


        btnLogin = new JButton("Login");
        btnLogin.setBounds(150, 150, 80, 30);
        add(btnLogin);
        btnLogin.addActionListener(this);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String username = txtUser.getText();
        String password = new String(txtPass.getPassword());

        if (username.equals("URK24CS6011") && password.equals("123456")) {
            JOptionPane.showMessageDialog(this, "Login Successful!");
        } else {
            JOptionPane.showMessageDialog(this, "Login Failed!");
        }
    }
    public static void main(String[] args) {
        new LoginForm();
    }
}



