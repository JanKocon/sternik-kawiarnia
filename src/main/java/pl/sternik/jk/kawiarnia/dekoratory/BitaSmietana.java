package pl.sternik.jk.kawiarnia.dekoratory;

import pl.sternik.jk.kawiarnia.napoje.Napoj;

public class BitaSmietana extends NapojDekorator{

    private static final double CENA_DODATKU = 2.50;
    private static final String OPIS_DODATKU = " z bita smietana";
	
	public BitaSmietana(Napoj napoj) {
		super(napoj);
		 System.out.println("Dodaję bita smietane  (cena " + CENA_DODATKU + " zł)");
	}

    public String getNazwa() {
        return getNapoj().getNazwa() + OPIS_DODATKU;
    }

    public double getCena() {
        return getNapoj().getCena() + CENA_DODATKU;
    }

	@Override
	public String toString() {
		return "Bita Smietana [nazwa()=" + getNazwa() + ", cena=" + getCena() + "]";
	}
}
