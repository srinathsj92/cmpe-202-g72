
public class CalculateState implements State{

	private ScheduledRideInterface sc;
	
	public CalculateState(ScheduledRideInterface s){
		sc=s;
	}

	public String receiveRequest(boolean x){
		return "Received Request";
	}
	
	public String calculateRide(boolean x){
		// Make a call to 'Route' class to calculate the routes.
		//Then select a route based on the request.
		if(x==true){
		sc.setState(new DispatchState(sc));
		return "State 2: Successful \nRoute Calculated, Ready for dispatch!";
		}
		else
			return "State 2: Fail \nRoute not available!!";
	}
	public String dispatchRide(boolean x){
		return "Request is being processed";
	}
}
