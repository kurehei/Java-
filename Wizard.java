public class Wizard extends Character {
  int mp;

  public void heal(Hero h) {
    h.hp += 10;
    System.out.println(h.name + "を10回復した");
  }
  
  public void attack(Motango m) {
    System.out.println(this.name + "の攻撃");
    System.out.println("3の1ダメージを与えた");
    m.hp -=3;
    }

  public void fireball(Motango m) {
    System.out.println(this.name + "の攻撃");
    System.out.println("20のダメージを与えた");
    m.hp -= 20;
    this.mp -= 5;
  }
}
