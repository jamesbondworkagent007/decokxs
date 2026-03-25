package o;

import com.okinc.unify_trade.trade.utils.TradeAbTestManager;
import o.C55688xof;

/* JADX INFO: loaded from: classes12.dex */
public final class xUX {
    public static final java.lang.String copydefault(long j) {
        if (j < 10) {
            return "0" + j;
        }
        return java.lang.String.valueOf(j);
    }

    public static final java.lang.String KWHzl(long j) {
        long j2 = 3600000;
        long j3 = j / j2;
        long j4 = j % j2;
        long j5 = 60000;
        long j6 = j4 / j5;
        long j7 = (j4 % j5) / ((long) 1000);
        return copydefault(j3) + ":" + copydefault(j6) + ":" + copydefault(j7);
    }

    public static final java.lang.String EZpvd(long j) {
        if (j < 10) {
            return "0" + j;
        }
        return java.lang.String.valueOf(j);
    }

    public static final java.lang.String OLrzqt(long j) {
        long j2 = 3600000;
        long j3 = j / j2;
        long j4 = j % j2;
        long j5 = 60000;
        long j6 = j4 / j5;
        long j7 = (j4 % j5) / ((long) 1000);
        long j8 = 86400000;
        if (j > j8) {
            return ((j / j8) + 1) + C33070mpX.AYXKKw(C55688xof.Application.reportFullyDrawn);
        }
        return EZpvd(j3) + ":" + EZpvd(j6) + ":" + EZpvd(j7);
    }

    public static final boolean AEQbTJ(long j) {
        return j / ((long) 3600000) < 1;
    }

    public static final boolean djBIcL(long j) {
        if (TradeAbTestManager.copydefault.valueOf()) {
            return j / ((long) 1800000) < 1;
        }
        return AEQbTJ(j);
    }
}
