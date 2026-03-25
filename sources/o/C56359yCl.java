package o;

import java.text.DecimalFormatSymbols;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: renamed from: o.yCl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56359yCl {
    public static final C56359yCl KWHzl = new C56359yCl('0', '+', '-', '.');
    private static final ConcurrentMap copydefault = new ConcurrentHashMap(16, 0.75f, 2);
    private final char AEQbTJ;
    private final char EZpvd;
    private final char OLrzqt;
    private final char gEmmrt;

    public java.lang.String toString() {
        return "DecimalStyle[" + this.gEmmrt + this.OLrzqt + this.AEQbTJ + this.EZpvd + "]";
    }

    public int hashCode() {
        return this.gEmmrt + this.OLrzqt + this.AEQbTJ + this.EZpvd;
    }

    public char EZpvd() {
        return this.gEmmrt;
    }

    public char copydefault() {
        return this.OLrzqt;
    }

    public char OLrzqt() {
        return this.AEQbTJ;
    }

    public char KWHzl() {
        return this.EZpvd;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C56359yCl)) {
            return false;
        }
        C56359yCl c56359yCl = (C56359yCl) obj;
        return this.gEmmrt == c56359yCl.gEmmrt && this.OLrzqt == c56359yCl.OLrzqt && this.AEQbTJ == c56359yCl.AEQbTJ && this.EZpvd == c56359yCl.EZpvd;
    }

    public int KWHzl(char c) {
        int i = c - this.gEmmrt;
        if (i < 0 || i > 9) {
            return -1;
        }
        return i;
    }

    public java.lang.String OLrzqt(java.lang.String str) {
        char c = this.gEmmrt;
        if (c == '0') {
            return str;
        }
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = (char) (charArray[i] + (c - '0'));
        }
        return new java.lang.String(charArray);
    }

    public static C56359yCl EZpvd(java.util.Locale locale) {
        Objects.requireNonNull(locale, "locale");
        ConcurrentMap concurrentMap = copydefault;
        C56359yCl c56359yCl = (C56359yCl) concurrentMap.get(locale);
        if (c56359yCl != null) {
            return c56359yCl;
        }
        concurrentMap.putIfAbsent(locale, copydefault(locale));
        return (C56359yCl) concurrentMap.get(locale);
    }

    private static C56359yCl copydefault(java.util.Locale locale) {
        DecimalFormatSymbols decimalFormatSymbols = DecimalFormatSymbols.getInstance(locale);
        char zeroDigit = decimalFormatSymbols.getZeroDigit();
        char minusSign = decimalFormatSymbols.getMinusSign();
        char decimalSeparator = decimalFormatSymbols.getDecimalSeparator();
        return (zeroDigit == '0' && minusSign == '-' && decimalSeparator == '.') ? KWHzl : new C56359yCl(zeroDigit, '+', minusSign, decimalSeparator);
    }

    private C56359yCl(char c, char c2, char c3, char c4) {
        this.gEmmrt = c;
        this.OLrzqt = c2;
        this.AEQbTJ = c3;
        this.EZpvd = c4;
    }
}
