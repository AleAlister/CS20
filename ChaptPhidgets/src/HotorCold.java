import com.phidget22.DigitalInput;
import com.phidget22.DigitalOutput;
import com.phidget22.TemperatureSensor;

public class HotorCold {

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

		   //Open
		   redbutton.open(1000);
		   greenbutton.open(1000);
		   redLed.open(1000);
		   greenLed.open(1000);
		   temperatureSensor.open(1000);
		   
		   double tem = temperatureSensor.getTemperature();
		   
		   //Use your phidget 
		   while (true) {
			   if (tem > 20 && tem < 24) {
				   greenLed.setState(true);
				   System.out.println("Temperature: " + tem + " °C" );
				   
				   
			   }
			   else  {
				   redLed.setState(true);
				   System.out.println("Temperature: " + tem + " °C" );
			   }
			   Thread.sleep(150);
		   }
		
	}

}
