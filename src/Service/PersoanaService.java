package Service;
import Model.Persoana;
import java.util.List;

public interface PersoanaService {
    void addPersoana(Persoana persoana) throws Exception;

    List<Persoana> getPersoane() throws Exception;
}
