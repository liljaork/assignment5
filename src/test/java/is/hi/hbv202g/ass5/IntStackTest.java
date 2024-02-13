package is.hi.hbv202g.ass5;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class IntStackTest {

    @Before
    @Test
    public void testNewStackIsNotFull() {
        IntStack stack = new IntStack();

        assertFalse(stack.isFull());
    }

}
