

public final class Main {
  // finalをclassの前につけると、継承ができなくなる。。
	public static void main(String[] args) {
		SuperHero sh = new SuperHero();
		sh.run();
		sh.slip();
		Weapon wp = new Weapon();
	}
}
