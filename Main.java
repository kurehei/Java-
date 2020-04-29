
public final class Main {
	// finalをclassの前につけると、継承ができなくなる。。
	public static void main(String[] args) {
	  Hero h1 = new Hero("aa");
	  Hero h2 = new Hero("aa");
	  // == 等値 の判定　equal()は 等価の判定 ;
	  if(h1.equals(h2) == true) {
		System.out.println("同じ内容です！");
	  } else {
		System.out.println("違う内容です");
	  }
	  //toStringを独自に出力するには、オーバーライドするしかない
	}
}
