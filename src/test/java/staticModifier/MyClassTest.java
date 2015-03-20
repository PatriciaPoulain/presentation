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
public class MyClassTest {

  @Test
  public void teste() {
    MyClass myClass0 = new MyClass();
    MyClass.x = 10;

    assertEquals(myClass0.x, MyClass.x);

    MyClass myClass1 = new MyClass();
    MyClass.x = 20;
    assertEquals(myClass1.x, MyClass.x);
    assertEquals(MyClass.x, 20);
  }

}