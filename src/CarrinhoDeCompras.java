import java.util.ArrayList;
import java.util.List;

import javax.management.RuntimeErrorException;

public class CarrinhoDeCompras {
    
    List<Item> items = new ArrayList<>();

    public void adicionarItem(String nome, double preco, int quantidade){
        items.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> removeritem = new ArrayList<>();
        for (Item item : items) {
            if(item.getNomeProduto().equals(removeritem)){
                removeritem.add(item);
            }
        }
    }

    public double calcularValorTotal(){
        double total = 0;
       if(!items.isEmpty()){
            for (Item item : items) {
                double valorProduto =item.preco * item.quantidade;
                total+= valorProduto;
            }
           return total; 
       }
       else{
            throw new RuntimeException("A lista nao tem elementos");
       }
    }
}
