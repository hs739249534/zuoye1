/**
 * 
 */
package kt20141223;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

/**
 * @author Administrator
 *
 */
public class JTabbedPaneDemo extends JFrame{

	/**
	 * @param args
	 */

		   public JTabbedPaneDemo(){
			   //this.setLayout(null);
			   JTabbedPane pane  =  new JTabbedPane();
			   pane.setTabPlacement(JTabbedPane.TOP);
			   JPanel  panel1  =  new JPanel();
			   //panel1.setLayout(null);
			   JButton button1  =  new JButton("确定");
			   panel1.add(button1);
			   pane.addTab("aa", panel1);
			   
			   JPanel  panel2  =  new JPanel();
			   //panel1.setLayout(null);
			   JButton button2  =  new JButton("取消");
			   panel2.add(button2);
			   pane.addTab("bb", panel2);
			   this.getContentPane().add(pane);
			   
			   this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			   this.setSize(300, 300);
			   this.setVisible(true);
		   }
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				new JTabbedPaneDemo();
			}	

}
