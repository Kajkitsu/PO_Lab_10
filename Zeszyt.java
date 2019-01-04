public class Zeszyt extends Produkt{
    public Zeszyt(double cenaNetto, double podatek){
        super(cenaNetto, podatek);
    }
    public String nazwa(){
        return "zeszyt";
    }
}