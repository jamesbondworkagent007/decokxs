package com.ibm.icu.text;

import com.engagelab.privates.push.constants.MTPushConstants;
import com.ibm.icu.impl.ICUResourceBundle;
import com.ibm.icu.text.MeasureFormat;
import com.ibm.icu.util.MeasureUnit;
import com.ibm.icu.util.TimeUnit;
import com.ibm.icu.util.ULocale;
import com.ibm.icu.util.UResourceBundle;
import java.io.ObjectStreamException;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.Set;
import java.util.TreeMap;
import o.C7043acQ;
import o.C7232afu;
import o.C7259agU;

/* JADX INFO: loaded from: classes22.dex */
@Deprecated
public class TimeUnitFormat extends MeasureFormat {

    @Deprecated
    public static final int ABBREVIATED_NAME = 1;
    private static final String DEFAULT_PATTERN_FOR_DAY = "{0} d";
    private static final String DEFAULT_PATTERN_FOR_HOUR = "{0} h";
    private static final String DEFAULT_PATTERN_FOR_MINUTE = "{0} min";
    private static final String DEFAULT_PATTERN_FOR_MONTH = "{0} m";
    private static final String DEFAULT_PATTERN_FOR_SECOND = "{0} s";
    private static final String DEFAULT_PATTERN_FOR_WEEK = "{0} w";
    private static final String DEFAULT_PATTERN_FOR_YEAR = "{0} y";

    @Deprecated
    public static final int FULL_NAME = 0;
    private static final int TOTAL_STYLES = 2;
    private static final long serialVersionUID = -3707773153184971529L;
    private NumberFormat format;
    private transient boolean isReady;
    private ULocale locale;
    private transient PluralRules pluralRules;
    private int style;
    private transient Map<TimeUnit, Map<String, Object[]>> timeUnitToCountToPatterns;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.ibm.icu.text.MeasureFormat
    public NumberFormat getNumberFormatInternal() {
        return this.format;
    }

    @Deprecated
    public TimeUnitFormat() {
        this(ULocale.getDefault(), 0);
    }

    @Deprecated
    public TimeUnitFormat(ULocale uLocale) {
        this(uLocale, 0);
    }

    @Deprecated
    public TimeUnitFormat(Locale locale) {
        this(locale, 0);
    }

    @Deprecated
    public TimeUnitFormat(ULocale uLocale, int i) {
        super(uLocale, i == 0 ? MeasureFormat.FormatWidth.WIDE : MeasureFormat.FormatWidth.SHORT);
        this.format = super.getNumberFormatInternal();
        if (i < 0 || i >= 2) {
            throw new IllegalArgumentException("style should be either FULL_NAME or ABBREVIATED_NAME style");
        }
        this.style = i;
        this.isReady = false;
    }

    private TimeUnitFormat(ULocale uLocale, int i, NumberFormat numberFormat) {
        this(uLocale, i);
        if (numberFormat != null) {
            setNumberFormat((NumberFormat) numberFormat.clone());
        }
    }

    @Deprecated
    public TimeUnitFormat(Locale locale, int i) {
        this(ULocale.forLocale(locale), i);
    }

    @Deprecated
    public TimeUnitFormat setLocale(ULocale uLocale) {
        setLocale(uLocale, uLocale);
        clearCache();
        return this;
    }

    @Deprecated
    public TimeUnitFormat setLocale(Locale locale) {
        return setLocale(ULocale.forLocale(locale));
    }

    @Deprecated
    public TimeUnitFormat setNumberFormat(NumberFormat numberFormat) {
        if (numberFormat == this.format) {
            return this;
        }
        if (numberFormat != null) {
            this.format = numberFormat;
        } else {
            ULocale uLocale = this.locale;
            if (uLocale == null) {
                this.isReady = false;
            } else {
                numberFormat = NumberFormat.getNumberInstance(uLocale);
                this.format = numberFormat;
            }
        }
        clearCache();
        return this;
    }

    @Override // com.ibm.icu.text.MeasureFormat
    @Deprecated
    public NumberFormat getNumberFormat() {
        return (NumberFormat) this.format.clone();
    }

    @Override // com.ibm.icu.text.MeasureFormat
    public C7232afu getNumberFormatter() {
        return ((DecimalFormat) this.format).toNumberFormatter();
    }

