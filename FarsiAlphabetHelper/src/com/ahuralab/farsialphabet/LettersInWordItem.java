package com.ahuralab.farsialphabet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author msama (michele.sama@gmail.com)
 * @author psaeedi (panteha.s@gmail.com)
 * 
 */
public class LettersInWordItem {

	public final static Map<String, ArrayList<LettersInWordItem>> EXAMPLE_WORDS_LETTERS = 
			new HashMap<String, ArrayList<LettersInWordItem>>();

	static {
		EXAMPLE_WORDS_LETTERS.put("آب", createArrayList("ب", "آ", "ɐb"));
		EXAMPLE_WORDS_LETTERS.put("باد", createArrayList("د", "ﺍ", "ب", "bɐd"));
		EXAMPLE_WORDS_LETTERS.put("ما", createArrayList("ﺍ", "م", "mɐ"));
		EXAMPLE_WORDS_LETTERS
				.put("سیب", createArrayList("ب", "ی", "س", "si:b"));
		EXAMPLE_WORDS_LETTERS.put("سبد",
				createArrayList("د", "ب", "س", "sæbæd"));
		EXAMPLE_WORDS_LETTERS.put("پا", createArrayList("ا", "پ", "pɐ"));
		EXAMPLE_WORDS_LETTERS.put("سپید",
				createArrayList("د", "ی", "پ", "س", "sepi:d"));
		EXAMPLE_WORDS_LETTERS
				.put("توپ", createArrayList("پ", "و", "ت", "tu:p"));
		EXAMPLE_WORDS_LETTERS.put("دستور",
				createArrayList("ر", "و", "ت", "س", "د", "dæstu:r"));
		EXAMPLE_WORDS_LETTERS
				.put("دست", createArrayList("ت", "س", "د", "dæst"));
		EXAMPLE_WORDS_LETTERS.put("ثریا",
				createArrayList("ا", "ی", "ر", "ث", "səʊræjɐ"));
		EXAMPLE_WORDS_LETTERS.put("میثم",
				createArrayList("م", "ث", "ی", "م", "meəsæm"));
		EXAMPLE_WORDS_LETTERS.put("مثلث",
				createArrayList("ث", "ل", "ث", "م", "məʊsælæs"));
		EXAMPLE_WORDS_LETTERS.put("جام", createArrayList("م", "ا", "ج", "jɐm"));
		EXAMPLE_WORDS_LETTERS.put("کجا",
				createArrayList("ا", "ج", "ک", "kəʊjɐ"));
		EXAMPLE_WORDS_LETTERS.put("کج", createArrayList("ج", "ک", "kæj"));
		EXAMPLE_WORDS_LETTERS.put("چپ", createArrayList("پ", "چ", "tʃæp"));
		EXAMPLE_WORDS_LETTERS.put("هیچکس",
				createArrayList("س", "ک", "چ", "ی", "ه", "hItʃkæs"));
		EXAMPLE_WORDS_LETTERS.put("مچ", createArrayList("چ", "م", "məʊtʃ"));
		EXAMPLE_WORDS_LETTERS.put("حس", createArrayList("س", "ح", "hes"));
		EXAMPLE_WORDS_LETTERS.put("محبوب",
				createArrayList("ب", "و", "ب", "ح", "م", "mæhbu:b"));
		EXAMPLE_WORDS_LETTERS.put("فرح",
				createArrayList("ح", "ر", "ف", "Færæh"));
		EXAMPLE_WORDS_LETTERS.put("خط", createArrayList("ط", "خ", "xæt"));
		EXAMPLE_WORDS_LETTERS
				.put("بخت", createArrayList("ت", "خ", "ب", "bæxt"));
		EXAMPLE_WORDS_LETTERS.put("ملخ",
				createArrayList("خ", "ل", "م", "mælæx"));
		EXAMPLE_WORDS_LETTERS
				.put("ادب", createArrayList("ب", "د", "ا", "ædæb"));
		EXAMPLE_WORDS_LETTERS
				.put("ذات", createArrayList("ت", "ا", "ذ ", "zɐt"));
		EXAMPLE_WORDS_LETTERS.put("بذر",
				createArrayList("ر", "ذ", "ب ", "bæzr"));
		EXAMPLE_WORDS_LETTERS.put("اتخاذ",
				createArrayList("ذ", "ا", "خ ", "ت", "ا", "etxɐz"));
		EXAMPLE_WORDS_LETTERS.put("راز", createArrayList("ز", "ا", "ر", "rɐz"));
		EXAMPLE_WORDS_LETTERS.put("بز", createArrayList("ز", "ب", "bəʊz"));
		EXAMPLE_WORDS_LETTERS.put("زشت",
				createArrayList("ت", "ش", "ز", "zesht"));
		EXAMPLE_WORDS_LETTERS.put("ژاله",
				createArrayList("ه", "ل", "ا", "ژ", "ʒɐleh"));
		EXAMPLE_WORDS_LETTERS.put("پژواک",
				createArrayList("ک", "ا", "و", "ژ", "پ", "pæʒvɐk"));
		EXAMPLE_WORDS_LETTERS.put("شوفاژ",
				createArrayList("ژ", "ا", "ف", "و", "ش", "shu:fɐʒ"));
		EXAMPLE_WORDS_LETTERS
				.put("خیس", createArrayList("س", "ی", "خ", "xi:s"));
		EXAMPLE_WORDS_LETTERS.put("اسم", createArrayList("م", "س", "ا", "esm"));
		EXAMPLE_WORDS_LETTERS
				.put("سطل", createArrayList("ل", "ط", "س", "sætl"));
		EXAMPLE_WORDS_LETTERS.put("شب", createArrayList("ب", "ش", "shæb"));
		EXAMPLE_WORDS_LETTERS.put("پشم",
				createArrayList("م", "ش", "پ", "pæshm"));
		EXAMPLE_WORDS_LETTERS.put("آرش",
				createArrayList("ش", "ر", "ا", "ɐræsh"));
		EXAMPLE_WORDS_LETTERS.put("عاص", createArrayList("ص", "ا", "ع", "ɐs"));
		EXAMPLE_WORDS_LETTERS.put("اصل", createArrayList("ل", "ص", "ا", "æsl"));
		EXAMPLE_WORDS_LETTERS.put("صنم",
				createArrayList("م", "ن", "ص", "Sænæm"));
		EXAMPLE_WORDS_LETTERS
				.put("قبض", createArrayList("ض", "ب", "ق", "ɣæbz"));
		EXAMPLE_WORDS_LETTERS.put("مضطرب",
				createArrayList("ب", "ر", "ط", "ض", "م", "məʊztæreb"));
		EXAMPLE_WORDS_LETTERS
				.put("ضبط", createArrayList("ط", "ب", "ض", "zæbt"));
		EXAMPLE_WORDS_LETTERS
				.put("طلا", createArrayList("ا", "ل", "ط", "tælɐ"));
		EXAMPLE_WORDS_LETTERS
				.put("سطل", createArrayList("ل", "ط", "س", "sætl"));
		EXAMPLE_WORDS_LETTERS.put("خط", createArrayList("ط", "خ", "xæt"));
		EXAMPLE_WORDS_LETTERS.put("واعظ",
				createArrayList("ظ", "ع", "ا", "و", "vɐez"));
		EXAMPLE_WORDS_LETTERS.put("مظلوم",
				createArrayList("م", "و", "ل", "ظ", "م", "mæzlu:m"));
		EXAMPLE_WORDS_LETTERS.put("ظلم",
				createArrayList("م", "ل", "ظ", "zəʊlm"));
		EXAMPLE_WORDS_LETTERS
				.put("علی", createArrayList("ی", "ل", "ع", "æli:"));
		EXAMPLE_WORDS_LETTERS.put("معلم",
				createArrayList("م", "ل", "ع", "م", "məʊælem"));
		EXAMPLE_WORDS_LETTERS.put("طلوع",
				createArrayList("ع", "و", "ل", "ط", "təʊləʊ"));
		EXAMPLE_WORDS_LETTERS.put("باغ", createArrayList("غ", "ا", "ب", "bɐɣ"));
		EXAMPLE_WORDS_LETTERS.put("بغل",
				createArrayList("ل", "غ", "ب", "bæɣæl"));
		EXAMPLE_WORDS_LETTERS.put("غنچه",
				createArrayList("ه", "چ", "ن", "غ", "ɣəʊntʃeh"));
		EXAMPLE_WORDS_LETTERS
				.put("کیف", createArrayList("ف", "ی", "ک", "ki:f"));
		EXAMPLE_WORDS_LETTERS.put("گفت",
				createArrayList("ت", "ف", "گ", "gəʊft"));
		EXAMPLE_WORDS_LETTERS
				.put("فکر", createArrayList("ر", "ک", "ف", "fekr"));
		EXAMPLE_WORDS_LETTERS.put("قایق",
				createArrayList("ق", "ی", "ا", "ق", "ɣæeəɣ"));
		EXAMPLE_WORDS_LETTERS.put("چاقو",
				createArrayList("و", "ق", "ا", "چ", "tʃɐɣəʊ"));
		EXAMPLE_WORDS_LETTERS.put("قفل",
				createArrayList("ل", "ف", "ق", "ɣəʊfl"));
		EXAMPLE_WORDS_LETTERS.put("بادبادک",
				createArrayList("ک", "د", "ا", "ب", "د", "ا", "ب", "bɐdbɐdæk"));
		EXAMPLE_WORDS_LETTERS.put("هیچکس",
				createArrayList("س", "ک", "چ", "ی", "ه", "hi:tʃkæs"));
		EXAMPLE_WORDS_LETTERS.put("کتاب",
				createArrayList("ب", "ا", "ت", "ک", "ketɐb"));
		EXAMPLE_WORDS_LETTERS
				.put("برگ", createArrayList("گ", "ر", "ب", "bærg"));
		EXAMPLE_WORDS_LETTERS.put("خوشگل",
				createArrayList("ل", "گ", "ش", "و", "خ", "xu:shgel"));
		EXAMPLE_WORDS_LETTERS.put("گل", createArrayList("ل", "گ", "gəʊl"));
		EXAMPLE_WORDS_LETTERS.put("لیوان",
				createArrayList("ن", "ا", "و", "ی", "ل", "li:vɐn"));
		EXAMPLE_WORDS_LETTERS.put("مادر",
				createArrayList("ر", "د", "ا", "م", "Mɐdær"));
		EXAMPLE_WORDS_LETTERS.put("مچ", createArrayList("چ", "م", "məʊtʃ"));
		EXAMPLE_WORDS_LETTERS.put("میهن",
				createArrayList("ن", "ه", "ی", "م", "mi:hæn"));
		EXAMPLE_WORDS_LETTERS.put("نان", createArrayList("ن", "ا", "ن", "nɐn"));
		EXAMPLE_WORDS_LETTERS.put("هلو",
				createArrayList("و", "ل", "ه", "həʊlu:"));
		EXAMPLE_WORDS_LETTERS.put("وان", createArrayList("ن", "ا", "و", "vɐn"));
		EXAMPLE_WORDS_LETTERS.put("به", createArrayList("ه", "ب", "beh"));
		EXAMPLE_WORDS_LETTERS.put("بهار",
				createArrayList("ر", "ا", "ه", "ب", "bæhɐr"));
		EXAMPLE_WORDS_LETTERS.put("بی بی",
				createArrayList("ی ", "ب", "ی ", "ب", "bi:bi:"));
		EXAMPLE_WORDS_LETTERS.put("یلدا",
				createArrayList("ا", "د", "ل", "ی", "jældɐ"));
	}

	public final String letterElement;

	public LettersInWordItem(String letterElement) {
		this.letterElement = letterElement;
	}

	private static ArrayList<LettersInWordItem> createArrayList(
			String... elements) {
		ArrayList<LettersInWordItem> list = new ArrayList<LettersInWordItem>();

		for (String element : elements) {

			list.add(new LettersInWordItem(element));
		}
		return list;
	}

}