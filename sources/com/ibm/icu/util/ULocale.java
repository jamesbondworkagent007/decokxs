package com.ibm.icu.util;

import com.engagelab.privates.push.constants.MTPushConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.huawei.hms.framework.common.ContainerUtils;
import com.ibm.icu.impl.ICUResourceBundle;
import com.ibm.icu.impl.locale.KeyTypeData;
import com.ibm.icu.impl.locale.LocaleSyntaxException;
import com.ibm.icu.lang.UScript;
import com.ibm.icu.text.DateFormat;
import com.ibm.icu.text.LocaleDisplayNames;
import com.ibm.icu.util.LocaleMatcher;
import com.sparrowwallet.hummingbird.UR;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.regex.Pattern;
import o.AbstractC7013abN;
import o.AbstractC7078acz;
import o.C7045acS;
import o.C7063ack;
import o.C7064acl;
import o.C7065acm;
import o.C7090adK;
import o.C7091adL;
import o.C7092adM;
import o.C7094adO;
import o.C7096adQ;
import o.C7098adS;
import o.C7099adT;
import o.C7100adU;
import o.C7249agK;

/* JADX INFO: loaded from: classes3.dex */
public final class ULocale implements Serializable, Comparable<ULocale> {
    public static StateListAnimator ACTUAL_LOCALE = null;
    private static final AbstractC7078acz<Locale, ULocale, Void> CACHE;
    public static final ULocale CANADA;
    public static final ULocale CANADA_FRENCH;
    private static String[][] CANONICALIZE_MAP = null;
    public static final ULocale CHINA;
    private static final Locale EMPTY_LOCALE;
    private static final String EMPTY_STRING = "";
    private static final String LANG_DIR_STRING = "root-en-es-pt-zh-ja-ko-de-fr-it-ar+he+fa+ru-nl-pl-th-tr-";
    private static final String LOCALE_ATTRIBUTE_KEY = "attribute";
    public static final ULocale PRC;
    public static final char PRIVATE_USE_EXTENSION = 'x';
    public static final ULocale ROOT;
    public static final ULocale TAIWAN;
    public static final ULocale UK;
    private static final String UNDEFINED_LANGUAGE = "und";
    private static final String UNDEFINED_REGION = "ZZ";
    private static final String UNDEFINED_SCRIPT = "Zzzz";
    private static final char UNDERSCORE = '_';
    public static final char UNICODE_LOCALE_EXTENSION = 'u';
    public static final ULocale US;
    public static StateListAnimator VALID_LOCALE = null;
    private static Locale[] defaultCategoryLocales = null;
    private static ULocale[] defaultCategoryULocales = null;
    private static Locale defaultLocale = null;
    private static ULocale defaultULocale = null;
    private static Set<String> gKnownCanonicalizedCases = null;
    private static final long serialVersionUID = 3715177670352309217L;
    private volatile transient C7094adO baseLocale;
    private volatile transient C7098adS extensions;
    private volatile transient Locale locale;
    private String localeID;
    private static final Pattern UND_PATTERN = Pattern.compile("^und(?=$|[_-])", 2);
    private static AbstractC7013abN<String, String, Void> nameCache = new AbstractC7078acz<String, String, Void>() { // from class: com.ibm.icu.util.ULocale.1
        /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // o.AbstractC7013abN
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public String copydefault(String str, Void r2) {
            return new C7063ack(str).valueOf();
        }
    };
    public static final ULocale ENGLISH = new ULocale("en", Locale.ENGLISH);
    public static final ULocale FRENCH = new ULocale("fr", Locale.FRENCH);
    public static final ULocale GERMAN = new ULocale("de", Locale.GERMAN);
    public static final ULocale ITALIAN = new ULocale("it", Locale.ITALIAN);
    public static final ULocale JAPANESE = new ULocale("ja", Locale.JAPANESE);
    public static final ULocale KOREAN = new ULocale("ko", Locale.KOREAN);
    public static final ULocale CHINESE = new ULocale("zh", Locale.CHINESE);
    public static final ULocale SIMPLIFIED_CHINESE = new ULocale("zh_Hans");
    public static final ULocale TRADITIONAL_CHINESE = new ULocale("zh_Hant");
    public static final ULocale FRANCE = new ULocale("fr_FR", Locale.FRANCE);
    public static final ULocale GERMANY = new ULocale("de_DE", Locale.GERMANY);
    public static final ULocale ITALY = new ULocale("it_IT", Locale.ITALY);
    public static final ULocale JAPAN = new ULocale("ja_JP", Locale.JAPAN);
    public static final ULocale KOREA = new ULocale("ko_KR", Locale.KOREA);

    /* JADX INFO: loaded from: classes14.dex */
    public enum AvailableType {
        DEFAULT,
        ONLY_LEGACY_ALIASES,
        WITH_LEGACY_ALIASES
    }

    public enum Category {
        DISPLAY,
        FORMAT
    }

    /* JADX INFO: loaded from: classes14.dex */
    @Deprecated
    public enum Minimize {
        FAVOR_SCRIPT,
        FAVOR_REGION
    }

