import java.util.ArrayList;

public class FiltroLinguagens {
    public static void main(String[] args) {

        // Utiliza inferência de tipo para criar uma lista dinâmica de Strings.
        var linguagens = new ArrayList<String>();

        // Adiciona linguagens de programação à lista.
        linguagens.add("Java");
        linguagens.add("Python");
        linguagens.add("C#");

        // size() retorna a quantidade de elementos armazenados na lista.
        System.out.println(
                "Número de linguagens na lista: "
                        + linguagens.size()
        );

        // getFirst() retorna o primeiro elemento da lista.
        System.out.println(
                "Primeira linguagem da lista: "
                        + linguagens.getFirst()
        );

        // getLast() retorna o último elemento da lista.
        System.out.println(
                "Última linguagem da lista: "
                        + linguagens.getLast()
        );

    }
}