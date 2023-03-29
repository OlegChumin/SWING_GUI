package gui_002;

import javax.swing.*;
import java.awt.*;

/**
 В этом коде мы создаем две панели - leftPanel и topPanel, в которые добавляем кнопки. Затем мы добавляем leftPanel
 на запад (лево) окна с помощью BorderLayout.WEST, а topPanel на север (верх) окна с помощью BorderLayout.NORTH.
 */

public class CenteredWindowWithButtons {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            // Создаем главное окно
            JFrame frame = new JFrame("Centered Window");
            // Задаем размер окна
            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            int width = screenSize.width / 4;
            int height = screenSize.height / 4;
            frame.setPreferredSize(new Dimension(width, height));
            // Устанавливаем положение окна по центру экрана
            frame.setLocationRelativeTo(null);
            // Добавляем 4 кнопки слева
            JPanel leftPanel = new JPanel(new GridLayout(4, 1));
            for (int i = 1; i <= 4; i++) {
                JButton button = new JButton("Button " + i);
                leftPanel.add(button);
            }
            frame.add(leftPanel, BorderLayout.WEST);
            // Добавляем 5 кнопок сверху
            JPanel topPanel = new JPanel(new GridLayout(1, 5));
            for (int i = 1; i <= 5; i++) {
                JButton button = new JButton("Button " + i);
                topPanel.add(button);
            }
            frame.add(topPanel, BorderLayout.NORTH);
            // Закрываем окно при нажатии на крестик
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            // Отображаем окно
            frame.pack();
            frame.setVisible(true);
        });
    }
}
