package src;
import javax.swing.*;

public class ProjectGame extends JFrame{
//GUI
    public static final int width=640;
    public static final int hight=480;
    public static void main(String[] args) {
        JFrame window=new JFrame("Hit That ball");
        window.setSize(width,hight);
        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        window.setVisible(true);
        window.setLocationRelativeTo(null);
        window.add(new Game());
        window.setVisible(true);
    }
}
