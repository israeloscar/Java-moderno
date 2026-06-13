import java.util.List;
import java.util.stream.Collectors;

public class OperacoesStreamString {
    public static void main(String[] args) {

        // Lista imutável de nomes com letras iniciais variadas
        List<String> nomes = List.of("Ana", "Bruno", "Alice", "Carlos", "Amanda", "Beatriz", "André", "Camila");

        // Stream 1. Filtra só os nomes que começam com "A"
        // startsWith(). verifica se a String começa com o texto informado
        List<String> filtrar = nomes.stream()
                .filter(nome -> nome.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println("Nomes filtrados: " + filtrar);

        // Stream 2. Converte todos os nomes para maiúscula
        // map(). transforma cada elemento. aqui usa toUpperCase() em cada nome
        List<String> maiuscula = nomes.stream()
                .map(n -> n.toUpperCase())
                .collect(Collectors.toList());
        System.out.println("Nomes com letras maiúsculas: " + maiuscula);

        // Stream 3. Ordena os nomes em ordem alfabética
        // sorted(). ordena o stream automaticamente em ordem natural (A-Z para Strings)
        List<String> ordenar = nomes.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Nomes ordenados: " + ordenar);

        // Stream 4. Encadeia filter, map e sorted num único pipeline
        // filtra os nomes que começam com "A", converte para maiúscula e ordena
        // mais eficiente, pois percorre a lista uma única vez
        List<String> resultado = nomes.stream()
                .filter(nome -> nome.startsWith("A"))
                .map(nome -> nome.toUpperCase())
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Nomes filtrados, maiúsculos e ordenados: " + resultado);
    }
}