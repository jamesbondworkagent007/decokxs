package o;

import android.provider.Settings;
import androidx.work.WorkRequest;
import kotlin.Result;

/* JADX INFO: renamed from: o.qVx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40439qVx {
    public static final C40439qVx AEQbTJ = new C40439qVx();

    private C40439qVx() {
    }

    public final long OLrzqt(long j) {
        java.lang.Object objM7377constructorimpl;
        try {
            Result.Application application = Result.Companion;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (KWHzl()) {
                return jCurrentTimeMillis;
            }
            long j2 = jCurrentTimeMillis - j;
            if (0 > j2 || j2 >= WorkRequest.MIN_BACKOFF_MILLIS) {
                jCurrentTimeMillis = j;
            }
            objM7377constructorimpl = Result.m7377constructorimpl(java.lang.Long.valueOf(jCurrentTimeMillis));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
            objM7377constructorimpl = java.lang.Long.valueOf(j);
        }
        return ((java.lang.Number) objM7377constructorimpl).longValue();
    }

    public final boolean KWHzl() {
        return Settings.Global.getInt(C43246rlf.OLrzqt.valueOf().getContentResolver(), "auto_time", 0) == 1;
    }
}
