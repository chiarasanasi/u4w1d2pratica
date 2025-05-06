package EsercizioN4;

import java.util.Scanner;

public class ForExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dimmi un numero intero");
        int numeroIntero = scanner.nextInt();

        for (int i = numeroIntero; i >= 0; i--) {
            if(i==0){
                System.out.println("VIA!");
            }else{
                System.out.println(i);
            }
        }
    }
}
