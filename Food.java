public class Food {
  String name;
  // 静的メンバ
  static int price;

  public Food(String name) {
	this.name = name;
  }
  // クラスメソッドでは、静的フィールド以外は使えない
  //public static void setMoney() {
	//System.out.println(this.name);
  //}
}
