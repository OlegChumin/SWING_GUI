package gui_003;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 В этой программе добавлено две панели для размещения кнопок. Первая панель buttonPanel1 содержит вертикальный ряд из
 5 кнопок и размещается в северной части основной панели buttonsPanel. Вторая панель buttonPanel2 содержит
 горизонтальный ряд из 4 кнопок и размещается в западной части основной панели buttonsPanel.

 Затем панель buttonsPanel добавляется в центральную панель окна методом getContentPane().add(buttonsPanel,
 BorderLayout.CENTER);.

 Для того, чтобы первая кнопка горизонтального ряда начиналась от левого верхнего угла вертикального ряда,
 вторая панель buttonPanel2 размещается на западе основной панели buttonsPanel.

 Также добавлен код для расположения окна по центру экрана в пропорциях около 30% от экрана.
 * */

public class CenteredWindowWithButtons {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Window with buttons");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Создаем вертикальный ряд из 5 кнопок
        JPanel buttonPanel1 = new JPanel();
        for (int i = 1; i <= 5; i++) {
            buttonPanel1.add(new JButton("Button " + i));
        }

        // Создаем горизонтальный ряд из 4 кнопок
        JPanel buttonPanel2 = new JPanel();
        for (int i = 1; i <= 4; i++) {
            buttonPanel2.add(new JButton("Button " + (i + 5)));
        }

        // Создаем панель для размещения кнопок
        JPanel buttonsPanel = new JPanel(new BorderLayout());
        buttonsPanel.add(buttonPanel1, BorderLayout.NORTH);
        buttonsPanel.add(buttonPanel2, BorderLayout.WEST);

        // Добавляем панель с кнопками на центральную панель окна
        frame.getContentPane().add(buttonsPanel, BorderLayout.CENTER);

        // Определяем размеры окна как 30% от размеров экрана
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = (int) (screenSize.width * 0.3);
        int height = (int) (screenSize.height * 0.3);
        frame.setSize(width, height);

        // Располагаем окно по центру экрана
        int x = (screenSize.width - width) / 2;
        int y = (screenSize.height - height) / 2;
        frame.setLocation(x, y);

        frame.setVisible(true);
    }
}
