package com.ahuralab.farsialphabet;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author msama (michele.sama@gmail.com)
 * @author psaeedi (panteha.s@gmail.com)
 *
 */
public class LetterItem {

	public static List<LetterItem> createFarsi() {
		List<LetterItem> items = new ArrayList<LetterItem>();
		// TODO add the proper sounds
    	items.add(new LetterItem("`alef", "ﺍ", "آ", "ـا", "ـا", R.raw.alef));
    	items.add(new LetterItem("be", "ب", "ﺑ", "ـبـ", "ـب", R.raw.be));
    	items.add(new LetterItem("pe", "پ", "ﭘ", "ـپـ", "ـپ", R.raw.pe));
    	items.add(new LetterItem("te", "ﺕ", "ﺗ", "ـتـ", "ـت", R.raw.te));
    	items.add(new LetterItem("s̱e", "ﺙ", "ﺛ", "ـثـ", "ـث", R.raw.se));
    	items.add(new LetterItem("jim", "ﺝ", "ﺟ", "ـجـ", "ﺞ", R.raw.jim));
    	items.add(new LetterItem("che", "ﭺ", "ﭼ", "ـچـ", "ﭻ", R.raw.che));
    	items.add(new LetterItem("he (heye jimi)", "ﺡ", "ﺣ", "ـحـ", "ﺢ", R.raw.he));
    	items.add(new LetterItem("khe", "ﺥ", "ﺧ", "ـخـ", "ﺦ", R.raw.khe));
    	items.add(new LetterItem("dāl", "ﺩ", "ﺩ", "ـد", "ـد", R.raw.dal));
    	items.add(new LetterItem("zāl", "ﺫ", "ﺫ", "ـذ", "ـذ", R.raw.ze));
    	items.add(new LetterItem("re", "ﺭ", "ﺭ", "ـر", "ـر", R.raw.re));
    	items.add(new LetterItem("ze", "ﺯ", "ﺯ", "ـز", "ـز", R.raw.ze));
    	items.add(new LetterItem("že", "ژ", "ژ", "ـژ", "ـژ", R.raw.zhe));
    	items.add(new LetterItem("sin", "ﺱ", "ﺳ", "ـسـ", "ـس", R.raw.se));
    	items.add(new LetterItem("shin", "ﺵ", "ﺷ", "ـشـ", "ـش", R.raw.she));
    	items.add(new LetterItem("sād", "ﺹ", "ﺻ", "ـصـ", "ـص", R.raw.se));
    	items.add(new LetterItem("zād", "ﺽ", "ﺿ", "ـضـ", "ـض", R.raw.ze));
    	items.add(new LetterItem("tā", "ﻁ", "ﻃ", "ـطـ", "ـط", R.raw.te));
    	items.add(new LetterItem("zā", "ﻅ", "ﻇ", "ـظـ", "ـظ", R.raw.ze));
    	items.add(new LetterItem("ʿeyn", "ﻉ", "ﻋ", "ـعـ", "ـع", R.raw.eh));
    	items.add(new LetterItem("ġeyn", "ﻍ", "ﻏ", "ـغـ", "ـغ", R.raw.ghe));
    	items.add(new LetterItem("fe", "ﻑ", "ﻓ", "ـفـ", "ـف", R.raw.fe));
    	items.add(new LetterItem("qāf", "ﻕ", "ﻗ", "ـقـ", "ـق", R.raw.ghe));
    	items.add(new LetterItem("kāf", "ک", "ﮐ", "ـکـ", "ـک", R.raw.ke));
    	items.add(new LetterItem("gāf", "گ", "ﮔ", "ـگـ", "ـگ", R.raw.ge));
    	items.add(new LetterItem("lām", "ﻝ", "ﻟ", "ـلـ", "ـل", R.raw.le));
    	items.add(new LetterItem("mim", "ﻡ", "ﻣ", "ـمـ", "ـم", R.raw.me));
    	items.add(new LetterItem("nun", "ﻥ", "ﻧ", "ـنـ", "ـن", R.raw.ne));
    	items.add(new LetterItem("vāv", "و", "و", "ـو", "ـو", R.raw.ve));
    	items.add(new LetterItem("he (heye do-cheshm)", "ﻩ", "هـ", "ـهـ", "ـه", R.raw.he));
    	items.add(new LetterItem("ye", "ﻯ", "ﻳ", "ـیـ", "ﯽ", R.raw.ey)); 
    	return items;
	}
	
	public final String name;
    public final String isolated;
    public final String begin;
    public final String middle;
    public final String end;
    public final int soundId;

    public LetterItem(String name, String isolated, String begin, String middle,
    		String end, int soundId) {
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