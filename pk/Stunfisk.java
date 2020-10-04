package pk;
import ru.ifmo.se.pokemon.*;
import mv.*;

public class Stunfisk extends Pokemon {

	public Stunfisk (String name, int level) {
		super(name, level);

		setType(Type.GROUND, Type.ELECTRIC);
		setStats(109.0,
		         66.0,
		         84.0,
		         81.0,
		         99.0,
		         32.0);

		setMove(new MudSlap(),
			new Thunderbolt(),
			new Rest(),
			new Scald());
	}

	public Stunfisk () {
		this("Unnamed", 1);
	}
}
