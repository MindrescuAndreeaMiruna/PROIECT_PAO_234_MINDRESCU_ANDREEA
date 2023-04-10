package Service;
import Model.Bilet;
import java.util.Map;
import java.util.UUID;

public interface BiletService {
    void addBilet(Bilet bilet) throws Exception;
    Map<UUID, Bilet> getBilete() throws Exception;
}
