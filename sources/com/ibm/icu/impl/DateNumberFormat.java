package com.ibm.icu.impl;

import com.ibm.icu.text.NumberFormat;
import com.ibm.icu.util.ULocale;
import com.ibm.icu.util.UResourceBundle;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.util.Arrays;
import java.util.MissingResourceException;
import o.C7027acA;
import o.C7223afl;

/* JADX INFO: loaded from: classes3.dex */
public final class DateNumberFormat extends NumberFormat {
    private static C7027acA<ULocale, char[]> CACHE = new C7027acA<>();
    private static final int DECIMAL_BUF_SIZE = 20;
    private static final long PARSE_THRESHOLD = 922337203685477579L;
    private static final long serialVersionUID = -6315692826916346953L;
    private transient char[] decimalBuf;
    private char[] digits;
    private int maxIntDigits;
    private int minIntDigits;
    private char minusSign;
    private boolean positiveOnly;
    private char zeroDigit;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.ibm.icu.text.NumberFormat
    public int getMaximumIntegerDigits() {
        return this.maxIntDigits;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.ibm.icu.text.NumberFormat
    public int getMinimumIntegerDigits() {
        return this.minIntDigits;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public char getZeroDigit() {
        return this.zeroDigit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.ibm.icu.text.NumberFormat
    public void setMaximumIntegerDigits(int i) {
        this.maxIntDigits = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.ibm.icu.text.NumberFormat
    public void setMinimumIntegerDigits(int i) {
        this.minIntDigits = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setParsePositiveOnly(boolean z) {
        this.positiveOnly = z;
    }

    public DateNumberFormat(ULocale uLocale, String str, String str2) {
        this.positiveOnly = false;
        this.decimalBuf = new char[20];
        if (str.length() > 10) {
            throw new UnsupportedOperationException("DateNumberFormat does not support digits out of BMP.");
        }
        initialize(uLocale, str, str2);
    }

    public DateNumberFormat(ULocale uLocale, char c, String str) {
        this.positiveOnly = false;
        this.decimalBuf = new char[20];
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < 10; i++) {
            stringBuffer.append((char) (c + i));
        }
        initialize(uLocale, stringBuffer.toString(), str);
    }

    private void initialize(ULocale uLocale, String str, String str2) {
        String strDjBIcL;
        char[] cArrEZpvd = CACHE.EZpvd(uLocale);
        if (cArrEZpvd == null) {
            ICUResourceBundle iCUResourceBundle = (ICUResourceBundle) UResourceBundle.KWHzl("com/ibm/icu/impl/data/icudt68b", uLocale);
            try {
                strDjBIcL = iCUResourceBundle.djBIcL("NumberElements/" + str2 + "/symbols/minusSign");
            } catch (MissingResourceException unused) {
                if (str2.equals("latn")) {
                    strDjBIcL = "-";
                } else {
                    try {
                        strDjBIcL = iCUResourceBundle.djBIcL("NumberElements/latn/symbols/minusSign");
                    } catch (MissingResourceException unused2) {
                        strDjBIcL = "-";
                    }
                }
                char[] cArr = new char[10];
                this.digits = cArr;
                System.arraycopy(cArrEZpvd, 0, cArr, 0, 10);
                this.zeroDigit = this.digits[0];
                this.minusSign = cArrEZpvd[10];
            }
            cArrEZpvd = new char[11];
            for (int i = 0; i < 10; i++) {
                cArrEZpvd[i] = str.charAt(i);
            }
            cArrEZpvd[10] = strDjBIcL.charAt(0);
            CACHE.KWHzl(uLocale, cArrEZpvd);
        }
        char[] cArr2 = new char[10];
        this.digits = cArr2;
        System.arraycopy(cArrEZpvd, 0, cArr2, 0, 10);
        this.zeroDigit = this.digits[0];
        this.minusSign = cArrEZpvd[10];
    }

    public void setZeroDigit(char c) {
        this.zeroDigit = c;
        if (this.digits == null) {
            this.digits = new char[10];
        }
        this.digits[0] = c;
        for (int i = 1; i < 10; i++) {
            this.digits[i] = (char) (c + i);
        }
    }

    public char[] getDigits() {
        return (char[]) this.digits.clone();
    }

    @Override // com.ibm.icu.text.NumberFormat
    public StringBuffer format(double d, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        throw new UnsupportedOperationException("StringBuffer format(double, StringBuffer, FieldPostion) is not implemented");
    }

    @Override // com.ibm.icu.text.NumberFormat
    public StringBuffer format(long j, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        if (j < 0) {
            stringBuffer.append(this.minusSign);
            j = -j;
        }
        int i = (int) j;
        char[] cArr = this.decimalBuf;
        int length = cArr.length;
        int length2 = this.maxIntDigits;
        if (length < length2) {
            length2 = cArr.length;
        }
        int i2 = length2 - 1;
        while (true) {
            this.decimalBuf[i2] = this.digits[i % 10];
            i /= 10;
            if (i2 == 0 || i == 0) {
                break;
            }
            i2--;
        }
        for (int i3 = this.minIntDigits - (length2 - i2); i3 > 0; i3--) {
            i2--;
            this.decimalBuf[i2] = this.digits[0];
        }
        int i4 = length2 - i2;
        stringBuffer.append(this.decimalBuf, i2, i4);
        fieldPosition.setBeginIndex(0);
        if (fieldPosition.getField() == 0) {
            fieldPosition.setEndIndex(i4);
        } else {
            fieldPosition.setEndIndex(0);
        }
        return stringBuffer;
    }

    @Override // com.ibm.icu.text.NumberFormat
    public StringBuffer format(BigInteger bigInteger, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        throw new UnsupportedOperationException("StringBuffer format(BigInteger, StringBuffer, FieldPostion) is not implemented");
    }

    @Override // com.ibm.icu.text.NumberFormat
    public StringBuffer format(BigDecimal bigDecimal, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        throw new UnsupportedOperationException("StringBuffer format(BigDecimal, StringBuffer, FieldPostion) is not implemented");
    }

    @Override // com.ibm.icu.text.NumberFormat
    public StringBuffer format(com.ibm.icu.math.BigDecimal bigDecimal, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        throw new UnsupportedOperationException("StringBuffer format(BigDecimal, StringBuffer, FieldPostion) is not implemented");
    }

    @Override // com.ibm.icu.text.NumberFormat
    public Number parse(String str, ParsePosition parsePosition) {
        int i;
        int index = parsePosition.getIndex();
        long j = 0;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        while (true) {
            i = index + i2;
            if (i >= str.length()) {
                break;
            }
            char cCharAt = str.charAt(i);
            if (i2 != 0 || cCharAt != this.minusSign) {
                int iOLrzqt = cCharAt - this.digits[0];
                if (iOLrzqt < 0 || 9 < iOLrzqt) {
                    iOLrzqt = C7223afl.OLrzqt(cCharAt);
                }
                if (iOLrzqt < 0 || 9 < iOLrzqt) {
                    iOLrzqt = 0;
                    while (iOLrzqt < 10 && cCharAt != this.digits[iOLrzqt]) {
                        iOLrzqt++;
                    }
                }
                if (iOLrzqt < 0 || iOLrzqt > 9 || j >= PARSE_THRESHOLD) {
                    break;
                }
                j = (j * 10) + ((long) iOLrzqt);
                z = true;
                i2++;
            } else {
                if (this.positiveOnly) {
                    break;
                }
                z2 = true;
                i2++;
            }
        }
        if (!z) {
            return null;
        }
        if (z2) {
            j *= -1;
        }
        Long lValueOf = Long.valueOf(j);
        parsePosition.setIndex(i);
        return lValueOf;
    }

    @Override // com.ibm.icu.text.NumberFormat
    public boolean equals(Object obj) {
        if (obj != null && super.equals(obj) && (obj instanceof DateNumberFormat)) {
            DateNumberFormat dateNumberFormat = (DateNumberFormat) obj;
            if (this.maxIntDigits == dateNumberFormat.maxIntDigits && this.minIntDigits == dateNumberFormat.minIntDigits && this.minusSign == dateNumberFormat.minusSign && this.positiveOnly == dateNumberFormat.positiveOnly && Arrays.equals(this.digits, dateNumberFormat.digits)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ibm.icu.text.NumberFormat
    public int hashCode() {
        return super.hashCode();
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        if (this.digits == null) {
            setZeroDigit(this.zeroDigit);
        }
        this.decimalBuf = new char[20];
    }

    @Override // com.ibm.icu.text.NumberFormat, java.text.Format
    public Object clone() {
        DateNumberFormat dateNumberFormat = (DateNumberFormat) super.clone();
        dateNumberFormat.digits = (char[]) this.digits.clone();
        dateNumberFormat.decimalBuf = new char[20];
        return dateNumberFormat;
    }
}
