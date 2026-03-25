package com.ibm.icu.text;

import com.bytedance.applog.encryptor.IEncryptorType;
import com.ibm.icu.impl.FormattedValueFieldPositionIteratorImpl;
import com.ibm.icu.impl.ICUResourceBundle;
import com.ibm.icu.text.DateIntervalInfo;
import com.ibm.icu.text.DisplayContext;
import com.ibm.icu.text.UFormat;
import com.ibm.icu.util.Calendar;
import com.ibm.icu.util.DateInterval;
import com.ibm.icu.util.TimeZone;
import com.ibm.icu.util.ULocale;
import com.ibm.icu.util.UResourceBundle;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import o.C7027acA;
import o.C7028acB;
import o.C7255agQ;
import o.InterfaceC7054acb;
import o.InterfaceC7269age;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes22.dex */
public class DateIntervalFormat extends UFormat {
    private static InterfaceC7054acb<String, Map<String, DateIntervalInfo.PatternInfo>> LOCAL_PATTERN_CACHE = new C7027acA();
    private static final long serialVersionUID = 1;
    private DisplayContext fCapitalizationSetting;
    private SimpleDateFormat fDateFormat;
    private String fDatePattern;
    private String fDateTimeFormat;
    private Calendar fFromCalendar;
    private DateIntervalInfo fInfo;
    private transient Map<String, DateIntervalInfo.PatternInfo> fIntervalPatterns;
    private String fSkeleton;
    private String fTimePattern;
    private Calendar fToCalendar;
    private boolean isDateIntervalInfoDefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Deprecated
    public Map<String, DateIntervalInfo.PatternInfo> getRawPatterns() {
        return this.fIntervalPatterns;
    }

    public static final class Activity implements InterfaceC7269age {
        public final List<FieldPosition> AEQbTJ;
        public final String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.lang.CharSequence
        public String toString() {
            return this.copydefault;
        }

        public Activity(CharSequence charSequence, List<FieldPosition> list) {
            this.copydefault = charSequence.toString();
            this.AEQbTJ = Collections.unmodifiableList(list);
        }

        @Override // java.lang.CharSequence
        public int length() {
            return this.copydefault.length();
        }

        @Override // java.lang.CharSequence
        public char charAt(int i) {
            return this.copydefault.charAt(i);
        }

        @Override // java.lang.CharSequence
        public CharSequence subSequence(int i, int i2) {
            return this.copydefault.subSequence(i, i2);
        }
    }

    public static final class SpanField extends UFormat.SpanField {
        public static final SpanField DATE_INTERVAL_SPAN = new SpanField("date-interval-span");
        private static final long serialVersionUID = -6330879259553618133L;

        private SpanField(String str) {
            super(str);
        }

        @Override // java.text.AttributedCharacterIterator.Attribute
        public Object readResolve() throws InvalidObjectException {
            String name = getName();
            SpanField spanField = DATE_INTERVAL_SPAN;
            if (name.equals(spanField.getName())) {
                return spanField;
            }
            throw new InvalidObjectException("An invalid object.");
        }
    }

    public static final class TaskDescription {
        public final String EZpvd;
        public final int KWHzl;

        public TaskDescription(String str, int i) {
            this.EZpvd = str;
            this.KWHzl = i;
        }
    }

    public static final class ActionBar {
        public final String KWHzl;
        public final String OLrzqt;

        public ActionBar(String str, String str2) {
            this.KWHzl = str;
            this.OLrzqt = str2;
        }
    }

    public static final class Application {
        public int OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void EZpvd(int i) {
            if (this.OLrzqt == -1) {
                this.OLrzqt = i;
            }
        }

        private Application() {
            this.OLrzqt = -1;
        }
    }

    private DateIntervalFormat() {
        this.fSkeleton = null;
        this.fIntervalPatterns = null;
        this.fDatePattern = null;
        this.fTimePattern = null;
        this.fDateTimeFormat = null;
        this.fCapitalizationSetting = DisplayContext.CAPITALIZATION_NONE;
    }

    @Deprecated
    public DateIntervalFormat(String str, DateIntervalInfo dateIntervalInfo, SimpleDateFormat simpleDateFormat) {
        this.fSkeleton = null;
        this.fIntervalPatterns = null;
        this.fDatePattern = null;
        this.fTimePattern = null;
        this.fDateTimeFormat = null;
        this.fCapitalizationSetting = DisplayContext.CAPITALIZATION_NONE;
        this.fDateFormat = simpleDateFormat;
        dateIntervalInfo.m6325freeze();
        this.fSkeleton = str;
        this.fInfo = dateIntervalInfo;
        this.isDateIntervalInfoDefault = false;
        this.fFromCalendar = (Calendar) this.fDateFormat.getCalendar().clone();
        this.fToCalendar = (Calendar) this.fDateFormat.getCalendar().clone();
        initializePattern(null);
    }