    public Object clone() {
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getName() {
        return this.localeID;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return this.localeID;
    }

    static {
        ULocale uLocale = new ULocale("zh_Hans_CN");
        CHINA = uLocale;
        PRC = uLocale;
        TAIWAN = new ULocale("zh_Hant_TW");
        UK = new ULocale("en_GB", Locale.UK);
        US = new ULocale("en_US", Locale.US);
        CANADA = new ULocale("en_CA", Locale.CANADA);
        CANADA_FRENCH = new ULocale("fr_CA", Locale.CANADA_FRENCH);
        Locale locale = new Locale("", "");
        EMPTY_LOCALE = locale;
        ROOT = new ULocale("", locale);
        CACHE = new AbstractC7078acz<Locale, ULocale, Void>() { // from class: com.ibm.icu.util.ULocale.4
            /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // o.AbstractC7013abN
            /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
            public ULocale copydefault(Locale locale2, Void r2) {
                return ActionBar.copydefault(locale2);
            }
        };
        CANONICALIZE_MAP = new String[][]{new String[]{"art__LOJBAN", "jbo"}, new String[]{"cel__GAULISH", "cel__GAULISH"}, new String[]{"de__1901", "de__1901"}, new String[]{"de__1906", "de__1906"}, new String[]{"en__BOONT", "en__BOONT"}, new String[]{"en__SCOUSE", "en__SCOUSE"}, new String[]{"hy__AREVELA", "hy", null, null}, new String[]{"hy__AREVMDA", "hyw", null, null}, new String[]{"sl__ROZAJ", "sl__ROZAJ"}, new String[]{"zh__GUOYU", "zh"}, new String[]{"zh__HAKKA", "hak"}, new String[]{"zh__XIANG", "hsn"}, new String[]{"zh_GAN", "gan"}, new String[]{"zh_MIN", "zh__MIN"}, new String[]{"zh_MIN_NAN", "nan"}, new String[]{"zh_WUU", "wuu"}, new String[]{"zh_YUE", "yue"}};
        defaultLocale = Locale.getDefault();
        defaultCategoryLocales = new Locale[Category.values().length];
        defaultCategoryULocales = new ULocale[Category.values().length];
        defaultULocale = forLocale(defaultLocale);
        int i = 0;
        if (ActionBar.OLrzqt()) {
            Category[] categoryArrValues = Category.values();
            int length = categoryArrValues.length;
            while (i < length) {
                Category category = categoryArrValues[i];
                int iOrdinal = category.ordinal();
                defaultCategoryLocales[iOrdinal] = ActionBar.EZpvd(category);
                defaultCategoryULocales[iOrdinal] = forLocale(defaultCategoryLocales[iOrdinal]);
                i++;
            }
        } else {
            Category[] categoryArrValues2 = Category.values();
            int length2 = categoryArrValues2.length;
            while (i < length2) {
                int iOrdinal2 = categoryArrValues2[i].ordinal();
                defaultCategoryLocales[iOrdinal2] = defaultLocale;
                defaultCategoryULocales[iOrdinal2] = defaultULocale;
                i++;
            }
        }
        gKnownCanonicalizedCases = null;
        ACTUAL_LOCALE = new StateListAnimator();
        VALID_LOCALE = new StateListAnimator();
    }

    private ULocale(String str, Locale locale) {
        this.localeID = str;
        this.locale = locale;
    }

    public static ULocale forLocale(Locale locale) {
        if (locale == null) {
            return null;
        }
        return CACHE.AEQbTJ(locale, null);
    }

    public ULocale(String str) {
        this.localeID = getName(str);
    }

    public ULocale(String str, String str2) {
        this(str, str2, (String) null);
    }

    public ULocale(String str, String str2, String str3) {
        this.localeID = getName(lscvToID(str, str2, str3, ""));
    }

    public static ULocale createCanonical(String str) {
        return new ULocale(canonicalize(str), (Locale) null);
    }

    public static ULocale createCanonical(ULocale uLocale) {
        return createCanonical(uLocale.getName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String lscvToID(String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder();
        if (str != null && str.length() > 0) {
            sb.append(str);
        }
        if (str2 != null && str2.length() > 0) {
            sb.append(UNDERSCORE);
            sb.append(str2);
        }
        if (str3 != null && str3.length() > 0) {
            sb.append(UNDERSCORE);
            sb.append(str3);
        }
        if (str4 != null && str4.length() > 0) {
            if (str3 == null || str3.length() == 0) {
                sb.append(UNDERSCORE);
            }
            sb.append(UNDERSCORE);
            sb.append(str4);
        }
        return sb.toString();
    }

    public Locale toLocale() {
        if (this.locale == null) {
            this.locale = ActionBar.copydefault(this);
        }
        return this.locale;
    }

    public static ULocale getDefault() {
        synchronized (ULocale.class) {
            if (defaultULocale == null) {
                return ROOT;
            }
            Locale locale = Locale.getDefault();
            if (!defaultLocale.equals(locale)) {
                defaultLocale = locale;
                defaultULocale = forLocale(locale);
                if (!ActionBar.OLrzqt()) {
                    for (Category category : Category.values()) {
                        int iOrdinal = category.ordinal();
                        defaultCategoryLocales[iOrdinal] = locale;
                        defaultCategoryULocales[iOrdinal] = forLocale(locale);
                    }
                }
            }
            return defaultULocale;
        }
    }

    public static void setDefault(ULocale uLocale) {
        synchronized (ULocale.class) {
            Locale locale = uLocale.toLocale();
            defaultLocale = locale;
            Locale.setDefault(locale);
            defaultULocale = uLocale;
            for (Category category : Category.values()) {
                setDefault(category, uLocale);
            }
        }
    }

    public static ULocale getDefault(Category category) {
        synchronized (ULocale.class) {
            int iOrdinal = category.ordinal();
            if (defaultCategoryULocales[iOrdinal] == null) {
                return ROOT;
            }
            if (ActionBar.OLrzqt()) {
                Locale localeEZpvd = ActionBar.EZpvd(category);
                if (!defaultCategoryLocales[iOrdinal].equals(localeEZpvd)) {
                    defaultCategoryLocales[iOrdinal] = localeEZpvd;
                    defaultCategoryULocales[iOrdinal] = forLocale(localeEZpvd);
                }
            } else {
                Locale locale = Locale.getDefault();
                if (!defaultLocale.equals(locale)) {
                    defaultLocale = locale;
                    defaultULocale = forLocale(locale);
                    for (Category category2 : Category.values()) {
                        int iOrdinal2 = category2.ordinal();
                        defaultCategoryLocales[iOrdinal2] = locale;
                        defaultCategoryULocales[iOrdinal2] = forLocale(locale);
                    }
                }
            }
            return defaultCategoryULocales[iOrdinal];
        }
    }

    public static void setDefault(Category category, ULocale uLocale) {
        synchronized (ULocale.class) {
            Locale locale = uLocale.toLocale();
            int iOrdinal = category.ordinal();
            defaultCategoryULocales[iOrdinal] = uLocale;
            defaultCategoryLocales[iOrdinal] = locale;
            ActionBar.KWHzl(category, locale);
        }
    }

    public int hashCode() {
        return this.localeID.hashCode();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ULocale) {
            return this.localeID.equals(((ULocale) obj).localeID);
        }
        return false;
    }

    /* JADX DEBUG: Method merged with bridge method: compareTo(Ljava/lang/Object;)I */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0095  */
    @Override // java.lang.Comparable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int compareTo(ULocale uLocale) {
        if (this == uLocale) {
            return 0;
        }
        int iCompareTo = getLanguage().compareTo(uLocale.getLanguage());
        if (iCompareTo == 0 && (iCompareTo = getScript().compareTo(uLocale.getScript())) == 0 && (iCompareTo = getCountry().compareTo(uLocale.getCountry())) == 0 && (iCompareTo = getVariant().compareTo(uLocale.getVariant())) == 0) {
            Iterator<String> keywords = getKeywords();
            Iterator<String> keywords2 = uLocale.getKeywords();
            if (keywords == null) {
                iCompareTo = keywords2 == null ? 0 : -1;
            } else if (keywords2 == null) {
                iCompareTo = 1;
            } else {
                while (true) {
                    if (iCompareTo != 0 || !keywords.hasNext()) {
                        break;
                    }
                    if (!keywords2.hasNext()) {
                        iCompareTo = 1;
                        break;
                    }
                    String next = keywords.next();
                    String next2 = keywords2.next();
                    int iCompareTo2 = next.compareTo(next2);
                    if (iCompareTo2 == 0) {
                        String keywordValue = getKeywordValue(next);
                        String keywordValue2 = uLocale.getKeywordValue(next2);
                        if (keywordValue == null) {
                            iCompareTo = keywordValue2 == null ? 0 : -1;
                        } else {
                            iCompareTo = keywordValue2 == null ? 1 : keywordValue.compareTo(keywordValue2);
                        }
                    } else {
                        iCompareTo = iCompareTo2;
                    }
                }
                if (iCompareTo == 0 && keywords2.hasNext()) {
                }
            }
        }
        if (iCompareTo < 0) {
            return -1;
        }
        return iCompareTo > 0 ? 1 : 0;
    }

    public static ULocale[] getAvailableLocales() {
        return (ULocale[]) ICUResourceBundle.OLrzqt().clone();
    }

    public static Collection<ULocale> getAvailableLocalesByType(AvailableType availableType) {
        List listAsList;
        if (availableType == null) {
            throw new IllegalArgumentException();
        }
        if (availableType == AvailableType.WITH_LEGACY_ALIASES) {
            listAsList = new ArrayList();
            Collections.addAll(listAsList, ICUResourceBundle.EZpvd(AvailableType.DEFAULT));
            Collections.addAll(listAsList, ICUResourceBundle.EZpvd(AvailableType.ONLY_LEGACY_ALIASES));
        } else {
            listAsList = Arrays.asList(ICUResourceBundle.EZpvd(availableType));
        }
        return Collections.unmodifiableList(listAsList);
    }

    public static String[] getISOCountries() {
        return C7064acl.EZpvd();
    }

    public static String[] getISOLanguages() {
        return C7064acl.OLrzqt();
    }

    public String getLanguage() {
        return base().KWHzl();
    }

    public static String getLanguage(String str) {
        return new C7063ack(str).djBIcL();
    }

    public String getScript() {
        return base().EZpvd();
    }

    public static String getScript(String str) {
        return new C7063ack(str).isConnected();
    }

    public String getCountry() {
        return base().OLrzqt();
    }

    public static String getCountry(String str) {
        return new C7063ack(str).OLrzqt();
    }

    @Deprecated
    public static String getRegionForSupplementalData(ULocale uLocale, boolean z) {
        String keywordValue = uLocale.getKeywordValue("rg");
        if (keywordValue != null && keywordValue.length() == 6) {
            String strValueOf = C7090adK.valueOf(keywordValue);
            if (strValueOf.endsWith(DateFormat.ABBR_UTC_TZ)) {
                return strValueOf.substring(0, 2);
            }
        }
        String country = uLocale.getCountry();
        return (country.length() == 0 && z) ? addLikelySubtags(uLocale).getCountry() : country;
    }

    public String getVariant() {
        return base().copydefault();
    }

    public static String getVariant(String str) {
        return new C7063ack(str).AkhnZx();
    }

    public static String getFallback(String str) {
        return getFallbackString(getName(str));
    }

    public ULocale getFallback() {
        if (this.localeID.length() == 0 || this.localeID.charAt(0) == '@') {
            return null;
        }
        return new ULocale(getFallbackString(this.localeID), (Locale) null);
    }

    private static String getFallbackString(String str) {
        int iIndexOf = str.indexOf(64);
        if (iIndexOf == -1) {
            iIndexOf = str.length();
        }
        int iLastIndexOf = str.lastIndexOf(95, iIndexOf);
        if (iLastIndexOf == -1) {
            iLastIndexOf = 0;
        } else {
            while (iLastIndexOf > 0 && str.charAt(iLastIndexOf - 1) == '_') {
                iLastIndexOf--;
            }
        }
        return str.substring(0, iLastIndexOf) + str.substring(iIndexOf);
    }

    public String getBaseName() {
        return getBaseName(this.localeID);
    }

    public static String getBaseName(String str) {
        return str.indexOf(64) == -1 ? str : new C7063ack(str).KWHzl();
    }

    private static int getShortestSubtagLength(String str) {
        int length = str.length();
        int i = length;
        boolean z = true;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            if (str.charAt(i3) == '_' || str.charAt(i3) == '-') {
                if (i2 != 0 && i2 < i) {
                    i = i2;
                }
                z = true;
            } else {
                if (z) {
                    i2 = 0;
                    z = false;
                }
                i2++;
            }
        }
        return i;
    }

