/**
 * 
 */
package com.ahuralab.farsialphabet;

import java.util.ArrayList;
import java.util.List;

/**
 * @author michele.sama@gmail.com
 * @author panteha.s@gmail.com
 * 
 */
public class WordItem {
	public static List<WordItem> createFarsiRelatedWords() {
		List<WordItem> exampleWords = new ArrayList<WordItem>();
		exampleWords.add(new WordItem("آب", "باد", "ما", "Water", "Wind", "Us"));
		exampleWords.add(new WordItem("باد", "سبد", "سیب", "Wind", "basket", "Apple"));
		exampleWords.add(new WordItem("پا", "سپید", "توپ", "Leg", "White", "Ball"));
		exampleWords.add(new WordItem("توپ", "دستور", "توت", "Ball", "Command", "Berry"));
		exampleWords.add(new WordItem("ثریا", "میثم", "بعث", "Soraya", "Meisam", "Risen"));
		exampleWords.add(new WordItem("جام", "کجا", "کج", "Cup", "Where", "Crank"));
		exampleWords.add(new WordItem("چب", "هیچکس", "مچ", "Left", "Nobody", "Wrist"));
		exampleWords.add(new WordItem("حس", "محبوب", "فرح", "Feeling", "Popular", "Farah"));
		exampleWords.add(new WordItem("خط", "بخت", "ملخ", "Script", "Fortune", "Grasshopper"));
		exampleWords.add(new WordItem("دستور", "ادب", "سبد", "Command", "Curtsey", "basket"));
		exampleWords.add(new WordItem("ذات", "بذر", "ذالذالک ", "Nature", "Seed", "Hawthorn"));
		exampleWords.add(new WordItem("راز", "برگ", "بهار", "Secret", "Leave", "Spring"));
		exampleWords.add(new WordItem("زشت", "بز", "راز", "Ugly", "Goat", "Secret"));
		exampleWords.add(new WordItem("ژاله", "پژمان", "شوفاژ", "Jaleh", "Pejman", "Radiator"));
		exampleWords.add(new WordItem("سطل", "اسم", "خیس", "Bucket", "Name", "Wet"));
		exampleWords.add(new WordItem("شب", "پشم", "آرش", "Night", "Wool", "Arash"));
		exampleWords.add(new WordItem("صنم", "اصل", "عاص", "Sanam", "Original", "Disobedient"));
		exampleWords.add(new WordItem("ضبط", "مضطرب", "قبض", "Record", "worried", "receipt"));
		exampleWords.add(new WordItem("طلا", "سطل", "خط", "Gold", "Bucket", "Script"));
		exampleWords.add(new WordItem("ظلم", "مظلوم", "واعظ", "cruelty", "Oppressed", "Preacher"));
		exampleWords.add(new WordItem("علی", "معلم", "طلوع", "Ali", "Teacher", "Rise"));
		exampleWords.add(new WordItem("غنچه", "بغل", "باغ", "Gemma", "Hug", "Garden"));
		exampleWords.add(new WordItem("فکر", "گفت", "کیف", "Thought", "Said", "Bag"));
		exampleWords.add(new WordItem("قفل", "چاقو", "قایق", "Lock", "Knife", "Kayak"));
		exampleWords.add(new WordItem("کجا", "هیچکس", "کتاب", "Where", "Nobody", "Book"));
		exampleWords.add(new WordItem("گفت", "خوشگل", "برگ", "Said", "Beautiful", "Leave"));
		exampleWords.add(new WordItem("لیوان", "ژاله", "گل", "Glass", "Zaleh", "Flower"));
		exampleWords.add(new WordItem("مچ", "مادر", "جام", "Wrist", "Mother", "Cup"));
		exampleWords.add(new WordItem("ندا", "صنم", "نان", "Neda", "Sanam", "Bread"));
		exampleWords.add(new WordItem("وان", "محبوب", "هلو", "Bath tub", "Popular", "Peach"));
		exampleWords.add(new WordItem("هلو", "بهار", "به", "Peach", "Spring", "Quince"));
		exampleWords.add(new WordItem("یلدا", "سیب", "بی بی", "Yalda", "Apple", "Queen"));
		return exampleWords;
	}

	public final String beginFarsi;
	public final String middleFarsi;
	public final String endFarsi;
	public final String beginEnglish;
	public final String middleEnglis;
	public final String endEnglish;

	public WordItem(String beginFarsi, String middleFarsi, String endFarsi,
			String beginEnglish, String middleEnglis, String endEnglish) {
		super();

		this.beginFarsi = beginFarsi;
		this.middleFarsi = middleFarsi;
		this.endFarsi = endFarsi;
		this.beginEnglish = beginEnglish;
		this.middleEnglis = middleEnglis;
		this.endEnglish = endEnglish;

	}

}
