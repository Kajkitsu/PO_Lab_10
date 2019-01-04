public abstract class Produkt {
    private double cenaNetto;
    private double podatek;

    public Produkt(double cenaNetto, double podatek){
        this.cenaNetto=cenaNetto;
        this.podatek=podatek;
    }

    public double getCena(){
        return cenaNetto;
    }

    public double getPodatek(){
        return podatek;
    }

    public abstract String nazwa();

}