    public static String getName(String str) {
        if (str != null && !str.contains("@") && getShortestSubtagLength(str) == 1) {
            String name = forLanguageTag(str).getName();
            if (name.length() != 0) {
                str = name;
            }
        } else {
            str = "root".equalsIgnoreCase(str) ? "" : UND_PATTERN.matcher(str).replaceFirst("");
        }
        return nameCache.AEQbTJ(str, null);
    }

    public Iterator<String> getKeywords() {
        return getKeywords(this.localeID);
    }

    public static Iterator<String> getKeywords(String str) {
        return new C7063ack(str).AYXKKw();
    }

    public String getKeywordValue(String str) {
        return getKeywordValue(this.localeID, str);
    }

    public static String getKeywordValue(String str, String str2) {
        return new C7063ack(str).EZpvd(str2);
    }

    public static class TaskDescription {
        public static Map<String, String> AEQbTJ = null;
        public static boolean EZpvd = false;
        public static Map<String, List<String>> KWHzl;
        public static Map<String, String> OLrzqt;
        public static Map<String, String> copydefault;
        public String AYXKKw;
        public List<String> AhwBna;
        public String djBIcL;
        public String gEmmrt;
        public String valueOf;

        public TaskDescription(String str, String str2, String str3, String str4, String str5) {
            this.gEmmrt = str;
            this.valueOf = str2;
            this.AYXKKw = str3;
            if (!str4.isEmpty()) {
                this.AhwBna = new ArrayList(Arrays.asList(str4.split("_")));
            }
            this.djBIcL = str5;
        }

        public String OLrzqt() {
            AEQbTJ();
            int i = 0;
            boolean z = false;
            while (true) {
                if (i > 10) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Have problem to resolve locale alias of ");
                    String str = this.gEmmrt;
                    String str2 = this.valueOf;
                    String str3 = this.AYXKKw;
                    List<String> list = this.AhwBna;
                    sb.append(ULocale.lscvToID(str, str2, str3, list != null ? C7045acS.OLrzqt("_", list) : ""));
                    sb.append(this.djBIcL);
                    throw new IllegalArgumentException(sb.toString());
                }
                if (!KWHzl(true, true, true) && !KWHzl(true, true, false) && !KWHzl(true, false, true) && !KWHzl(true, false, false) && !KWHzl(false, false, true) && !EZpvd() && !KWHzl() && !copydefault()) {
                    if (!z) {
                        return null;
                    }
                    String str4 = this.gEmmrt;
                    String str5 = this.valueOf;
                    String str6 = this.AYXKKw;
                    List<String> list2 = this.AhwBna;
                    String strLscvToID = ULocale.lscvToID(str4, str5, str6, list2 != null ? C7045acS.OLrzqt("_", list2) : "");
                    if (this.djBIcL == null) {
                        return strLscvToID;
                    }
                    return strLscvToID + this.djBIcL;
                }
                i++;
                z = true;
            }
        }

        public static void AEQbTJ() {
            synchronized (TaskDescription.class) {
                if (EZpvd) {
                    return;
                }
                OLrzqt = new HashMap();
                copydefault = new HashMap();
                KWHzl = new HashMap();
                AEQbTJ = new HashMap();
                UResourceBundle uResourceBundleIsConnected = UResourceBundle.copydefault("com/ibm/icu/impl/data/icudt68b", TtmlNode.TAG_METADATA, ICUResourceBundle.AEQbTJ).isConnected(MTPushConstants.Operation.KEY_ALIAS);
                UResourceBundle uResourceBundleIsConnected2 = uResourceBundleIsConnected.isConnected("language");
                UResourceBundle uResourceBundleIsConnected3 = uResourceBundleIsConnected.isConnected("script");
                UResourceBundle uResourceBundleIsConnected4 = uResourceBundleIsConnected.isConnected("territory");
                UResourceBundle uResourceBundleIsConnected5 = uResourceBundleIsConnected.isConnected("variant");
                for (int i = 0; i < uResourceBundleIsConnected2.fARcdN(); i++) {
                    UResourceBundle uResourceBundleKWHzl = uResourceBundleIsConnected2.KWHzl(i);
                    String strAEQbTJ = uResourceBundleKWHzl.AEQbTJ();
                    String fieldNames = uResourceBundleKWHzl.isConnected("replacement").getFieldNames();
                    Locale locale = new Locale(strAEQbTJ);
                    if (!locale.getScript().isEmpty() || (strAEQbTJ.startsWith("und") && !locale.getCountry().isEmpty())) {
                        throw new IllegalArgumentException("key [" + strAEQbTJ + "] in alias:language contains unsupported fields combination.");
                    }
                    OLrzqt.put(strAEQbTJ, fieldNames);
                }
                for (int i2 = 0; i2 < uResourceBundleIsConnected3.fARcdN(); i2++) {
                    UResourceBundle uResourceBundleKWHzl2 = uResourceBundleIsConnected3.KWHzl(i2);
                    String strAEQbTJ2 = uResourceBundleKWHzl2.AEQbTJ();
                    String fieldNames2 = uResourceBundleKWHzl2.isConnected("replacement").getFieldNames();
                    if (strAEQbTJ2.length() != 4) {
                        throw new IllegalArgumentException("Incorrect key [" + strAEQbTJ2 + "] in alias:script.");
                    }
                    copydefault.put(strAEQbTJ2, fieldNames2);
                }
                for (int i3 = 0; i3 < uResourceBundleIsConnected4.fARcdN(); i3++) {
                    UResourceBundle uResourceBundleKWHzl3 = uResourceBundleIsConnected4.KWHzl(i3);
                    String strAEQbTJ3 = uResourceBundleKWHzl3.AEQbTJ();
                    String fieldNames3 = uResourceBundleKWHzl3.isConnected("replacement").getFieldNames();
                    if (strAEQbTJ3.length() < 2 || strAEQbTJ3.length() > 3) {
                        throw new IllegalArgumentException("Incorrect key [" + strAEQbTJ3 + "] in alias:territory.");
                    }
                    KWHzl.put(strAEQbTJ3, new ArrayList(Arrays.asList(fieldNames3.split(" "))));
                }
                for (int i4 = 0; i4 < uResourceBundleIsConnected5.fARcdN(); i4++) {
                    UResourceBundle uResourceBundleKWHzl4 = uResourceBundleIsConnected5.KWHzl(i4);
                    String strAEQbTJ4 = uResourceBundleKWHzl4.AEQbTJ();
                    String fieldNames4 = uResourceBundleKWHzl4.isConnected("replacement").getFieldNames();
                    if (strAEQbTJ4.length() < 4 || strAEQbTJ4.length() > 8 || (strAEQbTJ4.length() == 4 && (strAEQbTJ4.charAt(0) < '0' || strAEQbTJ4.charAt(0) > '9'))) {
                        throw new IllegalArgumentException("Incorrect key [" + strAEQbTJ4 + "] in alias:variant.");
                    }
                    if (fieldNames4.length() < 4 || fieldNames4.length() > 8 || (fieldNames4.length() == 4 && (fieldNames4.charAt(0) < '0' || fieldNames4.charAt(0) > '9'))) {
                        throw new IllegalArgumentException("Incorrect variant [" + fieldNames4 + "] for the key [" + strAEQbTJ4 + "] in alias:variant.");
                    }
                    AEQbTJ.put(strAEQbTJ4, fieldNames4);
                }
                EZpvd = true;
            }
        }