    private DateIntervalFormat(String str, ULocale uLocale, SimpleDateFormat simpleDateFormat) {
        this.fSkeleton = null;
        this.fIntervalPatterns = null;
        this.fDatePattern = null;
        this.fTimePattern = null;
        this.fDateTimeFormat = null;
        this.fCapitalizationSetting = DisplayContext.CAPITALIZATION_NONE;
        this.fDateFormat = simpleDateFormat;
        this.fSkeleton = str;
        this.fInfo = new DateIntervalInfo(uLocale).m6325freeze();
        this.isDateIntervalInfoDefault = true;
        this.fFromCalendar = (Calendar) this.fDateFormat.getCalendar().clone();
        this.fToCalendar = (Calendar) this.fDateFormat.getCalendar().clone();
        initializePattern(LOCAL_PATTERN_CACHE);
    }

    public static final DateIntervalFormat getInstance(String str) {
        return getInstance(str, ULocale.getDefault(ULocale.Category.FORMAT));
    }

    public static final DateIntervalFormat getInstance(String str, Locale locale) {
        return getInstance(str, ULocale.forLocale(locale));
    }

    public static final DateIntervalFormat getInstance(String str, ULocale uLocale) {
        return new DateIntervalFormat(str, uLocale, new SimpleDateFormat(DateTimePatternGenerator.KWHzl(uLocale).EZpvd(str), uLocale));
    }

    public static final DateIntervalFormat getInstance(String str, DateIntervalInfo dateIntervalInfo) {
        return getInstance(str, ULocale.getDefault(ULocale.Category.FORMAT), dateIntervalInfo);
    }

    public static final DateIntervalFormat getInstance(String str, Locale locale, DateIntervalInfo dateIntervalInfo) {
        return getInstance(str, ULocale.forLocale(locale), dateIntervalInfo);
    }

    public static final DateIntervalFormat getInstance(String str, ULocale uLocale, DateIntervalInfo dateIntervalInfo) {
        return new DateIntervalFormat(str, (DateIntervalInfo) dateIntervalInfo.clone(), new SimpleDateFormat(DateTimePatternGenerator.KWHzl(uLocale).EZpvd(str), uLocale));
    }

    @Override // java.text.Format
    public Object clone() {
        DateIntervalFormat dateIntervalFormat;
        synchronized (this) {
            dateIntervalFormat = (DateIntervalFormat) super.clone();
            dateIntervalFormat.fDateFormat = (SimpleDateFormat) this.fDateFormat.clone();
            dateIntervalFormat.fInfo = (DateIntervalInfo) this.fInfo.clone();
            dateIntervalFormat.fFromCalendar = (Calendar) this.fFromCalendar.clone();
            dateIntervalFormat.fToCalendar = (Calendar) this.fToCalendar.clone();
            dateIntervalFormat.fDatePattern = this.fDatePattern;
            dateIntervalFormat.fTimePattern = this.fTimePattern;
            dateIntervalFormat.fDateTimeFormat = this.fDateTimeFormat;
            dateIntervalFormat.fCapitalizationSetting = this.fCapitalizationSetting;
        }
        return dateIntervalFormat;
    }

    @Override // java.text.Format
    public final StringBuffer format(Object obj, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        if (obj instanceof DateInterval) {
            return format((DateInterval) obj, stringBuffer, fieldPosition);
        }
        throw new IllegalArgumentException("Cannot format given Object (" + obj.getClass().getName() + ") as a DateInterval");
    }

    public final StringBuffer format(DateInterval dateInterval, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        return formatIntervalImpl(dateInterval, stringBuffer, fieldPosition, null, null);
    }

    public Activity formatToValue(DateInterval dateInterval) {
        StringBuffer stringBuffer = new StringBuffer();
        FieldPosition fieldPosition = new FieldPosition(0);
        Application application = new Application();
        ArrayList arrayList = new ArrayList();
        formatIntervalImpl(dateInterval, stringBuffer, fieldPosition, application, arrayList);
        int i = application.OLrzqt;
        if (i != -1) {
            FormattedValueFieldPositionIteratorImpl.OLrzqt(arrayList, SpanField.DATE_INTERVAL_SPAN, i);
            FormattedValueFieldPositionIteratorImpl.EZpvd(arrayList);
        }
        return new Activity(stringBuffer, arrayList);
    }

