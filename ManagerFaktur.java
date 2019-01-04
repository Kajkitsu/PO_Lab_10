import java.util.ArrayList;
import java.util.List;
public class ManagerFaktur{
    private List<Faktura> faktury = new ArrayList<>();
    public ManagerFaktur(){

    }

    public void utworzFakture(String numer){
        faktury.add(new Faktura(numer));
    }

    public Faktura znajdzFakture(String numer){
        for (Faktura f : faktury) {
            if(f.getNumer() == numer){
                return f;
            }
        }
        return null;
    }
    public List<Faktura> znajdzFakture(Produkt produkt){
        List<PozycjaFaktury> temPozycje = new ArrayList<>();
        List<Faktura> tempFaktury = new ArrayList<>(); 
        boolean exist=false;
        for (Faktura f : faktury) {
            temPozycje = f.getPozycje();
            for(PozycjaFaktury pozycja: temPozycje){
                if(pozycja.getProdukt() == produkt){
                    exist = true;
                }
            }
            if(exist == true){
                tempFaktury.add(f);
                exist = false;
            }
        }
        return tempFaktury;
    }
    public List<Faktura> znajdzFakture(double cenaFrom, double cenaTo){
        List<Faktura> tempFaktura = new ArrayList<>();
        for (Faktura f : faktury) {
            if(f.getWartosc()>cenaFrom && f.getWartosc()<cenaTo){
                tempFaktura.add(f);
            }
        }
        return tempFaktura;
    }

    public void usunFakture(String numer){
        Faktura tmpFaktura = null;
        for (Faktura f : faktury) {
            if(f.getNumer() == numer){
                tmpFaktura=f;
            }
        }
        faktury.remove(tmpFaktura);
    }

    public void wyswietlNazwyFaktur(){
        for (Faktura f : faktury) {
           System.out.println(f.getNumer());
        }
    }
}