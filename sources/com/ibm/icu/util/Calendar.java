package com.ibm.icu.util;

import com.flyco.tablayout.BuildConfig;
import com.google.android.exoplayer2.C;
import com.huawei.hms.framework.common.ContainerUtils;
import com.ibm.icu.impl.CalType;
import com.ibm.icu.impl.ICUResourceBundle;
import com.ibm.icu.text.DateFormat;
import com.ibm.icu.text.DateFormatSymbols;
import com.ibm.icu.text.DateTimePatternGenerator;
import com.ibm.icu.text.SimpleDateFormat;
import com.ibm.icu.util.ULocale;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.text.StringCharacterIterator;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.MissingResourceException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.AbstractC7078acz;
import o.C7011abL;
import o.C7027acA;
import o.C7028acB;
import o.C7261agW;
import o.InterfaceC7054acb;
import org.slf4j.Marker;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Calendar implements Serializable, Cloneable, Comparable<Calendar> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int AM = 0;
    public static final int AM_PM = 9;
    public static final int APRIL = 3;
    public static final int AUGUST = 7;

    @Deprecated
    protected static final int BASE_FIELD_COUNT = 23;
    public static final int DATE = 5;
    public static final int DAY_OF_MONTH = 5;
    public static final int DAY_OF_WEEK = 7;
    public static final int DAY_OF_WEEK_IN_MONTH = 8;
    public static final int DAY_OF_YEAR = 6;
    public static final int DECEMBER = 11;
    public static final int DOW_LOCAL = 18;
    public static final int DST_OFFSET = 16;
    protected static final int EPOCH_JULIAN_DAY = 2440588;
    public static final int ERA = 0;
    public static final int EXTENDED_YEAR = 19;
    public static final int FEBRUARY = 1;
    private static final int FIELD_DIFF_MAX_INT = Integer.MAX_VALUE;
    public static final int FRIDAY = 6;
    protected static final int GREATEST_MINIMUM = 1;
    public static final int HOUR = 10;
    public static final int HOUR_OF_DAY = 11;
    protected static final int INTERNALLY_SET = 1;
    public static final int IS_LEAP_MONTH = 22;
    public static final int JANUARY = 0;
    protected static final int JAN_1_1_JULIAN_DAY = 1721426;
    public static final int JULIAN_DAY = 20;
    public static final int JULY = 6;
    public static final int JUNE = 5;
    protected static final int LEAST_MAXIMUM = 2;
    public static final int MARCH = 2;
    protected static final int MAXIMUM = 3;

    @Deprecated
    protected static final int MAX_FIELD_COUNT = 32;
    private static final int MAX_HOURS = 548;
    public static final int MAY = 4;
    public static final int MILLISECOND = 14;
    public static final int MILLISECONDS_IN_DAY = 21;
    protected static final int MINIMUM = 0;
    protected static final int MINIMUM_USER_STAMP = 2;
    public static final int MINUTE = 12;
    public static final int MONDAY = 2;
    public static final int MONTH = 2;
    public static final int NOVEMBER = 10;
    public static final int OCTOBER = 9;
    protected static final long ONE_DAY = 86400000;
    protected static final int ONE_MINUTE = 60000;
    protected static final int ONE_SECOND = 1000;
    protected static final long ONE_WEEK = 604800000;
    public static final int PM = 1;
    private static final char QUOTE = '\'';
    protected static final int RESOLVE_REMAP = 32;
    public static final int SATURDAY = 7;
    public static final int SECOND = 13;
    public static final int SEPTEMBER = 8;
    public static final int SUNDAY = 1;
    public static final int THURSDAY = 5;
    public static final int TUESDAY = 3;
    public static final int UNDECIMBER = 12;
    protected static final int UNSET = 0;
    public static final int WALLTIME_FIRST = 1;
    public static final int WALLTIME_LAST = 0;
    public static final int WALLTIME_NEXT_VALID = 2;
    public static final int WEDNESDAY = 4;

    @Deprecated
    public static final int WEEKDAY = 0;

    @Deprecated
    public static final int WEEKEND = 1;

    @Deprecated
    public static final int WEEKEND_CEASE = 3;

    @Deprecated
    public static final int WEEKEND_ONSET = 2;
    public static final int WEEK_OF_MONTH = 4;
    public static final int WEEK_OF_YEAR = 3;
    public static final int YEAR = 1;
    public static final int YEAR_WOY = 17;
    public static final int ZONE_OFFSET = 15;
    private static final long serialVersionUID = 6222646104888790989L;
    private ULocale actualLocale;
    private transient boolean areAllFieldsSet;
    private transient boolean areFieldsSet;
    private transient boolean areFieldsVirtuallySet;
    private transient int[] fields;
    private int firstDayOfWeek;
    private transient int gregorianDayOfMonth;
    private transient int gregorianDayOfYear;
    private transient int gregorianMonth;
    private transient int gregorianYear;
    private transient int internalSetMask;
    private transient boolean isTimeSet;
    private boolean lenient;
    private int minimalDaysInFirstWeek;
    private transient int nextStamp;
    private int repeatedWallTime;
    private int skippedWallTime;
    private transient int[] stamp;
    private long time;
    private ULocale validLocale;
    private int weekendCease;
    private int weekendCeaseMillis;
    private int weekendOnset;
    private int weekendOnsetMillis;
    private TimeZone zone;
    protected static final long MIN_MILLIS = -184303902528000000L;
    protected static final Date MIN_DATE = new Date(MIN_MILLIS);
    protected static final long MAX_MILLIS = 183882168921600000L;
    protected static final Date MAX_DATE = new Date(MAX_MILLIS);
    private static int STAMP_MAX = 10000;
    private static final InterfaceC7054acb<String, ActionBar> PATTERN_CACHE = new C7027acA();
    private static final String[] DEFAULT_PATTERNS = {"HH:mm:ss z", "HH:mm:ss z", "HH:mm:ss", "HH:mm", "EEEE, yyyy MMMM dd", "yyyy MMMM d", "yyyy MMM d", "yy/MM/dd", "{1} {0}", "{1} {0}", "{1} {0}", "{1} {0}", "{1} {0}"};
    private static final String[] TIME_SKELETONS = {"jmmsszzzz", "jmmssz", "jmmss", "jmm"};
    protected static final int ONE_HOUR = 3600000;
    protected static final int MIN_JULIAN = -2130706432;
    protected static final int MAX_JULIAN = 2130706432;
    private static final int[][] LIMITS = {new int[0], new int[0], new int[0], new int[0], new int[0], new int[0], new int[0], new int[]{1, 1, 7, 7}, new int[0], new int[]{0, 0, 1, 1}, new int[]{0, 0, 11, 11}, new int[]{0, 0, 23, 23}, new int[]{0, 0, 59, 59}, new int[]{0, 0, 59, 59}, new int[]{0, 0, 999, 999}, new int[]{-43200000, -43200000, 43200000, 43200000}, new int[]{0, 0, ONE_HOUR, ONE_HOUR}, new int[0], new int[]{1, 1, 7, 7}, new int[0], new int[]{MIN_JULIAN, MIN_JULIAN, MAX_JULIAN, MAX_JULIAN}, new int[]{0, 0, 86399999, 86399999}, new int[]{0, 0, 1, 1}};
    private static final StateListAnimator WEEK_DATA_CACHE = new StateListAnimator(null);
    static final int[][][] DATE_PRECEDENCE = {new int[][]{new int[]{5}, new int[]{3, 7}, new int[]{4, 7}, new int[]{8, 7}, new int[]{3, 18}, new int[]{4, 18}, new int[]{8, 18}, new int[]{6}, new int[]{37, 1}, new int[]{35, 17}}, new int[][]{new int[]{3}, new int[]{4}, new int[]{8}, new int[]{40, 7}, new int[]{40, 18}}};
    static final int[][][] DOW_PRECEDENCE = {new int[][]{new int[]{7}, new int[]{18}}};
    private static final int[] FIND_ZONE_TRANSITION_TIME_UNITS = {ONE_HOUR, 1800000, 60000, 1000};
    private static final int[][] GREGORIAN_MONTH_COUNT = {new int[]{31, 31, 0, 0}, new int[]{28, 29, 31, 31}, new int[]{31, 31, 59, 60}, new int[]{30, 30, 90, 91}, new int[]{31, 31, 120, 121}, new int[]{30, 30, CipherSuite.TLS_DH_DSS_WITH_SEED_CBC_SHA, CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA}, new int[]{31, 31, CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA384, CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA256}, new int[]{31, 31, BuildConfig.VERSION_CODE, 213}, new int[]{30, 30, 243, 244}, new int[]{31, 31, 273, 274}, new int[]{30, 30, 304, 305}, new int[]{31, 31, 334, 335}};
    private static final String[] FIELD_NAME = {"ERA", "YEAR", "MONTH", "WEEK_OF_YEAR", "WEEK_OF_MONTH", "DAY_OF_MONTH", "DAY_OF_YEAR", "DAY_OF_WEEK", "DAY_OF_WEEK_IN_MONTH", "AM_PM", "HOUR", "HOUR_OF_DAY", "MINUTE", "SECOND", "MILLISECOND", "ZONE_OFFSET", "DST_OFFSET", "YEAR_WOY", "DOW_LOCAL", "EXTENDED_YEAR", "JULIAN_DAY", "MILLISECONDS_IN_DAY"};

    public static final long julianDayToMillis(int i) {
        return ((long) (i - EPOCH_JULIAN_DAY)) * 86400000;
    }

    public int getDefaultDayInMonth(int i, int i2) {
        return 1;
    }

    public int getDefaultMonthInYear(int i) {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int[][][] getFieldResolutionTable() {
        return DATE_PRECEDENCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getFirstDayOfWeek() {
        return this.firstDayOfWeek;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getGregorianDayOfMonth() {
        return this.gregorianDayOfMonth;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getGregorianDayOfYear() {
        return this.gregorianDayOfYear;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getGregorianMonth() {
        return this.gregorianMonth;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getGregorianYear() {
        return this.gregorianYear;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getMinimalDaysInFirstWeek() {
        return this.minimalDaysInFirstWeek;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getRepeatedWallTimeOption() {
        return this.repeatedWallTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getSkippedWallTimeOption() {
        return this.skippedWallTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TimeZone getTimeZone() {
        return this.zone;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getType() {
        return "unknown";
    }

    public abstract int handleComputeMonthStart(int i, int i2, boolean z);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int[] handleCreateFields() {
        return new int[23];
    }

    public abstract int handleGetExtendedYear();

    public abstract int handleGetLimit(int i, int i2);

    @Deprecated
    public boolean haveDefaultCentury() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long internalGetTimeInMillis() {
        return this.time;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isLenient() {
        return this.lenient;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setLenient(boolean z) {
        this.lenient = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0003 A[PHI: r0
  0x0003: PHI (r0v3 int) = (r0v0 int), (r0v1 int) binds: [B:3:0x0001, B:6:0x0006] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setMinimalDaysInFirstWeek(int i) {
        int i2 = 1;
        if (i < 1) {
            i = i2;
        } else {
            i2 = 7;
            if (i > 7) {
            }
        }
        if (this.minimalDaysInFirstWeek != i) {
            this.minimalDaysInFirstWeek = i;
            this.areFieldsSet = false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setTimeZone(TimeZone timeZone) {
        this.zone = timeZone;
        this.areFieldsSet = false;
    }

    public Calendar() {
        this(TimeZone.getDefault(), ULocale.getDefault(ULocale.Category.FORMAT));
    }

    public Calendar(TimeZone timeZone, Locale locale) {
        this(timeZone, ULocale.forLocale(locale));
    }

    public Calendar(TimeZone timeZone, ULocale uLocale) {
        this.lenient = true;
        this.repeatedWallTime = 0;
        this.skippedWallTime = 0;
        this.nextStamp = 2;
        this.zone = timeZone;
        setWeekData(getRegionForCalendar(uLocale));
        setCalendarLocale(uLocale);
        initInternal();
    }

    private void setCalendarLocale(ULocale uLocale) {
        if (uLocale.getVariant().length() != 0 || uLocale.getKeywords() != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(uLocale.getLanguage());
            String script = uLocale.getScript();
            if (script.length() > 0) {
                sb.append("_");
                sb.append(script);
            }
            String country = uLocale.getCountry();
            if (country.length() > 0) {
                sb.append("_");
                sb.append(country);
            }
            String keywordValue = uLocale.getKeywordValue("calendar");
            if (keywordValue != null) {
                sb.append("@calendar=");
                sb.append(keywordValue);
            }
            uLocale = new ULocale(sb.toString());
        }
        setLocale(uLocale, uLocale);
    }

    private void recalculateStamp() {
        int[] iArr;
        this.nextStamp = 1;
        for (int i = 0; i < this.stamp.length; i++) {
            int i2 = STAMP_MAX;
            int i3 = -1;
            int i4 = 0;
            while (true) {
                iArr = this.stamp;
                if (i4 >= iArr.length) {
                    break;
                }
                int i5 = iArr[i4];
                if (i5 > this.nextStamp && i5 < i2) {
                    i3 = i4;
                    i2 = i5;
                }
                i4++;
            }
            if (i3 < 0) {
                break;
            }
            int i6 = this.nextStamp + 1;
            this.nextStamp = i6;
            iArr[i3] = i6;
        }
        this.nextStamp++;
    }

    private void initInternal() {
        int[] iArrHandleCreateFields = handleCreateFields();
        this.fields = iArrHandleCreateFields;
        if (iArrHandleCreateFields != null) {
            if (iArrHandleCreateFields.length >= 23 && iArrHandleCreateFields.length <= 32) {
                this.stamp = new int[iArrHandleCreateFields.length];
                int i = 4718695;
                for (int i2 = 23; i2 < this.fields.length; i2++) {
                    i |= 1 << i2;
                }
                this.internalSetMask = i;
                return;
            }
        }
        throw new IllegalStateException("Invalid fields[]");
    }

    public static Calendar getInstance() {
        return getInstanceInternal(null, null);
    }

    public static Calendar getInstance(TimeZone timeZone) {
        return getInstanceInternal(timeZone, null);
    }

    public static Calendar getInstance(Locale locale) {
        return getInstanceInternal(null, ULocale.forLocale(locale));
    }

    public static Calendar getInstance(ULocale uLocale) {
        return getInstanceInternal(null, uLocale);
    }

    public static Calendar getInstance(TimeZone timeZone, Locale locale) {
        return getInstanceInternal(timeZone, ULocale.forLocale(locale));
    }

    public static Calendar getInstance(TimeZone timeZone, ULocale uLocale) {
        return getInstanceInternal(timeZone, uLocale);
    }

    private static Calendar getInstanceInternal(TimeZone timeZone, ULocale uLocale) {
        if (uLocale == null) {
            uLocale = ULocale.getDefault(ULocale.Category.FORMAT);
        }
        if (timeZone == null) {
            timeZone = TimeZone.forULocaleOrDefault(uLocale);
        }
        Calendar calendarCreateInstance = createInstance(uLocale);
        calendarCreateInstance.setTimeZone(timeZone);
        calendarCreateInstance.setTimeInMillis(System.currentTimeMillis());
        return calendarCreateInstance;
    }

    private static String getRegionForCalendar(ULocale uLocale) {
        String regionForSupplementalData = ULocale.getRegionForSupplementalData(uLocale, true);
        return regionForSupplementalData.length() == 0 ? "001" : regionForSupplementalData;
    }

    private static CalType getCalendarTypeForLocale(ULocale uLocale) {
        String strCopydefault = C7011abL.copydefault(uLocale);
        if (strCopydefault != null) {
            String lowerCase = strCopydefault.toLowerCase(Locale.ENGLISH);
            for (CalType calType : CalType.values()) {
                if (lowerCase.equals(calType.getId())) {
                    return calType;
                }
            }
        }
        return CalType.UNKNOWN;
    }

    private static Calendar createInstance(ULocale uLocale) {
        TimeZone timeZoneForULocaleOrDefault = TimeZone.forULocaleOrDefault(uLocale);
        CalType calendarTypeForLocale = getCalendarTypeForLocale(uLocale);
        if (calendarTypeForLocale == CalType.UNKNOWN) {
            calendarTypeForLocale = CalType.GREGORIAN;
        }
        switch (AnonymousClass2.KWHzl[calendarTypeForLocale.ordinal()]) {
            case 1:
                return new GregorianCalendar(timeZoneForULocaleOrDefault, uLocale);
            case 2:
                GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZoneForULocaleOrDefault, uLocale);
                gregorianCalendar.setFirstDayOfWeek(2);
                gregorianCalendar.setMinimalDaysInFirstWeek(4);
                return gregorianCalendar;
            case 3:
                return new BuddhistCalendar(timeZoneForULocaleOrDefault, uLocale);
            case 4:
                return new ChineseCalendar(timeZoneForULocaleOrDefault, uLocale);
            case 5:
                return new CopticCalendar(timeZoneForULocaleOrDefault, uLocale);
            case 6:
                return new DangiCalendar(timeZoneForULocaleOrDefault, uLocale);
            case 7:
                return new EthiopicCalendar(timeZoneForULocaleOrDefault, uLocale);
            case 8:
                EthiopicCalendar ethiopicCalendar = new EthiopicCalendar(timeZoneForULocaleOrDefault, uLocale);
                ethiopicCalendar.setAmeteAlemEra(true);
                return ethiopicCalendar;
            case 9:
                return new HebrewCalendar(timeZoneForULocaleOrDefault, uLocale);
            case 10:
                return new IndianCalendar(timeZoneForULocaleOrDefault, uLocale);
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return new IslamicCalendar(timeZoneForULocaleOrDefault, uLocale);
            case 16:
                return new JapaneseCalendar(timeZoneForULocaleOrDefault, uLocale);
            case 17:
                return new PersianCalendar(timeZoneForULocaleOrDefault, uLocale);
            case 18:
                return new TaiwanCalendar(timeZoneForULocaleOrDefault, uLocale);
            default:
                throw new IllegalArgumentException("Unknown calendar type");
        }
    }

    /* JADX INFO: renamed from: com.ibm.icu.util.Calendar$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        public static final /* synthetic */ int[] KWHzl;

        static {
            int[] iArr = new int[CalType.values().length];
            KWHzl = iArr;
            try {
                iArr[CalType.GREGORIAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                KWHzl[CalType.ISO8601.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                KWHzl[CalType.BUDDHIST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                KWHzl[CalType.CHINESE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                KWHzl[CalType.COPTIC.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                KWHzl[CalType.DANGI.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                KWHzl[CalType.ETHIOPIC.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                KWHzl[CalType.ETHIOPIC_AMETE_ALEM.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                KWHzl[CalType.HEBREW.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                KWHzl[CalType.INDIAN.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                KWHzl[CalType.ISLAMIC_CIVIL.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                KWHzl[CalType.ISLAMIC_UMALQURA.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                KWHzl[CalType.ISLAMIC_TBLA.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                KWHzl[CalType.ISLAMIC_RGSA.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                KWHzl[CalType.ISLAMIC.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                KWHzl[CalType.JAPANESE.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                KWHzl[CalType.PERSIAN.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                KWHzl[CalType.ROC.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    public static Locale[] getAvailableLocales() {
        return ICUResourceBundle.copydefault();
    }

    public static ULocale[] getAvailableULocales() {
        return ICUResourceBundle.OLrzqt();
    }

    public static final String[] getKeywordValuesForLocale(String str, ULocale uLocale, boolean z) {
        UResourceBundle uResourceBundleIsConnected;
        String regionForSupplementalData = ULocale.getRegionForSupplementalData(uLocale, true);
        ArrayList arrayList = new ArrayList();
        UResourceBundle uResourceBundleIsConnected2 = UResourceBundle.copydefault("com/ibm/icu/impl/data/icudt68b", "supplementalData", ICUResourceBundle.AEQbTJ).isConnected("calendarPreferenceData");
        try {
            uResourceBundleIsConnected = uResourceBundleIsConnected2.isConnected(regionForSupplementalData);
        } catch (MissingResourceException unused) {
            uResourceBundleIsConnected = uResourceBundleIsConnected2.isConnected("001");
        }
        String[] strArrIsConnected = uResourceBundleIsConnected.isConnected();
        if (z) {
            return strArrIsConnected;
        }
        for (String str2 : strArrIsConnected) {
            arrayList.add(str2);
        }
        for (CalType calType : CalType.values()) {
            if (!arrayList.contains(calType.getId())) {
                arrayList.add(calType.getId());
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public final Date getTime() {
        return new Date(getTimeInMillis());
    }

    public final void setTime(Date date) {
        setTimeInMillis(date.getTime());
    }

    public long getTimeInMillis() {
        if (!this.isTimeSet) {
            updateTime();
        }
        return this.time;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0061 A[LOOP:0: B:17:0x005c->B:19:0x0061, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setTimeInMillis(long j) {
        int i;
        int[] iArr;
        long j2 = MAX_MILLIS;
        if (j <= MAX_MILLIS) {
            j2 = MIN_MILLIS;
            if (j < MIN_MILLIS) {
                if (!isLenient()) {
                    throw new IllegalArgumentException("millis value less than lower bounds for a Calendar : " + j);
                }
            }
            this.time = j;
            this.areAllFieldsSet = false;
            this.areFieldsSet = false;
            this.areFieldsVirtuallySet = true;
            this.isTimeSet = true;
            i = 0;
            while (true) {
                iArr = this.fields;
                if (i < iArr.length) {
                    return;
                }
                this.stamp[i] = 0;
                iArr[i] = 0;
                i++;
            }
        } else if (!isLenient()) {
            throw new IllegalArgumentException("millis value greater than upper bounds for a Calendar : " + j);
        }
        j = j2;
        this.time = j;
        this.areAllFieldsSet = false;
        this.areFieldsSet = false;
        this.areFieldsVirtuallySet = true;
        this.isTimeSet = true;
        i = 0;
        while (true) {
            iArr = this.fields;
            if (i < iArr.length) {
            }
            this.stamp[i] = 0;
            iArr[i] = 0;
            i++;
        }
    }

    public final int get(int i) {
        complete();
        return this.fields[i];
    }

    public final int internalGet(int i) {
        return this.fields[i];
    }

    public final int internalGet(int i, int i2) {
        return this.stamp[i] > 0 ? this.fields[i] : i2;
    }

    public final void set(int i, int i2) {
        if (this.areFieldsVirtuallySet) {
            computeFields();
        }
        this.fields[i] = i2;
        if (this.nextStamp == STAMP_MAX) {
            recalculateStamp();
        }
        int[] iArr = this.stamp;
        int i3 = this.nextStamp;
        this.nextStamp = i3 + 1;
        iArr[i] = i3;
        this.areFieldsVirtuallySet = false;
        this.areFieldsSet = false;
        this.isTimeSet = false;
    }

    public final void set(int i, int i2, int i3) {
        set(1, i);
        set(2, i2);
        set(5, i3);
    }

    public final void set(int i, int i2, int i3, int i4, int i5) {
        set(1, i);
        set(2, i2);
        set(5, i3);
        set(11, i4);
        set(12, i5);
    }

    public final void set(int i, int i2, int i3, int i4, int i5, int i6) {
        set(1, i);
        set(2, i2);
        set(5, i3);
        set(11, i4);
        set(12, i5);
        set(13, i6);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020 A[PHI: r4
  0x0020: PHI (r4v5 int) = (r4v2 int), (r4v7 int) binds: [B:8:0x001d, B:5:0x0010] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int gregoYearFromIslamicStart(int i) {
        int i2;
        int i3 = 1;
        if (i >= 1397) {
            int i4 = i - 1397;
            i2 = (i4 / 67) * 2;
            if (i4 % 67 < 33) {
                i3 = 0;
            }
        } else {
            int i5 = i - 1396;
            i2 = ((i5 / 67) - 1) * 2;
            if ((-i5) % 67 > 33) {
            }
        }
        return (i + 579) - (i2 + i3);
    }

    @Deprecated
    public final int getRelatedYear() {
        int i = get(19);
        CalType calType = CalType.GREGORIAN;
        String type = getType();
        CalType[] calTypeArrValues = CalType.values();
        int length = calTypeArrValues.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            CalType calType2 = calTypeArrValues[i2];
            if (type.equals(calType2.getId())) {
                calType = calType2;
                break;
            }
            i2++;
        }
        switch (AnonymousClass2.KWHzl[calType.ordinal()]) {
            case 4:
                return i - 2637;
            case 5:
                return i + 284;
            case 6:
                return i - 2333;
            case 7:
                return i + 8;
            case 8:
                return i - 5492;
            case 9:
                return i - 3760;
            case 10:
                return i + 79;
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return gregoYearFromIslamicStart(i);
            case 16:
            default:
                return i;
            case 17:
                return i + 622;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020 A[PHI: r4
  0x0020: PHI (r4v5 int) = (r4v2 int), (r4v7 int) binds: [B:8:0x001d, B:5:0x0010] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int firstIslamicStartYearFromGrego(int i) {
        int i2;
        int i3 = 1;
        if (i >= 1977) {
            int i4 = i - 1977;
            i2 = (i4 / 65) * 2;
            if (i4 % 65 < 32) {
                i3 = 0;
            }
        } else {
            int i5 = i - 1976;
            i2 = ((i5 / 65) - 1) * 2;
            if ((-i5) % 65 > 32) {
            }
        }
        return (i - 579) + i2 + i3;
    }

    @Deprecated
    public final void setRelatedYear(int i) {
        CalType calType = CalType.GREGORIAN;
        String type = getType();
        CalType[] calTypeArrValues = CalType.values();
        int length = calTypeArrValues.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            CalType calType2 = calTypeArrValues[i2];
            if (type.equals(calType2.getId())) {
                calType = calType2;
                break;
            }
            i2++;
        }
        switch (AnonymousClass2.KWHzl[calType.ordinal()]) {
            case 4:
                i += 2637;
                break;
            case 5:
                i -= 284;
                break;
            case 6:
                i += 2333;
                break;
            case 7:
                i -= 8;
                break;
            case 8:
                i += 5492;
                break;
            case 9:
                i += 3760;
                break;
            case 10:
                i -= 79;
                break;
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                i = firstIslamicStartYearFromGrego(i);
                break;
            case 17:
                i -= 622;
                break;
        }
        set(19, i);
    }

    public final void clear() {
        int i = 0;
        while (true) {
            int[] iArr = this.fields;
            if (i >= iArr.length) {
                this.areFieldsVirtuallySet = false;
                this.areAllFieldsSet = false;
                this.areFieldsSet = false;
                this.isTimeSet = false;
                return;
            }
            this.stamp[i] = 0;
            iArr[i] = 0;
            i++;
        }
    }

    public final void clear(int i) {
        if (this.areFieldsVirtuallySet) {
            computeFields();
        }
        this.fields[i] = 0;
        this.stamp[i] = 0;
        this.areFieldsVirtuallySet = false;
        this.areAllFieldsSet = false;
        this.areFieldsSet = false;
        this.isTimeSet = false;
    }

    public final boolean isSet(int i) {
        return this.areFieldsVirtuallySet || this.stamp[i] != 0;
    }

    public void complete() {
        if (!this.isTimeSet) {
            updateTime();
        }
        if (this.areFieldsSet) {
            return;
        }
        computeFields();
        this.areFieldsSet = true;
        this.areAllFieldsSet = true;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Calendar calendar = (Calendar) obj;
        return isEquivalentTo(calendar) && getTimeInMillis() == calendar.getTime().getTime();
    }

    public boolean isEquivalentTo(Calendar calendar) {
        return getClass() == calendar.getClass() && isLenient() == calendar.isLenient() && getFirstDayOfWeek() == calendar.getFirstDayOfWeek() && getMinimalDaysInFirstWeek() == calendar.getMinimalDaysInFirstWeek() && getTimeZone().equals(calendar.getTimeZone()) && getRepeatedWallTimeOption() == calendar.getRepeatedWallTimeOption() && getSkippedWallTimeOption() == calendar.getSkippedWallTimeOption();
    }

    public int hashCode() {
        boolean z = this.lenient;
        int i = this.firstDayOfWeek;
        int i2 = this.minimalDaysInFirstWeek;
        int i3 = this.repeatedWallTime;
        int i4 = this.skippedWallTime;
        TimeZone timeZone = this.zone;
        return (z ? 1 : 0) | (i << 1) | (i2 << 4) | (i3 << 7) | (i4 << 9) | (timeZone.hashCode() << 11);
    }

    private long compare(Object obj) {
        long time;
        if (obj instanceof Calendar) {
            time = ((Calendar) obj).getTimeInMillis();
        } else if (obj instanceof Date) {
            time = ((Date) obj).getTime();
        } else {
            throw new IllegalArgumentException(obj + "is not a Calendar or Date");
        }
        return getTimeInMillis() - time;
    }

    public boolean before(Object obj) {
        return compare(obj) < 0;
    }

    public boolean after(Object obj) {
        return compare(obj) > 0;
    }

    public int getActualMaximum(int i) {
        if (i != 0 && i != 18) {
            if (i == 5) {
                Calendar calendar = (Calendar) clone();
                calendar.setLenient(true);
                calendar.prepareGetActual(i, false);
                return handleGetMonthLength(calendar.get(19), calendar.get(2));
            }
            if (i == 6) {
                Calendar calendar2 = (Calendar) clone();
                calendar2.setLenient(true);
                calendar2.prepareGetActual(i, false);
                return handleGetYearLength(calendar2.get(19));
            }
            if (i != 7 && i != 20 && i != 21) {
                switch (i) {
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                        break;
                    default:
                        return getActualHelper(i, getLeastMaximum(i), getMaximum(i));
                }
            }
        }
        return getMaximum(i);
    }

    public int getActualMinimum(int i) {
        switch (i) {
            case 7:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 20:
            case 21:
                return getMinimum(i);
            case 8:
            case 17:
            case 19:
            default:
                return getActualHelper(i, getGreatestMinimum(i), getMinimum(i));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void prepareGetActual(int i, boolean z) {
        set(21, 0);
        if (i == 1) {
            set(6, getGreatestMinimum(6));
        } else if (i == 2) {
            set(5, getGreatestMinimum(5));
        } else if (i == 3 || i == 4) {
            int i2 = this.firstDayOfWeek;
            if (z && (i2 = (i2 + 6) % 7) < 1) {
                i2 += 7;
            }
            set(7, i2);
        } else if (i == 8) {
            set(5, 1);
            set(7, get(7));
        } else if (i == 17) {
            set(3, getGreatestMinimum(3));
        } else if (i == 19) {
        }
        set(i, getGreatestMinimum(i));
    }

    private int getActualHelper(int i, int i2, int i3) {
        int i4;
        if (i2 == i3) {
            return i2;
        }
        int i5 = i3 > i2 ? 1 : -1;
        Calendar calendar = (Calendar) clone();
        calendar.complete();
        calendar.setLenient(true);
        calendar.prepareGetActual(i, i5 < 0);
        calendar.set(i, i2);
        if (calendar.get(i) != i2 && i != 4 && i5 > 0) {
            return i2;
        }
        do {
            i4 = i2 + i5;
            calendar.add(i, i5);
            if (calendar.get(i) != i4) {
                break;
            }
            i2 = i4;
        } while (i4 != i3);
        return i2;
    }

    public final void roll(int i, boolean z) {
        roll(i, z ? 1 : -1);
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x01ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void roll(int i, int i2) {
        if (i2 == 0) {
            return;
        }
        complete();
        switch (i) {
            case 0:
            case 5:
            case 9:
            case 12:
            case 13:
            case 14:
            case 21:
                int actualMinimum = getActualMinimum(i);
                int actualMaximum = (getActualMaximum(i) - actualMinimum) + 1;
                int iInternalGet = ((internalGet(i) + i2) - actualMinimum) % actualMaximum;
                if (iInternalGet < 0) {
                    iInternalGet += actualMaximum;
                }
                set(i, iInternalGet + actualMinimum);
                return;
            case 1:
            case 17:
                boolean z = false;
                int i3 = get(0);
                if (i3 == 0) {
                    String type = getType();
                    if (type.equals("gregorian") || type.equals("roc") || type.equals("coptic")) {
                        i2 = -i2;
                        z = true;
                    }
                }
                int iInternalGet2 = internalGet(i) + i2;
                if (i3 > 0 || iInternalGet2 >= 1) {
                    int actualMaximum2 = getActualMaximum(i);
                    if (actualMaximum2 < 32768) {
                        if (iInternalGet2 < 1) {
                            i = actualMaximum2 - ((-iInternalGet2) % actualMaximum2);
                        } else {
                            i = iInternalGet2 > actualMaximum2 ? 1 + ((iInternalGet2 - 1) % actualMaximum2) : iInternalGet2;
                        }
                    } else if (iInternalGet2 >= 1) {
                    }
                } else if (!z) {
                }
                set(i, i);
                pinField(2);
                pinField(5);
                return;
            case 2:
                int actualMaximum3 = getActualMaximum(2) + 1;
                int iInternalGet3 = (internalGet(2) + i2) % actualMaximum3;
                if (iInternalGet3 < 0) {
                    iInternalGet3 += actualMaximum3;
                }
                set(2, iInternalGet3);
                pinField(5);
                return;
            case 3:
                int iInternalGet4 = internalGet(7) - getFirstDayOfWeek();
                if (iInternalGet4 < 0) {
                    iInternalGet4 += 7;
                }
                int iInternalGet5 = ((iInternalGet4 - internalGet(6)) + 1) % 7;
                if (iInternalGet5 < 0) {
                    iInternalGet5 += 7;
                }
                int i4 = 7 - iInternalGet5 < getMinimalDaysInFirstWeek() ? 8 - iInternalGet5 : 1 - iInternalGet5;
                int actualMaximum4 = getActualMaximum(6);
                int iInternalGet6 = ((actualMaximum4 + 7) - (((actualMaximum4 - internalGet(6)) + iInternalGet4) % 7)) - i4;
                int iInternalGet7 = ((internalGet(6) + (i2 * 7)) - i4) % iInternalGet6;
                if (iInternalGet7 < 0) {
                    iInternalGet7 += iInternalGet6;
                }
                int i5 = iInternalGet7 + i4;
                i = i5 >= 1 ? i5 : 1;
                if (i <= actualMaximum4) {
                    actualMaximum4 = i;
                }
                set(6, actualMaximum4);
                clear(2);
                return;
            case 4:
                int iInternalGet8 = internalGet(7) - getFirstDayOfWeek();
                if (iInternalGet8 < 0) {
                    iInternalGet8 += 7;
                }
                int iInternalGet9 = ((iInternalGet8 - internalGet(5)) + 1) % 7;
                if (iInternalGet9 < 0) {
                    iInternalGet9 += 7;
                }
                int i6 = 7 - iInternalGet9 < getMinimalDaysInFirstWeek() ? 8 - iInternalGet9 : 1 - iInternalGet9;
                int actualMaximum5 = getActualMaximum(5);
                int iInternalGet10 = ((actualMaximum5 + 7) - (((actualMaximum5 - internalGet(5)) + iInternalGet8) % 7)) - i6;
                int iInternalGet11 = ((internalGet(5) + (i2 * 7)) - i6) % iInternalGet10;
                if (iInternalGet11 < 0) {
                    iInternalGet11 += iInternalGet10;
                }
                int i7 = iInternalGet11 + i6;
                i = i7 >= 1 ? i7 : 1;
                if (i <= actualMaximum5) {
                    actualMaximum5 = i;
                }
                set(5, actualMaximum5);
                return;
            case 6:
                long jInternalGet = this.time - (((long) (internalGet(6) - 1)) * 86400000);
                long actualMaximum6 = ((long) getActualMaximum(6)) * 86400000;
                long j = ((this.time + (((long) i2) * 86400000)) - jInternalGet) % actualMaximum6;
                this.time = j;
                if (j < 0) {
                    this.time = j + actualMaximum6;
                }
                setTimeInMillis(this.time + jInternalGet);
                return;
            case 7:
            case 18:
                long j2 = i2;
                int iInternalGet12 = internalGet(i) - (i == 7 ? getFirstDayOfWeek() : 1);
                if (iInternalGet12 < 0) {
                    iInternalGet12 += 7;
                }
                long j3 = this.time;
                long j4 = j3 - (((long) iInternalGet12) * 86400000);
                long j5 = ((j3 + (j2 * 86400000)) - j4) % ONE_WEEK;
                this.time = j5;
                if (j5 < 0) {
                    this.time = j5 + ONE_WEEK;
                }
                setTimeInMillis(this.time + j4);
                return;
            case 8:
                int iInternalGet13 = (internalGet(5) - 1) / 7;
                int actualMaximum7 = (getActualMaximum(5) - internalGet(5)) / 7;
                long j6 = this.time;
                long j7 = j6 - (((long) iInternalGet13) * ONE_WEEK);
                long j8 = ((long) (iInternalGet13 + actualMaximum7 + 1)) * ONE_WEEK;
                long j9 = ((j6 + (((long) i2) * ONE_WEEK)) - j7) % j8;
                this.time = j9;
                if (j9 < 0) {
                    this.time = j9 + j8;
                }
                setTimeInMillis(this.time + j7);
                return;
            case 10:
            case 11:
                long timeInMillis = getTimeInMillis();
                int iInternalGet14 = internalGet(i);
                int maximum = getMaximum(i) + 1;
                int i8 = (i2 + iInternalGet14) % maximum;
                if (i8 < 0) {
                    i8 += maximum;
                }
                setTimeInMillis(timeInMillis + ((((long) i8) - ((long) iInternalGet14)) * 3600000));
                return;
            case 15:
            case 16:
            default:
                throw new IllegalArgumentException("Calendar.roll(" + fieldName(i) + ") not supported");
            case 19:
                set(i, internalGet(i) + i2);
                pinField(2);
                pinField(5);
                return;
            case 20:
                set(i, internalGet(i) + i2);
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void add(int i, int i2) {
        long j;
        boolean z;
        int i3;
        int i4;
        long j2;
        if (i2 == 0) {
            return;
        }
        long j3 = i2;
        int i5 = 0;
        switch (i) {
            case 0:
                set(i, get(i) + i2);
                pinField(0);
                return;
            case 1:
            case 17:
                if (get(0) == 0) {
                    String type = getType();
                    if (type.equals("gregorian") || type.equals("roc") || type.equals("coptic")) {
                        i2 = -i2;
                    }
                    break;
                }
            case 2:
            case 19:
                boolean zIsLenient = isLenient();
                setLenient(true);
                set(i, get(i) + i2);
                pinField(5);
                if (zIsLenient) {
                    return;
                }
                complete();
                setLenient(zIsLenient);
                return;
            case 3:
            case 4:
            case 8:
                j = ONE_WEEK;
                j3 *= j;
                z = true;
                if (z) {
                    i3 = get(16) + get(15);
                    i5 = get(21);
                } else {
                    i3 = 0;
                }
                setTimeInMillis(getTimeInMillis() + j3);
                if (!z || (i4 = get(21)) == i5) {
                    return;
                }
                long jInternalGetTimeInMillis = internalGetTimeInMillis();
                int i6 = get(16) + get(15);
                if (i6 != i3) {
                    long j4 = ((long) (i3 - i6)) % 86400000;
                    if (j4 != 0) {
                        setTimeInMillis(j4 + jInternalGetTimeInMillis);
                        i4 = get(21);
                    }
                    if (i4 != i5) {
                        int i7 = this.skippedWallTime;
                        if (i7 == 0) {
                            if (j4 < 0) {
                                setTimeInMillis(jInternalGetTimeInMillis);
                                return;
                            }
                            return;
                        }
                        if (i7 == 1) {
                            if (j4 > 0) {
                                setTimeInMillis(jInternalGetTimeInMillis);
                                return;
                            }
                            return;
                        } else {
                            if (i7 != 2) {
                                return;
                            }
                            if (j4 > 0) {
                                jInternalGetTimeInMillis = internalGetTimeInMillis();
                            }
                            Long immediatePreviousZoneTransition = getImmediatePreviousZoneTransition(jInternalGetTimeInMillis);
                            if (immediatePreviousZoneTransition != null) {
                                setTimeInMillis(immediatePreviousZoneTransition.longValue());
                                return;
                            }
                            throw new RuntimeException("Could not locate a time zone transition before " + jInternalGetTimeInMillis);
                        }
                    }
                    return;
                }
                return;
            case 5:
            case 6:
            case 7:
            case 18:
            case 20:
                j3 *= 86400000;
                z = true;
                if (z) {
                }
                setTimeInMillis(getTimeInMillis() + j3);
                if (z) {
                    return;
                } else {
                    return;
                }
            case 9:
                j = 43200000;
                j3 *= j;
                z = true;
                if (z) {
                }
                setTimeInMillis(getTimeInMillis() + j3);
                if (z) {
                }
                break;
            case 10:
            case 11:
                j2 = 3600000;
                j3 *= j2;
                z = false;
                if (z) {
                }
                setTimeInMillis(getTimeInMillis() + j3);
                if (z) {
                }
                break;
            case 12:
                j2 = 60000;
                j3 *= j2;
                z = false;
                if (z) {
                }
                setTimeInMillis(getTimeInMillis() + j3);
                if (z) {
                }
                break;
            case 13:
                j2 = 1000;
                j3 *= j2;
                z = false;
                if (z) {
                }
                setTimeInMillis(getTimeInMillis() + j3);
                if (z) {
                }
                break;
            case 14:
            case 21:
                z = false;
                if (z) {
                }
                setTimeInMillis(getTimeInMillis() + j3);
                if (z) {
                }
                break;
            case 15:
            case 16:
            default:
                throw new IllegalArgumentException("Calendar.add(" + fieldName(i) + ") not supported");
        }
    }

    public String getDisplayName(Locale locale) {
        return getClass().getName();
    }

    public String getDisplayName(ULocale uLocale) {
        return getClass().getName();
    }

    /* JADX DEBUG: Method merged with bridge method: compareTo(Ljava/lang/Object;)I */
    @Override // java.lang.Comparable
    public int compareTo(Calendar calendar) {
        long timeInMillis = getTimeInMillis() - calendar.getTimeInMillis();
        if (timeInMillis < 0) {
            return -1;
        }
        return timeInMillis > 0 ? 1 : 0;
    }

    public DateFormat getDateTimeFormat(int i, int i2, Locale locale) {
        return formatHelper(this, ULocale.forLocale(locale), i, i2);
    }

    public DateFormat getDateTimeFormat(int i, int i2, ULocale uLocale) {
        return formatHelper(this, uLocale, i, i2);
    }

    public DateFormat handleGetDateFormat(String str, Locale locale) {
        return handleGetDateFormat(str, (String) null, ULocale.forLocale(locale));
    }

    public DateFormat handleGetDateFormat(String str, String str2, Locale locale) {
        return handleGetDateFormat(str, str2, ULocale.forLocale(locale));
    }

    public DateFormat handleGetDateFormat(String str, ULocale uLocale) {
        return handleGetDateFormat(str, (String) null, uLocale);
    }

    public DateFormat handleGetDateFormat(String str, String str2, ULocale uLocale) {
        Application application = new Application(null);
        application.KWHzl = str;
        application.AEQbTJ = str2;
        application.copydefault = new DateFormatSymbols(this, uLocale);
        application.OLrzqt = uLocale;
        application.EZpvd = this;
        return SimpleDateFormat.getInstance(application);
    }

    private static DateFormat formatHelper(Calendar calendar, ULocale uLocale, int i, int i2) {
        String strOLrzqt;
        if (i2 < -1 || i2 > 3) {
            throw new IllegalArgumentException("Illegal time style " + i2);
        }
        if (i < -1 || i > 3) {
            throw new IllegalArgumentException("Illegal date style " + i);
        }
        ActionBar actionBarKWHzl = ActionBar.KWHzl(calendar, uLocale);
        String strMergeOverrideStrings = null;
        if (i2 >= 0 && i >= 0) {
            String strOLrzqt2 = actionBarKWHzl.OLrzqt(i);
            int i3 = i + 4;
            strOLrzqt = C7028acB.OLrzqt(strOLrzqt2, 2, 2, actionBarKWHzl.EZpvd[i2], actionBarKWHzl.EZpvd[i3]);
            if (actionBarKWHzl.AEQbTJ != null) {
                strMergeOverrideStrings = mergeOverrideStrings(actionBarKWHzl.EZpvd[i3], actionBarKWHzl.EZpvd[i2], actionBarKWHzl.AEQbTJ[i3], actionBarKWHzl.AEQbTJ[i2]);
            }
        } else if (i2 >= 0) {
            strOLrzqt = actionBarKWHzl.EZpvd[i2];
            if (actionBarKWHzl.AEQbTJ != null) {
                strMergeOverrideStrings = actionBarKWHzl.AEQbTJ[i2];
            }
        } else {
            if (i < 0) {
                throw new IllegalArgumentException("No date or time style specified");
            }
            int i4 = i + 4;
            strOLrzqt = actionBarKWHzl.EZpvd[i4];
            if (actionBarKWHzl.AEQbTJ != null) {
                strMergeOverrideStrings = actionBarKWHzl.AEQbTJ[i4];
            }
        }
        DateFormat dateFormatHandleGetDateFormat = calendar.handleGetDateFormat(strOLrzqt, strMergeOverrideStrings, uLocale);
        dateFormatHandleGetDateFormat.setCalendar(calendar);
        return dateFormatHandleGetDateFormat;
    }

    public static class ActionBar {
        public String[] AEQbTJ;
        public String[] EZpvd;

        public ActionBar(String[] strArr, String[] strArr2) {
            this.EZpvd = strArr;
            this.AEQbTJ = strArr2;
        }

        public final String OLrzqt(int i) {
            String[] strArr = this.EZpvd;
            return strArr[strArr.length >= 13 ? i + 9 : 8];
        }

        public static ActionBar KWHzl(Calendar calendar, ULocale uLocale) {
            ActionBar actionBar;
            String type = calendar.getType();
            String str = uLocale.getBaseName() + Marker.ANY_NON_NULL_MARKER + type;
            ActionBar actionBar2 = (ActionBar) Calendar.PATTERN_CACHE.EZpvd(str);
            if (actionBar2 == null) {
                try {
                    actionBar = Calendar.getPatternData(uLocale, type);
                } catch (MissingResourceException unused) {
                    actionBar = new ActionBar(Calendar.DEFAULT_PATTERNS, null);
                }
                actionBar2 = actionBar;
                Calendar.PATTERN_CACHE.KWHzl(str, actionBar2);
            }
            return actionBar2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ActionBar getPatternData(ULocale uLocale, String str) {
        int i;
        ULocale uLocale2;
        ULocale uLocaleAddLikelySubtags;
        ICUResourceBundle iCUResourceBundle = (ICUResourceBundle) UResourceBundle.KWHzl("com/ibm/icu/impl/data/icudt68b", uLocale);
        ICUResourceBundle iCUResourceBundleGEmmrt = iCUResourceBundle.gEmmrt("calendar/" + str + "/DateTimePatterns");
        if (iCUResourceBundleGEmmrt == null) {
            iCUResourceBundleGEmmrt = iCUResourceBundle.valueOf("calendar/gregorian/DateTimePatterns");
        }
        int iFARcdN = iCUResourceBundleGEmmrt.fARcdN();
        String[] strArr = new String[iFARcdN];
        String[] strArr2 = new String[iFARcdN];
        String baseName = uLocale.getBaseName();
        if (baseName.length() <= 0 || baseName.equals(C.LANGUAGE_UNDETERMINED) || (uLocaleAddLikelySubtags = ULocale.addLikelySubtags(iCUResourceBundleGEmmrt.fetchVPNInfo())) == (uLocale2 = new ULocale(baseName))) {
            i = 0;
        } else {
            String country = uLocale2.getCountry();
            if ((country.length() > 0 && !country.equals(uLocaleAddLikelySubtags.getCountry())) || !uLocale2.getLanguage().equals(uLocaleAddLikelySubtags.getLanguage())) {
                DateTimePatternGenerator dateTimePatternGeneratorAEQbTJ = DateTimePatternGenerator.AEQbTJ(uLocale);
                i = 0;
                while (i < 4) {
                    strArr[i] = dateTimePatternGeneratorAEQbTJ.EZpvd(TIME_SKELETONS[i]);
                    i++;
                }
            }
        }
        while (i < iFARcdN) {
            ICUResourceBundle iCUResourceBundle2 = (ICUResourceBundle) iCUResourceBundleGEmmrt.KWHzl(i);
            int iAuCTel = iCUResourceBundle2.AuCTel();
            if (iAuCTel == 0) {
                strArr[i] = iCUResourceBundle2.getFieldNames();
            } else if (iAuCTel == 8) {
                strArr[i] = iCUResourceBundle2.copydefault(0);
                strArr2[i] = iCUResourceBundle2.copydefault(1);
            }
            i++;
        }
        return new ActionBar(strArr, strArr2);
    }

    @Deprecated
    public static String getDateTimePattern(Calendar calendar, ULocale uLocale, int i) {
        return ActionBar.KWHzl(calendar, uLocale).OLrzqt(i);
    }

    private static String mergeOverrideStrings(String str, String str2, String str3, String str4) {
        if (str3 == null && str4 == null) {
            return null;
        }
        if (str3 == null) {
            return expandOverride(str2, str4);
        }
        if (str4 == null) {
            return expandOverride(str, str3);
        }
        if (str3.equals(str4)) {
            return str3;
        }
        return expandOverride(str, str3) + ";" + expandOverride(str2, str4);
    }

    private static String expandOverride(String str, String str2) {
        if (str2.indexOf(61) >= 0) {
            return str2;
        }
        StringBuilder sb = new StringBuilder();
        StringCharacterIterator stringCharacterIterator = new StringCharacterIterator(str);
        boolean z = false;
        char c = ' ';
        for (char cFirst = stringCharacterIterator.first(); cFirst != 65535; cFirst = stringCharacterIterator.next()) {
            if (cFirst == '\'') {
                z = !z;
            } else if (!z && cFirst != c) {
                if (sb.length() > 0) {
                    sb.append(";");
                }
                sb.append(cFirst);
                sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
                sb.append(str2);
            }
            c = cFirst;
        }
        return sb.toString();
    }

    @Deprecated
    public static class Application {
        public String AEQbTJ;
        public Calendar EZpvd;
        public String KWHzl;
        public ULocale OLrzqt;
        public DateFormatSymbols copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Deprecated
        public Calendar AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Deprecated
        public DateFormatSymbols EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Deprecated
        public ULocale KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Deprecated
        public String OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Deprecated
        public String copydefault() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:3746) call: com.ibm.icu.util.Calendar.Application.<init>():void type: THIS */
        public /* synthetic */ Application(AnonymousClass2 anonymousClass2) {
            this();
        }

        private Application() {
        }
    }

    public void pinField(int i) {
        int actualMaximum = getActualMaximum(i);
        int actualMinimum = getActualMinimum(i);
        int i2 = this.fields[i];
        if (i2 > actualMaximum) {
            set(i, actualMaximum);
        } else if (i2 < actualMinimum) {
            set(i, actualMinimum);
        }
    }

    public int weekNumber(int i, int i2, int i3) {
        int firstDayOfWeek = (((i3 - getFirstDayOfWeek()) - i2) + 1) % 7;
        if (firstDayOfWeek < 0) {
            firstDayOfWeek += 7;
        }
        int i4 = ((i + firstDayOfWeek) - 1) / 7;
        return 7 - firstDayOfWeek >= getMinimalDaysInFirstWeek() ? i4 + 1 : i4;
    }

    public final int weekNumber(int i, int i2) {
        return weekNumber(i, i, i2);
    }

    public int fieldDifference(Date date, int i) {
        long timeInMillis = getTimeInMillis();
        long time = date.getTime();
        int i2 = 0;
        if (timeInMillis < time) {
            int i3 = 0;
            int i4 = 1;
            while (true) {
                setTimeInMillis(timeInMillis);
                add(i, i4);
                long timeInMillis2 = getTimeInMillis();
                if (timeInMillis2 == time) {
                    return i4;
                }
                if (timeInMillis2 > time) {
                    while (true) {
                        int i5 = i4 - i3;
                        if (i5 <= 1) {
                            i2 = i3;
                            break;
                        }
                        int i6 = (i5 / 2) + i3;
                        setTimeInMillis(timeInMillis);
                        add(i, i6);
                        long timeInMillis3 = getTimeInMillis();
                        if (timeInMillis3 == time) {
                            return i6;
                        }
                        if (timeInMillis3 > time) {
                            i4 = i6;
                        } else {
                            i3 = i6;
                        }
                    }
                } else {
                    int i7 = Integer.MAX_VALUE;
                    if (i4 >= Integer.MAX_VALUE) {
                        throw new RuntimeException();
                    }
                    int i8 = i4 << 1;
                    if (i8 >= 0) {
                        i7 = i8;
                    }
                    int i9 = i4;
                    i4 = i7;
                    i3 = i9;
                }
            }
        } else if (timeInMillis > time) {
            int i10 = -1;
            do {
                int i11 = i2;
                i2 = i10;
                setTimeInMillis(timeInMillis);
                add(i, i2);
                long timeInMillis4 = getTimeInMillis();
                if (timeInMillis4 == time) {
                    return i2;
                }
                if (timeInMillis4 < time) {
                    i2 = i11;
                    int i12 = i2;
                    while (i2 - i12 > 1) {
                        int i13 = ((i12 - i2) / 2) + i2;
                        setTimeInMillis(timeInMillis);
                        add(i, i13);
                        long timeInMillis5 = getTimeInMillis();
                        if (timeInMillis5 == time) {
                            return i13;
                        }
                        if (timeInMillis5 < time) {
                            i12 = i13;
                        } else {
                            i2 = i13;
                        }
                    }
                } else {
                    i10 = i2 << 1;
                }
            } while (i10 != 0);
            throw new RuntimeException();
        }
        setTimeInMillis(timeInMillis);
        add(i, i2);
        return i2;
    }

    public void setRepeatedWallTimeOption(int i) {
        if (i == 0 || i == 1) {
            this.repeatedWallTime = i;
            return;
        }
        throw new IllegalArgumentException("Illegal repeated wall time option - " + i);
    }

    public void setSkippedWallTimeOption(int i) {
        if (i == 0 || i == 1 || i == 2) {
            this.skippedWallTime = i;
            return;
        }
        throw new IllegalArgumentException("Illegal skipped wall time option - " + i);
    }

    public void setFirstDayOfWeek(int i) {
        if (this.firstDayOfWeek != i) {
            if (i < 1 || i > 7) {
                throw new IllegalArgumentException("Invalid day of week");
            }
            this.firstDayOfWeek = i;
            this.areFieldsSet = false;
        }
    }

    public int getLimit(int i, int i2) {
        switch (i) {
            case 4:
                if (i2 == 0) {
                    return getMinimalDaysInFirstWeek() == 1 ? 1 : 0;
                }
                if (i2 == 1) {
                    return 1;
                }
                int minimalDaysInFirstWeek = getMinimalDaysInFirstWeek();
                int iHandleGetLimit = handleGetLimit(5, i2);
                if (i2 == 2) {
                    return (iHandleGetLimit + (7 - minimalDaysInFirstWeek)) / 7;
                }
                return ((iHandleGetLimit + 6) + (7 - minimalDaysInFirstWeek)) / 7;
            case 5:
            case 6:
            case 8:
            case 17:
            case 19:
            default:
                return handleGetLimit(i, i2);
            case 7:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 20:
            case 21:
            case 22:
                return LIMITS[i][i2];
        }
    }

    public final int getMinimum(int i) {
        return getLimit(i, 0);
    }

    public final int getMaximum(int i) {
        return getLimit(i, 3);
    }

    public final int getGreatestMinimum(int i) {
        return getLimit(i, 1);
    }

    public final int getLeastMaximum(int i) {
        return getLimit(i, 2);
    }

    @Deprecated
    public int getDayOfWeekType(int i) {
        if (i < 1 || i > 7) {
            throw new IllegalArgumentException("Invalid day of week");
        }
        int i2 = this.weekendOnset;
        int i3 = this.weekendCease;
        if (i2 == i3) {
            if (i != i2) {
                return 0;
            }
            return this.weekendOnsetMillis == 0 ? 1 : 2;
        }
        if (i2 < i3) {
            if (i < i2 || i > i3) {
                return 0;
            }
        } else if (i > i3 && i < i2) {
            return 0;
        }
        return i == i2 ? this.weekendOnsetMillis == 0 ? 1 : 2 : (i != i3 || this.weekendCeaseMillis >= 86400000) ? 1 : 3;
    }

    @Deprecated
    public int getWeekendTransition(int i) {
        if (i == this.weekendOnset) {
            return this.weekendOnsetMillis;
        }
        if (i == this.weekendCease) {
            return this.weekendCeaseMillis;
        }
        throw new IllegalArgumentException("Not weekend transition day");
    }

    public boolean isWeekend(Date date) {
        setTime(date);
        return isWeekend();
    }

    public boolean isWeekend() {
        int i = get(7);
        int dayOfWeekType = getDayOfWeekType(i);
        if (dayOfWeekType == 0) {
            return false;
        }
        if (dayOfWeekType == 1) {
            return true;
        }
        int iInternalGet = internalGet(14) + ((internalGet(13) + ((internalGet(12) + (internalGet(11) * 60)) * 60)) * 1000);
        int weekendTransition = getWeekendTransition(i);
        if (dayOfWeekType == 2) {
            if (iInternalGet < weekendTransition) {
                return false;
            }
        } else if (iInternalGet >= weekendTransition) {
            return false;
        }
        return true;
    }

    public Object clone() {
        try {
            Calendar calendar = (Calendar) super.clone();
            int[] iArr = new int[this.fields.length];
            calendar.fields = iArr;
            int[] iArr2 = this.fields;
            calendar.stamp = new int[iArr2.length];
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            System.arraycopy(this.stamp, 0, calendar.stamp, 0, this.fields.length);
            calendar.zone = (TimeZone) this.zone.clone();
            return calendar;
        } catch (CloneNotSupportedException e) {
            throw new ICUCloneNotSupportedException(e);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName());
        sb.append("[time=");
        sb.append(this.isTimeSet ? String.valueOf(this.time) : "?");
        sb.append(",areFieldsSet=");
        sb.append(this.areFieldsSet);
        sb.append(",areAllFieldsSet=");
        sb.append(this.areAllFieldsSet);
        sb.append(",lenient=");
        sb.append(this.lenient);
        sb.append(",zone=");
        sb.append(this.zone);
        sb.append(",firstDayOfWeek=");
        sb.append(this.firstDayOfWeek);
        sb.append(",minimalDaysInFirstWeek=");
        sb.append(this.minimalDaysInFirstWeek);
        sb.append(",repeatedWallTime=");
        sb.append(this.repeatedWallTime);
        sb.append(",skippedWallTime=");
        sb.append(this.skippedWallTime);
        for (int i = 0; i < this.fields.length; i++) {
            sb.append(AbstractJsonLexerKt.COMMA);
            sb.append(fieldName(i));
            sb.append('=');
            sb.append(isSet(i) ? String.valueOf(this.fields[i]) : "?");
        }
        sb.append(AbstractJsonLexerKt.END_LIST);
        return sb.toString();
    }

    public static final class TaskDescription {
        public final int AEQbTJ;
        public final int AYXKKw;
        public final int EZpvd;
        public final int KWHzl;
        public final int OLrzqt;
        public final int copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((((this.OLrzqt * 37) + this.EZpvd) * 37) + this.KWHzl) * 37) + this.AYXKKw) * 37) + this.AEQbTJ) * 37) + this.copydefault;
        }

        public TaskDescription(int i, int i2, int i3, int i4, int i5, int i6) {
            this.OLrzqt = i;
            this.EZpvd = i2;
            this.KWHzl = i3;
            this.AYXKKw = i4;
            this.AEQbTJ = i5;
            this.copydefault = i6;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TaskDescription)) {
                return false;
            }
            TaskDescription taskDescription = (TaskDescription) obj;
            return this.OLrzqt == taskDescription.OLrzqt && this.EZpvd == taskDescription.EZpvd && this.KWHzl == taskDescription.KWHzl && this.AYXKKw == taskDescription.AYXKKw && this.AEQbTJ == taskDescription.AEQbTJ && this.copydefault == taskDescription.copydefault;
        }

        public String toString() {
            return "{" + this.OLrzqt + ", " + this.EZpvd + ", " + this.KWHzl + ", " + this.AYXKKw + ", " + this.AEQbTJ + ", " + this.copydefault + "}";
        }
    }

    public static TaskDescription getWeekDataForRegion(String str) {
        return WEEK_DATA_CACHE.copydefault(str, str);
    }

    public TaskDescription getWeekData() {
        return new TaskDescription(this.firstDayOfWeek, this.minimalDaysInFirstWeek, this.weekendOnset, this.weekendOnsetMillis, this.weekendCease, this.weekendCeaseMillis);
    }

    public Calendar setWeekData(TaskDescription taskDescription) {
        setFirstDayOfWeek(taskDescription.OLrzqt);
        setMinimalDaysInFirstWeek(taskDescription.EZpvd);
        this.weekendOnset = taskDescription.KWHzl;
        this.weekendOnsetMillis = taskDescription.AYXKKw;
        this.weekendCease = taskDescription.AEQbTJ;
        this.weekendCeaseMillis = taskDescription.copydefault;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static TaskDescription getWeekDataForRegionInternal(String str) {
        UResourceBundle uResourceBundleIsConnected;
        if (str == null) {
            str = "001";
        }
        UResourceBundle uResourceBundleIsConnected2 = UResourceBundle.copydefault("com/ibm/icu/impl/data/icudt68b", "supplementalData", ICUResourceBundle.AEQbTJ).isConnected("weekData");
        try {
            uResourceBundleIsConnected = uResourceBundleIsConnected2.isConnected(str);
        } catch (MissingResourceException e) {
            if (!str.equals("001")) {
                uResourceBundleIsConnected = uResourceBundleIsConnected2.isConnected("001");
            } else {
                throw e;
            }
        }
        int[] iArrUzCIH = uResourceBundleIsConnected.uzCIH();
        return new TaskDescription(iArrUzCIH[0], iArrUzCIH[1], iArrUzCIH[2], iArrUzCIH[3], iArrUzCIH[4], iArrUzCIH[5]);
    }

    public static class StateListAnimator extends AbstractC7078acz<String, TaskDescription, String> {
        private StateListAnimator() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:4894) call: com.ibm.icu.util.Calendar.StateListAnimator.<init>():void type: THIS */
        public /* synthetic */ StateListAnimator(AnonymousClass2 anonymousClass2) {
            this();
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // o.AbstractC7013abN
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public TaskDescription copydefault(String str, String str2) {
            return Calendar.getWeekDataForRegionInternal(str);
        }
    }

    private void setWeekData(String str) {
        if (str == null) {
            str = "001";
        }
        setWeekData(WEEK_DATA_CACHE.AEQbTJ(str, str));
    }

    private void updateTime() {
        computeTime();
        if (isLenient() || !this.areAllFieldsSet) {
            this.areFieldsSet = false;
        }
        this.isTimeSet = true;
        this.areFieldsVirtuallySet = false;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        if (!this.isTimeSet) {
            try {
                updateTime();
            } catch (IllegalArgumentException unused) {
            }
        }
        objectOutputStream.defaultWriteObject();
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        initInternal();
        this.isTimeSet = true;
        this.areAllFieldsSet = false;
        this.areFieldsSet = false;
        this.areFieldsVirtuallySet = true;
        this.nextStamp = 2;
    }

    public void computeFields() {
        int[] iArr = new int[2];
        getTimeZone().getOffset(this.time, false, iArr);
        long j = this.time + ((long) iArr[0]) + ((long) iArr[1]);
        int i = this.internalSetMask;
        for (int i2 = 0; i2 < this.fields.length; i2++) {
            if ((i & 1) == 0) {
                this.stamp[i2] = 1;
            } else {
                this.stamp[i2] = 0;
            }
            i >>= 1;
        }
        long jFloorDivide = floorDivide(j, 86400000L);
        int[] iArr2 = this.fields;
        int i3 = ((int) jFloorDivide) + EPOCH_JULIAN_DAY;
        iArr2[20] = i3;
        computeGregorianAndDOWFields(i3);
        handleComputeFields(this.fields[20]);
        computeWeekFields();
        int i4 = (int) (j - (jFloorDivide * 86400000));
        int[] iArr3 = this.fields;
        iArr3[21] = i4;
        iArr3[14] = i4 % 1000;
        int i5 = i4 / 1000;
        iArr3[13] = i5 % 60;
        int i6 = i5 / 60;
        iArr3[12] = i6 % 60;
        int i7 = i6 / 60;
        iArr3[11] = i7;
        iArr3[9] = i7 / 12;
        iArr3[10] = i7 % 12;
        iArr3[15] = iArr[0];
        iArr3[16] = iArr[1];
    }

    private final void computeGregorianAndDOWFields(int i) {
        computeGregorianFields(i);
        int[] iArr = this.fields;
        int iJulianDayToDayOfWeek = julianDayToDayOfWeek(i);
        iArr[7] = iJulianDayToDayOfWeek;
        int firstDayOfWeek = iJulianDayToDayOfWeek - getFirstDayOfWeek();
        int i2 = firstDayOfWeek + 1;
        if (i2 < 1) {
            i2 = firstDayOfWeek + 8;
        }
        this.fields[18] = i2;
    }

    public final void computeGregorianFields(int i) {
        int[] iArr = new int[1];
        int iFloorDivide = floorDivide(i - JAN_1_1_JULIAN_DAY, 146097, iArr);
        int iFloorDivide2 = floorDivide(iArr[0], 36524, iArr);
        int iFloorDivide3 = floorDivide(iArr[0], 1461, iArr);
        int i2 = 365;
        int iFloorDivide4 = floorDivide(iArr[0], 365, iArr);
        int i3 = (iFloorDivide * 400) + (iFloorDivide2 * 100) + (iFloorDivide3 * 4) + iFloorDivide4;
        int i4 = iArr[0];
        if (iFloorDivide2 != 4 && iFloorDivide4 != 4) {
            i3++;
            i2 = i4;
        }
        boolean z = (i3 & 3) == 0 && (i3 % 100 != 0 || i3 % 400 == 0);
        int i5 = ((((i2 >= (z ? 60 : 59) ? z ? 1 : 2 : 0) + i2) * 12) + 6) / 367;
        int i6 = GREGORIAN_MONTH_COUNT[i5][z ? (char) 3 : (char) 2];
        this.gregorianYear = i3;
        this.gregorianMonth = i5;
        this.gregorianDayOfMonth = (i2 - i6) + 1;
        this.gregorianDayOfYear = i2 + 1;
    }

    private final void computeWeekFields() {
        int[] iArr = this.fields;
        int i = iArr[19];
        int i2 = iArr[7];
        int i3 = iArr[6];
        int firstDayOfWeek = ((i2 + 7) - getFirstDayOfWeek()) % 7;
        int firstDayOfWeek2 = (((i2 - i3) + 7001) - getFirstDayOfWeek()) % 7;
        int iWeekNumber = ((i3 - 1) + firstDayOfWeek2) / 7;
        if (7 - firstDayOfWeek2 >= getMinimalDaysInFirstWeek()) {
            iWeekNumber++;
        }
        if (iWeekNumber == 0) {
            i--;
            iWeekNumber = weekNumber(i3 + handleGetYearLength(i), i2);
        } else {
            int iHandleGetYearLength = handleGetYearLength(i);
            if (i3 >= iHandleGetYearLength - 5) {
                int i4 = ((firstDayOfWeek + iHandleGetYearLength) - i3) % 7;
                if (i4 < 0) {
                    i4 += 7;
                }
                if (6 - i4 >= getMinimalDaysInFirstWeek() && (i3 + 7) - firstDayOfWeek > iHandleGetYearLength) {
                    i++;
                    iWeekNumber = 1;
                }
            }
        }
        int[] iArr2 = this.fields;
        iArr2[3] = iWeekNumber;
        iArr2[17] = i;
        int i5 = iArr2[5];
        iArr2[4] = weekNumber(i5, i2);
        this.fields[8] = ((i5 - 1) / 7) + 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0042 A[PHI: r7
  0x0042: PHI (r7v3 int) = (r7v2 int), (r7v5 int), (r7v5 int) binds: [B:22:0x0032, B:24:0x0037, B:26:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0046 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int resolveFields(int[][][] iArr) {
        int i = -1;
        for (int i2 = 0; i2 < iArr.length && i < 0; i2++) {
            int i3 = 0;
            for (int[] iArr2 : iArr[i2]) {
                int i4 = iArr2[0] >= 32 ? 1 : 0;
                int iMax = 0;
                while (true) {
                    if (i4 < iArr2.length) {
                        int i5 = this.stamp[iArr2[i4]];
                        if (i5 == 0) {
                            break;
                        }
                        iMax = Math.max(iMax, i5);
                        i4++;
                    } else if (iMax > i3) {
                        int i6 = iArr2[0];
                        if (i6 < 32 || (i6 = i6 & 31) != 5) {
                            i = i6;
                            if (i != i6) {
                                i3 = iMax;
                            }
                        } else {
                            int[] iArr3 = this.stamp;
                            if (iArr3[4] < iArr3[i6]) {
                            }
                            if (i != i6) {
                            }
                        }
                    }
                }
            }
        }
        return i >= 32 ? i & 31 : i;
    }

    public int newestStamp(int i, int i2, int i3) {
        while (i <= i2) {
            int i4 = this.stamp[i];
            if (i4 > i3) {
                i3 = i4;
            }
            i++;
        }
        return i3;
    }

    public final int getStamp(int i) {
        return this.stamp[i];
    }

    public int newerField(int i, int i2) {
        int[] iArr = this.stamp;
        return iArr[i2] > iArr[i] ? i2 : i;
    }

    public void validateFields() {
        for (int i = 0; i < this.fields.length; i++) {
            if (this.stamp[i] >= 2) {
                validateField(i);
            }
        }
    }

    public void validateField(int i) {
        if (i == 5) {
            validateField(i, 1, handleGetMonthLength(handleGetExtendedYear(), internalGet(2)));
            return;
        }
        if (i == 6) {
            validateField(i, 1, handleGetYearLength(handleGetExtendedYear()));
        } else {
            if (i == 8) {
                if (internalGet(i) == 0) {
                    throw new IllegalArgumentException("DAY_OF_WEEK_IN_MONTH cannot be zero");
                }
                validateField(i, getMinimum(i), getMaximum(i));
                return;
            }
            validateField(i, getMinimum(i), getMaximum(i));
        }
    }

    public final void validateField(int i, int i2, int i3) {
        int i4 = this.fields[i];
        if (i4 < i2 || i4 > i3) {
            throw new IllegalArgumentException(fieldName(i) + '=' + i4 + ", valid range=" + i2 + ".." + i3);
        }
    }

    public void computeTime() {
        int iComputeMillisInDay;
        long jComputeMillisInDayLong;
        int[] iArr;
        if (!isLenient()) {
            validateFields();
        }
        long jJulianDayToMillis = julianDayToMillis(computeJulianDay());
        if (this.stamp[21] >= 2 && newestStamp(9, 14, 0) <= this.stamp[21]) {
            iComputeMillisInDay = internalGet(21);
        } else {
            if (Math.max(Math.abs(internalGet(11)), Math.abs(internalGet(10))) > MAX_HOURS) {
                jComputeMillisInDayLong = computeMillisInDayLong();
                iArr = this.stamp;
                if (iArr[15] < 2 || iArr[16] >= 2) {
                    this.time = (jJulianDayToMillis + jComputeMillisInDayLong) - ((long) (internalGet(15) + internalGet(16)));
                }
                if (!this.lenient || this.skippedWallTime == 2) {
                    int iComputeZoneOffset = computeZoneOffset(jJulianDayToMillis, jComputeMillisInDayLong);
                    long j = (jJulianDayToMillis + jComputeMillisInDayLong) - ((long) iComputeZoneOffset);
                    if (iComputeZoneOffset == this.zone.getOffset(j)) {
                        this.time = j;
                        return;
                    }
                    if (!this.lenient) {
                        throw new IllegalArgumentException("The specified wall time does not exist due to time zone offset transition.");
                    }
                    Long immediatePreviousZoneTransition = getImmediatePreviousZoneTransition(j);
                    if (immediatePreviousZoneTransition == null) {
                        throw new RuntimeException("Could not locate a time zone transition before " + j);
                    }
                    this.time = immediatePreviousZoneTransition.longValue();
                    return;
                }
                this.time = (jJulianDayToMillis + jComputeMillisInDayLong) - ((long) computeZoneOffset(jJulianDayToMillis, jComputeMillisInDayLong));
                return;
            }
            iComputeMillisInDay = computeMillisInDay();
        }
        jComputeMillisInDayLong = iComputeMillisInDay;
        iArr = this.stamp;
        if (iArr[15] < 2) {
        }
        this.time = (jJulianDayToMillis + jComputeMillisInDayLong) - ((long) (internalGet(15) + internalGet(16)));
    }

    private Long getImmediatePreviousZoneTransition(long j) {
        TimeZone timeZone = this.zone;
        if (timeZone instanceof BasicTimeZone) {
            C7261agW previousTransition = ((BasicTimeZone) timeZone).getPreviousTransition(j, true);
            if (previousTransition != null) {
                return Long.valueOf(previousTransition.KWHzl());
            }
            return null;
        }
        Long previousZoneTransitionTime = getPreviousZoneTransitionTime(timeZone, j, 7200000L);
        return previousZoneTransitionTime == null ? getPreviousZoneTransitionTime(this.zone, j, 108000000L) : previousZoneTransitionTime;
    }

    private static Long getPreviousZoneTransitionTime(TimeZone timeZone, long j, long j2) {
        long j3 = (j - j2) - 1;
        int offset = timeZone.getOffset(j);
        if (offset == timeZone.getOffset(j3)) {
            return null;
        }
        return findPreviousZoneTransitionTime(timeZone, offset, j, j3);
    }

    private static Long findPreviousZoneTransitionTime(TimeZone timeZone, int i, long j, long j2) {
        long j3;
        long j4;
        long j5;
        int[] iArr = FIND_ZONE_TRANSITION_TIME_UNITS;
        int length = iArr.length;
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                j3 = 0;
                break;
            }
            long j6 = iArr[i2];
            long j7 = j2 / j6;
            long j8 = j / j6;
            if (j8 > j7) {
                j3 = (((j7 + j8) + 1) >>> 1) * j6;
                z = true;
                break;
            }
            i2++;
        }
        if (!z) {
            j3 = (j + j2) >>> 1;
        }
        long j9 = j3;
        if (z) {
            if (j9 == j) {
                j5 = j;
            } else {
                if (timeZone.getOffset(j9) != i) {
                    return findPreviousZoneTransitionTime(timeZone, i, j, j9);
                }
                j5 = j9;
            }
            j4 = j9 - 1;
        } else {
            j4 = (j + j2) >>> 1;
            j5 = j;
        }
        if (j4 == j2) {
            return Long.valueOf(j5);
        }
        if (timeZone.getOffset(j4) == i) {
            return findPreviousZoneTransitionTime(timeZone, i, j4, j2);
        }
        if (z) {
            return Long.valueOf(j5);
        }
        return findPreviousZoneTransitionTime(timeZone, i, j5, j4);
    }

    @Deprecated
    public int computeMillisInDay() {
        int iInternalGet;
        int[] iArr = this.stamp;
        int i = iArr[11];
        int iMax = Math.max(iArr[10], iArr[9]);
        if (iMax <= i) {
            iMax = i;
        }
        if (iMax == 0) {
            iInternalGet = 0;
        } else if (iMax == i) {
            iInternalGet = internalGet(11);
        } else {
            iInternalGet = internalGet(10) + (internalGet(9) * 12);
        }
        return (((((iInternalGet * 60) + internalGet(12)) * 60) + internalGet(13)) * 1000) + internalGet(14);
    }

    @Deprecated
    public long computeMillisInDayLong() {
        long jInternalGet;
        int[] iArr = this.stamp;
        int i = iArr[11];
        int iMax = Math.max(iArr[10], iArr[9]);
        if (iMax <= i) {
            iMax = i;
        }
        if (iMax == 0) {
            jInternalGet = 0;
        } else if (iMax == i) {
            jInternalGet = internalGet(11);
        } else {
            jInternalGet = ((long) internalGet(10)) + ((long) (internalGet(9) * 12));
        }
        return (((((jInternalGet * 60) + ((long) internalGet(12))) * 60) + ((long) internalGet(13))) * 1000) + ((long) internalGet(14));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    @Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int computeZoneOffset(long j, int i) {
        int[] iArr = new int[2];
        long j2 = j + ((long) i);
        TimeZone timeZone = this.zone;
        if (timeZone instanceof BasicTimeZone) {
            ((BasicTimeZone) timeZone).getOffsetFromLocal(j2, this.skippedWallTime == 1 ? 12 : 4, this.repeatedWallTime == 1 ? 4 : 12, iArr);
        } else {
            timeZone.getOffset(j2, true, iArr);
            if (this.repeatedWallTime == 1) {
                int offset = (iArr[0] + iArr[1]) - this.zone.getOffset((j2 - ((long) (iArr[0] + iArr[1]))) - 21600000);
                if (offset < 0) {
                    this.zone.getOffset(j2 + ((long) offset), true, iArr);
                } else if (this.skippedWallTime == 1) {
                    this.zone.getOffset(j2 - ((long) (iArr[0] + iArr[1])), false, iArr);
                }
            }
        }
        return iArr[0] + iArr[1];
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004d  */
    @Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int computeZoneOffset(long j, long j2) {
        int[] iArr = new int[2];
        long j3 = j + j2;
        TimeZone timeZone = this.zone;
        if (timeZone instanceof BasicTimeZone) {
            ((BasicTimeZone) timeZone).getOffsetFromLocal(j3, this.skippedWallTime == 1 ? 12 : 4, this.repeatedWallTime == 1 ? 4 : 12, iArr);
        } else {
            timeZone.getOffset(j3, true, iArr);
            if (this.repeatedWallTime == 1) {
                int offset = (iArr[0] + iArr[1]) - this.zone.getOffset((j3 - ((long) (iArr[0] + iArr[1]))) - 21600000);
                if (offset < 0) {
                    this.zone.getOffset(j3 + ((long) offset), true, iArr);
                } else if (this.skippedWallTime == 1) {
                    this.zone.getOffset(j3 - ((long) (iArr[0] + iArr[1])), false, iArr);
                }
            }
        }
        return iArr[0] + iArr[1];
    }

    public int computeJulianDay() {
        if (this.stamp[20] >= 2 && newestStamp(17, 19, newestStamp(0, 8, 0)) <= this.stamp[20]) {
            return internalGet(20);
        }
        int iResolveFields = resolveFields(getFieldResolutionTable());
        if (iResolveFields < 0) {
            iResolveFields = 5;
        }
        return handleComputeJulianDay(iResolveFields);
    }

    public int handleGetMonthLength(int i, int i2) {
        return handleComputeMonthStart(i, i2 + 1, true) - handleComputeMonthStart(i, i2, true);
    }

    public int handleGetYearLength(int i) {
        return handleComputeMonthStart(i + 1, 0, false) - handleComputeMonthStart(i, 0, false);
    }

    public int handleComputeJulianDay(int i) {
        int iHandleGetExtendedYear;
        int iInternalGet;
        int iInternalGet2;
        int iHandleGetMonthLength;
        int iInternalGet3;
        boolean z = i == 5 || i == 4 || i == 8;
        if (i == 3 && newerField(17, 1) == 17) {
            iHandleGetExtendedYear = internalGet(17);
        } else {
            iHandleGetExtendedYear = handleGetExtendedYear();
        }
        internalSet(19, iHandleGetExtendedYear);
        int iInternalGet4 = z ? internalGet(2, getDefaultMonthInYear(iHandleGetExtendedYear)) : 0;
        int iHandleComputeMonthStart = handleComputeMonthStart(iHandleGetExtendedYear, iInternalGet4, z);
        if (i == 5) {
            if (isSet(5)) {
                iInternalGet3 = internalGet(5, getDefaultDayInMonth(iHandleGetExtendedYear, iInternalGet4));
            } else {
                iInternalGet3 = getDefaultDayInMonth(iHandleGetExtendedYear, iInternalGet4);
            }
        } else if (i == 6) {
            iInternalGet3 = internalGet(6);
        } else {
            int firstDayOfWeek = getFirstDayOfWeek();
            int iJulianDayToDayOfWeek = julianDayToDayOfWeek(iHandleComputeMonthStart + 1) - firstDayOfWeek;
            if (iJulianDayToDayOfWeek < 0) {
                iJulianDayToDayOfWeek += 7;
            }
            int iResolveFields = resolveFields(DOW_PRECEDENCE);
            if (iResolveFields == 7) {
                iInternalGet = internalGet(7) - firstDayOfWeek;
            } else {
                iInternalGet = iResolveFields != 18 ? 0 : internalGet(18) - 1;
            }
            int i2 = iInternalGet % 7;
            if (i2 < 0) {
                i2 += 7;
            }
            int i3 = (1 - iJulianDayToDayOfWeek) + i2;
            if (i == 8) {
                if (i3 < 1) {
                    i3 += 7;
                }
                iInternalGet2 = internalGet(8, 1);
                if (iInternalGet2 < 0) {
                    iHandleGetMonthLength = i3 + ((((handleGetMonthLength(iHandleGetExtendedYear, internalGet(2, 0)) - i3) / 7) + iInternalGet2 + 1) * 7);
                }
                return iHandleComputeMonthStart + iHandleGetMonthLength;
            }
            if (7 - iJulianDayToDayOfWeek < getMinimalDaysInFirstWeek()) {
                i3 += 7;
            }
            iInternalGet2 = internalGet(i);
            iHandleGetMonthLength = i3 + ((iInternalGet2 - 1) * 7);
            return iHandleComputeMonthStart + iHandleGetMonthLength;
        }
        return iHandleComputeMonthStart + iInternalGet3;
    }

    public int computeGregorianMonthStart(int i, int i2) {
        boolean z = false;
        if (i2 < 0 || i2 > 11) {
            int[] iArr = new int[1];
            i += floorDivide(i2, 12, iArr);
            i2 = iArr[0];
        }
        if (i % 4 == 0 && (i % 100 != 0 || i % 400 == 0)) {
            z = true;
        }
        int i3 = i - 1;
        int iFloorDivide = (((i3 * 365) + floorDivide(i3, 4)) - floorDivide(i3, 100)) + floorDivide(i3, 400) + 1721425;
        if (i2 != 0) {
            return iFloorDivide + GREGORIAN_MONTH_COUNT[i2][z ? (char) 3 : (char) 2];
        }
        return iFloorDivide;
    }

    public void handleComputeFields(int i) {
        int i2;
        internalSet(2, getGregorianMonth());
        internalSet(5, getGregorianDayOfMonth());
        internalSet(6, getGregorianDayOfYear());
        int gregorianYear = getGregorianYear();
        internalSet(19, gregorianYear);
        if (gregorianYear < 1) {
            gregorianYear = 1 - gregorianYear;
            i2 = 0;
        } else {
            i2 = 1;
        }
        internalSet(0, i2);
        internalSet(1, gregorianYear);
    }

    public final int getFieldCount() {
        return this.fields.length;
    }

    public final void internalSet(int i, int i2) {
        if (((1 << i) & this.internalSetMask) == 0) {
            throw new IllegalStateException("Subclass cannot set " + fieldName(i));
        }
        this.fields[i] = i2;
        this.stamp[i] = 1;
    }

    public static final boolean isGregorianLeapYear(int i) {
        return i % 4 == 0 && (i % 100 != 0 || i % 400 == 0);
    }

    public static final int gregorianMonthLength(int i, int i2) {
        return GREGORIAN_MONTH_COUNT[i2][isGregorianLeapYear(i) ? 1 : 0];
    }

    public static final int gregorianPreviousMonthLength(int i, int i2) {
        if (i2 > 0) {
            return gregorianMonthLength(i, i2 - 1);
        }
        return 31;
    }

    public static final long floorDivide(long j, long j2) {
        return j >= 0 ? j / j2 : ((j + 1) / j2) - 1;
    }

    public static final int floorDivide(int i, int i2) {
        return i >= 0 ? i / i2 : ((i + 1) / i2) - 1;
    }

    public static final int floorDivide(int i, int i2, int[] iArr) {
        if (i >= 0) {
            iArr[0] = i % i2;
            return i / i2;
        }
        int i3 = ((i + 1) / i2) - 1;
        iArr[0] = i - (i2 * i3);
        return i3;
    }

    public static final int floorDivide(long j, int i, int[] iArr) {
        if (j >= 0) {
            long j2 = i;
            iArr[0] = (int) (j % j2);
            return (int) (j / j2);
        }
        long j3 = i;
        int i2 = (int) (((j + 1) / j3) - 1);
        iArr[0] = (int) (j - (((long) i2) * j3));
        return i2;
    }

    public String fieldName(int i) {
        try {
            return FIELD_NAME[i];
        } catch (ArrayIndexOutOfBoundsException unused) {
            return "Field " + i;
        }
    }

    public static final int millisToJulianDay(long j) {
        return (int) (floorDivide(j, 86400000L) + 2440588);
    }

    public static final int julianDayToDayOfWeek(int i) {
        int i2 = (i + 2) % 7;
        return i2 < 1 ? i2 + 7 : i2;
    }

    public final ULocale getLocale(ULocale.StateListAnimator stateListAnimator) {
        return stateListAnimator == ULocale.ACTUAL_LOCALE ? this.actualLocale : this.validLocale;
    }

    public final void setLocale(ULocale uLocale, ULocale uLocale2) {
        if ((uLocale == null) != (uLocale2 == null)) {
            throw new IllegalArgumentException();
        }
        this.validLocale = uLocale;
        this.actualLocale = uLocale2;
    }
}
