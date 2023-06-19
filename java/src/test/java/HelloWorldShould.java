import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloWorldShould {

    @Test
    public void returnWellKnownPhrase() {
        var helloWorld = new HelloWorld();

        var actual = helloWorld.getGreeting();

        assertEquals("Hello, World!", actual);
    }
}
