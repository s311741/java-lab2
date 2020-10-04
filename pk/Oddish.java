package pk;
import ru.ifmo.se.pokemon.*;
import mv.*;

public class Oddish extends Pokemon {

	public Oddish (String name, int level) {
		super(name, level);
		setType(Type.GRASS, Type.POISON);
		setStats(45.0,
		         50.0,
		         55.0,
		         75.0,
		         65.0,
		         30.0);
		setMove(new Facade(),
			new StunSpore());
	}

	public Oddish () {
		this("Unnamed", 1);
	}
}
