package vehicleApp;

// 열차
public abstract class Train implements Vehicle {
	
	private String trainNumber; // 열차번호
	private String departureStation; // 출발역
	private String arrivalStation; // 도착역
	private boolean isStart; // 시동상태
	
	public Train(String trainNumber, String departureStation, String arrivalStation, boolean isStart) {
	    this.trainNumber = trainNumber;
	    this.departureStation = departureStation;
	    this.arrivalStation = arrivalStation;
	    this.isStart = isStart;
	}
	
	public String getTrainNumber() {
        return trainNumber;
    }

    public String getDepartureStation() {
        return departureStation;
    }

    public String getArrivalStation() {
        return arrivalStation;
    }

    public boolean isStart() {
        return isStart;
    }
    
    public void setStart () {
        this.isStart = !this.isStart;
    }
}
