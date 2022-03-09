import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.text.AttributeSet.ColorAttribute;

class TrafficLight extends JFrame implements ActionListener {
    Color clr = new Color(0f,0f,0f,0f);
    private JLabel label;
    private JRadioButton r1, r2, r3;
    private ButtonGroup bg;
    private Container c;

    public TrafficLight(String name) {
        super(name);
        setLayout(new FlowLayout());
        c = getContentPane();
        label = new JLabel("Traffic Light");
        r1 = new JRadioButton("RED");
        r2 = new JRadioButton("GREEN");
        r3 = new JRadioButton("YELLOW");
        bg = new ButtonGroup();
        c.add(label);
        c.add(r1);
        c.add(r2);
        c.add(r3);
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);
        r1.addActionListener(this);
        r2.addActionListener(this);
        r3.addActionListener(this);
        setSize(400, 400);
        setVisible(true);
        c.setBackground(Color.pink);
    }

    public void actionPerformed(ActionEvent ie) {
        String msg = ie.getActionCommand();
        if (msg.equals("RED")) {
            clr = Color.RED;
        } else if (msg.equals("GREEN")) {
            clr = Color.GREEN;
        } else if (msg.equals("YELLOW")) {
            clr = Color.YELLOW;
        }
        repaint();
    }

    public void paint(Graphics g) {
        g.setColor(clr);
        g.fillOval(150, 150, 100, 100); 
    }

    public static void main(String args[]) {
        TrafficLight light = new TrafficLight("Traffic Light");
        light.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}