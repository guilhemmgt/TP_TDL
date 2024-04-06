package fr.n7.stl.block;

class Driver {

	public static void main(String[] args) throws Exception {
		Parser parser = null;
		if (args.length == 0) {
			
			boolean lancer_tests_vrais = true;
			boolean lancer_tests_faux = true;
			
			int nb_tests_vrais = 15;
			int nb_tests_faux = 6;
			
			if (lancer_tests_vrais) {
				int i;
				for(i=1; i<=nb_tests_vrais; i++) {
					String testName = "test-" + Integer.toString(i) + ".txt";
					System.out.println("\n=== TEST " + i + " ===");
					parser = new Parser( testName );
					parser.parse();
				}
			}
			if (lancer_tests_faux) {
				int i;
				for(i=1; i<=nb_tests_faux; i++) {
					String testName = "faux-test-" + Integer.toString(i) + ".txt";
					System.out.println("\n=== TEST FAUX " + i + " ===");
					parser = new Parser( testName );
					try {
						parser.parse();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}

		} else {
			for (String name : args) {
				parser = new Parser( name );
				parser.parse();
			}
		}
	}
	
}