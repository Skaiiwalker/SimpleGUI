package gui.view;

import javax.swing.JPanel;
import gui.controller.GUIAppController;
import javax.swing.JButton;
import javax.swing.SpringLayout;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

/**
 * @author Luke Barrowes
 * @version 0.2 Nov 9, 2015 added button, textfield and helper methods
 *
 */

public class GUIPanel extends JPanel
{
	private GUIAppController baseController;
	private JButton firstButton;
	private JTextField firstTextField;
	private SpringLayout baseLayout;
	
	
	public GUIPanel(GUIAppController baseController)
	{
		this.baseController = baseController;
		
		baseLayout = new SpringLayout();
		firstButton = new JButton("Please do not click the button");
		firstTextField = new JTextField("words can be typed here");
		
		setupPanel();
		setupLayout();
		setupListeners();
	
	}
	
	/**
	 * Helper method to load all GUI components into panel
	 */
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.MAGENTA);
		this.add(firstButton);
		this.add(firstTextField);
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.WEST, firstButton, 107, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, firstButton, -32, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, firstTextField, 37, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, firstTextField, -24, SpringLayout.EAST, this);
	}
	
	private void setupListeners()
	{
		firstButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				firstTextField.setText("Wow, you are really going to want to click this button.  It's soooo amazing.  I can't wait.");
			}
		});
	}
	
}