import java.util.ArrayList;
import java.util.List;

public class Faktura{
    private String numer;
    private List<PozycjaFaktury> pozycjeFaktury = new ArrayList<>();
    private double wartoscNetto;
    private double podatek;

    public Faktura(String numer){
        this.numer = numer;
    }
    public void dodajPozycje(Produkt produkt, int ilosc){
        PozycjaFaktury tempPozycja = new PozycjaFaktury(produkt, ilosc);
        pozycjeFaktury.add(tempPozycja);
    }
    public void dodajPozycje(PozycjaFaktury pozycjaFaktury){
        pozycjeFaktury.add(pozycjaFaktury);
    }
    public void wyswietlFakture(){
        for (PozycjaFaktury i : pozycjeFaktury) {
            Produkt tempProdukt = i.getProdukt();
            System.out.print(tempProdukt.nazwa()+ " ");
            System.out.print(tempProdukt.getCena()+ " ");
            System.out.print(tempProdukt.getPodatek()+" ");

        }
        System.out.println();
    }
    public double przelicz(){
        double suma = 0.0;
        double podatek = 0.0;
        for(PozycjaFaktury i : pozycjeFaktury){
            Produkt tempProdukt = i.getProdukt();
            suma+=tempProdukt.getCena()*i.getIlosc();
            podatek+=tempProdukt.getPodatek()*i.getIlosc();
        }
        this.wartoscNetto = suma;
        this.podatek = podatek;
        return suma+podatek;
    }
    public double getWartosc(){
        return this.wartoscNetto;
    }

    public double getPodatek(){
        return this.podatek;
    }

    public String getNumer(){
        return this.numer;
    }
    public List<PozycjaFaktury> getPozycje(){
        return this.pozycjeFaktury;
    }
}