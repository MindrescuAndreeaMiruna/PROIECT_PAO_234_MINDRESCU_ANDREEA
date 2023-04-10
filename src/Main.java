import Model.Aeroport;
import Model.ModelAvion;
import Model.TipCompanie;
import Model.AeroportInternational;
import Model.AeroportNational;
import Model.Angajat;
import Model.Avion;
import Model.Bilet;
import Model.CompanieAeriana;
import Model.MijlocDeTransport;
import Model.ModelAvion;
import Model.Pasager;
import Model.Persoana;
import Model.TipCompanie;
import Model.Zbor;
import Constants.Constants;
import Service.ZborService;
import Service.PasagerService;
import Service.PersoanaService;
import Service.BiletService;
import Service.AvionService;
import Service.AeroportCompanieAerianaService;
import Service.Implementation.AeroportCompanieAerianaServiceImpl;
import Service.Implementation.AvionServiceImpl;
import Service.Implementation.BiletServiceImpl;
import Service.Implementation.PasagerServiceImpl;
import Service.Implementation.PersoanaServiceImpl;
import Service.Implementation.ZborServiceImpl;


import java.lang.reflect.Array;
import java.util.*;
import java.lang.Exception;

import static Constants.Constants.SCOP_AEROPORT;


public class Main {
    public static void main(String[] args) throws Exception {
        try {
            ArrayList<CompanieAeriana> companii = new ArrayList<>();
            companii.add(new CompanieAeriana("Blue Air", "X2234", Arrays.asList("Palma de Mallorca", "Bucuresti", "Abu Dhabi"), new ArrayList<>(), TipCompanie.CHARTER));
            companii.add(new CompanieAeriana("Tarom", "Q2314", Arrays.asList("Iasi", "Milano", "Paris"), new ArrayList<>(), TipCompanie.LOWCOST));

            Aeroport aeroport1 = new Aeroport("Henri Coanda", "Romania", "Bucuresti", 12, 30, companii) {
                @Override
                public String scop() {
                    return SCOP_AEROPORT;
                }
            }; // m-am complicat putin aici
            System.out.println(aeroport1);
            AeroportCompanieAerianaService service = new AeroportCompanieAerianaServiceImpl();
            CompanieAeriana companie = new CompanieAeriana("Wizz Air", "WZ123", Arrays.asList("Londra", "Budapesta"), new ArrayList<>(), TipCompanie.LOWCOST);
            service.addCompanieNoua(companie, aeroport1);
        } catch (Exception e) {
            System.err.println("A aparut o exceptie: " + e.getMessage());
            e.printStackTrace();
        }

        Avion avion1 = new Avion(3000, ModelAvion.BOEING, 150, "X4567", 2000, 20, "Bucuresti", "Londra");
        Avion avion2 = new Avion(6000, ModelAvion.AIRBUS, 123, "US256", 3000, 12, "Istanbul", "Berlin");
        Avion avion3 = new Avion(10000, ModelAvion.CONCORDE, 100, "CC7655", 7000, 19, "Madrid", "New York");
        System.out.println(avion1);
        System.out.println(avion2);
        System.out.println(avion3);

        CompanieAeriana companie1 = new CompanieAeriana("US Airways", "JHG3538", new ArrayList<>(Arrays.asList("California", "Londra", "Amsterdam", "Toronto", "Beijing")), new ArrayList<>(Arrays.asList(avion1)), TipCompanie.LOWCOST );
        CompanieAeriana companie2 = new CompanieAeriana("Qatar Airlines", "A88762", new ArrayList<>(Arrays.asList("Tel Aviv", "Budapesta", "Barcelona")), new ArrayList<>(Arrays.asList(avion2)), TipCompanie.VIP);
        System.out.println(companie2);
        System.out.println(companie1);

        AvionServiceImpl avionService = new AvionServiceImpl();
        avionService.addAvioane(avion1);
        avionService.getAvioane();

        Avion avion4 = new Avion(4000, ModelAvion.CONCORDE, 190, "Q78@@@", 6000, 50, "Tokyo", "New York");
        System.out.println(avion4);

        AvionServiceImpl avionService1 = new AvionServiceImpl();
        avionService1.addAvioane(avion4);
        avionService1.addAvioane(avion3);
        avionService1.addAvioane(avion2);
        avionService1.addAvioane(avion1);

        System.out.println(avionService1.getAvioane());

        ArrayList<Avion> listaAvioane = avionService1.getAvioane();
        for(Avion avion : listaAvioane){
            System.out.println(avion);
        }


        double consumKerosen = avionService1.calculConsumKerosen(avion1);
        System.out.println("Consumul de kerosen pentru avion1 este: " + consumKerosen);

        double consumKerosen1 = avionService1.calculConsumKerosen(avion4);
         System.out.println("Consumul de kerosen pentru avion4 este: " + consumKerosen1);

        double consumKerosen2 = avionService1.calculConsumKerosen(avion3);
        System.out.println("Consumul de kerosen pentru avion3 este: " + consumKerosen2);

        Map<String, Double> consumuriAvioane1 = avionService1.getConsumuriAvioaneSortateDupaCheie(listaAvioane);
        System.out.println(consumuriAvioane1);

        List<Map.Entry<String, Double>> consumuriAvioane2 = avionService1.listaSortataDupaConsum(consumuriAvioane1);
        System.out.println(consumuriAvioane2);

        Zbor zbor1 = new Zbor(78165, "Henri Coanda Airport", 120);
        Zbor zbor2 = new Zbor(16279, "Charles de Gaulle Airport", 90);
        Zbor zbor3 = new Zbor(89372, "LAX Airport", 600);
        Zbor zbor4 = new Zbor(782666, "Dubai Airport", 167);
        Zbor zbor5 = new Zbor(1456, "Dubai$$$", 107);

        ZborServiceImpl zborService = new ZborServiceImpl();
        zborService.addZbor(zbor1);
        zborService.addZbor(zbor2);
        zborService.addZbor(zbor3);
        zborService.addZbor(zbor4);
        zborService.addZbor(zbor5);

        Set<Zbor> zboruri = zborService.getZbor();
        System.out.println(zboruri);

        Date dataPlecarii1  = new Date(2022, 10, 15, 14, 30);
        Bilet bilet1 = new Bilet(avion1, dataPlecarii1, "A12", "Economy", 34, zbor1);
        System.out.println(bilet1);

        Date dataPlecarii2  = new Date(2023, 3, 27, 10, 37);
        Bilet bilet2 = new Bilet(avion2, dataPlecarii1, "F13", "Business", 14, zbor2);
        System.out.println(bilet2);

        Date dataPlecarii3  = new Date(2023, 3, 30, 4, 10);
        Bilet bilet3 = new Bilet(avion3, dataPlecarii1, "O13", "Economica", 9, zbor3);
        System.out.println(bilet3);

        BiletServiceImpl biletService = new BiletServiceImpl();
        biletService.addBilet(bilet1);
        biletService.addBilet(bilet2);
        biletService.addBilet(bilet3);

        Map<UUID, Bilet> bilete = biletService.getBilete();
        System.out.println(bilete);

        Persoana persoana1 = new Persoana("Popescu", "Ioana", "0786515100", "popescuioana@gmail.com", 18, "6013458690981");
        Persoana persoana2 = new Persoana("Sandu", "Alexandru", "0789871652", "sandu14@yahoo.com", 24, "5098241263481");
        Persoana persoana3 = new Persoana("Ignat", "Anca", "0761524316", "anca.yahoo", 50,"6098765413");
        System.out.println(persoana1);
        System.out.println(persoana2);
        System.out.println(persoana3);

        PersoanaServiceImpl persoanaService = new PersoanaServiceImpl();
        persoanaService.addPersoana(persoana1);
        persoanaService.addPersoana(persoana2);
        persoanaService.addPersoana(persoana3);

        List<Persoana> persoane = persoanaService.getPersoane();
        System.out.println(persoane);

        Pasager pasager1 = new Pasager("Meran", "Cosmin", "0789876152", "cosminmm7@gmail.com", 21, "5098726151098", bilet2, 1);
        Pasager pasager2 = new Pasager("Aioanei","Cassiana", "0763729817", "aioana@yahoo.com", 56, "6265432167890", bilet3, 5);
        Pasager pasager3 = new Pasager("iliesi","Catrinel", "0763709881", "catri653@yahoo.com", 46, "6226765552912", bilet1, 2);

        System.out.println(pasager1);
        System.out.println(pasager2);
        System.out.println(pasager3);

        PasagerServiceImpl pasagerService = new PasagerServiceImpl();
        pasagerService.addPasager(pasager1);
        pasagerService.addPasager(pasager2);
        pasagerService.addPasager(pasager3);

        List<Pasager> pasageri = pasagerService.getPasageri();
        System.out.println(pasageri);

        List<Pasager> pasageriOrdonatiDupaNumarulDeBagaje = pasagerService.getPasageriOrdonatiDupaNumarulDeBagaje(pasageri);
        System.out.println(pasageriOrdonatiDupaNumarulDeBagaje);

        AeroportNational aeroportNational1 = new AeroportNational("Henri Coanda", "Romania", "Bucuresti", 4, 2, new ArrayList<CompanieAeriana>(), true, true);
        AeroportNational aeroportNational2 = new AeroportNational("Avram Iancu", "Romania", "Cluj", 2, 3, new ArrayList<CompanieAeriana>(), false, true);
        System.out.println(aeroportNational1);
        System.out.println(aeroportNational2);

        AeroportInternational aeroportInternational1 = new AeroportInternational("LAX", "USA", "Los Angeles", 12, 200, new ArrayList<CompanieAeriana>(), true, true);
        AeroportInternational aeroportInternational2 = new AeroportInternational("JFK", "USA", "New York", 22, 210, new ArrayList<CompanieAeriana>(), true, true);
        System.out.println(aeroportInternational1);
        System.out.println(aeroportInternational2);

        Angajat angajat1 =  new Angajat("Ionescu", "Alina", "0787654132", "alinai@gmail.com", 32, "6059876254132", "Agent de securitate", 6);
        Angajat angajat2 = new Angajat("Croianu", "Alexandra", "0787651423", "alexc34@yahoo.com", 46, "69872651425152", "Insotitor de zbor", 12);
        Angajat angajat3 = new Angajat("Todosi", "Nicoleta", "0788851423", "nicotodosi8@yahoo.com", 54, "69878930425152", "Pilot", 11);
        System.out.println(angajat1);
        System.out.println(angajat2);
        System.out.println(angajat3);

    }
    }
