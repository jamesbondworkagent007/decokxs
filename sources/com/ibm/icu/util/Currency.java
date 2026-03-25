package com.ibm.icu.util;

import androidx.camera.video.AudioStats;
import com.google.android.exoplayer2.C;
import com.huawei.hms.framework.common.ExceptionCode;
import com.ibm.icu.impl.ICUResourceBundle;
import com.ibm.icu.impl.StaticUnicodeSets;
import com.ibm.icu.util.MeasureUnit;
import com.ibm.icu.util.ULocale;
import java.io.ObjectStreamException;
import java.lang.ref.SoftReference;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.Set;
import o.AbstractC7013abN;
import o.AbstractC7078acz;
import o.AbstractC7205afT;
import o.C7027acA;
import o.C7029acC;
import o.C7060ach;
import o.C7207afV;
import o.InterfaceC7054acb;

/* JADX INFO: loaded from: classes3.dex */
public class Currency extends MeasureUnit {
    private static SoftReference<Set<String>> ALL_CODES_AS_SET = null;
    private static SoftReference<List<String>> ALL_TENDER_CODES = null;
    public static final int FORMAL_SYMBOL_NAME = 4;
    public static final int LONG_NAME = 1;
    public static final int NARROW_SYMBOL_NAME = 3;
    public static final int PLURAL_LONG_NAME = 2;
    public static final int SYMBOL_NAME = 0;
    public static final int VARIANT_SYMBOL_NAME = 5;
    private static final long serialVersionUID = -5839973855554750484L;
    private static ActionBar shim;
    private final String isoCode;
    private static final boolean DEBUG = C7060ach.AEQbTJ("currency");
    private static InterfaceC7054acb<ULocale, List<C7029acC<Activity>>> CURRENCY_NAME_CACHE = new C7027acA();
    private static final AbstractC7013abN<String, Currency, Void> regionCurrencyCache = new AbstractC7078acz<String, Currency, Void>() { // from class: com.ibm.icu.util.Currency.2
        /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // o.AbstractC7013abN
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public Currency copydefault(String str, Void r2) {
            return Currency.loadCurrency(str);
        }
    };
    private static final ULocale UND = new ULocale(C.LANGUAGE_UNDETERMINED);
    private static final String[] EMPTY_STRING_ARRAY = new String[0];
    private static final int[] POW10 = {1, 10, 100, 1000, 10000, 100000, 1000000, ExceptionCode.CRASH_EXCEPTION, 100000000, 1000000000};

    public static abstract class ActionBar {
        public abstract Object KWHzl(Currency currency, ULocale uLocale);

        public abstract Locale[] KWHzl();

        public abstract ULocale[] OLrzqt();

        public abstract Currency copydefault(ULocale uLocale);

        public abstract boolean copydefault(Object obj);
    }

