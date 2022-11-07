package logger;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileHandlerTest {
private static final Logger LOGGER = Logger.getLogger(FileHandlerTest.class.getName());
	public static void main(String[] args) throws SecurityException, IOException {
		FileHandler fileHandler = new FileHandler("");
fileHandler.setLevel(Level.ALL);
//this for default
//SimpleFormatter formatter = new SimpleFormatter();
//fileHandler.setFormatter(formatter);


//this is our own format
MyFormat format = new MyFormat();
//fileHandler.setFormatter(format);


LOGGER.addHandler(fileHandler);
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
