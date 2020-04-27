public class Hero {
	// 原則フィールドは、private化する
	private String name;
	private int hp;
	// getterメソッドの指定
	public String getName() {return this.name; }
	 // setterメソッドの指定
	public void setName(String name) {
	  this.name = name;
	}
	// クラス型の情報を持っている
	// コンストラクトとは、インスタンスを生成した瞬間に実行されるメソッド
	// コンストラクで、引数に追加条件を与える。
	public Hero(String name) {
		this.hp = 100;
		this.name = name;
	}

	// 引数がないコンストラクタ
	public Hero() {
		// コンストラクタから、コンストラクタは呼べない。
		this("たかし");
	}

	Sword sword;

	public void sleep() {
		this.hp = 100;
		System.out.print(this.name + "は眠って回復した");
	}

	public void sit(int sec) {
		this.hp += sec;
		System.out.println(this.name + "は" + sec + "秒、座った");
		System.out.println("HPが" + sec + "回復した");
	}

	public final void slip() {
		// finalをつけると、子クラスでオーバーライド出来なくなる
		this.hp -= 5;
		System.out.println(this.name + "は、転んだ！");
		System.out.println("5のダメージ受けた");
	}

	public void run() {
		System.out.println(this.name + "は、逃げ出した");
		System.out.println("GAMEOVER");
		System.out.println("最終的なHP" + this.hp + "でした");
	}
}
