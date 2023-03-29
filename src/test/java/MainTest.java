import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import java.awt.*;
import javax.swing.*;

public class MainTest {

    @Test
    public void testButton7Width() {
        JButton button7 = new JButton("Button   7");
        button7.setPreferredSize(new Dimension(87, 30));
        assertEquals(87, button7.getPreferredSize().width, "Button 7 width should be 87");
    }

    @Test
    public void testButtonSpacing() {
        JButton button7 = new JButton("Button   7");
        button7.setPreferredSize(new Dimension(87, 30));
        Component horizontalStrut = Box.createHorizontalStrut(button7.getPreferredSize().width);

        JButton button1 = new JButton("Button   1");
        JButton button2 = new JButton("Button   2");
        JButton button3 = new JButton("Button   3");
        JButton button4 = new JButton("Button   4");
        JButton button5 = new JButton("Button   5");
        JButton button6 = new JButton("Button   6");
        JButton button8 = new JButton("Button   8");
        JButton button9 = new JButton("Button   9");
        JButton button10 = new JButton("Button 10");
        JButton button11 = new JButton("Button 11");
        JButton button12 = new JButton("Button 12");
        JButton button13 = new JButton("Button 13");
        JButton button14 = new JButton("Button 14");

        JPanel panel1 = new JPanel();
        panel1.setLayout(new BoxLayout(panel1, BoxLayout.X_AXIS));
        panel1.add(button1);
        panel1.add(horizontalStrut);
        panel1.add(button2);
        panel1.add(horizontalStrut);
        panel1.add(button3);
        panel1.add(horizontalStrut);
        panel1.add(button4);
        panel1.add(horizontalStrut);
        panel1.add(button5);
        panel1.add(horizontalStrut);
        panel1.add(button6);

        JPanel panel2 = new JPanel();
        panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));
        panel2.add(button7);
        panel2.add(button8);
        panel2.add(button9);
        panel2.add(button10);
        panel2.add(button11);
        panel2.add(button12);
        panel2.add(button13);
        panel2.add(button14);

        JFrame frame = new JFrame();
        frame.add(panel1, BorderLayout.NORTH);
        frame.add(panel2, BorderLayout.CENTER);
        frame.pack();

        int expectedSpacing = button7.getPreferredSize().width;
        int actualSpacing = button2.getLocation().x - button1.getLocation().x - button1.getWidth();
        assertEquals(expectedSpacing, actualSpacing, "Buttons should be spaced by " + expectedSpacing + " pixels");
    }
}
