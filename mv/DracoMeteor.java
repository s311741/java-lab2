package mv;
import ru.ifmo.se.pokemon.*;

public class DracoMeteor extends SpecialMove {

	public DracoMeteor () {
		super(Type.DRAGON, 130.0, 90.0);
	}

	@Override
	protected String describe () {
		return "summons comets down from the sky, "
		     + "harshly reducing its own Special Attack stat";
	}

	@Override
	protected void applySelfEffects (Pokemon self) {
		self.addEffect(new Effect().stat(Stat.SPECIAL_ATTACK, -2));
	}
}
