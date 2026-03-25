package com.ibm.icu.text;

import androidx.camera.video.AudioStats;
import androidx.compose.material3.CalendarModelKt;
import com.huawei.hms.framework.common.ContainerUtils;
import com.ibm.icu.impl.DateNumberFormat;
import com.ibm.icu.impl.DayPeriodRules;
import com.ibm.icu.impl.ICUResourceBundle;
import com.ibm.icu.text.DateFormat;
import com.ibm.icu.text.DateFormatSymbols;
import com.ibm.icu.text.DisplayContext;
import com.ibm.icu.text.TimeZoneFormat;
import com.ibm.icu.util.BasicTimeZone;
import com.ibm.icu.util.Calendar;
import com.ibm.icu.util.HebrewCalendar;
import com.ibm.icu.util.TimeZone;
import com.ibm.icu.util.ULocale;
import com.ibm.icu.util.UResourceBundle;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.AttributedCharacterIterator;
import java.text.AttributedString;
import java.text.FieldPosition;
import java.text.Format;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.UUID;
import o.AbstractC7192afG;
import o.C7027acA;
import o.C7028acB;
import o.C7070acr;
import o.C7223afl;
import o.C7242agD;
import o.C7255agQ;
import o.C7261agW;
import o.C7275agk;
import o.InterfaceC7054acb;

