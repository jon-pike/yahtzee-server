package sparkexample;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class DiceRollerTest {
	
	private DiceRoller roller;
	
	@Before
	public void setup() {
		roller = new YahtzeeDiceRoller();
	}
	
    @Test
    public void dice_roller_returns_number_between_1_and_6() {
    	
    	for(int i = 0; i<1000; i++){
    		int value = roller.roll();
    		assertTrue(value >=1 && value <= 6);
    	}
    }
    
    @Test
    public void dice_roller_returns_each_number_between_1_and_6__at_least_once_when_rolled_1000_times() {
    	
    	List<Integer> returnValues = new ArrayList<Integer>();
    	
    	for(int i = 0; i<1000; i++){
    		returnValues.add(roller.roll());
    	}
    	
    	assertTrue(returnValues.contains(1));
    	assertTrue(returnValues.contains(2));
    	assertTrue(returnValues.contains(3));
    	assertTrue(returnValues.contains(4));
    	assertTrue(returnValues.contains(5));
    	assertTrue(returnValues.contains(6));
    }

    @Test
    public void dice_roller_never_returns_less_than_1_or_greater_than_6() {
    	
    	for(int i = 0; i<1000; i++){
    		int value = roller.roll();
    		assertTrue(value >= 1 && value <= 6);
    	}
    }
}
