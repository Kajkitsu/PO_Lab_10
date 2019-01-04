public class Main{
    public static void main(String[] args) {
        ManagerFaktur manager = new ManagerFaktur();

        
        manager.utworzFakture("10121");
        manager.utworzFakture("10122");
        manager.utworzFakture("10123");

        Faktura faktura1 = manager.znajdzFakture("10121");
        Faktura faktura2 = manager.znajdzFakture("10122");
        Faktura faktura3 = manager.znajdzFakture("10123");

        Produkt dlugopis = new Dlugopis(10,10);
        Produkt zeszyt = new Zeszyt(10, 10);


        faktura1.dodajPozycje(new Dlugopis(10,10),4);
        faktura1.dodajPozycje(new Zeszyt(10,12),5);

        faktura2.dodajPozycje(new Zeszyt(11,1),2);
        faktura2.dodajPozycje(new Dlugopis(2,3),4);

        faktura3.dodajPozycje(new PozycjaFaktury(dlugopis, 2));
        faktura3.dodajPozycje(new PozycjaFaktury(zeszyt, 4));
        faktura3.dodajPozycje(new Zeszyt(222,1),1);
        faktura3.dodajPozycje(new Dlugopis(5,1),4);

        faktura1.przelicz();
        faktura2.przelicz();
        faktura3.przelicz();

        faktura1.wyswietlFakture();

        faktura2.wyswietlFakture();

        faktura3.wyswietlFakture();

        manager.znajdzFakture(dlugopis);
        manager.znajdzFakture("10121");
        manager.znajdzFakture(40, 90);

        manager.wyswietlNazwyFaktur();

        manager.usunFakture("10121");
        manager.usunFakture("10122");
        manager.usunFakture("10123");
        System.out.println("Po usunieciu");

        manager.wyswietlNazwyFaktur();

        
    }
}