package abc126.a;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.*;

public class Main {

  public static void main(String[] args) {
    solve(System.in, System.out);
  }

  static void solve(InputStream is, PrintStream os) {
    Scanner sc = new Scanner(is);

    /* read */

    int a = sc.nextInt();
    int b = sc.nextInt();

    int t = sc.nextInt();

    os.println(t / a * b);
  }
}