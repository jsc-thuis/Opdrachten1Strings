import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        DocTester dt = new DocTester();
        System.out.println("We testen de methodes uit de klasse DocTester... ");
        // Oefening 1
        dt.printLowerUpperCase("Van Der Neffe");
        // Oefening 2
        System.out.println(dt.schrapLeestekensSpaties("A non-word character: bv. 1) komma, 2) punt."));
        // Oefening 3
        dt.printKlinkerSpatieLang("Er was eens");
        dt.printKlinkerSpatieKort("Er was eens");
        // Oefening 4
        System.out.println(dt.isPalindroom("meetsysteem"));
        System.out.println(dt.isPalindroom("   Hannah"));
        // Oefening 5
        dt.printWoorden("Er was eens");
        // Oefening 6
        String[] woorden = {"beer", "egel", "cavia", "aap", "duif"};
        System.out.println(dt.printGemiddeldAantalLetters(woorden));
        // Oefening 7
        dt.printNamenAlfabetisch(woorden);
        dt.printKortsteLangste(woorden);
        String[] kortste = dt.printKortste(woorden);
        System.out.println(Arrays.toString(kortste));
        String[] langste = dt.printLangste(woorden);
        System.out.println(Arrays.toString(langste));
    }
}
    

