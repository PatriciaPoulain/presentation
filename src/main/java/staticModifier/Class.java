/*
 * Copyright 2015 Objectos, Fábrica de Software LTDA.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
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