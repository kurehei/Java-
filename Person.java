public class Person {
  int age;

  public void setAge(int age){
	if(age < 0) {
		throw new IllegalArgumentException("不正です");
	}
	this.age = age;
  }
}
