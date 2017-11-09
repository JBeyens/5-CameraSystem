/**
 * 
 */
package utilities;

/**
 * @author Jef_B
 *
 */
public final class StringOperations {
	
	public static String collectionToString(Iterable<? extends Object> input) {
		String result = "";
		boolean first = true;
		
		for (Object object : input) {
			if (!first)
				result += ", "; // will be executed after each nonfirst element if another element is coming
			else
				first = false;  // will be executed for the first element
				
			result += object.toString();
		}
		
		return "[" + result + "]";		
	}
}
