package vehicleApp;

// 자동차
public abstract class Car implements Vehicle{
	
	private String vin; // 차량번호
	private String color; // 차량색상
	private boolean isStart; // 시동상태
	
	public Car(String vin, String color, boolean isStart) {
		this.vin = vin;
		this.color = color;
        this.isStart = isStart;
    }
	
	public String getVin() {
	       return vin;
	}

	public String getColor() {
	       return color;
	}

	public boolean isStart() {
	       return isStart;
	}
	
	public void setStart () {
        this.isStart = !this.isStart;
    }
	
}







