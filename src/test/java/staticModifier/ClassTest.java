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

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

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