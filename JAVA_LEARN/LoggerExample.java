import java.util.logging.Level;

public class LoggerExample {
    public static void main(String[] args) {

        java.util.logging.Logger logger =
            java.util.logging.Logger.getLogger(LoggerExample.class.getName());

        logger.setLevel(Level.INFO);
        logger.info("Processing transaction of the user");
    }
}