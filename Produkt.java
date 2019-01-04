public abstract class Produkt {
    private double cenaNetto;
    private double podatek;

    public double getCena(){
        return cenaNetto;
    }

    public double getPodatek(){
        return podatek;
    }

    public abstract String nazwa();

}