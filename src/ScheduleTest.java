
public class ScheduleTest {

	static ScheduledRide sr;
	public static void main(String[] args){
		sr= new ScheduledRide();
		sr.receiveRequest(true);
		sr.calculateRide(true);
		sr.dispatchRide(false);
	}
}
