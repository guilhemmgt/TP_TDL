/**
 * 
 */
package fr.n7.stl.block.ast.expression;

/**
 * @author Marc Pantel
 *
 */
public enum UnaryOperator {
	
	/**
	 * Boolean negation
	 */
	Negate,
	/**
	 * Numeric opposite
	 */
	Opposite,
	
	Print; // rajouté

	@Override
	public String toString() {
		switch (this) {
		case Negate: return "!";
		case Opposite: return "-";
		case Print: return "print"; // rajouté
		default: throw new IllegalArgumentException( "The default case should never be triggered.");		
		}
	}

}
