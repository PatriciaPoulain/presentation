/*
 * ContaConjunta.java criado em 20/02/2015
 * 
 * Propriedade de Objectos Fábrica de Software LTDA.
 * Reprodução parcial ou total proibida.
 */
package modificadorEstatico;

/**
 * @author patricia.nascimento@objectos.com.br (Patricia Nascimento)
 */
class Classe1 {

  public static int contador = 0;

  public int outroContador = 0;

  public Classe1() {
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