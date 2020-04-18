public class SuperHero extends Hero {
	boolean flying;

	public SuperHero() {
		System.out.println("SuperHeroのコンストラクタが動作");
	}
	public void attack(Motango m) {
		super.attack(m);
		if(this.flying) {
		  m.hp -= 5;
		  System.out.println("5ポイントのダメージを与えた");
		}
	}
	public void fly() {
		this.flying = true;
		System.out.println(this.name + "は飛び上がった");
	}

	public void land() {
		this.flying = false;
		System.out.println(this.name + "は着地した");
	}

	// Heroクラスのrunメソッドをオーバーライドする
	public void run() {
		System.out.println(this.name + "は逃げ出した");
	}
}
