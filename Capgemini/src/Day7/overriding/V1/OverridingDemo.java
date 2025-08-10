package Day7.overriding.V1;

import Day7.overloading.V1.RBI;
import Day7.overloading.V1.SBI;

public class OverridingDemo {

	public static void main(String[] args) {
		RBI rbi;

//		Dynamic binding assigning child class object to parent class reference variable.
		rbi = new SBI();
		System.out.println(rbi.getRateOfInterest());

		rbi = new ICICI();
		System.out.println(rbi.getRateOfInterest());

		rbi = new HDFC();
		System.out.println(rbi.getRateOfInterest());

	}

}