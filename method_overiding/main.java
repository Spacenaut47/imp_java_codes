// Also known as runtime polymorphism or dynamic method dispatch
class two_wheeler {
	void move(){
		System.out.println("Two wheeler can move. ");
	}
}
class cycle extends two_wheeler {
	void move(){
		System.out.println("Cycle can move slower than two wheeler. ");
	}
}
class main {
	public static void main(String args[]){
		cycle hero = new cycle();
		two_wheeler suzuki = new two_wheeler();
		hero.move();
		suzuki.move();
	}
}