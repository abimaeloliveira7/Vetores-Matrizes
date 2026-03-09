/**
 * Exercício 6:
 * Escreve um método para imprimir no console uma matriz
 * de duas dimensões seguindo o padrão com barras e TAB.
 */
public class Exercicio6 {

    /**
     * Imprime uma matriz 2D no console no formato:
     * |\tvalor\t||\tvalor\t|...
     *
     * @param matriz matriz bidimensional de qualquer tipo de objeto
     */
    public static void imprimirMatriz(Object[][] matriz) {
        if (matriz == null) {
            throw new IllegalArgumentException("A matriz não pode ser nula.");
        }

        for (Object[] linha : matriz) {
            if (linha == null) {
                System.out.println("|\tNULL\t|");
                continue;
            }

            for (Object valor : linha) {
                // Padrão pedido no enunciado: | + TAB + valor + TAB + |
                System.out.print("|" + "\t" + valor + "\t" + "|");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        String[][] matriz = {
                { "X", "X" },
                { "Y", "Y" },
                { "Z", "Z" }
        };

        System.out.println("Exercício 6");
        imprimirMatriz(matriz);
        System.out.println();
    }
}
