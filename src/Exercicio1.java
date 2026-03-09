import java.util.Arrays;

/**
 * Exercício 1:
 * Cria um método que recebe um vetor de 8 posições,
 * inverte a ordem dos itens e retorna o vetor invertido.
 */
public class Exercicio1 {

    /**
     * Inverte os valores de um vetor de 8 posições.
     *
     * @param vetor vetor de entrada
     * @return novo vetor com os elementos invertidos
     */
    public static int[] inverterVetor(int[] vetor) {
        if (vetor == null || vetor.length != 8) {
            throw new IllegalArgumentException("O vetor deve possuir exatamente 8 posições.");
        }

        int[] invertido = new int[8];

        // Copia do fim para o início.
        for (int i = 0; i < vetor.length; i++) {
            invertido[i] = vetor[vetor.length - 1 - i];
        }

        return invertido;
    }

    public static void main(String[] args) {
        int[] original = { 10, 20, 30, 40, 50, 60, 70, 80 };
        int[] invertido = inverterVetor(original);

        System.out.println("Exercício 1");
        System.out.println("Original : " + Arrays.toString(original));
        System.out.println("Invertido: " + Arrays.toString(invertido));
        System.out.println();
    }
}
