import java.util.Comparator;
import java.util.List;

public class OperacoesStreamObjetos {
    public static void main(String[] args) {

        // Lista imutável de produtos com nome e preço variados
        List<Produto> produtos = List.of(
                new Produto("Tênis", 70.00),
                new Produto("iphone", 7000.00),
                new Produto("Tablet", 800.00),
                new Produto("Kit de canetas", 20.00),
                new Produto("Caneca", 30.00),
                new Produto("Feijão", 8.00),
                new Produto("milho", 2.00)
        );

        // Stream 1. Filtra produtos com preço maior ou igual a R$ 50
        // filter(). mantém só os produtos onde o preço é >= 50
        // toList(). coleta o resultado numa lista imutável (Java 16+)
        List<Produto> filtrarPreco = produtos.stream()
                .filter(produto -> produto.preco >= 50.00)
                .toList();
        System.out.println("Produtos filtrados: " + filtrarPreco);

        // Stream 2. Ordena os produtos por preço do menor para o maior
        // sorted(). ordena o stream usando um Comparator
        // Comparator.comparingDouble(). compara os produtos pelo atributo preço (double)
        List<Produto> ordenarPreco = produtos.stream()
                .sorted(Comparator.comparingDouble(p -> p.preco))
                .toList();
        System.out.println("Produtos ordenados: " + ordenarPreco);

        // Stream 3. Calcula a soma dos preços de todos os produtos
        // mapToDouble(). converte Stream<Produto> para DoubleStream usando o preço
        // sum(). soma todos os valores do DoubleStream
        double somarPrecoProdutos = produtos.stream()
                .mapToDouble(p -> p.preco)
                .sum();
        System.out.println("Soma dos preços dos produtos: " + somarPrecoProdutos);

        // Stream 4. Extrai só os nomes dos produtos
        // map(). transforma cada Produto numa String com o seu nome
        // resultado é List<String>, pois o map mudou o tipo do stream
        List<String> nomeProduto = produtos.stream()
                .map(produto -> produto.nome)
                .toList();
        System.out.println("Nome dos produtos: " + nomeProduto);

        // Stream 5. forEach com lambda.  Percorre e exibe cada produto
        // lambda -> recebe o produto e chama o println explicitamente
        produtos.stream()
                .forEach(produto -> System.out.println(produto));

        // Stream 6. forEach com method reference. mesma coisa que o stream 5
        // System.out::println. atalho elegante para a lambda acima
        // use :: quando a lambda só chama um método sem lógica extra
        produtos.stream()
                .forEach(System.out::println);

        // Stream 7. Combina filter com forEach
        // filtra os produtos acima de R$ 50 e exibe cada um com method reference
        produtos.stream()
                .filter(produto -> produto.preco > 50.00)
                .forEach(System.out::println);
    }
}