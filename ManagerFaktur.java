import java.util.List;
public class ManagerFaktur{
    private List<Faktura> faktury;
    public ManagerFaktur(){

    }
    public void utworzFakture(String numer){
        Faktura temp = new Faktura(numer);
        faktury.add(temp);
    }
    public Faktura znajdzFakture(String numer){
        for (Faktura f : faktury) {
            if(faktur)
        }
    }
    public List<Faktura> znajdzFakture(Produkt produkt){

    }
    public List<Faktura> znajdzFakture(double cenaFrom, double cenaTo){

    }
    public void usunFakture(String numer){

    }
    public void wyswietlNazwyFaktur(){

    }
}