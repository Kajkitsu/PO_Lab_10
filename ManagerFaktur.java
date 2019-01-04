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
            if(f.getNumer() == numer){
                return f;
            }
        }
        return null;
    }
    public List<Faktura> znajdzFakture(Produkt produkt){
        List<PozycjaFaktury> temPozycje = null;
        List<Faktura> tempFaktury = null; 
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
        List<Faktura> tempFaktura = null;
        for (Faktura f : faktury) {
            if(f.getWartosc()>cenaFrom && f.getWartosc()<cenaTo){
                tempFaktura.add(f);
            }
        }
        return tempFaktura;
    }

    public void usunFakture(String numer){
        for (Faktura f : faktury) {
            if(f.getNumer() == numer){
                faktury.remove(f);
            }
        }
    }

    public void wyswietlNazwyFaktur(){
        for (Faktura f : faktury) {
           System.out.println(f.getNumer());
        }
    }
}