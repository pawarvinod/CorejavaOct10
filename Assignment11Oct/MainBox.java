package AssignmentClassAndObject;

import java.util.Scanner;

public class MainBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter lenth, width,hight");
		Box b= new Box(sc.nextInt(),sc.nextInt(),sc.nextInt());
		System.out.println(b.dimentionOfBox());

	}

}
