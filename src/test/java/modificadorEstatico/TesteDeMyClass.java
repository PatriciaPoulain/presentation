/*
 * TesteDeMyClass.java criado em 23/02/2015
 * 
 * Propriedade de Objectos Fábrica de Software LTDA.
 * Reprodução parcial ou total proibida.
 */
package modificadorEstatico;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

/**
 * @author patricia.nascimento@objectos.com.br (Patricia Nascimento)
 */
public class TesteDeMyClass {

  @Test
  public void teste() {
    MyClass myClass0 = new MyClass();
    MyClass.x = 10;

    MyClass myClass1 = new MyClass();
    MyClass.x = 20;

    assertEquals(myClass0.x, 20);
    assertEquals(myClass1.x, 20);
    assertEquals(MyClass.x, 20);
  }

}