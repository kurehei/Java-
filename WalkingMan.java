public abstract class WalkingMan extends Character {
	public void run(){
		System.out.println(this.name + "は逃げ出した");
	}
  // runの抽象メソッドはオーバーライドしたが、attack()についてはオーバーライドされてないため、インスタンス化できない
} 
