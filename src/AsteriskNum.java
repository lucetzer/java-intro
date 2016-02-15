/**
 * Created by lucetzer on 14/02/2016.
 */
public class AsteriskNum {
  String result = "";
  int number;
  AsteriskNum(int n) {
    number = n;
  }

  public void printAsterisk() {
    for (int i = 0; i<number; i++) {
      result += "*";
    }
    System.out.println(result);
  }

  public static void main(String[] args) {
    AsteriskNum test = new AsteriskNum(4);
    test.printAsterisk();
  }

}
