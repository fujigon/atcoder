package solver;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class MainTest {

  @Test
  public void test() {
    String input = "2 3 3";
    String expected = "0 2";

    assertThat(execute(input + "\n"), is(expected + "\n"));
  }

  @Test
  public void test1() {
    String input = "500000000000 500000000000 1000000000000";
    String expected = "0 0";

    assertThat(execute(input + "\n"), is(expected + "\n"));
  }
//
//  @Test
//  public void test2() {
//    String input = "6\n"
//        + "010110\n"
//        + "101001\n"
//        + "010100\n"
//        + "101000\n"
//        + "100000\n"
//        + "010000";
//    String expected = "4";
//
//    assertThat(execute(input + "\n"), is(expected + "\n"));
//  }
  
  private String execute(String input) {
    ByteArrayOutputStream os = new ByteArrayOutputStream();
    Main.solve(
        new ByteArrayInputStream(input.getBytes()), new PrintStream(os)
    );
    return os.toString().replace(System.lineSeparator(), "\n");
  }


}