/**
 * 
 */
package kt20141223;

import javax.swing.JFrame;

/**
 * @author Administrator
 *
 */
public class SecondJFrame   extends  JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3434567290472466606L;

	/**
	 * @param args
	 */
	public  SecondJFrame() {
	       super("My Second JFrame");
	       setDefaultCloseOperation(EXIT_ON_CLOSE);
	       setExtendedState(MAXIMIZED_BOTH);
	       setVisible(true);
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SecondJFrame  f = new  SecondJFrame();
	}

}
