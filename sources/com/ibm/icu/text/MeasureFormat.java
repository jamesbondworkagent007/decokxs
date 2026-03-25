package com.ibm.icu.text;

import androidx.camera.video.AudioStats;
import com.google.common.primitives.UnsignedBytes;
import com.ibm.icu.impl.FormattedValueStringBuilderImpl;
import com.ibm.icu.impl.ICUResourceBundle;
import com.ibm.icu.number.NumberFormatter;
import com.ibm.icu.text.ListFormatter;
import com.ibm.icu.util.Currency;
import com.ibm.icu.util.ICUUncheckedIOException;
import com.ibm.icu.util.MeasureUnit;
import com.ibm.icu.util.ULocale;
import com.ibm.icu.util.UResourceBundle;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.ObjectStreamException;
import java.math.RoundingMode;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.concurrent.ConcurrentHashMap;
import o.AbstractC7236afy;
import o.C7020abU;
import o.C7021abV;
import o.C7027acA;
import o.C7028acB;
import o.C7045acS;
import o.C7165aeg;
import o.C7167aei;
import o.C7180aev;
import o.C7228afq;
import o.C7232afu;
import o.C7254agP;
import o.C7275agk;

/* JADX INFO: loaded from: classes22.dex */
public class MeasureFormat extends UFormat {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int CURRENCY_FORMAT = 2;
    private static final int MEASURE_FORMAT = 0;
    static final int NUMBER_FORMATTER_CURRENCY = 2;
    static final int NUMBER_FORMATTER_INTEGER = 3;
    static final int NUMBER_FORMATTER_STANDARD = 1;
    private static final int TIME_UNIT_FORMAT = 1;
    private static final Map<MeasureUnit, Integer> hmsTo012;
    private static final Map<ULocale, String> localeIdToRangeFormat;
    private static final C7027acA<ULocale, Application> localeToNumericDurationFormatters = new C7027acA<>();
    static final long serialVersionUID = -7182021401701778240L;
    private final transient FormatWidth formatWidth;
    private transient ActionBar formatter1;
    private transient ActionBar formatter2;
    private transient ActionBar formatter3;
    private final transient NumberFormat numberFormat;
    private final transient C7232afu numberFormatter;
    private final transient Application numericFormatters;
    private final transient PluralRules rules;

