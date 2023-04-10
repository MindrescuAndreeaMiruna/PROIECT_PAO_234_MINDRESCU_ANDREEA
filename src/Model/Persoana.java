package Model;

public class Persoana {
    private String nume;
    private String prenume;
    private String numarTelefon;
    private String email;
    private int varsta;
    private String cnp;

    public Persoana(String nume, String prenume, String numarTelefon, String email, int varsta, String cnp) {
        this.nume = nume;
        this.prenume = prenume;
        this.numarTelefon = numarTelefon;
        this.email = email;
        this.varsta = varsta;
        this.cnp = cnp;
    }

    public void setNumarTelefon(String numarTelefon) {
        this.numarTelefon = numarTelefon;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public int getVarsta() {
        return varsta;
    }

    public String getCnp() {
        return cnp;
    }

    public String getNumarTelefon() {
        return numarTelefon;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Persoana{" +
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", numarTelefon='" + numarTelefon + '\'' +
                ", email='" + email + '\'' +
                ", varsta=" + varsta +
                ", cnp='" + cnp + '\'' +
                '}';
    }
}
