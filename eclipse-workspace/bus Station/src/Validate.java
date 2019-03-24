import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.awt.event.ActionEvent;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.Scene;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Pos;


public class Validate {
	ArrayList <Passenger>pass = new ArrayList();
	ArrayList<Driver>driver=new ArrayList();
Person user;
 public Person getUser() {
	return user;
}
public void setUser(Person user) {
	this.user = user;
}
public  void load(String type) throws IOException {
	  //ArrayList <Passenger>pass = new ArrayList();
	if(type.equals("passenger")) {
	    File file = new File("customerdb.txt");
		 FileReader fileReader = new FileReader(file);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		  while(bufferedReader.ready()) {
			  Person users=new Passenger();

                String line = bufferedReader.readLine();
              String delimiters = " ";
            StringTokenizer st  = new StringTokenizer(line,  delimiters);
            users.setUsername(st.nextToken());
            users.setPassword(st.nextToken());
                pass.add((Passenger) users);
                
              // System.out.println(user.getUsername());
           //   System.out.println(pass.get(0));
            }
	}
	else if(type.equals("driver")) {
		 File file = new File("driverdb.txt");
		 FileReader fileReader = new FileReader(file);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		  while(bufferedReader.ready()) {
			  Person users1=new Driver();

                String line = bufferedReader.readLine();
              String delimiters = " ";
            StringTokenizer st  = new StringTokenizer(line,  delimiters);
            users1.setUsername(st.nextToken());
            users1.setPassword(st.nextToken());
                driver.add((Driver) users1);
                
              // System.out.println(user.getUsername());
           //   System.out.println(pass.get(0));
            }
		  }
	
	    }

int flag=0;
public String valid(String type) {
if(type.equals("passenger")) {
	for(Passenger x:pass) {
		//System.out.println(x.getUsername());
		if(user.getUsername().equals(x.getUsername()) && user.getPassword().equals(x.getPassword())) {
			flag=1;
			//System.out.println("hi");
		}
			if(flag==1)
				break;
	}
if(flag==1)
	return "login successfully.";
else
	return "Invalid username or password";
}
else if(type.equals("driver")) {
	flag=0;
	for(Driver x:driver) {
		//System.out.println(x.getUsername());
		if(user.getUsername().equals(x.getUsername()) && user.getPassword().equals(x.getPassword())) {
			flag=1;
			//System.out.println("hi");
		}
			if(flag==1)
				break;
	}
if(flag==1)
	return "login successfully.";
else
	return "Invalid username or password";
}else if(type.equals("manager"))
{
	if(user.getUsername().equals("Micheal_Scott") && user.getPassword().equals("1234"))
		return "login successfully.";
	else
		return "Invalid username or password";
		
}else
	return "no data";
}
 

}