public record ProdutoRecords(

        // Componentes do Record.
        // O Java gera automaticamente construtor,
        // métodos de acesso, toString, equals e hashCode.
        String nome,
        double preco

) {
    public static void main(String[] args) {

        // Cria dois objetos com os mesmos valores.
        // Para Records, objetos com dados iguais
        // são considerados iguais pelo equals().
        ProdutoRecords tenis =
                new ProdutoRecords("Tênis", 70.00);

        ProdutoRecords tenis2 =
                new ProdutoRecords("Tênis", 70.00);

        // Utiliza o toString() gerado automaticamente.
        System.out.println(tenis);
        System.out.println(tenis2);

        // Compara os valores internos dos Records.
        // Como possuem os mesmos dados,
        // o resultado será true.
        System.out.println(
                "São iguais?: "
                        + tenis.equals(tenis2)
        );

    }

}