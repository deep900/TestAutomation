/**
 * 
 */
package com.testautomation.ui;

import java.awt.BorderLayout;
import java.awt.HeadlessException;

import javax.swing.JFrame;

/**
 * @author pradheep
 *
 */
public class MainFrame extends JFrame {
	
	public MainFrame() throws HeadlessException {
		buildUI();
		allignInLayout();
		addProperties();
	}

	private MainPanel mainPanel;
	
	private ButtonsPanel buttonsPanel;
	
	public void performJob(){
		System.out.println(" --- Triggered Perform Job --- ");
	}	
	
	private void buildUI(){
		mainPanel = new MainPanel();
		buttonsPanel = new ButtonsPanel();
		buttonsPanel.setMainFrame(this);
	}
	
	private void allignInLayout(){
		BorderLayout borderLayout = new BorderLayout();
		this.getContentPane().setLayout(borderLayout);
		getContentPane().add(mainPanel, BorderLayout.CENTER);
		getContentPane().add(buttonsPanel, BorderLayout.SOUTH);
	}
	
	private void addProperties(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setTitle("Test Automation V1");
		this.setVisible(true);
	}
	
}
