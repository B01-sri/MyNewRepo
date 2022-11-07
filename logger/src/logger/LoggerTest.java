package logger;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LoggerTest {

	private static final Logger LOGGER = Logger.getLogger(LoggerTest.class.getName());
	public static void main(String[] args) {
		LOGGER.info("Hi");
		ConsoleHandler consoleHandler = new ConsoleHandler();
		consoleHandler.setLevel(Level.ALL);
		
		SimpleFormatter formatter = new SimpleFormatter();
		consoleHandler.setFormatter(formatter);
		
		
		LOGGER.addHandler(consoleHandler);
		LOGGER.setLevel(Level.ALL);
		LOGGER.severe("severe");
		LOGGER.warning("warning");
		LOGGER.info("info");
		LOGGER.config("config");
		LOGGER.fine("fine");
		LOGGER.finer("finer");
		LOGGER.finest("finest");

	}
}
