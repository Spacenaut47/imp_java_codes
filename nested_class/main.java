class outer {
	int x = 10;
	class inner {
		int y = 5;
	}
}
class main{
	public static void main(String args[]){
		outer my_outer = new outer();
		outer.inner my_inner = my_outer.new inner();
		System.out.println(my_inner.y + my_outer.x);
	}
}