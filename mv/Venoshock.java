package mv;
import ru.ifmo.se.pokemon.*;

public class Venoshock extends SpecialMove {

	public Venoshock () {
		super(Type.POISON, 65.0, 100.0);
	}

	@Override
	protected String describe () {
		return "drenches its target in a poisonous fluid. "
		     + "The move\'s power is doubled if the target is poisoned";
	}

	@Override
	protected double calcBaseDamage (Pokemon att, Pokemon def) {
		double d = super.calcBaseDamage(att, def);
		if (att.getCondition() == Status.POISON)
			return 2.0 * d;
		return d;
	}
}
