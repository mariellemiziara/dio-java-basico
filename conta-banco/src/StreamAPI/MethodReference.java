package StreamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import List.Ordenacao.Pessoa;

public class MethodReference {
     private List<Pessoa> pessoaList;

  //construtor
  public void OrdenacaoPessoa() {
    this.pessoaList = new ArrayList<>();
  }

  public List<Pessoa> ordenarPorAltura() {
    if (!pessoaList.isEmpty()) {
      List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
      pessoasPorAltura.sort(Comparator.comparingDouble(Pessoa::getAltura));
      return pessoasPorAltura;
    } else {
      throw new RuntimeException("A lista está vazia!");
    }
  }
}
