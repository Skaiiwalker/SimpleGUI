package gui.view;

import javax.swing.JFrame;
import gui.controller.GUIAppController;

public class GUIFrame extends JFrame
{
	private GUIAppController baseController;
	private GUIPanel basePanel;
	
	public GUIFrame(GUIAppController baseController)
	{
		this.baseController = baseController;
		basePanel = new GUIPanel(baseController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(400, 400);
		this.setTitle("silly app!!");
		this.setResizable(false);
		this.setVisible(true);
	}
	
	public GUIAppController getBaseController()
	{
		return baseController;
	}
}

