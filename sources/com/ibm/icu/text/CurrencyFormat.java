package com.ibm.icu.text;

import com.ibm.icu.text.MeasureFormat;
import com.ibm.icu.util.ULocale;
import java.io.ObjectStreamException;
import java.text.FieldPosition;
import java.text.ParsePosition;
import o.C7252agN;

/* JADX INFO: loaded from: classes22.dex */
class CurrencyFormat extends MeasureFormat {
    static final long serialVersionUID = -931679363692504634L;

    public CurrencyFormat(ULocale uLocale) {
        super(uLocale, MeasureFormat.FormatWidth.DEFAULT_CURRENCY);
    }

    @Override // com.ibm.icu.text.MeasureFormat, java.text.Format
    public StringBuffer format(Object obj, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        if (!(obj instanceof C7252agN)) {
            throw new IllegalArgumentException("Invalid type: " + obj.getClass().getName());
        }
        return super.format(obj, stringBuffer, fieldPosition);
    }

    /* JADX DEBUG: Method merged with bridge method: parseObject(Ljava/lang/String;Ljava/text/ParsePosition;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: parseObject(Ljava/lang/String;Ljava/text/ParsePosition;)Lo/agP; */
    @Override // com.ibm.icu.text.MeasureFormat, java.text.Format
    public C7252agN parseObject(String str, ParsePosition parsePosition) {
        return getNumberFormatInternal().parseCurrency(str, parsePosition);
    }

    private Object writeReplace() throws ObjectStreamException {
        return toCurrencyProxy();
    }

    private Object readResolve() throws ObjectStreamException {
        return new CurrencyFormat(getLocale(ULocale.ACTUAL_LOCALE));
    }
}
