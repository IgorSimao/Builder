public class Cliente {
    public static void main(String[] args) {
        Celular celular = new CelularBuilder()
                    .marca("Samsung")
                    .modelo("Galaxy S21")
                    .cor("Branco")
                    .memoria(128)
                    .tamanhoTela(6.2)
                    .build();

        System.out.println(celular);
    }
}
