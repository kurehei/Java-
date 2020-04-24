// interfaceの継承は、implements インターフェイス名で継承できる.
// 複数のインターフェイスも継承できる
public class Gollira implements
  Creature {
	  String name;
	  int hp;

	  public void run() {
		System.out.println(this.name + "は逃げた");
	  }
  }
