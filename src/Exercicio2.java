import java.util.Arrays;

/**
 * Exercício 2:
 * Cria um método que recebe 3 vetores com 8 posições
 * e retorna uma matriz 8x3 com os valores dos vetores.
 */
public class Exercicio2 {

    /**
     * Monta uma matriz [8][3] usando 3 vetores [8].
     *
     * @param vetor1 primeiro vetor
     * @param vetor2 segundo vetor
     * @param vetor3 terceiro vetor
     * @return matriz 8x3
     */
    public static int[][] montarMatriz(int[] vetor1, int[] vetor2, int[] vetor3) {
        if (vetor1 == null || vetor2 == null || vetor3 == null
                || vetor1.length != 8 || vetor2.length != 8 || vetor3.length != 8) {
            throw new IllegalArgumentException("Todos os vetores devem possuir exatamente 8 posições.");
        }

        int[][] matriz = new int[8][3];

        for (int i = 0; i < 8; i++) {
            matriz[i][0] = vetor1[i];
            matriz[i][1] = vetor2[i];
            matriz[i][2] = vetor3[i];
        }

        return matriz;
    }

    public static void main(String[] args) {
        int[] v1 = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int[] v2 = { 10, 20, 30, 40, 50, 60, 70, 80 };
        int[] v3 = { 100, 200, 300, 400, 500, 600, 700, 800 };

        int[][] matriz = montarMatriz(v1, v2, v3);

        System.out.println("Exercício 2");
        for (int[] linha : matriz) {
            System.out.println(Arrays.toString(linha));
        }
        System.out.println();
    }
}