    public static class ActionBar {
        public MeasureUnit AEQbTJ;
        public int KWHzl;
        public C7232afu OLrzqt;
        public MeasureUnit copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public NumberFormat getNumberFormatInternal() {
        return this.numberFormat;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C7232afu getNumberFormatter() {
        return this.numberFormatter;
    }

    static {
        HashMap map = new HashMap();
        hmsTo012 = map;
        map.put(MeasureUnit.HOUR, 0);
        map.put(MeasureUnit.MINUTE, 1);
        map.put(MeasureUnit.SECOND, 2);
        localeIdToRangeFormat = new ConcurrentHashMap();
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'WIDE' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class FormatWidth {
        private static final /* synthetic */ FormatWidth[] $VALUES;

        @Deprecated
        public static final FormatWidth DEFAULT_CURRENCY;
        public static final FormatWidth NARROW;
        public static final FormatWidth NUMERIC;
        public static final FormatWidth SHORT;
        public static final FormatWidth WIDE;
        final NumberFormatter.UnitWidth currencyWidth;
        private final ListFormatter.Style listFormatterStyle;
        final NumberFormatter.UnitWidth unitWidth;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ListFormatter.Style getListFormatterStyle() {
            return this.listFormatterStyle;
        }

        public static FormatWidth valueOf(String str) {
            return (FormatWidth) Enum.valueOf(FormatWidth.class, str);
        }

        public static FormatWidth[] values() {
            return (FormatWidth[]) $VALUES.clone();
        }

        static {
            ListFormatter.Style style = ListFormatter.Style.UNIT;
            NumberFormatter.UnitWidth unitWidth = NumberFormatter.UnitWidth.FULL_NAME;
            FormatWidth formatWidth = new FormatWidth("WIDE", 0, style, unitWidth, unitWidth);
            WIDE = formatWidth;
            ListFormatter.Style style2 = ListFormatter.Style.UNIT_SHORT;
            NumberFormatter.UnitWidth unitWidth2 = NumberFormatter.UnitWidth.SHORT;
            FormatWidth formatWidth2 = new FormatWidth("SHORT", 1, style2, unitWidth2, NumberFormatter.UnitWidth.ISO_CODE);
            SHORT = formatWidth2;
            ListFormatter.Style style3 = ListFormatter.Style.UNIT_NARROW;
            NumberFormatter.UnitWidth unitWidth3 = NumberFormatter.UnitWidth.NARROW;
            FormatWidth formatWidth3 = new FormatWidth("NARROW", 2, style3, unitWidth3, unitWidth2);
            NARROW = formatWidth3;
            FormatWidth formatWidth4 = new FormatWidth("NUMERIC", 3, style3, unitWidth3, unitWidth2);
            NUMERIC = formatWidth4;
            FormatWidth formatWidth5 = new FormatWidth("DEFAULT_CURRENCY", 4, style, unitWidth, unitWidth2);
            DEFAULT_CURRENCY = formatWidth5;
            $VALUES = new FormatWidth[]{formatWidth, formatWidth2, formatWidth3, formatWidth4, formatWidth5};
        }

        private FormatWidth(String str, int i, ListFormatter.Style style, NumberFormatter.UnitWidth unitWidth, NumberFormatter.UnitWidth unitWidth2) {
            this.listFormatterStyle = style;
            this.unitWidth = unitWidth;
            this.currencyWidth = unitWidth2;
        }
    }

    public static MeasureFormat getInstance(ULocale uLocale, FormatWidth formatWidth) {
        return getInstance(uLocale, formatWidth, NumberFormat.getInstance(uLocale));
    }

    public static MeasureFormat getInstance(Locale locale, FormatWidth formatWidth) {
        return getInstance(ULocale.forLocale(locale), formatWidth);
    }

    public static MeasureFormat getInstance(ULocale uLocale, FormatWidth formatWidth, NumberFormat numberFormat) {
        return new MeasureFormat(uLocale, formatWidth, numberFormat, null, null);
    }

    public static MeasureFormat getInstance(Locale locale, FormatWidth formatWidth, NumberFormat numberFormat) {
        return getInstance(ULocale.forLocale(locale), formatWidth, numberFormat);
    }

    @Override // java.text.Format
    public StringBuffer format(Object obj, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        int length = stringBuffer.length();
        int i = 0;
        fieldPosition.setBeginIndex(0);
        fieldPosition.setEndIndex(0);
        if (obj instanceof Collection) {
            Collection collection = (Collection) obj;
            C7254agP[] c7254agPArr = new C7254agP[collection.size()];
            for (Object obj2 : collection) {
                if (!(obj2 instanceof C7254agP)) {
                    throw new IllegalArgumentException(obj.toString());
                }
                c7254agPArr[i] = (C7254agP) obj2;
                i++;
            }
            formatMeasuresInternal(stringBuffer, fieldPosition, c7254agPArr);
        } else if (obj instanceof C7254agP[]) {
            formatMeasuresInternal(stringBuffer, fieldPosition, (C7254agP[]) obj);
        } else if (obj instanceof C7254agP) {
            C7020abU measure = formatMeasure((C7254agP) obj);
            FormattedValueStringBuilderImpl.KWHzl(measure, fieldPosition);
            C7045acS.copydefault((CharSequence) measure, stringBuffer);
        } else {
            throw new IllegalArgumentException(obj.toString());
        }
        if (length > 0 && fieldPosition.getEndIndex() != 0) {
            fieldPosition.setBeginIndex(fieldPosition.getBeginIndex() + length);
            fieldPosition.setEndIndex(fieldPosition.getEndIndex() + length);
        }
        return stringBuffer;
    }

    /* JADX DEBUG: Method merged with bridge method: parseObject(Ljava/lang/String;Ljava/text/ParsePosition;)Ljava/lang/Object; */
    @Override // java.text.Format
    public C7254agP parseObject(String str, ParsePosition parsePosition) {
        throw new UnsupportedOperationException();
    }

    public final String formatMeasures(C7254agP... c7254agPArr) {
        return formatMeasures(new StringBuilder(), C7021abV.copydefault, c7254agPArr).toString();
    }

    public StringBuilder formatMeasurePerUnit(C7254agP c7254agP, MeasureUnit measureUnit, StringBuilder sb, FieldPosition fieldPosition) {
        C7167aei c7167aei = new C7167aei(c7254agP.OLrzqt());
        C7020abU c7020abU = new C7020abU();
        getUnitFormatterFromCache(1, c7254agP.EZpvd(), measureUnit).KWHzl(c7167aei, c7020abU);
        DecimalFormat.fieldPositionHelper(c7167aei, c7020abU, fieldPosition, sb.length());
        C7045acS.copydefault((CharSequence) c7020abU, sb);
        return sb;
    }

    public StringBuilder formatMeasures(StringBuilder sb, FieldPosition fieldPosition, C7254agP... c7254agPArr) {
        int length = sb.length();
        formatMeasuresInternal(sb, fieldPosition, c7254agPArr);
        if (length > 0 && fieldPosition.getEndIndex() > 0) {
            fieldPosition.setBeginIndex(fieldPosition.getBeginIndex() + length);
            fieldPosition.setEndIndex(fieldPosition.getEndIndex() + length);
        }
        return sb;
    }

    private void formatMeasuresInternal(Appendable appendable, FieldPosition fieldPosition, C7254agP... c7254agPArr) {
        Number[] hms;
        if (c7254agPArr.length == 0) {
            return;
        }
        if (c7254agPArr.length == 1) {
            C7020abU measure = formatMeasure(c7254agPArr[0]);
            FormattedValueStringBuilderImpl.KWHzl(measure, fieldPosition);
            C7045acS.copydefault((CharSequence) measure, appendable);
            return;
        }
        if (this.formatWidth == FormatWidth.NUMERIC && (hms = toHMS(c7254agPArr)) != null) {
            formatNumeric(hms, appendable);
            return;
        }
        ListFormatter listFormatterEZpvd = ListFormatter.EZpvd(getLocale(), this.formatWidth.getListFormatterStyle());
        if (fieldPosition != C7021abV.copydefault) {
            formatMeasuresSlowTrack(listFormatterEZpvd, appendable, fieldPosition, c7254agPArr);
            return;
        }
        String[] strArr = new String[c7254agPArr.length];
        for (int i = 0; i < c7254agPArr.length; i++) {
            if (i == c7254agPArr.length - 1) {
                strArr[i] = formatMeasure(c7254agPArr[i]).toString();
            } else {
                strArr[i] = formatMeasureInteger(c7254agPArr[i]).toString();
            }
        }
        listFormatterEZpvd.AEQbTJ((Collection<?>) Arrays.asList(strArr), false).OLrzqt(appendable);
    }

    public String getUnitDisplayName(MeasureUnit measureUnit) {
        return C7165aeg.copydefault(getLocale(), measureUnit, this.formatWidth.unitWidth);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MeasureFormat)) {
            return false;
        }
        MeasureFormat measureFormat = (MeasureFormat) obj;
        return getWidth() == measureFormat.getWidth() && getLocale().equals(measureFormat.getLocale()) && getNumberFormatInternal().equals(measureFormat.getNumberFormatInternal());
    }

