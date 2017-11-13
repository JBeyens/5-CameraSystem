/**
 * 
 */
package utilities;

/**
 * 	@Author jef Beyens & Ben Vandevorst
	@Datum 07/11/2017
	@Project Intelligente Cameras
	@Doel
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
