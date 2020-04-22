
public final class Main {
	// finalをclassの前につけると、継承ができなくなる。。
	public static void main(String[] args) {
		Hero h = new Hero();
		h.sleep();
		Kurehei k = new Kurehei();
		k.name = "kurehei";
		k.run();
		k.eat();
	}
}