    /* JADX DEBUG: Method merged with bridge method: parseObject(Ljava/lang/String;Ljava/text/ParsePosition;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: parseObject(Ljava/lang/String;Ljava/text/ParsePosition;)Lo/agP; */
    @Override // com.ibm.icu.text.MeasureFormat, java.text.Format
    @Deprecated
    public C7259agU parseObject(String str, ParsePosition parsePosition) {
        Number number;
        if (!this.isReady) {
            setup();
        }
        int index = parsePosition.getIndex();
        Iterator<TimeUnit> it = this.timeUnitToCountToPatterns.keySet().iterator();
        int index2 = -1;
        Number number2 = null;
        TimeUnit timeUnit = null;
        String str2 = null;
        int i = 0;
        while (true) {
            int i2 = 2;
            if (!it.hasNext()) {
                break;
            }
            TimeUnit next = it.next();
            for (Map.Entry<String, Object[]> entry : this.timeUnitToCountToPatterns.get(next).entrySet()) {
                String key = entry.getKey();
                int i3 = 0;
                while (i3 < i2) {
                    MessageFormat messageFormat = (MessageFormat) entry.getValue()[i3];
                    parsePosition.setErrorIndex(-1);
                    parsePosition.setIndex(index);
                    Object object = messageFormat.parseObject(str, parsePosition);
                    Iterator<TimeUnit> it2 = it;
                    if (parsePosition.getErrorIndex() == -1 && parsePosition.getIndex() != index) {
                        Object[] objArr = (Object[]) object;
                        if (objArr.length != 0) {
                            Object obj = objArr[0];
                            if (obj instanceof Number) {
                                number = (Number) obj;
                            } else {
                                try {
                                    number = this.format.parse(obj.toString());
                                } catch (ParseException unused) {
                                }
                            }
                        } else {
                            number = null;
                        }
                        int index3 = parsePosition.getIndex() - index;
                        if (index3 > i) {
                            index2 = parsePosition.getIndex();
                            i = index3;
                            timeUnit = next;
                            number2 = number;
                            str2 = key;
                        }
                    }
                    i3++;
                    it = it2;
                    i2 = 2;
                }
            }
        }
        if (number2 == null && i != 0) {
            if (str2.equals(PluralRules.KEYWORD_ZERO)) {
                number2 = 0;
            } else if (str2.equals(PluralRules.KEYWORD_ONE)) {
                number2 = 1;
            } else if (str2.equals(PluralRules.KEYWORD_TWO)) {
                number2 = 2;
            } else {
                number2 = 3;
            }
        }
        if (i == 0) {
            parsePosition.setIndex(index);
            parsePosition.setErrorIndex(0);
            return null;
        }
        parsePosition.setIndex(index2);
        parsePosition.setErrorIndex(-1);
        return new C7259agU(number2, timeUnit);
    }

    private void setup() {
        if (this.locale == null) {
            NumberFormat numberFormat = this.format;
            if (numberFormat != null) {
                this.locale = numberFormat.getLocale(null);
            } else {
                this.locale = ULocale.getDefault(ULocale.Category.FORMAT);
            }
            ULocale uLocale = this.locale;
            setLocale(uLocale, uLocale);
        }
        if (this.format == null) {
            this.format = NumberFormat.getNumberInstance(this.locale);
        }
        this.pluralRules = PluralRules.forLocale(this.locale);
        this.timeUnitToCountToPatterns = new HashMap();
        Set<String> keywords = this.pluralRules.getKeywords();
        setup("units/duration", this.timeUnitToCountToPatterns, 0, keywords);
        setup("unitsShort/duration", this.timeUnitToCountToPatterns, 1, keywords);
        this.isReady = true;
    }

    public static final class StateListAnimator extends C7043acQ.ActionBar {
        public Set<String> AEQbTJ;
        public int EZpvd;
        public Map<TimeUnit, Map<String, Object[]>> KWHzl;
        public ULocale OLrzqt;
        public boolean copydefault = false;

        public StateListAnimator(Map<TimeUnit, Map<String, Object[]>> map, int i, Set<String> set, ULocale uLocale) {
            this.KWHzl = map;
            this.EZpvd = i;
            this.AEQbTJ = set;
            this.OLrzqt = uLocale;
        }

        @Override // o.C7043acQ.ActionBar
        public void copydefault(C7043acQ.Application application, C7043acQ.TaskDescription taskDescription, boolean z) {
            TimeUnit timeUnit;
            if (this.copydefault) {
                return;
            }
            this.copydefault = true;
            C7043acQ.StateListAnimator stateListAnimatorValueOf = taskDescription.valueOf();
            for (int i = 0; stateListAnimatorValueOf.AEQbTJ(i, application, taskDescription); i++) {
                String string = application.toString();
                if (string.equals("year")) {
                    timeUnit = MeasureUnit.YEAR;
                } else if (string.equals("month")) {
                    timeUnit = MeasureUnit.MONTH;
                } else if (string.equals(MTPushConstants.NotificationTime.KEY_DAYS)) {
                    timeUnit = MeasureUnit.DAY;
                } else if (string.equals("hour")) {
                    timeUnit = MeasureUnit.HOUR;
                } else if (string.equals("minute")) {
                    timeUnit = MeasureUnit.MINUTE;
                } else if (string.equals("second")) {
                    timeUnit = MeasureUnit.SECOND;
                } else if (string.equals("week")) {
                    timeUnit = MeasureUnit.WEEK;
                }
                Map<String, Object[]> treeMap = this.KWHzl.get(timeUnit);
                if (treeMap == null) {
                    treeMap = new TreeMap<>();
                    this.KWHzl.put(timeUnit, treeMap);
                }
                C7043acQ.StateListAnimator stateListAnimatorValueOf2 = taskDescription.valueOf();
                for (int i2 = 0; stateListAnimatorValueOf2.AEQbTJ(i2, application, taskDescription); i2++) {
                    String string2 = application.toString();
                    if (this.AEQbTJ.contains(string2)) {
                        Object[] objArr = treeMap.get(string2);
                        if (objArr == null) {
                            objArr = new Object[2];
                            treeMap.put(string2, objArr);
                        }
                        if (objArr[this.EZpvd] == null) {
                            objArr[this.EZpvd] = new MessageFormat(taskDescription.djBIcL(), this.OLrzqt);
                        }
                    }
                }
            }
        }
    }

