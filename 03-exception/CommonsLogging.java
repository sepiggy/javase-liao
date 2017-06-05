import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class CommonsLogging {

    static Log log = LogFactory.getLog(CommonsLogging.class);

    public static void main(String[] args) {

        log.info("commons logging info...");

        log.error("commons logging error...");

    }
}
