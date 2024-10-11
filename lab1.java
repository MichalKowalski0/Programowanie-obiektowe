//zad1
/*public class Main {
    public static void main(String[] args) {
        System.out.println("Michał Kowalski");
    }
}*/

//zad2
/*
public class Main {
    public static void main(String[] args) {
        String imie = "Michał";
        String nazwisko = "Kowalski";
        int dlugosc_imie = imie.length();
        int dlugosc_nazwisko = nazwisko.length();

        System.out.println("Imię: " + imie + ", długość: " + dlugosc_imie);
        System.out.println("Nazwisko: " + nazwisko + ", długość: " + dlugosc_nazwisko);
    }
}*/

//zad3
/*public class Main {
    public static void main(String[] args) {
        String wyraz1 = "Ala";
        String wyraz2 = "ma";
        String wyraz3 = "kota";
        String zdanie = wyraz1 + " " + wyraz2 + " " + wyraz3;
        System.out.println(zdanie);
    }
}*/

//zad4a
/*public class Main {
    public static void main(String[] args) {
        System.out.println("                       *");
        System.out.println("                       * *");
        System.out.println("                       * * *");
        System.out.println(" * * * * * * * * * * * * * * *");
        System.out.println(" * * * * * * * * * * * * * * * *");
        System.out.println(" * * * * * * * * * * * * * * *");
        System.out.println("                       * * *");
        System.out.println("                       * *");
        System.out.println("                       *");
    }
}*/

//zad4b
/*
public class Main {
    public static void main(String[] args) {
        // Romb
        System.out.println("     *");
        System.out.println("    * *");
        System.out.println("   * * *");
        System.out.println("  * * * *");
        System.out.println(" * * * * *");
        System.out.println("  * * * *");
        System.out.println("   * * *");
        System.out.println("    * *");
        System.out.println("     *");
    }
}*/

//zad5
/*
public class Main {
    public static void main(String[] args) {
        String zdanie = "Ala ma kota";
        String noweZdanie = zdanie.replace('a', 'e');

        System.out.println(noweZdanie);
    }
}*/

//zad6
/*
public class Main {
    public static void main(String[] args) {
        String zdanie = "Ala ma kota";

        StringBuilder noweZdanie = new StringBuilder();

        for (char znak : zdanie.toCharArray()) {
            if (Character.isUpperCase(znak)) {
                noweZdanie.append(Character.toLowerCase(znak));
            } else if (Character.isLowerCase(znak)) {
                noweZdanie.append(Character.toUpperCase(znak));
            } else {
                noweZdanie.append(znak);
            }
        }

        System.out.println(noweZdanie.toString());
    }
}*/

//zad7
/*public class Main {
    public static void main(String[] args) {
        char znak1 = 'A';
        char znak2 = '!';
        char znak3 = '@';
        char znak4 = '>';
        char znak5 = '~';
        char znak6 = '\b'; // backspace (ASCII 8)
        char znak7 = '\u0007'; // alarm (ASCII 7, zapisane w Unicode)

        System.out.println("Kod ASCII dla znaku 'A': " + (int) znak1);
        System.out.println("Kod ASCII dla znaku '!': " + (int) znak2);
        System.out.println("Kod ASCII dla znaku '@': " + (int) znak3);
        System.out.println("Kod ASCII dla znaku '>': " + (int) znak4);
        System.out.println("Kod ASCII dla znaku '~': " + (int) znak5);
        System.out.println("Kod ASCII dla znaku '\\b' (backspace): " + (int) znak6);
        System.out.println("Kod ASCII dla znaku '\\a' (alarm): " + (int) znak7);
    }
}*/

//zad8
/*public class Main {
    public static void main(String[] args) {
        System.out.println("Przedziały w tablicy ASCII:");

        System.out.println("Małe litery (a-z): od " + (int) 'a' + " do " + (int) 'z');

        System.out.println("Duże litery (A-Z): od " + (int) 'A' + " do " + (int) 'Z');

        System.out.println("Cyfry (0-9): od " + (int) '0' + " do " + (int) '9');
    }
}*/

//zad9
/*public class Main {
    public static void main(String[] args) {
        String slowo1 = "lew";
        String slowo2 = "zwierzęciem";
        String slowo3 = "spokojne zachowanie";

        String zdanie = "Grzesiek nie wiedział dlaczego " + slowo1 +
                " jest tak drapieżnym " + slowo2 +
                ", mimo, że jego " + slowo3 + " na to nie wskazuje.";

        System.out.println(zdanie);
    }
}*/

//zad10
/*public class Main {
    public static void main(String[] args) {
        String tytul = "Ślepnąc od świateł";
        String autor = "Jakub Żulczyk";

        String zdanie = tytul + " to najlepsza książka napisana przez " + autor + ".";

        System.out.println(zdanie);
    }
}*/

//zad11
/*import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDateTime teraz = LocalDateTime.now();

        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String dataIGodzina = teraz.format(format);

        String data = dataIGodzina.substring(0, 10);
        String godzina = dataIGodzina.substring(11);

        System.out.println("Dzisiaj jest (" + data + ") godzina(" + godzina + ")");
    }
}*/

//zad12
/*public class Main {
    public static void main(String[] args) {
        int[] numery = {54, 103, 241, 67, 9999};

        String imieNazwisko = "Jan Kowalski"; // Wpisz swoje imię i nazwisko
        int dlugoscImieniaNazwiska = imieNazwisko.length();

        int numerAlbumu = 12345; // Wpisz swój numer albumu

        System.out.println("Znaki pod numerami:");
        for (int numer : numery) {
            System.out.println("Znak dla numeru " + numer + ": " + (char) numer);
        }

        System.out.println("Znak dla długości imienia i nazwiska (" + dlugoscImieniaNazwiska + "): " + (char) dlugoscImieniaNazwiska);

        System.out.println("Znak dla numeru albumu (" + numerAlbumu + "): " + (char) numerAlbumu);
    }
}*/

