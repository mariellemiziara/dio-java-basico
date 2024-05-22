package StreamAPI;

import java.util.ArrayList;
import java.util.List;

import List.OperacoesBasicas.Item;

public class CarrinhoDeCompra {
      private List<Item> itemList;
  //construtor
  public void CarrinhoDeCompras() {
    this.itemList = new ArrayList<>();
  }
  
  //método para calcular valor total dos itens utilizando o Stream API
  public double calcularValorTotal() {
    if (itemList.isEmpty()) {
      throw new RuntimeException("A lista está vazia!");
    }
    return itemList.stream()
        .mapToDouble(item -> item.getPreco() * item.getQuant())
        .sum();
  }
}