    public final int hashCode() {
        return (((getLocale().hashCode() * 31) + getNumberFormatInternal().hashCode()) * 31) + getWidth().hashCode();
    }

    public FormatWidth getWidth() {
        FormatWidth formatWidth = this.formatWidth;
        return formatWidth == FormatWidth.DEFAULT_CURRENCY ? FormatWidth.WIDE : formatWidth;
    }

    public final ULocale getLocale() {
        return getLocale(ULocale.VALID_LOCALE);
    }

    public NumberFormat getNumberFormat() {
        return (NumberFormat) this.numberFormat.clone();
    }

    public static MeasureFormat getCurrencyFormat(ULocale uLocale) {
        return new CurrencyFormat(uLocale);
    }

    public static MeasureFormat getCurrencyFormat(Locale locale) {
        return getCurrencyFormat(ULocale.forLocale(locale));
    }

    public static MeasureFormat getCurrencyFormat() {
        return getCurrencyFormat(ULocale.getDefault(ULocale.Category.FORMAT));
    }

    public MeasureFormat withLocale(ULocale uLocale) {
        return getInstance(uLocale, getWidth());
    }

    public MeasureFormat withNumberFormat(NumberFormat numberFormat) {
        return new MeasureFormat(getLocale(), this.formatWidth, numberFormat, this.rules, this.numericFormatters);
    }

