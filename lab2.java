//zadanie1
//public class Main {
//    public static void trojkiPitagorejskie(int n) {
//        for (int a = 1; a <= n; a++) {
//            for (int b = a; b <= n; b++) {
//                for (int c = b; c <= n; c++) {
//                    if (a * a + b * b == c * c) {
//                        System.out.println(a + ", " + b + ", " + c);
//                    }
//                }
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        trojkiPitagorejskie(30);
//    }
//}

//zadanie2
//public class Main {
//    public static void funKwaRozwiazania(int n) {
//        for (int a = 1; a <= n; a++) {
//            for (int b = 1; b <= n; b++) {
//                for (int c = 1; c <= n; c++) {
//                    int delta = b * b - 4 * a * c;
//                    if (delta >= 0) {
//                        System.out.println("a=" + a + ", b=" + b + ", c=" + c + " ma rozwiązanie.");
//                    }
//                }
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        funKwaRozwiazania(10);
//    }
//}

//zadanie3
//public class Main {
//    public static void funKwaDelta(int n) {
//        for (int a = 1; a <= n; a++) {
//            for (int b = 1; b <= n; b++) {
//                for (int c = 1; c <= n; c++) {
//                    int delta = b * b - 4 * a * c;
//                    int sqrtDelta = (int) Math.sqrt(delta);
//                    if (delta >= 0 && sqrtDelta * sqrtDelta == delta) {
//                        System.out.println("a=" + a + ", b=" + b + ", c=" + c + " delta jest kwadratem liczby naturalnej.");
//                    }
//                }
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        funKwaDelta(10);
//    }
//}

//zadanie4
//public class Main {
//    public static void liczbyPierwsze(int n) {
//        for (int i = 2; i <= n; i++) {
//            if (czyPierwsza(i)) {
//                System.out.println(i);
//            }
//        }
//    }
//
//    public static boolean czyPierwsza(int liczba) {
//        if (liczba < 2) return false;
//        for (int i = 2; i <= Math.sqrt(liczba); i++) {
//            if (liczba % i == 0) return false;
//        }
//        return true;
//    }
//
//    public static void main(String[] args) {
//        liczbyPierwsze(30);
//    }
//}p

//zadanie5
//public class Main {
//    public static void liczbyPodzielne(int m, int n) {
//        int start = (int) Math.pow(10, m - 1);
//        int end = (int) Math.pow(10, m) - 1;
//
//        for (int i = start; i <= end; i++) {
//            if (i % n == 0) {
//                System.out.println(i);
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        liczbyPodzielne(3, 5);
//    }
//}

