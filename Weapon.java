public class Weapon extends Item {
	//子クラスでコンストラクタを呼ぶ場合、親クラスでもコンストラクタを呼ばなけらばならない。
	// super(); で親クラスのコンストラクタを呼べる※ただし、引数がない場合、エラーになる可能性も高い
	public Weapon() {
		super("そ");
		System.out.println("weaponのコンストラクタ起動");
	}
}
