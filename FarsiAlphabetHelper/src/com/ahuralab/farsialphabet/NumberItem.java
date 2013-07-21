/**
 * 
 */
package com.ahuralab.farsialphabet;

/**
 * @author msama (michele.sama@gmail.com)
 *
 */
public class NumberItem {

	public static final NumberItem[] NUMBERS = new NumberItem[] {
		new NumberItem("Zero - 0", "0"),
		new NumberItem("One - 1", "1"),
		new NumberItem("Two - 2", "2"),
		new NumberItem("Three - 3", "3"),
		new NumberItem("Four - 4", "4"),
		new NumberItem("Five - 5", "5"),
		new NumberItem("Six - 6", "6"),
		new NumberItem("Seven - 7", "7"),
		new NumberItem("Eight - 8", "8"),
		new NumberItem("Nine - 9", "9")
	};
	
	private final String name;
	private final String value;
	
	public NumberItem(String name, String value) {
		super();
		this.name = name;
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public String getValue() {
		return value;
	}

	@Override
	public String toString() {
		return name;
	}
}
