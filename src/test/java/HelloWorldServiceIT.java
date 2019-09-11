import app.HelloWorldService;
import org.junit.Test;

import javax.ws.rs.core.Response;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by jguo on 2019-09-10.
 */
public class HelloWorldServiceIT {
    protected HelloWorldService service = new HelloWorldService();

    @Test
    public void testGetMsg() {
        Response response = service.getMsg("hello");

        assertEquals(response.getStatus(), 200);

    }
}
