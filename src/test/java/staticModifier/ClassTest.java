/*
 * TesteDeContaConjunta.java criado em 20/02/2015
 * 
 * Propriedade de Objectos Fábrica de Software LTDA.
 * Reprodução parcial ou total proibida.
 */
package staticModifier;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import staticModifier.Class;

/**
 * @author patricia.nascimento@objectos.com.br (Patricia Nascimento)
 */
@Test
public class ClassTest {

  public void teste() {
    Class c1 = new Class();
    Class.incrementaContador();
    c1.incrementaOutroContador();

    assertEquals(Class.contador, 1);
    assertEquals(c1.outroContador, 1);

    Class c2 = new Class();
    Class.incrementaContador();
    c2.incrementaOutroContador();

    assertEquals(Class.contador, 2);
    assertEquals(c1.outroContador, 1);

    Class c3 = new Class();
    Class.incrementaContador();
    c3.incrementaOutroContador();

    assertEquals(Class.contador, 3);
    assertEquals(c1.outroContador, 1);
  }

}