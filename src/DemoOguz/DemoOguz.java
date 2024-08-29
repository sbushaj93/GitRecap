package DemoOguz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;

public class DemoOguz extends CommonMethods{
	
	//hello Sabah :D


	//I want to add a new method here
	
	
	public void test1()
	{
		System.out.println("This is a test!");
	}
	

	public static void main(String[] args) {
	 
		WebElement element = driver.findElement(By.id("Test"));
		element.click();
		
		System.out.println("This is part of the feature I want to develop!");
		
		System.out.println("I am in a new branch and I have not pulled the latest "
				+ "commits on the remote repository.");
	}


	//hello Oguz :) 
	
	//how are you ? :)
}
