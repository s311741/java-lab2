package mv;
import ru.ifmo.se.pokemon.*;

public class Absorb extends SpecialMove {

	public Absorb () {
		super(Type.GRASS, 20.0, 100.0);
	}

	@Override
	protected String describe () {
		return "attacks, absorbing half the HP drained from the enemy";
	}

	@Override
	protected void applySelfDamage (Pokemon self, double dmg) {
		self.setMod(Stat.HP, (int) Math.round(-0.5 * dmg));
	}
}
