import java.util.HashMap;
import java.util.Map;

public class LivrariaServiceImplement implements LivrariaService {
    private Map<TipoProduto, Estoque> estoques = new HashMap<>();

    public LivrariaServiceImplement() {
        for (TipoProduto tipoProduto : TipoProduto.values()) {
            estoques.put(tipoProduto, new Estoque());
        }
    }

    @Override
    public void adicionarProduto(Produto produto) {
        estoques.get(produto.getTipoProduto()).adicionarProduto(produto);
    }

    @Override
    public Produto buscarProduto(Integer id) {
        for (Estoque estoque : estoques.values()) {
            Produto produto = estoque.buscarProduto(id);
            if (produto != null) {
                return produto;
            }
        }
        return null;
    }

    @Override
    public Produto buscarProduto(String nome) {
        for (Estoque estoque : estoques.values()) {
            Produto produto = estoque.buscarProduto(nome);
            if (produto != null) {
                return produto;
            }
        }
        return null;
    }

    @Override
    public Produto buscarProduto(Integer id, TipoProduto tipoProduto) {
        Estoque estoque = estoques.get(tipoProduto);
        if (estoque != null){
            return estoque.buscarProduto(id);
        }
        return null;
    }

    @Override
    public Produto buscarProduto(String nome, TipoProduto tipoProduto) {
        Estoque estoque = estoques.get(tipoProduto);
        if (estoque != null){
            return estoque.buscarProduto(nome);
        }
        return null;
    }

    @Override
    public boolean removerProduto(Integer id) {
        for (Estoque estoque : estoques.values()) {
            if (estoque.removerProduto(id)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean removerProduto(String nome) {
        for (Estoque estoque : estoques.values()) {
            if (estoque.removerProduto(nome)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean removerProduto(Integer id, TipoProduto tipoProduto) {
        Estoque estoque = estoques.get(tipoProduto);
        if (estoque != null){
            return estoque.removerProduto(id);
        }
        return false;
    }

    @Override
    public boolean removerProduto(String nome, TipoProduto tipoProduto) {
        Estoque estoque = estoques.get(tipoProduto);
        if (estoque != null){
            return estoque.removerProduto(nome);
        }
        return false;
    }

    @Override
    public int buscarQuantidadePorCategoria(TipoProduto tipoProduto) {
        Estoque estoque = estoques.get(tipoProduto);
        if (estoque != null){
            return estoque.getProdutos().size();
        }
        return 0;
    }

    @Override
    public void listarItensEstoque() {
        for (Estoque estoque : estoques.values()) {
            if (estoque != null){
                estoque.getProdutos().forEach(System.out::println);
            }
        }
    }

    @Override
    public void listarItensEstoque(TipoProduto tipoProduto) {
        Estoque estoque = estoques.get(tipoProduto);
        if (estoque != null){
            estoque.getProdutos().forEach(System.out::println);
        }
    }

    @Override
    public double venderProduto(Produto produto, int quantidade, Cliente comprador) {
        return ((VendaProduto)produto).venderProduto(quantidade, comprador);
    }
}
