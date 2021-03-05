import java.util.Arrays;

public class DocTester {

    public DocTester() {
    }

    // Oefening 1 met String-methoden toLowerCase en toUpperCase
    public void printLowerUpperCase(String woord) {
        System.out.println(woord.toLowerCase());
        System.out.println(woord.toUpperCase());
    }

    // Oefening 2 met methode replaceAll()
    public String schrapLeestekensSpaties(String zin) {
        // RegEx "\W" beschrijft a non-word character
        // non-word characters zijn alle karakters behalve letters en cijfers
        return zin.replaceAll("\\W", "");
        // The backslash \ is an escape character in Java Strings.
        // That means backslash has a predefined meaning in Java.
        // You have to use double backslash \\ to define a single backslash.
        // If you want to define \W, then you must be using \\W in your regex.
    }

    // Oefening 3 lange versie met methode charAt()
    public void printKlinkerSpatieLang(String woord) {
        for (int i = 0; i < woord.length(); i++) {
            char teken = woord.charAt(i);
            switch (teken) {
                case 'A':
                case 'a':
                case 'E':
                case 'e':
                case 'I':
                case 'i':
                case 'O':
                case 'o':
                case 'U':
                case 'u':
                case 'Y':
                case 'y':
                    System.out.print(" ");
                    break;
                default:
                    System.out.print(teken);
            }
        }
        System.out.println();
    }

    // Oefening 3 korte versie met methode replaceAll
    public void printKlinkerSpatieKort(String woord) {
        String nieuw = woord.replaceAll("[AEIOUYaeiou]", " ");
        System.out.println(nieuw);
    }

    // Oefening 4 met String-methodes trim, substring en equals
    public boolean isPalindroom(String woord) {
        String inversWoord = "";
        woord = woord.trim().toLowerCase();

        for (int i = woord.length() - 1; i >= 0; i--) {
            inversWoord += woord.substring(i, i + 1);
        }

        if (inversWoord.equals(woord)) {
            return true;
        } else {
            return false;
        }
    }

    // Oefening 5 met methode split()
    public void printWoorden(String zin) {
        String[] woorden = zin.split(" ");
        for (String woord : woorden) {
            System.out.println(woord);
        }
    }

    // Oefening 6 met String-methode length
    public float printGemiddeldAantalLetters(String[] woorden) {
        int aantalWoorden = woorden.length;
        int aantalLetters = 0;
        for (int i = 0; i < aantalWoorden; i++) {
            aantalLetters += woorden[i].length();
        }
        return (float) aantalLetters / aantalWoorden;
    }

    // Oefening 7 met klassenmethodes van de klasse Arrays
    public void printNamenAlfabetisch(String[] namen) {
        // array namen sorteren met klassenmethode sort()
        Arrays.sort(namen);
        // array afdrukken met klassenmethode toString()
        System.out.println(Arrays.toString(namen));
        // array afdrukken met klassenmethode asList()
        System.out.println(Arrays.asList(namen));
        // array afdrukkenmet foreach-lus
        for (String naam : namen) {
            System.out.print(naam + " ");
        }
        System.out.println();
        // array afdrukken met for-lus
        for (int i = 0; i < namen.length; i++) {
            System.out.print(namen[i] + " ");
        }
        System.out.println();
    }

    public void printKortsteLangste(String[] woorden) {
        String kortste = woorden[0];
        String langste = woorden[0];
        for (String woord : woorden) {
            if (woord.length() < kortste.length()) {
                kortste = woord;
            }
            if (woord.length() > langste.length()) {
                langste = woord;
            }
        }
        System.out.println("Kortste woord: " + kortste);
        System.out.println("Langste woord: " + langste);
    }

    // Oefening 12 Uitbreiding: return kortste woorden in array
    public String[] printKortste(String[] woorden) {
        String[] kortste = new String[woorden.length];
        int lengteKortste = woorden[0].length();

        for (String woord : woorden) {
            if (woord.length() < lengteKortste) {
                lengteKortste = woord.length();
            }
        }

        int i = 0;
        for (String woord : woorden) {
            if (woord.length() == lengteKortste) {
                kortste[i] = woord;
                i++;
            }

        }
        return kortste;
    }

    // Oefening 12 Uitbreiding: return langste woorden in array
    public String[] printLangste(String[] woorden) {
        String[] langste = new String[woorden.length];
        int lengteLangste = woorden[0].length();

        for (String woord : woorden) {
            if (woord.length() > lengteLangste) {
                lengteLangste = woord.length();
            }
        }

        int i = 0;
        for (String woord : woorden) {
            if (woord.length() == lengteLangste) {
                langste[i] = woord;
                i++;
            }

        }
        return langste;
    }
}


