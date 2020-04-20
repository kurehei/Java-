
public final class Main {
	// finalをclassの前につけると、継承ができなくなる。。
	public static void main(String[] args) {
		Hero h = new Hero();
		h.sleep();
		PoisonMotango pm = new PoisonMotango('A');
		pm.attack(h);
	}
}
