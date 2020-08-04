package university.innopolis;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import sun.applet.Main;

import java.io.FileInputStream;
import java.util.logging.LogManager;
import java.util.logging.LogManager;
//import java.util.logging.LogManager;
//import java.util.logging.Logger;


class Log {
    static Logger LOGGER;

    static {
        try (FileInputStream ins = new FileInputStream("C:\\log.config")) { //полный путь до файла с конфигами
   //         LogManager.getLogManager().readConfiguration(ins);
            LOGGER = LoggerFactory.getLogger(Log.class);
        } catch (Exception ignore) {
            ignore.printStackTrace();
        }
    }
}



/*class MyClass {
    private Logger log = LoggerFactory.getLogger( MyClass.class );

public class Log {
    public static void main(String[] args) throws FileNotFoundException {

        System.setErr(new PrintStream("error.log"));
        System.out.println("Hi!");
        System.err.println(new SimpleDateFormat("yyyy.MM.dd HH:mm:ss").format(new Date()) + "My first mistake!");

        throw new RuntimeException("My second mistake!");
    }
}
*/