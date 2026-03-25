package com.ibm.icu.text;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.engagelab.privates.analysis.constants.MTAnalysisConstants;
import com.ibm.icu.impl.ICUResourceBundle;
import com.ibm.icu.math.BigDecimal;
import com.ibm.icu.text.DisplayContext;
import com.ibm.icu.util.Currency;
import com.ibm.icu.util.ULocale;
import com.ibm.icu.util.UResourceBundle;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.text.FieldPosition;
import java.text.Format;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.Set;
import o.C7252agN;
import o.C7275agk;

/* JADX INFO: loaded from: classes3.dex */
public abstract class NumberFormat extends UFormat {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int ACCOUNTINGCURRENCYSTYLE = 7;
    public static final int CASHCURRENCYSTYLE = 8;
    public static final int CURRENCYSTYLE = 1;
    public static final int FRACTION_FIELD = 1;
    public static final int INTEGERSTYLE = 4;
    public static final int INTEGER_FIELD = 0;
    public static final int ISOCURRENCYSTYLE = 5;
    public static final int NUMBERSTYLE = 0;
    public static final int PERCENTSTYLE = 2;
    public static final int PLURALCURRENCYSTYLE = 6;
    public static final int SCIENTIFICSTYLE = 3;
    public static final int STANDARDCURRENCYSTYLE = 9;
    static final int currentSerialVersion = 2;
    private static final char[] doubleCurrencySign;
    private static final String doubleCurrencyStr;
    private static final long serialVersionUID = -2308460125733713944L;
    private static StateListAnimator shim;
    Currency currency;
    boolean parseStrict;
    boolean groupingUsed = true;
    private byte maxIntegerDigits = 40;
    private byte minIntegerDigits = 1;
    private byte maxFractionDigits = 3;
    private byte minFractionDigits = 0;
    boolean parseIntegerOnly = false;
    int maximumIntegerDigits = 40;
    int minimumIntegerDigits = 1;
    int maximumFractionDigits = 3;
    int minimumFractionDigits = 0;
    private int serialVersionOnStream = 2;
    private DisplayContext capitalizationSetting = DisplayContext.CAPITALIZATION_NONE;

    public static abstract class StateListAnimator {
        public abstract boolean AEQbTJ(Object obj);

        public abstract ULocale[] AEQbTJ();

        public abstract NumberFormat KWHzl(ULocale uLocale, int i);

        public abstract Object OLrzqt(Activity activity);

        public abstract Locale[] OLrzqt();
    }

    public abstract StringBuffer format(double d, StringBuffer stringBuffer, FieldPosition fieldPosition);

    public abstract StringBuffer format(long j, StringBuffer stringBuffer, FieldPosition fieldPosition);

    public abstract StringBuffer format(BigDecimal bigDecimal, StringBuffer stringBuffer, FieldPosition fieldPosition);

    public abstract StringBuffer format(java.math.BigDecimal bigDecimal, StringBuffer stringBuffer, FieldPosition fieldPosition);

