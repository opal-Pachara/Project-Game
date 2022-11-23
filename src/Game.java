package src;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Game extends JPanel implements ActionListener {

    Timer loop;
    Player player;
    ControlEnemy c;

    public Game() {
        loop = new Timer(10, this);
        loop.start();
        player = new Player(100, 100);
        c = new ControlEnemy();
        //Constructor
        addKeyListener(new Keyinput(player));
        //move
        setFocusable(true);
//        System.out.println("Testgame");
    }

    //How to draw Graphics
    @Override
    public void paint(Graphics g) {
        super.paint(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        Graphics2D g2d = (Graphics2D) g;
        player.draw(g2d);
        g2d.setColor(Color.PINK);
        g2d.fillRect(0, 0, ProjectGame.width, ProjectGame.hight);
        player.draw(g2d);
        c.draw(g2d);
        g2d.setColor(Color.BLACK);
        g2d.setFont(new Font("Tahoma", Font.BOLD, 20));
        g2d.drawString("Your score:" + Player.score, 490, 20);
//        enemy.draw(g2d);
//        g2d.drawString("Game",100,100);
//        g2d.drawRect(150,150,32,32);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        player.update();
        c.update();
//        enemy.update();
        repaint();
//        System.out.println("Loop");
    }

}