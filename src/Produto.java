// Classe que representa um produto com nome e preço
public class Produto {

    // Atributos do produto
    String nome;
    double preco;

    // Construtor. Inicializa o produto com nome e preço
    Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    // Define como o produto é exibido como texto
    // chamado automaticamente pelo System.out.println()
    @Override
    public String toString() {
        return nome + ": R$ " + preco;
    }
}