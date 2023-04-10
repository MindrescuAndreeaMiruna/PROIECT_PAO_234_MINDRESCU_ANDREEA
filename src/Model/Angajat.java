package Model;

public class Angajat  extends Persoana{

    private String ocupatie;
    private int aniExperienta;

    public Angajat(String nume, String prenume, String numarTelefon, String email, int varsta, String cnp, String ocupatie, int aniExperienta) {
        super(nume, prenume, numarTelefon, email, varsta, cnp);
        this.ocupatie = ocupatie;
        this.aniExperienta = aniExperienta;
    }

    public void setOcupatie(String ocupatie) {
        this.ocupatie = ocupatie;
    }

    public void setAniExperienta(int aniExperienta) {
        this.aniExperienta = aniExperienta;
    }

    public String getOcupatie() {
        return ocupatie;
    }

    public int getAniExperienta() {
        return aniExperienta;
    }

    @Override
    public String toString() {
        return "Angajat{" +
                super.toString() +
                "ocupatie='" + ocupatie + '\'' +
                ", aniExperienta=" + aniExperienta +
                '}';
    }
}
