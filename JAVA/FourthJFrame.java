/**
 * 
 */
package kt20141223;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * @author Administrator
 *
 */
public class FourthJFrame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame  f = new  JFrame();
	       f.setTitle("My Fourth JFrame");
	       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	       Container con = f.getContentPane();
	       //JPanel panel = new JPanel();
	       JButton butt = new JButton("Press Me");
	       //panel.add(butt);
	       //con.add(panel);
	       con.add(butt);
	       
	       f.setSize(300, 300);
	       f.setVisible(true);

	}

}
