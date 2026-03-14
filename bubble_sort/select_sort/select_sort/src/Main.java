import java.util.Arrays;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] vetor = new int[100000];
        Random random = new Random();

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = i;
        }

        for (int i = 0; i < vetor.length; i++) {

            int j = random.nextInt(vetor.length);
            int aux = vetor[i];

            vetor[i] = vetor[j];
            vetor[j] = aux;
        }
//        System.out.println("Vetor desordenado: " + Arrays.toString(vetor));
        int cont = 0;
        long inicio = System.currentTimeMillis();
        for (int j = 0; j < (vetor.length  - 1);j++){
            int indice_menor = j;

            for (int i = j + 1; i < vetor.length; i++) {
                if (vetor[i] < vetor[indice_menor]) {
                    indice_menor = i;
                }
            }
            cont++;
            int aux = vetor[indice_menor];
            vetor[indice_menor] = vetor[j];
            vetor[j] = aux;

        }
        long Final = System.currentTimeMillis();
        System.out.println("Modificações no vetor: " + cont);
        System.out.println("Tempo gasto: " + (Final - inicio) + "ms");
        System.out.println("Vetor ordenado: " + Arrays.toString(vetor));
        }

    }
