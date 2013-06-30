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
		// Begin
		exampleWords
				.add(new WordItem("آب", "Water"));
		exampleWords.add(new WordItem("باد", "Wind"));
		exampleWords.add(new WordItem("پا", "Leg"));
		exampleWords.add(new WordItem("توپ", "Ball"));
		exampleWords.add(new WordItem("ثریا","Soraya"));
		exampleWords.add(new WordItem("جام", "Cup"));
		exampleWords.add(new WordItem("چب", "Left"));
		exampleWords.add(new WordItem("حس", "Feeling"));
		exampleWords.add(new WordItem("خط", "Script"));
		exampleWords.add(new WordItem("دستور", "Command"));
		exampleWords.add(new WordItem("ذات",  "Nature"));
		exampleWords.add(new WordItem("راز", "Secret"));
		exampleWords.add(new WordItem("زشت", "Ugly"));
		exampleWords.add(new WordItem("ژاله", "Jaleh"));
		exampleWords.add(new WordItem("سطل", "Bucket"));
		exampleWords.add(new WordItem("شب", "Night"));
		exampleWords.add(new WordItem("صدا", "Sound"));
		exampleWords.add(new WordItem("ضبط", "Record"));
		exampleWords.add(new WordItem("طلا", "Gold"));
		exampleWords.add(new WordItem("ظلم", "cruelty"));
		exampleWords.add(new WordItem("علم", "Science"));
		exampleWords.add(new WordItem("غنچه", "Gemma"));
		exampleWords.add(new WordItem("فکر", "Thought"));
		exampleWords.add(new WordItem("قفل", "Lock"));
		exampleWords.add(new WordItem("کتاب", "Book"));
		exampleWords.add(new WordItem("گفت", "Said"));
		exampleWords.add(new WordItem("لیوان", "Glass"));
		exampleWords.add(new WordItem("مچ", "Wrist"));
		exampleWords.add(new WordItem("نان", "Bread"));
		exampleWords.add(new WordItem("وان", "Bathtub"));
		exampleWords.add(new WordItem("هلو","Peach"));
		exampleWords.add(new WordItem("یلدا", "Yalda"));
		
		
		// TODO keep only the second word
		/*
		exampleWords
		.add(new WordItem("آب", "باد", "ما", "Water", "Wind", "Us"));
exampleWords.add(new WordItem("باد", "سبد", "سیب", "Wind", "Basket",
		"Apple"));
exampleWords.add(new WordItem("پا", "سپید", "توپ", "Leg", "White",
		"Ball"));
exampleWords.add(new WordItem("توپ", "دستور", "دست", "Ball", "Command",
		"Hand"));
exampleWords.add(new WordItem("ثریا", "میثم", "مثلث", "Soraya",
		"Meisam", "Triangle"));
exampleWords.add(new WordItem("جام", "کجا", "کج", "Cup", "Where",
		"Crank"));
exampleWords.add(new WordItem("چب", "هیچکس", "مچ", "Left", "Nobody",
		"Wrist"));
exampleWords.add(new WordItem("حس", "محبوب", "صبح", "Feeling",
		"Popular", "Morning"));
exampleWords.add(new WordItem("خط", "بخت", "ملخ", "Script", "Fortune",
		"Grasshopper"));
exampleWords.add(new WordItem("دستور", "ادب", "سبد", "Command",
		"Curtsey", "Basket"));
exampleWords.add(new WordItem("ذات", "بذر", "اتخاذ ", "Nature", "Seed",
		"Take"));
exampleWords.add(new WordItem("راز", "برگ", "بهار", "Secret", "Leave",
		"Spring"));
exampleWords.add(new WordItem("زشت", "بزم", "ریز", "Ugly", "Banquet",
		"Tiny"));
exampleWords.add(new WordItem("ژاله", "پژمان", "شوفاژ", "Jaleh",
		"Pejman", "Radiator"));
exampleWords.add(new WordItem("سطل", "خاکستر", "خیس", "Bucket", "Ash",
		"Wet"));
exampleWords.add(new WordItem("شب", "پشم", "بیش", "Night", "Wool",
		"More"));
exampleWords.add(new WordItem("صدا", "شصت", "متخصص", "Sound", "Sixty",
		"Specialist"));
exampleWords.add(new WordItem("ضبط", "مضطرب", "قبض", "Record",
		"Worried", "Receipt"));
exampleWords.add(new WordItem("طلا", "سطل", "خط", "Gold", "Bucket",
		"Script"));
exampleWords.add(new WordItem("ظلم", "مظلوم", "واعظ", "cruelty",
		"Oppressed", "Preacher"));
exampleWords.add(new WordItem("علم", "معلم", "ولع", "Science",
		"Teacher", "Voracity"));
exampleWords.add(new WordItem("غنچه", "بغل", "باغ", "Gemma", "Hug",
		"Garden"));
exampleWords.add(new WordItem("فکر", "گفت", "کیف", "Thought", "Said",
		"Bag"));
exampleWords.add(new WordItem("قفل", "چاقو", "قایق", "Lock", "Knife",
		"Kayak"));
exampleWords.add(new WordItem("کتاب", "هیچکس", "لک لک", "Book",
		"Nobody", "Stork"));
exampleWords.add(new WordItem("گفت", "خوشگل", "برگ", "Said",
		"Beautiful", "Leave"));
exampleWords.add(new WordItem("لیوان", "ژاله", "گل", "Glass", "Zaleh",
		"Flower"));
exampleWords.add(new WordItem("مچ", "نماد", "سیم", "Wrist", "Symbol",
		"Wire"));
exampleWords.add(new WordItem("نان", "صنم", "میهن", "Bread", "Sanam",
		"Homeland"));
exampleWords.add(new WordItem("وان", "محبوب", "هلو", "Bath tub",
		"Popular", "Peach"));
exampleWords.add(new WordItem("هلو", "بهار", "به", "Peach", "Spring",
		"Quince"));
exampleWords.add(new WordItem("یلدا", "سیب", "بی بی", "Yalda", "Apple",
		"Queen"));



// TODO keep only the third word
exampleWords
.add(new WordItem("آب", "باد", "ما", "Water", "Wind", "Us"));
exampleWords.add(new WordItem("باد", "سبد", "سیب", "Wind", "Basket",
"Apple"));
exampleWords.add(new WordItem("پا", "سپید", "توپ", "Leg", "White",
"Ball"));
exampleWords.add(new WordItem("توپ", "دستور", "دست", "Ball", "Command",
"Hand"));
exampleWords.add(new WordItem("ثریا", "میثم", "مثلث", "Soraya",
"Meisam", "Triangle"));
exampleWords.add(new WordItem("جام", "کجا", "کج", "Cup", "Where",
"Crank"));
exampleWords.add(new WordItem("چب", "هیچکس", "مچ", "Left", "Nobody",
"Wrist"));
exampleWords.add(new WordItem("حس", "محبوب", "صبح", "Feeling",
"Popular", "Morning"));
exampleWords.add(new WordItem("خط", "بخت", "ملخ", "Script", "Fortune",
"Grasshopper"));
exampleWords.add(new WordItem("دستور", "ادب", "سبد", "Command",
"Curtsey", "Basket"));
exampleWords.add(new WordItem("ذات", "بذر", "اتخاذ ", "Nature", "Seed",
"Take"));
exampleWords.add(new WordItem("راز", "برگ", "بهار", "Secret", "Leave",
"Spring"));
exampleWords.add(new WordItem("زشت", "بزم", "ریز", "Ugly", "Banquet",
"Tiny"));
exampleWords.add(new WordItem("ژاله", "پژمان", "شوفاژ", "Jaleh",
"Pejman", "Radiator"));
exampleWords.add(new WordItem("سطل", "خاکستر", "خیس", "Bucket", "Ash",
"Wet"));
exampleWords.add(new WordItem("شب", "پشم", "بیش", "Night", "Wool",
"More"));
exampleWords.add(new WordItem("صدا", "شصت", "متخصص", "Sound", "Sixty",
"Specialist"));
exampleWords.add(new WordItem("ضبط", "مضطرب", "قبض", "Record",
"Worried", "Receipt"));
exampleWords.add(new WordItem("طلا", "سطل", "خط", "Gold", "Bucket",
"Script"));
exampleWords.add(new WordItem("ظلم", "مظلوم", "واعظ", "cruelty",
"Oppressed", "Preacher"));
exampleWords.add(new WordItem("علم", "معلم", "ولع", "Science",
"Teacher", "Voracity"));
exampleWords.add(new WordItem("غنچه", "بغل", "باغ", "Gemma", "Hug",
"Garden"));
exampleWords.add(new WordItem("فکر", "گفت", "کیف", "Thought", "Said",
"Bag"));
exampleWords.add(new WordItem("قفل", "چاقو", "قایق", "Lock", "Knife",
"Kayak"));
exampleWords.add(new WordItem("کتاب", "هیچکس", "لک لک", "Book",
"Nobody", "Stork"));
exampleWords.add(new WordItem("گفت", "خوشگل", "برگ", "Said",
"Beautiful", "Leave"));
exampleWords.add(new WordItem("لیوان", "بله", "گل", "Glass", "Yes",
"Flower"));
exampleWords.add(new WordItem("مچ", "نماد", "سیم", "Wrist", "Symbol",
"Wire"));
exampleWords.add(new WordItem("نان", "صنم", "میهن", "Bread", "Sanam",
"Homeland"));
exampleWords.add(new WordItem("وان", "محبوب", "هلو", "Bath tub",
"Popular", "Peach"));
exampleWords.add(new WordItem("هلو", "بهار", "به", "Peach", "Spring",
"Quince"));
exampleWords.add(new WordItem("یلدا", "سیب", "بی بی", "Yalda", "Apple",
"Queen"));
*/
		return exampleWords;
	}

	// TODO add spelling in latin "baab"
	public final String farsi;
	public final String english;

	public WordItem(String farsi, String english) {
		super();

		this.farsi = farsi;
		this.english = english;
	}
	
	@Override
	public String toString() {
		return farsi + " (" + english + ")";
	}
	

}
