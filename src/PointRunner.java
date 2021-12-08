
public class PointRunner {
	public static void main(String args[]){
		Point a = new Point();
		a.x = -1;
		a.y = 5;

		System.out.println( "(" + a.getX() + "," + a.getY() + ")" );
		a.setLocation(3,4);
		System.out.println(a);
		a.translate(1, 1);
		System.out.println(a);
	}
}
