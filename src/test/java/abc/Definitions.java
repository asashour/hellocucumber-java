package abc;

import io.cucumber.java.en.When;

public class Definitions {

  @When("use {}")
  public void use(Abc abc) {
    System.out.println(abc);
  }

  public enum Abc {a, b, c}
}
