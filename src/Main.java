import javax.swing.*;
import java.awt.*;

class Window extends JFrame {
    JTextField text=new JTextField(10);
    Font font=new Font("Times New Roman",Font.PLAIN,16);
    JButton button=new JButton("Испытать удачу");

    Window() {
        super("Угадайка");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(350,120);
        setVisible(true);

        text.setFont(font);

        JPanel content= new JPanel();
        content.add(new JLabel("Введите число от 0 до 20:\n"));
        content.add(text);
        content.add(button);
        setContentPane(content);
    }

}


public class Main {
    public static void main(String[] args) {
        new Window();
    }
}
