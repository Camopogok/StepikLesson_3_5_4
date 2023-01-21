import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class Main {
    public Main() {
        JFrame frame = new JFrame("Пробел");
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setSize(200,200);
        frame.setLocation(400,300);
        frame.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                UIManager.put("OptionPane.yesButtonText", "Да");
                UIManager.put("OptionPane.noButtonText", "Нет");
                if (e.getKeyCode()==KeyEvent.VK_SPACE) {
                    int answer = JOptionPane.showConfirmDialog(null,"Тебя зовут Марта?", "Первый вопрос", JOptionPane.YES_NO_OPTION);
                    if (answer == JOptionPane.YES_OPTION){
                        int answer2 = JOptionPane.showConfirmDialog(null, "У тебя выходной?", "Второй вопрос", JOptionPane.YES_NO_OPTION);
                        if (answer2 == JOptionPane.YES_OPTION) {
                            JOptionPane.showMessageDialog(null,"Хорошего отдыха!");
                        } else {
                            JOptionPane.showMessageDialog(null,"Держись");
                        }
                    } else {
                        int answer3 = JOptionPane.showConfirmDialog(null, "Дима?", "Второй вопрос", JOptionPane.YES_NO_OPTION);
                        if (answer3 == JOptionPane.YES_OPTION) {
                            JOptionPane.showMessageDialog(null,"Чего не кодишь???");
                        } else {
                            JOptionPane.showMessageDialog(null,"Кто ты???");
                        }
                    }
                }
            }
        });
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }
}
