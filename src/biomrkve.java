import java.time.LocalDate;

public class biomrkve {

    //Výpočet průměru množství mrkve na jednu smlouvu
    public static void ukol10() {

        String jmenoAPrijmeni = "Petr Maďar";

        LocalDate datumNarozeni = LocalDate.of(98, 5, 18);

        int pocetSmluv = 11;

        double prodaneMrkveVTunach = 1.3;

        String mesto = "Brno";

        String znackaVozidla = "B2HJK";

        double spotrebaVozidla = 5.8;

        String ipAdresa = "127.0.0.1";

        double prumer = prodaneMrkveVTunach / pocetSmluv;

        System.out.println("Na jednu smlouvu připadá průměrně: " + prumer + " tun mrkve.");

    }
}
