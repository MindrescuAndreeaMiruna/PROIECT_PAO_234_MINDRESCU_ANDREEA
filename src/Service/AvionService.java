package Service;
import Model.Avion;
import java.util.ArrayList;
import java.util.Map;
import java.util.List;

public interface AvionService {
    void addAvioane(Avion avion) throws Exception;
    ArrayList <Avion> getAvioane() throws Exception;
    double calculConsumKerosen(Avion avion);
    Map<String, Double> getConsumuriAvioaneSortateDupaCheie(ArrayList<Avion> avioane);
    List<Map.Entry<String, Double>> listaSortataDupaConsum(Map<String, Double> consumuriAvioane);

}
