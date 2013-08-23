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
public class LetterPhonologyItem {

	public final static Map<String, ArrayList<LetterPhonologyItem>> EXAMPLE_PHONOLOGY_LETTERS = new HashMap<String, ArrayList<LetterPhonologyItem>>();

	static {
		EXAMPLE_PHONOLOGY_LETTERS.put("ﺍ",
				createArrayList("آ- ɐ", "ﺍ- æ or e or əʊ", "ﺍو- u:", "ﺍی- i:"));
		EXAMPLE_PHONOLOGY_LETTERS.put(
				"ب",
				createArrayList("با- bɐ", "ﺑ- bæ or be or bəʊ", "بو- bu:",
						"بی- bi:"));
		EXAMPLE_PHONOLOGY_LETTERS.put(
				"پ",
				createArrayList("پا- bɐ", "ﭘ- pæ or pe or pəʊ", "پو- pu:",
						"پی- pi:"));
		EXAMPLE_PHONOLOGY_LETTERS.put(
				"ت",
				createArrayList("تا- tɐ", "ﺗ- tæ or te or təʊ", "تو- tu:",
						"تی- ti:"));
		EXAMPLE_PHONOLOGY_LETTERS.put(
				"ﺙ",
				createArrayList("ثا- tɐ", "ﺛ- sæ or se or səʊ", "ثو- su:",
						"ثی- si:"));
		EXAMPLE_PHONOLOGY_LETTERS.put(
				"ﺝ",
				createArrayList("جا- jɐ", "ﺟ- jæ or je or jəʊ", "جو- ju:",
						"جی- ji:"));
		EXAMPLE_PHONOLOGY_LETTERS.put(
				"ﭺ",
				createArrayList("چا- tʃɐ", "ﭼ- tʃæ or tʃe or tʃəʊ", "چو- tʃu:",
						"چی- tʃi:"));
		EXAMPLE_PHONOLOGY_LETTERS.put(
				"ﺡ",
				createArrayList("حا- hɐ", "ﺣ- hæ or he or həʊ", "حو- hu:",
						"حی- hi:"));
		EXAMPLE_PHONOLOGY_LETTERS.put(
				"ﺥ",
				createArrayList("خا- xɐ", "ﺧ- xæ or xe or xəʊ", "خو- xu:",
						"خی- xi:"));
		EXAMPLE_PHONOLOGY_LETTERS.put(
				"ﺩ",
				createArrayList("ﺩا- dɐ", "ﺩ- dæ or de or dəʊ", "ﺩو- xu:",
						"ﺩی- xi:"));
		EXAMPLE_PHONOLOGY_LETTERS.put(
				"ﺫ",
				createArrayList("ذا- zɐ", "ﺫ- zæ or ze or zəʊ", "ﺫو- zu:",
						"ﺫی- zi:"));
		EXAMPLE_PHONOLOGY_LETTERS.put(
				"ﺭ",
				createArrayList("را- rɐ", "ر- ræ or re or rəʊ", "رو- ru:",
						"ری- ri:"));
		EXAMPLE_PHONOLOGY_LETTERS.put(
				"ﺯ",
				createArrayList("ﺯا- zɐ", "ﺯ- zæ or ze or zəʊ", "ﺯو- zu:",
						"ﺯی- zi:"));
		EXAMPLE_PHONOLOGY_LETTERS.put(
				"ژ",
				createArrayList("ژا- ʒɐ", "ژ- ʒæ or ʒe or ʒəʊ", "ژو- ʒu:",
						"ژی- ʒi:"));
		EXAMPLE_PHONOLOGY_LETTERS.put(
				"ﺱ",
				createArrayList("سا- tɐ", "ﺳ- sæ or se or səʊ", "سو- su:",
						"سی- si:"));
		EXAMPLE_PHONOLOGY_LETTERS.put(
				"ﺵ",
				createArrayList("شا- shɐ", "ﺷ- shæ or she or shəʊ", "شو- shu:",
						"شی- shi:"));
		EXAMPLE_PHONOLOGY_LETTERS.put(
				"ﺹ",
				createArrayList("صا- sɐ", "ﺻ- sæ or se or səʊ", "صو- su:",
						"صی- si:"));
		EXAMPLE_PHONOLOGY_LETTERS.put(
				"ﺽ",
				createArrayList("ضا- zɐ", "ﺿ- zæ or ze or zəʊ", "ضو- zu:",
						"ضی- zi:"));
		EXAMPLE_PHONOLOGY_LETTERS.put(
				"ﻁ",
				createArrayList("طا- tɐ", "ﻃ- tæ or te or təʊ", "طو- tu:",
						"طی- ti:"));
		EXAMPLE_PHONOLOGY_LETTERS.put(
				"ﻅ",
				createArrayList("ظا- zɐ", "ﻇ- zæ or ze or zəʊ", "ظو- zu:",
						"ظی- zi:"));
		EXAMPLE_PHONOLOGY_LETTERS
				.put("ﻉ",
						createArrayList("عا- ɐ", "ﻋ- æ or e or əʊ", "عو- u:",
								"عی- i:"));
		EXAMPLE_PHONOLOGY_LETTERS.put(
				"ﻍ",
				createArrayList("غا- ɣɐ", "ﻏ- ɣæ or ɣe or ɣəʊ", "غو- ɣu:",
						"غی- ɣi:"));
		EXAMPLE_PHONOLOGY_LETTERS.put(
				"ﻑ",
				createArrayList("فا- fɐ", "ﻓ- fæ or fe or fəʊ", "فو- fu:",
						"فی- fi:"));
		EXAMPLE_PHONOLOGY_LETTERS.put(
				"ﻕ",
				createArrayList("قا- ɣɐ", "ﻗ- ɣæ or ɣe or ɣəʊ", "قو- ɣu:",
						"قی- ɣi:"));
		EXAMPLE_PHONOLOGY_LETTERS.put(
				"ک",
				createArrayList("کا- kɐ", "ﮐ- kæ or ke or kəʊ", "کو- ku:",
						"کی- ki:"));
		EXAMPLE_PHONOLOGY_LETTERS.put(
				"گ",
				createArrayList("گا- gɐ", "ﮔ- gæ or ge or gəʊ", "گو- gu:",
						"گی- gi:"));
		EXAMPLE_PHONOLOGY_LETTERS.put(
				"ﻝ",
				createArrayList("لا- lɐ", "ﻟ- læ or le or ləʊ", "لو- lu:",
						"لی- li:"));
		EXAMPLE_PHONOLOGY_LETTERS.put(
				"ﻡ",
				createArrayList("ما- mɐ", "ﻣ- mæ or me or məʊ", "مو- mu:",
						"می- mi:"));
		EXAMPLE_PHONOLOGY_LETTERS.put(
				"ﻥ",
				createArrayList("نا- nɐ", "ﻧ- næ or ne or nəʊ", "نو- nu:",
						"نی- ni:"));
		EXAMPLE_PHONOLOGY_LETTERS.put(
				"و",
				createArrayList("وا- vɐ", "و- væ or ve or vəʊ", "وو- vu:",
						"وی- vi:"));
		EXAMPLE_PHONOLOGY_LETTERS.put(
				"ﻩ",
				createArrayList("ها- hɐ", "هـ- hæ or he or həʊ", "هو- hu:",
						"هی- hi:"));
		EXAMPLE_PHONOLOGY_LETTERS.put(
				"ﻯ",
				createArrayList("یا- jɐ", "ﻳ- jæ or je or jəʊ", "یو- ju:",
						"یی- ji:"));
	}

	public final String letterElement;

	public LetterPhonologyItem(String letterElement) {
		this.letterElement = letterElement;
	}

	private static ArrayList<LetterPhonologyItem> createArrayList(
			String... elements) {
		ArrayList<LetterPhonologyItem> list = new ArrayList<LetterPhonologyItem>();

		for (String element : elements) {

			list.add(new LetterPhonologyItem(element));
		}
		return list;
	}

}