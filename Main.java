import ru.ifmo.se.pokemon.*;
import pk.*;

public class Main {
	public static void main (String[] args) {
		Battle b = new Battle();

		b.addAlly(new Noibat());
		b.addAlly(new Noivern());
		b.addAlly(new Bellossom());
		b.addFoe(new Stunfisk());
		b.addFoe(new Gloom());
		b.addFoe(new Oddish());

		b.go();
	}
}
