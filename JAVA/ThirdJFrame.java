/**
 * 
 */
package kt20141223;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 * @author Administrator
 *
 */
public class ThirdJFrame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImageIcon ii = new ImageIcon("x.gif");//项目根目录
	    Image image = ii.getImage();
		JFrame  f = new  JFrame();
	    f.setTitle("My Third JFrame");
	    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    f.setSize(300, 300);	    
	    f.setIconImage(image);
	    f.setVisible(true);
	}

}
