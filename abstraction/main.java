abstract class bike{
	abstract void run();
}
class honda extends bike {
	void run(){
		System.out.println("running safely. ");
	}
}
class main {
	public static void main(String args[]){
		bike obj = new honda();
		obj.run();
	}
}