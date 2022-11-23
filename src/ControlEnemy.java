package src;
import java.awt.Graphics2D;
import java.util.LinkedList;

public class ControlEnemy {

    static LinkedList<Enemy> e = new LinkedList<>();
    Enemy temp;

    public ControlEnemy() {
        addEnemy(new Enemy(150, 150));
        addEnemy(new Enemy(250, 300));
        addEnemy(new Enemy(300, 300));
        addEnemy(new Enemy(350, 350));
        addEnemy(new Enemy(390, 390));
        addEnemy(new Enemy(150, 200));
        addEnemy(new Enemy(190, 180));
    }

    //draw multri Enemy
    public void draw(Graphics2D g2d) {
        for (int i = 0; i < e.size(); i++) {
            temp = e.get(i);
            temp.draw(g2d);
        }
    }

    public void update() {
        for (int i = 0; i < e.size(); i++) {
            temp = e.get(i);
            temp.update();
        }
    }

    public void addEnemy(Enemy enemy) {
        e.add(enemy);
    }

    public void removeEnemy(Enemy enemy) {
        e.remove(enemy);
    }

    // get Area Enemy
    public static LinkedList<Enemy> getEnemyBounds() {
        return e;
    }
}