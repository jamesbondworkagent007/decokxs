package com.ibm.icu.text;

import com.ibm.icu.impl.CurrencyData;
import com.ibm.icu.text.PluralRules;
import com.ibm.icu.util.ICUCloneNotSupportedException;
import com.ibm.icu.util.ULocale;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class CurrencyPluralInfo implements Cloneable, Serializable {
    private static final String defaultCurrencyPluralPattern;
    private static final char[] defaultCurrencyPluralPatternChar;
    private static final long serialVersionUID = 1;
    private static final char[] tripleCurrencySign;
    private static final String tripleCurrencyStr;
    private Map<String, String> pluralCountToCurrencyUnitPattern = null;
    private PluralRules pluralRules = null;
    private ULocale ulocale = null;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ULocale getLocale() {
        return this.ulocale;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PluralRules getPluralRules() {
        return this.pluralRules;
    }

    public CurrencyPluralInfo() {
        initialize(ULocale.getDefault(ULocale.Category.FORMAT));
    }

    public CurrencyPluralInfo(Locale locale) {
        initialize(ULocale.forLocale(locale));
    }

    public CurrencyPluralInfo(ULocale uLocale) {
        initialize(uLocale);
    }

    public static CurrencyPluralInfo getInstance() {
        return new CurrencyPluralInfo();
    }

    public static CurrencyPluralInfo getInstance(Locale locale) {
        return new CurrencyPluralInfo(locale);
    }

    public static CurrencyPluralInfo getInstance(ULocale uLocale) {
        return new CurrencyPluralInfo(uLocale);
    }

    public String getCurrencyPluralPattern(String str) {
        String str2 = this.pluralCountToCurrencyUnitPattern.get(str);
        if (str2 != null) {
            return str2;
        }
        if (!str.equals("other")) {
            str2 = this.pluralCountToCurrencyUnitPattern.get("other");
        }
        return str2 == null ? defaultCurrencyPluralPattern : str2;
    }

    public void setPluralRules(String str) {
        this.pluralRules = PluralRules.createRules(str);
    }

    public void setCurrencyPluralPattern(String str, String str2) {
        this.pluralCountToCurrencyUnitPattern.put(str, str2);
    }

    public void setLocale(ULocale uLocale) {
        this.ulocale = uLocale;
        initialize(uLocale);
    }

    public Object clone() {
        try {
            CurrencyPluralInfo currencyPluralInfo = (CurrencyPluralInfo) super.clone();
            currencyPluralInfo.ulocale = (ULocale) this.ulocale.clone();
            currencyPluralInfo.pluralCountToCurrencyUnitPattern = new HashMap();
            for (String str : this.pluralCountToCurrencyUnitPattern.keySet()) {
                currencyPluralInfo.pluralCountToCurrencyUnitPattern.put(str, this.pluralCountToCurrencyUnitPattern.get(str));
            }
            return currencyPluralInfo;
        } catch (CloneNotSupportedException e) {
            throw new ICUCloneNotSupportedException(e);
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof CurrencyPluralInfo) {
            CurrencyPluralInfo currencyPluralInfo = (CurrencyPluralInfo) obj;
            if (this.pluralRules.equals(currencyPluralInfo.pluralRules) && this.pluralCountToCurrencyUnitPattern.equals(currencyPluralInfo.pluralCountToCurrencyUnitPattern)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.pluralCountToCurrencyUnitPattern.hashCode() ^ this.pluralRules.hashCode()) ^ this.ulocale.hashCode();
    }

    @Deprecated
    public String select(double d) {
        return this.pluralRules.select(d);
    }

    @Deprecated
    public String select(PluralRules.FixedDecimal fixedDecimal) {
        return this.pluralRules.select(fixedDecimal);
    }

    @Deprecated
    public Iterator<String> pluralPatternIterator() {
        return this.pluralCountToCurrencyUnitPattern.keySet().iterator();
    }

    private void initialize(ULocale uLocale) {
        this.ulocale = uLocale;
        this.pluralRules = PluralRules.forLocale(uLocale);
        setupCurrencyPluralPattern(uLocale);
    }

    private void setupCurrencyPluralPattern(ULocale uLocale) {
        String strSubstring;
        this.pluralCountToCurrencyUnitPattern = new HashMap();
        String pattern = NumberFormat.getPattern(uLocale, 0);
        int iIndexOf = pattern.indexOf(";");
        if (iIndexOf != -1) {
            strSubstring = pattern.substring(iIndexOf + 1);
            pattern = pattern.substring(0, iIndexOf);
        } else {
            strSubstring = null;
        }
        for (Map.Entry<String, String> entry : CurrencyData.KWHzl.OLrzqt(uLocale, true).copydefault().entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            String strReplace = value.replace("{0}", pattern);
            String str = tripleCurrencyStr;
            String strReplace2 = strReplace.replace("{1}", str);
            if (iIndexOf != -1) {
                strReplace2 = strReplace2 + ";" + value.replace("{0}", strSubstring).replace("{1}", str);
            }
            this.pluralCountToCurrencyUnitPattern.put(key, strReplace2);
        }
    }

    static {
        char[] cArr = {164, 164, 164};
        tripleCurrencySign = cArr;
        tripleCurrencyStr = new String(cArr);
        char[] cArr2 = {0, '.', '#', '#', ' ', 164, 164, 164};
        defaultCurrencyPluralPatternChar = cArr2;
        defaultCurrencyPluralPattern = new String(cArr2);
    }
}
