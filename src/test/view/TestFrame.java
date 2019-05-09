package test.view;

import test.controller.TestController;
import javax.swing.*;
import java.awt.*;

public class TestFrame extends JFrame
{
	private TestController app;
	private TestPanel pane;
	
	public TestFrame(TestController app)
	{
		this.app = app;
		pane = new TestPanel(app);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(pane);
		this.setPreferredSize(new Dimension(1024, 768));
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(true);
		this.setVisible(true);
	}
}
