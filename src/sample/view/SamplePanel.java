package sample.view;

import sample.controller.GUIController;
import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SamplePanel extends JPanel
{
	private GUIController appController;
	
	private JButton colorButton;
	private JLabel textLabel;
	
	public SamplePanel(GUIController appController)
	{
		super();
		
		this.appController = appController;
	
		colorButton = new JButton("Click here for a wacky new color");
		textLabel = new JLabel("Guess what this app does? It changes colors!");
		
		setupPanel();
		setupLayout();
		setupListeners();
	}

	private void setupPanel()
	{
		this.setBackground(Color.CYAN);
		this.add(textLabel);
		this.add(colorButton);
	}

	private void setupLayout()
	{
		
	}

	private void setupListeners()
	{
		colorButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent mouseClick)
			{
				
			}
		});
	}
	
	private void changeBackgroundColor()
	{
		int red = (int) (Math.random() * 256);
		int green = (int) (Math.random() * 256);
		int blue = (int) (Math.random() * 256);

		this.setBackground(new Color(red, green, blue));
		textLabel.setText("Red is: " + red + " Blue is: " + blue + " Green is: " + green);
	}
	
}


