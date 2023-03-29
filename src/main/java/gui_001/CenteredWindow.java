package gui_001;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 В данном коде используется класс Dimension из библиотеки java.awt, который позволяет получать размер экрана.
 Метод getScreenSize() возвращает объект Dimension, содержащий размеры экрана. Затем размер окна вычисляется как 25% от
 размеров экрана, а координаты расположения окна вычисляются так, чтобы оно было по центру экрана. Наконец, создается
 объект JFrame из библиотеки javax.swing, который представляет собой графическое окно.
 * */

public class CenteredWindow {

    public static void main(String[] args) {
        // Получаем размер экрана
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;

        // Вычисляем размер окна
        int windowWidth = screenWidth / 4;
        int windowHeight = screenHeight / 4;

        // Создаем окно
        JFrame frame = new JFrame("Мое окно");
        frame.setSize(windowWidth, windowHeight);

        // Вычисляем координаты, чтобы окно было по центру экрана
        int x = (screenWidth - windowWidth) / 2;
        int y = (screenHeight - windowHeight) / 2;
        frame.setLocation(x, y);

        // Завершение работы программы при закрытии окна
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Делаем окно видимым
        frame.setVisible(true);
    }
}
