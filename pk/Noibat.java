package pk;
import ru.ifmo.se.pokemon.*;
import mv.*;

public class Noibat extends Pokemon {

	public Noibat (String name, int level) {
		super(name, level);
		setType(Type.FLYING, Type.DRAGON);
		setStats(40.0,
		         30.0,
			 35.0,
			 45.0,
			 40.0,
			 55.0);
		setMove(new Rest(),
			new DracoMeteor());
	}

	public Noibat () {
		this("Unnamed", 1);
	}
}
