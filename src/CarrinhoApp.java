public class CarrinhoApp {
    public static void main(String[] args) {
        CarrinhoDeCompras compra = new CarrinhoDeCompras();

        compra.adicionarItem("Caderno", 9.49, 5);
        compra.adicionarItem("Sardinha", 5.75, 10);

        System.out.println(compra.calcularValorTotal());

        compra.removerItem("Caderno");
        compra.exibirItems();
    }
}
