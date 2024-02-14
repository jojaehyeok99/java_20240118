package vehicleApp;

//- 수동 변속기 자동차 { 차량번호 = “10가1234”, 색상 = “blue”, 시동 상태 = false, 기어 상태 = 0}
//- 자동 변속기 자동차 { 차량번호 = “10가1234”, 색상 = “blue”, 시동 상태 = false}
//- 여객 열차 { 열차번호 = “KTX001”, 출발역 = “서울”, 도착역 = “부산”, 시동 상태 = false, 탑승객 수 = 200 }
//- 화물 열차 { 열차번호 = “Cargo001”, 출발역 = “부산”, 도착역 = “구미” 시동 상태 = true, 화물 무게 = 100.0 }

public class App {
	 
	public static void main(String[] args) {
	        
	        Vehicle menualCar = new ManualCar("10가1234", "blue", false, 0);
	        Vehicle automaticCar = new AutomaticCar("10가1234", "blue", false);
	        Vehicle passengerTrain = new PassengerTrain("KTX001", "서울", "부산", false, 200);
	        Vehicle freightTrain = new FreightTrain("Cargo001", "부산", "구미", true, 100.0);
	      
	    }
	
}
