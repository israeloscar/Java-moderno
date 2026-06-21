package text_blocks;

public class ConsultaProdutos {
    public static void main(String[] args) {

        // Utiliza Text Block para representar uma consulta SQL.
        // A estrutura fica semelhante ao código utilizado em bancos de dados.
        var sql = """
                SELECT nome, preco
                FROM produtos
                WHERE preco > 100
                ORDER BY preco DESC;
                """;

        System.out.println(sql);

    }
}