/**
 * 
 */
package com.testautomation.ui;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.testautomation.SequenceLoader;



/**
 * @author pradheep
 *
 */
public class TestAutomation {	
	
	@Autowired
	private SequenceLoader sequenceLoader;

	public static void main(String[] args) {		
		TestAutomation testAutomation = new TestAutomation();		
		testAutomation.loadConfiguration();
		
		System.out.println("Press 1 for CLI or Press 2 for UI mode:");
		Scanner scanner = new Scanner(System.in);
		String option = scanner.next();
		System.out.println("Option:" + option);
		if(option.equalsIgnoreCase("1")){
			testAutomation.workAsCLIMode();
		}
		else if(option.equalsIgnoreCase("2")){
			testAutomation.workInUIMode();	
		}	
		else{
			System.out.println("Invalid input .. Try again");
		}
	}
	
	public void workAsCLIMode(){
		System.out.println("--- CLI Mode Activated ");		
		sequenceLoader.loadAllSequences();
	}
	
	public void workInUIMode(){
		System.out.println("UI Mode activated.");
		buildUI();
	}
	
	private void buildUI(){
		MainFrame mainFrame = new MainFrame();
	}	
	
	public void loadConfiguration(){		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(TestAutomationConfiguration.class);
		ctx.getAutowireCapableBeanFactory().autowireBean(this);
	}
}
