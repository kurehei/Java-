public class Character {
  String name;
  int hp;

  public void run() {
	System.out.println(this.name + "は逃げ出した");
  }

  // 抽象メソッドを用意する
  public abstract void attack(Motango m);
}
