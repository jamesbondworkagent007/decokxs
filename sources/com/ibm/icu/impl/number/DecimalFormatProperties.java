package com.ibm.icu.impl.number;

import com.ibm.icu.impl.number.Padder;
import com.ibm.icu.text.CompactDecimalFormat;
import com.ibm.icu.text.CurrencyPluralInfo;
import com.ibm.icu.text.PluralRules;
import com.ibm.icu.util.Currency;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class DecimalFormatProperties implements Cloneable, Serializable {
    private static final DecimalFormatProperties DEFAULT = new DecimalFormatProperties();
    private static final long serialVersionUID = 4095518955889349243L;
    private transient Map<String, Map<String, String>> compactCustomData;
    private transient CompactDecimalFormat.CompactStyle compactStyle;
    private transient Currency currency;
    private transient CurrencyPluralInfo currencyPluralInfo;
    private transient Currency.CurrencyUsage currencyUsage;
    private transient boolean decimalPatternMatchRequired;
    private transient boolean decimalSeparatorAlwaysShown;
    private transient boolean exponentSignAlwaysShown;
    private transient int formatWidth;
    private transient int groupingSize;
    private transient boolean groupingUsed;
    private transient int magnitudeMultiplier;
    private transient MathContext mathContext;
    private transient int maximumFractionDigits;
    private transient int maximumIntegerDigits;
    private transient int maximumSignificantDigits;
    private transient int minimumExponentDigits;
    private transient int minimumFractionDigits;
    private transient int minimumGroupingDigits;
    private transient int minimumIntegerDigits;
    private transient int minimumSignificantDigits;
    private transient BigDecimal multiplier;
    private transient String negativePrefix;
    private transient String negativePrefixPattern;
    private transient String negativeSuffix;
    private transient String negativeSuffixPattern;
    private transient Padder.PadPosition padPosition;
    private transient String padString;
    private transient boolean parseCaseSensitive;
    private transient boolean parseIntegerOnly;
    private transient ParseMode parseMode;
    private transient boolean parseNoExponent;
    private transient boolean parseToBigDecimal;
    private transient PluralRules pluralRules;
    private transient String positivePrefix;
    private transient String positivePrefixPattern;
    private transient String positiveSuffix;
    private transient String positiveSuffixPattern;
    private transient BigDecimal roundingIncrement;
    private transient RoundingMode roundingMode;
    private transient int secondaryGroupingSize;
    private transient boolean signAlwaysShown;

    public enum ParseMode {
        LENIENT,
        STRICT,
        JAVA_COMPATIBILITY
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private DecimalFormatProperties _clear() {
        this.compactCustomData = null;
        this.compactStyle = null;
        this.currency = null;
        this.currencyPluralInfo = null;
        this.currencyUsage = null;
        this.decimalPatternMatchRequired = false;
        this.decimalSeparatorAlwaysShown = false;
        this.exponentSignAlwaysShown = false;
        this.formatWidth = -1;
        this.groupingSize = -1;
        this.groupingUsed = true;
        this.magnitudeMultiplier = 0;
        this.mathContext = null;
        this.maximumFractionDigits = -1;
        this.maximumIntegerDigits = -1;
        this.maximumSignificantDigits = -1;
        this.minimumExponentDigits = -1;
        this.minimumFractionDigits = -1;
        this.minimumGroupingDigits = -1;
        this.minimumIntegerDigits = -1;
        this.minimumSignificantDigits = -1;
        this.multiplier = null;
        this.negativePrefix = null;
        this.negativePrefixPattern = null;
        this.negativeSuffix = null;
        this.negativeSuffixPattern = null;
        this.padPosition = null;
        this.padString = null;
        this.parseCaseSensitive = false;
        this.parseIntegerOnly = false;
        this.parseMode = null;
        this.parseNoExponent = false;
        this.parseToBigDecimal = false;
        this.pluralRules = null;
        this.positivePrefix = null;
        this.positivePrefixPattern = null;
        this.positiveSuffix = null;
        this.positiveSuffixPattern = null;
        this.roundingIncrement = null;
        this.roundingMode = null;
        this.secondaryGroupingSize = -1;
        this.signAlwaysShown = false;
        return this;
    }

    private boolean _equalsHelper(int i, int i2) {
        return i == i2;
    }

    private boolean _equalsHelper(boolean z, boolean z2) {
        return z == z2;
    }

    private int _hashCodeHelper(int i) {
        return i * 13;
    }

    private int _hashCodeHelper(boolean z) {
        return z ? 1 : 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Map<String, Map<String, String>> getCompactCustomData() {
        return this.compactCustomData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CompactDecimalFormat.CompactStyle getCompactStyle() {
        return this.compactStyle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Currency getCurrency() {
        return this.currency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CurrencyPluralInfo getCurrencyPluralInfo() {
        return this.currencyPluralInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Currency.CurrencyUsage getCurrencyUsage() {
        return this.currencyUsage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean getDecimalPatternMatchRequired() {
        return this.decimalPatternMatchRequired;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean getDecimalSeparatorAlwaysShown() {
        return this.decimalSeparatorAlwaysShown;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean getExponentSignAlwaysShown() {
        return this.exponentSignAlwaysShown;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getFormatWidth() {
        return this.formatWidth;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getGroupingSize() {
        return this.groupingSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean getGroupingUsed() {
        return this.groupingUsed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getMagnitudeMultiplier() {
        return this.magnitudeMultiplier;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MathContext getMathContext() {
        return this.mathContext;
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
    public int getMaximumSignificantDigits() {
        return this.maximumSignificantDigits;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getMinimumExponentDigits() {
        return this.minimumExponentDigits;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getMinimumFractionDigits() {
        return this.minimumFractionDigits;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getMinimumGroupingDigits() {
        return this.minimumGroupingDigits;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getMinimumIntegerDigits() {
        return this.minimumIntegerDigits;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getMinimumSignificantDigits() {
        return this.minimumSignificantDigits;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BigDecimal getMultiplier() {
        return this.multiplier;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getNegativePrefix() {
        return this.negativePrefix;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getNegativePrefixPattern() {
        return this.negativePrefixPattern;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getNegativeSuffix() {
        return this.negativeSuffix;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getNegativeSuffixPattern() {
        return this.negativeSuffixPattern;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Padder.PadPosition getPadPosition() {
        return this.padPosition;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getPadString() {
        return this.padString;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean getParseCaseSensitive() {
        return this.parseCaseSensitive;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean getParseIntegerOnly() {
        return this.parseIntegerOnly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ParseMode getParseMode() {
        return this.parseMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean getParseNoExponent() {
        return this.parseNoExponent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean getParseToBigDecimal() {
        return this.parseToBigDecimal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PluralRules getPluralRules() {
        return this.pluralRules;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getPositivePrefix() {
        return this.positivePrefix;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getPositivePrefixPattern() {
        return this.positivePrefixPattern;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getPositiveSuffix() {
        return this.positiveSuffix;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getPositiveSuffixPattern() {
        return this.positiveSuffixPattern;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BigDecimal getRoundingIncrement() {
        return this.roundingIncrement;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RoundingMode getRoundingMode() {
        return this.roundingMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getSecondaryGroupingSize() {
        return this.secondaryGroupingSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean getSignAlwaysShown() {
        return this.signAlwaysShown;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DecimalFormatProperties setCompactCustomData(Map<String, Map<String, String>> map) {
        this.compactCustomData = map;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DecimalFormatProperties setCompactStyle(CompactDecimalFormat.CompactStyle compactStyle) {
        this.compactStyle = compactStyle;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DecimalFormatProperties setCurrency(Currency currency) {
        this.currency = currency;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DecimalFormatProperties setCurrencyUsage(Currency.CurrencyUsage currencyUsage) {
        this.currencyUsage = currencyUsage;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DecimalFormatProperties setDecimalPatternMatchRequired(boolean z) {
        this.decimalPatternMatchRequired = z;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DecimalFormatProperties setDecimalSeparatorAlwaysShown(boolean z) {
        this.decimalSeparatorAlwaysShown = z;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DecimalFormatProperties setExponentSignAlwaysShown(boolean z) {
        this.exponentSignAlwaysShown = z;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DecimalFormatProperties setFormatWidth(int i) {
        this.formatWidth = i;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DecimalFormatProperties setGroupingSize(int i) {
        this.groupingSize = i;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DecimalFormatProperties setGroupingUsed(boolean z) {
        this.groupingUsed = z;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DecimalFormatProperties setMagnitudeMultiplier(int i) {
        this.magnitudeMultiplier = i;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DecimalFormatProperties setMathContext(MathContext mathContext) {
        this.mathContext = mathContext;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DecimalFormatProperties setMaximumFractionDigits(int i) {
        this.maximumFractionDigits = i;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DecimalFormatProperties setMaximumIntegerDigits(int i) {
        this.maximumIntegerDigits = i;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DecimalFormatProperties setMaximumSignificantDigits(int i) {
        this.maximumSignificantDigits = i;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DecimalFormatProperties setMinimumExponentDigits(int i) {
        this.minimumExponentDigits = i;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DecimalFormatProperties setMinimumFractionDigits(int i) {
        this.minimumFractionDigits = i;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DecimalFormatProperties setMinimumGroupingDigits(int i) {
        this.minimumGroupingDigits = i;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DecimalFormatProperties setMinimumIntegerDigits(int i) {
        this.minimumIntegerDigits = i;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DecimalFormatProperties setMinimumSignificantDigits(int i) {
        this.minimumSignificantDigits = i;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DecimalFormatProperties setMultiplier(BigDecimal bigDecimal) {
        this.multiplier = bigDecimal;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DecimalFormatProperties setNegativePrefix(String str) {
        this.negativePrefix = str;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DecimalFormatProperties setNegativePrefixPattern(String str) {
        this.negativePrefixPattern = str;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DecimalFormatProperties setNegativeSuffix(String str) {
        this.negativeSuffix = str;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DecimalFormatProperties setNegativeSuffixPattern(String str) {
        this.negativeSuffixPattern = str;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DecimalFormatProperties setPadPosition(Padder.PadPosition padPosition) {
        this.padPosition = padPosition;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DecimalFormatProperties setPadString(String str) {
        this.padString = str;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DecimalFormatProperties setParseCaseSensitive(boolean z) {
        this.parseCaseSensitive = z;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DecimalFormatProperties setParseIntegerOnly(boolean z) {
        this.parseIntegerOnly = z;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DecimalFormatProperties setParseMode(ParseMode parseMode) {
        this.parseMode = parseMode;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DecimalFormatProperties setParseNoExponent(boolean z) {
        this.parseNoExponent = z;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DecimalFormatProperties setParseToBigDecimal(boolean z) {
        this.parseToBigDecimal = z;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DecimalFormatProperties setPluralRules(PluralRules pluralRules) {
        this.pluralRules = pluralRules;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DecimalFormatProperties setPositivePrefix(String str) {
        this.positivePrefix = str;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DecimalFormatProperties setPositivePrefixPattern(String str) {
        this.positivePrefixPattern = str;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DecimalFormatProperties setPositiveSuffix(String str) {
        this.positiveSuffix = str;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DecimalFormatProperties setPositiveSuffixPattern(String str) {
        this.positiveSuffixPattern = str;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DecimalFormatProperties setRoundingIncrement(BigDecimal bigDecimal) {
        this.roundingIncrement = bigDecimal;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DecimalFormatProperties setRoundingMode(RoundingMode roundingMode) {
        this.roundingMode = roundingMode;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DecimalFormatProperties setSecondaryGroupingSize(int i) {
        this.secondaryGroupingSize = i;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DecimalFormatProperties setSignAlwaysShown(boolean z) {
        this.signAlwaysShown = z;
        return this;
    }

    public DecimalFormatProperties() {
        clear();
    }

    private DecimalFormatProperties _copyFrom(DecimalFormatProperties decimalFormatProperties) {
        this.compactCustomData = decimalFormatProperties.compactCustomData;
        this.compactStyle = decimalFormatProperties.compactStyle;
        this.currency = decimalFormatProperties.currency;
        this.currencyPluralInfo = decimalFormatProperties.currencyPluralInfo;
        this.currencyUsage = decimalFormatProperties.currencyUsage;
        this.decimalPatternMatchRequired = decimalFormatProperties.decimalPatternMatchRequired;
        this.decimalSeparatorAlwaysShown = decimalFormatProperties.decimalSeparatorAlwaysShown;
        this.exponentSignAlwaysShown = decimalFormatProperties.exponentSignAlwaysShown;
        this.formatWidth = decimalFormatProperties.formatWidth;
        this.groupingSize = decimalFormatProperties.groupingSize;
        this.groupingUsed = decimalFormatProperties.groupingUsed;
        this.magnitudeMultiplier = decimalFormatProperties.magnitudeMultiplier;
        this.mathContext = decimalFormatProperties.mathContext;
        this.maximumFractionDigits = decimalFormatProperties.maximumFractionDigits;
        this.maximumIntegerDigits = decimalFormatProperties.maximumIntegerDigits;
        this.maximumSignificantDigits = decimalFormatProperties.maximumSignificantDigits;
        this.minimumExponentDigits = decimalFormatProperties.minimumExponentDigits;
        this.minimumFractionDigits = decimalFormatProperties.minimumFractionDigits;
        this.minimumGroupingDigits = decimalFormatProperties.minimumGroupingDigits;
        this.minimumIntegerDigits = decimalFormatProperties.minimumIntegerDigits;
        this.minimumSignificantDigits = decimalFormatProperties.minimumSignificantDigits;
        this.multiplier = decimalFormatProperties.multiplier;
        this.negativePrefix = decimalFormatProperties.negativePrefix;
        this.negativePrefixPattern = decimalFormatProperties.negativePrefixPattern;
        this.negativeSuffix = decimalFormatProperties.negativeSuffix;
        this.negativeSuffixPattern = decimalFormatProperties.negativeSuffixPattern;
        this.padPosition = decimalFormatProperties.padPosition;
        this.padString = decimalFormatProperties.padString;
        this.parseCaseSensitive = decimalFormatProperties.parseCaseSensitive;
        this.parseIntegerOnly = decimalFormatProperties.parseIntegerOnly;
        this.parseMode = decimalFormatProperties.parseMode;
        this.parseNoExponent = decimalFormatProperties.parseNoExponent;
        this.parseToBigDecimal = decimalFormatProperties.parseToBigDecimal;
        this.pluralRules = decimalFormatProperties.pluralRules;
        this.positivePrefix = decimalFormatProperties.positivePrefix;
        this.positivePrefixPattern = decimalFormatProperties.positivePrefixPattern;
        this.positiveSuffix = decimalFormatProperties.positiveSuffix;
        this.positiveSuffixPattern = decimalFormatProperties.positiveSuffixPattern;
        this.roundingIncrement = decimalFormatProperties.roundingIncrement;
        this.roundingMode = decimalFormatProperties.roundingMode;
        this.secondaryGroupingSize = decimalFormatProperties.secondaryGroupingSize;
        this.signAlwaysShown = decimalFormatProperties.signAlwaysShown;
        return this;
    }

    private boolean _equals(DecimalFormatProperties decimalFormatProperties) {
        return _equalsHelper(this.compactCustomData, decimalFormatProperties.compactCustomData) && _equalsHelper(this.compactStyle, decimalFormatProperties.compactStyle) && _equalsHelper(this.currency, decimalFormatProperties.currency) && _equalsHelper(this.currencyPluralInfo, decimalFormatProperties.currencyPluralInfo) && _equalsHelper(this.currencyUsage, decimalFormatProperties.currencyUsage) && _equalsHelper(this.decimalPatternMatchRequired, decimalFormatProperties.decimalPatternMatchRequired) && _equalsHelper(this.decimalSeparatorAlwaysShown, decimalFormatProperties.decimalSeparatorAlwaysShown) && _equalsHelper(this.exponentSignAlwaysShown, decimalFormatProperties.exponentSignAlwaysShown) && _equalsHelper(this.formatWidth, decimalFormatProperties.formatWidth) && _equalsHelper(this.groupingSize, decimalFormatProperties.groupingSize) && _equalsHelper(this.groupingUsed, decimalFormatProperties.groupingUsed) && _equalsHelper(this.magnitudeMultiplier, decimalFormatProperties.magnitudeMultiplier) && _equalsHelper(this.mathContext, decimalFormatProperties.mathContext) && _equalsHelper(this.maximumFractionDigits, decimalFormatProperties.maximumFractionDigits) && _equalsHelper(this.maximumIntegerDigits, decimalFormatProperties.maximumIntegerDigits) && _equalsHelper(this.maximumSignificantDigits, decimalFormatProperties.maximumSignificantDigits) && _equalsHelper(this.minimumExponentDigits, decimalFormatProperties.minimumExponentDigits) && _equalsHelper(this.minimumFractionDigits, decimalFormatProperties.minimumFractionDigits) && _equalsHelper(this.minimumGroupingDigits, decimalFormatProperties.minimumGroupingDigits) && _equalsHelper(this.minimumIntegerDigits, decimalFormatProperties.minimumIntegerDigits) && _equalsHelper(this.minimumSignificantDigits, decimalFormatProperties.minimumSignificantDigits) && _equalsHelper(this.multiplier, decimalFormatProperties.multiplier) && _equalsHelper(this.negativePrefix, decimalFormatProperties.negativePrefix) && _equalsHelper(this.negativePrefixPattern, decimalFormatProperties.negativePrefixPattern) && _equalsHelper(this.negativeSuffix, decimalFormatProperties.negativeSuffix) && _equalsHelper(this.negativeSuffixPattern, decimalFormatProperties.negativeSuffixPattern) && _equalsHelper(this.padPosition, decimalFormatProperties.padPosition) && _equalsHelper(this.padString, decimalFormatProperties.padString) && _equalsHelper(this.parseCaseSensitive, decimalFormatProperties.parseCaseSensitive) && _equalsHelper(this.parseIntegerOnly, decimalFormatProperties.parseIntegerOnly) && _equalsHelper(this.parseMode, decimalFormatProperties.parseMode) && _equalsHelper(this.parseNoExponent, decimalFormatProperties.parseNoExponent) && _equalsHelper(this.parseToBigDecimal, decimalFormatProperties.parseToBigDecimal) && _equalsHelper(this.pluralRules, decimalFormatProperties.pluralRules) && _equalsHelper(this.positivePrefix, decimalFormatProperties.positivePrefix) && _equalsHelper(this.positivePrefixPattern, decimalFormatProperties.positivePrefixPattern) && _equalsHelper(this.positiveSuffix, decimalFormatProperties.positiveSuffix) && _equalsHelper(this.positiveSuffixPattern, decimalFormatProperties.positiveSuffixPattern) && _equalsHelper(this.roundingIncrement, decimalFormatProperties.roundingIncrement) && _equalsHelper(this.roundingMode, decimalFormatProperties.roundingMode) && _equalsHelper(this.secondaryGroupingSize, decimalFormatProperties.secondaryGroupingSize) && _equalsHelper(this.signAlwaysShown, decimalFormatProperties.signAlwaysShown);
    }

    private boolean _equalsHelper(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        return obj.equals(obj2);
    }

    private int _hashCode() {
        int i_hashCodeHelper = _hashCodeHelper(this.compactCustomData);
        int i_hashCodeHelper2 = _hashCodeHelper(this.compactStyle);
        int i_hashCodeHelper3 = _hashCodeHelper(this.currency);
        int i_hashCodeHelper4 = _hashCodeHelper(this.currencyPluralInfo);
        int i_hashCodeHelper5 = _hashCodeHelper(this.currencyUsage);
        int i_hashCodeHelper6 = _hashCodeHelper(this.decimalPatternMatchRequired);
        int i_hashCodeHelper7 = _hashCodeHelper(this.decimalSeparatorAlwaysShown);
        int i_hashCodeHelper8 = _hashCodeHelper(this.exponentSignAlwaysShown);
        int i_hashCodeHelper9 = _hashCodeHelper(this.formatWidth);
        int i_hashCodeHelper10 = _hashCodeHelper(this.groupingSize);
        int i_hashCodeHelper11 = _hashCodeHelper(this.groupingUsed);
        int i_hashCodeHelper12 = _hashCodeHelper(this.magnitudeMultiplier);
        int i_hashCodeHelper13 = _hashCodeHelper(this.mathContext);
        int i_hashCodeHelper14 = _hashCodeHelper(this.maximumFractionDigits);
        int i_hashCodeHelper15 = _hashCodeHelper(this.maximumIntegerDigits);
        int i_hashCodeHelper16 = _hashCodeHelper(this.maximumSignificantDigits);
        int i_hashCodeHelper17 = _hashCodeHelper(this.minimumExponentDigits);
        int i_hashCodeHelper18 = _hashCodeHelper(this.minimumFractionDigits);
        int i_hashCodeHelper19 = _hashCodeHelper(this.minimumGroupingDigits);
        int i_hashCodeHelper20 = _hashCodeHelper(this.minimumIntegerDigits);
        int i_hashCodeHelper21 = _hashCodeHelper(this.minimumSignificantDigits);
        int i_hashCodeHelper22 = _hashCodeHelper(this.multiplier);
        int i_hashCodeHelper23 = _hashCodeHelper(this.negativePrefix);
        int i_hashCodeHelper24 = _hashCodeHelper(this.negativePrefixPattern);
        int i_hashCodeHelper25 = _hashCodeHelper(this.negativeSuffix);
        int i_hashCodeHelper26 = _hashCodeHelper(this.negativeSuffixPattern);
        int i_hashCodeHelper27 = _hashCodeHelper(this.padPosition);
        int i_hashCodeHelper28 = _hashCodeHelper(this.padString);
        int i_hashCodeHelper29 = _hashCodeHelper(this.parseCaseSensitive);
        int i_hashCodeHelper30 = _hashCodeHelper(this.parseIntegerOnly);
        int i_hashCodeHelper31 = _hashCodeHelper(this.parseMode);
        int i_hashCodeHelper32 = _hashCodeHelper(this.parseNoExponent);
        int i_hashCodeHelper33 = _hashCodeHelper(this.parseToBigDecimal);
        int i_hashCodeHelper34 = _hashCodeHelper(this.pluralRules);
        int i_hashCodeHelper35 = _hashCodeHelper(this.positivePrefix);
        int i_hashCodeHelper36 = _hashCodeHelper(this.positivePrefixPattern);
        int i_hashCodeHelper37 = _hashCodeHelper(this.positiveSuffix);
        int i_hashCodeHelper38 = _hashCodeHelper(this.positiveSuffixPattern);
        int i_hashCodeHelper39 = _hashCodeHelper(this.roundingIncrement);
        int i_hashCodeHelper40 = _hashCodeHelper(this.roundingMode);
        return ((((((((((((((((((((((((((((((((((((((((i_hashCodeHelper ^ i_hashCodeHelper2) ^ i_hashCodeHelper3) ^ i_hashCodeHelper4) ^ i_hashCodeHelper5) ^ i_hashCodeHelper6) ^ i_hashCodeHelper7) ^ i_hashCodeHelper8) ^ i_hashCodeHelper9) ^ i_hashCodeHelper10) ^ i_hashCodeHelper11) ^ i_hashCodeHelper12) ^ i_hashCodeHelper13) ^ i_hashCodeHelper14) ^ i_hashCodeHelper15) ^ i_hashCodeHelper16) ^ i_hashCodeHelper17) ^ i_hashCodeHelper18) ^ i_hashCodeHelper19) ^ i_hashCodeHelper20) ^ i_hashCodeHelper21) ^ i_hashCodeHelper22) ^ i_hashCodeHelper23) ^ i_hashCodeHelper24) ^ i_hashCodeHelper25) ^ i_hashCodeHelper26) ^ i_hashCodeHelper27) ^ i_hashCodeHelper28) ^ i_hashCodeHelper29) ^ i_hashCodeHelper30) ^ i_hashCodeHelper31) ^ i_hashCodeHelper32) ^ i_hashCodeHelper33) ^ i_hashCodeHelper34) ^ i_hashCodeHelper35) ^ i_hashCodeHelper36) ^ i_hashCodeHelper37) ^ i_hashCodeHelper38) ^ i_hashCodeHelper39) ^ i_hashCodeHelper40) ^ _hashCodeHelper(this.secondaryGroupingSize)) ^ _hashCodeHelper(this.signAlwaysShown);
    }

    private int _hashCodeHelper(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public DecimalFormatProperties clear() {
        return _clear();
    }

    /* JADX DEBUG: Method merged with bridge method: clone()Ljava/lang/Object; */
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public DecimalFormatProperties m6323clone() {
        try {
            return (DecimalFormatProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new UnsupportedOperationException(e);
        }
    }

    public DecimalFormatProperties copyFrom(DecimalFormatProperties decimalFormatProperties) {
        return _copyFrom(decimalFormatProperties);
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof DecimalFormatProperties) {
            return _equals((DecimalFormatProperties) obj);
        }
        return false;
    }

    public int hashCode() {
        return _hashCode();
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        readObjectImpl(objectInputStream);
    }

    public void readObjectImpl(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        clear();
        objectInputStream.readInt();
        int i = objectInputStream.readInt();
        for (int i2 = 0; i2 < i; i2++) {
            String str = (String) objectInputStream.readObject();
            try {
            } catch (NoSuchFieldException unused) {
            } catch (SecurityException e) {
                throw new AssertionError(e);
            }
            try {
                DecimalFormatProperties.class.getDeclaredField(str).set(this, objectInputStream.readObject());
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            } catch (IllegalArgumentException e3) {
                throw new AssertionError(e3);
            }
        }
    }

    public DecimalFormatProperties setCurrencyPluralInfo(CurrencyPluralInfo currencyPluralInfo) {
        if (currencyPluralInfo != null) {
            currencyPluralInfo = (CurrencyPluralInfo) currencyPluralInfo.clone();
        }
        this.currencyPluralInfo = currencyPluralInfo;
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("<Properties");
        toStringBare(sb);
        sb.append(">");
        return sb.toString();
    }

    public void toStringBare(StringBuilder sb) {
        for (Field field : DecimalFormatProperties.class.getDeclaredFields()) {
            try {
                Object obj = field.get(this);
                Object obj2 = field.get(DEFAULT);
                if (obj != null || obj2 != null) {
                    if (obj == null || obj2 == null) {
                        sb.append(" " + field.getName() + ":" + obj);
                    } else if (!obj.equals(obj2)) {
                        sb.append(" " + field.getName() + ":" + obj);
                    }
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (IllegalArgumentException e2) {
                e2.printStackTrace();
            }
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        writeObjectImpl(objectOutputStream);
    }

    public void writeObjectImpl(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(0);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Field field : DecimalFormatProperties.class.getDeclaredFields()) {
            if (!java.lang.reflect.Modifier.isStatic(field.getModifiers())) {
                try {
                    Object obj = field.get(this);
                    if (obj != null && !obj.equals(field.get(DEFAULT))) {
                        arrayList.add(field);
                        arrayList2.add(obj);
                    }
                } catch (IllegalAccessException e) {
                    throw new AssertionError(e);
                } catch (IllegalArgumentException e2) {
                    throw new AssertionError(e2);
                }
            }
        }
        int size = arrayList.size();
        objectOutputStream.writeInt(size);
        for (int i = 0; i < size; i++) {
            Field field2 = (Field) arrayList.get(i);
            Object obj2 = arrayList2.get(i);
            objectOutputStream.writeObject(field2.getName());
            objectOutputStream.writeObject(obj2);
        }
    }
}
