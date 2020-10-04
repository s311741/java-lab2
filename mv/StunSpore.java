package mv;
import ru.ifmo.se.pokemon.*;

public class StunSpore extends StatusMove {

	public StunSpore () {
		super(Type.GRASS, 0.0, 75.0);
	}

	@Override
	protected String describe () {
		return "scatters a cloud of powder which may paralyze its target";
	}

	@Override
	protected void applyOppEffects (Pokemon foe) {
		Effect.paralyze(foe);
	}
}
