package src;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

//control Event keyborad
public class Keyinput extends KeyAdapter{
    Player p;
    
    public Keyinput(Player p){
        this.p = p;
    }
    @Override
    public void keyPressed(KeyEvent e) {
        p.KeyPressed(e);
    }
    @Override
    public void keyReleased(KeyEvent e) {
    p.KeyReleased(e);
    }
}
