package demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.message.LoggerNameAwareMessage;

public class Log4jDemo {
	
	private static Logger _logger= LogManager.getLogger(Log4jDemo.class);

	public static void main(String[] args) {
		System.out.println("\n Hello world....! \n ");
		
		_logger.trace("this is trace message");
		_logger.info("this is information message");
		_logger.error("this is an error message");
		_logger.warn("this is an warning message");
		_logger.fatal("this is an fatal message");
		
		System.out.println("\n Completed");

	}

}
