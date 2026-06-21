package streams;

import java.util.List;
import java.util.Optional;

public class ExemploOptional {

    // Método que busca um produto pelo nome na lista
    // retorna Optional<Produto>. pode ter valor ou estar vazio
    static Optional<Produto> buscarProduto(List<Produto> produtos, String nome) {
        return produtos.stream()
                // filter(). compara o nome de cada produto com o nome buscado
                .filter(produto -> produto.nome.equals(nome))
                // findFirst(). retorna o primeiro produto encontrado como Optional
                // se não encontrar nada, retorna Optional.empty()
                .findFirst();
    }

    public static void main(String[] args) {

        // Lista imutável de produtos para testar a busca
        List<Produto> produtos = List.of(
                new Produto("Feijão", 8.00),
                new Produto("Tênis", 70.00)
        );

        // Busca um produto que existe na lista
        Optional<Produto> resultado = buscarProduto(produtos, "Tênis");

        // isPresent(). verifica se o Optional tem valor antes de acessar
        // get(). retorna o valor do Optional com segurança
        if (resultado.isPresent()) {
            System.out.println(resultado.get());
        } else {
            System.out.println("Produto não encontrado!");
        }

        // Busca um produto que não existe na lista
        // resultado2 vai ser Optional.empty()
        Optional<Produto> resultado2 = buscarProduto(produtos, "Arroz");

        // orElse(). retorna o valor do Optional se existir
        // se estiver vazio, retorna o Produto padrão definido
        Produto naoEncontrado = resultado2.orElse(new Produto("Não encontrado", 00.00));
        System.out.println(naoEncontrado);
    }
}