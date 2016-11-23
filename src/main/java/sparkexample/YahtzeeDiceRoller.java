package sparkexample;

import java.util.concurrent.ThreadLocalRandom;

public class YahtzeeDiceRoller implements DiceRoller {

	@Override
	public int roll() {
		return ThreadLocalRandom.current().nextInt(1,7);
	}

}