        public static String KWHzl(String str, String str2, String str3) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            if (str2 != null && !str2.isEmpty()) {
                sb.append(ULocale.UNDERSCORE);
                sb.append(str2);
            }
            if (str3 != null && !str3.isEmpty()) {
                sb.append(ULocale.UNDERSCORE);
                sb.append(str3);
            }
            return sb.toString();
        }

        public static String AEQbTJ(String str, String str2, String str3) {
            if (str3 != null && !str3.isEmpty()) {
                return (str == null || str.isEmpty()) ? str3 : str;
            }
            if (str2 == null || str2.isEmpty()) {
                return str;
            }
            return null;
        }

        public final boolean KWHzl(boolean z, boolean z2, boolean z3) {
            boolean z4;
            int i;
            String str;
            String str2;
            String str3;
            String strSubstring;
            int i2;
            boolean z5;
            String str4;
            boolean z6 = false;
            if ((z2 && ((str4 = this.AYXKKw) == null || str4.isEmpty())) || (z3 && this.AhwBna == null)) {
                return false;
            }
            int i3 = 1;
            int size = z3 ? this.AhwBna.size() : 1;
            String str5 = z ? this.gEmmrt : "und";
            String str6 = z2 ? this.AYXKKw : null;
            int i4 = 0;
            String str7 = null;
            while (i4 < size) {
                if (z3) {
                    str7 = this.AhwBna.get(i4);
                }
                int i5 = 4;
                if (str7 != null && str7.length() < 4) {
                    str7 = null;
                }
                String str8 = OLrzqt.get(KWHzl(str5, str6, str7));
                if (str8 == null) {
                    z4 = z6 ? 1 : 0;
                    i = size;
                } else {
                    if (str8.indexOf(95) < 0) {
                        if (str8.equals("und")) {
                            str8 = this.gEmmrt;
                        }
                        z4 = z6 ? 1 : 0;
                        i = size;
                        strSubstring = null;
                        str2 = null;
                        str = null;
                        str3 = null;
                    } else {
                        String[] strArrSplit = str8.split("_");
                        String str9 = strArrSplit[z6 ? 1 : 0];
                        if (str9.equals("und")) {
                            str9 = this.gEmmrt;
                        }
                        int length = strArrSplit[z6 ? 1 : 0].length() + i3;
                        int i6 = i3;
                        String str10 = null;
                        String str11 = null;
                        String str12 = null;
                        while (true) {
                            if (strArrSplit.length <= i6) {
                                z4 = z6;
                                i = size;
                                str8 = str9;
                                str = str10;
                                str2 = str11;
                                str3 = str12;
                                strSubstring = null;
                                break;
                            }
                            String str13 = strArrSplit[i6];
                            int length2 = str13.length();
                            if (i3 == length2) {
                                strSubstring = str8.substring(length);
                                i = size;
                                str8 = str9;
                                str = str10;
                                str2 = str11;
                                str3 = str12;
                                z4 = false;
                                break;
                            }
                            if (length2 < 2 || length2 > 3) {
                                if (length2 >= 5 && length2 <= 8) {
                                    i2 = size;
                                    z5 = false;
                                } else if (length2 == i5) {
                                    z5 = false;
                                    i2 = size;
                                    if (str13.charAt(0) < '0' || str13.charAt(0) > '9') {
                                        str10 = str13;
                                    }
                                    i6++;
                                    length += length2 + 1;
                                    z6 = z5;
                                    size = i2;
                                    i3 = 1;
                                    i5 = 4;
                                } else {
                                    i2 = size;
                                }
                                str11 = str13;
                                i6++;
                                length += length2 + 1;
                                z6 = z5;
                                size = i2;
                                i3 = 1;
                                i5 = 4;
                            } else {
                                i2 = size;
                                str12 = str13;
                            }
                            z5 = false;
                            i6++;
                            length += length2 + 1;
                            z6 = z5;
                            size = i2;
                            i3 = 1;
                            i5 = 4;
                        }
                    }
                    String strAEQbTJ = AEQbTJ(this.valueOf, null, str);
                    String strAEQbTJ2 = AEQbTJ(this.AYXKKw, str6, str3);
                    String strAEQbTJ3 = AEQbTJ(str7, str7, str2);
                    if (!this.gEmmrt.equals(str8) || !this.valueOf.equals(strAEQbTJ) || !this.AYXKKw.equals(strAEQbTJ2) || !Objects.equals(str7, strAEQbTJ3) || strSubstring != null) {
                        this.gEmmrt = str8;
                        this.valueOf = strAEQbTJ;
                        this.AYXKKw = strAEQbTJ2;
                        if (str7 != null && !str7.isEmpty()) {
                            if (strAEQbTJ3 != null && !strAEQbTJ3.isEmpty()) {
                                this.AhwBna.set(i4, strAEQbTJ3);
                            } else {
                                this.AhwBna.remove(i4);
                                if (this.AhwBna.isEmpty()) {
                                    this.AhwBna = null;
                                }
                            }
                        }
                        return true;
                    }
                }
                i4++;
                z6 = z4;
                size = i;
                i3 = 1;
            }
            byte b = z6 ? 1 : 0;
            return z6;
        }

        public final boolean EZpvd() {
            List<String> list;
            String country;
            String str = this.AYXKKw;
            if (str == null || str.isEmpty() || (list = KWHzl.get(this.AYXKKw)) == null) {
                return false;
            }
            if (list.size() > 1) {
                country = ULocale.addLikelySubtags(new ULocale(this.gEmmrt, this.valueOf, (String) null)).getCountry();
                if (!list.contains(country)) {
                    country = list.get(0);
                }
            } else {
                country = list.get(0);
            }
            this.AYXKKw = country;
            return true;
        }

        public final boolean KWHzl() {
            String str;
            String str2 = this.valueOf;
            if (str2 == null || str2.isEmpty() || (str = copydefault.get(this.valueOf)) == null) {
                return false;
            }
            this.valueOf = str;
            return true;
        }

        public final boolean copydefault() {
            if (this.AhwBna == null) {
                return false;
            }
            for (int i = 0; i < this.AhwBna.size(); i++) {
                String str = this.AhwBna.get(i);
                String str2 = AEQbTJ.get(str);
                if (str2 != null && !str.equals(str2)) {
                    this.AhwBna.set(i, str2);
                    if (!str.equals("heploc")) {
                        return true;
                    }
                    this.AhwBna.remove("hepburn");
                    if (!this.AhwBna.isEmpty()) {
                        return true;
                    }
                    this.AhwBna = null;
                    return true;
                }
            }
            return false;
        }
    }

    public static String canonicalize(String str) {
        String strOLrzqt;
        C7063ack c7063ack = new C7063ack(str, true);
        String strKWHzl = c7063ack.KWHzl();
        if (str.equals("")) {
            return "";
        }
        int i = 0;
        while (true) {
            String[][] strArr = CANONICALIZE_MAP;
            if (i < strArr.length) {
                String[] strArr2 = strArr[i];
                if (strArr2[0].equals(strKWHzl)) {
                    c7063ack.AEQbTJ(strArr2[1]);
                    break;
                }
                i++;
            } else if (c7063ack.djBIcL().equals("nb") && c7063ack.AkhnZx().equals("NY")) {
                c7063ack.AEQbTJ(lscvToID("nn", c7063ack.isConnected(), c7063ack.OLrzqt(), null));
            }
        }
        if (!isKnownCanonicalizedLocale(c7063ack.valueOf()) && (strOLrzqt = new TaskDescription(c7063ack.djBIcL(), c7063ack.isConnected(), c7063ack.OLrzqt(), C7090adK.AEQbTJ(c7063ack.AkhnZx()), c7063ack.valueOf().substring(c7063ack.KWHzl().length())).OLrzqt()) != null) {
            c7063ack = new C7063ack(strOLrzqt);
        }
        return c7063ack.valueOf();
    }

    private static boolean isKnownCanonicalizedLocale(String str) {
        synchronized (ULocale.class) {
            if (!str.equals("c") && !str.equals("en") && !str.equals("en_US")) {
                if (gKnownCanonicalizedCases == null) {
                    gKnownCanonicalizedCases = new HashSet(Arrays.asList("af", "af_ZA", "am", "am_ET", "ar", "ar_001", "as", "as_IN", "az", "az_AZ", "be", "be_BY", "bg", "bg_BG", "bn", "bn_IN", "bs", "bs_BA", "ca", "ca_ES", "cs", "cs_CZ", "cy", "cy_GB", "da", "da_DK", "de", "de_DE", "el", "el_GR", "en", "en_GB", "en_US", "es", "es_419", "es_ES", "et", "et_EE", "eu", "eu_ES", "fa", "fa_IR", "fi", "fi_FI", "fil", "fil_PH", "fr", "fr_FR", "ga", "ga_IE", "gl", "gl_ES", "gu", "gu_IN", "he", "he_IL", "hi", "hi_IN", "hr", "hr_HR", "hu", "hu_HU", "hy", "hy_AM", "id", "id_ID", "is", "is_IS", "it", "it_IT", "ja", "ja_JP", DateFormat.HOUR_GENERIC_TZ, "jv_ID", "ka", "ka_GE", "kk", "kk_KZ", "km", "km_KH", "kn", "kn_IN", "ko", "ko_KR", "ky", "ky_KG", "lo", "lo_LA", "lt", "lt_LT", "lv", "lv_LV", "mk", "mk_MK", "ml", "ml_IN", "mn", "mn_MN", "mr", "mr_IN", DateFormat.MINUTE_SECOND, "ms_MY", "my", "my_MM", "nb", "nb_NO", "ne", "ne_NP", "nl", "nl_NL", "or", "or_IN", "pa", "pa_IN", "pl", "pl_PL", "ps", "ps_AF", "pt", "pt_BR", "pt_PT", "ro", "ro_RO", "ru", "ru_RU", "sd", "sd_IN", "si", "si_LK", "sk", "sk_SK", "sl", "sl_SI", "so", "so_SO", "sq", "sq_AL", "sr", "sr_Cyrl_RS", "sr_Latn", "sr_RS", "sv", "sv_SE", "sw", "sw_TZ", "ta", "ta_IN", "te", "te_IN", "th", "th_TH", "tk", "tk_TM", "tr", "tr_TR", "uk", "uk_UA", UR.UR_PREFIX, "ur_PK", "uz", "uz_UZ", "vi", "vi_VN", "yue", "yue_Hant", "yue_Hant_HK", "yue_HK", "zh", "zh_CN", "zh_Hans", "zh_Hans_CN", "zh_Hant", "zh_Hant_TW", "zh_TW", "zu", "zu_ZA"));
                }
                return gKnownCanonicalizedCases.contains(str);
            }
            return true;
        }
    }

    public ULocale setKeywordValue(String str, String str2) {
        return new ULocale(setKeywordValue(this.localeID, str, str2), (Locale) null);
    }

    public static String setKeywordValue(String str, String str2, String str3) {
        C7063ack c7063ack = new C7063ack(str);
        c7063ack.EZpvd(str2, str3);
        return c7063ack.valueOf();
    }

    public String getISO3Language() {
        return getISO3Language(this.localeID);
    }

    public static String getISO3Language(String str) {
        return C7064acl.EZpvd(getLanguage(str));
    }

    public String getISO3Country() {
        return getISO3Country(this.localeID);
    }

    public static String getISO3Country(String str) {
        return C7064acl.AEQbTJ(getCountry(str));
    }

    public boolean isRightToLeft() {
        int iIndexOf;
        String script = getScript();
        if (script.length() == 0) {
            String language = getLanguage();
            if (!language.isEmpty() && (iIndexOf = LANG_DIR_STRING.indexOf(language)) >= 0) {
                char cCharAt = LANG_DIR_STRING.charAt(iIndexOf + language.length());
                if (cCharAt == '+') {
                    return true;
                }
                if (cCharAt == '-') {
                    return false;
                }
            }
            script = addLikelySubtags(this).getScript();
            if (script.length() == 0) {
                return false;
            }
        }
        return UScript.AEQbTJ(UScript.EZpvd(script));
    }

    public String getDisplayLanguage() {
        return getDisplayLanguageInternal(this, getDefault(Category.DISPLAY), false);
    }

    public String getDisplayLanguage(ULocale uLocale) {
        return getDisplayLanguageInternal(this, uLocale, false);
    }

    public static String getDisplayLanguage(String str, String str2) {
        return getDisplayLanguageInternal(new ULocale(str), new ULocale(str2), false);
    }

    public static String getDisplayLanguage(String str, ULocale uLocale) {
        return getDisplayLanguageInternal(new ULocale(str), uLocale, false);
    }

    public String getDisplayLanguageWithDialect() {
        return getDisplayLanguageInternal(this, getDefault(Category.DISPLAY), true);
    }

    public String getDisplayLanguageWithDialect(ULocale uLocale) {
        return getDisplayLanguageInternal(this, uLocale, true);
    }

    public static String getDisplayLanguageWithDialect(String str, String str2) {
        return getDisplayLanguageInternal(new ULocale(str), new ULocale(str2), true);
    }

    public static String getDisplayLanguageWithDialect(String str, ULocale uLocale) {
        return getDisplayLanguageInternal(new ULocale(str), uLocale, true);
    }

    private static String getDisplayLanguageInternal(ULocale uLocale, ULocale uLocale2, boolean z) {
        return LocaleDisplayNames.KWHzl(uLocale2).AEQbTJ(z ? uLocale.getBaseName() : uLocale.getLanguage());
    }

    public String getDisplayScript() {
        return getDisplayScriptInternal(this, getDefault(Category.DISPLAY));
    }

    @Deprecated
    public String getDisplayScriptInContext() {
        return getDisplayScriptInContextInternal(this, getDefault(Category.DISPLAY));
    }

    public String getDisplayScript(ULocale uLocale) {
        return getDisplayScriptInternal(this, uLocale);
    }

    @Deprecated
    public String getDisplayScriptInContext(ULocale uLocale) {
        return getDisplayScriptInContextInternal(this, uLocale);
    }

    public static String getDisplayScript(String str, String str2) {
        return getDisplayScriptInternal(new ULocale(str), new ULocale(str2));
    }

    @Deprecated
    public static String getDisplayScriptInContext(String str, String str2) {
        return getDisplayScriptInContextInternal(new ULocale(str), new ULocale(str2));
    }

    public static String getDisplayScript(String str, ULocale uLocale) {
        return getDisplayScriptInternal(new ULocale(str), uLocale);
    }

    @Deprecated
    public static String getDisplayScriptInContext(String str, ULocale uLocale) {
        return getDisplayScriptInContextInternal(new ULocale(str), uLocale);
    }

    private static String getDisplayScriptInternal(ULocale uLocale, ULocale uLocale2) {
        return LocaleDisplayNames.KWHzl(uLocale2).OLrzqt(uLocale.getScript());
    }

    private static String getDisplayScriptInContextInternal(ULocale uLocale, ULocale uLocale2) {
        return LocaleDisplayNames.KWHzl(uLocale2).djBIcL(uLocale.getScript());
    }

    public String getDisplayCountry() {
        return getDisplayCountryInternal(this, getDefault(Category.DISPLAY));
    }

    public String getDisplayCountry(ULocale uLocale) {
        return getDisplayCountryInternal(this, uLocale);
    }

    public static String getDisplayCountry(String str, String str2) {
        return getDisplayCountryInternal(new ULocale(str), new ULocale(str2));
    }

    public static String getDisplayCountry(String str, ULocale uLocale) {
        return getDisplayCountryInternal(new ULocale(str), uLocale);
    }

    private static String getDisplayCountryInternal(ULocale uLocale, ULocale uLocale2) {
        return LocaleDisplayNames.KWHzl(uLocale2).KWHzl(uLocale.getCountry());
    }

    public String getDisplayVariant() {
        return getDisplayVariantInternal(this, getDefault(Category.DISPLAY));
    }

    public String getDisplayVariant(ULocale uLocale) {
        return getDisplayVariantInternal(this, uLocale);
    }

    public static String getDisplayVariant(String str, String str2) {
        return getDisplayVariantInternal(new ULocale(str), new ULocale(str2));
    }

    public static String getDisplayVariant(String str, ULocale uLocale) {
        return getDisplayVariantInternal(new ULocale(str), uLocale);
    }

    private static String getDisplayVariantInternal(ULocale uLocale, ULocale uLocale2) {
        return LocaleDisplayNames.KWHzl(uLocale2).AYXKKw(uLocale.getVariant());
    }

    public static String getDisplayKeyword(String str) {
        return getDisplayKeywordInternal(str, getDefault(Category.DISPLAY));
    }

    public static String getDisplayKeyword(String str, String str2) {
        return getDisplayKeywordInternal(str, new ULocale(str2));
    }

    public static String getDisplayKeyword(String str, ULocale uLocale) {
        return getDisplayKeywordInternal(str, uLocale);
    }

    private static String getDisplayKeywordInternal(String str, ULocale uLocale) {
        return LocaleDisplayNames.KWHzl(uLocale).copydefault(str);
    }

    public String getDisplayKeywordValue(String str) {
        return getDisplayKeywordValueInternal(this, str, getDefault(Category.DISPLAY));
    }

    public String getDisplayKeywordValue(String str, ULocale uLocale) {
        return getDisplayKeywordValueInternal(this, str, uLocale);
    }

    public static String getDisplayKeywordValue(String str, String str2, String str3) {
        return getDisplayKeywordValueInternal(new ULocale(str), str2, new ULocale(str3));
    }

    public static String getDisplayKeywordValue(String str, String str2, ULocale uLocale) {
        return getDisplayKeywordValueInternal(new ULocale(str), str2, uLocale);
    }

    private static String getDisplayKeywordValueInternal(ULocale uLocale, String str, ULocale uLocale2) {
        String strAEQbTJ = C7090adK.AEQbTJ(str.trim());
        return LocaleDisplayNames.KWHzl(uLocale2).OLrzqt(strAEQbTJ, uLocale.getKeywordValue(strAEQbTJ));
    }

    public String getDisplayName() {
        return getDisplayNameInternal(this, getDefault(Category.DISPLAY));
    }

    public String getDisplayName(ULocale uLocale) {
        return getDisplayNameInternal(this, uLocale);
    }

    public static String getDisplayName(String str, String str2) {
        return getDisplayNameInternal(new ULocale(str), new ULocale(str2));
    }

    public static String getDisplayName(String str, ULocale uLocale) {
        return getDisplayNameInternal(new ULocale(str), uLocale);
    }

    private static String getDisplayNameInternal(ULocale uLocale, ULocale uLocale2) {
        return LocaleDisplayNames.KWHzl(uLocale2).OLrzqt(uLocale);
    }

    public String getDisplayNameWithDialect() {
        return getDisplayNameWithDialectInternal(this, getDefault(Category.DISPLAY));
    }

    public String getDisplayNameWithDialect(ULocale uLocale) {
        return getDisplayNameWithDialectInternal(this, uLocale);
    }

    public static String getDisplayNameWithDialect(String str, String str2) {
        return getDisplayNameWithDialectInternal(new ULocale(str), new ULocale(str2));
    }

    public static String getDisplayNameWithDialect(String str, ULocale uLocale) {
        return getDisplayNameWithDialectInternal(new ULocale(str), uLocale);
    }

    private static String getDisplayNameWithDialectInternal(ULocale uLocale, ULocale uLocale2) {
        return LocaleDisplayNames.OLrzqt(uLocale2, LocaleDisplayNames.DialectHandling.DIALECT_NAMES).OLrzqt(uLocale);
    }

    public String getCharacterOrientation() {
        return C7065acm.OLrzqt("com/ibm/icu/impl/data/icudt68b", this, TtmlNode.TAG_LAYOUT, "characters", "characters");
    }

    public String getLineOrientation() {
        return C7065acm.OLrzqt("com/ibm/icu/impl/data/icudt68b", this, TtmlNode.TAG_LAYOUT, "lines", "lines");
    }

    public static final class StateListAnimator {
        private StateListAnimator() {
        }
    }

    public static ULocale acceptLanguage(String str, ULocale[] uLocaleArr, boolean[] zArr) {
        if (zArr != null) {
            zArr[0] = true;
        }
        try {
            C7249agK c7249agKKWHzl = C7249agK.OLrzqt(str).KWHzl();
            LocaleMatcher.StateListAnimator stateListAnimatorEZpvd = LocaleMatcher.EZpvd();
            for (ULocale uLocale : uLocaleArr) {
                stateListAnimatorEZpvd.OLrzqt(uLocale);
            }
            LocaleMatcher.Activity activityCopydefault = stateListAnimatorEZpvd.AEQbTJ().copydefault(c7249agKKWHzl);
            if (activityCopydefault.OLrzqt() < 0) {
                return null;
            }
            if (zArr != null && activityCopydefault.EZpvd().equals(activityCopydefault.copydefault())) {
                zArr[0] = false;
            }
            return activityCopydefault.copydefault();
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static ULocale acceptLanguage(ULocale[] uLocaleArr, ULocale[] uLocaleArr2, boolean[] zArr) {
        LocaleMatcher.Activity activityCopydefault;
        if (zArr != null) {
            zArr[0] = true;
        }
        LocaleMatcher.StateListAnimator stateListAnimatorEZpvd = LocaleMatcher.EZpvd();
        for (ULocale uLocale : uLocaleArr2) {
            stateListAnimatorEZpvd.OLrzqt(uLocale);
        }
        LocaleMatcher localeMatcherAEQbTJ = stateListAnimatorEZpvd.AEQbTJ();
        if (uLocaleArr.length == 1) {
            activityCopydefault = localeMatcherAEQbTJ.AEQbTJ(uLocaleArr[0]);
        } else {
            activityCopydefault = localeMatcherAEQbTJ.copydefault(Arrays.asList(uLocaleArr));
        }
        if (activityCopydefault.OLrzqt() < 0) {
            return null;
        }
        if (zArr != null && activityCopydefault.EZpvd().equals(activityCopydefault.copydefault())) {
            zArr[0] = false;
        }
        return activityCopydefault.copydefault();
    }

    public static ULocale acceptLanguage(String str, boolean[] zArr) {
        return acceptLanguage(str, getAvailableLocales(), zArr);
    }

    public static ULocale acceptLanguage(ULocale[] uLocaleArr, boolean[] zArr) {
        return acceptLanguage(uLocaleArr, getAvailableLocales(), zArr);
    }

    public static ULocale addLikelySubtags(ULocale uLocale) {
        String[] strArr = new String[3];
        int tagString = parseTagString(uLocale.localeID, strArr);
        String strCreateLikelySubtagsString = createLikelySubtagsString(strArr[0], strArr[1], strArr[2], tagString < uLocale.localeID.length() ? uLocale.localeID.substring(tagString) : null);
        return strCreateLikelySubtagsString == null ? uLocale : new ULocale(strCreateLikelySubtagsString);
    }

    public static ULocale minimizeSubtags(ULocale uLocale) {
        return minimizeSubtags(uLocale, Minimize.FAVOR_REGION);
    }

    @Deprecated
    public static ULocale minimizeSubtags(ULocale uLocale, Minimize minimize) {
        String[] strArr = new String[3];
        int tagString = parseTagString(uLocale.localeID, strArr);
        String str = strArr[0];
        String str2 = strArr[1];
        String str3 = strArr[2];
        String strSubstring = tagString < uLocale.localeID.length() ? uLocale.localeID.substring(tagString) : null;
        String strCreateLikelySubtagsString = createLikelySubtagsString(str, str2, str3, null);
        if (isEmptyString(strCreateLikelySubtagsString)) {
            return uLocale;
        }
        if (createLikelySubtagsString(str, null, null, null).equals(strCreateLikelySubtagsString)) {
            return new ULocale(createTagString(str, null, null, strSubstring));
        }
        if (minimize == Minimize.FAVOR_REGION) {
            if (str3.length() != 0 && createLikelySubtagsString(str, null, str3, null).equals(strCreateLikelySubtagsString)) {
                return new ULocale(createTagString(str, null, str3, strSubstring));
            }
            if (str2.length() != 0 && createLikelySubtagsString(str, str2, null, null).equals(strCreateLikelySubtagsString)) {
                return new ULocale(createTagString(str, str2, null, strSubstring));
            }
        } else {
            if (str2.length() != 0 && createLikelySubtagsString(str, str2, null, null).equals(strCreateLikelySubtagsString)) {
                return new ULocale(createTagString(str, str2, null, strSubstring));
            }
            if (str3.length() != 0 && createLikelySubtagsString(str, null, str3, null).equals(strCreateLikelySubtagsString)) {
                return new ULocale(createTagString(str, null, str3, strSubstring));
            }
        }
        return uLocale;
    }

    private static boolean isEmptyString(String str) {
        return str == null || str.length() == 0;
    }

    private static void appendTag(String str, StringBuilder sb) {
        if (sb.length() != 0) {
            sb.append(UNDERSCORE);
        }
        sb.append(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String createTagString(String str, String str2, String str3, String str4, String str5) {
        C7063ack c7063ack;
        boolean z;
        StringBuilder sb = new StringBuilder();
        if (!isEmptyString(str)) {
            appendTag(str, sb);
        } else {
            if (isEmptyString(str5)) {
                appendTag("und", sb);
            } else {
                c7063ack = new C7063ack(str5);
                String strDjBIcL = c7063ack.djBIcL();
                appendTag(isEmptyString(strDjBIcL) ? "und" : strDjBIcL, sb);
                if (isEmptyString(str2)) {
                    appendTag(str2, sb);
                } else if (!isEmptyString(str5)) {
                    if (c7063ack == null) {
                        c7063ack = new C7063ack(str5);
                    }
                    String strIsConnected = c7063ack.isConnected();
                    if (!isEmptyString(strIsConnected)) {
                        appendTag(strIsConnected, sb);
                    }
                }
                char c = 0;
                if (isEmptyString(str3)) {
                    appendTag(str3, sb);
                } else {
                    if (!isEmptyString(str5)) {
                        if (c7063ack == null) {
                            c7063ack = new C7063ack(str5);
                        }
                        String strOLrzqt = c7063ack.OLrzqt();
                        if (!isEmptyString(strOLrzqt)) {
                            appendTag(strOLrzqt, sb);
                        }
                    }
                    z = false;
                    if (str4 != null && str4.length() > 1) {
                        if (str4.charAt(0) == '_') {
                            c = 1;
                        } else if (str4.charAt(1) == '_') {
                            c = 2;
                        }
                        if (z) {
                            if (c == 1) {
                                sb.append(UNDERSCORE);
                            }
                            sb.append(str4);
                        } else if (c == 2) {
                            sb.append(str4.substring(1));
                        } else {
                            sb.append(str4);
                        }
                    }
                    return sb.toString();
                }
                z = true;
                if (str4 != null) {
                    if (str4.charAt(0) == '_') {
                    }
                    if (z) {
                    }
                }
                return sb.toString();
            }
        }
        c7063ack = null;
        if (isEmptyString(str2)) {
        }
        char c2 = 0;
        if (isEmptyString(str3)) {
        }
        z = true;
        if (str4 != null) {
        }
        return sb.toString();
    }

    public static String createTagString(String str, String str2, String str3, String str4) {
        return createTagString(str, str2, str3, str4, null);
    }

    private static int parseTagString(String str, String[] strArr) {
        C7063ack c7063ack = new C7063ack(str);
        String strDjBIcL = c7063ack.djBIcL();
        String strIsConnected = c7063ack.isConnected();
        String strOLrzqt = c7063ack.OLrzqt();
        if (isEmptyString(strDjBIcL)) {
            strArr[0] = "und";
        } else {
            strArr[0] = strDjBIcL;
        }
        if (strIsConnected.equals(UNDEFINED_SCRIPT)) {
            strArr[1] = "";
        } else {
            strArr[1] = strIsConnected;
        }
        if (strOLrzqt.equals(UNDEFINED_REGION)) {
            strArr[2] = "";
        } else {
            strArr[2] = strOLrzqt;
        }
        String strAkhnZx = c7063ack.AkhnZx();
        if (!isEmptyString(strAkhnZx)) {
            int iIndexOf = str.indexOf(strAkhnZx);
            return iIndexOf > 0 ? iIndexOf - 1 : iIndexOf;
        }
        int iIndexOf2 = str.indexOf(64);
        return iIndexOf2 == -1 ? str.length() : iIndexOf2;
    }

    private static String lookupLikelySubtags(String str) {
        try {
            return UResourceBundle.copydefault("com/ibm/icu/impl/data/icudt68b", "likelySubtags").getString(str);
        } catch (MissingResourceException unused) {
            return null;
        }
    }

    private static String createLikelySubtagsString(String str, String str2, String str3, String str4) {
        String strLookupLikelySubtags;
        String strLookupLikelySubtags2;
        String strLookupLikelySubtags3;
        if (!isEmptyString(str2) && !isEmptyString(str3) && (strLookupLikelySubtags3 = lookupLikelySubtags(createTagString(str, str2, str3, null))) != null) {
            return createTagString(null, null, null, str4, strLookupLikelySubtags3);
        }
        if (!isEmptyString(str2) && (strLookupLikelySubtags2 = lookupLikelySubtags(createTagString(str, str2, null, null))) != null) {
            return createTagString(null, null, str3, str4, strLookupLikelySubtags2);
        }
        if (!isEmptyString(str3) && (strLookupLikelySubtags = lookupLikelySubtags(createTagString(str, null, str3, null))) != null) {
            return createTagString(null, str2, null, str4, strLookupLikelySubtags);
        }
        String strLookupLikelySubtags4 = lookupLikelySubtags(createTagString(str, null, null, null));
        if (strLookupLikelySubtags4 != null) {
            return createTagString(null, str2, str3, str4, strLookupLikelySubtags4);
        }
        return null;
    }

    public String getExtension(char c) {
        if (!C7098adS.KWHzl(c)) {
            throw new IllegalArgumentException("Invalid extension key: " + c);
        }
        return extensions().EZpvd(Character.valueOf(c));
    }

    public Set<Character> getExtensionKeys() {
        return extensions().copydefault();
    }

    public Set<String> getUnicodeLocaleAttributes() {
        return extensions().KWHzl();
    }

    public String getUnicodeLocaleType(String str) {
        if (!C7098adS.EZpvd(str)) {
            throw new IllegalArgumentException("Invalid Unicode locale key: " + str);
        }
        return extensions().OLrzqt(str);
    }

    public Set<String> getUnicodeLocaleKeys() {
        return extensions().EZpvd();
    }

    public String toLanguageTag() {
        C7094adO c7094adOBase = base();
        C7098adS c7098adSExtensions = extensions();
        if (c7094adOBase.copydefault().equalsIgnoreCase("POSIX")) {
            c7094adOBase = C7094adO.AEQbTJ(c7094adOBase.KWHzl(), c7094adOBase.EZpvd(), c7094adOBase.OLrzqt(), "");
            if (c7098adSExtensions.OLrzqt("va") == null) {
                C7092adM c7092adM = new C7092adM();
                try {
                    c7092adM.OLrzqt(C7094adO.EZpvd, c7098adSExtensions);
                    c7092adM.AEQbTJ("va", "posix");
                    c7098adSExtensions = c7092adM.OLrzqt();
                } catch (LocaleSyntaxException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        C7096adQ c7096adQAEQbTJ = C7096adQ.AEQbTJ(c7094adOBase, c7098adSExtensions);
        StringBuilder sb = new StringBuilder();
        String strAEQbTJ = c7096adQAEQbTJ.AEQbTJ();
        if (strAEQbTJ.length() > 0) {
            sb.append(C7096adQ.EZpvd(strAEQbTJ));
        }
        String strAYXKKw = c7096adQAEQbTJ.AYXKKw();
        if (strAYXKKw.length() > 0) {
            sb.append("-");
            sb.append(C7096adQ.KWHzl(strAYXKKw));
        }
        String strOLrzqt = c7096adQAEQbTJ.OLrzqt();
        if (strOLrzqt.length() > 0) {
            sb.append("-");
            sb.append(C7096adQ.OLrzqt(strOLrzqt));
        }
        ArrayList<String> arrayList = new ArrayList(c7096adQAEQbTJ.AhwBna());
        Collections.sort(arrayList);
        for (String str : arrayList) {
            sb.append("-");
            sb.append(C7096adQ.AYXKKw(str));
        }
        for (String str2 : c7096adQAEQbTJ.KWHzl()) {
            sb.append("-");
            sb.append(C7096adQ.copydefault(str2));
        }
        String strEZpvd = c7096adQAEQbTJ.EZpvd();
        if (strEZpvd.length() > 0) {
            if (sb.length() > 0) {
                sb.append("-");
            }
            sb.append("x");
            sb.append("-");
            sb.append(C7096adQ.AEQbTJ(strEZpvd));
        }
        return sb.toString();
    }

    public static ULocale forLanguageTag(String str) {
        C7096adQ c7096adQEZpvd = C7096adQ.EZpvd(str, (C7099adT) null);
        C7092adM c7092adM = new C7092adM();
        c7092adM.EZpvd(c7096adQEZpvd);
        return getInstance(c7092adM.copydefault(), c7092adM.OLrzqt());
    }

    public static String toUnicodeLocaleKey(String str) {
        String strOLrzqt = KeyTypeData.OLrzqt(str);
        return (strOLrzqt == null && C7100adU.AEQbTJ(str)) ? C7090adK.AEQbTJ(str) : strOLrzqt;
    }

    public static String toUnicodeLocaleType(String str, String str2) {
        String strOLrzqt = KeyTypeData.OLrzqt(str, str2, null, null);
        return (strOLrzqt == null && C7100adU.EZpvd(str2)) ? C7090adK.AEQbTJ(str2) : strOLrzqt;
    }

    public static String toLegacyKey(String str) {
        String strAEQbTJ = KeyTypeData.AEQbTJ(str);
        return (strAEQbTJ == null && str.matches("[0-9a-zA-Z]+")) ? C7090adK.AEQbTJ(str) : strAEQbTJ;
    }

    public static String toLegacyType(String str, String str2) {
        String strAEQbTJ = KeyTypeData.AEQbTJ(str, str2, null, null);
        return (strAEQbTJ == null && str2.matches("[0-9a-zA-Z]+([_/\\-][0-9a-zA-Z]+)*")) ? C7090adK.AEQbTJ(str2) : strAEQbTJ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ULocale getInstance(C7094adO c7094adO, C7098adS c7098adS) {
        String strLscvToID = lscvToID(c7094adO.KWHzl(), c7094adO.EZpvd(), c7094adO.OLrzqt(), c7094adO.copydefault());
        Set<Character> setCopydefault = c7098adS.copydefault();
        if (!setCopydefault.isEmpty()) {
            TreeMap treeMap = new TreeMap();
            for (Character ch : setCopydefault) {
                C7091adL c7091adLAEQbTJ = c7098adS.AEQbTJ(ch);
                if (c7091adLAEQbTJ instanceof C7100adU) {
                    C7100adU c7100adU = (C7100adU) c7091adLAEQbTJ;
                    for (String str : c7100adU.KWHzl()) {
                        String strCopydefault = c7100adU.copydefault(str);
                        String legacyKey = toLegacyKey(str);
                        if (strCopydefault.length() == 0) {
                            strCopydefault = "yes";
                        }
                        String legacyType = toLegacyType(str, strCopydefault);
                        if (legacyKey.equals("va") && legacyType.equals("posix") && c7094adO.copydefault().length() == 0) {
                            strLscvToID = strLscvToID + "_POSIX";
                        } else {
                            treeMap.put(legacyKey, legacyType);
                        }
                    }
                    Set<String> setCopydefault2 = c7100adU.copydefault();
                    if (setCopydefault2.size() > 0) {
                        StringBuilder sb = new StringBuilder();
                        for (String str2 : setCopydefault2) {
                            if (sb.length() > 0) {
                                sb.append('-');
                            }
                            sb.append(str2);
                        }
                        treeMap.put(LOCALE_ATTRIBUTE_KEY, sb.toString());
                    }
                } else {
                    treeMap.put(String.valueOf(ch), c7091adLAEQbTJ.AEQbTJ());
                }
            }
            if (!treeMap.isEmpty()) {
                StringBuilder sb2 = new StringBuilder(strLscvToID);
                sb2.append("@");
                boolean z = false;
                for (Map.Entry entry : treeMap.entrySet()) {
                    if (z) {
                        sb2.append(";");
                    } else {
                        z = true;
                    }
                    sb2.append((String) entry.getKey());
                    sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
                    sb2.append((String) entry.getValue());
                }
                strLscvToID = sb2.toString();
            }
        }
        return new ULocale(strLscvToID);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C7094adO base() {
        String strDjBIcL;
        String strAkhnZx;
        String strIsConnected;
        String strOLrzqt;
        if (this.baseLocale == null) {
            if (equals(ROOT)) {
                strDjBIcL = "";
                strAkhnZx = "";
                strIsConnected = strAkhnZx;
                strOLrzqt = strIsConnected;
            } else {
                C7063ack c7063ack = new C7063ack(this.localeID);
                strDjBIcL = c7063ack.djBIcL();
                strIsConnected = c7063ack.isConnected();
                strOLrzqt = c7063ack.OLrzqt();
                strAkhnZx = c7063ack.AkhnZx();
            }
            this.baseLocale = C7094adO.AEQbTJ(strDjBIcL, strIsConnected, strOLrzqt, strAkhnZx);
        }
        return this.baseLocale;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C7098adS extensions() {
        if (this.extensions == null) {
            Iterator<String> keywords = getKeywords();
            if (keywords == null) {
                this.extensions = C7098adS.OLrzqt;
            } else {
                C7092adM c7092adM = new C7092adM();
                while (keywords.hasNext()) {
                    String next = keywords.next();
                    if (next.equals(LOCALE_ATTRIBUTE_KEY)) {
                        for (String str : getKeywordValue(next).split("[-_]")) {
                            try {
                                c7092adM.OLrzqt(str);
                            } catch (LocaleSyntaxException unused) {
                            }
                        }
                    } else if (next.length() >= 2) {
                        String unicodeLocaleKey = toUnicodeLocaleKey(next);
                        String unicodeLocaleType = toUnicodeLocaleType(next, getKeywordValue(next));
                        if (unicodeLocaleKey != null && unicodeLocaleType != null) {
                            try {
                                c7092adM.AEQbTJ(unicodeLocaleKey, unicodeLocaleType);
                            } catch (LocaleSyntaxException unused2) {
                            }
                        }
                    } else if (next.length() == 1 && next.charAt(0) != 'u') {
                        c7092adM.OLrzqt(next.charAt(0), getKeywordValue(next).replace("_", "-"));
                    }
                }
                this.extensions = c7092adM.OLrzqt();
            }
        }
        return this.extensions;
    }

    public static final class ActionBar {
        public static boolean AEQbTJ = false;
        public static Method EZpvd;
        public static Method KWHzl;
        public static Object OLrzqt;
        public static Object copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static boolean OLrzqt() {
            return AEQbTJ;
        }

        static {
            Class<?> cls;
            try {
                Class<?>[] declaredClasses = Locale.class.getDeclaredClasses();
                int length = declaredClasses.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        cls = null;
                        break;
                    }
                    cls = declaredClasses[i];
                    if (cls.getName().equals("java.util.Locale$Category")) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (cls == null) {
                    return;
                }
                EZpvd = Locale.class.getDeclaredMethod("getDefault", cls);
                KWHzl = Locale.class.getDeclaredMethod("setDefault", cls, Locale.class);
                Method method = cls.getMethod("name", null);
                for (Object obj : cls.getEnumConstants()) {
                    String str = (String) method.invoke(obj, null);
                    if (str.equals("DISPLAY")) {
                        OLrzqt = obj;
                    } else if (str.equals("FORMAT")) {
                        copydefault = obj;
                    }
                }
                if (OLrzqt != null && copydefault != null) {
                    AEQbTJ = true;
                }
            } catch (IllegalAccessException | IllegalArgumentException | NoSuchMethodException | SecurityException | InvocationTargetException unused) {
            }
        }

        private ActionBar() {
        }

        public static ULocale copydefault(Locale locale) {
            TreeMap treeMap;
            TreeSet<String> treeSet;
            String language = locale.getLanguage();
            String country = locale.getCountry();
            String variant = locale.getVariant();
            String script = locale.getScript();
            Set<Character> extensionKeys = locale.getExtensionKeys();
            if (extensionKeys.isEmpty()) {
                treeMap = null;
                treeSet = null;
            } else {
                treeMap = null;
                treeSet = null;
                for (Character ch : extensionKeys) {
                    if (ch.charValue() == 'u') {
                        Set<String> unicodeLocaleAttributes = locale.getUnicodeLocaleAttributes();
                        if (!unicodeLocaleAttributes.isEmpty()) {
                            treeSet = new TreeSet();
                            Iterator<String> it = unicodeLocaleAttributes.iterator();
                            while (it.hasNext()) {
                                treeSet.add(it.next());
                            }
                        }
                        for (String str : locale.getUnicodeLocaleKeys()) {
                            String unicodeLocaleType = locale.getUnicodeLocaleType(str);
                            if (unicodeLocaleType != null) {
                                if (str.equals("va")) {
                                    variant = variant.length() == 0 ? unicodeLocaleType : unicodeLocaleType + "_" + variant;
                                } else {
                                    if (treeMap == null) {
                                        treeMap = new TreeMap();
                                    }
                                    treeMap.put(str, unicodeLocaleType);
                                }
                            }
                        }
                    } else {
                        String extension = locale.getExtension(ch.charValue());
                        if (extension != null) {
                            if (treeMap == null) {
                                treeMap = new TreeMap();
                            }
                            treeMap.put(String.valueOf(ch), extension);
                        }
                    }
                }
            }
            if (language.equals("no") && country.equals("NO") && variant.equals("NY")) {
                language = "nn";
                variant = "";
            }
            StringBuilder sb = new StringBuilder(language);
            if (script.length() > 0) {
                sb.append(ULocale.UNDERSCORE);
                sb.append(script);
            }
            if (country.length() > 0) {
                sb.append(ULocale.UNDERSCORE);
                sb.append(country);
            }
            if (variant.length() > 0) {
                if (country.length() == 0) {
                    sb.append(ULocale.UNDERSCORE);
                }
                sb.append(ULocale.UNDERSCORE);
                sb.append(variant);
            }
            if (treeSet != null) {
                StringBuilder sb2 = new StringBuilder();
                for (String str2 : treeSet) {
                    if (sb2.length() != 0) {
                        sb2.append('-');
                    }
                    sb2.append(str2);
                }
                if (treeMap == null) {
                    treeMap = new TreeMap();
                }
                treeMap.put(ULocale.LOCALE_ATTRIBUTE_KEY, sb2.toString());
            }
            if (treeMap != null) {
                sb.append('@');
                boolean z = false;
                for (Map.Entry entry : treeMap.entrySet()) {
                    String legacyKey = (String) entry.getKey();
                    String legacyType = (String) entry.getValue();
                    if (legacyKey.length() != 1) {
                        legacyKey = ULocale.toLegacyKey(legacyKey);
                        if (legacyType.length() == 0) {
                            legacyType = "yes";
                        }
                        legacyType = ULocale.toLegacyType(legacyKey, legacyType);
                    }
                    if (z) {
                        sb.append(';');
                    } else {
                        z = true;
                    }
                    sb.append(legacyKey);
                    sb.append('=');
                    sb.append(legacyType);
                }
            }
            return new ULocale(ULocale.getName(sb.toString()), locale);
        }

        public static Locale copydefault(ULocale uLocale) {
            Locale localeForLanguageTag = (uLocale.getScript().length() > 0 || uLocale.getName().contains("@")) ? Locale.forLanguageTag(C7090adK.valueOf(uLocale.toLanguageTag())) : null;
            return localeForLanguageTag == null ? new Locale(uLocale.getLanguage(), uLocale.getCountry(), uLocale.getVariant()) : localeForLanguageTag;
        }

        public static Locale EZpvd(Category category) {
            if (AEQbTJ) {
                int i = AnonymousClass2.KWHzl[category.ordinal()];
                Object obj = i != 1 ? i != 2 ? null : copydefault : OLrzqt;
                if (obj != null) {
                    try {
                        return (Locale) EZpvd.invoke(null, obj);
                    } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
                    }
                }
            }
            return Locale.getDefault();
        }

        public static void KWHzl(Category category, Locale locale) {
            if (AEQbTJ) {
                int i = AnonymousClass2.KWHzl[category.ordinal()];
                Object obj = i != 1 ? i != 2 ? null : copydefault : OLrzqt;
                if (obj != null) {
                    try {
                        KWHzl.invoke(null, obj, locale);
                    } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.ibm.icu.util.ULocale$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        public static final /* synthetic */ int[] KWHzl;

        static {
            int[] iArr = new int[Category.values().length];
            KWHzl = iArr;
            try {
                iArr[Category.DISPLAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                KWHzl[Category.FORMAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }
}
