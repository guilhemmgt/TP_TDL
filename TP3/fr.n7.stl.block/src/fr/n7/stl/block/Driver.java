package fr.n7.stl.block;

class Driver {

	public static void main(String[] args) throws Exception {
		Parser parser = null;
		if (args.length == 0) {
			parser = new Parser( "test-1.txt" );
			parser.parse();
			
			parser = new Parser( "test-2.txt" );
			parser.parse();
			
			parser = new Parser( "test-3.txt" );
			parser.parse();
		} else {
			for (String name : args) {
				parser = new Parser( name );
				parser.parse();
			}
		}
	}
	
}