import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class OperacoesStream {
    public static void main(String[] args) {

        // Lista imutável de números. mistura de positivos, negativos, pares e ímpares
        List<Integer> numeros = List.of(1, 2, 5, 8, -3, -2, -7, -8);

        // Stream 1. Filtra os pares e dobra cada um
        // filter(). mantém só os números onde o resto da divisão por 2 é zero
        // map(). transforma cada número multiplicando por 2
        // collect(). coleta o resultado numa nova lista
        List<Integer> resultado = numeros.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .collect(Collectors.toList());
        System.out.println("Pares dobrados: " + resultado);

        // Stream 2. Filtra só os números positivos
        // filter(). mantém só os números maiores que zero
        List<Integer> numerosPositivos = numeros.stream()
                .filter(n -> n > 0)
                .collect(Collectors.toList());
        System.out.println("Números positivos: " + numerosPositivos);

        // Stream 3. Calcula a soma de todos os números
        // mapToInt(). converte Stream<Integer> para IntStream de primitivos
        // sum(). soma todos os elementos do IntStream
        int soma = numeros.stream()
                .mapToInt(n -> n)
                .sum();
        System.out.println("Soma final: " + soma);

        // Stream 4. Calcula a média de todos os números
        // average(). retorna OptionalDouble. Pode estar vazio se a lista estiver vazia
        OptionalDouble media = numeros.stream()
                .mapToInt(n -> n)
                .average();

        // isPresent(). verifica se o Optional tem valor antes de acessar
        // getAsDouble(). retorna o valor como double
        if (media.isPresent()) {
            System.out.println("Média final: " + media.getAsDouble());
        } else {
            System.out.println("A lista está vazia!");
        }

        // Stream 5. Encontra o maior número da lista
        // max(). retorna OptionalInt. Pode estar vazio se a lista estiver vazia
        OptionalInt maiorNumero = numeros.stream()
                .mapToInt(n -> n)
                .max();

        // getAsInt(). retorna o valor como int se estiver com números na lista
        if (maiorNumero.isPresent()) {
            System.out.println("Maior número: " + maiorNumero.getAsInt());
        } else {
            System.out.println("A lista está vazia!");
        }
    }
}