package comments;

public class DocumentationComments {

	/**
	 * The main entry point for the Java application. This method serves as the
	 * program's execution starting point when the class is run directly from the
	 * command line or IDE.
	 * 
	 * <p>
	 * <strong>Method Signature Requirements:</strong>
	 * </p>
	 * <ul>
	 * <li>Must be declared as {@code public} - accessible from anywhere</li>
	 * <li>Must be declared as {@code static} - can be called without creating an
	 * instance of the class</li>
	 * <li>Must be declared as {@code void} - does not return any value</li>
	 * <li>Must be named exactly {@code main}</li>
	 * <li>Must accept a single parameter of type {@code String[]} - command-line
	 * arguments</li>
	 * </ul>
	 * 
	 * 
	 * <div class="card"> <div class="card-header">
	 * <h1>Documentation Info</h1>
	 * <p>
	 * Author & Parameter Details
	 * </p>
	 * </div> <div class="card-body"> <div class="info-row">
	 * <div class="info-label">Author</div> <div class="info-value">Bharath
	 * Reddy</div> </div> <div class="info-row"> <div class="info-label">Since</div>
	 * <div class="info-value"><span class="badge">2025</span></div> </div>
	 * <div class="info-row"> <div class="info-label">Version</div>
	 * <div class="info-value"><span class="badge">1.3</span></div> </div>
	 * <div class="info-row"> <div class="info-label">Parameter</div>
	 * <div class="info-value"> <strong>int</strong> - refers interest </div> </div>
	 * <div class="info-row"> <div class="info-label">Parameter</div>
	 * <div class="info-value"> <strong>principle</strong> - refers base amount
	 * </div> </div> </div> </div>
	 * 
	 * @start region=calc int x = 100; int y = 50; System.out.println(x - y);
	 * @end region=calc
	 * 
	 * @link https://docs.oracle.com/ (External link)
	 * 
	 *       {@link String} → Shows hyperlink with class name
	 * 
	 * 
	 * @author Bharath Reddy
	 * @since 2025
	 * @version 1.3
	 * @param int       refers interest
	 * @param principle refers base amount
	 * 
	 * @return emi refers total emi should be paid to the bank
	 * 
	 */

	public static void main(String[] args) {

		System.out.println("Hello, World!");

	}

}
