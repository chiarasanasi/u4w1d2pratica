package EsercizioN1;

public class IfElseIf {
    public static void main(String[] args) {
        System.out.println("Esercizio numero 1");
        System.out.println(stringaPariDispari("Chiara"));
        System.out.println(stringaPariDispari("Alice"));
        System.out.println("Esercizio numero 2");
        System.out.println(annoBisestile(2000));
        System.out.println(annoBisestile(1990));
        System.out.println(annoBisestile(2024));
        System.out.println(annoBisestile(2023));

    }
    public static Boolean stringaPariDispari(String s1){
        if(s1.length()%2==0){
            return true;
        }else{
            return false;
        }
    }
    public static Boolean annoBisestile(int year){
        if(year%4==0 && year%100!=0){
            return true;
        }else if(year%4==0){
            return true;
        }
        else{
            return false;
        }

    }
}
