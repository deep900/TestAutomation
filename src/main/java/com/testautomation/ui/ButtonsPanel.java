/**
 * 
 */
package com.testautomation.ui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * @author pradheep
 *
 */
public class ButtonsPanel extends JPanel implements ActionListener {

	private JButton submit = new JButton("Submit");
	
	private JButton cancel = new JButton("Cancel");
	
	private MainFrame mainFrame;
	
	public ButtonsPanel() {
		init();
		setDimensions();
		allignInLayout();
	}
	
	private void init(){
		submit.addActionListener(this);
		cancel.addActionListener(this);
	}
	
	private void setDimensions(){
		Dimension preferredSize = new Dimension(120,35);
		submit.setPreferredSize(preferredSize);
		cancel.setPreferredSize(preferredSize);
	}
	
	private void allignInLayout(){
		BorderLayout borderLayout = new BorderLayout();
		this.setLayout(borderLayout);
		this.add(submit, BorderLayout.EAST);
		this.add(cancel, BorderLayout.WEST);
	}
	
	public void actionPerformed(ActionEvent e) {	
		if(e.getActionCommand().equalsIgnoreCase("cancel")){
			System.out.println("System about to exit ");
			System.exit(0);			
		}
		mainFrame.performJob();
	}
	
	public void setMainFrame(MainFrame frame){
		this.mainFrame = frame;
	}

}
