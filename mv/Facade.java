package mv;
import ru.ifmo.se.pokemon.*;

public class Facade extends PhysicalMove {

	public Facade () {
		super(Type.NORMAL, 70.0, 100.0);
	}

	@Override
	protected String describe () {
		return "attacks with a boost if it is burned, poisoned, or paralyzed";
	}

	@Override
	protected double calcBaseDamage (Pokemon att, Pokemon def) {
		double d = super.calcBaseDamage(att, def);

		switch (att.getCondition()) {
		case BURN:
		case POISON:
		case PARALYZE:
			d *= 2.0;
		}

		return d;
	}
}