//zadanie1
/*public class Main {
    public static void main(String[] args) {
        double wynik1 = 23.0 + 76;  // double
        double wynik2 = 41 * 2.0 + 3;  // double
        int wynik3 = 5 - 33;  // int
        int wynik4 = 109 % 3;  // int
        int wynik5 = 50 / 2;  // int
        int wynik6 = 4 | 2;  // int (bitowe OR)
        int wynik7 = 3 ^ 5;  // int (bitowe XOR)
        int wynik8 = 7 & 9;  // int (bitowe AND)

        System.out.println("23.0 + 76 = " + wynik1 + " (double)");
        System.out.println("41 * 2.0 + 3 = " + wynik2 + " (double)");
        System.out.println("5 - 33 = " + wynik3 + " (int)");
        System.out.println("109 % 3 = " + wynik4 + " (int)");
        System.out.println("50 / 2 = " + wynik5 + " (int)");
        System.out.println("4 | 2 = " + wynik6 + " (int, bitowe OR)");
        System.out.println("3 ^ 5 = " + wynik7 + " (int, bitowe XOR)");
        System.out.println("7 & 9 = " + wynik8 + " (int, bitowe AND)");
    }
}*/

//zadanie2
/*public class Main {
    public static void main(String[] args) {
        double wynik1 = (Math.sqrt(7) - 1) / 2 + 33 % 2;
        int rzutowanyWynik1 = (int) wynik1;

        System.out.println("Wynik wyrażenia 1: " + wynik1);
        System.out.println("Rzutowany na int: " + rzutowanyWynik1);
    }
}
public class Main {
    public static void main(String[] args) {
        int rokUrodzenia = 1990;
        int dzienUrodzenia = 15;
        int miesiacUrodzenia = 7;

        double wynik2 = (double) rokUrodzenia / (dzienUrodzenia * miesiacUrodzenia);
        int rzutowanyWynik2 = (int) wynik2;

        System.out.println("Wynik wyrażenia 2: " + wynik2);
        System.out.println("Rzutowany na int: " + rzutowanyWynik2);
    }
}
public class Main {
    public static void main(String[] args) {
        double wynik3 = (3 + Math.sqrt(3)) / (Math.sqrt(5.0 / 2) / 3) + 1;
        int rzutowanyWynik3 = (int) wynik3;

        System.out.println("Wynik wyrażenia 3: " + wynik3);
        System.out.println("Rzutowany na int: " + rzutowanyWynik3);
    }
}
public class Main {
    public static void main(String[] args) {
        int a = 13;
        int b = 5;
        int c = 3;

        int wynik4 = a % b % c;

        System.out.println("Wynik wyrażenia 4: " + wynik4);
    }
}
public class Main {
    public static void main(String[] args) {
        String nazwisko = "Kowalski";
        String imie = "Jan";

        int dlugoscNazwisko = nazwisko.length();
        int dlugoscImie = imie.length();

        double wynik5 = (double) (dlugoscNazwisko % dlugoscImie + 1) / Math.sqrt(4.0 / 2);
        int rzutowanyWynik5 = (int) wynik5;

        System.out.println("Wynik wyrażenia 5: " + wynik5);
        System.out.println("Rzutowany na int: " + rzutowanyWynik5);
    }
}*/
//zadanie3
/*import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj pierwsze słowo: ");
        String slowo1 = scanner.next();

        System.out.println("Podaj drugie słowo: ");
        String slowo2 = scanner.next();

        System.out.println("Pierwsze słowo: " + slowo1);
        System.out.println("Drugie słowo: " + slowo2);

        scanner.close();
    }
}*/
//zadanie4
/*import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj pierwszą liczbę: ");
        double liczba1 = scanner.nextDouble();

        System.out.println("Podaj drugą liczbę: ");
        double liczba2 = scanner.nextDouble();

        double suma = liczba1 + liczba2;
        double roznica = liczba1 - liczba2;
        double iloczyn = liczba1 * liczba2;
        double iloraz = liczba1 / liczba2;

        System.out.println("Suma: " + suma);
        System.out.println("Różnica: " + roznica);
        System.out.println("Iloczyn: " + iloczyn);
        System.out.println("Iloraz: " + iloraz);

        scanner.close();
    }
}*/
//zadanie5
/*import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Tworzenie obiektu Scanner do pobierania danych od użytkownika
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę: ");
        int x = scanner.nextInt();

        System.out.println("Powiekszona o 140: " + (x + 140));
        System.out.println("Pomniejszona o 31: " + (x - 31));
        System.out.println("Powiekszona 7 razy: " + (x * 7));
        System.out.println("Pomniejszona 13 razy: " + (x * 13));
        System.out.println("Modulo 7: " + (x % 7));
        System.out.println("Czesc calkowita z dzielenia przez 4: " + (x / 4));
        System.out.println("Podniesiona do potegi 45: " + Math.pow(x, 45));
        System.out.println("Iloraz bitowy z 67: " + (x & 67));
        System.out.println("Suma bitowa z 59: " + (x | 59));

        System.out.println("XOR z 23: " + (x ^ 23));
        System.out.println("Przesunieta o 5 bitow w lewo: " + (x << 5));
        System.out.println("Przesunieta o 6 bitow w prawo: " + (x >> 6));

        scanner.close();
    }
}*/







