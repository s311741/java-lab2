package mv;
import ru.ifmo.se.pokemon.*;

public class Scald extends SpecialMove {

	public Scald () {
		super(Type.WATER, 80.0, 100.0);
	}

	@Override
	protected String describe () {
		return "shoots hot boiling water at its target. "
		     + "This may leave the target with a burn";
	}

	@Override
	protected void applyOppEffects (Pokemon foe) {
		if (Math.random() < 0.3) {
			Effect.burn(foe);
		}
	}

	@Override
	protected void applySelfEffects (Pokemon self) {
		if (self.getCondition() == Status.FREEZE) {
			self.setCondition(new Effect()
					.condition(Status.NORMAL));
		}
	}
}
