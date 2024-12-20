public class Elf {
    private String imie;
    private int wiek;
    private String stanowisko;

    public Elf(String imie, int wiek, String stanowisko) {
        this.imie = imie;
        this.wiek = wiek;
        this.stanowisko = stanowisko;
    }
    public String getImie() {
        return imie;
    }
    public void setImie(String imie) {
        if (imie == null || imie.isEmpty()) {
            throw new IllegalArgumentException("Imie nie moze byc puste");
        }
        this.imie = imie;
    }
    public int getWiek(int wiek) {
        return wiek;
    }
    public void setWiek(int wiek) {
        if(wiek <= 0) {
            throw new IllegalArgumentException("Wiek musi byc wiekszy niz 0");
        }
        this.wiek = wiek;
    }
    public String getStanowisko() {
        return stanowisko;
    }
    public void setStanowisko(String stanowisko) {
        if (stanowisko == null || stanowisko.isEmpty()) {
            throw new IllegalArgumentException("Stanowisko nie moze byc puste");
        }
        this.stanowisko = stanowisko;
    }
    public void przedstaw_sie(){
        System.out.println("Cześć, nazywam się " + '{' + imie + '}' + " mam " + '{' + wiek + '}' + " lat, a moje stanowisko to " + '{' + stanowisko   + '}' + '.'  );
    }
}
