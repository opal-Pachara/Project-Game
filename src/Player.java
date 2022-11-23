package src;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.util.LinkedList;

// Player design
public class Player {
    private int x;
    private int y;
    private int speedx = 0;
    private int speedy = 0;
    private LinkedList<Enemy> e = ControlEnemy.getEnemyBounds();
    public static int score = 0;
    // private Object g2d;

    public Player(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // method movement player
    public void update() {
        x += speedx;
        y += speedy;
        //check frame
        if (x <= 0) {
            x = 0;
        }
        if (y <= 0) {
            y = 0;
        }
        if (x > 595) {
            x = 595;
        }
        if (y > 410) {
            y = 410;
        }
        colision();
    }

    //draw player
    public void draw(Graphics2D g2d) {
        g2d.setColor(Color.BLACK);
        g2d.fillRect(x, y, 32, 32);
        g2d.draw(getBounds());
    }

    public void KeyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_RIGHT) {
            speedx = 5;
        }
        if (key == KeyEvent.VK_LEFT) {
            speedx = -5;
        }
        if (key == KeyEvent.VK_DOWN) {
            speedy = 5;
        }
        if (key == KeyEvent.VK_UP) {
            speedy = -5;
        }
    }

    public void KeyReleased(KeyEvent e) {
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_RIGHT) {
            speedx = 0;
        }
        if (key == KeyEvent.VK_LEFT) {
            speedx = 0;
        }
        if (key == KeyEvent.VK_DOWN) {
            speedy = 0;
        }
        if (key == KeyEvent.VK_UP) {
            speedy = 0;
        }
    }
    public Rectangle getBounds() {
        return new Rectangle(x, y, 32, 32);
    }
    //chcek hit Enemy & Player
    public void colision() {
        for (int i = 0; i < e.size(); i++) {
            if (getBounds().intersects(e.get(i).getBounds())) {
                e.remove(i);
                score++;
            }
        }
    }
}