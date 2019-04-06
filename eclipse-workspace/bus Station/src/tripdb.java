import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.StringTokenizer;

public class tripdb {
	HashMap<Vehicle,Trip> detailsint =new HashMap();
	 Vehicle objv = null;
	
	public void loadtrip(String typetrip) throws IOException {
		if(typetrip.equals("internal")) {
			 Trip objtrip=new InternalTrip();
	  File file = new File("new.txt");
		 FileReader fileReader = new FileReader(file);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		  while(bufferedReader.ready()) {
			
			 
             String line = bufferedReader.readLine();
             String delimiters = " ";
             StringTokenizer st  = new StringTokenizer(line,  delimiters);
            // System.out.println(st.nextToken());
          String   typev=st.nextToken().toString();
             if(typev.equals("limousine")) {
            	 objv= new Limousine();
             }
             if(typev.equals("MiniBus")) {
            	 objv = new MiniBus();
             }
             if(typev.equals("Bus")) {
            	 objv = new Bus();
             }
             objtrip.setTripTime(st.nextToken());
             objtrip.setSource(st.nextToken());
             objtrip.setDestination(st.nextToken());
            // objtrip.setNo_of_stops(st.nextToken());
             detailsint.put(objv, objtrip);
             
             
             
        
           
            }
		  while(!detailsint.isEmpty()) {
			  System.out.println(detailsint.get(objv).getDestination());
		
		  	  
}}}}