
public final class Main {
	// finalをclassの前につけると、継承ができなくなる。。
	public static void main(String[] args) {
		Character c = new Wizard();
		Wizard w = (Wizard)c;
		Motango m = new Motango('a');
		c.name = "あさか";
		c.attack(m);
		// ここでエラー
		c.fireball(m);

	}
}
