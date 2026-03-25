package com.ibm.icu.text;

import androidx.camera.video.AudioStats;
import com.ibm.icu.impl.FormattedValueStringBuilderImpl;
import com.ibm.icu.impl.number.DecimalFormatProperties;
import com.ibm.icu.impl.number.Padder;
import com.ibm.icu.impl.number.PatternStringUtils;
import com.ibm.icu.impl.number.Properties;
import com.ibm.icu.math.MathContext;
import com.ibm.icu.number.NumberFormatter;
import com.ibm.icu.text.PluralRules;
import com.ibm.icu.util.Currency;
import com.ibm.icu.util.ULocale;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamField;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.AttributedCharacterIterator;
import java.text.FieldPosition;
import java.text.ParsePosition;
import o.C7020abU;
import o.C7045acS;
import o.C7105adZ;
import o.C7142aeJ;
import o.C7145aeM;
import o.C7167aei;
import o.C7173aeo;
import o.C7232afu;
import o.C7252agN;
import o.InterfaceC7163aee;

/* JADX INFO: loaded from: classes3.dex */
public class DecimalFormat extends NumberFormat {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int MINIMUM_GROUPING_DIGITS_AUTO = -2;
    public static final int MINIMUM_GROUPING_DIGITS_MIN2 = -3;
    public static final int PAD_AFTER_PREFIX = 1;
    public static final int PAD_AFTER_SUFFIX = 3;
    public static final int PAD_BEFORE_PREFIX = 0;
    public static final int PAD_BEFORE_SUFFIX = 2;
    private static final long serialVersionUID = 864413376551465018L;
    volatile transient C7142aeJ currencyParser;
    volatile transient DecimalFormatProperties exportedProperties;
    volatile transient C7232afu formatter;
    private transient int icuMathContextForm;
    volatile transient C7142aeJ parser;
    transient DecimalFormatProperties properties;
    private final int serialVersionOnStream;
    volatile transient DecimalFormatSymbols symbols;

    /* JADX INFO: loaded from: classes14.dex */
    @Deprecated
    public interface Application {
        @Deprecated
        void copydefault(DecimalFormatProperties decimalFormatProperties);
    }

    @Deprecated
    public int getParseMaxDigits() {
        return 1000;
    }

    @Deprecated
    public void setParseMaxDigits(int i) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C7232afu toNumberFormatter() {
        return this.formatter;
    }

    public DecimalFormat() {
        this.serialVersionOnStream = 5;
        this.icuMathContextForm = 0;
        String pattern = NumberFormat.getPattern(ULocale.getDefault(ULocale.Category.FORMAT), 0);
        this.symbols = getDefaultSymbols();
        this.properties = new DecimalFormatProperties();
        this.exportedProperties = new DecimalFormatProperties();
        setPropertiesFromPattern(pattern, 1);
        refreshFormatter();
    }

    public DecimalFormat(String str) {
        this.serialVersionOnStream = 5;
        this.icuMathContextForm = 0;
        this.symbols = getDefaultSymbols();
        this.properties = new DecimalFormatProperties();
        this.exportedProperties = new DecimalFormatProperties();
        setPropertiesFromPattern(str, 1);
        refreshFormatter();
    }

    public DecimalFormat(String str, DecimalFormatSymbols decimalFormatSymbols) {
        this.serialVersionOnStream = 5;
        this.icuMathContextForm = 0;
        this.symbols = (DecimalFormatSymbols) decimalFormatSymbols.clone();
        this.properties = new DecimalFormatProperties();
        this.exportedProperties = new DecimalFormatProperties();
        setPropertiesFromPattern(str, 1);
        refreshFormatter();
    }

    public DecimalFormat(String str, DecimalFormatSymbols decimalFormatSymbols, CurrencyPluralInfo currencyPluralInfo, int i) {
        this(str, decimalFormatSymbols, i);
        this.properties.setCurrencyPluralInfo(currencyPluralInfo);
        refreshFormatter();
    }

    public DecimalFormat(String str, DecimalFormatSymbols decimalFormatSymbols, int i) {
        this.serialVersionOnStream = 5;
        this.icuMathContextForm = 0;
        this.symbols = (DecimalFormatSymbols) decimalFormatSymbols.clone();
        this.properties = new DecimalFormatProperties();
        this.exportedProperties = new DecimalFormatProperties();
        if (i == 1 || i == 5 || i == 7 || i == 8 || i == 9 || i == 6) {
            setPropertiesFromPattern(str, 2);
        } else {
            setPropertiesFromPattern(str, 1);
        }
        refreshFormatter();
    }

    private static DecimalFormatSymbols getDefaultSymbols() {
        return DecimalFormatSymbols.getInstance();
    }

    public void applyPattern(String str) {
        synchronized (this) {
            setPropertiesFromPattern(str, 0);
            this.properties.setPositivePrefix(null);
            this.properties.setNegativePrefix(null);
            this.properties.setPositiveSuffix(null);
            this.properties.setNegativeSuffix(null);
            this.properties.setCurrencyPluralInfo(null);
            refreshFormatter();
        }
    }

    public void applyLocalizedPattern(String str) {
        synchronized (this) {
            applyPattern(PatternStringUtils.KWHzl(str, this.symbols, false));
        }
    }

