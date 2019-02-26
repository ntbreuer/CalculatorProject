package cse360assign2;

/**
* This calculator program can perform basic arethmatic operations and records the history of operations
*
* version 3
*
* @author  Nic Breuer
* @date 2/19/19
*
*/
public class Calculator {

	private int total;
	private String H;
	
	/**
	 * Constuctor Method
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
		H = new String("0");
	}
	
	/**
	 * Returns the total
	 * @param none
	 * @return calculated total
	 */
	public int getTotal () {
		return total;
	}

	/**
	 * Performs the add operation
	 * @param integer
	 */
	public void add (int value) {
		total += value;
		H += " + " + value;
	}
	
	/**
	 * Performs the subtraction operation
	 * @param integer
	 */
	public void subtract (int value) {
		total -= value;
		H += " - " + value;
	}
	
	/**
	 * Performs the multiply operation
	 * @param integer
	 */
	public void multiply (int value) {
		total = total * value;
		H += " * " + value;
	}
	
	/**
	 * Performs the division operation
	 * @param integer
	 */
	public void divide (int value) {
		total = (value!=0) ? (total/value) : 0;
		H += " / " + value;
	}
	
	/**
	 * Returns a string of the history of operations
	 * @return string
	 */
	public String getHistory () {
		return H;
	}
}