public class Main {
    public static void main(String[] args) {
        Elf elf1 = new Elf("Janek", 69, "Malarz artysta");
        Elf elf2 = new Elf("Marek", 666, "Lokalny wariat");

        elf1.przedstaw_sie();
        elf2.przedstaw_sie();

        Fabryka fabryka = new Fabryka(50.0, 50.0);
        fabryka.dodajPracownika(elf1);
        fabryka.dodajPracownika(elf1);

        System.out.println("Najstarszy pracownik: " + fabryka.najstarszyPracownik());
    }
}