package pl.sternik.jk.kawiarnia.napoje;

public class Czekolada implements Napoj {
    private static final double CENA_NAPOJU = 3.50;
    private static final String NAZWA_NAPOJU = "Czekolada";

    public String getNazwa() {
        return NAZWA_NAPOJU;
    }

    public double getCena() {
        return CENA_NAPOJU;
    }

	@Override
	public String toString() {
		return "Czekolada [nazwa()=" + getNazwa() + ", cena=" + getCena() + "]";
	}
    
    
}