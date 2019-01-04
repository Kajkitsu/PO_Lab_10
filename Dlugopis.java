public class Dlugopis extends Produkt{
    public Dlugopis(double cenaNetto, double podatek){
        super(cenaNetto, podatek);
    }
    public String nazwa(){
        return "dlugopis";
    }
}