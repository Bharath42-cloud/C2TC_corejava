package Day7.overriding.V1;

import Day7.overloading.V1.RBI;

//subclass
public class HDFC extends RBI {
	@Override
	public float getRateOfInterest() {
		return 6.8f;
	}

}