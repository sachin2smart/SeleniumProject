package listeners;

import static org.testng.Assert.assertTrue;

import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import junit.framework.Assert;


public class TestNGListenerDemo2 {

	@Test
	public void Test4(){
		System.out.println("I am inside test4");
	}
	@Test
	public void Test5(){
		System.out.println("I am inside test5");
	}
	@Test
	public void Test6(){
		System.out.println("I am inside test6");
//		throw new SkipException("This test is skipped");
	}

}
