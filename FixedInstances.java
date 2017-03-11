class FixedInstances {

	static int count;

	private FixedInstances() {

	}

	public static FixedInstances getInstance() {
		FixedInstances instance = null;	
		count++;
		if(count <= 5) {
			instance = new FixedInstances();
			return instance;
		}
		
		return instance;
		
	}


}