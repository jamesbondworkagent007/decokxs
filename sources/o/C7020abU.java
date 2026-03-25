package o;

import com.ibm.icu.text.NumberFormat;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: o.abU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7020abU implements java.lang.CharSequence, java.lang.Appendable {
    public static final java.util.Map<java.lang.Object, java.lang.Character> AEQbTJ;
    public static final C7020abU OLrzqt = new C7020abU();
    public java.lang.Object[] AYXKKw;
    public int AhwBna;
    public java.lang.Object EZpvd;
    public int KWHzl;
    public char[] copydefault;
    public int gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OLrzqt(java.lang.Object obj) {
        this.EZpvd = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(int i) {
        this.KWHzl = this.AhwBna - i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.lang.CharSequence
    public int length() {
        return this.AhwBna;
    }

    static {
        java.util.HashMap map = new java.util.HashMap();
        AEQbTJ = map;
        map.put(NumberFormat.Field.SIGN, '-');
        map.put(NumberFormat.Field.INTEGER, 'i');
        map.put(NumberFormat.Field.FRACTION, 'f');
        map.put(NumberFormat.Field.EXPONENT, 'e');
        map.put(NumberFormat.Field.EXPONENT_SIGN, '+');
        map.put(NumberFormat.Field.EXPONENT_SYMBOL, 'E');
        map.put(NumberFormat.Field.DECIMAL_SEPARATOR, '.');
        map.put(NumberFormat.Field.GROUPING_SEPARATOR, java.lang.Character.valueOf(AbstractJsonLexerKt.COMMA));
        map.put(NumberFormat.Field.PERCENT, '%');
        map.put(NumberFormat.Field.PERMILLE, (char) 8240);
        map.put(NumberFormat.Field.CURRENCY, '$');
        map.put(NumberFormat.Field.MEASURE_UNIT, 'u');
        map.put(NumberFormat.Field.COMPACT, 'C');
    }

    public C7020abU() {
        this(40);
    }

    public C7020abU(int i) {
        this.KWHzl = 0;
        this.EZpvd = null;
        this.copydefault = new char[i];
        this.AYXKKw = new java.lang.Object[i];
        this.gEmmrt = i / 2;
        this.AhwBna = 0;
    }

    public C7020abU(C7020abU c7020abU) {
        this.KWHzl = 0;
        this.EZpvd = null;
        AEQbTJ(c7020abU);
    }

    public void AEQbTJ(C7020abU c7020abU) {
        char[] cArr = c7020abU.copydefault;
        this.copydefault = java.util.Arrays.copyOf(cArr, cArr.length);
        java.lang.Object[] objArr = c7020abU.AYXKKw;
        this.AYXKKw = java.util.Arrays.copyOf(objArr, objArr.length);
        this.gEmmrt = c7020abU.gEmmrt;
        this.AhwBna = c7020abU.AhwBna;
    }

    public int AEQbTJ() {
        return java.lang.Character.codePointCount(this, 0, length());
    }

    @Override // java.lang.CharSequence
    public char charAt(int i) {
        return this.copydefault[this.gEmmrt + i];
    }

    public java.lang.Object EZpvd(int i) {
        return this.AYXKKw[this.gEmmrt + i];
    }

    public int KWHzl() {
        int i = this.AhwBna;
        if (i == 0) {
            return -1;
        }
        char[] cArr = this.copydefault;
        int i2 = this.gEmmrt;
        return java.lang.Character.codePointAt(cArr, i2, i + i2);
    }

    public int copydefault() {
        int i = this.AhwBna;
        if (i == 0) {
            return -1;
        }
        char[] cArr = this.copydefault;
        int i2 = this.gEmmrt;
        return java.lang.Character.codePointBefore(cArr, i + i2, i2);
    }

    public int OLrzqt(int i) {
        char[] cArr = this.copydefault;
        int i2 = this.gEmmrt;
        return java.lang.Character.codePointAt(cArr, i + i2, i2 + this.AhwBna);
    }

    public int KWHzl(int i) {
        char[] cArr = this.copydefault;
        int i2 = this.gEmmrt;
        return java.lang.Character.codePointBefore(cArr, i + i2, i2);
    }

    public C7020abU EZpvd() {
        this.gEmmrt = OLrzqt() / 2;
        this.AhwBna = 0;
        return this;
    }

    public int AEQbTJ(char c, java.lang.Object obj) {
        return AEQbTJ(this.AhwBna - this.KWHzl, c, obj);
    }

    public int AEQbTJ(int i, char c, java.lang.Object obj) {
        int iKWHzl = KWHzl(i, 1);
        this.copydefault[iKWHzl] = c;
        this.AYXKKw[iKWHzl] = obj;
        return 1;
    }

    public int AEQbTJ(int i, int i2, java.lang.Object obj) {
        int iCharCount = java.lang.Character.charCount(i2);
        int iKWHzl = KWHzl(i, iCharCount);
        java.lang.Character.toChars(i2, this.copydefault, iKWHzl);
        java.lang.Object[] objArr = this.AYXKKw;
        objArr[iKWHzl] = obj;
        if (iCharCount == 2) {
            objArr[iKWHzl + 1] = obj;
        }
        return iCharCount;
    }

    public int OLrzqt(java.lang.CharSequence charSequence, java.lang.Object obj) {
        return copydefault(this.AhwBna - this.KWHzl, charSequence, obj);
    }

    public int copydefault(int i, java.lang.CharSequence charSequence, java.lang.Object obj) {
        if (charSequence.length() == 0) {
            return 0;
        }
        if (charSequence.length() == 1) {
            return AEQbTJ(i, (int) charSequence.charAt(0), obj);
        }
        return EZpvd(i, charSequence, 0, charSequence.length(), obj);
    }

    public int EZpvd(int i, java.lang.CharSequence charSequence, int i2, int i3, java.lang.Object obj) {
        int i4 = i3 - i2;
        int iKWHzl = KWHzl(i, i4);
        for (int i5 = 0; i5 < i4; i5++) {
            int i6 = iKWHzl + i5;
            this.copydefault[i6] = charSequence.charAt(i2 + i5);
            this.AYXKKw[i6] = obj;
        }
        return i4;
    }

    public int copydefault(int i, int i2, java.lang.CharSequence charSequence, int i3, int i4, java.lang.Object obj) {
        int iEZpvd;
        int i5 = i4 - i3;
        int i6 = i5 - (i2 - i);
        if (i6 > 0) {
            iEZpvd = KWHzl(i, i6);
        } else {
            iEZpvd = EZpvd(i, -i6);
        }
        for (int i7 = 0; i7 < i5; i7++) {
            int i8 = iEZpvd + i7;
            this.copydefault[i8] = charSequence.charAt(i3 + i7);
            this.AYXKKw[i8] = obj;
        }
        return i6;
    }

    public int copydefault(int i, char[] cArr, java.lang.Object[] objArr) {
        int length = cArr.length;
        if (length == 0) {
            return 0;
        }
        int iKWHzl = KWHzl(i, length);
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = iKWHzl + i2;
            this.copydefault[i3] = cArr[i2];
            this.AYXKKw[i3] = objArr == null ? null : objArr[i2];
        }
        return length;
    }

    public final int KWHzl(int i, int i2) {
        int i3;
        if (i == -1) {
            i = this.AhwBna;
        }
        if (i == 0 && (i3 = this.gEmmrt - i2) >= 0) {
            this.gEmmrt = i3;
            this.AhwBna += i2;
            return i3;
        }
        int i4 = this.AhwBna;
        if (i != i4 || this.gEmmrt + i4 + i2 >= OLrzqt()) {
            return copydefault(i, i2);
        }
        int i5 = this.AhwBna + i2;
        this.AhwBna = i5;
        return (this.gEmmrt + i5) - i2;
    }

    public final int copydefault(int i, int i2) {
        int iOLrzqt = OLrzqt();
        int i3 = this.gEmmrt;
        char[] cArr = this.copydefault;
        java.lang.Object[] objArr = this.AYXKKw;
        int i4 = this.AhwBna;
        int i5 = i4 + i2;
        if (i5 > iOLrzqt) {
            int i6 = i5 * 2;
            int i7 = (i6 / 2) - (i5 / 2);
            char[] cArr2 = new char[i6];
            java.lang.Object[] objArr2 = new java.lang.Object[i6];
            java.lang.System.arraycopy(cArr, i3, cArr2, i7, i);
            int i8 = i3 + i;
            int i9 = i7 + i + i2;
            java.lang.System.arraycopy(cArr, i8, cArr2, i9, this.AhwBna - i);
            java.lang.System.arraycopy(objArr, i3, objArr2, i7, i);
            java.lang.System.arraycopy(objArr, i8, objArr2, i9, this.AhwBna - i);
            this.copydefault = cArr2;
            this.AYXKKw = objArr2;
            this.gEmmrt = i7;
            this.AhwBna += i2;
        } else {
            int i10 = (iOLrzqt / 2) - (i5 / 2);
            java.lang.System.arraycopy(cArr, i3, cArr, i10, i4);
            int i11 = i10 + i;
            int i12 = i11 + i2;
            java.lang.System.arraycopy(cArr, i11, cArr, i12, this.AhwBna - i);
            java.lang.System.arraycopy(objArr, i3, objArr, i10, this.AhwBna);
            java.lang.System.arraycopy(objArr, i11, objArr, i12, this.AhwBna - i);
            this.gEmmrt = i10;
            this.AhwBna += i2;
        }
        return this.gEmmrt + i;
    }

    public final int EZpvd(int i, int i2) {
        int i3 = this.gEmmrt + i;
        char[] cArr = this.copydefault;
        int i4 = i3 + i2;
        java.lang.System.arraycopy(cArr, i4, cArr, i3, (this.AhwBna - i) - i2);
        java.lang.Object[] objArr = this.AYXKKw;
        java.lang.System.arraycopy(objArr, i4, objArr, i3, (this.AhwBna - i) - i2);
        this.AhwBna -= i2;
        return i3;
    }

    public final int OLrzqt() {
        return this.copydefault.length;
    }

    @Override // java.lang.CharSequence
    @java.lang.Deprecated
    public java.lang.CharSequence subSequence(int i, int i2) {
        C7020abU c7020abU = new C7020abU(this);
        c7020abU.gEmmrt = this.gEmmrt + i;
        c7020abU.AhwBna = i2 - i;
        return c7020abU;
    }

    public java.lang.String OLrzqt(int i, int i2) {
        if (i < 0 || i2 > this.AhwBna || i2 < i) {
            throw new java.lang.IndexOutOfBoundsException();
        }
        return new java.lang.String(this.copydefault, this.gEmmrt + i, i2 - i);
    }

    @Override // java.lang.CharSequence
    public java.lang.String toString() {
        return new java.lang.String(this.copydefault, this.gEmmrt, this.AhwBna);
    }

    public char[] AYXKKw() {
        char[] cArr = this.copydefault;
        int i = this.gEmmrt;
        return java.util.Arrays.copyOfRange(cArr, i, this.AhwBna + i);
    }

    public java.lang.Object[] gEmmrt() {
        java.lang.Object[] objArr = this.AYXKKw;
        int i = this.gEmmrt;
        return java.util.Arrays.copyOfRange(objArr, i, this.AhwBna + i);
    }

    @Override // java.lang.Appendable
    public java.lang.Appendable append(java.lang.CharSequence charSequence) {
        copydefault(this.AhwBna - this.KWHzl, charSequence, this.EZpvd);
        return this;
    }

    @Override // java.lang.Appendable
    public java.lang.Appendable append(java.lang.CharSequence charSequence, int i, int i2) {
        EZpvd(this.AhwBna - this.KWHzl, charSequence, i, i2, this.EZpvd);
        return this;
    }

    @Override // java.lang.Appendable
    public java.lang.Appendable append(char c) {
        AEQbTJ(this.AhwBna - this.KWHzl, c, this.EZpvd);
        return this;
    }

    public int hashCode() {
        throw new java.lang.UnsupportedOperationException("Don't call #hashCode() or #equals() on a mutable.");
    }

    public boolean equals(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Don't call #hashCode() or #equals() on a mutable.");
    }
}
