package pl.sternik.jk.kawiarnia.ekspres;

import pl.sternik.jk.kawiarnia.napoje.Napoj;

public abstract class Ekspres {
	
	public final Napoj dajNapoj() {
		Napoj napoj;
		ugotujPlyn();
		
		napoj = zrobNapoj();
		napoj = dodajDodatki(napoj);
		nalejDoPojemnika();
		return napoj;
	}
	
	protected abstract void ugotujPlyn();
	protected abstract Napoj zrobNapoj();
	protected abstract Napoj dodajDodatki(Napoj napoj);
	protected abstract void nalejDoPojemnika();
}
