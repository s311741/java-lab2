package mv;
import ru.ifmo.se.pokemon.*;

public class Roost extends SpecialMove {

	public Roost () {
		super(Type.PSYCHIC, 0.0, 0.0);
	}

	@Override
	protected String describe () {
		return "lands and rests its body, restoring half its max HP";
	}

	@Override
	protected void applySelfEffects (Pokemon self) {
		double maxHP = self.getStat(Stat.HP);
		self.setMod(Stat.HP, (int) Math.round(-0.5 * maxHP));
	}
};

