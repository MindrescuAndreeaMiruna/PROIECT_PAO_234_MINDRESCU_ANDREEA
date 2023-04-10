package Model;

public class Avion implements MijlocDeTransport{
    private double distantaMaxima;
    private ModelAvion modelAvion;
    private int numarPasageri;
    private String serieAvion;
    private double capacitateKerosen;
    private double consumKerosenMediu;
    private String orasPlecare;
    private String orasDestinatie;

    public Avion(double distantaMaxima, ModelAvion modelAvion, int numarPasageri, String serieAvion, double capacitateKerosen, double consumKerosenMediu, String orasPlecare, String orasDestinatie) {
        this.distantaMaxima = distantaMaxima;
        this.modelAvion = modelAvion;
        this.numarPasageri = numarPasageri;
        this.serieAvion = serieAvion;
        this.capacitateKerosen = capacitateKerosen;
        this.consumKerosenMediu = consumKerosenMediu;
        this.orasPlecare = orasPlecare;
        this.orasDestinatie = orasDestinatie;
    }

    public void setDistantaMaxima(double distantaMaxima) {
        this.distantaMaxima = distantaMaxima;
    }

    public double getDistantaMaxima() {
        return distantaMaxima;
    }

    public void setModelAvion(ModelAvion modelAvion) {
        this.modelAvion = modelAvion;
    }

    public void setNumarPasageri(int numarPasageri) {
        this.numarPasageri = numarPasageri;
    }

    public void setSerieAvion(String serieAvion) {
        this.serieAvion = serieAvion;
    }

    public void setCapacitateKerosen(double capacitateKerosen) {
        this.capacitateKerosen = capacitateKerosen;
    }

    public void setConsumKerosenMediu(double consumKerosenMediu) {
        this.consumKerosenMediu = consumKerosenMediu;
    }

    public void setOrasPlecare(String orasPlecare) {
        this.orasPlecare = orasPlecare;
    }

    public void setOrasDestinatie(String orasDestinatie) {
        this.orasDestinatie = orasDestinatie;
    }

    public ModelAvion getModelAvion() {
        return modelAvion;
    }

    public int getNumarPasageri() {
        return numarPasageri;
    }

    public String getSerieAvion() {
        return serieAvion;
    }

    public double getCapacitateKerosen() {
        return capacitateKerosen;
    }

    public double getConsumKerosenMediu() {
        return consumKerosenMediu;
    }

    public String getOrasPlecare() {
        return orasPlecare;
    }

    public String getOrasDestinatie() {
        return orasDestinatie;
    }

    @Override
    public String toString() {
        return "Avion{" +
                "modelAvion=" + modelAvion +
                ", numarPasageri=" + numarPasageri +
                ", serieAvion='" + serieAvion + '\'' +
                ", capacitateKerosen=" + capacitateKerosen +
                ", consumKerosenMediu=" + consumKerosenMediu +
                ", orasPlecare='" + orasPlecare + '\'' +
                ", orasDestinatie='" + orasDestinatie + '\'' +
                '}';
    }

    @Override
    public String ruta() {
        return "Avionul are ruta " + this.orasPlecare + " - " + this.orasDestinatie;
    }


}
