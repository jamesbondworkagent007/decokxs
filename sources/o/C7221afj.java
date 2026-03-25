package o;

import com.ibm.icu.text.UnicodeSet;
import com.ibm.icu.util.CodePointMap;

/* JADX INFO: renamed from: o.afj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7221afj {
    public static final UnicodeSet[] copydefault = new UnicodeSet[65];
    public static final CodePointMap[] AEQbTJ = new CodePointMap[25];

    private C7221afj() {
    }

    public static UnicodeSet EZpvd(int i) {
        UnicodeSet unicodeSet = new UnicodeSet();
        UnicodeSet unicodeSetOLrzqt = C7018abS.OLrzqt(i);
        int iDjBIcL = unicodeSetOLrzqt.djBIcL();
        int i2 = -1;
        for (int i3 = 0; i3 < iDjBIcL; i3++) {
            int iDjBIcL2 = unicodeSetOLrzqt.djBIcL(i3);
            for (int iAYXKKw = unicodeSetOLrzqt.AYXKKw(i3); iAYXKKw <= iDjBIcL2; iAYXKKw++) {
                if (C7223afl.EZpvd(iAYXKKw, i)) {
                    if (i2 < 0) {
                        i2 = iAYXKKw;
                    }
                } else if (i2 >= 0) {
                    unicodeSet.EZpvd(i2, iAYXKKw - 1);
                    i2 = -1;
                }
            }
        }
        if (i2 >= 0) {
            unicodeSet.EZpvd(i2, 1114111);
        }
        return unicodeSet.AYXKKw();
    }

    public static final UnicodeSet copydefault(int i) {
        UnicodeSet unicodeSetEZpvd;
        if (i < 0 || 65 <= i) {
            throw new java.lang.IllegalArgumentException("" + i + " is not a constant for a UProperty binary property");
        }
        UnicodeSet[] unicodeSetArr = copydefault;
        synchronized (unicodeSetArr) {
            unicodeSetEZpvd = unicodeSetArr[i];
            if (unicodeSetEZpvd == null) {
                unicodeSetEZpvd = EZpvd(i);
                unicodeSetArr[i] = unicodeSetEZpvd;
            }
        }
        return unicodeSetEZpvd;
    }
}
