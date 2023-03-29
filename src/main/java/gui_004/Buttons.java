package gui_004;

import javax.swing.*;
import java.awt.*;

public class Buttons {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Рассчитываем размер окна
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = (int) (screenSize.width * 0.3);
        int height = (int) (screenSize.height * 0.3);
        int x = (screenSize.width - width) / 2;
        int y = (screenSize.height - height) / 2;
        frame.setBounds(x, y, width, height);

        // Создаем кнопки
        JButton button1 = new JButton("Button   1");
        JButton button2 = new JButton("Button   2");
        JButton button3 = new JButton("Button   3");
        JButton button4 = new JButton("Button   4");
        JButton button5 = new JButton("Button   5");
        JButton button6 = new JButton("Button   6");
        JButton button7 = new JButton("Button   7");
        JButton button8 = new JButton("Button   8");
        JButton button9 = new JButton("Button   9");
        JButton button10 = new JButton("Button 10");
        JButton button11 = new JButton("Button 11");
        JButton button12 = new JButton("Button 12");
        JButton button13 = new JButton("Button 13");
        JButton button14 = new JButton("Button 14");

// Создаем пустую панель-отступ для добавления между кнопками
        Component horizontalStrut = Box.createHorizontalStrut(button7.getPreferredSize().width);

// Создаем панели
        JPanel panel1 = new JPanel();
        panel1.setLayout(new BoxLayout(panel1, BoxLayout.X_AXIS));
        panel1.add(button1);
        panel1.add(horizontalStrut); // добавляем отступ между кнопками
        panel1.add(button2);
        panel1.add(horizontalStrut); // добавляем отступ между кнопками
        panel1.add(button3);
        panel1.add(horizontalStrut); // добавляем отступ между кнопками
        panel1.add(button4);
        panel1.add(horizontalStrut); // добавляем отступ между кнопками
        panel1.add(button5);
        panel1.add(horizontalStrut); // добавляем отступ между кнопками
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

        /**
         BoxLayout - это менеджер компоновки, который располагает компоненты в одну строку или столбец, в зависимости
         от заданной оси. Основное его свойство - это возможность выравнивания компонентов по оси, которое можно
         настроить при создании.

         BoxLayout используется для создания простых интерфейсов пользователя, когда нужно выравнивать компоненты по
         горизонтали или вертикали.

         При использовании BoxLayout все компоненты имеют одинаковый размер вдоль оси, по которой они располагаются,
         кроме случаев, когда это противоречит установленному выравниванию. Также BoxLayout позволяет задавать
         промежутки между компонентами, чтобы улучшить внешний вид интерфейса.

         BoxLayout поддерживает следующие выравнивания:

         CENTER - компоненты выравниваются по центру;
         TOP - компоненты выравниваются по верхней границе;
         BOTTOM - компоненты выравниваются по нижней границе;
         LEFT - компоненты выравниваются по левой границе;
         RIGHT - компоненты выравниваются по правой границе.
         BoxLayout можно использовать в качестве менеджера компоновки для контейнеров JPanel, JWindow, JDialog и JFrame.
         */

        // Добавляем панели в окно
        frame.add(panel1, BorderLayout.NORTH);
        frame.add(panel2, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}