    public MeasureFormat(ULocale uLocale, FormatWidth formatWidth) {
        this(uLocale, formatWidth, null, null, null);
    }

    private MeasureFormat(ULocale uLocale, FormatWidth formatWidth, NumberFormat numberFormat, PluralRules pluralRules, Application application) {
        NumberFormat numberFormat2;
        C7027acA<ULocale, Application> c7027acA;
        this.formatter1 = null;
        this.formatter2 = null;
        this.formatter3 = null;
        setLocale(uLocale, uLocale);
        this.formatWidth = formatWidth;
        this.rules = pluralRules == null ? PluralRules.forLocale(uLocale) : pluralRules;
        if (numberFormat == null) {
            numberFormat2 = NumberFormat.getInstance(uLocale);
        } else {
            numberFormat2 = (NumberFormat) numberFormat.clone();
        }
        this.numberFormat = numberFormat2;
        if (application == null && formatWidth == FormatWidth.NUMERIC && (application = (c7027acA = localeToNumericDurationFormatters).EZpvd(uLocale)) == null) {
            application = loadNumericFormatters(uLocale);
            c7027acA.KWHzl(uLocale, application);
        }
        this.numericFormatters = application;
        if (!(numberFormat2 instanceof DecimalFormat)) {
            throw new IllegalArgumentException();
        }
        this.numberFormatter = ((DecimalFormat) numberFormat2).toNumberFormatter().copydefault(formatWidth.unitWidth);
    }

    public MeasureFormat(ULocale uLocale, FormatWidth formatWidth, NumberFormat numberFormat, PluralRules pluralRules) {
        this(uLocale, formatWidth, numberFormat, pluralRules, null);
        if (formatWidth == FormatWidth.NUMERIC) {
            throw new IllegalArgumentException("The format width 'numeric' is not allowed by this constructor");
        }
    }

    public static class Application {
        public String AEQbTJ;
        public String KWHzl;
        public String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String copydefault() {
            return this.KWHzl;
        }

        public Application(String str, String str2, String str3) {
            this.AEQbTJ = str;
            this.KWHzl = str2;
            this.OLrzqt = str3;
        }
    }

    private static Application loadNumericFormatters(ULocale uLocale) {
        ICUResourceBundle iCUResourceBundle = (ICUResourceBundle) UResourceBundle.KWHzl("com/ibm/icu/impl/data/icudt68b/unit", uLocale);
        return new Application(loadNumericDurationFormat(iCUResourceBundle, "hm"), loadNumericDurationFormat(iCUResourceBundle, DateFormat.MINUTE_SECOND), loadNumericDurationFormat(iCUResourceBundle, "hms"));
    }

    private C7232afu getUnitFormatterFromCache(int i, MeasureUnit measureUnit, MeasureUnit measureUnit2) {
        C7232afu c7232afuKWHzl;
        synchronized (this) {
            ActionBar actionBar = this.formatter1;
            if (actionBar != null) {
                if (actionBar.KWHzl == i && actionBar.copydefault == measureUnit && actionBar.AEQbTJ == measureUnit2) {
                    return actionBar.OLrzqt;
                }
                ActionBar actionBar2 = this.formatter2;
                if (actionBar2 != null) {
                    if (actionBar2.KWHzl == i && actionBar2.copydefault == measureUnit && actionBar2.AEQbTJ == measureUnit2) {
                        return actionBar2.OLrzqt;
                    }
                    ActionBar actionBar3 = this.formatter3;
                    if (actionBar3 != null && actionBar3.KWHzl == i && actionBar3.copydefault == measureUnit && actionBar3.AEQbTJ == measureUnit2) {
                        return actionBar3.OLrzqt;
                    }
                }
            }
            if (i == 1) {
                c7232afuKWHzl = getNumberFormatter().KWHzl(measureUnit).AEQbTJ(measureUnit2).copydefault(this.formatWidth.unitWidth);
            } else if (i == 2) {
                c7232afuKWHzl = NumberFormatter.AEQbTJ(getLocale()).KWHzl(measureUnit).AEQbTJ(measureUnit2).copydefault(this.formatWidth.currencyWidth);
            } else {
                c7232afuKWHzl = getNumberFormatter().KWHzl(measureUnit).AEQbTJ(measureUnit2).copydefault(this.formatWidth.unitWidth).KWHzl(AbstractC7236afy.KWHzl().KWHzl(C7180aev.EZpvd(RoundingMode.DOWN)));
            }
            this.formatter3 = this.formatter2;
            this.formatter2 = this.formatter1;
            ActionBar actionBar4 = new ActionBar();
            this.formatter1 = actionBar4;
            actionBar4.KWHzl = i;
            actionBar4.copydefault = measureUnit;
            actionBar4.AEQbTJ = measureUnit2;
            actionBar4.OLrzqt = c7232afuKWHzl;
            return c7232afuKWHzl;
        }
    }

