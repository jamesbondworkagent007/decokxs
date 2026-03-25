package o;

import com.okinc.components.track.ABTestManager;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.tUh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46437tUh {
    public static final C46437tUh OLrzqt = new C46437tUh();

    private C46437tUh() {
    }

    public final boolean copydefault() {
        java.lang.Object objM7377constructorimpl;
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(java.lang.Boolean.valueOf(C59449zhJ.equals$default(ABTestManager.getValue$default(ABTestManager.AEQbTJ, "cedefi_feed", null, 2, null), "treatment", false, 2, null)));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = bool;
        }
        return ((java.lang.Boolean) objM7377constructorimpl).booleanValue();
    }

    public final boolean AEQbTJ() {
        java.lang.Object objM7377constructorimpl;
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(java.lang.Boolean.valueOf(C59449zhJ.equals$default(ABTestManager.getValue$default(ABTestManager.AEQbTJ, "orbit_orbiter_upgrade_basic_info", null, 2, null), "treatment", false, 2, null)));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = bool;
        }
        return ((java.lang.Boolean) objM7377constructorimpl).booleanValue();
    }

    public final boolean AhwBna() {
        java.lang.Object objM7377constructorimpl;
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(java.lang.Boolean.valueOf(C59449zhJ.equals$default(ABTestManager.getValue$default(ABTestManager.AEQbTJ, "top_orbiter_follower_count", null, 2, null), "treatment", false, 2, null)));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = bool;
        }
        return ((java.lang.Boolean) objM7377constructorimpl).booleanValue();
    }

    public final boolean EZpvd() {
        java.lang.Object objM7377constructorimpl;
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(java.lang.Boolean.valueOf(C59449zhJ.equals$default(ABTestManager.getValue$default(ABTestManager.AEQbTJ, "planet_segment_display_type", null, 2, null), "tiled", false, 2, null)));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = bool;
        }
        return ((java.lang.Boolean) objM7377constructorimpl).booleanValue();
    }

    public final boolean KWHzl() {
        java.lang.Object objM7377constructorimpl;
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(java.lang.Boolean.valueOf(C59449zhJ.equals$default(ABTestManager.getValue$default(ABTestManager.AEQbTJ, "feature_planet_publisher", null, 2, null), "treatment", false, 2, null)));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = bool;
        }
        return ((java.lang.Boolean) objM7377constructorimpl).booleanValue();
    }

    public final int OLrzqt() {
        try {
            Result.Application application = Result.Companion;
            java.lang.Object payload$default = ABTestManager.getPayload$default(ABTestManager.AEQbTJ, "feature_planet_publisher", null, 2, null);
            Intrinsics.copydefault(payload$default, "");
            int iAhwBna = C33129mqd.AhwBna(((JSONObject) payload$default).get("imageSize"));
            if (iAhwBna <= 0) {
                return 10;
            }
            return iAhwBna;
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            java.lang.Object objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                objM7377constructorimpl = 10;
            }
            return ((java.lang.Number) objM7377constructorimpl).intValue();
        }
    }
}
