package o;

import androidx.core.internal.view.SupportMenu;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.ibm.icu.impl.CalType;
import com.ibm.icu.impl.ICUResourceBundle;
import com.ibm.icu.util.ICUException;
import com.ibm.icu.util.TimeZone;
import com.ibm.icu.util.UResourceBundle;

/* JADX INFO: renamed from: o.abW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7022abW {
    public static final int AEQbTJ = EZpvd(-32768, 1, 1);
    public int EZpvd;
    public int[] KWHzl;
    public int OLrzqt;

    public static int EZpvd(int i, int i2, int i3) {
        return (i << 16) | (i2 << 8) | i3;
    }

    public static boolean KWHzl(int i) {
        return i != 0;
    }

    public static boolean copydefault(int i, int i2, int i3) {
        return i >= -32768 && i <= 32767 && i2 >= 1 && i2 <= 12 && i3 >= 1 && i3 <= 31;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int copydefault() {
        return this.OLrzqt;
    }

    public C7022abW(int[] iArr, int i) {
        this.KWHzl = iArr;
        this.OLrzqt = i;
        EZpvd();
    }

    public static C7022abW EZpvd(CalType calType, boolean z) {
        UResourceBundle uResourceBundleIsConnected = UResourceBundle.copydefault("com/ibm/icu/impl/data/icudt68b", "supplementalData", ICUResourceBundle.AEQbTJ).isConnected("calendarData").isConnected(calType.getId()).isConnected("eras");
        int iFARcdN = uResourceBundleIsConnected.fARcdN();
        int[] iArr = new int[iFARcdN];
        C7260agV newProxyInstance = uResourceBundleIsConnected.getNewProxyInstance();
        int i = Integer.MAX_VALUE;
        while (newProxyInstance.EZpvd()) {
            UResourceBundle uResourceBundleCopydefault = newProxyInstance.copydefault();
            java.lang.String strAEQbTJ = uResourceBundleCopydefault.AEQbTJ();
            try {
                int i2 = java.lang.Integer.parseInt(strAEQbTJ);
                if (i2 < 0 || i2 >= iFARcdN) {
                    throw new ICUException("Era rule key:" + strAEQbTJ + " in era rule data for " + calType.getId() + " must be in range [0, " + (iFARcdN - 1) + "]");
                }
                if (KWHzl(iArr[i2])) {
                    throw new ICUException("Dupulicated era rule for rule key:" + strAEQbTJ + " in era rule data for " + calType.getId());
                }
                C7260agV newProxyInstance2 = uResourceBundleCopydefault.getNewProxyInstance();
                boolean z2 = true;
                boolean z3 = false;
                while (newProxyInstance2.EZpvd()) {
                    UResourceBundle uResourceBundleCopydefault2 = newProxyInstance2.copydefault();
                    java.lang.String strAEQbTJ2 = uResourceBundleCopydefault2.AEQbTJ();
                    if (strAEQbTJ2.equals(TtmlNode.START)) {
                        int[] iArrUzCIH = uResourceBundleCopydefault2.uzCIH();
                        if (iArrUzCIH.length != 3 || !copydefault(iArrUzCIH[0], iArrUzCIH[1], iArrUzCIH[2])) {
                            throw new ICUException("Invalid era rule date data:" + java.util.Arrays.toString(iArrUzCIH) + " in era rule data for " + calType.getId());
                        }
                        iArr[i2] = EZpvd(iArrUzCIH[0], iArrUzCIH[1], iArrUzCIH[2]);
                    } else if (strAEQbTJ2.equals("named")) {
                        if (uResourceBundleCopydefault2.getFieldNames().equals("false")) {
                            z2 = false;
                        }
                    } else if (strAEQbTJ2.equals(TtmlNode.END)) {
                        z3 = true;
                    }
                }
                if (!KWHzl(iArr[i2])) {
                    if (!z3) {
                        throw new ICUException("Missing era start/end rule date for key:" + strAEQbTJ + " in era rule data for " + calType.getId());
                    }
                    if (i2 != 0) {
                        throw new ICUException("Era data for " + strAEQbTJ + " in era rule data for " + calType.getId() + " has only end rule.");
                    }
                    iArr[i2] = AEQbTJ;
                }
                if (z2) {
                    if (i2 >= i) {
                        throw new ICUException("Non-tentative era(" + i2 + ") must be placed before the first tentative era");
                    }
                } else if (i2 < i) {
                    i = i2;
                }
            } catch (java.lang.NumberFormatException unused) {
                throw new ICUException("Invald era rule key:" + strAEQbTJ + " in era rule data for " + calType.getId());
            }
        }
        if (i < Integer.MAX_VALUE && !z) {
            return new C7022abW(iArr, i);
        }
        return new C7022abW(iArr, iFARcdN);
    }

    public int[] copydefault(int i, int[] iArr) {
        if (i < 0 || i >= this.OLrzqt) {
            throw new java.lang.IllegalArgumentException("eraIdx is out of range");
        }
        return OLrzqt(this.KWHzl[i], iArr);
    }

    public int OLrzqt(int i) {
        if (i < 0 || i >= this.OLrzqt) {
            throw new java.lang.IllegalArgumentException("eraIdx is out of range");
        }
        return OLrzqt(this.KWHzl[i], null)[0];
    }

    public int AEQbTJ(int i, int i2, int i3) {
        if (i2 < 1 || i2 > 12 || i3 < 1 || i3 > 31) {
            throw new java.lang.IllegalArgumentException("Illegal date - year:" + i + "month:" + i2 + "day:" + i3);
        }
        int i4 = this.OLrzqt;
        int iOLrzqt = KWHzl(this.KWHzl[OLrzqt()], i, i2, i3) <= 0 ? OLrzqt() : 0;
        while (iOLrzqt < i4 - 1) {
            int i5 = (iOLrzqt + i4) / 2;
            if (KWHzl(this.KWHzl[i5], i, i2, i3) <= 0) {
                iOLrzqt = i5;
            } else {
                i4 = i5;
            }
        }
        return iOLrzqt;
    }

    public final void EZpvd() {
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        int[] iArrKWHzl = C7019abT.KWHzl(jCurrentTimeMillis + ((long) TimeZone.getDefault().getOffset(jCurrentTimeMillis)), null);
        int iEZpvd = EZpvd(iArrKWHzl[0], iArrKWHzl[1] + 1, iArrKWHzl[2]);
        int i = this.OLrzqt - 1;
        while (i > 0 && iEZpvd < this.KWHzl[i]) {
            i--;
        }
        this.EZpvd = i;
    }

    public static int[] OLrzqt(int i, int[] iArr) {
        int i2;
        int i3;
        int i4;
        if (i == AEQbTJ) {
            i4 = Integer.MIN_VALUE;
            i2 = 1;
            i3 = 1;
        } else {
            i2 = (65280 & i) >> 8;
            i3 = i & 255;
            i4 = (i & SupportMenu.CATEGORY_MASK) >> 16;
        }
        if (iArr == null || iArr.length < 3) {
            return new int[]{i4, i2, i3};
        }
        iArr[0] = i4;
        iArr[1] = i2;
        iArr[2] = i3;
        return iArr;
    }

    public static int KWHzl(int i, int i2, int i3, int i4) {
        int iEZpvd;
        if (i2 < -32768) {
            if (i == AEQbTJ) {
                return (i2 > Integer.MIN_VALUE || i3 > 1 || i4 > 1) ? -1 : 0;
            }
            return 1;
        }
        if (i2 <= 32767 && i >= (iEZpvd = EZpvd(i2, i3, i4))) {
            return i == iEZpvd ? 0 : 1;
        }
        return -1;
    }
}
