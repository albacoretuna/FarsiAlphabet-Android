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
		new NumberItem("صفر - 0", "۰"),
		new NumberItem("یک -1", "۱"),
		new NumberItem("دو -2", "۲"),
		new NumberItem("سه -3", "۳"),
		new NumberItem("چهار -4", "۴"),
		new NumberItem("پنج -5", "۵"),
		new NumberItem("شش - 6", "۶"),
		new NumberItem("هفت - 7", "۷"),
		new NumberItem("هشت - 8", "۸"),
		new NumberItem("نه - 9", "۹")
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
