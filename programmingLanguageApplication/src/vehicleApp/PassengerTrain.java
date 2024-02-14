package vehicleApp;

// 여객열차
public class PassengerTrain extends Train {

	private int passengerCount;  // 탑승객 수
	
	 public PassengerTrain(String trainNumber, String departureStation, String arrivalStation, boolean isStart, int passengerCount) {
	        super(trainNumber, departureStation, arrivalStation, isStart);
	        this.passengerCount = passengerCount;
	    }
	
	 @Override
	    public void accelerate() {
	        System.out.println("자동 변속기 자동차가 가속합니다!");
	    }

	    @Override
	    public void stop() {
	        System.out.println("자동 변속기 자동차가 정차합니다!");
	    }

	    @Override
	    public void setStart() {
	        super.setStart();
	    }

	    public int getPassengerCount () {
	        return this.passengerCount;
	    }

		

}
