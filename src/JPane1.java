import java.awt.*;
import javax.swing.*;

public class JPane1 extends JPanel {
	
	public void paintComponent(Graphics g) {
		
		g.setColor(Color.orange);
		
		g.fillRect(20, 50, 100, 100);
	}
}
