package o;

import com.ibm.icu.impl.StaticUnicodeSets;
import com.ibm.icu.text.DecimalFormatSymbols;
import com.ibm.icu.text.UnicodeSet;

/* JADX INFO: renamed from: o.aeD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7136aeD implements InterfaceC7141aeI {
    public final UnicodeSet AEQbTJ;
    public final UnicodeSet AYXKKw;
    public final UnicodeSet AhwBna;
    public final UnicodeSet AkhnZx;
    public final int EZpvd;
    public final int KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.String[] copydefault;
    public final boolean djBIcL;
    public final java.lang.String gEmmrt;
    public final boolean valueOf;
    public final boolean values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ(int i, int i2, boolean z) {
        if (!this.values) {
            return (i == 1 && i2 == 1) ? false : true;
        }
        if (i == -1) {
            return true;
        }
        if (i == 0) {
            if (z) {
                return true;
            }
            return i2 != 0 && i2 <= this.KWHzl;
        }
        if (i == 1) {
            return z ? i2 == this.EZpvd : i2 == this.KWHzl;
        }
        return true;
    }

    @Override // o.InterfaceC7141aeI
    public void KWHzl(C7145aeM c7145aeM) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "<DecimalMatcher>";
    }

    public static C7136aeD OLrzqt(DecimalFormatSymbols decimalFormatSymbols, C7166aeh c7166aeh, int i) {
        return new C7136aeD(decimalFormatSymbols, c7166aeh, i);
    }

    public C7136aeD(DecimalFormatSymbols decimalFormatSymbols, C7166aeh c7166aeh, int i) {
        if ((i & 2) != 0) {
            this.gEmmrt = decimalFormatSymbols.getMonetaryGroupingSeparatorString();
            this.OLrzqt = decimalFormatSymbols.getMonetaryDecimalSeparatorString();
        } else {
            this.gEmmrt = decimalFormatSymbols.getGroupingSeparatorString();
            this.OLrzqt = decimalFormatSymbols.getDecimalSeparatorString();
        }
        boolean z = (i & 4) != 0;
        StaticUnicodeSets.Key key = z ? StaticUnicodeSets.Key.STRICT_ALL_SEPARATORS : StaticUnicodeSets.Key.ALL_SEPARATORS;
        UnicodeSet unicodeSetEZpvd = StaticUnicodeSets.EZpvd(key);
        this.AYXKKw = unicodeSetEZpvd;
        StaticUnicodeSets.Key keyAEQbTJ = StaticUnicodeSets.AEQbTJ(this.OLrzqt, z ? StaticUnicodeSets.Key.STRICT_COMMA : StaticUnicodeSets.Key.COMMA, z ? StaticUnicodeSets.Key.STRICT_PERIOD : StaticUnicodeSets.Key.PERIOD);
        if (keyAEQbTJ != null) {
            this.AEQbTJ = StaticUnicodeSets.EZpvd(keyAEQbTJ);
        } else if (!this.OLrzqt.isEmpty()) {
            this.AEQbTJ = new UnicodeSet().KWHzl(this.OLrzqt.codePointAt(0)).AYXKKw();
        } else {
            this.AEQbTJ = UnicodeSet.OLrzqt;
        }
        if (key == null || keyAEQbTJ == null) {
            this.AkhnZx = new UnicodeSet().OLrzqt(unicodeSetEZpvd).OLrzqt(this.AEQbTJ).AYXKKw();
            this.AhwBna = null;
        } else {
            this.AkhnZx = unicodeSetEZpvd;
            this.AhwBna = StaticUnicodeSets.EZpvd(z ? StaticUnicodeSets.Key.DIGITS_OR_ALL_SEPARATORS : StaticUnicodeSets.Key.DIGITS_OR_STRICT_ALL_SEPARATORS);
        }
        int codePointZero = decimalFormatSymbols.getCodePointZero();
        if (codePointZero != -1 && C7223afl.gEmmrt(codePointZero) && C7223afl.OLrzqt(codePointZero) == 0) {
            this.copydefault = null;
        } else {
            this.copydefault = decimalFormatSymbols.getDigitStringsLocal();
        }
        this.values = (i & 8) != 0;
        this.valueOf = (i & 32) != 0;
        this.djBIcL = (i & 16) != 0;
        this.EZpvd = c7166aeh.AEQbTJ();
        this.KWHzl = c7166aeh.EZpvd();
    }

    @Override // o.InterfaceC7141aeI
    public boolean AEQbTJ(C7031acE c7031acE, C7145aeM c7145aeM) {
        return KWHzl(c7031acE, c7145aeM, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0171 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01b2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x01b0 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0137  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean KWHzl(C7031acE c7031acE, C7145aeM c7145aeM, int i) {
        boolean z;
        int i2;
        int i3;
        int i4;
        boolean z2;
        boolean z3;
        boolean z4;
        int i5;
        C7145aeM c7145aeM2;
        boolean z5;
        int i6;
        byte bOLrzqt;
        byte b;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean zAEQbTJ;
        if (c7145aeM.copydefault() && i == 0) {
            return false;
        }
        int iAEQbTJ = c7031acE.AEQbTJ();
        byte b2 = -1;
        boolean z13 = false;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        java.lang.String strAkhnZx = null;
        C7167aei c7167aei = null;
        java.lang.String strAkhnZx2 = null;
        while (c7031acE.length() > 0) {
            int iCopydefault = c7031acE.copydefault();
            if (C7223afl.gEmmrt(iCopydefault)) {
                c7031acE.EZpvd(java.lang.Character.charCount(iCopydefault));
                bOLrzqt = (byte) C7223afl.OLrzqt(iCopydefault);
            } else {
                bOLrzqt = b2;
            }
            if (bOLrzqt == b2 && this.copydefault != null) {
                byte b3 = bOLrzqt;
                int i14 = 0;
                z6 = false;
                while (true) {
                    java.lang.String[] strArr = this.copydefault;
                    if (i14 >= strArr.length) {
                        b = b3;
                        break;
                    }
                    java.lang.String str = strArr[i14];
                    if (!str.isEmpty()) {
                        int iEZpvd = c7031acE.EZpvd(str);
                        if (iEZpvd == str.length()) {
                            c7031acE.EZpvd(iEZpvd);
                            b = (byte) i14;
                            break;
                        }
                        z6 = z6 || iEZpvd == c7031acE.length();
                    }
                    i14++;
                }
            } else {
                b = bOLrzqt;
                z6 = false;
            }
            if (b >= 0) {
                if (c7167aei == null) {
                    c7167aei = new C7167aei();
                }
                c7167aei.EZpvd(b, 0, true);
                i7++;
                if (strAkhnZx != null) {
                    i8++;
                }
                z13 = z6;
                b2 = -1;
            } else {
                if (strAkhnZx != null || this.OLrzqt.isEmpty()) {
                    z7 = z6;
                    z8 = false;
                    if (strAkhnZx2 != null) {
                        int iEZpvd2 = c7031acE.EZpvd(strAkhnZx2);
                        if (z7 || iEZpvd2 == c7031acE.length()) {
                            z9 = z8;
                            z7 = true;
                        } else {
                            z9 = z8;
                            z7 = false;
                        }
                        z10 = iEZpvd2 == strAkhnZx2.length();
                        if (this.valueOf && strAkhnZx2 == null && strAkhnZx == null && !this.gEmmrt.isEmpty()) {
                            int iEZpvd3 = c7031acE.EZpvd(this.gEmmrt);
                            if (z7 || iEZpvd3 == c7031acE.length()) {
                                z11 = z10;
                                z7 = true;
                            } else {
                                z11 = z10;
                                z7 = false;
                            }
                            if (iEZpvd3 == this.gEmmrt.length()) {
                                strAkhnZx2 = this.gEmmrt;
                                z11 = true;
                            }
                        } else {
                            z11 = z10;
                        }
                        if (z11 && strAkhnZx == null && this.AEQbTJ.AEQbTJ(iCopydefault)) {
                            strAkhnZx = C7223afl.AkhnZx(iCopydefault);
                            z12 = true;
                        } else {
                            z12 = z9;
                        }
                        if (!this.valueOf && strAkhnZx2 == null && strAkhnZx == null && this.AYXKKw.AEQbTJ(iCopydefault)) {
                            strAkhnZx2 = C7223afl.AkhnZx(iCopydefault);
                            z11 = true;
                        }
                        if ((!z12 || z11) && ((!z12 || !this.djBIcL) && (i9 != 2 || !z11))) {
                            zAEQbTJ = AEQbTJ(i12, i11, false);
                            boolean zAEQbTJ2 = AEQbTJ(i9, i7, true);
                            if (!zAEQbTJ || (z12 && !zAEQbTJ2)) {
                                if ((z11 || i7 != 0) && this.values) {
                                    z = z7;
                                    i2 = 2;
                                    c7167aei = null;
                                }
                            } else if (!this.values || i7 != 0 || i9 != 1) {
                                i12 = z12 ? -1 : i9;
                                int iAEQbTJ2 = i7 != 0 ? c7031acE.AEQbTJ() : i10;
                                i9 = z11 ? 1 : 2;
                                if (z11) {
                                    c7031acE.EZpvd(strAkhnZx2.length());
                                } else {
                                    c7031acE.EZpvd(strAkhnZx.length());
                                }
                                z13 = z7;
                                i11 = i7;
                                i13 = i10;
                                b2 = -1;
                                i7 = 0;
                                i10 = iAEQbTJ2;
                            }
                        }
                        z13 = z7;
                        break;
                    }
                    z9 = z8;
                    if (this.valueOf) {
                        z11 = z10;
                        if (z11) {
                            z12 = z9;
                            if (!this.valueOf) {
                                strAkhnZx2 = C7223afl.AkhnZx(iCopydefault);
                                z11 = true;
                            }
                            if (!z12) {
                                zAEQbTJ = AEQbTJ(i12, i11, false);
                                boolean zAEQbTJ22 = AEQbTJ(i9, i7, true);
                                if (zAEQbTJ) {
                                }
                                if (z11) {
                                    z = z7;
                                    i2 = 2;
                                    c7167aei = null;
                                } else {
                                    z = z7;
                                    i2 = 2;
                                    c7167aei = null;
                                }
                            } else {
                                zAEQbTJ = AEQbTJ(i12, i11, false);
                                boolean zAEQbTJ222 = AEQbTJ(i9, i7, true);
                                if (zAEQbTJ) {
                                }
                                if (z11) {
                                }
                            }
                        }
                    }
                } else {
                    int iEZpvd4 = c7031acE.EZpvd(this.OLrzqt);
                    z7 = z6 || iEZpvd4 == c7031acE.length();
                    if (iEZpvd4 == this.OLrzqt.length()) {
                        strAkhnZx = this.OLrzqt;
                        z8 = true;
                        if (strAkhnZx2 != null) {
                        }
                        if (this.valueOf) {
                        }
                    } else {
                        z6 = z7;
                        z7 = z6;
                        z8 = false;
                        if (strAkhnZx2 != null) {
                        }
                        if (this.valueOf) {
                        }
                    }
                }
                if (i9 == i2 && i7 == 0) {
                    c7031acE.AEQbTJ(i10);
                    i7 = i11;
                    i9 = i12;
                    i3 = i13;
                    i4 = -1;
                    i11 = 1;
                    z = true;
                    z2 = false;
                    i12 = 0;
                } else {
                    i3 = i10;
                    i4 = i13;
                    z2 = false;
                }
                boolean zAEQbTJ3 = AEQbTJ(i12, i11, z2);
                boolean zAEQbTJ4 = AEQbTJ(i9, i7, true);
                if (this.values) {
                    if (!zAEQbTJ3) {
                        c7031acE.AEQbTJ(i4);
                        i6 = i11 + i7;
                    } else if (zAEQbTJ4 || (i12 == 0 && i11 == 0)) {
                        i6 = 0;
                    } else {
                        c7031acE.AEQbTJ(i3);
                        i6 = i7;
                        z = true;
                    }
                    if (i6 != 0) {
                        c7167aei.AEQbTJ(-i6);
                        c7167aei.uzCIH();
                    }
                    z3 = z;
                    i5 = 2;
                    z4 = true;
                    zAEQbTJ4 = true;
                } else {
                    z3 = z;
                    z4 = zAEQbTJ3;
                    i5 = 2;
                }
                if (i9 != i5 && (!z4 || !zAEQbTJ4)) {
                    c7167aei = null;
                }
                if (c7167aei != null) {
                    boolean z14 = z3 || c7031acE.length() == 0;
                    c7031acE.AEQbTJ(iAEQbTJ);
                    return z14;
                }
                c7167aei.AEQbTJ(-i8);
                if (i != 0 && c7031acE.AEQbTJ() != iAEQbTJ) {
                    if (c7167aei.AkhnZx()) {
                        z5 = false;
                        long jEZpvd = c7167aei.EZpvd(false);
                        if (jEZpvd <= 2147483647L) {
                            c7145aeM2 = c7145aeM;
                            try {
                                c7145aeM2.AhwBna.AEQbTJ(((int) jEZpvd) * i);
                            } catch (java.lang.ArithmeticException unused) {
                                if (i != -1) {
                                }
                            }
                        } else {
                            c7145aeM2 = c7145aeM;
                        }
                    } else {
                        c7145aeM2 = c7145aeM;
                        z5 = false;
                    }
                    if (i != -1) {
                        c7145aeM2.AhwBna.values();
                    } else {
                        c7145aeM2.AhwBna = null;
                        c7145aeM2.AEQbTJ |= 128;
                    }
                } else {
                    c7145aeM2 = c7145aeM;
                    z5 = false;
                    c7145aeM2.AhwBna = c7167aei;
                }
                if (strAkhnZx != null) {
                    c7145aeM2.AEQbTJ |= 32;
                }
                c7145aeM2.copydefault(c7031acE);
                if (c7031acE.length() == 0 || z3) {
                    return true;
                }
                return z5;
            }
        }
        z = z13;
        i2 = 2;
        if (i9 == i2) {
            i3 = i10;
            i4 = i13;
            z2 = false;
        }
        boolean zAEQbTJ32 = AEQbTJ(i12, i11, z2);
        boolean zAEQbTJ42 = AEQbTJ(i9, i7, true);
        if (this.values) {
        }
        if (i9 != i5) {
            c7167aei = null;
        }
        if (c7167aei != null) {
        }
    }

    @Override // o.InterfaceC7141aeI
    public boolean OLrzqt(C7031acE c7031acE) {
        UnicodeSet unicodeSet;
        if (this.copydefault == null && (unicodeSet = this.AhwBna) != null) {
            return c7031acE.copydefault(unicodeSet);
        }
        if (c7031acE.copydefault(this.AkhnZx) || C7223afl.gEmmrt(c7031acE.copydefault())) {
            return true;
        }
        if (this.copydefault == null) {
            return false;
        }
        int i = 0;
        while (true) {
            java.lang.String[] strArr = this.copydefault;
            if (i >= strArr.length) {
                return false;
            }
            if (c7031acE.AEQbTJ(strArr[i])) {
                return true;
            }
            i++;
        }
    }
}