//zadanie6
//public class Main {
//    // Piramida w wersji 1
//    public static void piramida1(int n) {
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= n - i; j++) {
//                System.out.print(" ");
//            }
//            for (int k = 1; k <= 2 * i - 1; k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//
//    // Piramida w wersji 2
//    public static void piramida2(int n) {
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//
//    public static void main(String[] args) {
//        piramida1(5);
//        piramida2(5);
//    }
//}

//zadanie7
//public class Main {
//    public static int silnia(int n) {
//        if (n == 0) {
//            return 1;
//        }
//        return n * silnia(n - 1);
//    }
//
//    public static void main(String[] args) {
//        System.out.println(silnia(5));
//    }
//}

//zadanie8
//public class Main {
//    public static int silniaPodwojna(int n) {
//        if (n <= 0) {
//            return 1;
//        }
//        return n * silniaPodwojna(n - 2);
//    }
//
//    public static void main(String[] args) {
//        System.out.println(silniaPodwojna(5));
//    }
//}

//zadanie9
//public class Main {
//    public static int silniaM(int m, int n) {
//        if (n == 0) {
//            return 1;
//        }
//        return m * silniaM(m, n - 1);
//    }
//
//    public static void main(String[] args) {
//        System.out.println(silniaM(3, 4));
//    }
//}

//zadanie10
//public class Main {
//    public static int silnia(int n) {
//        if (n == 0) {
//            return 1;
//        }
//        return n * silnia(n - 1);
//    }
//
//    public static int dwumianNewtona(int n, int k) {
//        return silnia(n) / (silnia(k) * silnia(n - k));
//    }
//
//    public static void main(String[] args) {
//        System.out.println(dwumianNewtona(5, 2));
//    }
//}

//zadanie11
//public class Main {
//    public static void ciagFibonacciego(int n) {
//        int a = 0, b = 1;
//        System.out.print(a + " " + b + " ");
//        for (int i = 2; i < n; i++) {
//            int c = a + b;
//            System.out.print(c + " ");
//            a = b;
//            b = c;
//        }
//    }
//
//    public static void main(String[] args) {
//        ciagFibonacciego(10);
//    }
//}

//zadanie12
//public class Main {
//    public static int sumaNaturalnych(int n) {
//        return n * (n + 1) / 2;
//    }
//
//    public static int sumaParzystych(int n) {
//        int suma = 0;
//        for (int i = 2; i <= n; i += 2) {
//            suma += i;
//        }
//        return suma;
//    }
//
//    public static int sumaNieparzystych(int n) {
//        int suma = 0;
//        for (int i = 1; i <= n; i += 2) {
//            suma += i;
//        }
//        return suma;
//    }
//
//    public static void main(String[] args) {
//        System.out.println("Suma liczb naturalnych: " + sumaNaturalnych(10));
//        System.out.println("Suma liczb parzystych: " + sumaParzystych(10));
//        System.out.println("Suma liczb nieparzystych: " + sumaNieparzystych(10));
//    }
//}

//zadanie13
//public class Main {
//    public static boolean czyPalindrom(String wyraz) {
//        int dlugosc = wyraz.length();
//        for (int i = 0; i < dlugosc / 2; i++) {
//            if (wyraz.charAt(i) != wyraz.charAt(dlugosc - i - 1)) {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(czyPalindrom("kajak"));
//    }
//}

//zadanie14
//public class Main {
//    public static int sumaKwaNaturalnych(int n) {
//        int suma = 0;
//        for (int i = 1; i <= n; i++) {
//            suma += i * i;
//        }
//        return suma;
//    }
//
//    public static int sumaSzeNaturalnych(int n) {
//        int suma = 0;
//        for (int i = 1; i <= n; i++) {
//            suma += i * i * i;
//        }
//        return suma;
//    }
//
//    public static double sumaOdwNaturalnych(int n) {
//        double suma = 0;
//        for (int i = 1; i <= n; i++) {
//            suma += 1.0 / i;
//        }
//        return suma;
//    }
//
//    public static void main(String[] args) {
//        System.out.println("Suma kwadratów: " + sumaKwaNaturalnych(5));
//        System.out.println("Suma sześcianów: " + sumaSzeNaturalnych(5));
//        System.out.println("Suma odwrotności: " + sumaOdwNaturalnych(5));
//    }
//}

//zadanie15
//public class Main {
//    public static boolean czyPalindrom(int n) {
//        int oryginalna = n;
//        int odwrocona = 0;
//
//        while (n != 0) {
//            int cyfra = n % 10;
//            odwrocona = odwrocona * 10 + cyfra;
//            n /= 10;
//        }
//
//        return oryginalna == odwrocona;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(czyPalindrom(121));
//        System.out.println(czyPalindrom(123));
//    }
//}

//zadanie16
//public class Main {
//    public static boolean czyDoskonala(int n) {
//        int suma = 0;
//        for (int i = 1; i <= n / 2; i++) {
//            if (n % i == 0) {
//                suma += i;
//            }
//        }
//        return suma == n;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(czyDoskonala(6));
//        System.out.println(czyDoskonala(28));
//    }
//}

//zadanie17
//public class Main {
//    public static boolean czyPierwsza(int n) {
//        if (n < 2) {
//            return false;
//        }
//        for (int i = 2; i <= Math.sqrt(n); i++) {
//            if (n % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(czyPierwsza(29));
//        System.out.println(czyPierwsza(10));
//    }
//}

//zadanie18
//public class Main {
//    public static int NWD(int a, int b) {
//        while (b != 0) {
//            int temp = b;
//            b = a % b;
//            a = temp;
//        }
//        return a;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(NWD(48, 18));
//    }
//}

//zadanie19
//import java.util.Scanner;
//
//public class Main {
//    public static int[] wczytajTablice() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Podaj rozmiar tablicy: ");
//        int n = scanner.nextInt();
//        int[] tablica = new int[n];
//
//        System.out.println("Podaj " + n + " liczb:");
//        for (int i = 0; i < n; i++) {
//            tablica[i] = scanner.nextInt();
//        }
//
//        return tablica;
//    }
//
//    public static void main(String[] args) {
//        int[] tablica = wczytajTablice();
//        for (int liczba : tablica) {
//            System.out.print(liczba + " ");
//        }
//    }
//}


//zadanie20
//import java.util.ArrayList;
//import java.util.List;
//
//public class Main {
//    public static void podzbiory(int[] tablica) {
//        int n = tablica.length;
//        int liczbaPodzbiorow = (1 << n);
//
//        for (int i = 0; i < liczbaPodzbiorow; i++) {
//            System.out.print("{ ");
//            for (int j = 0; j < n; j++) {
//                if ((i & (1 << j)) > 0) {
//                    System.out.print(tablica[j] + " ");
//                }
//            }
//            System.out.println("}");
//        }
//    }
//
//    public static void main(String[] args) {
//        int[] tablica = {1, 2, 3};
//        podzbiory(tablica);
//    }
//}
