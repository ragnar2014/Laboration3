//Laboration 3- Exception
//David Nilsson Löfvall
//Dalo1300
//Lärare: Mikael Nilsson / Robert Jonsson
/*Detta är ett litet program som bara testar min exceptionklass NrOfArguments*/

import java.io.IOException;

public class TestLabb3 {
	
	public static void main(String[] args) throws NrOfArgumentsException, IOException{
	//Kollar hur många argument som angetts i command line
		try{	
			if(args.length<2)
			{
				throw new NrOfArgumentsException("Too few arguments: "+args.length);
			}
			
			else if(args.length>2)
				
			{
				throw new NrOfArgumentsException("Too many arguments: "+args.length);
			}
		}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
		
	}

}
