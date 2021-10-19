import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class GUI implements ActionListener, KeyListener {

    private int count = 0;
    private JFrame frame;
    private JPanel panel;
    private JTextField textField;
    private JLabel lInstructions;
    private JLabel lCount;

    public GUI() {
        frame = new JFrame();

        lInstructions = new JLabel("Type here:");
        lCount = new JLabel("Inputs: 0");
        textField = new JTextField(20);
        textField.addKeyListener(this);
//        textField.addActionListener(this);

        panel = new JPanel();
        panel.setBorder(BorderFactory
                .createEmptyBorder(30,30,10,30));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(lInstructions);
        panel.add(textField);
        panel.add(lCount);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Typing Speed");
        frame.pack();
        frame.setVisible(true);
    } // end GUI()

    public static void main(String[] args) {
        new GUI();
    } // end main(String[])

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        lCount.setText("Inputs: " + count);
    } // end actionPerformed(ActionEvent)

    public void keyTyped(KeyEvent e) {
//        count++;
//        lCount.setText("Inputs: " + count);
    } // end keyTyped(KeyEvent)

    public void keyPressed(KeyEvent e) {
        count++;
        lCount.setText("Inputs: " + count);
    } // end keyPressed(KeyEvent)

    public void keyReleased(KeyEvent e) {
//        count++;
//        lCount.setText("Inputs: " + count);
    } // end keyReleased(KeyEvent)
} // end Main
