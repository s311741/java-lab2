package pk;
import ru.ifmo.se.pokemon.*;
import mv.*;

public class Gloom extends Pokemon {

	public Gloom (String name, int level) {
		super(name, level);
		setType(Type.GRASS, Type.POISON);
		setStats(60.0,
		         65.0,
		         70.0,
		         85.0,
		         75.0,
		         40.0);
		setMove(new Facade(),
			new StunSpore(),
			new Absorb());
	}

	public Gloom () {
		this("Unnamed", 1);
	}
}

