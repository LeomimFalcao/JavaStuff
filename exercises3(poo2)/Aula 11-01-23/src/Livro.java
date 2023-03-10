import java.util.Arrays;

public class Livro extends Produto {
    private String[] generos;
    private String escritor;
    private String editora;
    private final double VALOR_TOTAL_LIVROS_APLICAR_DESCONTO = 200;
    private final double PERCENTAGEM_DESCONTO = 0.15;

    public Livro(String nome, Integer id, double preco, int quantidade, boolean publicoAdulto, String[] generos, String escritor, String editora) {
        this.setNome(nome);
        this.setId(id);
        this.setPreco(preco);
        this.setQuantidade(quantidade);
        this.setPublicoAdulto(publicoAdulto);
        this.setTipoProduto(TipoProduto.LIVRO);
        this.generos = generos;
        this.escritor = escritor;
        this.editora = editora;
    }

    public String[] getGeneros() {
        return generos;
    }

    public void setGeneros(String[] generos) {
        this.generos = generos;
    }

    public String getEscritor() {
        return escritor;
    }

    public void setEscritor(String escritor) {
        this.escritor = escritor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    @Override
    public double venderProduto(int quantidade, Cliente comprador) {
        if (isPublicoAdulto() && !comprador.isMaiorDeIdade()) {
            System.out.println("Este produto tem venda permitida apenas para maiores de 18 anos.");
        } else if(decrementarQuantidade(quantidade)) {
            double valorTotal = getPreco() * quantidade;
            if(valorTotal >= VALOR_TOTAL_LIVROS_APLICAR_DESCONTO){
                double valorDesconto = valorTotal * PERCENTAGEM_DESCONTO;
                System.out.printf("Desconto de R$%.2f aplicado ao total de R$%.2f, ", valorDesconto, valorTotal);
                valorTotal -= valorDesconto;
                System.out.printf("valor final a ser pago = R$%.2f\n", valorTotal);
            }
            return valorTotal;
        } else {
            System.out.println("N??o h?? em estoque quantidade suficiente para realizar a venda.");
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Livro{" + super.toString() +
                ", generos=" + Arrays.toString(generos) +
                ", escritor='" + escritor + '\'' +
                ", editora='" + editora + '\'' +
                "} ";
    }
}