package mv;
import ru.ifmo.se.pokemon.*;

public class Rest extends SpecialMove {

	public Rest () {
		super(Type.PSYCHIC, 0.0, 0.0);
	}

	@Override
	protected String describe () {
		return "sleeps for 2 turns, restoring HP fully";
	}

	@Override
	protected void applySelfEffects (Pokemon self) {
		// Restore effects *before* sleeping so as
		// not to remove the sleeping condition
		self.restore();
		self.setCondition(new Effect()
				.condition(Status.SLEEP).
				turns(2));
	}
};
