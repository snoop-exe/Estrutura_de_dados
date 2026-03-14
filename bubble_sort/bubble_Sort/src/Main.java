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

       int aux;
       boolean controle;
       long inicio = System.currentTimeMillis();
       int cont = 0;

       for(int i = 0; i < vetor.length;i++) {
           controle = true;
           for (int j = 0; j < (vetor.length - 1); j++) {
               if (vetor[j] > vetor[j + 1]) {
                   aux = vetor[j];
                   vetor[j] = vetor[j + 1];
                   vetor[j + 1] = aux;
                   controle = false;
                   cont++;
               }
           }
           if (controle) {
               break;
           }

       }
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto: " + (fim - inicio) + "ms");
        System.out.println("Modificações no vetor: " + cont);
    }
}