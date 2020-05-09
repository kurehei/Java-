import java.util.ArrayList;

public final class Main {
	// finalをclassの前につけると、継承ができなくなる。。
	public static void main(String[] args) {
		ArrayList<Integer> points = new ArrayList<Integer>();
		// オートボクシング機能でIntger型に自動変換
		points.add(10);
		points.add(20);
		points.add(30);
		// size = leength 要素の取得　= get()
		for(int i = 0; i < points.size(); i++){
		  System.out.println(points.get(i));
		}
	}
}
