package Model;

public class Zbor {
    private int numarZbor;
    private String denumireAeroportAterizare;
    private int durataZborMinute;

    public Zbor(int numarZbor, String denumireAeroportAterizare, int durataZborMinute) {
        this.numarZbor = numarZbor;
        this.denumireAeroportAterizare = denumireAeroportAterizare;
        this.durataZborMinute = durataZborMinute;
    }

    public void setNumarZbor(int numarZbor) {
        this.numarZbor = numarZbor;
    }

    public void setDenumireAeroportAterizare(String denumireAeroportAterizare) {
        this.denumireAeroportAterizare = denumireAeroportAterizare;
    }

    public void setDurataZborMinute(int durataZborMinute) {
        this.durataZborMinute = durataZborMinute;
    }

    public int getNumarZbor() {
        return numarZbor;
    }

    public String getDenumireAeroportAterizare() {
        return denumireAeroportAterizare;
    }

    public int getDurataZborMinute() {
        return durataZborMinute;
    }

    @Override
    public String toString() {
        return "Zbor{" +
                "numarZbor=" + numarZbor +
                ", denumireAeroportAterizare='" + denumireAeroportAterizare + '\'' +
                ", durataZborMinute=" + durataZborMinute +
                '}';
    }
}
