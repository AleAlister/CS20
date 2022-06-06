import com.phidget22.DigitalInput;
import com.phidget22.DigitalOutput;
import com.phidget22.TemperatureSensor;

public class thermostat  {
	
	public static void main(String[] args)throws Exception {

		//Create
	   DigitalInput greenbutton = new DigitalInput();
	   DigitalOutput greenLed = new DigitalOutput();
	   DigitalInput redbutton = new DigitalInput();
	   DigitalOutput redLed = new DigitalOutput();
	   
	   //Address
	   redbutton.setHubPort(0);
	   redLed.setHubPort(1);
	   redbutton.setIsHubPortDevice(true);
	   redLed.setIsHubPortDevice(true);
	   greenbutton.setHubPort(5);
	   greenLed.setHubPort(4);
	   greenbutton.setIsHubPortDevice(true);
	   greenLed.setIsHubPortDevice(true);
	   TemperatureSensor temperatureSensor = new TemperatureSensor();

	   //open
	   redbutton.open(1000);
	   greenbutton.open(1000);
	   redLed.open(1000);
	   greenLed.open(1000);
	   temperatureSensor.open(1000);
	   
	   int temp = 21;//Declaration 
	
	   int ntemp = 0;//Declaration 
	 
	
	   //Use your phidget
	   while (true) {
	   if (redbutton.getState()== true) {
		    ntemp = temp -= 1;
		    System.out.print(ntemp);
		   }
	   else if (greenbutton.getState()== true) {
		   
		    ntemp = temp += 1;
		    System.out.print(ntemp);
	   }
	   
		   if (ntemp < 23 && ntemp > 19) {
			   greenLed.setState(true);
			   redLed.setState(false);
			   System.out.println("Temperature: " + ntemp + " °C" );
			     }
		   
		   else {
			   redLed.setState(true);
			   greenLed.setState(false);
			   System.out.println("Temperature: " + ntemp + " °C" );
		   }
		   Thread.sleep(1500);
	   }
	   
	}
	
	}


