
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.Shape;

public class LoginFrame extends JFrame implements ActionListener {

    Container container = getContentPane();
    JLabel title = new JLabel("Welcome to the Exoskeleton Arm");
    JLabel userLabel = new JLabel("USERNAME");
    JLabel passwordLabel = new JLabel("PASSWORD");
    JTextField userTextField = new JTextField();
    JPasswordField passwordField = new JPasswordField();
    JButton loginButton = new JButton("LOGIN");
    JButton newUserButton = new JButton("NEW USER");
    JButton guestButton = new JButton("USE AS GUEST");
    JCheckBox showPassword = new JCheckBox("Show Password");


    LoginFrame() {
        setLayoutManager();
        setLocationAndSize();
        addComponentsToContainer();
        addActionEvent();
        setTitle("Exoskeleton Arm");
        setVisible(true);
    }

    public void setLayoutManager() {
        container.setBackground(Color.decode("#dce1f7"));
        container.setLayout(null);
    }

    public void setLocationAndSize() {
        setBounds(300, 90, 520, 450);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        title.setBounds(100, 80, 300, 50);
        title.setFont(new Font("Arial",Font.PLAIN,20));
        userLabel.setBounds(120, 150, 100, 30);
        passwordLabel.setBounds(120, 220, 100, 30);
        userTextField.setBounds(220, 150, 150, 30);
        passwordField.setBounds(220, 220, 150, 30);
        showPassword.setBounds(150, 250, 150, 30);
        loginButton.setBounds(150, 280, 200, 30);
        newUserButton.setBounds(150, 320, 200, 30);
        guestButton.setBounds(150, 350, 200, 30);


    }

    public void addComponentsToContainer() {
        container.add(title);
        container.add(userLabel);
        container.add(passwordLabel);
        container.add(userTextField);
        container.add(passwordField);
       // container.add(showPassword);
        container.add(loginButton);
        container.add(newUserButton);
        container.add(guestButton);
    }

    public void addActionEvent() {
        loginButton.addActionListener(this);
        newUserButton.addActionListener(this);
        guestButton.addActionListener(this);
        showPassword.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            String userText;
            char[] pwdText;
            userText = userTextField.getText();
            pwdText = passwordField.getPassword();

            try {
                StrengthFrame next = new StrengthFrame(new User(userText,pwdText.toString()));
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }

        }
        if (e.getSource() == newUserButton) {
            try {
                NameFrame instance = new NameFrame();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }
        if (e.getSource() == guestButton) {
            User guest = new User();
            try {
                StrengthFrame instance = new StrengthFrame(guest);
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }
        if (e.getSource() == showPassword) {
            if (showPassword.isSelected()) {
                passwordField.setEchoChar((char) 0);
            } else {
                passwordField.setEchoChar('*');
            }


        }
    }
    
    public void windowClosing(ActionEvent e) {
    	System.out.println("HELLO");
    }

}
class Login {
    public static void main(String[] a) {
        LoginFrame frame = new LoginFrame();
        frame.setTitle("Login Form");
        frame.setVisible(true);
        frame.setBounds(10, 10, 370, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

    }

}