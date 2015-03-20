package staticModifier;

/**
 * @author patricia.nascimento@objectos.com.br (Patricia Nascimento)
 */
class MyClass {

  static int x = result();

  static int result() {
    return 20;
  }

  int nonStaticResult() {
    return result();
  }

}

class Person {
  static class Address {}
  static interface MyInterface {}
}