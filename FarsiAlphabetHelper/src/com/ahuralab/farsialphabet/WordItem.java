/**
 * 
 */
package com.ahuralab.farsialphabet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author michele.sama@gmail.com
 * @author panteha.s@gmail.com
 * 
 */
public class WordItem {
	public final static Map<String, List<WordItem>> EXAMPLE_WORDS = new HashMap<String, List<WordItem>>();

	static {
		EXAMPLE_WORDS.put("ﺍ",
				createWords("آب", "باد", "ما", "Water", "Wind", "Us"));
		EXAMPLE_WORDS.put("ب",
				createWords("باد", "سبد", "سیب", "Wind", "Basket", "Apple"));
		EXAMPLE_WORDS.put("پ",
				createWords("پا", "سپید", "توپ", "Leg", "White", "Ball"));
		EXAMPLE_WORDS.put("ﺕ",
				createWords("توپ", "دستور", "دست", "Ball", "Command", "Hand"));
		EXAMPLE_WORDS.put(
				"ﺙ",
				createWords("ثریا", "میثم", "مثلث", "Soraya", "Meisam",
						"Triangle"));
		EXAMPLE_WORDS.put("ﺝ",
				createWords("جام", "کجا", "کج", "Cup", "Where", "Crank"));
		EXAMPLE_WORDS.put("ﭺ",
				createWords("چپ", "هیچکس", "مچ", "Left", "Nobody", "Wrist"));
		EXAMPLE_WORDS
				.put("ﺡ",
						createWords("حس", "محبوب", "فرح", "Feeling", "Popular",
								"Farah"));
		EXAMPLE_WORDS.put(
				"ﺥ",
				createWords("خط", "بخت", "ملخ", "Script", "Fortune",
						"Grasshopper"));
		EXAMPLE_WORDS.put(
				"ﺩ",
				createWords("دستور", "ادب", "سبد", "Command", "Curtsey",
						"Basket"));
		EXAMPLE_WORDS.put("ﺫ",
				createWords("ذات", "بذر", "اتخاذ", "Nature", "Seed", "Take"));
		EXAMPLE_WORDS.put("ﺭ",
				createWords("راز", "برگ", "بهار", "Secret", "Leave", "Spring"));
		EXAMPLE_WORDS.put("ﺯ",
				createWords("زشت", "بز", "راز", "Ugly", "Goat", "Secret"));
		EXAMPLE_WORDS.put(
				"ژ",
				createWords("ژاله", "پژواک", "شوفاژ", "Jaleh", "Echo",
						"Radiator"));
		EXAMPLE_WORDS.put("ﺱ",
				createWords("سطل", "اسم", "خیس", "Bucket", "Name", "Wet"));
		EXAMPLE_WORDS.put("ﺵ",
				createWords("شب", "پشم", "آرش", "Night", "Wool", "Arash"));
		EXAMPLE_WORDS.put(
				"ﺹ",
				createWords("صنم", "اصل", "عاص", "Sanam", "Original",
						"Disobedient"));
		EXAMPLE_WORDS.put(
				"ﺽ",
				createWords("ضبط", "مضطرب", "قبض", "Record", "Worried",
						"Receipt"));
		EXAMPLE_WORDS.put("ﻁ",
				createWords("طلا", "سطل", "خط", "Gold", "Bucket", "Script"));
		EXAMPLE_WORDS.put(
				"ﻅ",
				createWords("ظلم", "مظلوم", "واعظ", "cruelty", "Oppressed",
						"Preacher"));
		EXAMPLE_WORDS.put("ﻉ",
				createWords("علی", "معلم", "طلوع", "Ali", "Teacher", "Rise"));
		EXAMPLE_WORDS.put("ﻍ",
				createWords("غنچه", "بغل", "باغ", "Gemma", "Hug", "Garden"));
		EXAMPLE_WORDS.put("ﻑ",
				createWords("فکر", "گفت", "کیف", "Thought", "Said", "Bag"));
		EXAMPLE_WORDS.put("ﻕ",
				createWords("قفل", "چاقو", "قایق", "Lock", "Knife", "Kayak"));
		EXAMPLE_WORDS.put(
				"ک",
				createWords("کتاب", "هیچکس", "بادبادک", "Book", "Nobody",
						"Kite"));
		EXAMPLE_WORDS
				.put("گ",
						createWords("گفت", "خوشگل", "برگ", "Said", "Beautiful",
								"Leave"));
		EXAMPLE_WORDS.put("ﻝ",
				createWords("لیوان", "ژاله", "گل", "Glass", "Zaleh", "Flower"));
		EXAMPLE_WORDS.put("ﻡ",
				createWords("مچ", "مادر", "جام", "Wrist", "Mother", "Cup"));
		EXAMPLE_WORDS
				.put("ﻥ",
						createWords("نان", "صنم", "میهن", "Bread", "Sanam",
								"Homeland"));
		EXAMPLE_WORDS.put(
				"و",
				createWords("وان", "محبوب", "هلو", "Bath tub", "Popular",
						"Peach"));
		EXAMPLE_WORDS.put("ﻩ",
				createWords("هلو", "بهار", "به", "Peach", "Spring", "Quince"));
		EXAMPLE_WORDS.put("ﻯ",
				createWords("یلدا", "سیب", "بی بی", "Yalda", "Apple", "Queen"));
	}

	private static List<WordItem> createWords(String beginFarsi,
			String middleFarsi, String endFarsi, String beginEnglish,
			String middleEnglish, String endEnglish) {
		List<WordItem> words = new ArrayList<WordItem>();
		words.add(new WordItem(beginFarsi, beginEnglish));
		words.add(new WordItem(middleFarsi, middleEnglish));
		words.add(new WordItem(endFarsi, endEnglish));
		return words;
	}

	public final String farsi;
	public final String english;

	public WordItem(String farsi, String english) {
		this.farsi = farsi;
		this.english = english;
	}

	public String toString() {
		return farsi + " - " + english;
	}
}
