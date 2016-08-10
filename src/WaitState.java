
public class WaitState implements State{
	
	private ScheduledRideInterface sc;
	
	public WaitState(ScheduledRideInterface s){
		sc=s;
	}

	public String receiveRequest(boolean x){
		//Receieve request from the 'Request' class.
		if (x==true){
		sc.setState(new CalculateState(sc));
		return "State 1: Successful \nReceived Request! Ready to generate the route!";
		}
		else
			return"State 1: Fail \nRequest not received!!\n";
	}
	
	public String calculateRide(boolean y){
		return "Request must be received";
	}
	public String dispatchRide(boolean z){
		return "Request must be received";
	}
}