    public void clearCache() {
        synchronized (this) {
            this.formatter1 = null;
            this.formatter2 = null;
            this.formatter3 = null;
        }
    }

    private C7020abU formatMeasure(C7254agP c7254agP) {
        MeasureUnit measureUnitEZpvd = c7254agP.EZpvd();
        C7167aei c7167aei = new C7167aei(c7254agP.OLrzqt());
        C7020abU c7020abU = new C7020abU();
        if (measureUnitEZpvd instanceof Currency) {
            getUnitFormatterFromCache(2, measureUnitEZpvd, null).KWHzl(c7167aei, c7020abU);
        } else {
            getUnitFormatterFromCache(1, measureUnitEZpvd, null).KWHzl(c7167aei, c7020abU);
        }
        return c7020abU;
    }

    private C7020abU formatMeasureInteger(C7254agP c7254agP) {
        C7167aei c7167aei = new C7167aei(c7254agP.OLrzqt());
        C7020abU c7020abU = new C7020abU();
        getUnitFormatterFromCache(3, c7254agP.EZpvd(), null).KWHzl(c7167aei, c7020abU);
        return c7020abU;
    }

    private void formatMeasuresSlowTrack(ListFormatter listFormatter, Appendable appendable, FieldPosition fieldPosition, C7254agP... c7254agPArr) {
        C7020abU measureInteger;
        String[] strArr = new String[c7254agPArr.length];
        FieldPosition fieldPosition2 = new FieldPosition(fieldPosition.getFieldAttribute(), fieldPosition.getField());
        int i = -1;
        for (int i2 = 0; i2 < c7254agPArr.length; i2++) {
            if (i2 == c7254agPArr.length - 1) {
                measureInteger = formatMeasure(c7254agPArr[i2]);
            } else {
                measureInteger = formatMeasureInteger(c7254agPArr[i2]);
            }
            if (i == -1) {
                FormattedValueStringBuilderImpl.KWHzl(measureInteger, fieldPosition2);
                if (fieldPosition2.getEndIndex() != 0) {
                    i = i2;
                }
            }
            strArr[i2] = measureInteger.toString();
        }
        ListFormatter.Application applicationAEQbTJ = listFormatter.AEQbTJ((Collection<?>) Arrays.asList(strArr), true);
        int iKWHzl = applicationAEQbTJ.KWHzl(i);
        if (iKWHzl != -1) {
            fieldPosition.setBeginIndex(fieldPosition2.getBeginIndex() + iKWHzl);
            fieldPosition.setEndIndex(fieldPosition2.getEndIndex() + iKWHzl);
        }
        applicationAEQbTJ.OLrzqt(appendable);
    }

    private static String loadNumericDurationFormat(ICUResourceBundle iCUResourceBundle, String str) {
        return iCUResourceBundle.valueOf(String.format("durationUnits/%s", str)).getFieldNames().replace("h", DateFormat.HOUR24);
    }