    public abstract StringBuffer format(BigInteger bigInteger, StringBuffer stringBuffer, FieldPosition fieldPosition);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Currency getCurrency() {
        return this.currency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getMaximumFractionDigits() {
        return this.maximumFractionDigits;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getMaximumIntegerDigits() {
        return this.maximumIntegerDigits;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getMinimumFractionDigits() {
        return this.minimumFractionDigits;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getMinimumIntegerDigits() {
        return this.minimumIntegerDigits;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.maximumIntegerDigits * 37) + this.maxFractionDigits;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isGroupingUsed() {
        return this.groupingUsed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isParseIntegerOnly() {
        return this.parseIntegerOnly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isParseStrict() {
        return this.parseStrict;
    }

    public abstract Number parse(String str, ParsePosition parsePosition);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setGroupingUsed(boolean z) {
        this.groupingUsed = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setParseIntegerOnly(boolean z) {
        this.parseIntegerOnly = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setParseStrict(boolean z) {
        this.parseStrict = z;
    }

    @Override // java.text.Format
    public StringBuffer format(Object obj, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        if (obj instanceof Long) {
            return format(((Long) obj).longValue(), stringBuffer, fieldPosition);
        }
        if (obj instanceof BigInteger) {
            return format((BigInteger) obj, stringBuffer, fieldPosition);
        }
        if (obj instanceof java.math.BigDecimal) {
            return format((java.math.BigDecimal) obj, stringBuffer, fieldPosition);
        }
        if (obj instanceof BigDecimal) {
            return format((BigDecimal) obj, stringBuffer, fieldPosition);
        }
        if (obj instanceof C7252agN) {
            return format((C7252agN) obj, stringBuffer, fieldPosition);
        }
        if (obj instanceof Number) {
            return format(((Number) obj).doubleValue(), stringBuffer, fieldPosition);
        }
        throw new IllegalArgumentException("Cannot format given Object as a Number");
    }

    @Override // java.text.Format
    public final Object parseObject(String str, ParsePosition parsePosition) {
        return parse(str, parsePosition);
    }

    public final String format(double d) {
        return format(d, new StringBuffer(), new FieldPosition(0)).toString();
    }

    public final String format(long j) {
        StringBuffer stringBuffer = new StringBuffer(19);
        format(j, stringBuffer, new FieldPosition(0));
        return stringBuffer.toString();
    }

    public final String format(BigInteger bigInteger) {
        return format(bigInteger, new StringBuffer(), new FieldPosition(0)).toString();
    }

    public final String format(java.math.BigDecimal bigDecimal) {
        return format(bigDecimal, new StringBuffer(), new FieldPosition(0)).toString();
    }

    public final String format(BigDecimal bigDecimal) {
        return format(bigDecimal, new StringBuffer(), new FieldPosition(0)).toString();
    }

    public final String format(C7252agN c7252agN) {
        return format(c7252agN, new StringBuffer(), new FieldPosition(0)).toString();
    }

    public StringBuffer format(C7252agN c7252agN, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        synchronized (this) {
            Currency currency = getCurrency();
            Currency currencyAEQbTJ = c7252agN.AEQbTJ();
            boolean zEquals = currencyAEQbTJ.equals(currency);
            if (!zEquals) {
                setCurrency(currencyAEQbTJ);
            }
            format(c7252agN.OLrzqt(), stringBuffer, fieldPosition);
            if (!zEquals) {
                setCurrency(currency);
            }
        }
        return stringBuffer;
    }

    public Number parse(String str) throws ParseException {
        ParsePosition parsePosition = new ParsePosition(0);
        Number number = parse(str, parsePosition);
        if (parsePosition.getIndex() != 0) {
            return number;
        }
        throw new ParseException("Unparseable number: \"" + str + '\"', parsePosition.getErrorIndex());
    }

    public C7252agN parseCurrency(CharSequence charSequence, ParsePosition parsePosition) {
        Number number = parse(charSequence.toString(), parsePosition);
        if (number == null) {
            return null;
        }
        return new C7252agN(number, getEffectiveCurrency());
    }

    public void setContext(DisplayContext displayContext) {
        if (displayContext.type() == DisplayContext.Type.CAPITALIZATION) {
            this.capitalizationSetting = displayContext;
        }
    }

    public DisplayContext getContext(DisplayContext.Type type) {
        DisplayContext displayContext;
        return (type != DisplayContext.Type.CAPITALIZATION || (displayContext = this.capitalizationSetting) == null) ? DisplayContext.CAPITALIZATION_NONE : displayContext;
    }

    public static final NumberFormat getInstance() {
        return getInstance(ULocale.getDefault(ULocale.Category.FORMAT), 0);
    }

    public static NumberFormat getInstance(Locale locale) {
        return getInstance(ULocale.forLocale(locale), 0);
    }

    public static NumberFormat getInstance(ULocale uLocale) {
        return getInstance(uLocale, 0);
    }

    public static final NumberFormat getInstance(int i) {
        return getInstance(ULocale.getDefault(ULocale.Category.FORMAT), i);
    }

    public static NumberFormat getInstance(Locale locale, int i) {
        return getInstance(ULocale.forLocale(locale), i);
    }

    public static final NumberFormat getNumberInstance() {
        return getInstance(ULocale.getDefault(ULocale.Category.FORMAT), 0);
    }

    public static NumberFormat getNumberInstance(Locale locale) {
        return getInstance(ULocale.forLocale(locale), 0);
    }

    public static NumberFormat getNumberInstance(ULocale uLocale) {
        return getInstance(uLocale, 0);
    }

    public static final NumberFormat getIntegerInstance() {
        return getInstance(ULocale.getDefault(ULocale.Category.FORMAT), 4);
    }

    public static NumberFormat getIntegerInstance(Locale locale) {
        return getInstance(ULocale.forLocale(locale), 4);
    }

    public static NumberFormat getIntegerInstance(ULocale uLocale) {
        return getInstance(uLocale, 4);
    }

    public static final NumberFormat getCurrencyInstance() {
        return getInstance(ULocale.getDefault(ULocale.Category.FORMAT), 1);
    }

    public static NumberFormat getCurrencyInstance(Locale locale) {
        return getInstance(ULocale.forLocale(locale), 1);
    }

    public static NumberFormat getCurrencyInstance(ULocale uLocale) {
        return getInstance(uLocale, 1);
    }

    public static final NumberFormat getPercentInstance() {
        return getInstance(ULocale.getDefault(ULocale.Category.FORMAT), 2);
    }

    public static NumberFormat getPercentInstance(Locale locale) {
        return getInstance(ULocale.forLocale(locale), 2);
    }

    public static NumberFormat getPercentInstance(ULocale uLocale) {
        return getInstance(uLocale, 2);
    }

    public static final NumberFormat getScientificInstance() {
        return getInstance(ULocale.getDefault(ULocale.Category.FORMAT), 3);
    }

    public static NumberFormat getScientificInstance(Locale locale) {
        return getInstance(ULocale.forLocale(locale), 3);
    }

    public static NumberFormat getScientificInstance(ULocale uLocale) {
        return getInstance(uLocale, 3);
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static abstract class Activity {
        public boolean AEQbTJ() {
            return true;
        }

        public abstract Set<String> EZpvd();

        public NumberFormat OLrzqt(ULocale uLocale, int i) {
            return KWHzl(uLocale.toLocale(), i);
        }

        public NumberFormat KWHzl(Locale locale, int i) {
            return OLrzqt(ULocale.forLocale(locale), i);
        }
    }

    private static StateListAnimator getShim() {
        if (shim == null) {
            try {
                shim = (StateListAnimator) Class.forName("o.agn").newInstance();
            } catch (MissingResourceException e) {
                throw e;
            } catch (Exception e2) {
                throw new RuntimeException(e2.getMessage());
            }
        }
        return shim;
    }

    public static Locale[] getAvailableLocales() {
        if (shim == null) {
            return ICUResourceBundle.copydefault();
        }
        return getShim().OLrzqt();
    }

    public static ULocale[] getAvailableULocales() {
        if (shim == null) {
            return ICUResourceBundle.OLrzqt();
        }
        return getShim().AEQbTJ();
    }

    public static Object registerFactory(Activity activity) {
        if (activity == null) {
            throw new IllegalArgumentException("factory must not be null");
        }
        return getShim().OLrzqt(activity);
    }

    public static boolean unregister(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("registryKey must not be null");
        }
        StateListAnimator stateListAnimator = shim;
        if (stateListAnimator == null) {
            return false;
        }
        return stateListAnimator.AEQbTJ(obj);
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
        NumberFormat numberFormat = (NumberFormat) obj;
        return this.maximumIntegerDigits == numberFormat.maximumIntegerDigits && this.minimumIntegerDigits == numberFormat.minimumIntegerDigits && this.maximumFractionDigits == numberFormat.maximumFractionDigits && this.minimumFractionDigits == numberFormat.minimumFractionDigits && this.groupingUsed == numberFormat.groupingUsed && this.parseIntegerOnly == numberFormat.parseIntegerOnly && this.parseStrict == numberFormat.parseStrict && this.capitalizationSetting == numberFormat.capitalizationSetting;
    }

    @Override // java.text.Format
    public Object clone() {
        return (NumberFormat) super.clone();
    }

    public void setMaximumIntegerDigits(int i) {
        int iMax = Math.max(0, i);
        this.maximumIntegerDigits = iMax;
        if (this.minimumIntegerDigits > iMax) {
            this.minimumIntegerDigits = iMax;
        }
    }

    public void setMinimumIntegerDigits(int i) {
        int iMax = Math.max(0, i);
        this.minimumIntegerDigits = iMax;
        if (iMax > this.maximumIntegerDigits) {
            this.maximumIntegerDigits = iMax;
        }
    }

    public void setMaximumFractionDigits(int i) {
        int iMax = Math.max(0, i);
        this.maximumFractionDigits = iMax;
        if (iMax < this.minimumFractionDigits) {
            this.minimumFractionDigits = iMax;
        }
    }

    public void setMinimumFractionDigits(int i) {
        int iMax = Math.max(0, i);
        this.minimumFractionDigits = iMax;
        if (this.maximumFractionDigits < iMax) {
            this.maximumFractionDigits = iMax;
        }
    }

    @Deprecated
    public Currency getEffectiveCurrency() {
        Currency currency = getCurrency();
        if (currency != null) {
            return currency;
        }
        ULocale locale = getLocale(ULocale.VALID_LOCALE);
        if (locale == null) {
            locale = ULocale.getDefault(ULocale.Category.FORMAT);
        }
        return Currency.getInstance(locale);
    }

    public int getRoundingMode() {
        throw new UnsupportedOperationException("getRoundingMode must be implemented by the subclass implementation.");
    }

    public void setRoundingMode(int i) {
        throw new UnsupportedOperationException("setRoundingMode must be implemented by the subclass implementation.");
    }

    public static NumberFormat getInstance(ULocale uLocale, int i) {
        if (i < 0 || i > 9) {
            throw new IllegalArgumentException("choice should be from NUMBERSTYLE to STANDARDCURRENCYSTYLE");
        }
        return getShim().KWHzl(uLocale, i);
    }

    public static NumberFormat createInstance(ULocale uLocale, int i) {
        String currencyPattern;
        NumberFormat numberFormat;
        String pattern = getPattern(uLocale, i);
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(uLocale);
        int i2 = 1;
        if ((i == 1 || i == 5 || i == 7 || i == 8 || i == 9) && (currencyPattern = decimalFormatSymbols.getCurrencyPattern()) != null) {
            pattern = currencyPattern;
        }
        if (i == 5) {
            pattern = pattern.replace("¤", doubleCurrencyStr);
        }
        C7275agk c7275agkEZpvd = C7275agk.EZpvd(uLocale);
        if (c7275agkEZpvd == null) {
            return null;
        }
        if (c7275agkEZpvd.copydefault()) {
            String strKWHzl = c7275agkEZpvd.KWHzl();
            int iIndexOf = strKWHzl.indexOf("/");
            int iLastIndexOf = strKWHzl.lastIndexOf("/");
            if (iLastIndexOf > iIndexOf) {
                String strSubstring = strKWHzl.substring(0, iIndexOf);
                String strSubstring2 = strKWHzl.substring(iIndexOf + 1, iLastIndexOf);
                strKWHzl = strKWHzl.substring(iLastIndexOf + 1);
                ULocale uLocale2 = new ULocale(strSubstring);
                if (strSubstring2.equals("SpelloutRules")) {
                    uLocale = uLocale2;
                    RuleBasedNumberFormat ruleBasedNumberFormat = new RuleBasedNumberFormat(uLocale, i2);
                    ruleBasedNumberFormat.setDefaultRuleSet(strKWHzl);
                    numberFormat = ruleBasedNumberFormat;
                } else {
                    uLocale = uLocale2;
                    i2 = 4;
                    RuleBasedNumberFormat ruleBasedNumberFormat2 = new RuleBasedNumberFormat(uLocale, i2);
                    ruleBasedNumberFormat2.setDefaultRuleSet(strKWHzl);
                    numberFormat = ruleBasedNumberFormat2;
                }
            } else {
                i2 = 4;
                RuleBasedNumberFormat ruleBasedNumberFormat22 = new RuleBasedNumberFormat(uLocale, i2);
                ruleBasedNumberFormat22.setDefaultRuleSet(strKWHzl);
                numberFormat = ruleBasedNumberFormat22;
            }
        } else {
            DecimalFormat decimalFormat = new DecimalFormat(pattern, decimalFormatSymbols, i);
            if (i == 4) {
                decimalFormat.setMaximumFractionDigits(0);
                decimalFormat.setDecimalSeparatorAlwaysShown(false);
                decimalFormat.setParseIntegerOnly(true);
            }
            if (i == 8) {
                decimalFormat.setCurrencyUsage(Currency.CurrencyUsage.CASH);
            }
            if (i == 6) {
                decimalFormat.setCurrencyPluralInfo(CurrencyPluralInfo.getInstance(uLocale));
            }
            numberFormat = decimalFormat;
        }
        numberFormat.setLocale(decimalFormatSymbols.getLocale(ULocale.VALID_LOCALE), decimalFormatSymbols.getLocale(ULocale.ACTUAL_LOCALE));
        return numberFormat;
    }

    @Deprecated
    public static String getPattern(Locale locale, int i) {
        return getPattern(ULocale.forLocale(locale), i);
    }

    public static String getPattern(ULocale uLocale, int i) {
        return getPatternForStyle(uLocale, i);
    }

    @Deprecated
    public static String getPatternForStyle(ULocale uLocale, int i) {
        return getPatternForStyleAndNumberingSystem(uLocale, C7275agk.EZpvd(uLocale).EZpvd(), i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0033  */
    @Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String getPatternForStyleAndNumberingSystem(ULocale uLocale, String str, int i) {
        String str2;
        if (i == 1) {
            String keywordValue = uLocale.getKeywordValue("cf");
            if (keywordValue == null || !keywordValue.equals(MTAnalysisConstants.Account.KEY_ACCOUNT)) {
            }
        } else if (i == 2) {
            str2 = "percentFormat";
        } else if (i == 3) {
            str2 = "scientificFormat";
        } else if (i == 5) {
            str2 = "currencyFormat";
        } else if (i == 7) {
            str2 = "accountingFormat";
        } else if (i != 8 && i != 9) {
            str2 = "decimalFormat";
        }
        ICUResourceBundle iCUResourceBundle = (ICUResourceBundle) UResourceBundle.KWHzl("com/ibm/icu/impl/data/icudt68b", uLocale);
        String strAEQbTJ = iCUResourceBundle.AEQbTJ("NumberElements/" + str + "/patterns/" + str2);
        if (strAEQbTJ != null) {
            return strAEQbTJ;
        }
        return iCUResourceBundle.djBIcL("NumberElements/latn/patterns/" + str2);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        int i;
        objectInputStream.defaultReadObject();
        int i2 = this.serialVersionOnStream;
        if (i2 < 1) {
            this.maximumIntegerDigits = this.maxIntegerDigits;
            this.minimumIntegerDigits = this.minIntegerDigits;
            this.maximumFractionDigits = this.maxFractionDigits;
            this.minimumFractionDigits = this.minFractionDigits;
        }
        if (i2 < 2) {
            this.capitalizationSetting = DisplayContext.CAPITALIZATION_NONE;
        }
        int i3 = this.minimumIntegerDigits;
        if (i3 > this.maximumIntegerDigits || (i = this.minimumFractionDigits) > this.maximumFractionDigits || i3 < 0 || i < 0) {
            throw new InvalidObjectException("Digit count range invalid");
        }
        this.serialVersionOnStream = 2;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        int i = this.maximumIntegerDigits;
        this.maxIntegerDigits = i > 127 ? (byte) 127 : (byte) i;
        int i2 = this.minimumIntegerDigits;
        this.minIntegerDigits = i2 > 127 ? (byte) 127 : (byte) i2;
        int i3 = this.maximumFractionDigits;
        this.maxFractionDigits = i3 > 127 ? (byte) 127 : (byte) i3;
        int i4 = this.minimumFractionDigits;
        this.minFractionDigits = i4 <= 127 ? (byte) i4 : (byte) 127;
        objectOutputStream.defaultWriteObject();
    }

    static {
        char[] cArr = {164, 164};
        doubleCurrencySign = cArr;
        doubleCurrencyStr = new String(cArr);
    }

    public static class Field extends Format.Field {
        static final long serialVersionUID = -4516273749929385842L;
        public static final Field SIGN = new Field("sign");
        public static final Field INTEGER = new Field(TypedValues.Custom.S_INT);
        public static final Field FRACTION = new Field("fraction");
        public static final Field EXPONENT = new Field("exponent");
        public static final Field EXPONENT_SIGN = new Field("exponent sign");
        public static final Field EXPONENT_SYMBOL = new Field("exponent symbol");
        public static final Field DECIMAL_SEPARATOR = new Field("decimal separator");
        public static final Field GROUPING_SEPARATOR = new Field("grouping separator");
        public static final Field PERCENT = new Field("percent");
        public static final Field PERMILLE = new Field("per mille");
        public static final Field CURRENCY = new Field("currency");
        public static final Field MEASURE_UNIT = new Field("measure unit");
        public static final Field COMPACT = new Field("compact");

        public Field(String str) {
            super(str);
        }

        @Override // java.text.AttributedCharacterIterator.Attribute
        public Object readResolve() throws InvalidObjectException {
            String name = getName();
            Field field = INTEGER;
            if (name.equals(field.getName())) {
                return field;
            }
            String name2 = getName();
            Field field2 = FRACTION;
            if (name2.equals(field2.getName())) {
                return field2;
            }
            String name3 = getName();
            Field field3 = EXPONENT;
            if (name3.equals(field3.getName())) {
                return field3;
            }
            String name4 = getName();
            Field field4 = EXPONENT_SIGN;
            if (name4.equals(field4.getName())) {
                return field4;
            }
            String name5 = getName();
            Field field5 = EXPONENT_SYMBOL;
            if (name5.equals(field5.getName())) {
                return field5;
            }
            String name6 = getName();
            Field field6 = CURRENCY;
            if (name6.equals(field6.getName())) {
                return field6;
            }
            String name7 = getName();
            Field field7 = DECIMAL_SEPARATOR;
            if (name7.equals(field7.getName())) {
                return field7;
            }
            String name8 = getName();
            Field field8 = GROUPING_SEPARATOR;
            if (name8.equals(field8.getName())) {
                return field8;
            }
            String name9 = getName();
            Field field9 = PERCENT;
            if (name9.equals(field9.getName())) {
                return field9;
            }
            String name10 = getName();
            Field field10 = PERMILLE;
            if (name10.equals(field10.getName())) {
                return field10;
            }
            String name11 = getName();
            Field field11 = SIGN;
            if (name11.equals(field11.getName())) {
                return field11;
            }
            String name12 = getName();
            Field field12 = MEASURE_UNIT;
            if (name12.equals(field12.getName())) {
                return field12;
            }
            String name13 = getName();
            Field field13 = COMPACT;
            if (name13.equals(field13.getName())) {
                return field13;
            }
            throw new InvalidObjectException("An invalid object.");
        }
    }
}
