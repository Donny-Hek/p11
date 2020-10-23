import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Window extends JFrame {
    private JTextField text=new JTextField("",2);
    private JButton button=new JButton("Испытать удачу");
    private int num, counter=0;

    Window() { //просто страница, где есть поле для ввода и кнопка.Без функционала
        super("Угадайка");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(350,120);
        setVisible(true);

        JPanel content= new JPanel();
        content.add(new JLabel("Введите число от 0 до 20:\n"));
        content.add(text);
        content.add(button);
        setContentPane(content);
        Random random=new Random();
        num=random.nextInt(21);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String message = null;
                String val=text.getText();
                int myNum=Integer.parseInt(val);

                if (myNum != num && counter<2) {
                        if(myNum>num) message="Твое число больше загаданного";
                        else message="Твое число меньше загаданного";
                        JOptionPane.showMessageDialog(null,message);
                        counter++;
                        text.setText("");
                    } else {
                    if (myNum == num) message = "Ты очень удачлив! Поздравляю)";
                    else message = "Увы, ты проиграл(";
                    JOptionPane.showMessageDialog(null, message);
                    remove(text);
                    remove(button);
                }
            }
        });
    }
}