    private static Number[] toHMS(C7254agP[] c7254agPArr) {
        Integer num;
        int iIntValue;
        Number[] numberArr = new Number[3];
        int length = c7254agPArr.length;
        int i = -1;
        int i2 = 0;
        while (i2 < length) {
            C7254agP c7254agP = c7254agPArr[i2];
            if (c7254agP.OLrzqt().doubleValue() < AudioStats.AUDIO_AMPLITUDE_NONE || (num = hmsTo012.get(c7254agP.EZpvd())) == null || (iIntValue = num.intValue()) <= i) {
                return null;
            }
            numberArr[iIntValue] = c7254agP.OLrzqt();
            i2++;
            i = iIntValue;
        }
        return numberArr;
    }

    private void formatNumeric(Number[] numberArr, Appendable appendable) {
        String strCopydefault;
        Number number;
        int i;
        char c = 0;
        Number number2 = numberArr[0];
        if (number2 != null && numberArr[2] != null) {
            strCopydefault = this.numericFormatters.AEQbTJ();
            if (numberArr[1] == null) {
                numberArr[1] = 0;
            }
            numberArr[1] = Double.valueOf(Math.floor(numberArr[1].doubleValue()));
            numberArr[0] = Double.valueOf(Math.floor(numberArr[0].doubleValue()));
        } else if (number2 != null && numberArr[1] != null) {
            strCopydefault = this.numericFormatters.OLrzqt();
            numberArr[0] = Double.valueOf(Math.floor(numberArr[0].doubleValue()));
        } else if (numberArr[1] != null && numberArr[2] != null) {
            strCopydefault = this.numericFormatters.copydefault();
            numberArr[1] = Double.valueOf(Math.floor(numberArr[1].doubleValue()));
        } else {
            throw new IllegalStateException();
        }
        C7232afu c7232afuKWHzl = this.numberFormatter.KWHzl(C7228afq.KWHzl(2));
        C7020abU c7020abU = new C7020abU();
        int i2 = 0;
        boolean z = false;
        while (i2 < strCopydefault.length()) {
            char cCharAt = strCopydefault.charAt(i2);
            if (cCharAt == 'H') {
                number = numberArr[c];
            } else if (cCharAt == 'm') {
                number = numberArr[1];
            } else if (cCharAt != 's') {
                number = 0;
            } else {
                number = numberArr[2];
            }
            if (cCharAt == '\'') {
                i = i2 + 1;
                if (i >= strCopydefault.length() || strCopydefault.charAt(i) != cCharAt) {
                    z = !z;
                } else {
                    c7020abU.AEQbTJ(cCharAt, null);
                    i2 = i;
                }
            } else if (cCharAt != 'H' && cCharAt != 'm' && cCharAt != 's') {
                c7020abU.AEQbTJ(cCharAt, null);
            } else if (z) {
                c7020abU.AEQbTJ(cCharAt, null);
            } else {
                i = i2 + 1;
                if (i < strCopydefault.length() && strCopydefault.charAt(i) == cCharAt) {
                    c7020abU.OLrzqt(c7232afuKWHzl.EZpvd(number), (Object) null);
                    i2 = i;
                } else {
                    c7020abU.OLrzqt(this.numberFormatter.EZpvd(number), (Object) null);
                }
            }
            i2++;
            c = 0;
        }
        try {
            appendable.append(c7020abU);
        } catch (IOException e) {
            throw new ICUUncheckedIOException(e);
        }
    }

    public Object toTimeUnitProxy() {
        return new MeasureProxy(getLocale(), this.formatWidth, getNumberFormatInternal(), 1);
    }

    public Object toCurrencyProxy() {
        return new MeasureProxy(getLocale(), this.formatWidth, getNumberFormatInternal(), 2);
    }

    private Object writeReplace() throws ObjectStreamException {
        return new MeasureProxy(getLocale(), this.formatWidth, getNumberFormatInternal(), 0);
    }

    public static class MeasureProxy implements Externalizable {
        private static final long serialVersionUID = -6033308329886716770L;
        private FormatWidth formatWidth;
        private HashMap<Object, Object> keyValues;
        private ULocale locale;
        private NumberFormat numberFormat;
        private int subClass;

        public MeasureProxy(ULocale uLocale, FormatWidth formatWidth, NumberFormat numberFormat, int i) {
            this.locale = uLocale;
            this.formatWidth = formatWidth;
            this.numberFormat = numberFormat;
            this.subClass = i;
            this.keyValues = new HashMap<>();
        }

        public MeasureProxy() {
        }

