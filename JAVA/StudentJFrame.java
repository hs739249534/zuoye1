/**
 * 
 */
package kt20141223;

import java.awt.Container;
import java.awt.TextField;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

/**
 * @author Administrator
 *
 */
public class StudentJFrame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f=new JFrame();
		f.setTitle("学生信息管理系统");
		//f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//f.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		//1JFrame大小位置设置
		f.setSize(800,600);
		f.setLocation(200,200);
		//1
		
		Container con=f.getContentPane();		
		JPanel pan=new JPanel();
		//2标签
		JLabel l_xm=new JLabel("姓名");
		pan.add(l_xm);
		JLabel l_xb=new JLabel("性别");		
		pan.add(l_xb);		
		//2
		
		//3特定位置放置
		//pan.setLayout(null);	
		//l_xb.setBounds(100, 100, 100, 100);//l_xm哪里去了？		
		//l_xm.setSize(100, 200);
		//3
		
		//4按钮
		JButton b_sub=new JButton("确认");
		pan.add(b_sub);
		JButton b_save=new JButton("保存");
		pan.add(b_save); 
		//4

		//5文本框
		TextField tf_name=new TextField(20);
		tf_name.setText("liulijia");
		tf_name.setEchoChar('*');//JTextField没有该方法
		pan.add(tf_name);
		//5
		
		//6文本区
		JLabel l_ig=new JLabel("录取结果");		
		pan.add(l_ig);
		JTextArea ta = new JTextArea("liulijia",10,10);
		JScrollPane sp = new JScrollPane(ta);
		//ta.replaceRange("best",1,3) ;
		pan.add(sp);
		//6
		
		//7单选钮
		JRadioButton  male = new JRadioButton("男");
		ImageIcon ii = new ImageIcon("x.gif");
		JRadioButton  female = new JRadioButton("女",ii,true);
		ButtonGroup  group=new ButtonGroup();
		group.add(male);
		group.add(female);
		pan.add(male);
		pan.add(female); 
		//7
		
		//8复选框
		JLabel l_ah=new JLabel("爱好");
		
		JCheckBox[] hobby={new JCheckBox("音乐"),new JCheckBox("足球",ii),new JCheckBox("绘画")};
		pan.add(l_ah);		
		pan.add(hobby[0]);
		pan.add(hobby[1]);
		pan.add(hobby[2]); 
		//8
		
		//9列表框
		JLabel  l_xk=new JLabel("选课");
		String[] coursesNames = {"数据结构","操作系统","网络原理","Java语言","分布式系统开发技术","计算机导论","密码学","计算机组成原理","编译原理","图形学"};
		JList course=new JList(coursesNames);
		course.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		pan.add(l_xk);
		pan.add(course);
		//9
		
		//10下拉列表框
		JLabel  l_yx=new JLabel("院系");
		pan.add(l_yx);
		String[] departmentNames = {"软件工程系","网络工程系","教育技术系" ,"数字媒体系"};
		JComboBox  department = new JComboBox(departmentNames);
		department.setEditable(true);
		pan.add(department);
		//10
		
		
		//11密码框
		JLabel l_ma=new JLabel("密码");
		pan.add(l_ma);
		JPasswordField password=new JPasswordField(20);
		password.setEchoChar('*');
		pan.add(password); 
		//11
		
		
		//12滑块
		JLabel l_jf=new JLabel("加分");     pan.add(l_jf);
		JSlider addition = new JSlider(JSlider.HORIZONTAL, 0, 100, 50);
		addition.setMajorTickSpacing(10);
		addition.setMinorTickSpacing(5);
		addition.setPaintTicks(true);
		addition.setPaintLabels(true);
		addition.setSnapToTicks(true);
		pan.add(addition); 
		//12
		
		//13进度条
		JProgressBar progbar = new JProgressBar(JProgressBar.HORIZONTAL,0,100);
		progbar.setStringPainted(true);
		pan.add(progbar);
		//13
		
		//14微调框
		JLabel lb=new JLabel("年龄");
		JSpinner jsp=new JSpinner();
		jsp.setValue(new Integer(20));
		pan.add(lb);
		pan.add(jsp); 
		//14
		
		con.add(pan);
		f.setVisible(true);

	}

}
