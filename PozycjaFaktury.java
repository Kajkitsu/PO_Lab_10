public class PozycjaFaktury{
    private Produkt produkt;
    private int ilosc;
    
    public PozycjaFaktury(Produkt produkt, int ilosc){
        this.ilosc=ilosc;
        this.produkt=produkt;
    }

    public Produkt getProdukt(){
        return this.produkt;
    }

    public int getIlosc(){
        return this.ilosc;
    }

}