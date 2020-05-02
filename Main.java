
public final class Main {
	// finalをclassの前につけると、継承ができなくなる。。
	public static void main(String[] args) {
	  Food f = new Food("パスタ");
	  Food f2 = new Food("チキン");
	  System.out.println(f.name);
	  Food.price = 200;
	  System.out.println(Food.price);
	}
}
