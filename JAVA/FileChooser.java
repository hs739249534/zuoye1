/**
 * 
 */
package kt20141223;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 * @author Administrator
 *
 */
public class FileChooser {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFileChooser fc = new JFileChooser("c:");  
		//JFileChooser fc = new JFileChooser(); 
        //是否可多选   
        fc.setMultiSelectionEnabled(false);  
        //选择模式，可选择文件和文件夹   
        fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES); 
        //fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        //fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);   
        //设置是否显示隐藏文件   
        fc.setFileHidingEnabled(true);  
        fc.setAcceptAllFileFilterUsed(false);  
        //设置文件筛选器   
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Java Files", "java");
        fc.setFileFilter(filter);  
        
        int returnValue = fc.showOpenDialog(null);  
        if (returnValue == JFileChooser.APPROVE_OPTION)  
        {  
            //fc.getSelectedFile()   
            //fc.getSelectedFiles()   
        }  

	}

}
