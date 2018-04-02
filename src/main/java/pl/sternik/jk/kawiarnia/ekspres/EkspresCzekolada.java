package pl.sternik.jk.kawiarnia.ekspres;

import pl.sternik.jk.kawiarnia.dekoratory.Mleko;
import pl.sternik.jk.kawiarnia.napoje.Kawa;
import pl.sternik.jk.kawiarnia.napoje.Napoj;

public class EkspresCzekolada extends Ekspres {
	
    private final Napoj k = new Kawa();

    @Override
    protected Napoj zrobNapoj() {
        System.out.println("Robię napój - Czekolada  (cena " + k.getCena() + " zł)");
        return k;
    }

    @Override
    protected void nalejDoPojemnika() {
        System.out.println("Nalewam czekolade do kubka...");
    }

    @Override
    protected void ugotujPlyn() {
        System.out.println("Trwa podgrzewanie czzekolady...");
    }

	@Override
	protected Napoj dodajDodatki(Napoj napoj) {
		return new Mleko(napoj);
	}
}