    @Override // com.ibm.icu.text.NumberFormat, java.text.Format
    public Object clone() {
        DecimalFormat decimalFormat = (DecimalFormat) super.clone();
        decimalFormat.symbols = (DecimalFormatSymbols) this.symbols.clone();
        decimalFormat.properties = this.properties.m6323clone();
        decimalFormat.exportedProperties = new DecimalFormatProperties();
        decimalFormat.refreshFormatter();
        return decimalFormat;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        synchronized (this) {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeInt(0);
            objectOutputStream.writeObject(this.properties);
            objectOutputStream.writeObject(this.symbols);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.io.ObjectInputStream$GetField] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, byte, int] */
    /* JADX WARN: Type inference failed for: r4v68 */
    /* JADX WARN: Type inference failed for: r5v28 */
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        ?? fields = objectInputStream.readFields();
        ObjectStreamField[] fields2 = fields.getObjectStreamClass().getFields();
        int i = fields.get("serialVersionOnStream", -1);
        if (i > 5) {
            throw new IOException("Cannot deserialize newer com.ibm.icu.text.DecimalFormat (v" + i + ")");
        }
        if (i == 5) {
            if (fields2.length > 1) {
                throw new IOException("Too many fields when reading serial version 5");
            }
            objectInputStream.readInt();
            Object object = objectInputStream.readObject();
            if (object instanceof DecimalFormatProperties) {
                this.properties = (DecimalFormatProperties) object;
            } else {
                this.properties = ((Properties) object).getInstance();
            }
            this.symbols = (DecimalFormatSymbols) objectInputStream.readObject();
            this.exportedProperties = new DecimalFormatProperties();
            refreshFormatter();
            return;
        }
        this.properties = new DecimalFormatProperties();
        int length = fields2.length;
        ?? r4 = 0;
        int i2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        while (i2 < length) {
            String name = fields2[i2].getName();
            if (name.equals("decimalSeparatorAlwaysShown")) {
                setDecimalSeparatorAlwaysShown(fields.get("decimalSeparatorAlwaysShown", r4));
            } else if (name.equals("exponentSignAlwaysShown")) {
                setExponentSignAlwaysShown(fields.get("exponentSignAlwaysShown", r4));
            } else if (name.equals("formatWidth")) {
                setFormatWidth(fields.get("formatWidth", r4));
            } else if (name.equals("groupingSize")) {
                setGroupingSize(fields.get("groupingSize", (byte) 3));
            } else if (name.equals("groupingSize2")) {
                setSecondaryGroupingSize(fields.get("groupingSize2", r4));
            } else if (name.equals("maxSignificantDigits")) {
                setMaximumSignificantDigits(fields.get("maxSignificantDigits", 6));
            } else if (name.equals("minExponentDigits")) {
                setMinimumExponentDigits(fields.get("minExponentDigits", r4));
            } else {
                if (name.equals("minSignificantDigits")) {
                    setMinimumSignificantDigits(fields.get("minSignificantDigits", 1));
                } else if (name.equals("multiplier")) {
                    setMultiplier(fields.get("multiplier", 1));
                } else if (name.equals("pad")) {
                    setPadCharacter(fields.get("pad", ' '));
                } else {
                    if (name.equals("padPosition")) {
                        setPadPosition(fields.get("padPosition", 0));
                    } else if (name.equals("parseBigDecimal")) {
                        setParseBigDecimal(fields.get("parseBigDecimal", false));
                    } else if (name.equals("parseRequireDecimalPoint")) {
                        setDecimalPatternMatchRequired(fields.get("parseRequireDecimalPoint", false));
                    } else if (name.equals("roundingMode")) {
                        setRoundingMode(fields.get("roundingMode", 0));
                    } else if (name.equals("useExponentialNotation")) {
                        setScientificNotation(fields.get("useExponentialNotation", false));
                    } else if (name.equals("useSignificantDigits")) {
                        setSignificantDigitsUsed(fields.get("useSignificantDigits", false));
                    } else {
                        if (name.equals("currencyPluralInfo")) {
                            setCurrencyPluralInfo((CurrencyPluralInfo) fields.get("currencyPluralInfo", null));
                        } else if (name.equals("mathContext")) {
                            setMathContextICU((MathContext) fields.get("mathContext", null));
                        } else if (name.equals("negPrefixPattern")) {
                            str = (String) fields.get("negPrefixPattern", null);
                        } else if (name.equals("negSuffixPattern")) {
                            str3 = (String) fields.get("negSuffixPattern", null);
                        } else if (name.equals("negativePrefix")) {
                            str2 = (String) fields.get("negativePrefix", null);
                        } else if (name.equals("negativeSuffix")) {
                            str4 = (String) fields.get("negativeSuffix", null);
                        } else if (name.equals("posPrefixPattern")) {
                            str5 = (String) fields.get("posPrefixPattern", null);
                        } else if (name.equals("posSuffixPattern")) {
                            str7 = (String) fields.get("posSuffixPattern", null);
                        } else if (name.equals("positivePrefix")) {
                            str6 = (String) fields.get("positivePrefix", null);
                        } else if (name.equals("positiveSuffix")) {
                            str8 = (String) fields.get("positiveSuffix", null);
                        } else if (name.equals("roundingIncrement")) {
                            setRoundingIncrement((BigDecimal) fields.get("roundingIncrement", null));
                        } else if (name.equals("symbols")) {
                            setDecimalFormatSymbols((DecimalFormatSymbols) fields.get("symbols", null));
                        }
                        i2++;
                        r4 = 0;
                    }
                    i2++;
                    r4 = 0;
                }
                i2++;
                r4 = 0;
            }
            i2++;
            r4 = 0;
        }
        if (str == null) {
            this.properties.setNegativePrefix(str2);
        } else {
            this.properties.setNegativePrefixPattern(str);
        }
        if (str3 == null) {
            this.properties.setNegativeSuffix(str4);
        } else {
            this.properties.setNegativeSuffixPattern(str3);
        }
        if (str5 == null) {
            this.properties.setPositivePrefix(str6);
        } else {
            this.properties.setPositivePrefixPattern(str5);
        }
        if (str7 == null) {
            this.properties.setPositiveSuffix(str8);
        } else {
            this.properties.setPositiveSuffixPattern(str7);
        }
        try {
            Field declaredField = NumberFormat.class.getDeclaredField("groupingUsed");
            declaredField.setAccessible(true);
            setGroupingUsed(((Boolean) declaredField.get(this)).booleanValue());
            Field declaredField2 = NumberFormat.class.getDeclaredField("parseIntegerOnly");
            declaredField2.setAccessible(true);
            setParseIntegerOnly(((Boolean) declaredField2.get(this)).booleanValue());
            Field declaredField3 = NumberFormat.class.getDeclaredField("maximumIntegerDigits");
            declaredField3.setAccessible(true);
            setMaximumIntegerDigits(((Integer) declaredField3.get(this)).intValue());
            Field declaredField4 = NumberFormat.class.getDeclaredField("minimumIntegerDigits");
            declaredField4.setAccessible(true);
            setMinimumIntegerDigits(((Integer) declaredField4.get(this)).intValue());
            Field declaredField5 = NumberFormat.class.getDeclaredField("maximumFractionDigits");
            declaredField5.setAccessible(true);
            setMaximumFractionDigits(((Integer) declaredField5.get(this)).intValue());
            Field declaredField6 = NumberFormat.class.getDeclaredField("minimumFractionDigits");
            declaredField6.setAccessible(true);
            setMinimumFractionDigits(((Integer) declaredField6.get(this)).intValue());
            Field declaredField7 = NumberFormat.class.getDeclaredField("currency");
            declaredField7.setAccessible(true);
            setCurrency((Currency) declaredField7.get(this));
            Field declaredField8 = NumberFormat.class.getDeclaredField("parseStrict");
            declaredField8.setAccessible(true);
            setParseStrict(((Boolean) declaredField8.get(this)).booleanValue());
            if (this.symbols == null) {
                this.symbols = getDefaultSymbols();
            }
            this.exportedProperties = new DecimalFormatProperties();
            refreshFormatter();
        } catch (IllegalAccessException e) {
            throw new IOException(e);
        } catch (IllegalArgumentException e2) {
            throw new IOException(e2);
        } catch (NoSuchFieldException e3) {
            throw new IOException(e3);
        } catch (SecurityException e4) {
            throw new IOException(e4);
        }
    }

    @Override // com.ibm.icu.text.NumberFormat
    public StringBuffer format(double d, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        C7167aei c7167aei = new C7167aei(d);
        C7020abU c7020abU = new C7020abU();
        this.formatter.KWHzl(c7167aei, c7020abU);
        fieldPositionHelper(c7167aei, c7020abU, fieldPosition, stringBuffer.length());
        C7045acS.copydefault((CharSequence) c7020abU, stringBuffer);
        return stringBuffer;
    }

    @Override // com.ibm.icu.text.NumberFormat
    public StringBuffer format(long j, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        C7167aei c7167aei = new C7167aei(j);
        C7020abU c7020abU = new C7020abU();
        this.formatter.KWHzl(c7167aei, c7020abU);
        fieldPositionHelper(c7167aei, c7020abU, fieldPosition, stringBuffer.length());
        C7045acS.copydefault((CharSequence) c7020abU, stringBuffer);
        return stringBuffer;
    }

    @Override // com.ibm.icu.text.NumberFormat
    public StringBuffer format(BigInteger bigInteger, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        C7167aei c7167aei = new C7167aei(bigInteger);
        C7020abU c7020abU = new C7020abU();
        this.formatter.KWHzl(c7167aei, c7020abU);
        fieldPositionHelper(c7167aei, c7020abU, fieldPosition, stringBuffer.length());
        C7045acS.copydefault((CharSequence) c7020abU, stringBuffer);
        return stringBuffer;
    }

    @Override // com.ibm.icu.text.NumberFormat
    public StringBuffer format(BigDecimal bigDecimal, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        C7167aei c7167aei = new C7167aei(bigDecimal);
        C7020abU c7020abU = new C7020abU();
        this.formatter.KWHzl(c7167aei, c7020abU);
        fieldPositionHelper(c7167aei, c7020abU, fieldPosition, stringBuffer.length());
        C7045acS.copydefault((CharSequence) c7020abU, stringBuffer);
        return stringBuffer;
    }

    @Override // com.ibm.icu.text.NumberFormat
    public StringBuffer format(com.ibm.icu.math.BigDecimal bigDecimal, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        C7167aei c7167aei = new C7167aei(bigDecimal);
        C7020abU c7020abU = new C7020abU();
        this.formatter.KWHzl(c7167aei, c7020abU);
        fieldPositionHelper(c7167aei, c7020abU, fieldPosition, stringBuffer.length());
        C7045acS.copydefault((CharSequence) c7020abU, stringBuffer);
        return stringBuffer;
    }

    @Override // java.text.Format
    public AttributedCharacterIterator formatToCharacterIterator(Object obj) {
        if (!(obj instanceof Number)) {
            throw new IllegalArgumentException();
        }
        return this.formatter.EZpvd((Number) obj).OLrzqt();
    }

    @Override // com.ibm.icu.text.NumberFormat
    public StringBuffer format(C7252agN c7252agN, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        DecimalFormatSymbols decimalFormatSymbols = (DecimalFormatSymbols) this.symbols.clone();
        decimalFormatSymbols.setCurrency(c7252agN.AEQbTJ());
        C7167aei c7167aei = new C7167aei(c7252agN.OLrzqt());
        C7020abU c7020abU = new C7020abU();
        this.formatter.OLrzqt(decimalFormatSymbols).KWHzl(c7252agN.AEQbTJ()).KWHzl(c7167aei, c7020abU);
        fieldPositionHelper(c7167aei, c7020abU, fieldPosition, stringBuffer.length());
        C7045acS.copydefault((CharSequence) c7020abU, stringBuffer);
        return stringBuffer;
    }

    @Override // com.ibm.icu.text.NumberFormat
    public Number parse(String str, ParsePosition parsePosition) {
        if (str == null) {
            throw new IllegalArgumentException("Text cannot be null");
        }
        if (parsePosition == null) {
            parsePosition = new ParsePosition(0);
        }
        if (parsePosition.getIndex() < 0) {
            throw new IllegalArgumentException("Cannot start parsing at a negative offset");
        }
        if (parsePosition.getIndex() >= str.length()) {
            return null;
        }
        C7145aeM c7145aeM = new C7145aeM();
        int index = parsePosition.getIndex();
        C7142aeJ parser = getParser();
        parser.AEQbTJ(str, index, true, c7145aeM);
        if (c7145aeM.OLrzqt()) {
            parsePosition.setIndex(c7145aeM.EZpvd);
            Number numberOLrzqt = c7145aeM.OLrzqt(parser.AEQbTJ());
            return numberOLrzqt instanceof BigDecimal ? safeConvertBigDecimal((BigDecimal) numberOLrzqt) : numberOLrzqt;
        }
        parsePosition.setErrorIndex(index + c7145aeM.EZpvd);
        return null;
    }

    @Override // com.ibm.icu.text.NumberFormat
    public C7252agN parseCurrency(CharSequence charSequence, ParsePosition parsePosition) {
        if (charSequence == null) {
            throw new IllegalArgumentException("Text cannot be null");
        }
        if (parsePosition == null) {
            parsePosition = new ParsePosition(0);
        }
        if (parsePosition.getIndex() < 0) {
            throw new IllegalArgumentException("Cannot start parsing at a negative offset");
        }
        if (parsePosition.getIndex() >= charSequence.length()) {
            return null;
        }
        C7145aeM c7145aeM = new C7145aeM();
        int index = parsePosition.getIndex();
        C7142aeJ currencyParser = getCurrencyParser();
        currencyParser.AEQbTJ(charSequence.toString(), index, true, c7145aeM);
        if (c7145aeM.OLrzqt()) {
            parsePosition.setIndex(c7145aeM.EZpvd);
            Number numberOLrzqt = c7145aeM.OLrzqt(currencyParser.AEQbTJ());
            if (numberOLrzqt instanceof BigDecimal) {
                numberOLrzqt = safeConvertBigDecimal((BigDecimal) numberOLrzqt);
            }
            return new C7252agN(numberOLrzqt, Currency.getInstance(c7145aeM.KWHzl));
        }
        parsePosition.setErrorIndex(index + c7145aeM.EZpvd);
        return null;
    }

    public DecimalFormatSymbols getDecimalFormatSymbols() {
        DecimalFormatSymbols decimalFormatSymbols;
        synchronized (this) {
            decimalFormatSymbols = (DecimalFormatSymbols) this.symbols.clone();
        }
        return decimalFormatSymbols;
    }

    public void setDecimalFormatSymbols(DecimalFormatSymbols decimalFormatSymbols) {
        synchronized (this) {
            this.symbols = (DecimalFormatSymbols) decimalFormatSymbols.clone();
            refreshFormatter();
        }
    }

    public String getPositivePrefix() {
        String strEZpvd;
        synchronized (this) {
            strEZpvd = this.formatter.EZpvd(true, false);
        }
        return strEZpvd;
    }

    public void setPositivePrefix(String str) {
        synchronized (this) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.properties.setPositivePrefix(str);
            refreshFormatter();
        }
    }

    public String getNegativePrefix() {
        String strEZpvd;
        synchronized (this) {
            strEZpvd = this.formatter.EZpvd(true, true);
        }
        return strEZpvd;
    }

    public void setNegativePrefix(String str) {
        synchronized (this) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.properties.setNegativePrefix(str);
            refreshFormatter();
        }
    }

    public String getPositiveSuffix() {
        String strEZpvd;
        synchronized (this) {
            strEZpvd = this.formatter.EZpvd(false, false);
        }
        return strEZpvd;
    }

    public void setPositiveSuffix(String str) {
        synchronized (this) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.properties.setPositiveSuffix(str);
            refreshFormatter();
        }
    }

    public String getNegativeSuffix() {
        String strEZpvd;
        synchronized (this) {
            strEZpvd = this.formatter.EZpvd(false, true);
        }
        return strEZpvd;
    }

    public void setNegativeSuffix(String str) {
        synchronized (this) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.properties.setNegativeSuffix(str);
            refreshFormatter();
        }
    }

    public boolean isSignAlwaysShown() {
        boolean signAlwaysShown;
        synchronized (this) {
            signAlwaysShown = this.properties.getSignAlwaysShown();
        }
        return signAlwaysShown;
    }

    public void setSignAlwaysShown(boolean z) {
        synchronized (this) {
            this.properties.setSignAlwaysShown(z);
            refreshFormatter();
        }
    }

    public int getMultiplier() {
        synchronized (this) {
            if (this.properties.getMultiplier() != null) {
                return this.properties.getMultiplier().intValue();
            }
            return (int) Math.pow(10.0d, this.properties.getMagnitudeMultiplier());
        }
    }

    public void setMultiplier(int i) {
        synchronized (this) {
            if (i == 0) {
                throw new IllegalArgumentException("Multiplier must be nonzero.");
            }
            int i2 = i;
            int i3 = 0;
            while (true) {
                if (i2 == 1) {
                    break;
                }
                i3++;
                int i4 = i2 / 10;
                if (i4 * 10 != i2) {
                    i3 = -1;
                    break;
                }
                i2 = i4;
            }
            if (i3 != -1) {
                this.properties.setMagnitudeMultiplier(i3);
                this.properties.setMultiplier(null);
            } else {
                this.properties.setMagnitudeMultiplier(0);
                this.properties.setMultiplier(BigDecimal.valueOf(i));
            }
            refreshFormatter();
        }
    }

    public BigDecimal getRoundingIncrement() {
        BigDecimal roundingIncrement;
        synchronized (this) {
            roundingIncrement = this.exportedProperties.getRoundingIncrement();
        }
        return roundingIncrement;
    }

    public void setRoundingIncrement(BigDecimal bigDecimal) {
        synchronized (this) {
            if (bigDecimal != null) {
                if (bigDecimal.compareTo(BigDecimal.ZERO) == 0) {
                    this.properties.setMaximumFractionDigits(Integer.MAX_VALUE);
                    return;
                }
            }
            this.properties.setRoundingIncrement(bigDecimal);
            refreshFormatter();
        }
    }

    public void setRoundingIncrement(com.ibm.icu.math.BigDecimal bigDecimal) {
        synchronized (this) {
            setRoundingIncrement(bigDecimal == null ? null : bigDecimal.toBigDecimal());
        }
    }

    public void setRoundingIncrement(double d) {
        synchronized (this) {
            if (d == AudioStats.AUDIO_AMPLITUDE_NONE) {
                setRoundingIncrement((BigDecimal) null);
            } else {
                setRoundingIncrement(BigDecimal.valueOf(d));
            }
        }
    }

    @Override // com.ibm.icu.text.NumberFormat
    public int getRoundingMode() {
        int iOrdinal;
        synchronized (this) {
            RoundingMode roundingMode = this.exportedProperties.getRoundingMode();
            iOrdinal = roundingMode == null ? 0 : roundingMode.ordinal();
        }
        return iOrdinal;
    }

    @Override // com.ibm.icu.text.NumberFormat
    public void setRoundingMode(int i) {
        synchronized (this) {
            this.properties.setRoundingMode(RoundingMode.valueOf(i));
            refreshFormatter();
        }
    }

    public java.math.MathContext getMathContext() {
        java.math.MathContext mathContext;
        synchronized (this) {
            mathContext = this.exportedProperties.getMathContext();
        }
        return mathContext;
    }

    public void setMathContext(java.math.MathContext mathContext) {
        synchronized (this) {
            this.properties.setMathContext(mathContext);
            refreshFormatter();
        }
    }

    public MathContext getMathContextICU() {
        MathContext mathContext;
        synchronized (this) {
            java.math.MathContext mathContext2 = getMathContext();
            mathContext = new MathContext(mathContext2.getPrecision(), this.icuMathContextForm, false, mathContext2.getRoundingMode().ordinal());
        }
        return mathContext;
    }

    public void setMathContextICU(MathContext mathContext) {
        java.math.MathContext mathContext2;
        synchronized (this) {
            this.icuMathContextForm = mathContext.getForm();
            if (mathContext.getLostDigits()) {
                mathContext2 = new java.math.MathContext(mathContext.getDigits(), RoundingMode.UNNECESSARY);
            } else {
                mathContext2 = new java.math.MathContext(mathContext.getDigits(), RoundingMode.valueOf(mathContext.getRoundingMode()));
            }
            setMathContext(mathContext2);
        }
    }

    @Override // com.ibm.icu.text.NumberFormat
    public int getMinimumIntegerDigits() {
        int minimumIntegerDigits;
        synchronized (this) {
            minimumIntegerDigits = this.exportedProperties.getMinimumIntegerDigits();
        }
        return minimumIntegerDigits;
    }

    @Override // com.ibm.icu.text.NumberFormat
    public void setMinimumIntegerDigits(int i) {
        synchronized (this) {
            int maximumIntegerDigits = this.properties.getMaximumIntegerDigits();
            if (maximumIntegerDigits >= 0 && maximumIntegerDigits < i) {
                this.properties.setMaximumIntegerDigits(i);
            }
            this.properties.setMinimumIntegerDigits(i);
            refreshFormatter();
        }
    }

    @Override // com.ibm.icu.text.NumberFormat
    public int getMaximumIntegerDigits() {
        int maximumIntegerDigits;
        synchronized (this) {
            maximumIntegerDigits = this.exportedProperties.getMaximumIntegerDigits();
        }
        return maximumIntegerDigits;
    }

    @Override // com.ibm.icu.text.NumberFormat
    public void setMaximumIntegerDigits(int i) {
        synchronized (this) {
            int minimumIntegerDigits = this.properties.getMinimumIntegerDigits();
            if (minimumIntegerDigits >= 0 && minimumIntegerDigits > i) {
                this.properties.setMinimumIntegerDigits(i);
            }
            this.properties.setMaximumIntegerDigits(i);
            refreshFormatter();
        }
    }

    @Override // com.ibm.icu.text.NumberFormat
    public int getMinimumFractionDigits() {
        int minimumFractionDigits;
        synchronized (this) {
            minimumFractionDigits = this.exportedProperties.getMinimumFractionDigits();
        }
        return minimumFractionDigits;
    }

    @Override // com.ibm.icu.text.NumberFormat
    public void setMinimumFractionDigits(int i) {
        synchronized (this) {
            int maximumFractionDigits = this.properties.getMaximumFractionDigits();
            if (maximumFractionDigits >= 0 && maximumFractionDigits < i) {
                this.properties.setMaximumFractionDigits(i);
            }
            this.properties.setMinimumFractionDigits(i);
            refreshFormatter();
        }
    }

    @Override // com.ibm.icu.text.NumberFormat
    public int getMaximumFractionDigits() {
        int maximumFractionDigits;
        synchronized (this) {
            maximumFractionDigits = this.exportedProperties.getMaximumFractionDigits();
        }
        return maximumFractionDigits;
    }

    @Override // com.ibm.icu.text.NumberFormat
    public void setMaximumFractionDigits(int i) {
        synchronized (this) {
            int minimumFractionDigits = this.properties.getMinimumFractionDigits();
            if (minimumFractionDigits >= 0 && minimumFractionDigits > i) {
                this.properties.setMinimumFractionDigits(i);
            }
            this.properties.setMaximumFractionDigits(i);
            refreshFormatter();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean areSignificantDigitsUsed() {
        boolean z;
        synchronized (this) {
            if (this.properties.getMinimumSignificantDigits() == -1) {
                z = this.properties.getMaximumSignificantDigits() != -1;
            }
        }
        return z;
    }

    public void setSignificantDigitsUsed(boolean z) {
        synchronized (this) {
            int minimumSignificantDigits = this.properties.getMinimumSignificantDigits();
            int maximumSignificantDigits = this.properties.getMaximumSignificantDigits();
            if (z) {
                if (minimumSignificantDigits != -1 || maximumSignificantDigits != -1) {
                    return;
                }
            } else if (minimumSignificantDigits == -1 && maximumSignificantDigits == -1) {
                return;
            }
            int i = z ? 1 : -1;
            int i2 = z ? 6 : -1;
            this.properties.setMinimumSignificantDigits(i);
            this.properties.setMaximumSignificantDigits(i2);
            refreshFormatter();
        }
    }

    public int getMinimumSignificantDigits() {
        int minimumSignificantDigits;
        synchronized (this) {
            minimumSignificantDigits = this.exportedProperties.getMinimumSignificantDigits();
        }
        return minimumSignificantDigits;
    }

    public void setMinimumSignificantDigits(int i) {
        synchronized (this) {
            int maximumSignificantDigits = this.properties.getMaximumSignificantDigits();
            if (maximumSignificantDigits >= 0 && maximumSignificantDigits < i) {
                this.properties.setMaximumSignificantDigits(i);
            }
            this.properties.setMinimumSignificantDigits(i);
            refreshFormatter();
        }
    }

    public int getMaximumSignificantDigits() {
        int maximumSignificantDigits;
        synchronized (this) {
            maximumSignificantDigits = this.exportedProperties.getMaximumSignificantDigits();
        }
        return maximumSignificantDigits;
    }

    public void setMaximumSignificantDigits(int i) {
        synchronized (this) {
            int minimumSignificantDigits = this.properties.getMinimumSignificantDigits();
            if (minimumSignificantDigits >= 0 && minimumSignificantDigits > i) {
                this.properties.setMinimumSignificantDigits(i);
            }
            this.properties.setMaximumSignificantDigits(i);
            refreshFormatter();
        }
    }

    public int getFormatWidth() {
        int formatWidth;
        synchronized (this) {
            formatWidth = this.properties.getFormatWidth();
        }
        return formatWidth;
    }

    public void setFormatWidth(int i) {
        synchronized (this) {
            this.properties.setFormatWidth(i);
            refreshFormatter();
        }
    }

    public char getPadCharacter() {
        synchronized (this) {
            String padString = this.properties.getPadString();
            if (padString == null) {
                return " ".charAt(0);
            }
            return padString.charAt(0);
        }
    }

    public void setPadCharacter(char c) {
        synchronized (this) {
            this.properties.setPadString(Character.toString(c));
            refreshFormatter();
        }
    }

    public int getPadPosition() {
        int old;
        synchronized (this) {
            Padder.PadPosition padPosition = this.properties.getPadPosition();
            old = padPosition == null ? 0 : padPosition.toOld();
        }
        return old;
    }

    public void setPadPosition(int i) {
        synchronized (this) {
            this.properties.setPadPosition(Padder.PadPosition.fromOld(i));
            refreshFormatter();
        }
    }

    public boolean isScientificNotation() {
        boolean z;
        synchronized (this) {
            z = this.properties.getMinimumExponentDigits() != -1;
        }
        return z;
    }

    public void setScientificNotation(boolean z) {
        synchronized (this) {
            if (z) {
                this.properties.setMinimumExponentDigits(1);
            } else {
                this.properties.setMinimumExponentDigits(-1);
            }
            refreshFormatter();
        }
    }

    public byte getMinimumExponentDigits() {
        byte minimumExponentDigits;
        synchronized (this) {
            minimumExponentDigits = (byte) this.properties.getMinimumExponentDigits();
        }
        return minimumExponentDigits;
    }

    public void setMinimumExponentDigits(byte b) {
        synchronized (this) {
            this.properties.setMinimumExponentDigits(b);
            refreshFormatter();
        }
    }

    public boolean isExponentSignAlwaysShown() {
        boolean exponentSignAlwaysShown;
        synchronized (this) {
            exponentSignAlwaysShown = this.properties.getExponentSignAlwaysShown();
        }
        return exponentSignAlwaysShown;
    }

    public void setExponentSignAlwaysShown(boolean z) {
        synchronized (this) {
            this.properties.setExponentSignAlwaysShown(z);
            refreshFormatter();
        }
    }

    @Override // com.ibm.icu.text.NumberFormat
    public boolean isGroupingUsed() {
        boolean groupingUsed;
        synchronized (this) {
            groupingUsed = this.properties.getGroupingUsed();
        }
        return groupingUsed;
    }

    @Override // com.ibm.icu.text.NumberFormat
    public void setGroupingUsed(boolean z) {
        synchronized (this) {
            this.properties.setGroupingUsed(z);
            refreshFormatter();
        }
    }

    public int getGroupingSize() {
        synchronized (this) {
            if (this.properties.getGroupingSize() < 0) {
                return 0;
            }
            return this.properties.getGroupingSize();
        }
    }

    public void setGroupingSize(int i) {
        synchronized (this) {
            this.properties.setGroupingSize(i);
            refreshFormatter();
        }
    }

    public int getSecondaryGroupingSize() {
        synchronized (this) {
            int secondaryGroupingSize = this.properties.getSecondaryGroupingSize();
            if (secondaryGroupingSize < 0) {
                return 0;
            }
            return secondaryGroupingSize;
        }
    }

    public void setSecondaryGroupingSize(int i) {
        synchronized (this) {
            this.properties.setSecondaryGroupingSize(i);
            refreshFormatter();
        }
    }

    public int getMinimumGroupingDigits() {
        synchronized (this) {
            if (this.properties.getMinimumGroupingDigits() <= 0) {
                return 1;
            }
            return this.properties.getMinimumGroupingDigits();
        }
    }

    public void setMinimumGroupingDigits(int i) {
        synchronized (this) {
            this.properties.setMinimumGroupingDigits(i);
            refreshFormatter();
        }
    }

    public boolean isDecimalSeparatorAlwaysShown() {
        boolean decimalSeparatorAlwaysShown;
        synchronized (this) {
            decimalSeparatorAlwaysShown = this.properties.getDecimalSeparatorAlwaysShown();
        }
        return decimalSeparatorAlwaysShown;
    }

    public void setDecimalSeparatorAlwaysShown(boolean z) {
        synchronized (this) {
            this.properties.setDecimalSeparatorAlwaysShown(z);
            refreshFormatter();
        }
    }

    @Override // com.ibm.icu.text.NumberFormat
    public Currency getCurrency() {
        Currency currency;
        synchronized (this) {
            currency = this.exportedProperties.getCurrency();
        }
        return currency;
    }

    @Override // com.ibm.icu.text.NumberFormat
    public void setCurrency(Currency currency) {
        synchronized (this) {
            this.properties.setCurrency(currency);
            if (currency != null) {
                this.symbols.setCurrency(currency);
            }
            refreshFormatter();
        }
    }

    public Currency.CurrencyUsage getCurrencyUsage() {
        Currency.CurrencyUsage currencyUsage;
        synchronized (this) {
            currencyUsage = this.properties.getCurrencyUsage();
            if (currencyUsage == null) {
                currencyUsage = Currency.CurrencyUsage.STANDARD;
            }
        }
        return currencyUsage;
    }

    public void setCurrencyUsage(Currency.CurrencyUsage currencyUsage) {
        synchronized (this) {
            this.properties.setCurrencyUsage(currencyUsage);
            refreshFormatter();
        }
    }

    public CurrencyPluralInfo getCurrencyPluralInfo() {
        CurrencyPluralInfo currencyPluralInfo;
        synchronized (this) {
            currencyPluralInfo = this.properties.getCurrencyPluralInfo();
        }
        return currencyPluralInfo;
    }

    public void setCurrencyPluralInfo(CurrencyPluralInfo currencyPluralInfo) {
        synchronized (this) {
            this.properties.setCurrencyPluralInfo(currencyPluralInfo);
            refreshFormatter();
        }
    }

    public boolean isParseBigDecimal() {
        boolean parseToBigDecimal;
        synchronized (this) {
            parseToBigDecimal = this.properties.getParseToBigDecimal();
        }
        return parseToBigDecimal;
    }

    public void setParseBigDecimal(boolean z) {
        synchronized (this) {
            this.properties.setParseToBigDecimal(z);
            refreshFormatter();
        }
    }

    @Override // com.ibm.icu.text.NumberFormat
    public boolean isParseStrict() {
        boolean z;
        synchronized (this) {
            z = this.properties.getParseMode() == DecimalFormatProperties.ParseMode.STRICT;
        }
        return z;
    }

    @Override // com.ibm.icu.text.NumberFormat
    public void setParseStrict(boolean z) {
        synchronized (this) {
            this.properties.setParseMode(z ? DecimalFormatProperties.ParseMode.STRICT : DecimalFormatProperties.ParseMode.LENIENT);
            refreshFormatter();
        }
    }

    @Deprecated
    public void setParseStrictMode(DecimalFormatProperties.ParseMode parseMode) {
        synchronized (this) {
            this.properties.setParseMode(parseMode);
            refreshFormatter();
        }
    }

    @Override // com.ibm.icu.text.NumberFormat
    public boolean isParseIntegerOnly() {
        boolean parseIntegerOnly;
        synchronized (this) {
            parseIntegerOnly = this.properties.getParseIntegerOnly();
        }
        return parseIntegerOnly;
    }

    @Override // com.ibm.icu.text.NumberFormat
    public void setParseIntegerOnly(boolean z) {
        synchronized (this) {
            this.properties.setParseIntegerOnly(z);
            refreshFormatter();
        }
    }

    public boolean isDecimalPatternMatchRequired() {
        boolean decimalPatternMatchRequired;
        synchronized (this) {
            decimalPatternMatchRequired = this.properties.getDecimalPatternMatchRequired();
        }
        return decimalPatternMatchRequired;
    }

    public void setDecimalPatternMatchRequired(boolean z) {
        synchronized (this) {
            this.properties.setDecimalPatternMatchRequired(z);
            refreshFormatter();
        }
    }

    public boolean isParseNoExponent() {
        boolean parseNoExponent;
        synchronized (this) {
            parseNoExponent = this.properties.getParseNoExponent();
        }
        return parseNoExponent;
    }

    public void setParseNoExponent(boolean z) {
        synchronized (this) {
            this.properties.setParseNoExponent(z);
            refreshFormatter();
        }
    }

    public boolean isParseCaseSensitive() {
        boolean parseCaseSensitive;
        synchronized (this) {
            parseCaseSensitive = this.properties.getParseCaseSensitive();
        }
        return parseCaseSensitive;
    }

    public void setParseCaseSensitive(boolean z) {
        synchronized (this) {
            this.properties.setParseCaseSensitive(z);
            refreshFormatter();
        }
    }

    @Override // com.ibm.icu.text.NumberFormat
    public boolean equals(Object obj) {
        synchronized (this) {
            boolean z = false;
            if (obj == null) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DecimalFormat)) {
                return false;
            }
            DecimalFormat decimalFormat = (DecimalFormat) obj;
            if (this.properties.equals(decimalFormat.properties)) {
                if (this.symbols.equals(decimalFormat.symbols)) {
                    z = true;
                }
            }
            return z;
        }
    }

    @Override // com.ibm.icu.text.NumberFormat
    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        synchronized (this) {
            iHashCode = this.properties.hashCode();
            iHashCode2 = this.symbols.hashCode();
        }
        return iHashCode ^ iHashCode2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(" { symbols@");
        sb.append(Integer.toHexString(this.symbols.hashCode()));
        synchronized (this) {
            this.properties.toStringBare(sb);
        }
        sb.append(" }");
        return sb.toString();
    }

    public String toPattern() {
        String strCopydefault;
        synchronized (this) {
            DecimalFormatProperties decimalFormatPropertiesCopyFrom = new DecimalFormatProperties().copyFrom(this.properties);
            if (decimalFormatPropertiesCopyFrom.getCurrency() != null || decimalFormatPropertiesCopyFrom.getCurrencyPluralInfo() != null || decimalFormatPropertiesCopyFrom.getCurrencyUsage() != null || C7105adZ.EZpvd(decimalFormatPropertiesCopyFrom.getPositivePrefixPattern()) || C7105adZ.EZpvd(decimalFormatPropertiesCopyFrom.getPositiveSuffixPattern()) || C7105adZ.EZpvd(decimalFormatPropertiesCopyFrom.getNegativePrefixPattern()) || C7105adZ.EZpvd(decimalFormatPropertiesCopyFrom.getNegativeSuffixPattern())) {
                decimalFormatPropertiesCopyFrom.setMinimumFractionDigits(this.exportedProperties.getMinimumFractionDigits());
                decimalFormatPropertiesCopyFrom.setMaximumFractionDigits(this.exportedProperties.getMaximumFractionDigits());
                decimalFormatPropertiesCopyFrom.setRoundingIncrement(this.exportedProperties.getRoundingIncrement());
            }
            strCopydefault = PatternStringUtils.copydefault(decimalFormatPropertiesCopyFrom);
        }
        return strCopydefault;
    }

    public String toLocalizedPattern() {
        String strKWHzl;
        synchronized (this) {
            strKWHzl = PatternStringUtils.KWHzl(toPattern(), this.symbols, true);
        }
        return strKWHzl;
    }

    @Deprecated
    public PluralRules.TaskDescription getFixedDecimal(double d) {
        return this.formatter.KWHzl(d).EZpvd();
    }

    public void refreshFormatter() {
        if (this.exportedProperties == null) {
            return;
        }
        ULocale locale = getLocale(ULocale.ACTUAL_LOCALE);
        if (locale == null) {
            locale = this.symbols.getLocale(ULocale.ACTUAL_LOCALE);
        }
        if (locale == null) {
            locale = this.symbols.getULocale();
        }
        this.formatter = NumberFormatter.OLrzqt(this.properties, this.symbols, this.exportedProperties).EZpvd(locale);
        this.parser = null;
        this.currencyParser = null;
    }

    public C7142aeJ getParser() {
        if (this.parser == null) {
            this.parser = C7142aeJ.OLrzqt(this.properties, this.symbols, false);
        }
        return this.parser;
    }

    public C7142aeJ getCurrencyParser() {
        if (this.currencyParser == null) {
            this.currencyParser = C7142aeJ.OLrzqt(this.properties, this.symbols, true);
        }
        return this.currencyParser;
    }

    private Number safeConvertBigDecimal(BigDecimal bigDecimal) {
        try {
            return new com.ibm.icu.math.BigDecimal(bigDecimal);
        } catch (NumberFormatException unused) {
            if (bigDecimal.signum() > 0 && bigDecimal.scale() < 0) {
                return Double.valueOf(Double.POSITIVE_INFINITY);
            }
            if (bigDecimal.scale() < 0) {
                return Double.valueOf(Double.NEGATIVE_INFINITY);
            }
            if (bigDecimal.signum() < 0) {
                return Double.valueOf(AudioStats.AUDIO_AMPLITUDE_NONE);
            }
            return Double.valueOf(AudioStats.AUDIO_AMPLITUDE_NONE);
        }
    }

    public void setPropertiesFromPattern(String str, int i) {
        str.getClass();
        C7173aeo.EZpvd(str, this.properties, i);
    }

    public static void fieldPositionHelper(InterfaceC7163aee interfaceC7163aee, C7020abU c7020abU, FieldPosition fieldPosition, int i) {
        fieldPosition.setBeginIndex(0);
        fieldPosition.setEndIndex(0);
        interfaceC7163aee.KWHzl(fieldPosition);
        if (!FormattedValueStringBuilderImpl.KWHzl(c7020abU, fieldPosition) || i == 0) {
            return;
        }
        fieldPosition.setBeginIndex(fieldPosition.getBeginIndex() + i);
        fieldPosition.setEndIndex(fieldPosition.getEndIndex() + i);
    }

    @Deprecated
    public void setProperties(Application application) {
        synchronized (this) {
            application.copydefault(this.properties);
            refreshFormatter();
        }
    }
}
