package com.ibm.icu.text;

import com.ibm.icu.impl.number.DecimalFormatProperties;
import com.ibm.icu.util.ULocale;
import java.text.ParsePosition;
import java.util.Locale;
import o.C7252agN;

/* JADX INFO: loaded from: classes3.dex */
public class CompactDecimalFormat extends DecimalFormat {
    private static final long serialVersionUID = 4716293295276629682L;

    public enum CompactStyle {
        SHORT,
        LONG
    }

    public static CompactDecimalFormat getInstance(ULocale uLocale, CompactStyle compactStyle) {
        return new CompactDecimalFormat(uLocale, compactStyle);
    }

    public static CompactDecimalFormat getInstance(Locale locale, CompactStyle compactStyle) {
        return new CompactDecimalFormat(ULocale.forLocale(locale), compactStyle);
    }

    public CompactDecimalFormat(ULocale uLocale, CompactStyle compactStyle) {
        this.symbols = DecimalFormatSymbols.getInstance(uLocale);
        DecimalFormatProperties decimalFormatProperties = new DecimalFormatProperties();
        this.properties = decimalFormatProperties;
        decimalFormatProperties.setCompactStyle(compactStyle);
        this.properties.setGroupingSize(-2);
        this.properties.setMinimumGroupingDigits(2);
        this.exportedProperties = new DecimalFormatProperties();
        refreshFormatter();
    }

    @Override // com.ibm.icu.text.DecimalFormat, com.ibm.icu.text.NumberFormat
    public Number parse(String str, ParsePosition parsePosition) {
        throw new UnsupportedOperationException();
    }

    @Override // com.ibm.icu.text.DecimalFormat, com.ibm.icu.text.NumberFormat
    public C7252agN parseCurrency(CharSequence charSequence, ParsePosition parsePosition) {
        throw new UnsupportedOperationException();
    }
}
