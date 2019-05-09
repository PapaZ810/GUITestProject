package test.view;

import test.controller.TestController;
import javax.swing.*;

public class TestPanel extends JPanel
{
	private TestController app;
	private JDesktopPane desktopPane;
	
	public TestPanel(TestController app)
	{
		this.app = app;
		
		desktopPane = new JDesktopPane();
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}
}
