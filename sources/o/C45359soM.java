package o;

import com.okinc.core.util.SPUtils;
import java.util.Calendar;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.soM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C45359soM {
    public static final C45359soM copydefault = new C45359soM();
    public static final long AEQbTJ = java.util.concurrent.TimeUnit.HOURS.toMillis(1);
    public static final long OLrzqt = java.util.concurrent.TimeUnit.MINUTES.toMillis(5);

    private C45359soM() {
    }

    public final long EZpvd() {
        return !C34703nhO.AhwBna(C32979mnm.EZpvd.OLrzqt()) ? AEQbTJ : OLrzqt;
    }

    public final long copydefault() {
        return Calendar.getInstance().getTimeInMillis();
    }

    public final boolean AEQbTJ() {
        return copydefault() - EZpvd() <= C45366soT.KWHzl.AEQbTJ();
    }

    public static /* synthetic */ java.lang.String getEventSessionId$default(C45359soM c45359soM, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return c45359soM.copydefault(z);
    }

    public final java.lang.String copydefault(boolean z) {
        if (!AEQbTJ()) {
            KWHzl();
        }
        java.lang.String string = SPUtils.getString("KEY_EVENT_SESSION_ID", null);
        if (string == null && z) {
            C56529yIt c56529yIt = C56529yIt.KWHzl;
            string = java.lang.String.format("%s_%s", java.util.Arrays.copyOf(new java.lang.Object[]{xVW.copydefault(), java.lang.Long.valueOf(copydefault())}, 2));
            Intrinsics.checkNotNullExpressionValue(string, "");
            SPUtils.put("KEY_EVENT_SESSION_ID", string);
        }
        return string == null ? "" : string;
    }

    public final void KWHzl() {
        SPUtils.put("KEY_EVENT_SESSION_ID", null);
    }
}
