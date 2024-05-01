
import  javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int boardWidth = 360;
        int boardHeight = 640;

        JFrame frame = new JFrame("Flappy Bird");
//        frame.setVisible(true);
        frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null); /// By this the screen come on center
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); /// By this when click on X then close the program

        FlappyBird flappyBird = new FlappyBird();
        frame.add(flappyBird);
        frame.pack();
        flappyBird.requestFocus();
        frame.setVisible(true);

    }
}