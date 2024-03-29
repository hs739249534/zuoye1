/**
 * 
 */
package kt20141223;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
/**
 * @author Administrator
 *
 */
public class SplitPaneDemo  extends JFrame implements ActionListener{

	/**
	 * @param args
	 */	
	private static final long serialVersionUID = 1L;
	int orie; //标记方向
	JSplitPane jsp;
	JPanel p1,p2,p3;
	JButton bt;

	public SplitPaneDemo()  {
	p1=new JPanel();
	p2=new JPanel();
	p3=new JPanel();
	bt=new JButton("change orientation");
	jsp=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,p1,p2);
	jsp.setOneTouchExpandable(true); //分隔条上的一键展开或折叠
	add(jsp,BorderLayout.CENTER);
	add(p3,BorderLayout.SOUTH);
	p3.add(bt);
	bt.addActionListener(this); 
	p1.setBackground(Color.green);
	p2.setBackground(Color.orange);
	p3.setBackground(Color.red);
	orie=0;
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setSize(400,300);
	setResizable(false);
	setVisible(true);
	setTitle("JSplitPane Demo");
	}

	public void actionPerformed(ActionEvent e)  {
	    // TODO Auto-generated method stub
	if(e.getSource()==bt)   {
	if(orie==0)    {
	jsp.setOrientation(JSplitPane.HORIZONTAL_SPLIT);
	orie=1; 
	 }
	else   { 
	jsp.setOrientation(JSplitPane.VERTICAL_SPLIT);
	orie=0;
	}
	}
	}
	public static void main(String[] args)  { 
	new SplitPaneDemo();
	}
	

}
