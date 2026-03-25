package o;

import o.C46526tXp;

/* JADX INFO: loaded from: classes10.dex */
public final class tXD {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt(int i, int i2) {
        boolean z = i == 0;
        boolean z2 = i2 == 1;
        return (z && z2) ? C46526tXp.StateListAnimator.AEQbTJ : (!z || z2) ? (z || !z2) ? C46526tXp.StateListAnimator.OLrzqt : C46526tXp.StateListAnimator.djBIcL : C46526tXp.StateListAnimator.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault(int i, int i2) {
        boolean z = i == 0;
        boolean z2 = i2 == 1;
        return (z && z2) ? C46526tXp.StateListAnimator.EZpvd : (!z || z2) ? (z || !z2) ? C46526tXp.StateListAnimator.gEmmrt : C46526tXp.StateListAnimator.valueOf : C46526tXp.StateListAnimator.copydefault;
    }

    @yCM
    public tXD() {
    }

    public static /* synthetic */ int getArrowResource$default(tXD txd, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = C33512mxp.AEQbTJ.isConnected();
        }
        if ((i3 & 2) != 0) {
            i2 = C33512mxp.AEQbTJ.AYXKKw();
        }
        return txd.OLrzqt(i, i2);
    }

    public final java.lang.String copydefault() {
        C33512mxp c33512mxp = C33512mxp.AEQbTJ;
        return (c33512mxp.isConnected() == 0 ? "green" : "red") + (c33512mxp.AYXKKw() == 1 ? "Modern" : "Classic");
    }

    public static /* synthetic */ int getChartResource$default(tXD txd, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = C33512mxp.AEQbTJ.isConnected();
        }
        if ((i3 & 2) != 0) {
            i2 = C33512mxp.AEQbTJ.AYXKKw();
        }
        return txd.copydefault(i, i2);
    }
}
