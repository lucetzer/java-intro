/**
 * Created by lucetzer on 15/02/2016.
 */
public class AsteriskVertical {
  int lines;

  AsteriskVertical(int n) {
    lines = n;
  }

  public void verticalPrint() {
    for (int i = 0; i<lines; i++) {
      System.out.print("*\n");
    }
  }

  public static void main(String[] args) {
    new AsteriskVertical(3).verticalPrint();
  }
}
