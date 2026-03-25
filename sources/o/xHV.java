package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class xHV {
    public static java.lang.String OLrzqt;
    public static java.lang.String copydefault;
    public static final xHV AEQbTJ = new xHV();
    public static final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.xHT
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return xHV.copydefault();
        }
    });
    public static final int EZpvd = 8;

    private xHV() {
    }

    public static final xND copydefault() {
        return (xND) C43251rlk.copydefault(xND.class);
    }

    public final xND KWHzl() {
        return (xND) KWHzl.getValue();
    }

    public static /* synthetic */ java.lang.String getOrderTag$default(xHV xhv, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return xhv.OLrzqt(z);
    }

    public final java.lang.String OLrzqt(boolean z) {
        if (Intrinsics.EZpvd(KWHzl().copydefault(), java.lang.Boolean.TRUE)) {
            return "OTversionB";
        }
        if (z) {
            return null;
        }
        java.lang.String str = OLrzqt;
        return (str == null || str.length() == 0) ? copydefault : OLrzqt;
    }
}
