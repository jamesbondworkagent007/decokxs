package o;

import androidx.core.view.InputDeviceCompat;
import com.ibm.icu.impl.IllegalIcuArgumentException;
import com.ibm.icu.util.ULocale;

/* JADX INFO: renamed from: o.afl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7223afl {
    public static int valueOf(int i) {
        return 0;
    }

    public static int KWHzl(int i, int i2) {
        if (2 <= i2 && i2 <= 36) {
            int iOLrzqt = OLrzqt(i);
            if (iOLrzqt < 0) {
                iOLrzqt = C7038acL.copydefault(i);
            }
            if (iOLrzqt < i2) {
                return iOLrzqt;
            }
        }
        return -1;
    }

    public static int OLrzqt(int i) {
        return C7038acL.AhwBna.gEmmrt(i);
    }

    public static double AYXKKw(int i) {
        return C7038acL.AhwBna.fJNWhG(i);
    }

    public static int djBIcL(int i) {
        return C7038acL.AhwBna.fARcdN(i);
    }

    public static boolean gEmmrt(int i) {
        return djBIcL(i) == 9;
    }

    public static boolean fetchVPNInfo(int i) {
        return djBIcL(i) == 2;
    }

    public static boolean values(int i) {
        if (((1 << djBIcL(i)) & 28672) != 0 && i != 160 && i != 8199 && i != 8239) {
            return true;
        }
        if (i < 9 || i > 13) {
            return i >= 28 && i <= 31;
        }
        return true;
    }

    public static java.lang.String AkhnZx(int i) {
        if (i < 0 || i > 1114111) {
            return null;
        }
        if (i < 65536) {
            return java.lang.String.valueOf((char) i);
        }
        return new java.lang.String(java.lang.Character.toChars(i));
    }

    public static int AhwBna(int i) {
        return C7030acD.KWHzl.valueOf(i);
    }

    public static int AEQbTJ(int i) {
        return C7030acD.KWHzl.djBIcL(i);
    }

    public static int EZpvd(java.lang.String str) {
        return C7035acI.KWHzl.OLrzqt(2, str);
    }

    public static int EZpvd(java.lang.CharSequence charSequence) {
        int iAEQbTJ = C7041acO.EZpvd.AEQbTJ(charSequence);
        if (iAEQbTJ != -1) {
            return iAEQbTJ;
        }
        throw new IllegalIcuArgumentException("Invalid name: " + ((java.lang.Object) charSequence));
    }

    public static java.lang.String EZpvd(int i, int i2, int i3) {
        if ((i == 4098 || i == 4112 || i == 4113) && i2 >= valueOf(InputDeviceCompat.SOURCE_TOUCHSCREEN) && i2 <= copydefault(InputDeviceCompat.SOURCE_TOUCHSCREEN) && i3 >= 0 && i3 < 2) {
            try {
                return C7041acO.EZpvd.AEQbTJ(i, i2, i3);
            } catch (java.lang.IllegalArgumentException unused) {
                return null;
            }
        }
        return C7041acO.EZpvd.AEQbTJ(i, i2, i3);
    }

    public static int KWHzl(int i, java.lang.CharSequence charSequence) {
        int iCopydefault = C7041acO.EZpvd.copydefault(i, charSequence);
        if (iCopydefault != -1) {
            return iCopydefault;
        }
        throw new IllegalIcuArgumentException("Invalid name: " + ((java.lang.Object) charSequence));
    }

    @java.lang.Deprecated
    public static int AEQbTJ(int i, java.lang.CharSequence charSequence) {
        return C7041acO.EZpvd.OLrzqt(i, charSequence);
    }

    public static int copydefault(ULocale uLocale) {
        if (uLocale == null) {
            uLocale = ULocale.getDefault();
        }
        return C7034acH.KWHzl(uLocale);
    }

    public static java.lang.String AEQbTJ(ULocale uLocale, java.lang.String str) {
        return C7014abO.OLrzqt(copydefault(uLocale), 0, str);
    }

    public static java.lang.String EZpvd(ULocale uLocale, java.lang.String str) {
        return C7014abO.KWHzl(copydefault(uLocale), 0, str);
    }

    public static java.lang.String OLrzqt(ULocale uLocale, java.lang.String str, AbstractC7192afG abstractC7192afG) {
        return AEQbTJ(uLocale, str, abstractC7192afG, 0);
    }

    public static java.lang.String AEQbTJ(ULocale uLocale, java.lang.String str, AbstractC7192afG abstractC7192afG, int i) {
        if (abstractC7192afG == null && uLocale == null) {
            uLocale = ULocale.getDefault();
        }
        AbstractC7192afG abstractC7192afGCopydefault = C7014abO.copydefault(uLocale, i, abstractC7192afG);
        abstractC7192afGCopydefault.AEQbTJ(str);
        return C7014abO.KWHzl(copydefault(uLocale), i, abstractC7192afGCopydefault, str);
    }

    public static int OLrzqt(int i, boolean z) {
        return AEQbTJ(i, !z ? 1 : 0);
    }

    public static java.lang.String copydefault(java.lang.String str, boolean z) {
        return KWHzl(str, !z ? 1 : 0);
    }

    public static int AEQbTJ(int i, int i2) {
        return C7034acH.OLrzqt.copydefault(i, i2);
    }

    public static final java.lang.String KWHzl(java.lang.String str, int i) {
        return C7014abO.AEQbTJ(i, str);
    }

    public static C7258agT EZpvd(int i) {
        if (i < 0 || i > 1114111) {
            throw new java.lang.IllegalArgumentException("Codepoint out of bounds");
        }
        return C7038acL.AhwBna.isConnected(i);
    }

    public static boolean EZpvd(int i, int i2) {
        return C7038acL.AhwBna.AEQbTJ(i, i2);
    }

    public static boolean DbNXlk(int i) {
        return EZpvd(i, 0);
    }

    public static boolean isConnected(int i) {
        return EZpvd(i, 31);
    }

    public static int copydefault(int i, int i2) {
        return C7038acL.AhwBna.EZpvd(i, i2);
    }

    public static int copydefault(int i) {
        return C7038acL.AhwBna.DbNXlk(i);
    }

    public static boolean EZpvd(char c) {
        return java.lang.Character.isHighSurrogate(c);
    }

    public static boolean copydefault(char c) {
        return java.lang.Character.isLowSurrogate(c);
    }

    public static int KWHzl(int i) {
        return java.lang.Character.charCount(i);
    }

    private C7223afl() {
    }
}
