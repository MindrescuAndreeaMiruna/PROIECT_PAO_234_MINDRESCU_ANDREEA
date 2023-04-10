package Model;
import java.util.Date;
import java.util.UUID;
public class Bilet {
    private Avion avion;
    private Date dataPlecarii;
    private String loc;
    private String clasa;
    private int numarPoarta;
    private Zbor zbor;
    private UUID id;

    public Bilet(Avion avion, Date dataPlecarii, String loc, String clasa, int numarPoarta, Zbor zbor) {
        this.avion = avion;
        this.dataPlecarii = dataPlecarii;
        this.loc = loc;
        this.clasa = clasa;
        this.numarPoarta = numarPoarta;
        this.zbor = zbor;
        this.id = UUID.randomUUID();
    }

    public UUID getId() {
        return id;
    }
    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    public void setDataPlecarii(Date dataPlecarii) {
        this.dataPlecarii = dataPlecarii;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public void setClasa(String clasa) {
        this.clasa = clasa;
    }

    public void setNumarPoarta(int numarPoarta) {
        this.numarPoarta = numarPoarta;
    }

    public Avion getAvion() {
        return avion;
    }

    public Date getDataPlecarii() {
        return dataPlecarii;
    }

    public String getLoc() {
        return loc;
    }

    public String getClasa() {
        return clasa;
    }

    public int getNumarPoarta() {
        return numarPoarta;
    }

    @Override
    public String toString() {
        return "Bilet{" +
                "avion=" + avion +
                ", dataPlecarii=" + dataPlecarii +
                ", loc='" + loc + '\'' +
                ", clasa='" + clasa + '\'' +
                ", numarPoarta=" + numarPoarta +
                ", zbor=" + zbor +
                ", id=" + id +
                '}';
    }
}
