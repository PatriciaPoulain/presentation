/*
 * ContaConjunta.java criado em 20/02/2015
 * 
 * Propriedade de Objectos Fábrica de Software LTDA.
 * Reprodução parcial ou total proibida.
 */
package staticModifier;

/**
 * @author patricia.nascimento@objectos.com.br (Patricia Nascimento)
 */
class Class {

  public static int contador = 0;

  public int outroContador = 0;

  public Class() {
  }

  public static void incrementaContador() {
    contador++;
    System.out.println("contador agora é: " + contador);
  }

  public void incrementaOutroContador() {
    outroContador++;
    System.out.println("outroContador agora é: " + outroContador);
  }

}