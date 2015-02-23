/*
 * TesteDeContaConjunta.java criado em 20/02/2015
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
@Test
public class TesteDeClasse1 {

  public void teste() {
    Classe1 c1 = new Classe1();
    Classe1.incrementaContador();
    c1.incrementaOutroContador();

    assertEquals(Classe1.contador, 1);
    assertEquals(c1.outroContador, 1);

    Classe1 c2 = new Classe1();
    Classe1.incrementaContador();
    c2.incrementaOutroContador();

    assertEquals(Classe1.contador, 2);
    assertEquals(c1.outroContador, 1);

    Classe1 c3 = new Classe1();
    Classe1.incrementaContador();
    c3.incrementaOutroContador();

    assertEquals(Classe1.contador, 3);
    assertEquals(c1.outroContador, 1);
  }

}