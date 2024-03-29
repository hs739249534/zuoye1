/**
 * 
 */
package kt20141223;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.border.Border;

/**
 * @author Administrator
 *
 */
public class JColorChooserDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f=new JFrame();
		f.setTitle("学生信息管理系统");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setExtendedState(JFrame.MAXIMIZED_BOTH);
		Container con=f.getContentPane();		
		JPanel pan=new JPanel();		
		JLabel l_xm=new JLabel("姓名");
		JColorChooser  jc=new JColorChooser();
		l_xm.setForeground(jc.showDialog(null, "请选择前景色", Color.BLUE));
		
		
		//1设置组件边框样式
		Border border5 =BorderFactory.createEtchedBorder();
		//创建一个具有“浮雕化”外观效果的边框，将组件的当前背景色用于突出显示和阴影显示
		l_xm.setBorder(border5);
		//1
		
		//2设置组件字体样式
		Font font = new Font("黑体",Font.BOLD,24);
		//设置组件的字体
		l_xm.setFont(font);
		//2
		
		//3设置组件光标样式
		Cursor cu=new Cursor(Cursor.HAND_CURSOR);
		l_xm.setCursor(cu);
		//3
		pan.add(l_xm);
		con.add(pan);
		f.setVisible(true);
	}

}
