package practice2;

public class UseExample {
	public static void main(String[] args) {
	  Example e = new Example("aa", 1200);
	  e.introduce("bb");
	  Example2 e2 = new Example2("cc", 300, 500);
	  e2.put();
	  e2.introduce("ee");
	  // 大きい肩のクラスをさんしょう
	  Example e3 = new Example2("cc", 300, 500);
	  Example e4 = (Example)e3;
	  e4.introduce("ff");

  }
}