/* JADX INFO: loaded from: classes3.dex */
public class SimpleDateFormat extends DateFormat {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    static final UnicodeSet DATE_PATTERN_TYPE;
    private static final int DECIMAL_BUF_SIZE = 10;
    static boolean DelayedHebrewMonthCheck = false;
    private static final String FALLBACKPATTERN = "yy/MM/dd HH:mm";
    private static final int HEBREW_CAL_CUR_MILLENIUM_END_YEAR = 6000;
    private static final int HEBREW_CAL_CUR_MILLENIUM_START_YEAR = 5000;
    private static final int ISOSpecialEra = -32000;
    private static final String NUMERIC_FORMAT_CHARS = "ADdFgHhKkmrSsuWwYy";
    private static final String NUMERIC_FORMAT_CHARS2 = "ceLMQq";
    private static InterfaceC7054acb<String, Object[]> PARSED_PATTERN_CACHE = null;
    private static final DateFormat.Field[] PATTERN_INDEX_TO_DATE_FORMAT_ATTRIBUTE;
    private static final String SUPPRESS_NEGATIVE_PREFIX = "\uab00";
    static final int currentSerialVersion = 2;
    private static final int millisPerHour = 3600000;
    private static final long serialVersionUID = 4774881970558875024L;
    private transient AbstractC7192afG capitalizationBrkIter;
    private transient char[] decDigits;
    private transient char[] decimalBuf;
    private transient long defaultCenturyBase;
    private Date defaultCenturyStart;
    private transient int defaultCenturyStartYear;
    private DateFormatSymbols formatData;
    private transient boolean hasHanYearChar;
    private transient boolean hasMinute;
    private transient boolean hasSecond;
    private transient ULocale locale;
    private HashMap<String, NumberFormat> numberFormatters;
    private String override;
    private HashMap<Character, String> overrideMap;
    private String pattern;
    private transient Object[] patternItems;
    private int serialVersionOnStream;
    private volatile TimeZoneFormat tzFormat;
    private transient boolean useFastFormat;
    private transient boolean useLocalZeroPaddingNumberFormat;
    private static final int[] CALENDAR_FIELD_TO_LEVEL = {0, 10, 20, 20, 30, 30, 20, 30, 30, 40, 50, 50, 60, 70, 80, 0, 0, 10, 30, 10, 0, 40, 0, 0};
    private static final int[] PATTERN_CHAR_TO_LEVEL = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 40, -1, -1, 20, 30, 30, 0, 50, -1, -1, 50, 20, 20, -1, 0, -1, 20, -1, 80, -1, 10, 0, 30, 0, 10, 0, -1, -1, -1, -1, -1, -1, 40, -1, 30, 30, 30, -1, 0, 50, -1, -1, 50, -1, 60, -1, -1, -1, 20, 10, 70, -1, 10, 0, 20, 0, 10, 0, -1, -1, -1, -1, -1};
    private static final boolean[] PATTERN_CHAR_IS_SYNTAX = {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false, false, false, false, false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false, false, false, false};
    private static ULocale cachedDefaultLocale = null;
    private static String cachedDefaultPattern = null;
    private static final int[] PATTERN_CHAR_TO_INDEX = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 22, 36, -1, 10, 9, 11, 0, 5, -1, -1, 16, 26, 2, -1, 31, -1, 27, -1, 8, -1, 30, 29, 13, 32, 18, 23, -1, -1, -1, -1, -1, -1, 14, 35, 25, 3, 19, -1, 21, 15, -1, -1, 4, -1, 6, -1, -1, -1, 28, 34, 7, -1, 20, 24, 12, 33, 1, 17, -1, -1, -1, -1, -1};
    private static final int[] PATTERN_INDEX_TO_CALENDAR_FIELD = {0, 1, 2, 5, 11, 11, 12, 13, 14, 7, 6, 8, 3, 4, 9, 10, 10, 15, 17, 18, 19, 20, 21, 15, 15, 18, 2, 2, 2, 15, 1, 15, 15, 15, 19, -1, -2};
    private static final int[] PATTERN_INDEX_TO_DATE_FORMAT_FIELD = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37};

    /* JADX INFO: loaded from: classes14.dex */
    public enum ContextValue {
        UNKNOWN,
        CAPITALIZATION_FOR_MIDDLE_OF_SENTENCE,
        CAPITALIZATION_FOR_BEGINNING_OF_SENTENCE,
        CAPITALIZATION_FOR_UI_LIST_OR_MENU,
        CAPITALIZATION_FOR_STANDALONE
    }

    private boolean allowNumericFallback(int i) {
        return i == 26 || i == 19 || i == 25 || i == 30 || i == 27 || i == 28;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ULocale getLocale() {
        return this.locale;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DateFormatSymbols getSymbols() {
        return this.formatData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toPattern() {
        return this.pattern;
    }

    private static int getLevelFromChar(char c) {
        int[] iArr = PATTERN_CHAR_TO_LEVEL;
        if (c < iArr.length) {
            return iArr[c & 255];
        }
        return -1;
    }

    private static boolean isSyntaxChar(char c) {
        boolean[] zArr = PATTERN_CHAR_IS_SYNTAX;
        if (c < zArr.length) {
            return zArr[c & 255];
        }
        return false;
    }

    public SimpleDateFormat() {
        this(getDefaultPattern(), null, null, null, null, true, null);
    }

    public SimpleDateFormat(String str) {
        this(str, null, null, null, null, true, null);
    }

    public SimpleDateFormat(String str, Locale locale) {
        this(str, null, null, null, ULocale.forLocale(locale), true, null);
    }

    public SimpleDateFormat(String str, ULocale uLocale) {
        this(str, null, null, null, uLocale, true, null);
    }

    public SimpleDateFormat(String str, String str2, ULocale uLocale) {
        this(str, null, null, null, uLocale, false, str2);
    }

    public SimpleDateFormat(String str, DateFormatSymbols dateFormatSymbols) {
        this(str, (DateFormatSymbols) dateFormatSymbols.clone(), null, null, null, true, null);
    }

    @Deprecated
    public SimpleDateFormat(String str, DateFormatSymbols dateFormatSymbols, ULocale uLocale) {
        this(str, (DateFormatSymbols) dateFormatSymbols.clone(), null, null, uLocale, true, null);
    }

    public SimpleDateFormat(String str, DateFormatSymbols dateFormatSymbols, Calendar calendar, ULocale uLocale, boolean z, String str2) {
        this(str, (DateFormatSymbols) dateFormatSymbols.clone(), (Calendar) calendar.clone(), null, uLocale, z, str2);
    }

    private SimpleDateFormat(String str, DateFormatSymbols dateFormatSymbols, Calendar calendar, NumberFormat numberFormat, ULocale uLocale, boolean z, String str2) {
        this.serialVersionOnStream = 2;
        this.capitalizationBrkIter = null;
        this.pattern = str;
        this.formatData = dateFormatSymbols;
        this.calendar = calendar;
        this.numberFormat = numberFormat;
        this.locale = uLocale;
        this.useFastFormat = z;
        this.override = str2;
        initialize();
    }

    @Deprecated
    public static SimpleDateFormat getInstance(Calendar.Application application) {
        String strCopydefault = application.copydefault();
        return new SimpleDateFormat(application.OLrzqt(), application.EZpvd(), application.AEQbTJ(), null, application.KWHzl(), strCopydefault != null && strCopydefault.length() > 0, application.copydefault());
    }

    private void initialize() {
        Calendar calendar;
        ULocale uLocale;
        if (this.locale == null) {
            this.locale = ULocale.getDefault(ULocale.Category.FORMAT);
        }
        if (this.formatData == null) {
            this.formatData = new DateFormatSymbols(this.locale);
        }
        if (this.calendar == null) {
            this.calendar = Calendar.getInstance(this.locale);
        }
        if (this.numberFormat == null) {
            C7275agk c7275agkEZpvd = C7275agk.EZpvd(this.locale);
            String strKWHzl = c7275agkEZpvd.KWHzl();
            if (c7275agkEZpvd.copydefault() || strKWHzl.length() != 10) {
                this.numberFormat = NumberFormat.getInstance(this.locale);
            } else {
                this.numberFormat = new DateNumberFormat(this.locale, strKWHzl, c7275agkEZpvd.EZpvd());
            }
        }
        NumberFormat numberFormat = this.numberFormat;
        if (numberFormat instanceof DecimalFormat) {
            DateFormat.fixNumberFormatForDates(numberFormat);
        }
        this.defaultCenturyBase = System.currentTimeMillis();
        setLocale(this.calendar.getLocale(ULocale.VALID_LOCALE), this.calendar.getLocale(ULocale.ACTUAL_LOCALE));
        initLocalZeroPaddingNumberFormat();
        parsePattern();
        if (this.override == null && this.hasHanYearChar && (calendar = this.calendar) != null && calendar.getType().equals("japanese") && (uLocale = this.locale) != null && uLocale.getLanguage().equals("ja")) {
            this.override = "y=jpanyear";
        }
        if (this.override != null) {
            initNumberFormatters(this.locale);
        }
    }

    private void initializeTimeZoneFormat(boolean z) {
        String str;
        synchronized (this) {
            if (!z) {
                if (this.tzFormat == null) {
                }
            }
            this.tzFormat = TimeZoneFormat.getInstance(this.locale);
            NumberFormat numberFormat = this.numberFormat;
            if (numberFormat instanceof DecimalFormat) {
                String[] digitStringsLocal = ((DecimalFormat) numberFormat).getDecimalFormatSymbols().getDigitStringsLocal();
                StringBuilder sb = new StringBuilder();
                for (String str2 : digitStringsLocal) {
                    sb.append(str2);
                }
                str = sb.toString();
            } else {
                str = numberFormat instanceof DateNumberFormat ? new String(((DateNumberFormat) numberFormat).getDigits()) : null;
            }
            if (str != null && !this.tzFormat.getGMTOffsetDigits().equals(str)) {
                if (this.tzFormat.isFrozen()) {
                    this.tzFormat = this.tzFormat.m6326cloneAsThawed();
                }
                this.tzFormat.setGMTOffsetDigits(str);
            }
        }
    }

    private TimeZoneFormat tzFormat() {
        if (this.tzFormat == null) {
            initializeTimeZoneFormat(false);
        }
        return this.tzFormat;
    }

    private static String getDefaultPattern() {
        String str;
        String strOLrzqt;
        synchronized (SimpleDateFormat.class) {
            ULocale uLocale = ULocale.getDefault(ULocale.Category.FORMAT);
            if (uLocale.equals(cachedDefaultLocale)) {
                str = cachedDefaultPattern;
            } else {
                cachedDefaultLocale = uLocale;
                Calendar calendar = Calendar.getInstance(uLocale);
                try {
                    ICUResourceBundle iCUResourceBundle = (ICUResourceBundle) UResourceBundle.KWHzl("com/ibm/icu/impl/data/icudt68b", cachedDefaultLocale);
                    ICUResourceBundle iCUResourceBundleGEmmrt = iCUResourceBundle.gEmmrt("calendar/" + calendar.getType() + "/DateTimePatterns");
                    if (iCUResourceBundleGEmmrt == null) {
                        iCUResourceBundleGEmmrt = iCUResourceBundle.gEmmrt("calendar/gregorian/DateTimePatterns");
                    }
                    if (iCUResourceBundleGEmmrt == null || iCUResourceBundleGEmmrt.fARcdN() < 9) {
                        strOLrzqt = FALLBACKPATTERN;
                    } else {
                        strOLrzqt = C7028acB.OLrzqt(iCUResourceBundleGEmmrt.copydefault(iCUResourceBundleGEmmrt.fARcdN() >= 13 ? 12 : 8), 2, 2, iCUResourceBundleGEmmrt.copydefault(3), iCUResourceBundleGEmmrt.copydefault(7));
                    }
                    cachedDefaultPattern = strOLrzqt;
                } catch (MissingResourceException unused) {
                    cachedDefaultPattern = FALLBACKPATTERN;
                }
                str = cachedDefaultPattern;
            }
        }
        return str;
    }

    private void parseAmbiguousDatesAsAfter(Date date) {
        this.defaultCenturyStart = date;
        this.calendar.setTime(date);
        this.defaultCenturyStartYear = this.calendar.get(1);
    }

    private void initializeDefaultCenturyStart(long j) {
        this.defaultCenturyBase = j;
        Calendar calendar = (Calendar) this.calendar.clone();
        calendar.setTimeInMillis(j);
        calendar.add(1, -80);
        this.defaultCenturyStart = calendar.getTime();
        this.defaultCenturyStartYear = calendar.get(1);
    }

    private Date getDefaultCenturyStart() {
        if (this.defaultCenturyStart == null) {
            initializeDefaultCenturyStart(this.defaultCenturyBase);
        }
        return this.defaultCenturyStart;
    }

    private int getDefaultCenturyStartYear() {
        if (this.defaultCenturyStart == null) {
            initializeDefaultCenturyStart(this.defaultCenturyBase);
        }
        return this.defaultCenturyStartYear;
    }

    public void set2DigitYearStart(Date date) {
        parseAmbiguousDatesAsAfter(date);
    }

    public Date get2DigitYearStart() {
        return getDefaultCenturyStart();
    }

    @Override // com.ibm.icu.text.DateFormat
    public void setContext(DisplayContext displayContext) {
        super.setContext(displayContext);
        if (this.capitalizationBrkIter == null) {
            if (displayContext == DisplayContext.CAPITALIZATION_FOR_BEGINNING_OF_SENTENCE || displayContext == DisplayContext.CAPITALIZATION_FOR_UI_LIST_OR_MENU || displayContext == DisplayContext.CAPITALIZATION_FOR_STANDALONE) {
                this.capitalizationBrkIter = AbstractC7192afG.copydefault(this.locale);
            }
        }
    }

    @Override // com.ibm.icu.text.DateFormat
    public StringBuffer format(Calendar calendar, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        return format(calendar, stringBuffer, fieldPosition, null);
    }

    public StringBuffer format(Calendar calendar, StringBuffer stringBuffer, FieldPosition fieldPosition, List<FieldPosition> list) {
        TimeZone timeZone;
        if (calendar == this.calendar || calendar.getType().equals(this.calendar.getType())) {
            timeZone = null;
        } else {
            this.calendar.setTimeInMillis(calendar.getTimeInMillis());
            timeZone = this.calendar.getTimeZone();
            this.calendar.setTimeZone(calendar.getTimeZone());
            calendar = this.calendar;
        }
        StringBuffer stringBuffer2 = format(calendar, getContext(DisplayContext.Type.CAPITALIZATION), stringBuffer, fieldPosition, list);
        if (timeZone != null) {
            this.calendar.setTimeZone(timeZone);
        }
        return stringBuffer2;
    }

    private StringBuffer format(Calendar calendar, DisplayContext displayContext, StringBuffer stringBuffer, FieldPosition fieldPosition, List<FieldPosition> list) {
        int i;
        Activity activity;
        int i2;
        int i3 = 0;
        fieldPosition.setBeginIndex(0);
        fieldPosition.setEndIndex(0);
        Object[] patternItems = getPatternItems();
        int i4 = 0;
        while (i4 < patternItems.length) {
            Object obj = patternItems[i4];
            if (obj instanceof String) {
                stringBuffer.append((String) obj);
                i2 = i4;
            } else {
                Activity activity2 = (Activity) obj;
                int length = list != null ? stringBuffer.length() : i3;
                if (this.useFastFormat) {
                    i = length;
                    activity = activity2;
                    i2 = i4;
                    subFormat(stringBuffer, activity2.copydefault, activity2.OLrzqt, stringBuffer.length(), i4, displayContext, fieldPosition, activity2.copydefault, calendar);
                } else {
                    i = length;
                    activity = activity2;
                    i2 = i4;
                    stringBuffer.append(subFormat(activity.copydefault, activity.OLrzqt, stringBuffer.length(), i2, displayContext, fieldPosition, activity.copydefault, calendar));
                }
                if (list != null) {
                    int length2 = stringBuffer.length();
                    if (length2 - i > 0) {
                        FieldPosition fieldPosition2 = new FieldPosition(patternCharToDateFormatField(activity.copydefault));
                        fieldPosition2.setBeginIndex(i);
                        fieldPosition2.setEndIndex(length2);
                        list.add(fieldPosition2);
                    }
                }
            }
            i4 = i2 + 1;
            i3 = 0;
        }
        return stringBuffer;
    }

    private static int getIndexFromChar(char c) {
        int[] iArr = PATTERN_CHAR_TO_INDEX;
        if (c < iArr.length) {
            return iArr[c & 255];
        }
        return -1;
    }

    static {
        DateFormat.Field field = DateFormat.Field.ERA;
        DateFormat.Field field2 = DateFormat.Field.YEAR;
        DateFormat.Field field3 = DateFormat.Field.MONTH;
        DateFormat.Field field4 = DateFormat.Field.DAY_OF_MONTH;
        DateFormat.Field field5 = DateFormat.Field.HOUR_OF_DAY1;
        DateFormat.Field field6 = DateFormat.Field.HOUR_OF_DAY0;
        DateFormat.Field field7 = DateFormat.Field.MINUTE;
        DateFormat.Field field8 = DateFormat.Field.SECOND;
        DateFormat.Field field9 = DateFormat.Field.MILLISECOND;
        DateFormat.Field field10 = DateFormat.Field.DAY_OF_WEEK;
        DateFormat.Field field11 = DateFormat.Field.DAY_OF_YEAR;
        DateFormat.Field field12 = DateFormat.Field.DAY_OF_WEEK_IN_MONTH;
        DateFormat.Field field13 = DateFormat.Field.WEEK_OF_YEAR;
        DateFormat.Field field14 = DateFormat.Field.WEEK_OF_MONTH;
        DateFormat.Field field15 = DateFormat.Field.AM_PM;
        DateFormat.Field field16 = DateFormat.Field.HOUR1;
        DateFormat.Field field17 = DateFormat.Field.HOUR0;
        DateFormat.Field field18 = DateFormat.Field.TIME_ZONE;
        DateFormat.Field field19 = DateFormat.Field.YEAR_WOY;
        DateFormat.Field field20 = DateFormat.Field.DOW_LOCAL;
        DateFormat.Field field21 = DateFormat.Field.EXTENDED_YEAR;
        DateFormat.Field field22 = DateFormat.Field.JULIAN_DAY;
        DateFormat.Field field23 = DateFormat.Field.MILLISECONDS_IN_DAY;
        DateFormat.Field field24 = DateFormat.Field.QUARTER;
        PATTERN_INDEX_TO_DATE_FORMAT_ATTRIBUTE = new DateFormat.Field[]{field, field2, field3, field4, field5, field6, field7, field8, field9, field10, field11, field12, field13, field14, field15, field16, field17, field18, field19, field20, field21, field22, field23, field18, field18, field10, field3, field24, field24, field18, field2, field18, field18, field18, DateFormat.Field.RELATED_YEAR, DateFormat.Field.AM_PM_MIDNIGHT_NOON, DateFormat.Field.FLEXIBLE_DAY_PERIOD, DateFormat.Field.TIME_SEPARATOR};
        PARSED_PATTERN_CACHE = new C7027acA();
        DATE_PATTERN_TYPE = new UnicodeSet("[GyYuUQqMLlwWd]").AYXKKw();
    }

    public DateFormat.Field patternCharToDateFormatField(char c) {
        int indexFromChar = getIndexFromChar(c);
        if (indexFromChar != -1) {
            return PATTERN_INDEX_TO_DATE_FORMAT_ATTRIBUTE[indexFromChar];
        }
        return null;
    }

    public String subFormat(char c, int i, int i2, FieldPosition fieldPosition, DateFormatSymbols dateFormatSymbols, Calendar calendar) throws IllegalArgumentException {
        return subFormat(c, i, i2, 0, DisplayContext.CAPITALIZATION_NONE, fieldPosition, c, calendar);
    }

    @Deprecated
    public String subFormat(char c, int i, int i2, int i3, DisplayContext displayContext, FieldPosition fieldPosition, char c2, Calendar calendar) {
        StringBuffer stringBuffer = new StringBuffer();
        subFormat(stringBuffer, c, i, i2, i3, displayContext, fieldPosition, c2, calendar);
        return stringBuffer.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:233:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0656  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0662  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x06c3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:354:0x06e0  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x06fd  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0732  */
    /* JADX WARN: Removed duplicated region for block: B:377:? A[RETURN, SYNTHETIC] */
    @Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void subFormat(StringBuffer stringBuffer, char c, int i, int i2, int i3, DisplayContext displayContext, FieldPosition fieldPosition, char c2, Calendar calendar) {
        int relatedYear;
        char c3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        char c4;
        int i9;
        int i10;
        String[] strArr;
        String str;
        DateFormatSymbols.CapitalizationContextUsage capitalizationContextUsage;
        String[] strArr2;
        String str2;
        int i11;
        String[] strArr3;
        int i12;
        int i13;
        DateFormatSymbols.CapitalizationContextUsage capitalizationContextUsage2;
        String str3;
        String str4;
        DayPeriodRules.DayPeriod dayPeriodAEQbTJ;
        int i14;
        Map<DateFormatSymbols.CapitalizationContextUsage, boolean[]> map;
        int length = stringBuffer.length();
        TimeZone timeZone = calendar.getTimeZone();
        long timeInMillis = calendar.getTimeInMillis();
        int indexFromChar = getIndexFromChar(c);
        if (indexFromChar != -1) {
            int i15 = PATTERN_INDEX_TO_CALENDAR_FIELD[indexFromChar];
            if (i15 >= 0) {
                relatedYear = indexFromChar != 34 ? calendar.get(i15) : calendar.getRelatedYear();
            } else {
                relatedYear = 0;
            }
            NumberFormat numberFormat = getNumberFormat(c);
            DateFormatSymbols.CapitalizationContextUsage capitalizationContextUsage3 = DateFormatSymbols.CapitalizationContextUsage.OTHER;
            switch (indexFromChar) {
                case 0:
                    c3 = 0;
                    i4 = 2;
                    if (calendar.getType().equals("chinese") || calendar.getType().equals("dangi")) {
                        i5 = 3;
                        zeroPaddingNumber(numberFormat, stringBuffer, relatedYear, 1, 9);
                        i6 = i5;
                        capitalizationContextUsage2 = capitalizationContextUsage3;
                        if (i3 == 0 && displayContext != null && stringBuffer.length() > length && C7223afl.fetchVPNInfo(stringBuffer.codePointAt(length))) {
                            i14 = AnonymousClass1.EZpvd[displayContext.ordinal()];
                            if (i14 == 1) {
                                if (this.capitalizationBrkIter == null) {
                                    this.capitalizationBrkIter = AbstractC7192afG.copydefault(this.locale);
                                }
                                stringBuffer.replace(length, stringBuffer.length(), C7223afl.AEQbTJ(this.locale, stringBuffer.substring(length), (AbstractC7192afG) this.capitalizationBrkIter.clone(), 768));
                            } else if ((i14 == i4 || i14 == i6) && (map = this.formatData.capitalization) != null) {
                                boolean[] zArr = map.get(capitalizationContextUsage2);
                                if (displayContext == DisplayContext.CAPITALIZATION_FOR_UI_LIST_OR_MENU ? zArr[c3] : zArr[1]) {
                                }
                            }
                        }
                        int indexFromChar2 = getIndexFromChar(c2);
                        if (fieldPosition.getBeginIndex() != fieldPosition.getEndIndex()) {
                            if (fieldPosition.getField() == PATTERN_INDEX_TO_DATE_FORMAT_FIELD[indexFromChar2]) {
                                fieldPosition.setBeginIndex(i2);
                                fieldPosition.setEndIndex((stringBuffer.length() + i2) - length);
                                return;
                            } else {
                                if (fieldPosition.getFieldAttribute() == PATTERN_INDEX_TO_DATE_FORMAT_ATTRIBUTE[indexFromChar2]) {
                                    fieldPosition.setBeginIndex(i2);
                                    fieldPosition.setEndIndex((stringBuffer.length() + i2) - length);
                                    return;
                                }
                                return;
                            }
                        }
                        return;
                    }
                    if (i == 5) {
                        safeAppend(this.formatData.narrowEras, relatedYear, stringBuffer);
                        capitalizationContextUsage3 = DateFormatSymbols.CapitalizationContextUsage.ERA_NARROW;
                    } else if (i == 4) {
                        safeAppend(this.formatData.eraNames, relatedYear, stringBuffer);
                        capitalizationContextUsage3 = DateFormatSymbols.CapitalizationContextUsage.ERA_WIDE;
                    } else {
                        safeAppend(this.formatData.eras, relatedYear, stringBuffer);
                        capitalizationContextUsage3 = DateFormatSymbols.CapitalizationContextUsage.ERA_ABBREV;
                    }
                    i6 = 3;
                    capitalizationContextUsage2 = capitalizationContextUsage3;
                    if (i3 == 0) {
                        i14 = AnonymousClass1.EZpvd[displayContext.ordinal()];
                        if (i14 == 1) {
                        }
                    }
                    int indexFromChar22 = getIndexFromChar(c2);
                    if (fieldPosition.getBeginIndex() != fieldPosition.getEndIndex()) {
                    }
                    break;
                case 1:
                case 18:
                    i6 = 3;
                    c3 = 0;
                    i4 = 2;
                    str3 = this.override;
                    if (str3 != null && ((str3.compareTo("hebr") == 0 || this.override.indexOf("y=hebr") >= 0) && relatedYear > 5000 && relatedYear < HEBREW_CAL_CUR_MILLENIUM_END_YEAR)) {
                        relatedYear -= 5000;
                    }
                    if (i != i4) {
                        zeroPaddingNumber(numberFormat, stringBuffer, relatedYear, 2, 2);
                    } else {
                        zeroPaddingNumber(numberFormat, stringBuffer, relatedYear, i, Integer.MAX_VALUE);
                    }
                    capitalizationContextUsage2 = capitalizationContextUsage3;
                    if (i3 == 0) {
                    }
                    int indexFromChar222 = getIndexFromChar(c2);
                    if (fieldPosition.getBeginIndex() != fieldPosition.getEndIndex()) {
                    }
                    break;
                case 2:
                case 26:
                    i4 = 2;
                    if (calendar.getType().equals("hebrew")) {
                        boolean zIsLeapYear = HebrewCalendar.isLeapYear(calendar.get(1));
                        if (zIsLeapYear && relatedYear == 6 && i >= 3) {
                            relatedYear = 13;
                        }
                        if (!zIsLeapYear && relatedYear >= 6 && i < 3) {
                            relatedYear--;
                        }
                    }
                    String[] strArr4 = this.formatData.leapMonthPatterns;
                    if (strArr4 == null || strArr4.length < 7) {
                        i7 = 5;
                        i8 = 0;
                    } else {
                        i8 = calendar.get(22);
                        i7 = 5;
                    }
                    if (i == i7) {
                        if (indexFromChar == 2) {
                            DateFormatSymbols dateFormatSymbols = this.formatData;
                            safeAppendWithMonthPattern(dateFormatSymbols.narrowMonths, relatedYear, stringBuffer, i8 != 0 ? dateFormatSymbols.leapMonthPatterns[2] : null);
                        } else {
                            DateFormatSymbols dateFormatSymbols2 = this.formatData;
                            safeAppendWithMonthPattern(dateFormatSymbols2.standaloneNarrowMonths, relatedYear, stringBuffer, i8 != 0 ? dateFormatSymbols2.leapMonthPatterns[5] : null);
                        }
                        capitalizationContextUsage3 = DateFormatSymbols.CapitalizationContextUsage.MONTH_NARROW;
                        i6 = 3;
                        capitalizationContextUsage2 = capitalizationContextUsage3;
                        c3 = 0;
                        if (i3 == 0) {
                        }
                        int indexFromChar2222 = getIndexFromChar(c2);
                        if (fieldPosition.getBeginIndex() != fieldPosition.getEndIndex()) {
                        }
                    } else {
                        if (i == 4) {
                            if (indexFromChar == 2) {
                                DateFormatSymbols dateFormatSymbols3 = this.formatData;
                                String[] strArr5 = dateFormatSymbols3.months;
                                if (i8 != 0) {
                                    c4 = 0;
                                    str = dateFormatSymbols3.leapMonthPatterns[0];
                                } else {
                                    c4 = 0;
                                }
                                safeAppendWithMonthPattern(strArr5, relatedYear, stringBuffer, str);
                                capitalizationContextUsage3 = DateFormatSymbols.CapitalizationContextUsage.MONTH_FORMAT;
                            } else {
                                c4 = 0;
                                DateFormatSymbols dateFormatSymbols4 = this.formatData;
                                safeAppendWithMonthPattern(dateFormatSymbols4.standaloneMonths, relatedYear, stringBuffer, i8 != 0 ? dateFormatSymbols4.leapMonthPatterns[3] : null);
                                capitalizationContextUsage3 = DateFormatSymbols.CapitalizationContextUsage.MONTH_STANDALONE;
                            }
                            i6 = 3;
                            c3 = c4;
                        } else if (i == 3) {
                            if (indexFromChar == 2) {
                                DateFormatSymbols dateFormatSymbols5 = this.formatData;
                                safeAppendWithMonthPattern(dateFormatSymbols5.shortMonths, relatedYear, stringBuffer, i8 != 0 ? dateFormatSymbols5.leapMonthPatterns[1] : null);
                                capitalizationContextUsage3 = DateFormatSymbols.CapitalizationContextUsage.MONTH_FORMAT;
                            } else {
                                DateFormatSymbols dateFormatSymbols6 = this.formatData;
                                safeAppendWithMonthPattern(dateFormatSymbols6.standaloneShortMonths, relatedYear, stringBuffer, i8 != 0 ? dateFormatSymbols6.leapMonthPatterns[4] : null);
                                capitalizationContextUsage3 = DateFormatSymbols.CapitalizationContextUsage.MONTH_STANDALONE;
                            }
                            c3 = 0;
                            i6 = 3;
                        } else {
                            StringBuffer stringBuffer2 = new StringBuffer();
                            c3 = 0;
                            i5 = 3;
                            zeroPaddingNumber(numberFormat, stringBuffer2, relatedYear + 1, i, Integer.MAX_VALUE);
                            safeAppendWithMonthPattern(new String[]{stringBuffer2.toString()}, 0, stringBuffer, i8 != 0 ? this.formatData.leapMonthPatterns[6] : null);
                            i6 = i5;
                        }
                        capitalizationContextUsage2 = capitalizationContextUsage3;
                        if (i3 == 0) {
                        }
                        int indexFromChar22222 = getIndexFromChar(c2);
                        if (fieldPosition.getBeginIndex() != fieldPosition.getEndIndex()) {
                        }
                    }
                    break;
                case 3:
                case 5:
                case 6:
                case 7:
                case 10:
                case 11:
                case 12:
                case 13:
                case 16:
                case 20:
                case 21:
                case 22:
                case 34:
                default:
                    i6 = 3;
                    c3 = 0;
                    i4 = 2;
                    zeroPaddingNumber(numberFormat, stringBuffer, relatedYear, i, Integer.MAX_VALUE);
                    capitalizationContextUsage2 = capitalizationContextUsage3;
                    if (i3 == 0) {
                    }
                    int indexFromChar222222 = getIndexFromChar(c2);
                    if (fieldPosition.getBeginIndex() != fieldPosition.getEndIndex()) {
                    }
                    break;
                case 4:
                    i4 = 2;
                    if (relatedYear == 0) {
                        i9 = 3;
                        zeroPaddingNumber(numberFormat, stringBuffer, calendar.getMaximum(11) + 1, i, Integer.MAX_VALUE);
                        i6 = i9;
                        c3 = 0;
                        capitalizationContextUsage2 = capitalizationContextUsage3;
                        if (i3 == 0) {
                        }
                        int indexFromChar2222222 = getIndexFromChar(c2);
                        if (fieldPosition.getBeginIndex() != fieldPosition.getEndIndex()) {
                        }
                    } else {
                        i6 = 3;
                        zeroPaddingNumber(numberFormat, stringBuffer, relatedYear, i, Integer.MAX_VALUE);
                        c3 = 0;
                        capitalizationContextUsage2 = capitalizationContextUsage3;
                        if (i3 == 0) {
                        }
                        int indexFromChar22222222 = getIndexFromChar(c2);
                        if (fieldPosition.getBeginIndex() != fieldPosition.getEndIndex()) {
                        }
                    }
                    break;
                case 8:
                    i6 = 3;
                    i4 = 2;
                    this.numberFormat.setMinimumIntegerDigits(Math.min(3, i));
                    this.numberFormat.setMaximumIntegerDigits(Integer.MAX_VALUE);
                    if (i == 1) {
                        relatedYear /= 100;
                    } else if (i == 2) {
                        relatedYear /= 10;
                    }
                    FieldPosition fieldPosition2 = new FieldPosition(-1);
                    this.numberFormat.format(relatedYear, stringBuffer, fieldPosition2);
                    if (i > 3) {
                        this.numberFormat.setMinimumIntegerDigits(i - 3);
                        this.numberFormat.format(0L, stringBuffer, fieldPosition2);
                    }
                    c3 = 0;
                    capitalizationContextUsage2 = capitalizationContextUsage3;
                    if (i3 == 0) {
                    }
                    int indexFromChar222222222 = getIndexFromChar(c2);
                    if (fieldPosition.getBeginIndex() != fieldPosition.getEndIndex()) {
                    }
                    break;
                case 9:
                    i6 = 3;
                    i4 = 2;
                    i10 = 5;
                    if (i != i10) {
                        safeAppend(this.formatData.narrowWeekdays, relatedYear, stringBuffer);
                        capitalizationContextUsage3 = DateFormatSymbols.CapitalizationContextUsage.DAY_NARROW;
                    } else if (i == 4) {
                        safeAppend(this.formatData.weekdays, relatedYear, stringBuffer);
                        capitalizationContextUsage3 = DateFormatSymbols.CapitalizationContextUsage.DAY_FORMAT;
                    } else if (i == 6 && (strArr2 = this.formatData.shorterWeekdays) != null) {
                        safeAppend(strArr2, relatedYear, stringBuffer);
                        capitalizationContextUsage3 = DateFormatSymbols.CapitalizationContextUsage.DAY_FORMAT;
                    } else {
                        safeAppend(this.formatData.shortWeekdays, relatedYear, stringBuffer);
                        capitalizationContextUsage3 = DateFormatSymbols.CapitalizationContextUsage.DAY_FORMAT;
                    }
                    capitalizationContextUsage2 = capitalizationContextUsage3;
                    c3 = 0;
                    if (i3 == 0) {
                    }
                    int indexFromChar2222222222 = getIndexFromChar(c2);
                    if (fieldPosition.getBeginIndex() != fieldPosition.getEndIndex()) {
                    }
                    break;
                case 14:
                    i6 = 3;
                    i4 = 2;
                    if (i < 5 || (strArr = this.formatData.ampmsNarrow) == null) {
                        safeAppend(this.formatData.ampms, relatedYear, stringBuffer);
                    } else {
                        safeAppend(strArr, relatedYear, stringBuffer);
                    }
                    c3 = 0;
                    capitalizationContextUsage2 = capitalizationContextUsage3;
                    if (i3 == 0) {
                    }
                    int indexFromChar22222222222 = getIndexFromChar(c2);
                    if (fieldPosition.getBeginIndex() != fieldPosition.getEndIndex()) {
                    }
                    break;
                case 15:
                    i4 = 2;
                    if (relatedYear == 0) {
                        i9 = 3;
                        zeroPaddingNumber(numberFormat, stringBuffer, calendar.getLeastMaximum(10) + 1, i, Integer.MAX_VALUE);
                        i6 = i9;
                        c3 = 0;
                        capitalizationContextUsage2 = capitalizationContextUsage3;
                        if (i3 == 0) {
                        }
                        int indexFromChar222222222222 = getIndexFromChar(c2);
                        if (fieldPosition.getBeginIndex() != fieldPosition.getEndIndex()) {
                        }
                    } else {
                        i6 = 3;
                        zeroPaddingNumber(numberFormat, stringBuffer, relatedYear, i, Integer.MAX_VALUE);
                        c3 = 0;
                        capitalizationContextUsage2 = capitalizationContextUsage3;
                        if (i3 == 0) {
                        }
                        int indexFromChar2222222222222 = getIndexFromChar(c2);
                        if (fieldPosition.getBeginIndex() != fieldPosition.getEndIndex()) {
                        }
                    }
                    break;
                case 17:
                    if (i < 4) {
                        str = tzFormat().format(TimeZoneFormat.Style.SPECIFIC_SHORT, timeZone, timeInMillis);
                        capitalizationContextUsage = DateFormatSymbols.CapitalizationContextUsage.METAZONE_SHORT;
                    } else {
                        str = tzFormat().format(TimeZoneFormat.Style.SPECIFIC_LONG, timeZone, timeInMillis);
                        capitalizationContextUsage = DateFormatSymbols.CapitalizationContextUsage.METAZONE_LONG;
                    }
                    capitalizationContextUsage3 = capitalizationContextUsage;
                    stringBuffer.append(str);
                    i6 = 3;
                    i4 = 2;
                    capitalizationContextUsage2 = capitalizationContextUsage3;
                    c3 = 0;
                    if (i3 == 0) {
                    }
                    int indexFromChar22222222222222 = getIndexFromChar(c2);
                    if (fieldPosition.getBeginIndex() != fieldPosition.getEndIndex()) {
                    }
                    break;
                case 19:
                    if (i < 3) {
                        zeroPaddingNumber(numberFormat, stringBuffer, relatedYear, i, Integer.MAX_VALUE);
                        i6 = 3;
                        c3 = 0;
                        i4 = 2;
                        capitalizationContextUsage2 = capitalizationContextUsage3;
                        if (i3 == 0) {
                        }
                        int indexFromChar222222222222222 = getIndexFromChar(c2);
                        if (fieldPosition.getBeginIndex() != fieldPosition.getEndIndex()) {
                        }
                    } else {
                        relatedYear = calendar.get(7);
                        i6 = 3;
                        i10 = 5;
                        i4 = 2;
                        if (i != i10) {
                        }
                        capitalizationContextUsage2 = capitalizationContextUsage3;
                        c3 = 0;
                        if (i3 == 0) {
                        }
                        int indexFromChar2222222222222222 = getIndexFromChar(c2);
                        if (fieldPosition.getBeginIndex() != fieldPosition.getEndIndex()) {
                        }
                    }
                    break;
                case 23:
                    i9 = 3;
                    if (i < 4) {
                        str2 = tzFormat().format(TimeZoneFormat.Style.ISO_BASIC_LOCAL_FULL, timeZone, timeInMillis);
                    } else if (i == 5) {
                        str2 = tzFormat().format(TimeZoneFormat.Style.ISO_EXTENDED_FULL, timeZone, timeInMillis);
                    } else {
                        str2 = tzFormat().format(TimeZoneFormat.Style.LOCALIZED_GMT, timeZone, timeInMillis);
                    }
                    stringBuffer.append(str2);
                    i4 = 2;
                    i6 = i9;
                    c3 = 0;
                    capitalizationContextUsage2 = capitalizationContextUsage3;
                    if (i3 == 0) {
                    }
                    int indexFromChar22222222222222222 = getIndexFromChar(c2);
                    if (fieldPosition.getBeginIndex() != fieldPosition.getEndIndex()) {
                    }
                    break;
                case 24:
                    i11 = 3;
                    if (i == 1) {
                        str = tzFormat().format(TimeZoneFormat.Style.GENERIC_SHORT, timeZone, timeInMillis);
                        capitalizationContextUsage3 = DateFormatSymbols.CapitalizationContextUsage.METAZONE_SHORT;
                    } else if (i == 4) {
                        str = tzFormat().format(TimeZoneFormat.Style.GENERIC_LONG, timeZone, timeInMillis);
                        capitalizationContextUsage3 = DateFormatSymbols.CapitalizationContextUsage.METAZONE_LONG;
                    }
                    stringBuffer.append(str);
                    i4 = 2;
                    i6 = i11;
                    capitalizationContextUsage2 = capitalizationContextUsage3;
                    c3 = 0;
                    if (i3 == 0) {
                    }
                    int indexFromChar222222222222222222 = getIndexFromChar(c2);
                    if (fieldPosition.getBeginIndex() != fieldPosition.getEndIndex()) {
                    }
                    break;
                case 25:
                    i4 = 2;
                    if (i < 3) {
                        i9 = 3;
                        zeroPaddingNumber(numberFormat, stringBuffer, relatedYear, 1, Integer.MAX_VALUE);
                        i6 = i9;
                        c3 = 0;
                        capitalizationContextUsage2 = capitalizationContextUsage3;
                        if (i3 == 0) {
                        }
                        int indexFromChar2222222222222222222 = getIndexFromChar(c2);
                        if (fieldPosition.getBeginIndex() != fieldPosition.getEndIndex()) {
                        }
                    } else {
                        i11 = 3;
                        int i16 = calendar.get(7);
                        if (i == 5) {
                            safeAppend(this.formatData.standaloneNarrowWeekdays, i16, stringBuffer);
                            capitalizationContextUsage3 = DateFormatSymbols.CapitalizationContextUsage.DAY_NARROW;
                        } else if (i == 4) {
                            safeAppend(this.formatData.standaloneWeekdays, i16, stringBuffer);
                            capitalizationContextUsage3 = DateFormatSymbols.CapitalizationContextUsage.DAY_STANDALONE;
                        } else if (i == 6 && (strArr3 = this.formatData.standaloneShorterWeekdays) != null) {
                            safeAppend(strArr3, i16, stringBuffer);
                            capitalizationContextUsage3 = DateFormatSymbols.CapitalizationContextUsage.DAY_STANDALONE;
                        } else {
                            safeAppend(this.formatData.standaloneShortWeekdays, i16, stringBuffer);
                            capitalizationContextUsage3 = DateFormatSymbols.CapitalizationContextUsage.DAY_STANDALONE;
                        }
                        i6 = i11;
                        capitalizationContextUsage2 = capitalizationContextUsage3;
                        c3 = 0;
                        if (i3 == 0) {
                        }
                        int indexFromChar22222222222222222222 = getIndexFromChar(c2);
                        if (fieldPosition.getBeginIndex() != fieldPosition.getEndIndex()) {
                        }
                    }
                    break;
                case 27:
                    i6 = 3;
                    i4 = 2;
                    if (i >= 4) {
                        safeAppend(this.formatData.quarters, relatedYear / 3, stringBuffer);
                    } else if (i == 3) {
                        safeAppend(this.formatData.shortQuarters, relatedYear / 3, stringBuffer);
                    } else {
                        zeroPaddingNumber(numberFormat, stringBuffer, (relatedYear / 3) + 1, i, Integer.MAX_VALUE);
                    }
                    c3 = 0;
                    capitalizationContextUsage2 = capitalizationContextUsage3;
                    if (i3 == 0) {
                    }
                    int indexFromChar222222222222222222222 = getIndexFromChar(c2);
                    if (fieldPosition.getBeginIndex() != fieldPosition.getEndIndex()) {
                    }
                    break;
                case 28:
                    i12 = 3;
                    i13 = 2;
                    if (i >= 4) {
                        safeAppend(this.formatData.standaloneQuarters, relatedYear / 3, stringBuffer);
                    } else if (i == 3) {
                        safeAppend(this.formatData.standaloneShortQuarters, relatedYear / 3, stringBuffer);
                    } else {
                        i6 = 3;
                        zeroPaddingNumber(numberFormat, stringBuffer, (relatedYear / 3) + 1, i, Integer.MAX_VALUE);
                        i4 = 2;
                        c3 = 0;
                        capitalizationContextUsage2 = capitalizationContextUsage3;
                        if (i3 == 0) {
                        }
                        int indexFromChar2222222222222222222222 = getIndexFromChar(c2);
                        if (fieldPosition.getBeginIndex() != fieldPosition.getEndIndex()) {
                        }
                    }
                    i6 = i12;
                    i4 = i13;
                    c3 = 0;
                    capitalizationContextUsage2 = capitalizationContextUsage3;
                    if (i3 == 0) {
                    }
                    int indexFromChar22222222222222222222222 = getIndexFromChar(c2);
                    if (fieldPosition.getBeginIndex() != fieldPosition.getEndIndex()) {
                    }
                    break;
                case 29:
                    if (i == 1) {
                        str = tzFormat().format(TimeZoneFormat.Style.ZONE_ID_SHORT, timeZone, timeInMillis);
                    } else if (i == 2) {
                        str = tzFormat().format(TimeZoneFormat.Style.ZONE_ID, timeZone, timeInMillis);
                    } else if (i == 3) {
                        str = tzFormat().format(TimeZoneFormat.Style.EXEMPLAR_LOCATION, timeZone, timeInMillis);
                    } else if (i == 4) {
                        str = tzFormat().format(TimeZoneFormat.Style.GENERIC_LOCATION, timeZone, timeInMillis);
                        capitalizationContextUsage3 = DateFormatSymbols.CapitalizationContextUsage.ZONE_LONG;
                    }
                    stringBuffer.append(str);
                    i6 = 3;
                    i4 = 2;
                    capitalizationContextUsage2 = capitalizationContextUsage3;
                    c3 = 0;
                    if (i3 == 0) {
                    }
                    int indexFromChar222222222222222222222222 = getIndexFromChar(c2);
                    if (fieldPosition.getBeginIndex() != fieldPosition.getEndIndex()) {
                    }
                    break;
                case 30:
                    i12 = 3;
                    i13 = 2;
                    String[] strArr6 = this.formatData.shortYearNames;
                    if (strArr6 != null && relatedYear <= strArr6.length) {
                        safeAppend(strArr6, relatedYear - 1, stringBuffer);
                        i6 = i12;
                        i4 = i13;
                        c3 = 0;
                        capitalizationContextUsage2 = capitalizationContextUsage3;
                        if (i3 == 0) {
                        }
                        int indexFromChar2222222222222222222222222 = getIndexFromChar(c2);
                        if (fieldPosition.getBeginIndex() != fieldPosition.getEndIndex()) {
                        }
                    } else {
                        i6 = 3;
                        i4 = 2;
                        c3 = 0;
                        str3 = this.override;
                        if (str3 != null) {
                            relatedYear -= 5000;
                        }
                        if (i != i4) {
                        }
                        capitalizationContextUsage2 = capitalizationContextUsage3;
                        if (i3 == 0) {
                        }
                        int indexFromChar22222222222222222222222222 = getIndexFromChar(c2);
                        if (fieldPosition.getBeginIndex() != fieldPosition.getEndIndex()) {
                        }
                    }
                    break;
                case 31:
                    i12 = 3;
                    i13 = 2;
                    if (i == 1) {
                        str = tzFormat().format(TimeZoneFormat.Style.LOCALIZED_GMT_SHORT, timeZone, timeInMillis);
                    } else if (i == 4) {
                        str = tzFormat().format(TimeZoneFormat.Style.LOCALIZED_GMT, timeZone, timeInMillis);
                    }
                    stringBuffer.append(str);
                    i6 = i12;
                    i4 = i13;
                    c3 = 0;
                    capitalizationContextUsage2 = capitalizationContextUsage3;
                    if (i3 == 0) {
                    }
                    int indexFromChar222222222222222222222222222 = getIndexFromChar(c2);
                    if (fieldPosition.getBeginIndex() != fieldPosition.getEndIndex()) {
                    }
                    break;
                case 32:
                    i12 = 3;
                    i13 = 2;
                    if (i == 1) {
                        str = tzFormat().format(TimeZoneFormat.Style.ISO_BASIC_SHORT, timeZone, timeInMillis);
                    } else if (i == 2) {
                        str = tzFormat().format(TimeZoneFormat.Style.ISO_BASIC_FIXED, timeZone, timeInMillis);
                    } else if (i == 3) {
                        str = tzFormat().format(TimeZoneFormat.Style.ISO_EXTENDED_FIXED, timeZone, timeInMillis);
                    } else if (i == 4) {
                        str = tzFormat().format(TimeZoneFormat.Style.ISO_BASIC_FULL, timeZone, timeInMillis);
                    } else if (i == 5) {
                        str = tzFormat().format(TimeZoneFormat.Style.ISO_EXTENDED_FULL, timeZone, timeInMillis);
                    }
                    stringBuffer.append(str);
                    i6 = i12;
                    i4 = i13;
                    c3 = 0;
                    capitalizationContextUsage2 = capitalizationContextUsage3;
                    if (i3 == 0) {
                    }
                    int indexFromChar2222222222222222222222222222 = getIndexFromChar(c2);
                    if (fieldPosition.getBeginIndex() != fieldPosition.getEndIndex()) {
                    }
                    break;
                case 33:
                    if (i == 1) {
                        str4 = tzFormat().format(TimeZoneFormat.Style.ISO_BASIC_LOCAL_SHORT, timeZone, timeInMillis);
                        i12 = 3;
                        i13 = 2;
                    } else {
                        i13 = 2;
                        if (i == 2) {
                            str4 = tzFormat().format(TimeZoneFormat.Style.ISO_BASIC_LOCAL_FIXED, timeZone, timeInMillis);
                            i12 = 3;
                        } else {
                            i12 = 3;
                            if (i == 3) {
                                str = tzFormat().format(TimeZoneFormat.Style.ISO_EXTENDED_LOCAL_FIXED, timeZone, timeInMillis);
                            } else if (i == 4) {
                                str = tzFormat().format(TimeZoneFormat.Style.ISO_BASIC_LOCAL_FULL, timeZone, timeInMillis);
                            } else if (i == 5) {
                                str = tzFormat().format(TimeZoneFormat.Style.ISO_EXTENDED_LOCAL_FULL, timeZone, timeInMillis);
                            }
                            str4 = str;
                        }
                    }
                    stringBuffer.append(str4);
                    i6 = i12;
                    i4 = i13;
                    c3 = 0;
                    capitalizationContextUsage2 = capitalizationContextUsage3;
                    if (i3 == 0) {
                    }
                    int indexFromChar22222222222222222222222222222 = getIndexFromChar(c2);
                    if (fieldPosition.getBeginIndex() != fieldPosition.getEndIndex()) {
                    }
                    break;
                case 35:
                    if (calendar.get(11) == 12 && ((!this.hasMinute || calendar.get(12) == 0) && (!this.hasSecond || calendar.get(13) == 0))) {
                        int i17 = calendar.get(9);
                        if (i <= 3) {
                            str = this.formatData.abbreviatedDayPeriods[i17];
                        } else if (i == 4 || i > 5) {
                            str = this.formatData.wideDayPeriods[i17];
                        } else {
                            str = this.formatData.narrowDayPeriods[i17];
                        }
                    }
                    String str5 = str;
                    if (str5 == null) {
                        subFormat(stringBuffer, 'a', i, i2, i3, displayContext, fieldPosition, 'b', calendar);
                    } else {
                        stringBuffer.append(str5);
                    }
                    c3 = 0;
                    i4 = 2;
                    i6 = 3;
                    capitalizationContextUsage2 = capitalizationContextUsage3;
                    if (i3 == 0) {
                    }
                    int indexFromChar222222222222222222222222222222 = getIndexFromChar(c2);
                    if (fieldPosition.getBeginIndex() != fieldPosition.getEndIndex()) {
                    }
                    break;
                case 36:
                    DayPeriodRules dayPeriodRulesCopydefault = DayPeriodRules.copydefault(getLocale());
                    if (dayPeriodRulesCopydefault == null) {
                        subFormat(stringBuffer, 'a', i, i2, i3, displayContext, fieldPosition, 'B', calendar);
                        return;
                    }
                    int i18 = calendar.get(11);
                    int i19 = this.hasMinute ? calendar.get(12) : 0;
                    int i20 = this.hasSecond ? calendar.get(13) : 0;
                    if (i18 == 0 && i19 == 0 && i20 == 0 && dayPeriodRulesCopydefault.EZpvd()) {
                        dayPeriodAEQbTJ = DayPeriodRules.DayPeriod.MIDNIGHT;
                    } else if (i18 == 12 && i19 == 0 && i20 == 0 && dayPeriodRulesCopydefault.OLrzqt()) {
                        dayPeriodAEQbTJ = DayPeriodRules.DayPeriod.NOON;
                    } else {
                        dayPeriodAEQbTJ = dayPeriodRulesCopydefault.AEQbTJ(i18);
                    }
                    DayPeriodRules.DayPeriod dayPeriod = DayPeriodRules.DayPeriod.AM;
                    if (dayPeriodAEQbTJ != dayPeriod && dayPeriodAEQbTJ != DayPeriodRules.DayPeriod.PM && dayPeriodAEQbTJ != DayPeriodRules.DayPeriod.MIDNIGHT) {
                        int iOrdinal = dayPeriodAEQbTJ.ordinal();
                        if (i <= 3) {
                            str = this.formatData.abbreviatedDayPeriods[iOrdinal];
                        } else if (i == 4 || i > 5) {
                            str = this.formatData.wideDayPeriods[iOrdinal];
                        } else {
                            str = this.formatData.narrowDayPeriods[iOrdinal];
                        }
                    }
                    if (str == null && (dayPeriodAEQbTJ == DayPeriodRules.DayPeriod.MIDNIGHT || dayPeriodAEQbTJ == DayPeriodRules.DayPeriod.NOON)) {
                        dayPeriodAEQbTJ = dayPeriodRulesCopydefault.AEQbTJ(i18);
                        int iOrdinal2 = dayPeriodAEQbTJ.ordinal();
                        if (i <= 3) {
                            str = this.formatData.abbreviatedDayPeriods[iOrdinal2];
                        } else if (i == 4 || i > 5) {
                            str = this.formatData.wideDayPeriods[iOrdinal2];
                        } else {
                            str = this.formatData.narrowDayPeriods[iOrdinal2];
                        }
                    }
                    String str6 = str;
                    if (dayPeriodAEQbTJ == dayPeriod || dayPeriodAEQbTJ == DayPeriodRules.DayPeriod.PM || str6 == null) {
                        subFormat(stringBuffer, 'a', i, i2, i3, displayContext, fieldPosition, 'B', calendar);
                        return;
                    }
                    stringBuffer.append(str6);
                    i6 = 3;
                    c3 = 0;
                    i4 = 2;
                    capitalizationContextUsage2 = capitalizationContextUsage3;
                    if (i3 == 0) {
                    }
                    int indexFromChar2222222222222222222222222222222 = getIndexFromChar(c2);
                    if (fieldPosition.getBeginIndex() != fieldPosition.getEndIndex()) {
                    }
                    break;
                case 37:
                    stringBuffer.append(this.formatData.getTimeSeparatorString());
                    i6 = 3;
                    c3 = 0;
                    i4 = 2;
                    capitalizationContextUsage2 = capitalizationContextUsage3;
                    if (i3 == 0) {
                    }
                    int indexFromChar22222222222222222222222222222222 = getIndexFromChar(c2);
                    if (fieldPosition.getBeginIndex() != fieldPosition.getEndIndex()) {
                    }
                    break;
            }
        } else {
            if (c == 'l') {
                return;
            }
            throw new IllegalArgumentException("Illegal pattern character '" + c + "' in \"" + this.pattern + '\"');
        }
    }

    /* JADX INFO: renamed from: com.ibm.icu.text.SimpleDateFormat$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] EZpvd;

        static {
            int[] iArr = new int[DisplayContext.values().length];
            EZpvd = iArr;
            try {
                iArr[DisplayContext.CAPITALIZATION_FOR_BEGINNING_OF_SENTENCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                EZpvd[DisplayContext.CAPITALIZATION_FOR_UI_LIST_OR_MENU.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                EZpvd[DisplayContext.CAPITALIZATION_FOR_STANDALONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private static void safeAppend(String[] strArr, int i, StringBuffer stringBuffer) {
        if (strArr == null || i < 0 || i >= strArr.length) {
            return;
        }
        stringBuffer.append(strArr[i]);
    }

    private static void safeAppendWithMonthPattern(String[] strArr, int i, StringBuffer stringBuffer, String str) {
        if (strArr == null || i < 0 || i >= strArr.length) {
            return;
        }
        if (str == null) {
            stringBuffer.append(strArr[i]);
        } else {
            stringBuffer.append(C7028acB.OLrzqt(str, 1, 1, strArr[i]));
        }
    }

    public static class Activity {
        public final boolean EZpvd;
        public final int OLrzqt;
        public final char copydefault;

        public Activity(char c, int i) {
            this.copydefault = c;
            this.OLrzqt = i;
            this.EZpvd = SimpleDateFormat.isNumeric(c, i);
        }
    }

    private Object[] getPatternItems() {
        Object[] objArr = this.patternItems;
        if (objArr != null) {
            return objArr;
        }
        Object[] objArrEZpvd = PARSED_PATTERN_CACHE.EZpvd(this.pattern);
        this.patternItems = objArrEZpvd;
        if (objArrEZpvd != null) {
            return objArrEZpvd;
        }
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        int i = 1;
        char c = 0;
        boolean z = false;
        boolean z2 = false;
        for (int i2 = 0; i2 < this.pattern.length(); i2++) {
            char cCharAt = this.pattern.charAt(i2);
            if (cCharAt == '\'') {
                if (z2) {
                    sb.append('\'');
                    z2 = false;
                } else if (c != 0) {
                    arrayList.add(new Activity(c, i));
                    z2 = true;
                    c = 0;
                } else {
                    z2 = true;
                }
                z = !z;
            } else {
                if (z) {
                    sb.append(cCharAt);
                } else if (!isSyntaxChar(cCharAt)) {
                    if (c != 0) {
                        arrayList.add(new Activity(c, i));
                        c = 0;
                    }
                    sb.append(cCharAt);
                } else if (cCharAt == c) {
                    i++;
                } else {
                    if (c == 0) {
                        if (sb.length() > 0) {
                            arrayList.add(sb.toString());
                            sb.setLength(0);
                        }
                    } else {
                        arrayList.add(new Activity(c, i));
                    }
                    i = 1;
                    z2 = false;
                    c = cCharAt;
                }
                z2 = false;
            }
        }
        if (c == 0) {
            if (sb.length() > 0) {
                arrayList.add(sb.toString());
                sb.setLength(0);
            }
        } else {
            arrayList.add(new Activity(c, i));
        }
        Object[] array = arrayList.toArray(new Object[arrayList.size()]);
        this.patternItems = array;
        PARSED_PATTERN_CACHE.KWHzl(this.pattern, array);
        return this.patternItems;
    }

    @Deprecated
    public void zeroPaddingNumber(NumberFormat numberFormat, StringBuffer stringBuffer, int i, int i2, int i3) {
        if (this.useLocalZeroPaddingNumberFormat && i >= 0) {
            fastZeroPaddingNumber(stringBuffer, i, i2, i3);
            return;
        }
        numberFormat.setMinimumIntegerDigits(i2);
        numberFormat.setMaximumIntegerDigits(i3);
        numberFormat.format(i, stringBuffer, new FieldPosition(-1));
    }

    @Override // com.ibm.icu.text.DateFormat
    public void setNumberFormat(NumberFormat numberFormat) {
        super.setNumberFormat(numberFormat);
        initLocalZeroPaddingNumberFormat();
        initializeTimeZoneFormat(true);
        if (this.numberFormatters != null) {
            this.numberFormatters = null;
        }
        if (this.overrideMap != null) {
            this.overrideMap = null;
        }
    }

    private void initLocalZeroPaddingNumberFormat() {
        NumberFormat numberFormat = this.numberFormat;
        if (numberFormat instanceof DecimalFormat) {
            String[] digitStringsLocal = ((DecimalFormat) numberFormat).getDecimalFormatSymbols().getDigitStringsLocal();
            this.useLocalZeroPaddingNumberFormat = true;
            this.decDigits = new char[10];
            int i = 0;
            while (true) {
                if (i >= 10) {
                    break;
                }
                if (digitStringsLocal[i].length() > 1) {
                    this.useLocalZeroPaddingNumberFormat = false;
                    break;
                } else {
                    this.decDigits[i] = digitStringsLocal[i].charAt(0);
                    i++;
                }
            }
        } else if (numberFormat instanceof DateNumberFormat) {
            this.decDigits = ((DateNumberFormat) numberFormat).getDigits();
            this.useLocalZeroPaddingNumberFormat = true;
        } else {
            this.useLocalZeroPaddingNumberFormat = false;
        }
        if (this.useLocalZeroPaddingNumberFormat) {
            this.decimalBuf = new char[10];
        }
    }

    private void fastZeroPaddingNumber(StringBuffer stringBuffer, int i, int i2, int i3) {
        char[] cArr = this.decimalBuf;
        if (cArr.length < i3) {
            i3 = cArr.length;
        }
        int i4 = i3 - 1;
        while (true) {
            this.decimalBuf[i4] = this.decDigits[i % 10];
            i /= 10;
            if (i4 == 0 || i == 0) {
                break;
            } else {
                i4--;
            }
        }
        int i5 = i2 - (i3 - i4);
        while (i5 > 0 && i4 > 0) {
            i4--;
            this.decimalBuf[i4] = this.decDigits[0];
            i5--;
        }
        while (i5 > 0) {
            stringBuffer.append(this.decDigits[0]);
            i5--;
        }
        stringBuffer.append(this.decimalBuf, i4, i3 - i4);
    }

    public String zeroPaddingNumber(long j, int i, int i2) {
        this.numberFormat.setMinimumIntegerDigits(i);
        this.numberFormat.setMaximumIntegerDigits(i2);
        return this.numberFormat.format(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isNumeric(char c, int i) {
        return NUMERIC_FORMAT_CHARS.indexOf(c) >= 0 || (i <= 2 && NUMERIC_FORMAT_CHARS2.indexOf(c) >= 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x011e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00af  */
    @Override // com.ibm.icu.text.DateFormat
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void parse(String str, Calendar calendar, ParsePosition parsePosition) {
        Calendar calendar2;
        TimeZone timeZone;
        Calendar calendar3;
        int i;
        int i2;
        int dSTSavings;
        int i3;
        C7261agW previousTransition;
        C7261agW nextTransition;
        int i4;
        int i5;
        boolean[] zArr;
        C7255agQ<TimeZoneFormat.TimeType> c7255agQ;
        C7255agQ<DayPeriodRules.DayPeriod> c7255agQ2;
        int i6;
        TimeZone timeZone2;
        Calendar calendar4;
        int i7;
        Object[] objArr;
        Calendar calendar5;
        int i8;
        int i9;
        int i10;
        int iSubParse;
        int i11;
        int i12;
        if (calendar == this.calendar || calendar.getType().equals(this.calendar.getType())) {
            calendar2 = calendar;
            timeZone = null;
            calendar3 = null;
        } else {
            this.calendar.setTimeInMillis(calendar.getTimeInMillis());
            TimeZone timeZone3 = this.calendar.getTimeZone();
            this.calendar.setTimeZone(calendar.getTimeZone());
            timeZone = timeZone3;
            calendar3 = calendar;
            calendar2 = this.calendar;
        }
        int index = parsePosition.getIndex();
        if (index < 0) {
            parsePosition.setErrorIndex(0);
            return;
        }
        C7255agQ<DayPeriodRules.DayPeriod> c7255agQ3 = new C7255agQ<>(null);
        C7255agQ<TimeZoneFormat.TimeType> c7255agQ4 = new C7255agQ<>(TimeZoneFormat.TimeType.UNKNOWN);
        boolean[] zArr2 = {false};
        String[] strArr = this.formatData.leapMonthPatterns;
        MessageFormat messageFormat = (strArr == null || strArr.length < 7) ? null : new MessageFormat(this.formatData.leapMonthPatterns[6], this.locale);
        Object[] patternItems = getPatternItems();
        int i13 = -1;
        int i14 = -1;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = index;
        while (i15 < patternItems.length) {
            Object obj = patternItems[i15];
            if (obj instanceof Activity) {
                Activity activity = (Activity) obj;
                if (activity.EZpvd && i14 == i13 && (i12 = i15 + 1) < patternItems.length) {
                    Object obj2 = patternItems[i12];
                    if ((obj2 instanceof Activity) && ((Activity) obj2).EZpvd) {
                        i10 = i15;
                        i17 = i18;
                        i16 = activity.OLrzqt;
                    }
                    if (i10 == -1) {
                    }
                    i14 = i11;
                    i7 = 1;
                    i8 = iSubParse;
                } else {
                    i10 = i14;
                    if (i10 == -1) {
                        int i19 = activity.OLrzqt;
                        if (i10 == i15) {
                            i19 = i16;
                        }
                        int i20 = i15;
                        i5 = -1;
                        Object[] objArr2 = patternItems;
                        zArr = zArr2;
                        c7255agQ = c7255agQ4;
                        c7255agQ2 = c7255agQ3;
                        int i21 = index;
                        int i22 = i10;
                        timeZone2 = timeZone;
                        iSubParse = subParse(str, i18, activity.copydefault, i19, true, false, zArr, calendar2, messageFormat, c7255agQ);
                        if (iSubParse < 0) {
                            i16--;
                            if (i16 == 0) {
                                parsePosition.setIndex(i21);
                                parsePosition.setErrorIndex(iSubParse);
                                if (timeZone2 != null) {
                                    this.calendar.setTimeZone(timeZone2);
                                    return;
                                }
                                return;
                            }
                            c7255agQ4 = c7255agQ;
                            timeZone = timeZone2;
                            i18 = i17;
                            i15 = i22;
                            i14 = i15;
                            c7255agQ3 = c7255agQ2;
                            i13 = -1;
                            patternItems = objArr2;
                            zArr2 = zArr;
                            index = i21;
                        } else {
                            calendar4 = calendar3;
                            i11 = i22;
                            i9 = i20;
                            objArr = objArr2;
                            i6 = i21;
                            calendar5 = calendar2;
                        }
                    } else {
                        int i23 = i15;
                        int i24 = i18;
                        i5 = -1;
                        Object[] objArr3 = patternItems;
                        zArr = zArr2;
                        c7255agQ = c7255agQ4;
                        c7255agQ2 = c7255agQ3;
                        int i25 = i10;
                        timeZone2 = timeZone;
                        int i26 = index;
                        char c = activity.copydefault;
                        if (c != 'l') {
                            calendar4 = calendar3;
                            calendar5 = calendar2;
                            iSubParse = subParse(str, i24, c, activity.OLrzqt, false, true, zArr, calendar2, messageFormat, c7255agQ, c7255agQ2);
                            if (iSubParse >= 0) {
                                objArr = objArr3;
                                i6 = i26;
                            } else if (iSubParse == ISOSpecialEra) {
                                i9 = i23 + 1;
                                objArr = objArr3;
                                if (i9 < objArr.length) {
                                    try {
                                        Object obj3 = objArr[i9];
                                        String str2 = (String) obj3;
                                        if (str2 == null) {
                                            str2 = (String) obj3;
                                        }
                                        int length = str2.length();
                                        int i27 = 0;
                                        while (i27 < length && C7070acr.AEQbTJ(str2.charAt(i27))) {
                                            i27++;
                                        }
                                        if (i27 != length) {
                                            i9 = i23;
                                        }
                                        iSubParse = i24;
                                        i11 = -1;
                                        i6 = i26;
                                    } catch (ClassCastException unused) {
                                        parsePosition.setIndex(i26);
                                        parsePosition.setErrorIndex(i24);
                                        if (timeZone2 != null) {
                                            this.calendar.setTimeZone(timeZone2);
                                            return;
                                        }
                                        return;
                                    }
                                } else {
                                    i6 = i26;
                                    iSubParse = i24;
                                }
                            } else {
                                parsePosition.setIndex(i26);
                                parsePosition.setErrorIndex(i24);
                                if (timeZone2 != null) {
                                    this.calendar.setTimeZone(timeZone2);
                                    return;
                                }
                                return;
                            }
                            i9 = i23;
                            i11 = -1;
                        } else {
                            i6 = i26;
                            calendar4 = calendar3;
                            objArr = objArr3;
                            calendar5 = calendar2;
                            iSubParse = i24;
                            i11 = i25;
                            i9 = i23;
                        }
                    }
                    i14 = i11;
                    i7 = 1;
                    i8 = iSubParse;
                }
            } else {
                int i28 = i15;
                i5 = i13;
                zArr = zArr2;
                c7255agQ = c7255agQ4;
                c7255agQ2 = c7255agQ3;
                i6 = index;
                timeZone2 = timeZone;
                calendar4 = calendar3;
                i7 = 1;
                objArr = patternItems;
                calendar5 = calendar2;
                boolean[] zArr3 = new boolean[1];
                int iMatchLiteral = matchLiteral(str, i18, patternItems, i28, zArr3);
                if (!zArr3[0]) {
                    parsePosition.setIndex(i6);
                    parsePosition.setErrorIndex(iMatchLiteral);
                    if (timeZone2 != null) {
                        this.calendar.setTimeZone(timeZone2);
                        return;
                    }
                    return;
                }
                i8 = iMatchLiteral;
                i9 = i28;
                i14 = i5;
            }
            i15 = i9 + i7;
            i18 = i8;
            patternItems = objArr;
            index = i6;
            timeZone = timeZone2;
            calendar2 = calendar5;
            c7255agQ3 = c7255agQ2;
            calendar3 = calendar4;
            i13 = i5;
            zArr2 = zArr;
            c7255agQ4 = c7255agQ;
        }
        boolean[] zArr4 = zArr2;
        C7255agQ<TimeZoneFormat.TimeType> c7255agQ5 = c7255agQ4;
        C7255agQ<DayPeriodRules.DayPeriod> c7255agQ6 = c7255agQ3;
        int i29 = index;
        TimeZone timeZone4 = timeZone;
        Calendar calendar6 = calendar3;
        int i30 = i18;
        Object[] objArr4 = patternItems;
        Calendar calendar7 = calendar2;
        if (i30 >= str.length() || str.charAt(i30) != '.' || !getBooleanAttribute(DateFormat.BooleanAttribute.PARSE_ALLOW_WHITESPACE) || objArr4.length == 0) {
            i = i30;
        } else {
            Object obj4 = objArr4[objArr4.length - 1];
            if ((obj4 instanceof Activity) && !((Activity) obj4).EZpvd) {
                i = i30 + 1;
            }
        }
        if (c7255agQ6.copydefault != null) {
            DayPeriodRules dayPeriodRulesCopydefault = DayPeriodRules.copydefault(getLocale());
            if (!calendar7.isSet(10) && !calendar7.isSet(11)) {
                double dKWHzl = dayPeriodRulesCopydefault.KWHzl(c7255agQ6.copydefault);
                int i31 = (int) dKWHzl;
                int i32 = dKWHzl - ((double) i31) > AudioStats.AUDIO_AMPLITUDE_NONE ? 30 : 0;
                calendar7.set(11, i31);
                calendar7.set(12, i32);
            } else {
                if (calendar7.isSet(11)) {
                    i4 = calendar7.get(11);
                } else {
                    i4 = calendar7.get(10);
                    if (i4 == 0) {
                        i4 = 12;
                    }
                }
                if (i4 == 0 || (13 <= i4 && i4 <= 23)) {
                    calendar7.set(11, i4);
                } else {
                    if (i4 == 12) {
                        i4 = 0;
                    }
                    double dKWHzl2 = (((double) i4) + (((double) calendar7.get(12)) / 60.0d)) - dayPeriodRulesCopydefault.KWHzl(c7255agQ6.copydefault);
                    if (-6.0d <= dKWHzl2 && dKWHzl2 < 6.0d) {
                        calendar7.set(9, 0);
                    } else {
                        calendar7.set(9, 1);
                    }
                }
            }
        }
        parsePosition.setIndex(i);
        try {
            TimeZoneFormat.TimeType timeType = c7255agQ5.copydefault;
            boolean z = zArr4[0];
            if (z || timeType != TimeZoneFormat.TimeType.UNKNOWN) {
                if (z && ((Calendar) calendar7.clone()).getTime().before(getDefaultCenturyStart())) {
                    calendar7.set(1, getDefaultCenturyStartYear() + 100);
                }
                if (timeType != TimeZoneFormat.TimeType.UNKNOWN) {
                    Calendar calendar8 = (Calendar) calendar7.clone();
                    TimeZone timeZone5 = calendar8.getTimeZone();
                    BasicTimeZone basicTimeZone = timeZone5 instanceof BasicTimeZone ? (BasicTimeZone) timeZone5 : null;
                    calendar8.set(15, 0);
                    calendar8.set(16, 0);
                    long timeInMillis = calendar8.getTimeInMillis();
                    int[] iArr = new int[2];
                    if (basicTimeZone != null) {
                        if (timeType == TimeZoneFormat.TimeType.STANDARD) {
                            basicTimeZone.getOffsetFromLocal(timeInMillis, 1, 1, iArr);
                        } else {
                            basicTimeZone.getOffsetFromLocal(timeInMillis, 3, 3, iArr);
                        }
                    } else {
                        timeZone5.getOffset(timeInMillis, true, iArr);
                        if ((timeType == TimeZoneFormat.TimeType.STANDARD && iArr[1] != 0) || (timeType == TimeZoneFormat.TimeType.DAYLIGHT && iArr[1] == 0)) {
                            i2 = i29;
                            try {
                                timeZone5.getOffset(timeInMillis - CalendarModelKt.MillisecondsIn24Hours, true, iArr);
                            } catch (IllegalArgumentException unused2) {
                                parsePosition.setErrorIndex(i);
                                parsePosition.setIndex(i2);
                                if (timeZone4 != null) {
                                    this.calendar.setTimeZone(timeZone4);
                                    return;
                                }
                                return;
                            }
                        }
                        int i33 = iArr[1];
                        if (timeType != TimeZoneFormat.TimeType.STANDARD) {
                            i3 = i33 != 0 ? 0 : i33;
                            calendar7.set(15, iArr[0]);
                            calendar7.set(16, i3);
                        } else {
                            if (i33 == 0) {
                                if (basicTimeZone != null) {
                                    long j = timeInMillis + ((long) iArr[0]);
                                    dSTSavings = 0;
                                    long jKWHzl = j;
                                    do {
                                        previousTransition = basicTimeZone.getPreviousTransition(jKWHzl, true);
                                        if (previousTransition == null) {
                                            break;
                                        }
                                        jKWHzl = previousTransition.KWHzl() - 1;
                                        dSTSavings = previousTransition.EZpvd().getDSTSavings();
                                    } while (dSTSavings == 0);
                                    int dSTSavings2 = 0;
                                    long jKWHzl2 = j;
                                    do {
                                        nextTransition = basicTimeZone.getNextTransition(jKWHzl2, false);
                                        if (nextTransition == null) {
                                            break;
                                        }
                                        jKWHzl2 = nextTransition.KWHzl();
                                        dSTSavings2 = nextTransition.OLrzqt().getDSTSavings();
                                    } while (dSTSavings2 == 0);
                                    if (previousTransition == null || nextTransition == null) {
                                        if (previousTransition == null || dSTSavings == 0) {
                                            if (nextTransition == null || dSTSavings2 == 0) {
                                                dSTSavings = basicTimeZone.getDSTSavings();
                                            }
                                            i3 = dSTSavings2;
                                        }
                                    } else if (j - jKWHzl > jKWHzl2 - j) {
                                        i3 = dSTSavings2;
                                    }
                                    if (i3 == 0) {
                                        i3 = millisPerHour;
                                    }
                                } else {
                                    dSTSavings = timeZone5.getDSTSavings();
                                }
                                i3 = dSTSavings;
                                if (i3 == 0) {
                                }
                            }
                            calendar7.set(15, iArr[0]);
                            calendar7.set(16, i3);
                        }
                    }
                    i2 = i29;
                    int i332 = iArr[1];
                    if (timeType != TimeZoneFormat.TimeType.STANDARD) {
                    }
                }
            }
            if (calendar6 != null) {
                calendar6.setTimeZone(calendar7.getTimeZone());
                calendar6.setTimeInMillis(calendar7.getTimeInMillis());
            }
            if (timeZone4 != null) {
                this.calendar.setTimeZone(timeZone4);
            }
        } catch (IllegalArgumentException unused3) {
            i2 = i29;
        }
    }

    private int matchLiteral(String str, int i, Object[] objArr, int i2, boolean[] zArr) {
        String str2 = (String) objArr[i2];
        int length = str2.length();
        int length2 = str.length();
        int i3 = i;
        int i4 = 0;
        while (true) {
            if (i4 >= length || i3 >= length2) {
                break;
            }
            char cCharAt = str2.charAt(i4);
            char cCharAt2 = str.charAt(i3);
            if (C7070acr.AEQbTJ(cCharAt) && C7070acr.AEQbTJ(cCharAt2)) {
                while (true) {
                    int i5 = i4 + 1;
                    if (i5 >= length || !C7070acr.AEQbTJ(str2.charAt(i5))) {
                        break;
                    }
                    i4 = i5;
                }
                while (true) {
                    int i6 = i3 + 1;
                    if (i6 >= length2 || !C7070acr.AEQbTJ(str.charAt(i6))) {
                        break;
                    }
                    i3 = i6;
                }
            } else if (cCharAt != cCharAt2) {
                if (cCharAt2 == '.' && i3 == i && i2 > 0 && getBooleanAttribute(DateFormat.BooleanAttribute.PARSE_ALLOW_WHITESPACE)) {
                    Object obj = objArr[i2 - 1];
                    if (!(obj instanceof Activity) || ((Activity) obj).EZpvd) {
                        break;
                    }
                    i3++;
                } else {
                    if (((cCharAt != ' ' && cCharAt != '.') || !getBooleanAttribute(DateFormat.BooleanAttribute.PARSE_ALLOW_WHITESPACE)) && (i3 == i || !getBooleanAttribute(DateFormat.BooleanAttribute.PARSE_PARTIAL_LITERAL_MATCH))) {
                        break;
                    }
                    i4++;
                }
            }
            i4++;
            i3++;
        }
        boolean z = i4 == length;
        zArr[0] = z;
        if (!z && getBooleanAttribute(DateFormat.BooleanAttribute.PARSE_ALLOW_WHITESPACE) && i2 > 0 && i2 < objArr.length - 1 && i < length2) {
            Object obj2 = objArr[i2 - 1];
            Object obj3 = objArr[i2 + 1];
            if ((obj2 instanceof Activity) && (obj3 instanceof Activity)) {
                char c = ((Activity) obj2).copydefault;
                char c2 = ((Activity) obj3).copydefault;
                UnicodeSet unicodeSet = DATE_PATTERN_TYPE;
                if (unicodeSet.AEQbTJ(c) != unicodeSet.AEQbTJ(c2)) {
                    i3 = i;
                    while (i3 < length2 && C7070acr.AEQbTJ(str.charAt(i3))) {
                        i3++;
                    }
                    zArr[0] = i3 > i;
                }
            }
        }
        return i3;
    }

    public int matchString(String str, int i, int i2, String[] strArr, Calendar calendar) {
        return matchString(str, i, i2, strArr, null, calendar);
    }

    @Deprecated
    private int matchString(String str, int i, int i2, String[] strArr, String str2, Calendar calendar) {
        String strOLrzqt;
        int length;
        int iRegionMatchesWithOptionalDot;
        int iRegionMatchesWithOptionalDot2;
        int length2 = strArr.length;
        int i3 = -1;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = i2 == 7 ? 1 : 0; i6 < length2; i6++) {
            int length3 = strArr[i6].length();
            if (length3 > i4 && (iRegionMatchesWithOptionalDot2 = regionMatchesWithOptionalDot(str, i, strArr[i6], length3)) >= 0) {
                i3 = i6;
                i5 = 0;
                i4 = iRegionMatchesWithOptionalDot2;
            }
            if (str2 != null && (length = (strOLrzqt = C7028acB.OLrzqt(str2, 1, 1, strArr[i6])).length()) > i4 && (iRegionMatchesWithOptionalDot = regionMatchesWithOptionalDot(str, i, strOLrzqt, length)) >= 0) {
                i3 = i6;
                i5 = 1;
                i4 = iRegionMatchesWithOptionalDot;
            }
        }
        if (i3 < 0) {
            return ~i;
        }
        if (i2 >= 0) {
            if (i2 == 1) {
                i3++;
            }
            calendar.set(i2, i3);
            if (str2 != null) {
                calendar.set(22, i5);
            }
        }
        return i + i4;
    }

    private int regionMatchesWithOptionalDot(String str, int i, String str2, int i2) {
        if (str.regionMatches(true, i, str2, 0, i2)) {
            return i2;
        }
        if (str2.length() > 0 && str2.charAt(str2.length() - 1) == '.') {
            int i3 = i2 - 1;
            if (str.regionMatches(true, i, str2, 0, i3)) {
                return i3;
            }
        }
        return -1;
    }

    public int matchQuarterString(String str, int i, int i2, String[] strArr, Calendar calendar) {
        int iRegionMatchesWithOptionalDot;
        int length = strArr.length;
        int i3 = -1;
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5++) {
            int length2 = strArr[i5].length();
            if (length2 > i4 && (iRegionMatchesWithOptionalDot = regionMatchesWithOptionalDot(str, i, strArr[i5], length2)) >= 0) {
                i3 = i5;
                i4 = iRegionMatchesWithOptionalDot;
            }
        }
        if (i3 < 0) {
            return -i;
        }
        calendar.set(i2, i3 * 3);
        return i + i4;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v2, resolved type: com.ibm.icu.impl.DayPeriodRules$DayPeriod[] */
    /* JADX DEBUG: Multi-variable search result rejected for r6v3, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    private int matchDayPeriodString(String str, int i, String[] strArr, int i2, C7255agQ<DayPeriodRules.DayPeriod> c7255agQ) {
        int length;
        int iRegionMatchesWithOptionalDot;
        int i3 = -1;
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            String str2 = strArr[i5];
            if (str2 != null && (length = str2.length()) > i4 && (iRegionMatchesWithOptionalDot = regionMatchesWithOptionalDot(str, i, strArr[i5], length)) >= 0) {
                i3 = i5;
                i4 = iRegionMatchesWithOptionalDot;
            }
        }
        if (i3 < 0) {
            return -i;
        }
        c7255agQ.copydefault = DayPeriodRules.DayPeriod.VALUES[i3];
        return i + i4;
    }

    public int subParse(String str, int i, char c, int i2, boolean z, boolean z2, boolean[] zArr, Calendar calendar) {
        return subParse(str, i, c, i2, z, z2, zArr, calendar, null, null);
    }

    private int subParse(String str, int i, char c, int i2, boolean z, boolean z2, boolean[] zArr, Calendar calendar, MessageFormat messageFormat, C7255agQ<TimeZoneFormat.TimeType> c7255agQ) {
        return subParse(str, i, c, i2, z, z2, zArr, calendar, null, null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0507  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0557  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0568  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x057b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0584  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0597 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:399:0x05d2  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x05fa  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x060f  */
    /* JADX WARN: Removed duplicated region for block: B:477:0x06f0  */
    /* JADX WARN: Removed duplicated region for block: B:510:0x075c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0135  */
    @Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int subParse(String str, int i, char c, int i2, boolean z, boolean z2, boolean[] zArr, Calendar calendar, MessageFormat messageFormat, C7255agQ<TimeZoneFormat.TimeType> c7255agQ, C7255agQ<DayPeriodRules.DayPeriod> c7255agQ2) {
        Number number;
        boolean z3;
        int i3;
        int i4;
        int i5;
        Number number2;
        int iIntValue;
        int iMatchString;
        int defaultCenturyStartYear;
        int i6;
        int iMatchString2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        DateFormat.BooleanAttribute booleanAttribute;
        int iMatchString3;
        String[] strArr;
        String[] strArr2;
        TimeZoneFormat.Style style;
        int i12;
        int iMatchString4;
        String[] strArr3;
        int iMatchQuarterString;
        int iMatchQuarterString2;
        TimeZoneFormat.Style style2;
        int i13;
        String[] strArr4;
        TimeZoneFormat.Style style3;
        TimeZoneFormat.Style style4;
        int iMatchDayPeriodString;
        int iMatchDayPeriodString2;
        int i14;
        Number number3;
        ParsePosition parsePosition = new ParsePosition(0);
        int indexFromChar = getIndexFromChar(c);
        if (indexFromChar == -1) {
            return ~i;
        }
        NumberFormat numberFormat = getNumberFormat(c);
        int i15 = PATTERN_INDEX_TO_CALENDAR_FIELD[indexFromChar];
        if (messageFormat != null) {
            messageFormat.setFormatByArgumentIndex(0, numberFormat);
        }
        boolean z4 = calendar.getType().equals("chinese") || calendar.getType().equals("dangi");
        int iCopydefault = i;
        while (iCopydefault < str.length()) {
            int iAEQbTJ = C7242agD.AEQbTJ(str, iCopydefault);
            if (C7223afl.isConnected(iAEQbTJ) && C7070acr.AEQbTJ(iAEQbTJ)) {
                iCopydefault += C7242agD.copydefault(iAEQbTJ);
            } else {
                parsePosition.setIndex(iCopydefault);
                if (indexFromChar == 4 || indexFromChar == 15 || ((indexFromChar == 2 && i2 <= 2) || indexFromChar == 26 || indexFromChar == 19 || indexFromChar == 25 || indexFromChar == 1 || indexFromChar == 18 || indexFromChar == 30 || ((indexFromChar == 0 && z4) || indexFromChar == 27 || indexFromChar == 28 || indexFromChar == 8))) {
                    if (messageFormat == null || !(indexFromChar == 2 || indexFromChar == 26)) {
                        number = null;
                        z3 = false;
                        if (z3) {
                            i3 = iCopydefault;
                            i4 = 1;
                            i5 = i15;
                        } else {
                            if (z) {
                                if (iCopydefault + i2 > str.length()) {
                                    return ~iCopydefault;
                                }
                                i3 = iCopydefault;
                                i4 = 1;
                                i5 = i15;
                                number = parseInt(str, i2, parsePosition, z2, numberFormat);
                            } else {
                                i3 = iCopydefault;
                                i4 = 1;
                                i5 = i15;
                                number = parseInt(str, parsePosition, z2, numberFormat);
                            }
                            if (number == null && !allowNumericFallback(indexFromChar)) {
                                return ~i3;
                            }
                        }
                        if (number != null) {
                            number2 = number;
                            iIntValue = number.intValue();
                        }
                    } else {
                        Object[] objArr = messageFormat.parse(str, parsePosition);
                        if (objArr != null && parsePosition.getIndex() > iCopydefault) {
                            Object obj = objArr[0];
                            if (obj instanceof Number) {
                                number = (Number) obj;
                                calendar.set(22, 1);
                                z3 = true;
                                if (z3) {
                                }
                                if (number != null) {
                                }
                            }
                        }
                        parsePosition.setIndex(iCopydefault);
                        calendar.set(22, 0);
                        number = null;
                        z3 = false;
                        if (z3) {
                        }
                        if (number != null) {
                        }
                    }
                    switch (indexFromChar) {
                        case 0:
                            int i16 = iIntValue;
                            if (z4) {
                                calendar.set(0, i16);
                                return parsePosition.getIndex();
                            }
                            if (i2 == 5) {
                                iMatchString = matchString(str, i3, 0, this.formatData.narrowEras, null, calendar);
                            } else if (i2 == 4) {
                                iMatchString = matchString(str, i3, 0, this.formatData.eraNames, null, calendar);
                            } else {
                                iMatchString = matchString(str, i3, 0, this.formatData.eras, null, calendar);
                            }
                            return iMatchString == (~i3) ? ISOSpecialEra : iMatchString;
                        case 1:
                        case 18:
                            int i17 = iIntValue;
                            int i18 = i5;
                            String str2 = this.override;
                            if (str2 != null && ((str2.compareTo("hebr") == 0 || this.override.indexOf("y=hebr") >= 0) && i17 < 1000)) {
                                defaultCenturyStartYear = i17 + 5000;
                            } else if (i2 == 2 && countDigits(str, i3, parsePosition.getIndex()) == 2 && calendar.haveDefaultCentury()) {
                                int defaultCenturyStartYear2 = getDefaultCenturyStartYear() % 100;
                                zArr[0] = i17 == defaultCenturyStartYear2;
                                defaultCenturyStartYear = i17 + ((getDefaultCenturyStartYear() / 100) * 100) + (i17 < defaultCenturyStartYear2 ? 100 : 0);
                            } else {
                                defaultCenturyStartYear = i17;
                            }
                            calendar.set(i18, defaultCenturyStartYear);
                            if (DelayedHebrewMonthCheck) {
                                if (!HebrewCalendar.isLeapYear(defaultCenturyStartYear)) {
                                    calendar.add(2, 1);
                                }
                                DelayedHebrewMonthCheck = false;
                            }
                            return parsePosition.getIndex();
                        case 2:
                        case 26:
                            int i19 = iIntValue;
                            if (i2 <= 2 || (number2 != null && getBooleanAttribute(DateFormat.BooleanAttribute.PARSE_ALLOW_NUMERIC))) {
                                calendar.set(2, i19 - 1);
                                if (calendar.getType().equals("hebrew") && i19 >= 6) {
                                    if (!calendar.isSet(1)) {
                                        DelayedHebrewMonthCheck = true;
                                    } else if (!HebrewCalendar.isLeapYear(calendar.get(1))) {
                                        calendar.set(2, i19);
                                    }
                                }
                                return parsePosition.getIndex();
                            }
                            String[] strArr5 = this.formatData.leapMonthPatterns;
                            int i20 = (strArr5 == null || strArr5.length < 7) ? 0 : i4;
                            DateFormat.BooleanAttribute booleanAttribute2 = DateFormat.BooleanAttribute.PARSE_MULTIPLE_PATTERNS_FOR_MATCH;
                            if (getBooleanAttribute(booleanAttribute2) || i2 == 4) {
                                if (indexFromChar == 2) {
                                    DateFormatSymbols dateFormatSymbols = this.formatData;
                                    i6 = 3;
                                    iMatchString2 = matchString(str, i3, 2, dateFormatSymbols.months, i20 != 0 ? dateFormatSymbols.leapMonthPatterns[0] : null, calendar);
                                } else {
                                    i6 = 3;
                                    DateFormatSymbols dateFormatSymbols2 = this.formatData;
                                    iMatchString2 = matchString(str, i3, 2, dateFormatSymbols2.standaloneMonths, i20 != 0 ? dateFormatSymbols2.leapMonthPatterns[3] : null, calendar);
                                }
                                if (iMatchString2 > 0) {
                                    return iMatchString2;
                                }
                            } else {
                                i6 = 3;
                                iMatchString2 = 0;
                            }
                            if (!getBooleanAttribute(booleanAttribute2) && i2 != i6) {
                                return iMatchString2;
                            }
                            if (indexFromChar == 2) {
                                DateFormatSymbols dateFormatSymbols3 = this.formatData;
                                return matchString(str, i3, 2, dateFormatSymbols3.shortMonths, i20 != 0 ? dateFormatSymbols3.leapMonthPatterns[1] : null, calendar);
                            }
                            DateFormatSymbols dateFormatSymbols4 = this.formatData;
                            return matchString(str, i3, 2, dateFormatSymbols4.standaloneShortMonths, i20 != 0 ? dateFormatSymbols4.leapMonthPatterns[4] : null, calendar);
                        case 3:
                        case 5:
                        case 6:
                        case 7:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 16:
                        case 20:
                        case 21:
                        case 22:
                        case 34:
                        default:
                            int i21 = i5;
                            if (z) {
                                if (i3 + i2 > str.length()) {
                                    return -i3;
                                }
                                i14 = i21;
                                number3 = parseInt(str, i2, parsePosition, z2, numberFormat);
                            } else {
                                i14 = i21;
                                number3 = parseInt(str, parsePosition, z2, numberFormat);
                            }
                            if (number3 == null) {
                                return ~i3;
                            }
                            if (indexFromChar != 34) {
                                calendar.set(i14, number3.intValue());
                            } else {
                                calendar.setRelatedYear(number3.intValue());
                            }
                            return parsePosition.getIndex();
                        case 4:
                            int i22 = iIntValue;
                            calendar.set(11, i22 == calendar.getMaximum(11) + i4 ? 0 : i22);
                            return parsePosition.getIndex();
                        case 8:
                            int i23 = iIntValue;
                            int iCountDigits = countDigits(str, i3, parsePosition.getIndex());
                            if (iCountDigits < 3) {
                                i7 = i23;
                                while (iCountDigits < 3) {
                                    i7 *= 10;
                                    iCountDigits++;
                                }
                            } else {
                                int i24 = i4;
                                while (iCountDigits > 3) {
                                    i24 *= 10;
                                    iCountDigits--;
                                }
                                i7 = i23 / i24;
                            }
                            calendar.set(14, i7);
                            return parsePosition.getIndex();
                        case 9:
                            i8 = 3;
                            i9 = 5;
                            i10 = 6;
                            break;
                        case 14:
                            if (this.formatData.ampmsNarrow == null || i2 < 5 || getBooleanAttribute(DateFormat.BooleanAttribute.PARSE_MULTIPLE_PATTERNS_FOR_MATCH)) {
                                i11 = 5;
                                int iMatchString5 = matchString(str, i3, 9, this.formatData.ampms, null, calendar);
                                if (iMatchString5 > 0) {
                                    return iMatchString5;
                                }
                            } else {
                                i11 = 5;
                            }
                            if (this.formatData.ampmsNarrow != null && (i2 >= i11 || getBooleanAttribute(DateFormat.BooleanAttribute.PARSE_MULTIPLE_PATTERNS_FOR_MATCH))) {
                                int iMatchString6 = matchString(str, i3, 9, this.formatData.ampmsNarrow, null, calendar);
                                if (iMatchString6 > 0) {
                                    return iMatchString6;
                                }
                            }
                            return ~i3;
                        case 15:
                            int i25 = iIntValue;
                            calendar.set(10, i25 == calendar.getLeastMaximum(10) + i4 ? 0 : i25);
                            return parsePosition.getIndex();
                        case 17:
                            TimeZone timeZone = tzFormat().parse(i2 < 4 ? TimeZoneFormat.Style.SPECIFIC_SHORT : TimeZoneFormat.Style.SPECIFIC_LONG, str, parsePosition, c7255agQ);
                            if (timeZone == null) {
                                return ~i3;
                            }
                            calendar.setTimeZone(timeZone);
                            return parsePosition.getIndex();
                        case 19:
                            i8 = 3;
                            i10 = 6;
                            int i26 = iIntValue;
                            int i27 = i5;
                            if (i2 <= 2 || (number2 != null && getBooleanAttribute(DateFormat.BooleanAttribute.PARSE_ALLOW_NUMERIC))) {
                                calendar.set(i27, i26);
                                return parsePosition.getIndex();
                            }
                            i9 = 5;
                            break;
                        case 23:
                            if (i2 < 4) {
                                style = TimeZoneFormat.Style.ISO_BASIC_LOCAL_FULL;
                            } else {
                                style = i2 == 5 ? TimeZoneFormat.Style.ISO_EXTENDED_FULL : TimeZoneFormat.Style.LOCALIZED_GMT;
                            }
                            TimeZone timeZone2 = tzFormat().parse(style, str, parsePosition, c7255agQ);
                            if (timeZone2 == null) {
                                return ~i3;
                            }
                            calendar.setTimeZone(timeZone2);
                            return parsePosition.getIndex();
                        case 24:
                            TimeZone timeZone3 = tzFormat().parse(i2 < 4 ? TimeZoneFormat.Style.GENERIC_SHORT : TimeZoneFormat.Style.GENERIC_LONG, str, parsePosition, c7255agQ);
                            if (timeZone3 == null) {
                                return ~i3;
                            }
                            calendar.setTimeZone(timeZone3);
                            return parsePosition.getIndex();
                        case 25:
                            int i28 = iIntValue;
                            if (i2 == i4 || (number2 != null && getBooleanAttribute(DateFormat.BooleanAttribute.PARSE_ALLOW_NUMERIC))) {
                                calendar.set(i5, i28);
                                return parsePosition.getIndex();
                            }
                            DateFormat.BooleanAttribute booleanAttribute3 = DateFormat.BooleanAttribute.PARSE_MULTIPLE_PATTERNS_FOR_MATCH;
                            if (getBooleanAttribute(booleanAttribute3) || i2 == 4) {
                                i12 = 6;
                                iMatchString4 = matchString(str, i3, 7, this.formatData.standaloneWeekdays, null, calendar);
                                if (iMatchString4 > 0) {
                                    return iMatchString4;
                                }
                            } else {
                                i12 = 6;
                                iMatchString4 = 0;
                            }
                            if (getBooleanAttribute(booleanAttribute3) || i2 == 3) {
                                iMatchString4 = matchString(str, i3, 7, this.formatData.standaloneShortWeekdays, null, calendar);
                                if (iMatchString4 > 0) {
                                    return iMatchString4;
                                }
                            }
                            return ((getBooleanAttribute(booleanAttribute3) || i2 == i12) && (strArr3 = this.formatData.standaloneShorterWeekdays) != null) ? matchString(str, i3, 7, strArr3, null, calendar) : iMatchString4;
                        case 27:
                            int i29 = iIntValue;
                            if (i2 <= 2 || (number2 != null && getBooleanAttribute(DateFormat.BooleanAttribute.PARSE_ALLOW_NUMERIC))) {
                                calendar.set(2, (i29 - 1) * 3);
                                return parsePosition.getIndex();
                            }
                            DateFormat.BooleanAttribute booleanAttribute4 = DateFormat.BooleanAttribute.PARSE_MULTIPLE_PATTERNS_FOR_MATCH;
                            if (getBooleanAttribute(booleanAttribute4) || i2 == 4) {
                                iMatchQuarterString = matchQuarterString(str, i3, 2, this.formatData.quarters, calendar);
                                if (iMatchQuarterString > 0) {
                                    return iMatchQuarterString;
                                }
                            } else {
                                iMatchQuarterString = 0;
                            }
                            return (getBooleanAttribute(booleanAttribute4) || i2 == 3) ? matchQuarterString(str, i3, 2, this.formatData.shortQuarters, calendar) : iMatchQuarterString;
                        case 28:
                            int i30 = iIntValue;
                            if (i2 <= 2 || (number2 != null && getBooleanAttribute(DateFormat.BooleanAttribute.PARSE_ALLOW_NUMERIC))) {
                                calendar.set(2, (i30 - 1) * 3);
                                return parsePosition.getIndex();
                            }
                            DateFormat.BooleanAttribute booleanAttribute5 = DateFormat.BooleanAttribute.PARSE_MULTIPLE_PATTERNS_FOR_MATCH;
                            if (getBooleanAttribute(booleanAttribute5) || i2 == 4) {
                                iMatchQuarterString2 = matchQuarterString(str, i3, 2, this.formatData.standaloneQuarters, calendar);
                                if (iMatchQuarterString2 > 0) {
                                    return iMatchQuarterString2;
                                }
                            } else {
                                iMatchQuarterString2 = 0;
                            }
                            return (getBooleanAttribute(booleanAttribute5) || i2 == 3) ? matchQuarterString(str, i3, 2, this.formatData.standaloneShortQuarters, calendar) : iMatchQuarterString2;
                        case 29:
                            if (i2 == i4) {
                                style2 = TimeZoneFormat.Style.ZONE_ID_SHORT;
                            } else if (i2 == 2) {
                                style2 = TimeZoneFormat.Style.ZONE_ID;
                            } else if (i2 == 3) {
                                style2 = TimeZoneFormat.Style.EXEMPLAR_LOCATION;
                            } else {
                                style2 = TimeZoneFormat.Style.GENERIC_LOCATION;
                            }
                            TimeZone timeZone4 = tzFormat().parse(style2, str, parsePosition, c7255agQ);
                            if (timeZone4 == null) {
                                return ~i3;
                            }
                            calendar.setTimeZone(timeZone4);
                            return parsePosition.getIndex();
                        case 30:
                            String[] strArr6 = this.formatData.shortYearNames;
                            if (strArr6 != null) {
                                i13 = iIntValue;
                                int iMatchString7 = matchString(str, i3, 1, strArr6, null, calendar);
                                if (iMatchString7 > 0) {
                                    return iMatchString7;
                                }
                            } else {
                                i13 = iIntValue;
                            }
                            if (number2 == null || !(getBooleanAttribute(DateFormat.BooleanAttribute.PARSE_ALLOW_NUMERIC) || (strArr4 = this.formatData.shortYearNames) == null || i13 > strArr4.length)) {
                                return ~i3;
                            }
                            calendar.set(i4, i13);
                            return parsePosition.getIndex();
                        case 31:
                            TimeZone timeZone5 = tzFormat().parse(i2 < 4 ? TimeZoneFormat.Style.LOCALIZED_GMT_SHORT : TimeZoneFormat.Style.LOCALIZED_GMT, str, parsePosition, c7255agQ);
                            if (timeZone5 == null) {
                                return ~i3;
                            }
                            calendar.setTimeZone(timeZone5);
                            return parsePosition.getIndex();
                        case 32:
                            if (i2 == i4) {
                                style3 = TimeZoneFormat.Style.ISO_BASIC_SHORT;
                            } else if (i2 == 2) {
                                style3 = TimeZoneFormat.Style.ISO_BASIC_FIXED;
                            } else if (i2 == 3) {
                                style3 = TimeZoneFormat.Style.ISO_EXTENDED_FIXED;
                            } else if (i2 == 4) {
                                style3 = TimeZoneFormat.Style.ISO_BASIC_FULL;
                            } else {
                                style3 = TimeZoneFormat.Style.ISO_EXTENDED_FULL;
                            }
                            TimeZone timeZone6 = tzFormat().parse(style3, str, parsePosition, c7255agQ);
                            if (timeZone6 == null) {
                                return ~i3;
                            }
                            calendar.setTimeZone(timeZone6);
                            return parsePosition.getIndex();
                        case 33:
                            if (i2 == i4) {
                                style4 = TimeZoneFormat.Style.ISO_BASIC_LOCAL_SHORT;
                            } else if (i2 == 2) {
                                style4 = TimeZoneFormat.Style.ISO_BASIC_LOCAL_FIXED;
                            } else if (i2 == 3) {
                                style4 = TimeZoneFormat.Style.ISO_EXTENDED_LOCAL_FIXED;
                            } else if (i2 == 4) {
                                style4 = TimeZoneFormat.Style.ISO_BASIC_LOCAL_FULL;
                            } else {
                                style4 = TimeZoneFormat.Style.ISO_EXTENDED_LOCAL_FULL;
                            }
                            TimeZone timeZone7 = tzFormat().parse(style4, str, parsePosition, c7255agQ);
                            if (timeZone7 == null) {
                                return ~i3;
                            }
                            calendar.setTimeZone(timeZone7);
                            return parsePosition.getIndex();
                        case 35:
                            int iSubParse = subParse(str, i3, 'a', i2, z, z2, zArr, calendar, messageFormat, c7255agQ, c7255agQ2);
                            if (iSubParse > 0) {
                                return iSubParse;
                            }
                            DateFormat.BooleanAttribute booleanAttribute6 = DateFormat.BooleanAttribute.PARSE_MULTIPLE_PATTERNS_FOR_MATCH;
                            if (getBooleanAttribute(booleanAttribute6) || i2 == 3) {
                                iMatchDayPeriodString = matchDayPeriodString(str, i3, this.formatData.abbreviatedDayPeriods, 2, c7255agQ2);
                                if (iMatchDayPeriodString > 0) {
                                    return iMatchDayPeriodString;
                                }
                            } else {
                                iMatchDayPeriodString = 0;
                            }
                            if (getBooleanAttribute(booleanAttribute6) || i2 == 4) {
                                iMatchDayPeriodString = matchDayPeriodString(str, i3, this.formatData.wideDayPeriods, 2, c7255agQ2);
                                if (iMatchDayPeriodString > 0) {
                                    return iMatchDayPeriodString;
                                }
                            }
                            return (getBooleanAttribute(booleanAttribute6) || i2 == 4) ? matchDayPeriodString(str, i3, this.formatData.narrowDayPeriods, 2, c7255agQ2) : iMatchDayPeriodString;
                        case 36:
                            DateFormat.BooleanAttribute booleanAttribute7 = DateFormat.BooleanAttribute.PARSE_MULTIPLE_PATTERNS_FOR_MATCH;
                            if (getBooleanAttribute(booleanAttribute7) || i2 == 3) {
                                String[] strArr7 = this.formatData.abbreviatedDayPeriods;
                                iMatchDayPeriodString2 = matchDayPeriodString(str, i3, strArr7, strArr7.length, c7255agQ2);
                                if (iMatchDayPeriodString2 > 0) {
                                    return iMatchDayPeriodString2;
                                }
                            } else {
                                iMatchDayPeriodString2 = 0;
                            }
                            if (getBooleanAttribute(booleanAttribute7) || i2 == 4) {
                                String[] strArr8 = this.formatData.wideDayPeriods;
                                iMatchDayPeriodString2 = matchDayPeriodString(str, i3, strArr8, strArr8.length, c7255agQ2);
                                if (iMatchDayPeriodString2 > 0) {
                                    return iMatchDayPeriodString2;
                                }
                            }
                            if (!getBooleanAttribute(booleanAttribute7) && i2 != 4) {
                                return iMatchDayPeriodString2;
                            }
                            String[] strArr9 = this.formatData.narrowDayPeriods;
                            return matchDayPeriodString(str, i3, strArr9, strArr9.length, c7255agQ2);
                        case 37:
                            ArrayList arrayList = new ArrayList(3);
                            arrayList.add(this.formatData.getTimeSeparatorString());
                            if (!this.formatData.getTimeSeparatorString().equals(":")) {
                                arrayList.add(":");
                            }
                            if (getBooleanAttribute(DateFormat.BooleanAttribute.PARSE_PARTIAL_LITERAL_MATCH) && !this.formatData.getTimeSeparatorString().equals(JwtUtilsKt.JWT_DELIMITER)) {
                                arrayList.add(JwtUtilsKt.JWT_DELIMITER);
                            }
                            return matchString(str, i3, -1, (String[]) arrayList.toArray(new String[0]), calendar);
                    }
                    booleanAttribute = DateFormat.BooleanAttribute.PARSE_MULTIPLE_PATTERNS_FOR_MATCH;
                    if (!getBooleanAttribute(booleanAttribute) || i2 == 4) {
                        iMatchString3 = matchString(str, i3, 7, this.formatData.weekdays, null, calendar);
                        if (iMatchString3 > 0) {
                            return iMatchString3;
                        }
                    } else {
                        iMatchString3 = 0;
                    }
                    if (!getBooleanAttribute(booleanAttribute) || i2 == i8) {
                        iMatchString3 = matchString(str, i3, 7, this.formatData.shortWeekdays, null, calendar);
                        if (iMatchString3 > 0) {
                            return iMatchString3;
                        }
                    }
                    if ((getBooleanAttribute(booleanAttribute) && i2 != i10) || (strArr = this.formatData.shorterWeekdays) == null || (iMatchString3 = matchString(str, i3, 7, strArr, null, calendar)) <= 0) {
                        return ((!getBooleanAttribute(booleanAttribute) || i2 == i9) && (strArr2 = this.formatData.narrowWeekdays) != null) ? matchString(str, i3, 7, strArr2, null, calendar) : iMatchString3;
                    }
                }
                i3 = iCopydefault;
                i4 = 1;
                i5 = i15;
                number = null;
                number2 = number;
                iIntValue = 0;
                switch (indexFromChar) {
                }
                booleanAttribute = DateFormat.BooleanAttribute.PARSE_MULTIPLE_PATTERNS_FOR_MATCH;
                if (getBooleanAttribute(booleanAttribute)) {
                    iMatchString3 = matchString(str, i3, 7, this.formatData.weekdays, null, calendar);
                    if (iMatchString3 > 0) {
                    }
                }
                if (!getBooleanAttribute(booleanAttribute)) {
                    iMatchString3 = matchString(str, i3, 7, this.formatData.shortWeekdays, null, calendar);
                    if (iMatchString3 > 0) {
                    }
                }
                return getBooleanAttribute(booleanAttribute) ? iMatchString3 : iMatchString3;
                if (getBooleanAttribute(booleanAttribute)) {
                }
            }
        }
        return ~iCopydefault;
    }

    private Number parseInt(String str, ParsePosition parsePosition, boolean z, NumberFormat numberFormat) {
        return parseInt(str, -1, parsePosition, z, numberFormat);
    }

    private Number parseInt(String str, int i, ParsePosition parsePosition, boolean z, NumberFormat numberFormat) {
        Number number;
        int index;
        int index2 = parsePosition.getIndex();
        if (z) {
            number = numberFormat.parse(str, parsePosition);
        } else if (numberFormat instanceof DecimalFormat) {
            DecimalFormat decimalFormat = (DecimalFormat) numberFormat;
            String negativePrefix = decimalFormat.getNegativePrefix();
            decimalFormat.setNegativePrefix(SUPPRESS_NEGATIVE_PREFIX);
            number = numberFormat.parse(str, parsePosition);
            decimalFormat.setNegativePrefix(negativePrefix);
        } else {
            boolean z2 = numberFormat instanceof DateNumberFormat;
            if (z2) {
                ((DateNumberFormat) numberFormat).setParsePositiveOnly(true);
            }
            number = numberFormat.parse(str, parsePosition);
            if (z2) {
                ((DateNumberFormat) numberFormat).setParsePositiveOnly(false);
            }
        }
        if (i <= 0 || (index = parsePosition.getIndex() - index2) <= i) {
            return number;
        }
        double dDoubleValue = number.doubleValue();
        for (int i2 = index - i; i2 > 0; i2--) {
            dDoubleValue /= 10.0d;
        }
        parsePosition.setIndex(index2 + i);
        return Integer.valueOf((int) dDoubleValue);
    }

    private static int countDigits(String str, int i, int i2) {
        int i3 = 0;
        while (i < i2) {
            int iCodePointAt = str.codePointAt(i);
            if (C7223afl.gEmmrt(iCodePointAt)) {
                i3++;
            }
            i += C7223afl.KWHzl(iCodePointAt);
        }
        return i3;
    }

    private String translatePattern(String str, String str2, String str3) {
        int iIndexOf;
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (z) {
                if (cCharAt == '\'') {
                    z = false;
                }
            } else if (cCharAt == '\'') {
                z = true;
            } else if (isSyntaxChar(cCharAt) && (iIndexOf = str2.indexOf(cCharAt)) != -1) {
                cCharAt = str3.charAt(iIndexOf);
            }
            sb.append(cCharAt);
        }
        if (z) {
            throw new IllegalArgumentException("Unfinished quote in pattern");
        }
        return sb.toString();
    }

    public String toLocalizedPattern() {
        return translatePattern(this.pattern, "GyMdkHmsSEDFwWahKzYeugAZvcLQqVUOXxrbB", this.formatData.localPatternChars);
    }

    public void applyPattern(String str) {
        ULocale uLocale;
        this.pattern = str;
        parsePattern();
        setLocale(null, null);
        this.patternItems = null;
        Calendar calendar = this.calendar;
        if (calendar == null || !calendar.getType().equals("japanese") || (uLocale = this.locale) == null || !uLocale.getLanguage().equals("ja")) {
            return;
        }
        String str2 = this.override;
        if (str2 != null && str2.equals("y=jpanyear") && !this.hasHanYearChar) {
            this.numberFormatters = null;
            this.overrideMap = null;
            this.override = null;
            return;
        }
        if (this.override == null && this.hasHanYearChar) {
            this.numberFormatters = new HashMap<>();
            HashMap<Character, String> map = new HashMap<>();
            this.overrideMap = map;
            map.put('y', "jpanyear");
            NumberFormat numberFormatCreateInstance = NumberFormat.createInstance(new ULocale(this.locale.getBaseName() + "@numbers=jpanyear"), 0);
            numberFormatCreateInstance.setGroupingUsed(false);
            this.useLocalZeroPaddingNumberFormat = false;
            this.numberFormatters.put("jpanyear", numberFormatCreateInstance);
            this.override = "y=jpanyear";
        }
    }

    public void applyLocalizedPattern(String str) {
        this.pattern = translatePattern(str, this.formatData.localPatternChars, "GyMdkHmsSEDFwWahKzYeugAZvcLQqVUOXxrbB");
        setLocale(null, null);
    }

    public DateFormatSymbols getDateFormatSymbols() {
        return (DateFormatSymbols) this.formatData.clone();
    }

    public void setDateFormatSymbols(DateFormatSymbols dateFormatSymbols) {
        this.formatData = (DateFormatSymbols) dateFormatSymbols.clone();
    }

    public TimeZoneFormat getTimeZoneFormat() {
        return tzFormat().m6327freeze();
    }

    public void setTimeZoneFormat(TimeZoneFormat timeZoneFormat) {
        if (timeZoneFormat.isFrozen()) {
            this.tzFormat = timeZoneFormat;
        } else {
            this.tzFormat = timeZoneFormat.m6326cloneAsThawed().m6327freeze();
        }
    }

    @Override // com.ibm.icu.text.DateFormat, java.text.Format
    public Object clone() {
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) super.clone();
        simpleDateFormat.formatData = (DateFormatSymbols) this.formatData.clone();
        if (this.decimalBuf != null) {
            simpleDateFormat.decimalBuf = new char[10];
        }
        return simpleDateFormat;
    }

    @Override // com.ibm.icu.text.DateFormat
    public int hashCode() {
        return this.pattern.hashCode();
    }

    @Override // com.ibm.icu.text.DateFormat
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) obj;
        return this.pattern.equals(simpleDateFormat.pattern) && this.formatData.equals(simpleDateFormat.formatData);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        if (this.defaultCenturyStart == null) {
            initializeDefaultCenturyStart(this.defaultCenturyBase);
        }
        initializeTimeZoneFormat(false);
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(getContext(DisplayContext.Type.CAPITALIZATION).value());
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i = this.serialVersionOnStream > 1 ? objectInputStream.readInt() : -1;
        if (this.serialVersionOnStream < 1) {
            this.defaultCenturyBase = System.currentTimeMillis();
        } else {
            parseAmbiguousDatesAsAfter(this.defaultCenturyStart);
        }
        this.serialVersionOnStream = 2;
        ULocale locale = getLocale(ULocale.VALID_LOCALE);
        this.locale = locale;
        if (locale == null) {
            this.locale = ULocale.getDefault(ULocale.Category.FORMAT);
        }
        initLocalZeroPaddingNumberFormat();
        setContext(DisplayContext.CAPITALIZATION_NONE);
        if (i >= 0) {
            DisplayContext[] displayContextArrValues = DisplayContext.values();
            int length = displayContextArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                DisplayContext displayContext = displayContextArrValues[i2];
                if (displayContext.value() == i) {
                    setContext(displayContext);
                    break;
                }
                i2++;
            }
        }
        if (!getBooleanAttribute(DateFormat.BooleanAttribute.PARSE_PARTIAL_MATCH)) {
            setBooleanAttribute(DateFormat.BooleanAttribute.PARSE_PARTIAL_LITERAL_MATCH, false);
        }
        parsePattern();
    }

    @Override // java.text.Format
    public AttributedCharacterIterator formatToCharacterIterator(Object obj) {
        Calendar calendar = this.calendar;
        if (obj instanceof Calendar) {
            calendar = (Calendar) obj;
        } else if (obj instanceof Date) {
            calendar.setTime((Date) obj);
        } else if (obj instanceof Number) {
            calendar.setTimeInMillis(((Number) obj).longValue());
        } else {
            throw new IllegalArgumentException("Cannot format given Object as a Date");
        }
        Calendar calendar2 = calendar;
        StringBuffer stringBuffer = new StringBuffer();
        FieldPosition fieldPosition = new FieldPosition(0);
        ArrayList arrayList = new ArrayList();
        format(calendar2, getContext(DisplayContext.Type.CAPITALIZATION), stringBuffer, fieldPosition, arrayList);
        AttributedString attributedString = new AttributedString(stringBuffer.toString());
        for (int i = 0; i < arrayList.size(); i++) {
            FieldPosition fieldPosition2 = arrayList.get(i);
            Format.Field fieldAttribute = fieldPosition2.getFieldAttribute();
            attributedString.addAttribute(fieldAttribute, fieldAttribute, fieldPosition2.getBeginIndex(), fieldPosition2.getEndIndex());
        }
        return attributedString.getIterator();
    }

    public boolean isFieldUnitIgnored(int i) {
        return isFieldUnitIgnored(this.pattern, i);
    }

    public static boolean isFieldUnitIgnored(String str, int i) {
        int i2 = CALENDAR_FIELD_TO_LEVEL[i];
        int i3 = 0;
        int i4 = 0;
        char c = 0;
        boolean z = false;
        while (i3 < str.length()) {
            char cCharAt = str.charAt(i3);
            if (cCharAt != c && i4 > 0) {
                if (i2 <= getLevelFromChar(c)) {
                    return false;
                }
                i4 = 0;
            }
            if (cCharAt == '\'') {
                int i5 = i3 + 1;
                if (i5 >= str.length() || str.charAt(i5) != '\'') {
                    z = !z;
                } else {
                    i3 = i5;
                }
            } else if (!z && isSyntaxChar(cCharAt)) {
                i4++;
                c = cCharAt;
            }
            i3++;
        }
        return i4 <= 0 || i2 > getLevelFromChar(c);
    }

    @Deprecated
    public final StringBuffer intervalFormatByAlgorithm(Calendar calendar, Calendar calendar2, StringBuffer stringBuffer, FieldPosition fieldPosition) throws IllegalArgumentException {
        int i;
        int i2;
        int i3;
        int i4;
        String str;
        if (!calendar.isEquivalentTo(calendar2)) {
            throw new IllegalArgumentException("can not format on two different calendars");
        }
        Object[] patternItems = getPatternItems();
        int i5 = 0;
        while (true) {
            try {
                if (i5 >= patternItems.length) {
                    i5 = -1;
                    break;
                }
                if (diffCalFieldValue(calendar, calendar2, patternItems, i5)) {
                    break;
                }
                i5++;
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException(e.toString());
            }
        }
        if (i5 == -1) {
            return format(calendar, stringBuffer, fieldPosition);
        }
        int length = patternItems.length - 1;
        while (true) {
            if (length < i5) {
                length = -1;
                break;
            }
            if (diffCalFieldValue(calendar, calendar2, patternItems, length)) {
                break;
            }
            length--;
        }
        String str2 = " – ";
        if (i5 == 0 && length == patternItems.length - 1) {
            format(calendar, stringBuffer, fieldPosition);
            stringBuffer.append(" – ");
            format(calendar2, stringBuffer, fieldPosition);
            return stringBuffer;
        }
        int i6 = 1000;
        for (int i7 = i5; i7 <= length; i7++) {
            Object obj = patternItems[i7];
            if (!(obj instanceof String)) {
                char c = ((Activity) obj).copydefault;
                int indexFromChar = getIndexFromChar(c);
                if (indexFromChar == -1) {
                    throw new IllegalArgumentException("Illegal pattern character '" + c + "' in \"" + this.pattern + '\"');
                }
                if (indexFromChar < i6) {
                    i6 = indexFromChar;
                }
            }
        }
        int i8 = 0;
        while (true) {
            if (i8 >= i5) {
                i = i5;
                break;
            }
            try {
                if (lowerLevel(patternItems, i8, i6)) {
                    i = i8;
                    break;
                }
                i8++;
            } catch (IllegalArgumentException e2) {
                throw new IllegalArgumentException(e2.toString());
            }
        }
        int length2 = patternItems.length - 1;
        while (true) {
            if (length2 <= length) {
                i2 = length;
                break;
            }
            if (lowerLevel(patternItems, length2, i6)) {
                i2 = length2;
                break;
            }
            length2--;
        }
        if (i == 0 && i2 == patternItems.length - 1) {
            format(calendar, stringBuffer, fieldPosition);
            stringBuffer.append(" – ");
            format(calendar2, stringBuffer, fieldPosition);
            return stringBuffer;
        }
        fieldPosition.setBeginIndex(0);
        fieldPosition.setEndIndex(0);
        DisplayContext context = getContext(DisplayContext.Type.CAPITALIZATION);
        int i9 = 0;
        while (i9 <= i2) {
            Object obj2 = patternItems[i9];
            if (obj2 instanceof String) {
                stringBuffer.append((String) obj2);
                i3 = i9;
                i4 = i2;
                str = str2;
            } else {
                Activity activity = (Activity) obj2;
                if (this.useFastFormat) {
                    i3 = i9;
                    i4 = i2;
                    str = str2;
                    subFormat(stringBuffer, activity.copydefault, activity.OLrzqt, stringBuffer.length(), i9, context, fieldPosition, activity.copydefault, calendar);
                } else {
                    i3 = i9;
                    i4 = i2;
                    str = str2;
                    stringBuffer.append(subFormat(activity.copydefault, activity.OLrzqt, stringBuffer.length(), i3, context, fieldPosition, activity.copydefault, calendar));
                }
            }
            i9 = i3 + 1;
            str2 = str;
            i2 = i4;
        }
        stringBuffer.append(str2);
        for (int i10 = i; i10 < patternItems.length; i10++) {
            Object obj3 = patternItems[i10];
            if (obj3 instanceof String) {
                stringBuffer.append((String) obj3);
            } else {
                Activity activity2 = (Activity) obj3;
                if (this.useFastFormat) {
                    subFormat(stringBuffer, activity2.copydefault, activity2.OLrzqt, stringBuffer.length(), i10, context, fieldPosition, activity2.copydefault, calendar2);
                } else {
                    stringBuffer.append(subFormat(activity2.copydefault, activity2.OLrzqt, stringBuffer.length(), i10, context, fieldPosition, activity2.copydefault, calendar2));
                }
            }
        }
        return stringBuffer;
    }

    private boolean diffCalFieldValue(Calendar calendar, Calendar calendar2, Object[] objArr, int i) throws IllegalArgumentException {
        Object obj = objArr[i];
        if (obj instanceof String) {
            return false;
        }
        char c = ((Activity) obj).copydefault;
        int indexFromChar = getIndexFromChar(c);
        if (indexFromChar == -1) {
            throw new IllegalArgumentException("Illegal pattern character '" + c + "' in \"" + this.pattern + '\"');
        }
        int i2 = PATTERN_INDEX_TO_CALENDAR_FIELD[indexFromChar];
        return i2 >= 0 && calendar.get(i2) != calendar2.get(i2);
    }

    private boolean lowerLevel(Object[] objArr, int i, int i2) throws IllegalArgumentException {
        Object obj = objArr[i];
        if (obj instanceof String) {
            return false;
        }
        char c = ((Activity) obj).copydefault;
        int levelFromChar = getLevelFromChar(c);
        if (levelFromChar != -1) {
            return levelFromChar >= i2;
        }
        throw new IllegalArgumentException("Illegal pattern character '" + c + "' in \"" + this.pattern + '\"');
    }

    public void setNumberFormat(String str, NumberFormat numberFormat) {
        numberFormat.setGroupingUsed(false);
        String str2 = "$" + UUID.randomUUID().toString();
        if (this.numberFormatters == null) {
            this.numberFormatters = new HashMap<>();
        }
        if (this.overrideMap == null) {
            this.overrideMap = new HashMap<>();
        }
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if ("GyMdkHmsSEDFwWahKzYeugAZvcLQqVUOXxrbB".indexOf(cCharAt) == -1) {
                throw new IllegalArgumentException("Illegal field character '" + cCharAt + "' in setNumberFormat.");
            }
            this.overrideMap.put(Character.valueOf(cCharAt), str2);
            this.numberFormatters.put(str2, numberFormat);
        }
        this.useLocalZeroPaddingNumberFormat = false;
    }

    public NumberFormat getNumberFormat(char c) {
        Character chValueOf = Character.valueOf(c);
        HashMap<Character, String> map = this.overrideMap;
        if (map == null || !map.containsKey(chValueOf)) {
            return this.numberFormat;
        }
        return this.numberFormatters.get(this.overrideMap.get(chValueOf).toString());
    }

    private void initNumberFormatters(ULocale uLocale) {
        this.numberFormatters = new HashMap<>();
        this.overrideMap = new HashMap<>();
        processOverrideString(uLocale, this.override);
    }

    private void processOverrideString(ULocale uLocale, String str) {
        boolean z;
        int length;
        boolean z2;
        if (str == null || str.length() == 0) {
            return;
        }
        boolean z3 = true;
        int i = 0;
        while (z3) {
            int iIndexOf = str.indexOf(";", i);
            if (iIndexOf == -1) {
                length = str.length();
                z = false;
            } else {
                z = z3;
                length = iIndexOf;
            }
            String strSubstring = str.substring(i, length);
            int iIndexOf2 = strSubstring.indexOf(ContainerUtils.KEY_VALUE_DELIMITER);
            if (iIndexOf2 == -1) {
                z2 = true;
            } else {
                String strSubstring2 = strSubstring.substring(iIndexOf2 + 1);
                this.overrideMap.put(Character.valueOf(strSubstring.charAt(0)), strSubstring2);
                strSubstring = strSubstring2;
                z2 = false;
            }
            NumberFormat numberFormatCreateInstance = NumberFormat.createInstance(new ULocale(uLocale.getBaseName() + "@numbers=" + strSubstring), 0);
            numberFormatCreateInstance.setGroupingUsed(false);
            if (z2) {
                setNumberFormat(numberFormatCreateInstance);
            } else {
                this.useLocalZeroPaddingNumberFormat = false;
            }
            if (!z2 && !this.numberFormatters.containsKey(strSubstring)) {
                this.numberFormatters.put(strSubstring, numberFormatCreateInstance);
            }
            i = iIndexOf + 1;
            z3 = z;
        }
    }

    private void parsePattern() {
        this.hasMinute = false;
        this.hasSecond = false;
        this.hasHanYearChar = false;
        boolean z = false;
        for (int i = 0; i < this.pattern.length(); i++) {
            char cCharAt = this.pattern.charAt(i);
            if (cCharAt == '\'') {
                z = !z;
            }
            if (cCharAt == 24180) {
                this.hasHanYearChar = true;
            }
            if (!z) {
                if (cCharAt == 'm') {
                    this.hasMinute = true;
                }
                if (cCharAt == 's') {
                    this.hasSecond = true;
                }
            }
        }
    }
}
