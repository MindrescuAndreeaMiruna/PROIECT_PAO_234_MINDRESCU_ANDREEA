package Service.Implementation;

import Exception.InvalidDenumireAeroportAterizareException;
import Exception.NoZboruriFoundException;
import Model.Zbor;
import Service.ZborService;

import java.util.Set;
import java.util.HashSet;
import static Validation.ZborValidation.validateDenumireAeroportAterizare;


public class ZborServiceImpl implements ZborService {
    Set<Zbor> zboruri;

    @Override
    public void addZbor(Zbor zbor){
        boolean validZbor = true;
        try{
            if(!validateDenumireAeroportAterizare(zbor.getDenumireAeroportAterizare()))
                throw new InvalidDenumireAeroportAterizareException("Denumirea acestui aeroport de aterizare nu exista.");
        }
        catch(InvalidDenumireAeroportAterizareException exception){
            validZbor = false;
            System.out.println(exception.getMessage());
        }
        if(validZbor){
            if(zboruri == null)
                zboruri = new HashSet<>();
            zboruri.add(zbor);
        }
    }
    @Override
    public Set<Zbor> getZbor() throws Exception{
        try{
            if(zboruri == null)
                throw new NoZboruriFoundException("Nu sunt zboruri inregistrate in acest set.");
        }
        catch(NoZboruriFoundException exception){
            System.out.println(exception.getMessage());
        }
        finally {
            System.out.println("Test Zbor finally.");
        }
        return zboruri;

    }



}