    public enum CurrencyUsage {
        STANDARD,
        CASH
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getCurrencyCode() {
        return this.subType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.ibm.icu.util.MeasureUnit
    public String toString() {
        return this.subType;
    }

    private static ActionBar getShim() {
        if (shim == null) {
            try {
                shim = (ActionBar) Class.forName("o.agL").newInstance();
            } catch (Exception e) {
                if (DEBUG) {
                    e.printStackTrace();
                }
                throw new RuntimeException(e.getMessage());
            }
        }
        return shim;
    }

    public static Currency getInstance(Locale locale) {
        return getInstance(ULocale.forLocale(locale));
    }

    public static Currency getInstance(ULocale uLocale) {
        String keywordValue = uLocale.getKeywordValue("currency");
        if (keywordValue != null) {
            return getInstance(keywordValue);
        }
        ActionBar actionBar = shim;
        if (actionBar == null) {
            return createCurrency(uLocale);
        }
        return actionBar.copydefault(uLocale);
    }

    public static String[] getAvailableCurrencyCodes(ULocale uLocale, Date date) {
        List<String> tenderCurrencies = getTenderCurrencies(C7207afV.ActionBar.EZpvd(date).AEQbTJ(ULocale.getRegionForSupplementalData(uLocale, false)));
        if (tenderCurrencies.isEmpty()) {
            return null;
        }
        return (String[]) tenderCurrencies.toArray(new String[tenderCurrencies.size()]);
    }

    public static String[] getAvailableCurrencyCodes(Locale locale, Date date) {
        return getAvailableCurrencyCodes(ULocale.forLocale(locale), date);
    }

    public static Set<Currency> getAvailableCurrencies() {
        List<String> listCopydefault = C7207afV.OLrzqt().copydefault(C7207afV.ActionBar.copydefault());
        HashSet hashSet = new HashSet(listCopydefault.size());
        Iterator<String> it = listCopydefault.iterator();
        while (it.hasNext()) {
            hashSet.add(getInstance(it.next()));
        }
        return hashSet;
    }

    public static Currency createCurrency(ULocale uLocale) {
        return regionCurrencyCache.AEQbTJ(ULocale.getRegionForSupplementalData(uLocale, false), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Currency loadCurrency(String str) {
        List<String> listCopydefault = C7207afV.OLrzqt().copydefault(C7207afV.ActionBar.EZpvd(str));
        if (listCopydefault.isEmpty()) {
            return null;
        }
        return getInstance(listCopydefault.get(0));
    }

    public static Currency getInstance(String str) {
        if (str == null) {
            throw new NullPointerException("The input currency code is null.");
        }
        if (!isAlpha3Code(str)) {
            throw new IllegalArgumentException("The input currency code is not 3-letter alphabetic code.");
        }
        return (Currency) MeasureUnit.internalGetInstance("currency", str.toUpperCase(Locale.ENGLISH));
    }

    private static boolean isAlpha3Code(String str) {
        if (str.length() != 3) {
            return false;
        }
        for (int i = 0; i < 3; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt < 'A' || ((cCharAt > 'Z' && cCharAt < 'a') || cCharAt > 'z')) {
                return false;
            }
        }
        return true;
    }

    public static Currency fromJavaCurrency(java.util.Currency currency) {
        return getInstance(currency.getCurrencyCode());
    }

    public java.util.Currency toJavaCurrency() {
        return java.util.Currency.getInstance(getCurrencyCode());
    }

    public static Object registerInstance(Currency currency, ULocale uLocale) {
        return getShim().KWHzl(currency, uLocale);
    }

    public static boolean unregister(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("registryKey must not be null");
        }
        ActionBar actionBar = shim;
        if (actionBar == null) {
            return false;
        }
        return actionBar.copydefault(obj);
    }

    public static Locale[] getAvailableLocales() {
        ActionBar actionBar = shim;
        if (actionBar == null) {
            return ICUResourceBundle.copydefault();
        }
        return actionBar.KWHzl();
    }

    public static ULocale[] getAvailableULocales() {
        ActionBar actionBar = shim;
        if (actionBar == null) {
            return ICUResourceBundle.OLrzqt();
        }
        return actionBar.OLrzqt();
    }

    public static final String[] getKeywordValuesForLocale(String str, ULocale uLocale, boolean z) {
        if (!"currency".equals(str)) {
            return EMPTY_STRING_ARRAY;
        }
        if (!z) {
            return (String[]) getAllTenderCurrencies().toArray(new String[0]);
        }
        if (UND.equals(uLocale)) {
            return EMPTY_STRING_ARRAY;
        }
        List<String> tenderCurrencies = getTenderCurrencies(C7207afV.ActionBar.KWHzl().AEQbTJ(ULocale.getRegionForSupplementalData(uLocale, true)));
        return tenderCurrencies.size() == 0 ? EMPTY_STRING_ARRAY : (String[]) tenderCurrencies.toArray(new String[tenderCurrencies.size()]);
    }

    public int getNumericCode() {
        try {
            return UResourceBundle.copydefault("com/ibm/icu/impl/data/icudt68b", "currencyNumericCodes", ICUResourceBundle.AEQbTJ).isConnected("codeMap").isConnected(this.subType).fIwbmz();
        } catch (MissingResourceException unused) {
            return 0;
        }
    }

    public String getSymbol() {
        return getSymbol(ULocale.getDefault(ULocale.Category.DISPLAY));
    }

    public String getSymbol(Locale locale) {
        return getSymbol(ULocale.forLocale(locale));
    }

    public String getSymbol(ULocale uLocale) {
        return getName(uLocale, 0, (boolean[]) null);
    }

    public String getName(Locale locale, int i, boolean[] zArr) {
        return getName(ULocale.forLocale(locale), i, zArr);
    }

    public String getName(ULocale uLocale, int i, boolean[] zArr) {
        if (zArr != null) {
            zArr[0] = false;
        }
        AbstractC7205afT abstractC7205afTKWHzl = AbstractC7205afT.KWHzl(uLocale);
        if (i == 0) {
            return abstractC7205afTKWHzl.EZpvd(this.subType);
        }
        if (i == 1) {
            return abstractC7205afTKWHzl.copydefault(this.subType);
        }
        if (i == 3) {
            return abstractC7205afTKWHzl.KWHzl(this.subType);
        }
        if (i == 4) {
            return abstractC7205afTKWHzl.OLrzqt(this.subType);
        }
        if (i == 5) {
            return abstractC7205afTKWHzl.valueOf(this.subType);
        }
        throw new IllegalArgumentException("bad name style: " + i);
    }

    public String getName(Locale locale, int i, String str, boolean[] zArr) {
        return getName(ULocale.forLocale(locale), i, str, zArr);
    }

    public String getName(ULocale uLocale, int i, String str, boolean[] zArr) {
        if (i != 2) {
            return getName(uLocale, i, zArr);
        }
        if (zArr != null) {
            zArr[0] = false;
        }
        return AbstractC7205afT.KWHzl(uLocale).OLrzqt(this.subType, str);
    }

    public String getDisplayName() {
        return getName(Locale.getDefault(), 1, (boolean[]) null);
    }

    public String getDisplayName(Locale locale) {
        return getName(locale, 1, (boolean[]) null);
    }

    @Deprecated
    public static String parse(ULocale uLocale, String str, int i, ParsePosition parsePosition) {
        List<C7029acC<Activity>> currencyTrieVec = getCurrencyTrieVec(uLocale);
        C7029acC c7029acC = currencyTrieVec.get(1);
        StateListAnimator stateListAnimator = new StateListAnimator();
        c7029acC.EZpvd(str, parsePosition.getIndex(), stateListAnimator);
        String strEZpvd = stateListAnimator.EZpvd();
        int iKWHzl = stateListAnimator.KWHzl();
        if (i != 1) {
            C7029acC c7029acC2 = currencyTrieVec.get(0);
            StateListAnimator stateListAnimator2 = new StateListAnimator();
            c7029acC2.EZpvd(str, parsePosition.getIndex(), stateListAnimator2);
            if (stateListAnimator2.KWHzl() > iKWHzl) {
                strEZpvd = stateListAnimator2.EZpvd();
                iKWHzl = stateListAnimator2.KWHzl();
            }
        }
        parsePosition.setIndex(parsePosition.getIndex() + iKWHzl);
        return strEZpvd;
    }

    @Deprecated
    public static C7029acC<Activity> getParsingTrie(ULocale uLocale, int i) {
        List<C7029acC<Activity>> currencyTrieVec = getCurrencyTrieVec(uLocale);
        if (i == 1) {
            return currencyTrieVec.get(1);
        }
        return currencyTrieVec.get(0);
    }

    private static List<C7029acC<Activity>> getCurrencyTrieVec(ULocale uLocale) {
        List<C7029acC<Activity>> listEZpvd = CURRENCY_NAME_CACHE.EZpvd(uLocale);
        if (listEZpvd != null) {
            return listEZpvd;
        }
        C7029acC c7029acC = new C7029acC(true);
        C7029acC c7029acC2 = new C7029acC(false);
        ArrayList arrayList = new ArrayList();
        arrayList.add(c7029acC2);
        arrayList.add(c7029acC);
        setupCurrencyTrieVec(uLocale, arrayList);
        CURRENCY_NAME_CACHE.KWHzl(uLocale, arrayList);
        return arrayList;
    }

    private static void setupCurrencyTrieVec(ULocale uLocale, List<C7029acC<Activity>> list) {
        C7029acC<Activity> c7029acC = list.get(0);
        C7029acC<Activity> c7029acC2 = list.get(1);
        AbstractC7205afT abstractC7205afTKWHzl = AbstractC7205afT.KWHzl(uLocale);
        for (Map.Entry<String, String> entry : abstractC7205afTKWHzl.OLrzqt().entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            StaticUnicodeSets.Key keyKWHzl = StaticUnicodeSets.KWHzl(key);
            Activity activity = new Activity(value, key);
            if (keyKWHzl != null) {
                Iterator<String> it = StaticUnicodeSets.EZpvd(keyKWHzl).iterator();
                while (it.hasNext()) {
                    c7029acC.AEQbTJ(it.next(), activity);
                }
            } else {
                c7029acC.AEQbTJ(key, activity);
            }
        }
        for (Map.Entry<String, String> entry2 : abstractC7205afTKWHzl.AEQbTJ().entrySet()) {
            String key2 = entry2.getKey();
            c7029acC2.AEQbTJ(key2, new Activity(entry2.getValue(), key2));
        }
    }

    @Deprecated
    public static final class Activity {
        public String AEQbTJ;
        public String KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Deprecated
        public String OLrzqt() {
            return this.AEQbTJ;
        }

        @Deprecated
        public Activity(String str, String str2) {
            this.AEQbTJ = str;
            this.KWHzl = str2;
        }
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static class StateListAnimator implements C7029acC.TaskDescription<Activity> {
        public int EZpvd;
        public String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int KWHzl() {
            return this.EZpvd;
        }

        private StateListAnimator() {
        }

        @Override // o.C7029acC.TaskDescription
        public boolean EZpvd(int i, Iterator<Activity> it) {
            if (!it.hasNext()) {
                return true;
            }
            this.OLrzqt = it.next().OLrzqt();
            this.EZpvd = i;
            return true;
        }
    }

    public int getDefaultFractionDigits() {
        return getDefaultFractionDigits(CurrencyUsage.STANDARD);
    }

    public int getDefaultFractionDigits(CurrencyUsage currencyUsage) {
        return C7207afV.OLrzqt().copydefault(this.subType, currencyUsage).EZpvd;
    }

    public double getRoundingIncrement() {
        return getRoundingIncrement(CurrencyUsage.STANDARD);
    }

    public double getRoundingIncrement(CurrencyUsage currencyUsage) {
        int i;
        C7207afV.TaskDescription taskDescriptionCopydefault = C7207afV.OLrzqt().copydefault(this.subType, currencyUsage);
        int i2 = taskDescriptionCopydefault.copydefault;
        if (i2 != 0 && (i = taskDescriptionCopydefault.EZpvd) >= 0) {
            int[] iArr = POW10;
            if (i < iArr.length) {
                return ((double) i2) / ((double) iArr[i]);
            }
        }
        return AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    public Currency(String str) {
        super("currency", str);
        this.isoCode = str;
    }

    private static List<String> getAllTenderCurrencies() {
        List<String> listUnmodifiableList;
        synchronized (Currency.class) {
            SoftReference<List<String>> softReference = ALL_TENDER_CODES;
            listUnmodifiableList = softReference == null ? null : softReference.get();
            if (listUnmodifiableList == null) {
                listUnmodifiableList = Collections.unmodifiableList(getTenderCurrencies(C7207afV.ActionBar.copydefault()));
                ALL_TENDER_CODES = new SoftReference<>(listUnmodifiableList);
            }
        }
        return listUnmodifiableList;
    }

    private static Set<String> getAllCurrenciesAsSet() {
        Set<String> setUnmodifiableSet;
        synchronized (Currency.class) {
            SoftReference<Set<String>> softReference = ALL_CODES_AS_SET;
            setUnmodifiableSet = softReference == null ? null : softReference.get();
            if (setUnmodifiableSet == null) {
                setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(C7207afV.OLrzqt().copydefault(C7207afV.ActionBar.copydefault())));
                ALL_CODES_AS_SET = new SoftReference<>(setUnmodifiableSet);
            }
        }
        return setUnmodifiableSet;
    }

    public static boolean isAvailable(String str, Date date, Date date2) {
        if (!isAlpha3Code(str)) {
            return false;
        }
        if (date != null && date2 != null && date.after(date2)) {
            throw new IllegalArgumentException("To is before from");
        }
        String upperCase = str.toUpperCase(Locale.ENGLISH);
        if (!getAllCurrenciesAsSet().contains(upperCase)) {
            return false;
        }
        if (date == null && date2 == null) {
            return true;
        }
        return C7207afV.OLrzqt().copydefault(C7207afV.ActionBar.AEQbTJ(date, date2).copydefault(upperCase)).contains(upperCase);
    }

    private static List<String> getTenderCurrencies(C7207afV.ActionBar actionBar) {
        return C7207afV.OLrzqt().copydefault(actionBar.OLrzqt());
    }

    private Object writeReplace() throws ObjectStreamException {
        return new MeasureUnit.MeasureUnitProxy(this.type, this.subType);
    }

    private Object readResolve() throws ObjectStreamException {
        return getInstance(this.isoCode);
    }
}
