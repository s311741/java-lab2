package pk;
import ru.ifmo.se.pokemon.*;
import mv.*;

public class Bellossom extends Pokemon {

	public Bellossom (String name, int level) {
		super(name, level);
		setType(Type.GRASS);
		setStats(75.0,
		         80.0,
		         95.0,
		         90.0,
		         100.0,
		         50.0);
		setMove(new Facade(),
			new StunSpore(),
			new Absorb(),
			new Venoshock());
	}

	public Bellossom () {
		this("Unnamed", 1);
	}
}