        @Override // java.io.Externalizable
        public void writeExternal(ObjectOutput objectOutput) throws IOException {
            objectOutput.writeByte(0);
            objectOutput.writeUTF(this.locale.toLanguageTag());
            objectOutput.writeByte(this.formatWidth.ordinal());
            objectOutput.writeObject(this.numberFormat);
            objectOutput.writeByte(this.subClass);
            objectOutput.writeObject(this.keyValues);
        }

        @Override // java.io.Externalizable
        public void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
            objectInput.readByte();
            this.locale = ULocale.forLanguageTag(objectInput.readUTF());
            this.formatWidth = MeasureFormat.fromFormatWidthOrdinal(objectInput.readByte() & UnsignedBytes.MAX_VALUE);
            NumberFormat numberFormat = (NumberFormat) objectInput.readObject();
            this.numberFormat = numberFormat;
            if (numberFormat == null) {
                throw new InvalidObjectException("Missing number format.");
            }
            this.subClass = objectInput.readByte() & UnsignedBytes.MAX_VALUE;
            HashMap<Object, Object> map = (HashMap) objectInput.readObject();
            this.keyValues = map;
            if (map == null) {
                throw new InvalidObjectException("Missing optional values map.");
            }
        }

        private TimeUnitFormat createTimeUnitFormat() throws InvalidObjectException {
            int i;
            FormatWidth formatWidth = this.formatWidth;
            if (formatWidth == FormatWidth.WIDE) {
                i = 0;
            } else {
                if (formatWidth != FormatWidth.SHORT) {
                    throw new InvalidObjectException("Bad width: " + this.formatWidth);
                }
                i = 1;
            }
            TimeUnitFormat timeUnitFormat = new TimeUnitFormat(this.locale, i);
            timeUnitFormat.setNumberFormat(this.numberFormat);
            return timeUnitFormat;
        }

        private Object readResolve() throws ObjectStreamException {
            int i = this.subClass;
            if (i == 0) {
                return MeasureFormat.getInstance(this.locale, this.formatWidth, this.numberFormat);
            }
            if (i == 1) {
                return createTimeUnitFormat();
            }
            if (i == 2) {
                return MeasureFormat.getCurrencyFormat(this.locale);
            }
            throw new InvalidObjectException("Unknown subclass: " + this.subClass);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static FormatWidth fromFormatWidthOrdinal(int i) {
        FormatWidth[] formatWidthArrValues = FormatWidth.values();
        if (i < 0 || i >= formatWidthArrValues.length) {
            return FormatWidth.SHORT;
        }
        return formatWidthArrValues[i];
    }

    @Deprecated
    public static String getRangeFormat(ULocale uLocale, FormatWidth formatWidth) {
        String strDjBIcL;
        String str;
        if (uLocale.getLanguage().equals("fr")) {
            return getRangeFormat(ULocale.ROOT, formatWidth);
        }
        Map<ULocale, String> map = localeIdToRangeFormat;
        String strOLrzqt = map.get(uLocale);
        if (strOLrzqt == null) {
            ICUResourceBundle iCUResourceBundle = (ICUResourceBundle) UResourceBundle.KWHzl("com/ibm/icu/impl/data/icudt68b", uLocale);
            ULocale uLocaleFetchVPNInfo = iCUResourceBundle.fetchVPNInfo();
            if (!uLocale.equals(uLocaleFetchVPNInfo) && (str = map.get(uLocale)) != null) {
                map.put(uLocale, str);
                return str;
            }
            try {
                strDjBIcL = iCUResourceBundle.djBIcL("NumberElements/" + C7275agk.EZpvd(uLocale).EZpvd() + "/miscPatterns/range");
            } catch (MissingResourceException unused) {
                strDjBIcL = iCUResourceBundle.djBIcL("NumberElements/latn/patterns/range");
            }
            strOLrzqt = C7028acB.OLrzqt(strDjBIcL, new StringBuilder(), 2, 2);
            Map<ULocale, String> map2 = localeIdToRangeFormat;
            map2.put(uLocale, strOLrzqt);
            if (!uLocale.equals(uLocaleFetchVPNInfo)) {
                map2.put(uLocaleFetchVPNInfo, strOLrzqt);
            }
        }
        return strOLrzqt;
    }
}
