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