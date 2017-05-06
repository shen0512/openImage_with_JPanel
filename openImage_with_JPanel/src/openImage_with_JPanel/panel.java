package openImage_with_JPanel;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class panel extends JPanel{
	Image image;
	public panel(){
		try{
			image=ImageIO.read(new File("123.jpg"));
			}catch(Exception e){
				e.printStackTrace();
			}
	}
	
	@Override
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		g.drawImage(image, 0 ,0, this);
	}
}
