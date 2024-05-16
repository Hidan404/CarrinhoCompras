
public class Item {
    String nomeProduto;
    double preco;
    int quantidade;
    public Item(String nomeProduto, double preco, int quantidade) {
        this.nomeProduto = nomeProduto;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    public String getNomeProduto() {
        return nomeProduto;
    }
    public double getPreco() {
        return preco;
    }
    public int getQuantidade() {
        return quantidade;
    }
    @Override
    public String toString() {
        return "Item [nomeProduto=" + nomeProduto + ", preco=" + preco + ", quantidade=" + quantidade + "]";
    }

    
}
