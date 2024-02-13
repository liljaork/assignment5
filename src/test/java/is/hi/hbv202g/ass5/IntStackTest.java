package is.hi.hbv202g.ass5;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class IntStackTest {
    private IntStack stack;

    @Before
    public void constructStackTestObjects(){
        stack = new IntStack();
    }

    @Test
    public void testNewStackIsNotFull() {
        assertFalse(stack.isFull());
    }

    @Test
    public void testFullStackIsFull() {
        for(int i=0; i < stack.getCapacity(); i++){
            stack.push(i);
        }
        assertTrue(stack.isFull());
    }

}
