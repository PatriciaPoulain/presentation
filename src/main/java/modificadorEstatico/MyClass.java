/*
 * MyClass.java criado em 23/02/2015
 * 
 * Propriedade de Objectos Fábrica de Software LTDA.
 * Reprodução parcial ou total proibida.
 */
package modificadorEstatico;

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