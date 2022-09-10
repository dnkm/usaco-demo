import java.util.*;

public class test {

  static void solve(int[] ar) {

    for (int i = 0; i < ar.length; i++) {
      for (int j = i + 1; j < ar.length; j++) {

        if (ar[i] != ar[j]) {
          System.out.println(i + " ~ " + (j - 1));
          break;
        }
      }
    }
  }

  public static void main(String[] args) {
    int[] a = { 1, 2, 2, 3, 3, 3, 4, 4, 4, 4 };
    solve(a);
  }

}
