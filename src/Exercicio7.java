/**
 * Exercício 7:
 * Dada uma matriz [3x2], gera a matriz transposta [2x3].
 * Também imprime a original e a transposta (como no exercício 6).
 */
public class Exercicio7 {

    /**
     * Transpõe uma matriz 3x2 para 2x3.
     *
     * @param matrizOriginal matriz [3][2]
     * @return matriz transposta [2][3]
     */
    public static int[][] transporMatriz3x2(int[][] matrizOriginal) {
        if (matrizOriginal == null || matrizOriginal.length != 3) {
            throw new IllegalArgumentException("A matriz original deve ter 3 linhas.");
        }

        for (int[] linha : matrizOriginal) {
            if (linha == null || linha.length != 2) {
                throw new IllegalArgumentException("Cada linha da matriz original deve ter 2 colunas.");
            }
        }

        int[][] transposta = new int[2][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                transposta[j][i] = matrizOriginal[i][j];
            }
        }

        return transposta;
    }

    /**
     * Reutiliza o padrão visual do exercício 6 para imprimir matriz de inteiros.
     */
    public static void imprimirMatriz(int[][] matriz) {
        for (int[] linha : matriz) {
            for (int valor : linha) {
                System.out.print("|" + "\t" + valor + "\t" + "|");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] original = {
                { 1, 2 },
                { 3, 4 },
                { 5, 6 }
        };

        int[][] transposta = transporMatriz3x2(original);

        System.out.println("Exercício 7");
        System.out.println("Matriz original [3x2]:");
        imprimirMatriz(original);

        System.out.println("Matriz transposta [2x3]:");
        imprimirMatriz(transposta);
        System.out.println();
    }
}
