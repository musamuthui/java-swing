import javax.swing.*;

public class MyWindow {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Frame Demo");

        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.getContentPane().add(emptyLabel, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }
}



