
public class DispatchState implements State{

	private ScheduledRideInterface sc;
	
	public DispatchState(ScheduledRideInterface s){
		sc=s;
	}

	public String receiveRequest(boolean x){
		return "Received Request";
	}
	
	public String calculateRide(boolean y){
		return "Request is processed";
	}
	public String dispatchRide(boolean z){
		// Send notification to user and driver.
		if(z==true){
		sc.setState(new WaitState(sc));
		return "State 3: Successful \nRide Dispatched!!";
		}
		else
			return "State 3: Fail \nRide cannot be dispatched";
	}
}
