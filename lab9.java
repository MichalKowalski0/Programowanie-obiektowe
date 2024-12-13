//zestaw nieparzystych
//zadanie 1

/*record BookDTO(String title, String author, double price, int yearOfPublication)
{
    public class Main
    {
        public static void main(String[] args)
        {
            BookDTO book1 = new BookDTO("Biblia", "Jezus", 1, -20);
            BookDTO book2 = new BookDTO("Tatuażyk", "Sebastian Enrique Alvarez", 10000, 2023);
            BookDTO book3 = new BookDTO("Ojciec chrzestny polskich Freak Fightów ", "Marcin Najman", 10, 2023);

            System.out.println(book1.toString());
            System.out.println(book2.toString());
            System.out.println(book3.toString());
        }
    }
}*/

//zadanie2

/*
record Adres(String ulica, String numer_domu, String kod_pocztowy, String miasto)
{
    record Osoba(String imie, String nazwisko, Adres adres)
    {
        public class Main
        {
            public static void main(String[] args)
            {
                Adres adres1 = new Adres("kolorowa", "5", "30-100", "Tarnow");
                Adres adres2 = new Adres("czarna", "4", "21-37", "Kolobrzeg");

                Osoba osoba1 = new Osoba("Mateusz", "Wajcheprzeloz", adres1);
                Osoba osoba2 = new Osoba("Michal", "Malyalewariat", adres2);

                System.out.println(osoba1.toString());
                System.out.println(osoba2.toString());
            }
        }
    }
}*/

//zadanie6

/*
record Car(String brand, String model, double fuelConsumptionPer100km)
{
    public double fuelCost(double fuelPrice, double distance)
    {
        return (fuelConsumptionPer100km / 100) * fuelPrice * distance;
    }
    public class Main
    {
        public static void main(String[] args)
        {
            Car car = new Car("BMW", "E39", 8);

            double fuelPrice = 7.5;
            double distance = 150;
            double cost = car.fuelCost(fuelPrice, distance);

            System.out.println("Koszt podrozy wynosi: " + cost + "PLN");
        }
    }
}*/

//zadanie9

/*
record Person(String name, int age)
{
    public Person
    {
        if (age < 0)
        {
            age = 0;
        }
    }
    public class Main
    {
        public static void main(String[] args)
        {
            Person person = new Person("Michael", 18);
            Person person2 = new Person("Pawel", -5);

            System.out.println(person);
            System.out.println(person2);
        }
    }
}*/

//zadanie 10
