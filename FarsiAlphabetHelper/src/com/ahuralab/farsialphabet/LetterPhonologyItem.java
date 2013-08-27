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

	public final static Map<String, ArrayList<LetterPhonologyItem>> EXAMPLE_PHONOLOGY_LETTERS = 
			new HashMap<String, ArrayList<LetterPhonologyItem>>();

	static {
		EXAMPLE_PHONOLOGY_LETTERS.put("ﺍ",
				createArrayList("آ- ɐ", "ﺍ- æ, e or əʊ", "ﺍو- u:", "ﺍی- :i"));
		EXAMPLE_PHONOLOGY_LETTERS.put(
				"ب",
				createArrayList("با- bɐ", "ﺑ- bæ, be or bəʊ", "بو- :bu",
						"بی- :bi"));
		EXAMPLE_PHONOLOGY_LETTERS.put(
				"پ",
				createArrayList("پا- pɐ", "ﭘ- pæ, pe or pəʊ", "پو- :pu",
						"پی- :pi"));
		EXAMPLE_PHONOLOGY_LETTERS.put(
				"ﺕ",
				createArrayList("تا- tɐ", "ﺗ- tæ, te or təʊ", "تو- :tu",
						"تی- :ti"));
		EXAMPLE_PHONOLOGY_LETTERS.put(
				"ﺙ",
				createArrayList("ثا- sɐ", "ﺛ- sæ, se or səʊ", "ثو- :su",
						"ثی- :si"));
		EXAMPLE_PHONOLOGY_LETTERS.put(
				"ﺝ",
				createArrayList("جا- ʤɐ", "ﺟ- ʤæ, ʤe or ʤəʊ", "جو- :ʤu",
						"جی- :ʤi"));
		EXAMPLE_PHONOLOGY_LETTERS.put(
				"ﭺ",
				createArrayList("چا- tʃɐ", "ﭼ- tʃæ, tʃe or tʃəʊ", "چو- :tʃu",
						"چی- :tʃi"));
		EXAMPLE_PHONOLOGY_LETTERS.put(
				"ﺡ",
				createArrayList("حا- hɐ", "ﺣ- hæ, he or həʊ", "حو- :hu",
						"حی- :hi"));
		EXAMPLE_PHONOLOGY_LETTERS.put(
				"ﺥ",
				createArrayList("خا- xɐ", "ﺧ- xæ, xe or xəʊ", "خو- :xu",
						"خی- :xi"));
		EXAMPLE_PHONOLOGY_LETTERS.put(
				"ﺩ",
				createArrayList("ﺩا- dɐ", "ﺩ- dæ, de or dəʊ", "ﺩو- :xu",
						"ﺩی- :xi"));
		EXAMPLE_PHONOLOGY_LETTERS.put(
				"ﺫ",
				createArrayList("ذا- zɐ", "ﺫ- zæ, ze or zəʊ", "ﺫو- :zu",
						"ﺫی- :zi"));
		EXAMPLE_PHONOLOGY_LETTERS.put(
				"ﺭ",
				createArrayList("را- rɐ", "ر- ræ, re or rəʊ", "رو- :ru",
						"ری- :ri"));
		EXAMPLE_PHONOLOGY_LETTERS.put(
				"ﺯ",
				createArrayList("ﺯا- zɐ", "ﺯ- zæ, ze or zəʊ", "ﺯو- :zu",
						"ﺯی- :zi"));
		EXAMPLE_PHONOLOGY_LETTERS.put(
				"ژ",
				createArrayList("ژا- ʒɐ", "ژ- ʒæ, ʒe or ʒəʊ", "ژو- :ʒu",
						"ژی- :ʒi"));
		EXAMPLE_PHONOLOGY_LETTERS.put(
				"ﺱ",
				createArrayList("سا- sɐ", "ﺳ- sæ, se or səʊ", "سو- :su",
						"سی- :si"));
		EXAMPLE_PHONOLOGY_LETTERS.put(
				"ﺵ",
				createArrayList("شا- shɐ", "ﺷ- shæ, she or shəʊ", "شو- :shu",
						"شی- :shi"));
		EXAMPLE_PHONOLOGY_LETTERS.put(
				"ﺹ",
				createArrayList("صا- sɐ", "ﺻ- sæ, se or səʊ", "صو- :su",
						"صی- :si"));
		EXAMPLE_PHONOLOGY_LETTERS.put(
				"ﺽ",
				createArrayList("ضا- zɐ", "ﺿ- zæ, ze or zəʊ", "ضو- :zu",
						"ضی- :zi"));
		EXAMPLE_PHONOLOGY_LETTERS.put(
				"ﻁ",
				createArrayList("طا- tɐ", "ﻃ- tæ, te or təʊ", "طو- :tu",
						"طی- :ti"));
		EXAMPLE_PHONOLOGY_LETTERS.put(
				"ﻅ",
				createArrayList("ظا- zɐ", "ﻇ- zæ, ze or zəʊ", "ظو- :zu",
						"ظی- :zi"));
		EXAMPLE_PHONOLOGY_LETTERS
				.put("ﻉ",
						createArrayList("عا- ɐ", "ﻋ- æ, e or əʊ", "عو- :u",
								"عی- :i"));
		EXAMPLE_PHONOLOGY_LETTERS.put(
				"ﻍ",
				createArrayList("غا- ɣɐ", "ﻏ- ɣæ, ɣe or ɣəʊ", "غو- :ɣu",
						"غی- :ɣi"));
		EXAMPLE_PHONOLOGY_LETTERS.put(
				"ﻑ",
				createArrayList("فا- fɐ", "ﻓ- fæ, fe or fəʊ", "فو- :fu",
						"فی- :fi"));
		EXAMPLE_PHONOLOGY_LETTERS.put(
				"ﻕ",
				createArrayList("قا- ɣɐ", "ﻗ- ɣæ, ɣe or ɣəʊ", "قو- :ɣu",
						"قی- :ɣi"));
		EXAMPLE_PHONOLOGY_LETTERS.put(
				"ک",
				createArrayList("کا- kɐ", "ﮐ- kæ, ke or kəʊ", "کو- :ku",
						"کی- :ki"));
		EXAMPLE_PHONOLOGY_LETTERS.put(
				"گ",
				createArrayList("گا- gɐ", "ﮔ- gæ, ge or gəʊ", "گو- :gu",
						"گی- :gi"));
		EXAMPLE_PHONOLOGY_LETTERS.put(
				"ﻝ",
				createArrayList("لا- lɐ", "ﻟ- læ, le or ləʊ", "لو- :lu",
						"لی- :li"));
		EXAMPLE_PHONOLOGY_LETTERS.put(
				"ﻡ",
				createArrayList("ما- mɐ", "ﻣ- mæ, me or məʊ", "مو- :mu",
						"می- :mi"));
		EXAMPLE_PHONOLOGY_LETTERS.put(
				"ﻥ",
				createArrayList("نا- nɐ", "ﻧ- næ, ne or nəʊ", "نو- :nu ",
						"نی- :ni"));
		EXAMPLE_PHONOLOGY_LETTERS.put(
				"و",
				createArrayList("وا- vɐ", "و- væ, ve or vəʊ", "وو- :vu",
						"وی- :vi"));
		EXAMPLE_PHONOLOGY_LETTERS.put(
				"ﻩ",
				createArrayList("ها- hɐ", "هـ- hæ, he or həʊ", "هو- :hu",
						"هی- :hi"));
		EXAMPLE_PHONOLOGY_LETTERS.put(
				"ﻯ",
				createArrayList("یا- jɐ", "ﻳ- jæ, je or jəʊ", "یو- :ju",
						"یی- :ji"));
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