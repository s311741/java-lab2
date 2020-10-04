package mv;
import ru.ifmo.se.pokemon.*;

public class Thunderbolt extends SpecialMove {

	public Thunderbolt () {
		super(Type.ELECTRIC, 90.0, 100.0);
	}

	@Override
	protected String describe () {
		return "looses a strong electrical blast at the foe "
			+ "to inflict damage and perhaps paralyze them";
	}

	@Override
	protected void applyOppEffects (Pokemon foe) {
		if (Math.random() < 0.1) {
			Effect.paralyze(foe);
		}
	}
}
