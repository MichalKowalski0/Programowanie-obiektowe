import java.util.List;
import java.util.ArrayList;

public class Fabryka {
    private List<Elf> elfy;
    private double dlGeo;
    private double szGeo;

    public Fabryka(double dlGeo, double szGeo) {
        setDlGeo(dlGeo);
        setSzGeo(szGeo);
        this.elfy = new ArrayList<>();
    }
    public void dodajPracownika(Elf elf) {
        elfy.add(elf);
    }
    public void usunPracownika(Elf elf) {
        elfy.remove(elf);
    }
    public Elf najstarszyPracownik() {
        return elfy.stream().max((e1, e2) -> Integer.compare(e1.getWiek(), e2.getWiek())).orElse(null);
    }
    public double getDlGeo() {
        return dlGeo;
    }
    public void setDlGeo(double dlGeo) {
        if (dlGeo < -180 || dlGeo > 180) {
            throw new IllegalArgumentException("dlGeo może przyjąć wartości między -180, a 180");
        }
        this.dlGeo = dlGeo;
    }
    public double getSzGeo() {
        return szGeo;
    }
    public void setSzGeo(double szGeo) {
        if (szGeo < -90 || szGeo > 90) {
            throw new IllegalArgumentException("szGeo może przyjąć wartości między -90, a 90");
        }
        this.szGeo = szGeo;
    }
}
