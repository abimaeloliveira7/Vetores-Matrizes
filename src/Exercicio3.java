/**
 * Exercício 3:
 * Cria um método que recebe um número binário na forma
 * de vetor com 8 posições e retorna o valor decimal.
 */
public class Exercicio3 {

    /**
     * Converte um vetor binário de 8 bits para decimal.
     * Exemplo: [0,0,0,0,1,0,1,0] -> 10
     *
     * @param binario vetor de 8 posições contendo apenas 0 e 1
     * @return valor decimal correspondente
     */
    public static int binarioParaDecimal(int[] binario) {
        if (binario == null || binario.length != 8) {
            throw new IllegalArgumentException("O vetor binário deve possuir exatamente 8 posições.");
        }

        int decimal = 0;

        for (int i = 0; i < binario.length; i++) {
            int bit = binario[i];

            if (bit != 0 && bit != 1) {
                throw new IllegalArgumentException("O vetor binário deve conter somente 0 e 1.");
            }

            // Desloca o valor acumulado 1 casa à esquerda e adiciona o bit atual.
            decimal = (decimal << 1) + bit;
        }

        return decimal;
    }

    public static void main(String[] args) {
        int[] binario = { 0, 0, 0, 0, 1, 0, 1, 0 }; // 10
        int decimal = binarioParaDecimal(binario);

        System.out.println("Exercício 3");
        System.out.println("Decimal: " + decimal);
        System.out.println();
    }
}
