package userApp;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class StrengthFrame extends JFrame implements ActionListener {
    private Container c;
    private JLabel title;
    private JLabel label;
    private JLabel setting;
    private JButton low;
    private JButton med;
    private JButton high;
    public User user;
    private String userName;


    public StrengthFrame(User userSent) throws IOException {
        user = userSent;
        userName = userSent.getName();
        setTitle("Exoskeleton Arm");
        setBounds(300, 90, 520, 450);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        c = getContentPane();
        c.setBackground(Color.decode("#dce1f7"));
        c.setLayout(null);

        // TITLE
        if (userSent.getName() != null) {
            title = new JLabel(userName+"'s Strength Setting");
        }
        else {
            title = new JLabel("Strength Setting");
        }
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setSize(500, 40);
        title.setLocation(100, 50);
        c.add(title);

        setting = new JLabel(String.valueOf(user.getStrengthSetting()));
        setting.setFont(new Font("Arial", Font.PLAIN, 30));
        setting.setSize(500, 40);
        setting.setLocation(200, 100);
        c.add(setting);

        // LABEL
        label = new JLabel("How much strength assistance do you require?");
        label.setFont(new Font("Arial", Font.PLAIN, 20));
        label.setSize(500, 40);
        label.setLocation(50, 175);
        c.add(label);

        low = new JButton("a little");
        low.setFont(new Font("Arial", Font.PLAIN, 20));
        low.setSize(100, 75);
        low.setLocation(100, 250);
        low.addActionListener(this);
        med = new JButton("some");
        med.setFont(new Font("Arial", Font.PLAIN, 20));
        med.setSize(100, 75);
        med.setLocation(200, 250);
        med.addActionListener(this);
        high = new JButton("a lot");
        high.setFont(new Font("Arial", Font.PLAIN, 20));
        high.setSize(100, 75);
        high.setLocation(300, 250);
        high.addActionListener(this);
        low.addActionListener(this);
        med.addActionListener(this);
        high.addActionListener(this);
        c.add(low);
        c.add(med);
        c.add(high);

        setVisible(true);
    }

    public void updateSetting() {
        setting.setText(user.getStrengthSetting());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object choice = e.getSource();
        String setting;
        if (choice == low) {
            user.setStrengthSetting(0);
        }
        else if (choice == high) {
            user.setStrengthSetting(2);
        }
        else {
            user.setStrengthSetting(1);
        }
        updateSetting();
        if (user.getName() != null) {
           // JOptionPane.showMessageDialog(null, user.getName()+", your strength setting is now "+setting);
        }
        else {
           // JOptionPane.showMessageDialog(null, "Strength setting: "+setting);
        }

        //System.exit(0);
    }
}
