package o;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class gBR {
    public static final gBR copydefault = new gBR();
    public static final java.util.Comparator<C10525bqB> OLrzqt = new java.util.Comparator() { // from class: o.gBQ
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.util.Comparator
        public final int compare(java.lang.Object obj, java.lang.Object obj2) {
            return gBR.copydefault((C10525bqB) obj, (C10525bqB) obj2);
        }
    };

    public final int EZpvd(boolean z, boolean z2) {
        if (z && z2) {
            return 1;
        }
        if (z || !z2) {
            return (!z || z2) ? 4 : 3;
        }
        return 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Comparator<C10525bqB> EZpvd() {
        return OLrzqt;
    }

    private gBR() {
    }

    public static final int copydefault(C10525bqB c10525bqB, C10525bqB c10525bqB2) {
        boolean z = c10525bqB.KWHzl().fetchVPNInfo() == 196;
        boolean z2 = c10525bqB2.KWHzl().fetchVPNInfo() == 196;
        gBR gbr = copydefault;
        Intrinsics.copydefault(c10525bqB);
        boolean zEZpvd = gbr.EZpvd(c10525bqB);
        Intrinsics.copydefault(c10525bqB2);
        return Intrinsics.copydefault(gbr.EZpvd(z, zEZpvd), gbr.EZpvd(z2, gbr.EZpvd(c10525bqB2)));
    }

    public final boolean EZpvd(C10525bqB c10525bqB) {
        return C33129mqd.AEQbTJ(C54862xYb.convertToString$default(C33129mqd.EZpvd(c10525bqB.fIwbmz()), false, java.lang.Integer.valueOf(c10525bqB.KWHzl().fZBcTu()), null, 5, null), 0);
    }
}
