package com.solver.atcoder.abc.abc155.a;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class MainTest {

  @Test
  public void test() {
    String input = "5 7 5";
    String expected = "Yes";
    
    assertThat(execute(input + "\n"), is(expected + "\n"));
  }

  @Test
  public void test1() {
    String input = "4 4 4";
    String expected = "No";

    assertThat(execute(input + "\n"), is(expected + "\n"));
  }

  @Test
  public void test2() {
    String input = "3 3 4";
    String expected = "Yes";

    assertThat(execute(input + "\n"), is(expected + "\n"));
  }

  private String execute(String input) {
    ByteArrayOutputStream os = new ByteArrayOutputStream();
    Main.solve(
        new ByteArrayInputStream(input.getBytes()), new PrintStream(os)
    );
    return os.toString().replace(System.lineSeparator(), "\n");
  }

}