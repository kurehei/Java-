public class PoisonMotango extends Motango {
	int AttackTimes = 5;

	public PoisonMotango(char suffix) {
		super(suffix);
	}

	public void attack(Hero h) {
		super.attack(h);
		if (AttackTimes > 0) {
			System.out.println("毒の胞子をばらまいた");
			int dmg = h.hp /5;
			h.hp -= dmg;
			System.out.println(dmg + "のダメージ");
			AttackTimes--;
		}
	}
}
