package agc039.a;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class MainTest {

  @Test
  public void test() {
    String input = "1\n"
        + "2";
    String expected = "3";
    
    assertThat(execute(input + "\n"), is(expected + "\n"));
  }

//  @Test
//  public void test2() {
//    String input = "1 5 2 0";
//    String expected = "11100";
//
//    assertThat(execute(input + "\n"), is(expected + "\n"));
//  }
//
//
//  @Test
//  public void test03() {
//    String input = "12 3 7";
//    String expected = "0";
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