package src;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Enemy {
    //drawEnemy
    //Encapsulation
    private int x, y;
    private int speedx = 5;
    public Enemy(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void draw(Graphics2D g2d) {
        g2d.setColor(Color.RED);
        g2d.fillRect(x, y, 32, 32);
    }

    public void update() {
        x += speedx;
        if (x > ProjectGame.width - 40) {
            speedx = -5;
        }
        if (x < 0) {
            speedx = 5;
        }
    }
    public Rectangle getBounds() {
        return new Rectangle(x, y, 32, 32);
    }
}