public abstract class Character {
  // abstractをつけることで抽象クラスとして宣言される
  // 抽象クラスは、newによるインスタンス化を禁止できる

  String name;
  int hp;

  public void run() {
    System.out.println(this.name + "は逃げ出した");
  }


  // 抽象メソッドを用意する
  // 抽象メソッドは、継承先で必ずオーバーライドする必要はないが、どこかの継承先で必ずオーバーライドしなければ、インスタンス化できない。
  // public abstract void eat();
  public abstract void attack(Motango m);
}
