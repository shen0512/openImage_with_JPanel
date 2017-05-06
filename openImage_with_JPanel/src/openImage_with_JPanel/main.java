package openImage_with_JPanel;

import javax.swing.JPanel;
import javax.swing.JWindow;

class main{
	
	public static void main(String args[]){
		JWindow frame=new JWindow();
		
		frame.add(new panel());
		frame.setSize(400,400);
		frame.setVisible(true);
		
	}
}
