//Laboration 3- Exception
//David Nilsson L�fvall
//Dalo1300
//L�rare: Mikael Nilsson / Robert Jonsson
/*Detta �r en exceptionklass som kastas n�r f�r f� eller f�r m�nga argument anges till 
 * programmet TestLabb3. Meddelandet som kastas sparas till en fil tillsammans med 
 * klocka och datum f�r tillf�llet som undantaget kastades*/
 

import java.io.*;
import java.util.Date;


public class NrOfArgumentsException extends Exception {
	
	static final String filename= new String("errorMsg.dat");
	FileWriter out= null;
	PrintWriter bufOut=null;
		
	public NrOfArgumentsException(String message) {
		super(message);
		try{
			//True angiven f�r att aktivera append
			out= new FileWriter(filename,true);
			
			/*Kopplar FilwWriter till PrintWriter s� allt som PrintWriter skriver ut
			 * skrivs till angiven fil i FileWriter
			 */
		}
		
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

		//Loggar tid och datum
		bufOut= new PrintWriter(out);
		Date aDate= new Date();
		bufOut.print(aDate.toString()+" "+ message);
		bufOut.println();
		bufOut.close();
		
		
		
		
	}

}
