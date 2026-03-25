package o;

import com.ibm.icu.number.NumberFormatter;
import com.ibm.icu.text.CompactDecimalFormat;

/* JADX INFO: renamed from: o.afs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7230afs {
    public static final C7220afi EZpvd;
    public static final C7220afi KWHzl;
    public static final C7234afw copydefault;
    public static final C7237afz djBIcL;
    public static final C7234afw gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static C7220afi AEQbTJ() {
        return EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static C7220afi EZpvd() {
        return KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static C7234afw KWHzl() {
        return gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static C7237afz OLrzqt() {
        return djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static C7234afw copydefault() {
        return copydefault;
    }

    static {
        NumberFormatter.SignDisplay signDisplay = NumberFormatter.SignDisplay.AUTO;
        gEmmrt = new C7234afw(1, false, 1, signDisplay);
        copydefault = new C7234afw(3, false, 1, signDisplay);
        EZpvd = new C7220afi(CompactDecimalFormat.CompactStyle.SHORT);
        KWHzl = new C7220afi(CompactDecimalFormat.CompactStyle.LONG);
        djBIcL = new C7237afz();
    }
}
