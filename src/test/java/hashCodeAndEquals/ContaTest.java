package hashCodeAndEquals;

import static com.google.common.collect.Lists.newArrayList;

import java.util.List;

import org.testng.annotations.Test;

/**
 * @author patricia.nascimento@objectos.com.br (Patricia Nascimento)
 */
@Test
public class ContaTest {

  public void insere_e_remove_contas() {

    List<Conta> contas = newArrayList();
    ContaCorrente cc = new ContaCorrente();
    contas.add(cc);
    contas.add(cc);
    contas.remove(cc);

    System.out.print(contas.size());
  }

}