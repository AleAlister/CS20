import com.phidget22.DigitalInput;

import com.phidget22.DigitalOutput;


public class TugOWar {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
	
		
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
		   
		   //open
		   redbutton.open(1000);
		   greenbutton.open(1000);
		   redLed.open(1000);
		   greenLed.open(1000);
		   
			int G1 = 0, R1 = 0, G2 = 0, R2 = 0;//Declaration 
			boolean state = false; 
			
			
			//Use your phidget
			while (true) {
				if(redbutton.getState()== true) {
					R1 += 1;
				}
				else {
					redLed.setState(false);
				}
				if(greenbutton.getState()==true) {
					G1 +=1;
				}
				else {
					greenLed.setState(false);
				}
				
				R2 = R1-G1;
				G2 = G1-R1;
				
				if ((redbutton.getState() != state)&&(greenbutton.getState()!= state)) {
					

					state=redbutton.getState();
					state=greenbutton.getState();
					System.out.println("Green: "+ G2 + "Red: "+ R2);
					}

				
				//Red faster
				if (R2 >= 10) {
					G2 = 0;
					greenLed.setState(false);
					redLed.setState(true);
					Thread.sleep(15);
					redLed.setState(false);
					Thread.sleep(15);
					redLed.setState(true);
					Thread.sleep(150);
					redLed.setState(false);
					Thread.sleep(150);
					redLed.setState(true);
					Thread.sleep(150);
					redLed.setState(false);
					Thread.sleep(150);
					redLed.setState(true);
					Thread.sleep(150);
					redLed.setState(false);
					Thread.sleep(150);
					redLed.setState(true);
					Thread.sleep(150);
					redLed.setState(false);
					Thread.sleep(150);
					redLed.setState(true);
					Thread.sleep(150);
					redLed.setState(false);
					Thread.sleep(150);
					return;
					
				}
				
				//Green faster
				else if (G2 >= 10) {
					R2 =0;
					redLed.setState(false);
					greenLed.setState(true);
					Thread.sleep(15);
					greenLed.setState(false);
					Thread.sleep(15);
					greenLed.setState(true);
					Thread.sleep(150);
					greenLed.setState(false);
					Thread.sleep(150);
					greenLed.setState(true);
					Thread.sleep(150);
					greenLed.setState(false);
					Thread.sleep(150);
					greenLed.setState(true);
					Thread.sleep(150);
					greenLed.setState(false);
					Thread.sleep(150);
					greenLed.setState(true);
					Thread.sleep(150);
					greenLed.setState(false);
					Thread.sleep(150);
					greenLed.setState(true);
					Thread.sleep(150);
					greenLed.setState(false);
					Thread.sleep(150);
					return;
				}
				Thread.sleep(150);
			}
			
			
		   
		   
		

	}

}
