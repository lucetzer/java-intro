/**
 * Created by lucetzer on 15/02/2016.
 */
public class AsteriskTriangle {
  String result = "";
  int lines;

  AsteriskTriangle(int n) {
    lines = n;
  }

  public void trianglePrint() {
    System.out.print(result);
    for (int i = 0; i<=lines; i++) {
      for (int j = 0; j<i; j++) {
        System.out.print("*");
      }
      System.out.println("");
    }
  }

  public static void main(String[] args) {
    new AsteriskTriangle(8).trianglePrint();
  }
}
