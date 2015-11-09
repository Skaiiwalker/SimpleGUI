package gui.view;

import javax.swing.JFrame;
import gui.controller.GUIAppController;

public class GUIFrame extends JFrame
{
	private GUIAppController baseController;
	
	public GUIFrame(GUIAppController baseController)
	{
		this.baseController = baseController;
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setSize(400, 400);
		this.setVisible(true);
	}
}
