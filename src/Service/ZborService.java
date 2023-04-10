package Service;

import Model.Zbor;
import java.util.Set;


public interface ZborService {
     void addZbor(Zbor zbor) throws Exception;
     Set<Zbor> getZbor() throws Exception;

}
