package practice2;

class Example2 extends Example {
  int hp;

  public Example2(String name, int age, int hp) {
	super(name, age);
	this.hp = hp;
  }

  public void put() {
	  System.out.println("名前" + super.name + "年齢" + super.age + "HP" + hp);
  }

  // オーバーライド
  public void introduce(String name) {
	  super.introduce(name);
	  System.out.println("こちらこそよろしくね");
  }

}
