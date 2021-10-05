import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class As79StringTest {

    @org.junit.jupiter.api.Test
    public void countLength() {
        As79String string = new As79String();
        assertEquals(4, string.countLength("test"));

    }
}