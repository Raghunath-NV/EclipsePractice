class Temp {
	
	public static void main(String a[]) {

		FixedInstances f1 = FixedInstances.getInstance();
		FixedInstances f2 = FixedInstances.getInstance();
		FixedInstances f3 = FixedInstances.getInstance();
		FixedInstances f4 = FixedInstances.getInstance();
		FixedInstances f5 = FixedInstances.getInstance();

		System.out.println("5 instances created!");

		FixedInstances f6 = FixedInstances.getInstance();
		if(f6 == null)
			System.out.println("Cannot create instance any more!");

	}

}