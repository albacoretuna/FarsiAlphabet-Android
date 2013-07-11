package com.ahuralab.farsialphabet;

import java.io.Serializable;

/**
 * 
 * @author msama (michele.sama@gmail.com)
 * @author psaeedi (panteha.s@gmail.com)
 * 
 */
public class LetterItem implements Serializable {

	private static final long serialVersionUID = 7981370926043420567L;

	public static final LetterItem[] FARSI = new LetterItem[] {
		new LetterItem("`alef", "ﺍ", "آ", "ـا", "ـا", R.raw.alef),
		new LetterItem("be", "ب", "ﺑ", "ـبـ", "ـب", R.raw.be),
		new LetterItem("pe", "پ", "ﭘ", "ـپـ", "ـپ", R.raw.pe),
		new LetterItem("te", "ﺕ", "ﺗ", "ـتـ", "ـت", R.raw.te),
		new LetterItem("s̱e", "ﺙ", "ﺛ", "ـثـ", "ـث", R.raw.se),
		new LetterItem("jim", "ﺝ", "ﺟ", "ـجـ", "ﺞ", R.raw.jim),
		new LetterItem("che", "ﭺ", "ﭼ", "ـچـ", "ﭻ", R.raw.che),
		new LetterItem("he (heye jimi)", "ﺡ", "ﺣ", "ـحـ", "ﺢ",
				R.raw.he),
		new LetterItem("khe", "ﺥ", "ﺧ", "ـخـ", "ﺦ", R.raw.khe),
		new LetterItem("dāl", "ﺩ", "ﺩ", "ـد", "ـد", R.raw.dal),
		new LetterItem("zāl", "ﺫ", "ﺫ", "ـذ", "ـذ", R.raw.ze),
		new LetterItem("re", "ﺭ", "ﺭ", "ـر", "ـر", R.raw.re),
		new LetterItem("ze", "ﺯ", "ﺯ", "ـز", "ـز", R.raw.ze),
		new LetterItem("že", "ژ", "ژ", "ـژ", "ـژ", R.raw.zhe),
		new LetterItem("sin", "ﺱ", "ﺳ", "ـسـ", "ـس", R.raw.se),
		new LetterItem("shin", "ﺵ", "ﺷ", "ـشـ", "ـش", R.raw.she),
		new LetterItem("sād", "ﺹ", "ﺻ", "ـصـ", "ـص", R.raw.se),
		new LetterItem("zād", "ﺽ", "ﺿ", "ـضـ", "ـض", R.raw.ze),
		new LetterItem("tā", "ﻁ", "ﻃ", "ـطـ", "ـط", R.raw.te),
		new LetterItem("zā", "ﻅ", "ﻇ", "ـظـ", "ـظ", R.raw.ze),
		new LetterItem("ʿeyn", "ﻉ", "ﻋ", "ـعـ", "ـع", R.raw.eh),
		new LetterItem("ġeyn", "ﻍ", "ﻏ", "ـغـ", "ـغ", R.raw.ghe),
		new LetterItem("fe", "ﻑ", "ﻓ", "ـفـ", "ـف", R.raw.fe),
		new LetterItem("qāf", "ﻕ", "ﻗ", "ـقـ", "ـق", R.raw.ghe),
		new LetterItem("kāf", "ک", "ﮐ", "ـکـ", "ـک", R.raw.ke),
		new LetterItem("gāf", "گ", "ﮔ", "ـگـ", "ـگ", R.raw.ge),
		new LetterItem("lām", "ﻝ", "ﻟ", "ـلـ", "ـل", R.raw.le),
		new LetterItem("mim", "ﻡ", "ﻣ", "ـمـ", "ـم", R.raw.me),
		new LetterItem("nun", "ﻥ", "ﻧ", "ـنـ", "ـن", R.raw.ne),
		new LetterItem("vāv", "و", "و", "ـو", "ـو", R.raw.ve),
		new LetterItem("he (heye do-cheshm)", "ﻩ", "هـ", "ـهـ", "ـه",
				R.raw.he),
		new LetterItem("ye", "ﻯ", "ﻳ", "ـیـ", "ﯽ", R.raw.ey)
	};

	public final String name;
	public final String isolated;
	public final String begin;
	public final String middle;
	public final String end;
	public final int soundId;

	public LetterItem(String name, String isolated, String begin,
			String middle, String end, int soundId) {
		super();
		this.name = name;
		this.isolated = isolated;
		this.begin = begin;
		this.middle = middle;
		this.end = end;
		this.soundId = soundId;
	}

	@Override
	public String toString() {
		return isolated + " - " + name;
	}
}