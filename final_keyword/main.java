class vehicle{
	final int speed = 10;
	void increase_speed(){
		speed = 20;
	}
}
class main{
	public static void main(String args[]){
		vehicle v = new vehicle();
		v.increase_speed();
	}
}
// This code will give a error which is the point.