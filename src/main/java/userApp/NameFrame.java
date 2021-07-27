
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Arrays;

public class NameFrame extends JFrame implements ActionListener {
    private Container c;
    private JLabel title = new JLabel("New User Profile");
    private JLabel name;
    private JTextField tname;
    private JLabel password;
    private JPasswordField tpassword;
    private JLabel confPassword;
    private JPasswordField tConfPassword;
    private JButton save;
    private JButton cancel;
    private JLabel iconLbl;
    private BufferedImage userIcon;
    private String inputName;
    private char[] inputPassword;
    private char[] inputConfPassword;
    private User user;

    public NameFrame() throws IOException {
        setTitle("Exoskeleton Arm");
        setBounds(300, 90, 520, 450);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        c = getContentPane();
        c.setBackground(Color.decode("#dce1f7"));
        c.setLayout(null);

        // TITLE
        title.setBounds(175, 80, 300, 50);
        title.setFont(new Font("Arial",Font.PLAIN,20));
        c.add(title);
        // NAME
        name = new JLabel("NAME");
        name.setBounds(150, 150, 100, 30);
        c.add(name);
        // USER ENTERS NAME
        tname = new JTextField();
        tname.setBounds(220, 150, 150, 30);
        c.add(tname);
        // PASSWORD
        password = new JLabel("PASSWORD");
        password.setBounds(120, 200, 100, 30);
        c.add(password);
        // USER ENTERS PASSWORD
        tpassword = new JPasswordField();
        tpassword.setBounds(220, 200, 150, 30);
        c.add(tpassword);
        // CONFIRM PASSWORD
        confPassword = new JLabel("CONFIRM PASSWORD");
        confPassword.setBounds(70, 250, 150, 30);
        c.add(confPassword);
        // USER ENTERS PASSWORD CONFIRMATION
        tConfPassword = new JPasswordField();
        tConfPassword.setBounds(220, 250, 150, 30);
        c.add(tConfPassword);
        // SAVE
        save = new JButton("Save");
        save.setBounds(150, 300, 200, 30);
        save.addActionListener(this);
        c.add(save);
        // CANCEL
        cancel = new JButton("Cancel");
        cancel.setBounds(150, 340, 200, 30);
        cancel.addActionListener(this);
        c.add(cancel);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == save) {
            inputName = tname.getText();
            inputPassword = tpassword.getPassword();
            inputConfPassword = tConfPassword.getPassword();

            if (inputName.equals("") || inputPassword.equals("") || inputConfPassword.equals("")) {
                JOptionPane.showMessageDialog(this, "Both fields are required.");
            }
            else if (!(Arrays.equals(inputPassword, inputConfPassword))) {
                JOptionPane.showMessageDialog(this, "Passwords do not match.");
                tpassword.setText("");
                tConfPassword.setText("");
            }
            else {
                user = new User(inputName, inputPassword.toString());
                StrengthFrame strengthSetting;
                try {
                    strengthSetting = new StrengthFrame(user);
                    strengthSetting.setVisible(true);
                    this.setVisible(false);
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }

                //  System.exit(0);
            }
        }
        else if (e.getSource() == cancel) {
            this.setVisible(false);
        }
    }
}
