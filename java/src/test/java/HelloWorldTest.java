import org.junit.Test;
import org.junit.Ignore;

import static org.junit.Assert.assertEquals;

public class HelloWorldTest {

    @Test
    public void firstTest() {
        assertEquals("Hi", HelloWorld.Hello());
    }
}