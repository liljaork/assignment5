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

    @Test 
    public void testFullStackIsAlmostFull() {
        for(int i=0; i < (stack.getCapacity()-1); i++){
            stack.push(i);
        }
        assertFalse(stack.isFull());
    }

    @Test
    public void testPopReturnsPushedValue() {
        stack.push(100);
        assertEquals(100, stack.pop());
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testPopOnEmptyStackThrowsException() {
        stack.pop(); 
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testPushOnFullStackThrowsException() {
        for(int i=0; i < stack.getCapacity(); i++){
            stack.push(i);
        }
        stack.push(999); 
    }

    @Test
    public void testStackIsEmptyA() {
        stack.push(1);
        assertFalse(stack.isEmpty());
    }

    @Test (expected = ArrayIndexOutOfBoundsException.class)
    public void testStackIsEmptyB() {
        for(int i=0; i < stack.getCapacity(); i++){
            stack.pop();
        }
        assertTrue(stack.isEmpty());
    }

}
