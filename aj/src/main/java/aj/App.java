package aj;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.opencsv.CSVReader;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	String nom = "adele";
        System.out.println( "Hello World! "+nom );
        System.out.println( "Resultat max entre 4 et 5 :  "+ max(4,5) );
        int monmax = 0;
        try {
        	CSVReader reader = new CSVReader(new FileReader("data.csv"));
        	List<String[]> myEntries = reader.readAll();
        	reader.close();
        	System.out.println("Nombre dans le list : "+myEntries.size());
        	 for(int i = 0; i < myEntries.size(); i++){
        		System.out.println("Élément à l'index " + i + " = " + myEntries.get(i)[1]);
        		Integer m = new Integer(myEntries.get(i)[1]);
        		monmax = max(monmax,m.intValue());
        		
        	}

        	} catch (FileNotFoundException e) {
        			e.printStackTrace();
        		} catch (IOException e) {
        			e.printStackTrace();
        		}
        
        System.out.println( "Mon max final :  "+ monmax);
    
    }
    public static int max (int a,int b){
    	return a>b ? a:b;
    	//return a;
    }
}
