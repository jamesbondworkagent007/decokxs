package com.fasterxml.jackson.databind.util;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.FieldPosition;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;
import o.C5618Yq;

/* JADX INFO: loaded from: classes21.dex */
@Deprecated
public class ISO8601DateFormat extends DateFormat {
    private static final long serialVersionUID = 1;

    @Override // java.text.DateFormat, java.text.Format
    public Object clone() {
        return this;
    }

    public ISO8601DateFormat() {
        ((DateFormat) this).numberFormat = new DecimalFormat();
        ((DateFormat) this).calendar = new GregorianCalendar();
    }

    @Override // java.text.DateFormat
    public StringBuffer format(Date date, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        stringBuffer.append(C5618Yq.AEQbTJ(date));
        return stringBuffer;
    }

    @Override // java.text.DateFormat
    public Date parse(String str, ParsePosition parsePosition) {
        try {
            return C5618Yq.OLrzqt(str, parsePosition);
        } catch (ParseException unused) {
            return null;
        }
    }

    @Override // java.text.DateFormat
    public Date parse(String str) throws ParseException {
        return C5618Yq.OLrzqt(str, new ParsePosition(0));
    }
}
