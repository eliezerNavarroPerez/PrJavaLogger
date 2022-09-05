package co.com.eenp;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

//implementar
// https://www.geeksforgeeks.org/logger-log-method-in-java-with-examples/
public class Main {
	
	public static final int FILE_SIZE = 1024;
	
	public static void main(String[] args) {
		
		System.setProperty("java.util.logging.SimpleFormatter.format","[%1$tF %1$tT] [%4$-7s] %5$s %n");
		
		Logger logger = Logger.getLogger(Main.class.getName());

        try {
            // Creating an instance of FileHandler with 5 logging files
            // sequences.
            FileHandler handler = new FileHandler("logs//myapp.log",true);
            handler.setFormatter(new SimpleFormatter());
            logger.addHandler(handler);
            logger.setUseParentHandlers(false);
        } catch (IOException e) {
            logger.warning("Failed to initialize logger handler.");
        }
        String usuario = "enp";
        logger.info("[" + usuario + "] "+"Logging information message.");
        logger.info("[" + usuario + "] "+"Informacion nueva de la ejecucion.");
        logger.warning("Logging warning message.");
		
	}
	
}
