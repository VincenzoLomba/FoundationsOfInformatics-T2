package mediaesami.persistence;

import java.io.IOException;
import java.io.Reader;

import mediaesami.model.Carriera;


public class MyCarrieraReader implements CarrieraReader {

	/*
	 * 	27991	ANALISI MATEMATICA T-1				9,0		12/1/2020	RT
		27991	ANALISI MATEMATICA T-1				9,0		10/2/2020	22
		28004	FONDAMENTI DI INFORMATICA T-1		12,0	13/2/2020	24
		29228	GEOMETRIA E ALGEBRA T				6,0		18/1/2020	26
		26337	LINGUA INGLESE B-2					6,0
		27993	ANALISI MATEMATICA T-2				6,0		10/6/2020	RE
		27993	ANALISI MATEMATICA T-2				6,0		02/7/2020	RT
		28006	FONDAMENTI DI INFORMATICA T-2		12,0
		28011	RETI LOGICHE T						6,0
		...
	* */

	@Override
	public Carriera leggiCarriera(Reader rdr) throws IOException {
		// DA FARE
		return null; // fake
	}
}