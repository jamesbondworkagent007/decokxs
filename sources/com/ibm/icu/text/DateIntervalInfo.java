package com.ibm.icu.text;

import androidx.exifinterface.media.ExifInterface;
import com.bytedance.applog.encryptor.IEncryptorType;
import com.ibm.icu.impl.ICUResourceBundle;
import com.ibm.icu.text.DateIntervalFormat;
import com.ibm.icu.util.Calendar;
import com.ibm.icu.util.ICUCloneNotSupportedException;
import com.ibm.icu.util.ICUException;
import com.ibm.icu.util.ULocale;
import com.ibm.icu.util.UResourceBundle;
import com.okinc.localization2.bean.server.AppLanguage;
import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.Objects;
import java.util.Set;
import o.C7027acA;
import o.C7043acQ;
import o.InterfaceC7054acb;
import o.InterfaceC7248agJ;

/* JADX INFO: loaded from: classes22.dex */
public class DateIntervalInfo implements Cloneable, InterfaceC7248agJ<DateIntervalInfo>, Serializable {
    private static final int MINIMUM_SUPPORTED_CALENDAR_FIELD = 14;
    static final int currentSerialVersion = 1;
    private static final long serialVersionUID = 1;
    private String fFallbackIntervalPattern;
    private boolean fFirstDateInPtnIsLaterDate;
    private Map<String, Map<String, PatternInfo>> fIntervalPatterns;
    private transient boolean fIntervalPatternsReadOnly;
    private volatile transient boolean frozen;
    static final String[] CALENDAR_FIELD_TO_PATTERN_LETTER = {"G", DateFormat.YEAR, "M", "w", ExifInterface.LONGITUDE_WEST, DateFormat.DAY, "D", "E", "F", IEncryptorType.DEFAULT_ENCRYPTOR, "h", DateFormat.HOUR24, DateFormat.MINUTE, DateFormat.SECOND, ExifInterface.LATITUDE_SOUTH, DateFormat.ABBR_SPECIFIC_TZ, " ", "Y", "e", "u", "g", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, " ", " "};
    private static String CALENDAR_KEY = "calendar";
    private static String INTERVAL_FORMATS_KEY = "intervalFormats";
    private static String FALLBACK_STRING = AppLanguage.KEY_FALLBACK;
    private static String LATEST_FIRST_PREFIX = "latestFirst:";
    private static String EARLIEST_FIRST_PREFIX = "earliestFirst:";
    private static final InterfaceC7054acb<String, DateIntervalInfo> DIICACHE = new C7027acA();

