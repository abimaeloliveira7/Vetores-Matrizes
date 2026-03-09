import java.util.Arrays;

/**
 * Exercício 5:
 * Recebe dois vetores de 5 posições cada e gera
 * um terceiro vetor com elementos intercalados.
 */
public class Exercicio5 {

    /**
     * Intercala os elementos dos dois vetores na ordem:
     * a[0], b[0], a[1], b[1], ...
     *
     * Observação: foi utilizado String[] para atender também o exemplo
     * com letras e números misturados.
     *
     * @param vetorA primeiro vetor de 5 posições
     * @param vetorB segundo vetor de 5 posições
     * @return vetor intercalado com 10 posições
     */
    public static String[] intercalarVetores(String[] vetorA, String[] vetorB) {
        if (vetorA == null || vetorB == null || vetorA.length != 5 || vetorB.length != 5) {
            throw new IllegalArgumentException("Os dois vetores devem possuir exatamente 5 posições.");
        }

        String[] intercalado = new String[10];
        int indiceSaida = 0;

        for (int i = 0; i < 5; i++) {
            intercalado[indiceSaida++] = vetorA[i];
            intercalado[indiceSaida++] = vetorB[i];
        }

        return intercalado;
    }

    public static void main(String[] args) {
        String[] vetor1 = { "A", "B", "C", "D", "E" };
        String[] vetor2 = { "1", "2", "3", "4", "5" };

        String[] resultado = intercalarVetores(vetor1, vetor2);

        System.out.println("Exercício 5");
        System.out.println(Arrays.toString(resultado));
        System.out.println();
    }
}
