package mv;
import ru.ifmo.se.pokemon.*;

public class MudSlap extends SpecialMove {

	public MudSlap () {
		super(Type.GROUND, 20.0, 100.0);
	}

	@Override
	protected String describe () {
		return "hurls mud in the target\'s face to "
		     + "inflict damage and lower its accuracy";
	}

	@Override
	protected void applyOppEffects (Pokemon foe) {
		foe.setMod(Stat.ACCURACY, -1);
	}
}
