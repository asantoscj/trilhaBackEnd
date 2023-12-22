package principal;

import entity.Categoria;
import entity.Lancamento;
import entity.Produto;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        //dadosCategoria();
        //dadosLancamento();
        dadosProduto();
    }

    public static void dadosCategoria() {

        var categoria01 = new Categoria(1L, "Salário", "Recebimento de Salário");
        var categoria02 = new Categoria();

        categoria02.setId(2l);
        categoria02.setName("Lazer");
        categoria02.setDescription("Férias");

        System.out.println(categoria01.toString() + "\n");
        System.out.println(categoria02.toString() + "\n");
    }

    public static void dadosLancamento() {

        var lancamento01 = new Lancamento(3L,
                "Salário na Empresa X",
                "Adiantamento quinzenal",
                "revenue",
                "4405,49",
                "15/09/2021",
                true,
                4L);
        var lancamento02 = new Lancamento();

        lancamento02.setId(4l);
        lancamento02.setName("Saúde");
        lancamento02.setDescription("Cirurgia");
        lancamento02.setType("Convênio");
        lancamento02.setAmount("567,98");
        lancamento02.setDate("02/11/2023");
        lancamento02.setPaid(true);
        lancamento02.setCategoryId(6l);

        System.out.println(lancamento01.toString() + "\n");
        System.out.println(lancamento02.toString());
    }

    public static void dadosProduto() {
        var listaProdutos01 = new ArrayList<Produto>();
        listaProdutos01.add(new Produto(1L, "TV", "TV 40 Polegadas", 2244.78));
        listaProdutos01.add(new Produto(2L, "TV", "TV 44 Polegadas", 2254.78));
        listaProdutos01.add(new Produto(3L, "TV", "TV 50 Polegadas", 2264.78));
        listaProdutos01.add(new Produto(4L, "TV", "TV 55 Polegadas", 2274.78));
        listaProdutos01.add(new Produto(5L, "TV", "TV 60 Polegadas", 2284.78));


        var listaProdutos02 = new ArrayList<Produto>();
        listaProdutos02.add(new Produto(1L, "Laptop", "Laptop intel core i3", 3256.97));
        listaProdutos02.add(new Produto(2L, "Laptop", "Laptop intel core i5", 3266.97));
        listaProdutos02.add(new Produto(1L, "Laptop", "Laptop intel core i7", 3276.97));

        var produtoMaisCaroLista01 = new Produto();
        var precoProdutoLista01 = 0D;

        for (Produto produto:listaProdutos01) {
            if (produto.getPrice() > precoProdutoLista01 ) {
                precoProdutoLista01 = produto.getPrice();
                produtoMaisCaroLista01 = produto;
            }
        }

        var produtoMaisCaroLista02 = new Produto();
        var precoProdutoLista02 = 0D;

        for (Produto produto:listaProdutos02) {
            if (produto.getPrice() > precoProdutoLista02 ) {
                precoProdutoLista02 = produto.getPrice();
                produtoMaisCaroLista02 = produto;
            }
        }

        System.out.println("Produtos mais caros: \n" + produtoMaisCaroLista01 + produtoMaisCaroLista02 + "\n\n");
        System.out.println("Todos os produtos: \n"+ listaProdutos01 + "\n\n" + listaProdutos02);
    }

}
