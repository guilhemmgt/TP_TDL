package fr.n7.stl.block;

class Driver {

	public static void main(String[] args) throws Exception {
		Parser parser = null;
		if (args.length == 0) {
			
			int nb_test = 7;
					
			int i;
			for(i=1; i<=nb_test; i++) {
				String testName = "test-" + Integer.toString(i) + ".txt";
				parser = new Parser( testName );
				parser.parse();
			}

		} else {
			for (String name : args) {
				parser = new Parser( name );
				parser.parse();
			}
		}
	}
	
}