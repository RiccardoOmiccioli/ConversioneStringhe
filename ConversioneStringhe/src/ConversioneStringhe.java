
public class ConversioneStringhe {
	public static void main( String [] args)
	{
		//Conversione da Integer a Stringa
		int Anno = 2019;
		String AnnoStringa = "" + Anno ;
		System.out.println( AnnoStringa );
		
		//Conversione da Double a Stringa
		double Temperatura = 70.51;
		String TemperaturaStringa = "" + Temperatura ;
		System.out.println( TemperaturaStringa );
		
		//Conversione da Stringa a Integer
		String InteroStringa = "12345";
		int Intero = Integer.parseInt( InteroStringa );
		System.out.println( Intero );
			
		
		//Conversione da Stringa a Double
		String PiStringa = "3.1415926";
		double Pi = Double.parseDouble( PiStringa );
		System.out.println( Pi );
		
		}
}
