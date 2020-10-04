package pk;
import ru.ifmo.se.pokemon.*;
import mv.*;

public class Noivern extends Pokemon {

	public Noivern (String name, int level) {
		super(name, level);
		setType(Type.FLYING, Type.DRAGON);
		setStats(85.0,
		         70.0,
		         80.0,
		         97.0,
		         80.0,
		         123.0);
		setMove(new Rest(),
			new DracoMeteor(),
			new DragonPulse());
	}

	public Noivern () {
		this("Unnamed", 1);
	}
}
