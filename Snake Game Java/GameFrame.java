import javax.swing.JFrame;

public class GameFrame extends JFrame { 
    /*
    this is a frame creation library which has methods for creating frames of Desktop applications 
    */
    GameFrame() { 
        
        this.add(new GamePanel());
        this.setTitle("SnakeGame");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        
    }
}
