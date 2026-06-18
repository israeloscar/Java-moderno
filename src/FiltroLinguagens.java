import java.util.ArrayList;

public class FiltroLinguagens {
    public static void main(String[] args) {

        var linguagens = new ArrayList<String>();

        linguagens.add("Java");
        linguagens.add("Python");
        linguagens.add("C#");

        System.out.println("Número de linguagens na lista: " + linguagens.size());
        System.out.println("A primeira linguagem a aparecer: " + linguagens.getFirst());
        System.out.println("última linguagem a aparecer: " + linguagens.getLast());

    }
}