    private void setup(String str, Map<TimeUnit, Map<String, Object[]>> map, int i, Set<String> set) {
        try {
            try {
                ((ICUResourceBundle) UResourceBundle.KWHzl("com/ibm/icu/impl/data/icudt68b/unit", this.locale)).copydefault(str, new StateListAnimator(map, i, set, this.locale));
            } catch (MissingResourceException unused) {
            }
        } catch (MissingResourceException unused2) {
        }
        TimeUnit[] timeUnitArrValues = TimeUnit.values();
        Set<String> keywords = this.pluralRules.getKeywords();
        for (TimeUnit timeUnit : timeUnitArrValues) {
            Map<String, Object[]> treeMap = map.get(timeUnit);
            if (treeMap == null) {
                treeMap = new TreeMap<>();
                map.put(timeUnit, treeMap);
            }
            Map<String, Object[]> map2 = treeMap;
            for (String str2 : keywords) {
                if (map2.get(str2) == null || map2.get(str2)[i] == null) {
                    searchInTree(str, i, timeUnit, str2, str2, map2);
                }
            }
        }
    }

    private void searchInTree(String str, int i, TimeUnit timeUnit, String str2, String str3, Map<String, Object[]> map) {
        MessageFormat messageFormat;
        ULocale fallback = this.locale;
        String string = timeUnit.toString();
        while (fallback != null) {
            try {
                MessageFormat messageFormat2 = new MessageFormat(((ICUResourceBundle) UResourceBundle.KWHzl("com/ibm/icu/impl/data/icudt68b/unit", fallback)).valueOf(str).valueOf(string).djBIcL(str3), this.locale);
                Object[] objArr = map.get(str2);
                if (objArr == null) {
                    objArr = new Object[2];
                    map.put(str2, objArr);
                }
                objArr[i] = messageFormat2;
                return;
            } catch (MissingResourceException unused) {
                fallback = fallback.getFallback();
            }
        }
        if (fallback == null && str.equals("unitsShort")) {
            searchInTree("units", i, timeUnit, str2, str3, map);
            if (map.get(str2) != null && map.get(str2)[i] != null) {
                return;
            }
        }
        if (str3.equals("other")) {
            if (timeUnit == MeasureUnit.SECOND) {
                messageFormat = new MessageFormat(DEFAULT_PATTERN_FOR_SECOND, this.locale);
            } else if (timeUnit == MeasureUnit.MINUTE) {
                messageFormat = new MessageFormat(DEFAULT_PATTERN_FOR_MINUTE, this.locale);
            } else if (timeUnit == MeasureUnit.HOUR) {
                messageFormat = new MessageFormat(DEFAULT_PATTERN_FOR_HOUR, this.locale);
            } else if (timeUnit == MeasureUnit.WEEK) {
                messageFormat = new MessageFormat(DEFAULT_PATTERN_FOR_WEEK, this.locale);
            } else if (timeUnit == MeasureUnit.DAY) {
                messageFormat = new MessageFormat(DEFAULT_PATTERN_FOR_DAY, this.locale);
            } else if (timeUnit == MeasureUnit.MONTH) {
                messageFormat = new MessageFormat(DEFAULT_PATTERN_FOR_MONTH, this.locale);
            } else {
                messageFormat = timeUnit == MeasureUnit.YEAR ? new MessageFormat(DEFAULT_PATTERN_FOR_YEAR, this.locale) : null;
            }
            Object[] objArr2 = map.get(str2);
            if (objArr2 == null) {
                objArr2 = new Object[2];
                map.put(str2, objArr2);
            }
            objArr2[i] = messageFormat;
            return;
        }
        searchInTree(str, i, timeUnit, str2, "other", map);
    }

    @Override // java.text.Format
    @Deprecated
    public Object clone() {
        TimeUnitFormat timeUnitFormat = (TimeUnitFormat) super.clone();
        timeUnitFormat.format = (NumberFormat) this.format.clone();
        return timeUnitFormat;
    }

    private Object writeReplace() throws ObjectStreamException {
        return super.toTimeUnitProxy();
    }

    private Object readResolve() throws ObjectStreamException {
        return new TimeUnitFormat(this.locale, this.style, this.format);
    }
}
