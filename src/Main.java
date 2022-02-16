import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<Partit> resultatquarts = new ArrayList<>();
        resultatquarts.add(createdgame());
        printPartit(resultatquarts);

        int resultatFinal = mostrarresultadoFinal(resultatquarts);

        System.out.println("El resultat final es: "+resultatFinal);
    }

    private static int mostrarresultadoFinal(List<Partit> resultatquarts) {
        int score = 0;
        for (Partit resultat:resultatquarts)
              {


            score += compareResultat(resultat.getResultat1quart());
            score += compareResultat(resultat.getResultat2quart());
            score += compareResultat(resultat.getResultat3quart());
            score += compareResultat(resultat.getResultat4quart());


        }

    return score;

    }
    private static int compareResultat(String resultatPartit){
        int score = 0;
        switch (resultatPartit.toUpperCase()){
            case "V"-> score += 3;
            case "D"-> score += 1;
            case "E"-> score += 2;
        }
        
        return  score;
    }
    private static void printPartit(List<Partit> resultatquarts) {
        for (Partit partit : resultatquarts) System.out.println(partit);
    }

    private static Partit createdgame() {

        String resultat1quart = askForResultQuart();
        String resultat2quart = askForResultQuart();
        String resultat3quart = askForResultQuart();
        String resultat4quart = askForResultQuart();

        Partit partit = new Partit(resultat1quart, resultat2quart, resultat3quart, resultat4quart);

        System.out.println("El resultat del partit es ");

        return partit;


    }


    private static String askForResultQuart() {
        System.out.println("entra el resultat del primer quart ");
        Scanner scanner = new Scanner(System.in);
        String option = scanner.nextLine();
        return option;
    }
}
