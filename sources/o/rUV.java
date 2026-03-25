package o;

import com.okinc.components.track.ABTestManager;
import kotlin.Result;

/* JADX INFO: loaded from: classes10.dex */
public final class rUV {
    public static final rUV EZpvd = new rUV();

    private rUV() {
    }

    public final java.lang.Integer AEQbTJ() {
        java.lang.Object objM7377constructorimpl;
        try {
            Result.Application application = Result.Companion;
            java.lang.String value$default = ABTestManager.getValue$default(ABTestManager.AEQbTJ, "kyc_feature_restriction_ok_core_switch", null, 2, null);
            objM7377constructorimpl = Result.m7377constructorimpl(value$default != null ? java.lang.Integer.valueOf(java.lang.Integer.parseInt(value$default)) : null);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
            objM7377constructorimpl = 0;
        }
        return (java.lang.Integer) objM7377constructorimpl;
    }
}
