

import java.awt.EventQueue;
import javax.swing.JFrame;

public class Snake extends JFrame {

    public Snake() {
        // Initialize the user interface (UI) by adding the Board
        initUI();
    }
    
    private void initUI() {
        add(new Board());
        
        
        setResizable(false);  
        pack(); 
        
       
        setTitle("Snake Game");
      
        setLocationRelativeTo(null);
       
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        
        EventQueue.invokeLater(() -> {
            JFrame ex = new Snake();
            ex.setVisible(true);
        });
    }
}