    private StringBuffer formatIntervalImpl(DateInterval dateInterval, StringBuffer stringBuffer, FieldPosition fieldPosition, Application application, List<FieldPosition> list) {
        StringBuffer impl;
        synchronized (this) {
            this.fFromCalendar.setTimeInMillis(dateInterval.getFromDate());
            this.fToCalendar.setTimeInMillis(dateInterval.getToDate());
            impl = formatImpl(this.fFromCalendar, this.fToCalendar, stringBuffer, fieldPosition, application, list);
        }
        return impl;
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [T, java.lang.String] */
    @Deprecated
    public String getPatterns(Calendar calendar, Calendar calendar2, C7255agQ<String> c7255agQ) {
        char c = 0;
        if (calendar.get(0) == calendar2.get(0)) {
            c = 1;
            if (calendar.get(1) == calendar2.get(1)) {
                c = 2;
                if (calendar.get(2) == calendar2.get(2)) {
                    c = 5;
                    if (calendar.get(5) == calendar2.get(5)) {
                        c = '\t';
                        if (calendar.get(9) == calendar2.get(9)) {
                            c = '\n';
                            if (calendar.get(10) == calendar2.get(10)) {
                                c = '\f';
                                if (calendar.get(12) == calendar2.get(12)) {
                                    c = '\r';
                                    if (calendar.get(13) == calendar2.get(13)) {
                                        c = 14;
                                        if (calendar.get(14) == calendar2.get(14)) {
                                            return null;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        DateIntervalInfo.PatternInfo patternInfo = this.fIntervalPatterns.get(DateIntervalInfo.CALENDAR_FIELD_TO_PATTERN_LETTER[c]);
        c7255agQ.copydefault = patternInfo.getSecondPart();
        return patternInfo.getFirstPart();
    }

    public final StringBuffer format(Calendar calendar, Calendar calendar2, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        return formatImpl(calendar, calendar2, stringBuffer, fieldPosition, null, null);
    }

    public Activity formatToValue(Calendar calendar, Calendar calendar2) {
        StringBuffer stringBuffer = new StringBuffer();
        FieldPosition fieldPosition = new FieldPosition(0);
        Application application = new Application();
        ArrayList arrayList = new ArrayList();
        formatImpl(calendar, calendar2, stringBuffer, fieldPosition, application, arrayList);
        int i = application.OLrzqt;
        if (i != -1) {
            FormattedValueFieldPositionIteratorImpl.OLrzqt(arrayList, SpanField.DATE_INTERVAL_SPAN, i);
            FormattedValueFieldPositionIteratorImpl.EZpvd(arrayList);
        }
        return new Activity(stringBuffer, arrayList);
    }

    private StringBuffer formatImpl(Calendar calendar, Calendar calendar2, StringBuffer stringBuffer, FieldPosition fieldPosition, Application application, List<FieldPosition> list) {
        int i;
        Calendar calendar3 = calendar;
        Calendar calendar4 = calendar2;
        synchronized (this) {
            if (!calendar.isEquivalentTo(calendar2)) {
                throw new IllegalArgumentException("can not format on two different calendars");
            }
            this.fDateFormat.setContext(this.fCapitalizationSetting);
            if (calendar3.get(0) != calendar4.get(0)) {
                i = 0;
            } else if (calendar3.get(1) != calendar4.get(1)) {
                i = 1;
            } else {
                i = 2;
                if (calendar3.get(2) == calendar4.get(2)) {
                    i = 5;
                    if (calendar3.get(5) == calendar4.get(5)) {
                        if (calendar3.get(9) != calendar4.get(9)) {
                            i = 9;
                        } else if (calendar3.get(10) != calendar4.get(10)) {
                            i = 10;
                        } else if (calendar3.get(12) != calendar4.get(12)) {
                            i = 12;
                        } else if (calendar3.get(13) != calendar4.get(13)) {
                            i = 13;
                        } else {
                            if (calendar3.get(14) == calendar4.get(14)) {
                                return this.fDateFormat.format(calendar3, stringBuffer, fieldPosition, list);
                            }
                            i = 14;
                        }
                    }
                }
            }
            boolean z = i == 9 || i == 10 || i == 12 || i == 13 || i == 14;
            DateIntervalInfo.PatternInfo patternInfo = this.fIntervalPatterns.get(DateIntervalInfo.CALENDAR_FIELD_TO_PATTERN_LETTER[i]);
            if (patternInfo == null) {
                if (this.fDateFormat.isFieldUnitIgnored(i)) {
                    return this.fDateFormat.format(calendar3, stringBuffer, fieldPosition, list);
                }
                return fallbackFormat(calendar, calendar2, z, stringBuffer, fieldPosition, application, list);
            }
            if (patternInfo.getFirstPart() == null) {
                return fallbackFormat(calendar, calendar2, z, stringBuffer, fieldPosition, application, list, patternInfo.getSecondPart());
            }
            if (patternInfo.firstDateInPtnIsLaterDate()) {
                if (application != null) {
                    application.EZpvd(1);
                }
                calendar4 = calendar3;
                calendar3 = calendar4;
            } else if (application != null) {
                application.EZpvd(0);
            }
            String pattern = this.fDateFormat.toPattern();
            this.fDateFormat.applyPattern(patternInfo.getFirstPart());
            this.fDateFormat.format(calendar3, stringBuffer, fieldPosition, list);
            FieldPosition fieldPosition2 = fieldPosition.getEndIndex() > 0 ? new FieldPosition(0) : fieldPosition;
            if (patternInfo.getSecondPart() != null) {
                this.fDateFormat.applyPattern(patternInfo.getSecondPart());
                this.fDateFormat.setContext(DisplayContext.CAPITALIZATION_NONE);
                this.fDateFormat.format(calendar4, stringBuffer, fieldPosition2, list);
            }
            this.fDateFormat.applyPattern(pattern);
            return stringBuffer;
        }
    }

    private final void fallbackFormatRange(Calendar calendar, Calendar calendar2, StringBuffer stringBuffer, StringBuilder sb, FieldPosition fieldPosition, Application application, List<FieldPosition> list) {
        String strOLrzqt = C7028acB.OLrzqt(this.fInfo.getFallbackIntervalPattern(), sb, 2, 2);
        long jEZpvd = 0;
        while (true) {
            jEZpvd = C7028acB.TaskDescription.EZpvd(jEZpvd, strOLrzqt, stringBuffer);
            if (jEZpvd == -1) {
                return;
            }
            if (C7028acB.TaskDescription.AEQbTJ(jEZpvd) == 0) {
                if (application != null) {
                    application.EZpvd(0);
                }
                this.fDateFormat.format(calendar, stringBuffer, fieldPosition, list);
            } else {
                if (application != null) {
                    application.EZpvd(1);
                }
                this.fDateFormat.format(calendar2, stringBuffer, fieldPosition, list);
            }
            if (fieldPosition.getEndIndex() > 0) {
                fieldPosition = new FieldPosition(0);
            }
            this.fDateFormat.setContext(DisplayContext.CAPITALIZATION_NONE);
        }
    }

    private final StringBuffer fallbackFormat(Calendar calendar, Calendar calendar2, boolean z, StringBuffer stringBuffer, FieldPosition fieldPosition, Application application, List<FieldPosition> list) {
        StringBuilder sb = new StringBuilder();
        if (z && this.fDatePattern != null && this.fTimePattern != null) {
            String strOLrzqt = C7028acB.OLrzqt(this.fDateTimeFormat, sb, 2, 2);
            String pattern = this.fDateFormat.toPattern();
            long j = 0;
            FieldPosition fieldPosition2 = fieldPosition;
            while (true) {
                long jEZpvd = C7028acB.TaskDescription.EZpvd(j, strOLrzqt, stringBuffer);
                if (jEZpvd == -1) {
                    break;
                }
                if (C7028acB.TaskDescription.AEQbTJ(jEZpvd) == 0) {
                    this.fDateFormat.applyPattern(this.fTimePattern);
                    fallbackFormatRange(calendar, calendar2, stringBuffer, sb, fieldPosition2, application, list);
                } else {
                    this.fDateFormat.applyPattern(this.fDatePattern);
                    this.fDateFormat.format(calendar, stringBuffer, fieldPosition2, list);
                }
                if (fieldPosition2.getEndIndex() > 0) {
                    fieldPosition2 = new FieldPosition(0);
                }
                this.fDateFormat.setContext(DisplayContext.CAPITALIZATION_NONE);
                j = jEZpvd;
            }
            this.fDateFormat.applyPattern(pattern);
        } else {
            fallbackFormatRange(calendar, calendar2, stringBuffer, sb, fieldPosition, application, list);
        }
        return stringBuffer;
    }

    private final StringBuffer fallbackFormat(Calendar calendar, Calendar calendar2, boolean z, StringBuffer stringBuffer, FieldPosition fieldPosition, Application application, List<FieldPosition> list, String str) {
        String pattern = this.fDateFormat.toPattern();
        this.fDateFormat.applyPattern(str);
        fallbackFormat(calendar, calendar2, z, stringBuffer, fieldPosition, application, list);
        this.fDateFormat.applyPattern(pattern);
        return stringBuffer;
    }

    @Override // java.text.Format
    @Deprecated
    public Object parseObject(String str, ParsePosition parsePosition) {
        throw new UnsupportedOperationException("parsing is not supported");
    }

    public DateIntervalInfo getDateIntervalInfo() {
        return (DateIntervalInfo) this.fInfo.clone();
    }

    public void setDateIntervalInfo(DateIntervalInfo dateIntervalInfo) {
        DateIntervalInfo dateIntervalInfo2 = (DateIntervalInfo) dateIntervalInfo.clone();
        this.fInfo = dateIntervalInfo2;
        this.isDateIntervalInfoDefault = false;
        dateIntervalInfo2.m6325freeze();
        if (this.fDateFormat != null) {
            initializePattern(null);
        }
    }

    public TimeZone getTimeZone() {
        SimpleDateFormat simpleDateFormat = this.fDateFormat;
        if (simpleDateFormat != null) {
            return (TimeZone) simpleDateFormat.getTimeZone().clone();
        }
        return TimeZone.getDefault();
    }

    public void setTimeZone(TimeZone timeZone) {
        TimeZone timeZone2 = (TimeZone) timeZone.clone();
        SimpleDateFormat simpleDateFormat = this.fDateFormat;
        if (simpleDateFormat != null) {
            simpleDateFormat.setTimeZone(timeZone2);
        }
        Calendar calendar = this.fFromCalendar;
        if (calendar != null) {
            calendar.setTimeZone(timeZone2);
        }
        Calendar calendar2 = this.fToCalendar;
        if (calendar2 != null) {
            calendar2.setTimeZone(timeZone2);
        }
    }

    public void setContext(DisplayContext displayContext) {
        if (displayContext.type() == DisplayContext.Type.CAPITALIZATION) {
            this.fCapitalizationSetting = displayContext;
        }
    }

    public DisplayContext getContext(DisplayContext.Type type) {
        DisplayContext displayContext;
        return (type != DisplayContext.Type.CAPITALIZATION || (displayContext = this.fCapitalizationSetting) == null) ? DisplayContext.CAPITALIZATION_NONE : displayContext;
    }

    public DateFormat getDateFormat() {
        DateFormat dateFormat;
        synchronized (this) {
            dateFormat = (DateFormat) this.fDateFormat.clone();
        }
        return dateFormat;
    }

    private void initializePattern(InterfaceC7054acb<String, Map<String, DateIntervalInfo.PatternInfo>> interfaceC7054acb) {
        String str;
        Map<String, DateIntervalInfo.PatternInfo> mapUnmodifiableMap;
        String pattern = this.fDateFormat.toPattern();
        ULocale locale = this.fDateFormat.getLocale();
        if (interfaceC7054acb != null) {
            if (this.fSkeleton != null) {
                str = locale.toString() + Marker.ANY_NON_NULL_MARKER + pattern + Marker.ANY_NON_NULL_MARKER + this.fSkeleton;
            } else {
                str = locale.toString() + Marker.ANY_NON_NULL_MARKER + pattern;
            }
            mapUnmodifiableMap = interfaceC7054acb.EZpvd(str);
        } else {
            str = null;
            mapUnmodifiableMap = null;
        }
        if (mapUnmodifiableMap == null) {
            mapUnmodifiableMap = Collections.unmodifiableMap(initializeIntervalPattern(pattern, locale));
            if (interfaceC7054acb != null) {
                interfaceC7054acb.KWHzl(str, mapUnmodifiableMap);
            }
        }
        this.fIntervalPatterns = mapUnmodifiableMap;
    }

    private Map<String, DateIntervalInfo.PatternInfo> initializeIntervalPattern(String str, ULocale uLocale) {
        DateTimePatternGenerator dateTimePatternGeneratorKWHzl = DateTimePatternGenerator.KWHzl(uLocale);
        if (this.fSkeleton == null) {
            this.fSkeleton = dateTimePatternGeneratorKWHzl.OLrzqt(str);
        }
        String strNormalizeHourMetacharacters = normalizeHourMetacharacters(this.fSkeleton, uLocale);
        HashMap map = new HashMap();
        StringBuilder sb = new StringBuilder(strNormalizeHourMetacharacters.length());
        StringBuilder sb2 = new StringBuilder(strNormalizeHourMetacharacters.length());
        StringBuilder sb3 = new StringBuilder(strNormalizeHourMetacharacters.length());
        StringBuilder sb4 = new StringBuilder(strNormalizeHourMetacharacters.length());
        getDateTimeSkeleton(strNormalizeHourMetacharacters, sb, sb2, sb3, sb4);
        String string = sb.toString();
        String string2 = sb3.toString();
        String string3 = sb2.toString();
        String string4 = sb4.toString();
        if (sb3.length() != 0 && sb.length() != 0) {
            this.fDateTimeFormat = getConcatenationPattern(uLocale);
        }
        if (!genSeparateDateTimePtn(string3, string4, map, dateTimePatternGeneratorKWHzl)) {
            if (sb3.length() != 0 && sb.length() == 0) {
                DateIntervalInfo.PatternInfo patternInfo = new DateIntervalInfo.PatternInfo(null, dateTimePatternGeneratorKWHzl.EZpvd(DateFormat.YEAR_NUM_MONTH_DAY + string2), this.fInfo.getDefaultOrder());
                String[] strArr = DateIntervalInfo.CALENDAR_FIELD_TO_PATTERN_LETTER;
                map.put(strArr[5], patternInfo);
                map.put(strArr[2], patternInfo);
                map.put(strArr[1], patternInfo);
            }
            return map;
        }
        if (sb3.length() != 0) {
            if (sb.length() == 0) {
                DateIntervalInfo.PatternInfo patternInfo2 = new DateIntervalInfo.PatternInfo(null, dateTimePatternGeneratorKWHzl.EZpvd(DateFormat.YEAR_NUM_MONTH_DAY + string2), this.fInfo.getDefaultOrder());
                String[] strArr2 = DateIntervalInfo.CALENDAR_FIELD_TO_PATTERN_LETTER;
                map.put(strArr2[5], patternInfo2);
                map.put(strArr2[2], patternInfo2);
                map.put(strArr2[1], patternInfo2);
            } else {
                if (!fieldExistsInSkeleton(5, string)) {
                    strNormalizeHourMetacharacters = DateIntervalInfo.CALENDAR_FIELD_TO_PATTERN_LETTER[5] + strNormalizeHourMetacharacters;
                    genFallbackPattern(5, strNormalizeHourMetacharacters, map, dateTimePatternGeneratorKWHzl);
                }
                if (!fieldExistsInSkeleton(2, string)) {
                    strNormalizeHourMetacharacters = DateIntervalInfo.CALENDAR_FIELD_TO_PATTERN_LETTER[2] + strNormalizeHourMetacharacters;
                    genFallbackPattern(2, strNormalizeHourMetacharacters, map, dateTimePatternGeneratorKWHzl);
                }
                if (!fieldExistsInSkeleton(1, string)) {
                    genFallbackPattern(1, DateIntervalInfo.CALENDAR_FIELD_TO_PATTERN_LETTER[1] + strNormalizeHourMetacharacters, map, dateTimePatternGeneratorKWHzl);
                }
                if (this.fDateTimeFormat == null) {
                    this.fDateTimeFormat = "{1} {0}";
                }
                String strEZpvd = dateTimePatternGeneratorKWHzl.EZpvd(string);
                concatSingleDate2TimeInterval(this.fDateTimeFormat, strEZpvd, 9, map);
                concatSingleDate2TimeInterval(this.fDateTimeFormat, strEZpvd, 10, map);
                concatSingleDate2TimeInterval(this.fDateTimeFormat, strEZpvd, 12, map);
            }
        }
        return map;
    }

    private String getConcatenationPattern(ULocale uLocale) {
        ICUResourceBundle iCUResourceBundle = (ICUResourceBundle) ((ICUResourceBundle) UResourceBundle.KWHzl("com/ibm/icu/impl/data/icudt68b", uLocale)).valueOf("calendar/gregorian/DateTimePatterns").KWHzl(8);
        if (iCUResourceBundle.AuCTel() == 0) {
            return iCUResourceBundle.getFieldNames();
        }
        return iCUResourceBundle.copydefault(0);
    }

    private void genFallbackPattern(int i, String str, Map<String, DateIntervalInfo.PatternInfo> map, DateTimePatternGenerator dateTimePatternGenerator) {
        map.put(DateIntervalInfo.CALENDAR_FIELD_TO_PATTERN_LETTER[i], new DateIntervalInfo.PatternInfo(null, dateTimePatternGenerator.EZpvd(str), this.fInfo.getDefaultOrder()));
    }

    private String normalizeHourMetacharacters(String str, ULocale uLocale) {
        StringBuilder sb = new StringBuilder(str);
        int i = 0;
        char c = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < sb.length(); i4++) {
            char cCharAt = sb.charAt(i4);
            if (cCharAt != 'j' && cCharAt != 'J' && cCharAt != 'C') {
                if (c != 0) {
                    break;
                }
            } else {
                if (c == 0) {
                    i3 = i4;
                    c = cCharAt;
                }
                i2++;
            }
        }
        if (c != 0) {
            String strEZpvd = DateTimePatternGenerator.KWHzl(uLocale).EZpvd(String.valueOf(c));
            while (true) {
                int iIndexOf = strEZpvd.indexOf(39);
                if (iIndexOf == -1) {
                    break;
                }
                int iIndexOf2 = strEZpvd.indexOf(39, iIndexOf + 1);
                if (iIndexOf2 == -1) {
                    iIndexOf2 = iIndexOf;
                }
                strEZpvd = strEZpvd.substring(0, iIndexOf) + strEZpvd.substring(iIndexOf2 + 1);
            }
            char c2 = 'h';
            if (strEZpvd.indexOf(104) == -1) {
                c2 = 'K';
                if (strEZpvd.indexOf(75) == -1) {
                    c2 = strEZpvd.indexOf(107) != -1 ? 'k' : 'H';
                }
            }
            char c3 = 'b';
            if (strEZpvd.indexOf(98) == -1) {
                c3 = 'B';
                if (strEZpvd.indexOf(66) == -1) {
                    c3 = 'a';
                }
            }
            if (c2 == 'H' || c2 == 'k') {
                sb.replace(i3, i2 + i3, String.valueOf(c2));
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(c2);
                if (i2 == 3 || i2 == 4) {
                    while (i < 4) {
                        sb2.append(c3);
                        i++;
                    }
                } else if (i2 == 5 || i2 == 6) {
                    while (i < 5) {
                        sb2.append(c3);
                        i++;
                    }
                } else {
                    sb2.append(c3);
                }
                sb.replace(i3, i2 + i3, sb2.toString());
            }
        }
        return sb.toString();
    }

    private static void getDateTimeSkeleton(String str, StringBuilder sb, StringBuilder sb2, StringBuilder sb3, StringBuilder sb4) {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        char c = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < str.length(); i8++) {
            char cCharAt = str.charAt(i8);
            switch (cCharAt) {
                case 'A':
                case 'B':
                case 'S':
                case 'V':
                case 'Z':
                case 'a':
                case 'b':
                case 'j':
                case 's':
                    sb3.append(cCharAt);
                    sb4.append(cCharAt);
                    break;
                case 'D':
                case 'F':
                case 'G':
                case 'L':
                case 'Q':
                case 'U':
                case 'W':
                case 'Y':
                case 'c':
                case 'e':
                case 'g':
                case 'l':
                case WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST /* 113 */:
                case 'r':
                case 'u':
                case 'w':
                    sb2.append(cCharAt);
                    sb.append(cCharAt);
                    break;
                case 'E':
                    sb.append(cCharAt);
                    i7++;
                    break;
                case 'H':
                case 'K':
                case 'h':
                case 'k':
                    sb3.append(cCharAt);
                    if (c == 0) {
                        c = cCharAt;
                    }
                    break;
                case 'M':
                    sb.append(cCharAt);
                    i6++;
                    break;
                case 'd':
                    sb.append(cCharAt);
                    i5++;
                    break;
                case 'm':
                    sb3.append(cCharAt);
                    i4++;
                    break;
                case 'v':
                    i3++;
                    sb3.append(cCharAt);
                    break;
                case 'y':
                    sb.append(cCharAt);
                    i++;
                    break;
                case 'z':
                    i2++;
                    sb3.append(cCharAt);
                    break;
            }
        }
        if (i != 0) {
            for (int i9 = 0; i9 < i; i9++) {
                sb2.append('y');
            }
        }
        if (i6 != 0) {
            if (i6 < 3) {
                sb2.append('M');
            } else {
                for (int i10 = 0; i10 < i6 && i10 < 5; i10++) {
                    sb2.append('M');
                }
            }
        }
        if (i7 != 0) {
            if (i7 <= 3) {
                sb2.append('E');
            } else {
                for (int i11 = 0; i11 < i7 && i11 < 5; i11++) {
                    sb2.append('E');
                }
            }
        }
        if (i5 != 0) {
            sb2.append('d');
        }
        if (c != 0) {
            sb4.append(c);
        }
        if (i4 != 0) {
            sb4.append('m');
        }
        if (i2 != 0) {
            sb4.append('z');
        }
        if (i3 != 0) {
            sb4.append('v');
        }
    }

    private boolean genSeparateDateTimePtn(String str, String str2, Map<String, DateIntervalInfo.PatternInfo> map, DateTimePatternGenerator dateTimePatternGenerator) {
        String str3 = str2.length() != 0 ? str2 : str;
        TaskDescription bestSkeleton = this.fInfo.getBestSkeleton(str3);
        String str4 = bestSkeleton.EZpvd;
        int i = bestSkeleton.KWHzl;
        if (str.length() != 0) {
            this.fDatePattern = dateTimePatternGenerator.EZpvd(str);
        }
        if (str2.length() != 0) {
            this.fTimePattern = dateTimePatternGenerator.EZpvd(str2);
        }
        if (i == -1) {
            return false;
        }
        if (str2.length() == 0) {
            String str5 = str3;
            genIntervalPattern(5, str5, str4, i, map);
            ActionBar actionBarGenIntervalPattern = genIntervalPattern(2, str5, str4, i, map);
            if (actionBarGenIntervalPattern != null) {
                String str6 = actionBarGenIntervalPattern.KWHzl;
                str3 = actionBarGenIntervalPattern.OLrzqt;
                str4 = str6;
            }
            String str7 = str3;
            String str8 = str4;
            genIntervalPattern(1, str7, str8, i, map);
            genIntervalPattern(0, str7, str8, i, map);
            return true;
        }
        String str9 = str3;
        genIntervalPattern(12, str9, str4, i, map);
        genIntervalPattern(10, str9, str4, i, map);
        genIntervalPattern(9, str9, str4, i, map);
        return true;
    }

    private ActionBar genIntervalPattern(int i, String str, String str2, int i2, Map<String, DateIntervalInfo.PatternInfo> map) {
        boolean z;
        DateIntervalInfo.PatternInfo intervalPattern = this.fInfo.getIntervalPattern(str2, i);
        ActionBar actionBar = null;
        if (intervalPattern == null) {
            if (SimpleDateFormat.isFieldUnitIgnored(str2, i)) {
                map.put(DateIntervalInfo.CALENDAR_FIELD_TO_PATTERN_LETTER[i], new DateIntervalInfo.PatternInfo(this.fDateFormat.toPattern(), null, this.fInfo.getDefaultOrder()));
                return null;
            }
            if (i == 9) {
                DateIntervalInfo.PatternInfo intervalPattern2 = this.fInfo.getIntervalPattern(str2, 10);
                if (intervalPattern2 != null) {
                    z = this.fSkeleton.indexOf(74) != -1;
                    map.put(DateIntervalInfo.CALENDAR_FIELD_TO_PATTERN_LETTER[i], new DateIntervalInfo.PatternInfo(adjustFieldWidth(str, str2, intervalPattern2.getFirstPart(), i2, z), adjustFieldWidth(str, str2, intervalPattern2.getSecondPart(), i2, z), intervalPattern2.firstDateInPtnIsLaterDate()));
                }
                return null;
            }
            String str3 = DateIntervalInfo.CALENDAR_FIELD_TO_PATTERN_LETTER[i];
            str2 = str3 + str2;
            str = str3 + str;
            intervalPattern = this.fInfo.getIntervalPattern(str2, i);
            if (intervalPattern == null && i2 == 0) {
                TaskDescription bestSkeleton = this.fInfo.getBestSkeleton(str);
                String str4 = bestSkeleton.EZpvd;
                i2 = bestSkeleton.KWHzl;
                if (str4.length() != 0 && i2 != -1) {
                    intervalPattern = this.fInfo.getIntervalPattern(str4, i);
                    str2 = str4;
                }
            }
            if (intervalPattern != null) {
                actionBar = new ActionBar(str, str2);
            }
        }
        if (intervalPattern != null) {
            if (i2 != 0) {
                z = this.fSkeleton.indexOf(74) != -1;
                intervalPattern = new DateIntervalInfo.PatternInfo(adjustFieldWidth(str, str2, intervalPattern.getFirstPart(), i2, z), adjustFieldWidth(str, str2, intervalPattern.getSecondPart(), i2, z), intervalPattern.firstDateInPtnIsLaterDate());
            }
            map.put(DateIntervalInfo.CALENDAR_FIELD_TO_PATTERN_LETTER[i], intervalPattern);
        }
        return actionBar;
    }

    private static String adjustFieldWidth(String str, String str2, String str3, int i, boolean z) {
        if (str3 == null) {
            return null;
        }
        int[] iArr = new int[58];
        int[] iArr2 = new int[58];
        DateIntervalInfo.parseSkeleton(str, iArr);
        DateIntervalInfo.parseSkeleton(str2, iArr2);
        if (z) {
            if (str3.indexOf(" a") != -1) {
                str3 = findReplaceInPattern(str3, " a", "");
            } else if (str3.indexOf("a ") != -1) {
                str3 = findReplaceInPattern(str3, "a ", "");
            }
            str3 = findReplaceInPattern(str3, IEncryptorType.DEFAULT_ENCRYPTOR, "");
        }
        if (i == 2) {
            if (str.indexOf(122) != -1) {
                str3 = findReplaceInPattern(str3, DateFormat.ABBR_GENERIC_TZ, DateFormat.ABBR_SPECIFIC_TZ);
            }
            if (str.indexOf(75) != -1) {
                str3 = findReplaceInPattern(str3, "h", "K");
            }
            if (str.indexOf(107) != -1) {
                str3 = findReplaceInPattern(str3, DateFormat.HOUR24, "k");
            }
            if (str.indexOf(98) != -1) {
                str3 = findReplaceInPattern(str3, IEncryptorType.DEFAULT_ENCRYPTOR, "b");
            }
        }
        if (str3.indexOf(97) != -1 && iArr2[32] == 0) {
            iArr2[32] = 1;
        }
        if (str3.indexOf(98) != -1 && iArr2[33] == 0) {
            iArr2[33] = 1;
        }
        StringBuilder sb = new StringBuilder(str3);
        int length = sb.length();
        int i2 = 0;
        int i3 = 0;
        char c = 0;
        boolean z2 = false;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char cCharAt = sb.charAt(i2);
            if (cCharAt != c && i3 > 0) {
                int i4 = (c != 'L' ? c : 'M') - 'A';
                int i5 = iArr2[i4];
                int i6 = iArr[i4];
                if (i5 == i3 && i6 > i5) {
                    int i7 = i6 - i5;
                    for (int i8 = 0; i8 < i7; i8++) {
                        sb.insert(i2, c);
                    }
                    i2 += i7;
                    length += i7;
                }
                i3 = 0;
            }
            if (cCharAt == '\'') {
                int i9 = i2 + 1;
                if (i9 >= sb.length() || sb.charAt(i9) != '\'') {
                    z2 = !z2;
                } else {
                    i2 = i9;
                }
            } else if (!z2 && ((cCharAt >= 'a' && cCharAt <= 'z') || (cCharAt >= 'A' && cCharAt <= 'Z'))) {
                i3++;
                c = cCharAt;
            }
            i2++;
        }
        if (i3 > 0) {
            int i10 = (c != 'L' ? c : 'M') - 'A';
            int i11 = iArr2[i10];
            int i12 = iArr[i10];
            if (i11 == i3 && i12 > i11) {
                for (int i13 = 0; i13 < i12 - i11; i13++) {
                    sb.append(c);
                }
            }
        }
        return sb.toString();
    }

    private static String findReplaceInPattern(String str, String str2, String str3) {
        int iIndexOf = str.indexOf("'");
        if (iIndexOf < 0) {
            return str.replace(str2, str3);
        }
        StringBuilder sb = new StringBuilder();
        while (iIndexOf >= 0) {
            int iIndexOf2 = str.indexOf("'", iIndexOf + 1);
            if (iIndexOf2 < 0) {
                iIndexOf2 = str.length() - 1;
            }
            String strSubstring = str.substring(0, iIndexOf);
            int i = iIndexOf2 + 1;
            String strSubstring2 = str.substring(iIndexOf, i);
            sb.append(strSubstring.replace(str2, str3));
            sb.append(strSubstring2);
            str = str.substring(i);
            iIndexOf = str.indexOf("'");
        }
        sb.append(str.replace(str2, str3));
        return sb.toString();
    }

    private void concatSingleDate2TimeInterval(String str, String str2, int i, Map<String, DateIntervalInfo.PatternInfo> map) {
        String[] strArr = DateIntervalInfo.CALENDAR_FIELD_TO_PATTERN_LETTER;
        DateIntervalInfo.PatternInfo patternInfo = map.get(strArr[i]);
        if (patternInfo != null) {
            map.put(strArr[i], DateIntervalInfo.genPatternInfo(C7028acB.OLrzqt(str, 2, 2, patternInfo.getFirstPart() + patternInfo.getSecondPart(), str2), patternInfo.firstDateInPtnIsLaterDate()));
        }
    }

    private static boolean fieldExistsInSkeleton(int i, String str) {
        return str.indexOf(DateIntervalInfo.CALENDAR_FIELD_TO_PATTERN_LETTER[i]) != -1;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        initializePattern(this.isDateIntervalInfoDefault ? LOCAL_PATTERN_CACHE : null);
        if (this.fCapitalizationSetting == null) {
            this.fCapitalizationSetting = DisplayContext.CAPITALIZATION_NONE;
        }
    }
}
