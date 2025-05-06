package EsercizioN2;

import java.util.Scanner;

public class WhileExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Scrivi una o più parole");
        String parola = scanner.nextLine();

        String stop = ":q";


        while(!parola.equals(stop)){
            String parolaScomposta = "";

            for (int i = 0; i < parola.length(); i++) {
                char lettera = parola.charAt(i);
                parolaScomposta = parolaScomposta + lettera + ",";
            }

            if (parolaScomposta.endsWith(",")) {
                parolaScomposta = parolaScomposta.substring(0, parolaScomposta.length() - 1);
            }
            System.out.println(parolaScomposta);

            System.out.println("Scrivi una o più parole");
            parola = scanner.nextLine();
        }

    }
}