    private static boolean stringNumeric(int i, int i2, char c) {
        if (c != 'M') {
            return false;
        }
        if (i > 2 || i2 <= 2) {
            return i > 2 && i2 <= 2;
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: freeze()Ljava/lang/Object; */
    /* JADX INFO: renamed from: freeze, reason: merged with bridge method [inline-methods] */
    public DateIntervalInfo m6325freeze() {
        this.fIntervalPatternsReadOnly = true;
        this.frozen = true;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean getDefaultOrder() {
        return this.fFirstDateInPtnIsLaterDate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getFallbackIntervalPattern() {
        return this.fFallbackIntervalPattern;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isFrozen() {
        return this.frozen;
    }

    public static final class PatternInfo implements Cloneable, Serializable {
        static final int currentSerialVersion = 1;
        private static final long serialVersionUID = 1;
        private final boolean fFirstDateInPtnIsLaterDate;
        private final String fIntervalPatternFirstPart;
        private final String fIntervalPatternSecondPart;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean firstDateInPtnIsLaterDate() {
            return this.fFirstDateInPtnIsLaterDate;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String getFirstPart() {
            return this.fIntervalPatternFirstPart;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String getSecondPart() {
            return this.fIntervalPatternSecondPart;
        }

        public PatternInfo(String str, String str2, boolean z) {
            this.fIntervalPatternFirstPart = str;
            this.fIntervalPatternSecondPart = str2;
            this.fFirstDateInPtnIsLaterDate = z;
        }

        public boolean equals(Object obj) {
            if (obj instanceof PatternInfo) {
                PatternInfo patternInfo = (PatternInfo) obj;
                if (Objects.equals(this.fIntervalPatternFirstPart, patternInfo.fIntervalPatternFirstPart) && Objects.equals(this.fIntervalPatternSecondPart, patternInfo.fIntervalPatternSecondPart) && this.fFirstDateInPtnIsLaterDate == patternInfo.fFirstDateInPtnIsLaterDate) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            String str = this.fIntervalPatternFirstPart;
            int iHashCode = str != null ? str.hashCode() : 0;
            String str2 = this.fIntervalPatternSecondPart;
            if (str2 != null) {
                iHashCode ^= str2.hashCode();
            }
            return this.fFirstDateInPtnIsLaterDate ? ~iHashCode : iHashCode;
        }

        public String toString() {
            return "{first=«" + this.fIntervalPatternFirstPart + "», second=«" + this.fIntervalPatternSecondPart + "», reversed:" + this.fFirstDateInPtnIsLaterDate + "}";
        }
    }

    @Deprecated
    public DateIntervalInfo() {
        this.fFirstDateInPtnIsLaterDate = false;
        this.fIntervalPatterns = null;
        this.frozen = false;
        this.fIntervalPatternsReadOnly = false;
        this.fIntervalPatterns = new HashMap();
        this.fFallbackIntervalPattern = "{0} – {1}";
    }

    public DateIntervalInfo(ULocale uLocale) {
        this.fFirstDateInPtnIsLaterDate = false;
        this.fIntervalPatterns = null;
        this.frozen = false;
        this.fIntervalPatternsReadOnly = false;
        initializeData(uLocale);
    }

    public DateIntervalInfo(Locale locale) {
        this(ULocale.forLocale(locale));
    }

    private void initializeData(ULocale uLocale) {
        String string = uLocale.toString();
        InterfaceC7054acb<String, DateIntervalInfo> interfaceC7054acb = DIICACHE;
        DateIntervalInfo dateIntervalInfoEZpvd = interfaceC7054acb.EZpvd(string);
        if (dateIntervalInfoEZpvd == null) {
            setup(uLocale);
            this.fIntervalPatternsReadOnly = true;
            interfaceC7054acb.KWHzl(string, ((DateIntervalInfo) clone()).m6325freeze());
            return;
        }
        initializeFromReadOnlyPatterns(dateIntervalInfoEZpvd);
    }

    private void initializeFromReadOnlyPatterns(DateIntervalInfo dateIntervalInfo) {
        this.fFallbackIntervalPattern = dateIntervalInfo.fFallbackIntervalPattern;
        this.fFirstDateInPtnIsLaterDate = dateIntervalInfo.fFirstDateInPtnIsLaterDate;
        this.fIntervalPatterns = dateIntervalInfo.fIntervalPatterns;
        this.fIntervalPatternsReadOnly = true;
    }

    public static final class TaskDescription extends C7043acQ.ActionBar {
        public static final String EZpvd;
        public static final String copydefault = "/LOCALE/" + DateIntervalInfo.CALENDAR_KEY + "/";
        public String AEQbTJ;
        public DateIntervalInfo OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String KWHzl() {
            String str = this.AEQbTJ;
            this.AEQbTJ = null;
            return str;
        }

        public TaskDescription(DateIntervalInfo dateIntervalInfo) {
            this.OLrzqt = dateIntervalInfo;
        }

        @Override // o.C7043acQ.ActionBar
        public void copydefault(C7043acQ.Application application, C7043acQ.TaskDescription taskDescription, boolean z) {
            C7043acQ.StateListAnimator stateListAnimatorValueOf = taskDescription.valueOf();
            for (int i = 0; stateListAnimatorValueOf.AEQbTJ(i, application, taskDescription); i++) {
                if (application.copydefault(DateIntervalInfo.INTERVAL_FORMATS_KEY)) {
                    if (taskDescription.AhwBna() == 3) {
                        this.AEQbTJ = copydefault(taskDescription.AEQbTJ());
                        return;
                    } else if (taskDescription.AhwBna() == 2) {
                        C7043acQ.StateListAnimator stateListAnimatorValueOf2 = taskDescription.valueOf();
                        for (int i2 = 0; stateListAnimatorValueOf2.AEQbTJ(i2, application, taskDescription); i2++) {
                            if (taskDescription.AhwBna() == 2) {
                                KWHzl(application, taskDescription);
                            }
                        }
                        return;
                    }
                }
            }
        }

        public void KWHzl(C7043acQ.Application application, C7043acQ.TaskDescription taskDescription) {
            CharSequence charSequenceOLrzqt;
            String string = application.toString();
            C7043acQ.StateListAnimator stateListAnimatorValueOf = taskDescription.valueOf();
            for (int i = 0; stateListAnimatorValueOf.AEQbTJ(i, application, taskDescription); i++) {
                if (taskDescription.AhwBna() == 0 && (charSequenceOLrzqt = OLrzqt(application)) != null) {
                    AEQbTJ(string, charSequenceOLrzqt.toString(), taskDescription);
                }
            }
        }

        static {
            StringBuilder sb = new StringBuilder();
            sb.append("/");
            sb.append(DateIntervalInfo.INTERVAL_FORMATS_KEY);
            EZpvd = sb.toString();
        }

        public final String copydefault(String str) {
            String str2 = copydefault;
            if (str.startsWith(str2)) {
                String str3 = EZpvd;
                if (str.endsWith(str3)) {
                    return str.substring(str2.length(), str.length() - str3.length());
                }
            }
            throw new ICUException("Malformed 'intervalFormat' alias path: " + str);
        }

        public final CharSequence OLrzqt(CharSequence charSequence) {
            if (charSequence.length() != 1) {
                return null;
            }
            char cCharAt = charSequence.charAt(0);
            if ("GyMdahHmsS".indexOf(cCharAt) < 0 && cCharAt != 'B') {
                return null;
            }
            String[] strArr = DateIntervalInfo.CALENDAR_FIELD_TO_PATTERN_LETTER;
            CharSequence charSequence2 = charSequence;
            if (cCharAt == strArr[11].charAt(0)) {
                charSequence2 = strArr[10];
            }
            return cCharAt == 'B' ? strArr[9] : charSequence2;
        }

        public final void AEQbTJ(String str, String str2, C7043acQ.TaskDescription taskDescription) {
            Map map = (Map) this.OLrzqt.fIntervalPatterns.get(str);
            if (map == null || !map.containsKey(str2)) {
                this.OLrzqt.setIntervalPatternInternally(str, str2, taskDescription.toString());
            }
        }
    }

    private void setup(ULocale uLocale) {
        this.fIntervalPatterns = new HashMap(19);
        this.fFallbackIntervalPattern = "{0} – {1}";
        try {
            String keywordValue = uLocale.getKeywordValue("calendar");
            if (keywordValue == null) {
                keywordValue = Calendar.getKeywordValuesForLocale("calendar", uLocale, true)[0];
            }
            if (keywordValue == null) {
                keywordValue = "gregorian";
            }
            TaskDescription taskDescription = new TaskDescription(this);
            ICUResourceBundle iCUResourceBundle = (ICUResourceBundle) UResourceBundle.KWHzl("com/ibm/icu/impl/data/icudt68b", uLocale);
            setFallbackIntervalPattern(iCUResourceBundle.djBIcL(CALENDAR_KEY + "/" + keywordValue + "/" + INTERVAL_FORMATS_KEY + "/" + FALLBACK_STRING));
            HashSet hashSet = new HashSet();
            while (keywordValue != null) {
                if (hashSet.contains(keywordValue)) {
                    throw new ICUException("Loop in calendar type fallback: " + keywordValue);
                }
                hashSet.add(keywordValue);
                iCUResourceBundle.copydefault(CALENDAR_KEY + "/" + keywordValue, taskDescription);
                keywordValue = taskDescription.KWHzl();
            }
        } catch (MissingResourceException unused) {
        }
    }

    private static int splitPatternInto2Part(String str) {
        boolean z;
        int[] iArr = new int[58];
        int i = 0;
        int i2 = 0;
        char c = 0;
        boolean z2 = false;
        while (true) {
            if (i >= str.length()) {
                z = false;
                break;
            }
            char cCharAt = str.charAt(i);
            z = true;
            if (cCharAt != c && i2 > 0) {
                int i3 = c - 'A';
                if (iArr[i3] != 0) {
                    break;
                }
                iArr[i3] = 1;
                i2 = 0;
            }
            if (cCharAt == '\'') {
                int i4 = i + 1;
                if (i4 >= str.length() || str.charAt(i4) != '\'') {
                    z2 = !z2;
                } else {
                    i = i4;
                }
            } else if (!z2 && ((cCharAt >= 'a' && cCharAt <= 'z') || (cCharAt >= 'A' && cCharAt <= 'Z'))) {
                i2++;
                c = cCharAt;
            }
            i++;
        }
        return i - ((i2 <= 0 || z || iArr[c - 'A'] != 0) ? i2 : 0);
    }

    public void setIntervalPattern(String str, int i, String str2) {
        if (this.frozen) {
            throw new UnsupportedOperationException("no modification is allowed after DII is frozen");
        }
        if (i > 14) {
            throw new IllegalArgumentException("calendar field is larger than MINIMUM_SUPPORTED_CALENDAR_FIELD");
        }
        if (this.fIntervalPatternsReadOnly) {
            this.fIntervalPatterns = cloneIntervalPatterns(this.fIntervalPatterns);
            this.fIntervalPatternsReadOnly = false;
        }
        String[] strArr = CALENDAR_FIELD_TO_PATTERN_LETTER;
        PatternInfo intervalPatternInternally = setIntervalPatternInternally(str, strArr[i], str2);
        if (i == 11) {
            setIntervalPattern(str, strArr[9], intervalPatternInternally);
            setIntervalPattern(str, strArr[10], intervalPatternInternally);
        } else if (i == 5 || i == 7) {
            setIntervalPattern(str, strArr[5], intervalPatternInternally);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public PatternInfo setIntervalPatternInternally(String str, String str2, String str3) {
        boolean z;
        Map<String, PatternInfo> map = this.fIntervalPatterns.get(str);
        boolean z2 = false;
        if (map == null) {
            map = new HashMap<>();
            z = true;
        } else {
            z = false;
        }
        boolean z3 = this.fFirstDateInPtnIsLaterDate;
        if (str3.startsWith(LATEST_FIRST_PREFIX)) {
            str3 = str3.substring(LATEST_FIRST_PREFIX.length(), str3.length());
            z2 = true;
        } else if (str3.startsWith(EARLIEST_FIRST_PREFIX)) {
            str3 = str3.substring(EARLIEST_FIRST_PREFIX.length(), str3.length());
        } else {
            z2 = z3;
        }
        PatternInfo patternInfoGenPatternInfo = genPatternInfo(str3, z2);
        map.put(str2, patternInfoGenPatternInfo);
        if (z) {
            this.fIntervalPatterns.put(str, map);
        }
        return patternInfoGenPatternInfo;
    }

    private void setIntervalPattern(String str, String str2, PatternInfo patternInfo) {
        this.fIntervalPatterns.get(str).put(str2, patternInfo);
    }

    @Deprecated
    public static PatternInfo genPatternInfo(String str, boolean z) {
        int iSplitPatternInto2Part = splitPatternInto2Part(str);
        return new PatternInfo(str.substring(0, iSplitPatternInto2Part), iSplitPatternInto2Part < str.length() ? str.substring(iSplitPatternInto2Part, str.length()) : null, z);
    }

    public PatternInfo getIntervalPattern(String str, int i) {
        PatternInfo patternInfo;
        if (i > 14) {
            throw new IllegalArgumentException("no support for field less than MILLISECOND");
        }
        Map<String, PatternInfo> map = this.fIntervalPatterns.get(str);
        if (map == null || (patternInfo = map.get(CALENDAR_FIELD_TO_PATTERN_LETTER[i])) == null) {
            return null;
        }
        return patternInfo;
    }

    public void setFallbackIntervalPattern(String str) {
        if (this.frozen) {
            throw new UnsupportedOperationException("no modification is allowed after DII is frozen");
        }
        int iIndexOf = str.indexOf("{0}");
        int iIndexOf2 = str.indexOf("{1}");
        if (iIndexOf == -1 || iIndexOf2 == -1) {
            throw new IllegalArgumentException("no pattern {0} or pattern {1} in fallbackPattern");
        }
        if (iIndexOf > iIndexOf2) {
            this.fFirstDateInPtnIsLaterDate = true;
        }
        this.fFallbackIntervalPattern = str;
    }

    public Object clone() {
        return this.frozen ? this : cloneUnfrozenDII();
    }

    private Object cloneUnfrozenDII() {
        try {
            DateIntervalInfo dateIntervalInfo = (DateIntervalInfo) super.clone();
            dateIntervalInfo.fFallbackIntervalPattern = this.fFallbackIntervalPattern;
            dateIntervalInfo.fFirstDateInPtnIsLaterDate = this.fFirstDateInPtnIsLaterDate;
            if (this.fIntervalPatternsReadOnly) {
                dateIntervalInfo.fIntervalPatterns = this.fIntervalPatterns;
                dateIntervalInfo.fIntervalPatternsReadOnly = true;
            } else {
                dateIntervalInfo.fIntervalPatterns = cloneIntervalPatterns(this.fIntervalPatterns);
                dateIntervalInfo.fIntervalPatternsReadOnly = false;
            }
            dateIntervalInfo.frozen = false;
            return dateIntervalInfo;
        } catch (CloneNotSupportedException e) {
            throw new ICUCloneNotSupportedException("clone is not supported", e);
        }
    }

    private static Map<String, Map<String, PatternInfo>> cloneIntervalPatterns(Map<String, Map<String, PatternInfo>> map) {
        HashMap map2 = new HashMap();
        for (Map.Entry<String, Map<String, PatternInfo>> entry : map.entrySet()) {
            String key = entry.getKey();
            Map<String, PatternInfo> value = entry.getValue();
            HashMap map3 = new HashMap();
            for (Map.Entry<String, PatternInfo> entry2 : value.entrySet()) {
                map3.put(entry2.getKey(), entry2.getValue());
            }
            map2.put(key, map3);
        }
        return map2;
    }

    /* JADX DEBUG: Method merged with bridge method: cloneAsThawed()Ljava/lang/Object; */
    /* JADX INFO: renamed from: cloneAsThawed, reason: merged with bridge method [inline-methods] */
    public DateIntervalInfo m6324cloneAsThawed() {
        return (DateIntervalInfo) cloneUnfrozenDII();
    }

    public static void parseSkeleton(String str, int[] iArr) {
        for (int i = 0; i < str.length(); i++) {
            int iCharAt = str.charAt(i) - 'A';
            iArr[iCharAt] = iArr[iCharAt] + 1;
        }
    }

    public DateIntervalFormat.TaskDescription getBestSkeleton(String str) {
        String strReplace;
        boolean z;
        int i;
        String str2 = str;
        int i2 = 58;
        int[] iArr = new int[58];
        int[] iArr2 = new int[58];
        int i3 = 0;
        if (str2.indexOf(122) == -1 && str2.indexOf(107) == -1 && str2.indexOf(75) == -1 && str2.indexOf(97) == -1 && str2.indexOf(98) == -1) {
            strReplace = str2;
            z = false;
        } else {
            strReplace = str2.replace('z', 'v').replace('k', 'H').replace('K', 'h').replace(IEncryptorType.DEFAULT_ENCRYPTOR, "").replace("b", "");
            z = true;
        }
        parseSkeleton(strReplace, iArr);
        Iterator<String> it = this.fIntervalPatterns.keySet().iterator();
        int i4 = Integer.MAX_VALUE;
        int i5 = 0;
        while (true) {
            if (!it.hasNext()) {
                i = i5;
                break;
            }
            String next = it.next();
            for (int i6 = i3; i6 < i2; i6++) {
                iArr2[i6] = i3;
            }
            parseSkeleton(next, iArr2);
            int i7 = i3;
            int iAbs = i7;
            int i8 = 1;
            while (i7 < i2) {
                int i9 = iArr[i7];
                int i10 = iArr2[i7];
                if (i9 != i10) {
                    if (i9 == 0 || i10 == 0) {
                        iAbs += 4096;
                        i8 = -1;
                    } else {
                        iAbs = stringNumeric(i9, i10, (char) (i7 + 65)) ? iAbs + 256 : iAbs + Math.abs(i9 - i10);
                    }
                }
                i7++;
                i2 = 58;
            }
            if (iAbs < i4) {
                str2 = next;
                i4 = iAbs;
                i5 = i8;
            }
            if (iAbs == 0) {
                i = 0;
                break;
            }
            i2 = 58;
            i3 = 0;
        }
        if (z && i != -1) {
            i = 2;
        }
        return new DateIntervalFormat.TaskDescription(str2, i);
    }

    public boolean equals(Object obj) {
        if (obj instanceof DateIntervalInfo) {
            return this.fIntervalPatterns.equals(((DateIntervalInfo) obj).fIntervalPatterns);
        }
        return false;
    }

    public int hashCode() {
        return this.fIntervalPatterns.hashCode();
    }

    @Deprecated
    public Map<String, Set<String>> getPatterns() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Map<String, PatternInfo>> entry : this.fIntervalPatterns.entrySet()) {
            linkedHashMap.put(entry.getKey(), new LinkedHashSet(entry.getValue().keySet()));
        }
        return linkedHashMap;
    }

    @Deprecated
    public Map<String, Map<String, PatternInfo>> getRawPatterns() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Map<String, PatternInfo>> entry : this.fIntervalPatterns.entrySet()) {
            linkedHashMap.put(entry.getKey(), new LinkedHashMap(entry.getValue()));
        }
        return linkedHashMap;
    }
}
