import java.util.Arrays;

/**
 * Exercício 4:
 * Recebe um número decimal, converte para binário
 * e retorna na forma de vetor com 8 posições.
 */
public class Exercicio4 {

    /**
     * Converte um número decimal para vetor binário de 8 bits.
     *
     * @param decimal número decimal (0 a 255)
     * @return vetor binário de 8 posições
     */
    public static int[] decimalParaBinario(int decimal) {
        if (decimal < 0 || decimal > 255) {
            throw new IllegalArgumentException("O número decimal deve estar entre 0 e 255.");
        }

        int[] binario = new int[8];

        // Preenche do fim para o início usando resto da divisão por 2.
        for (int i = 7; i >= 0; i--) {
            binario[i] = decimal % 2;
            decimal = decimal / 2;
        }

        return binario;
    }

    public static void main(String[] args) {
        int decimal = 156;
        int[] binario = decimalParaBinario(decimal);

        System.out.println("Exercício 4");
        System.out.println("Decimal " + decimal + " em binário: " + Arrays.toString(binario));
        System.out.println();
    }
}
