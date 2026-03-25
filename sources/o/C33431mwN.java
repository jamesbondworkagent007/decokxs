package o;

import com.okinc.components.track.ABTestManager;
import kotlin.Result;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.DebugKt;

/* JADX INFO: renamed from: o.mwN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33431mwN {
    public static final C33431mwN EZpvd = new C33431mwN();
    public static final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.mwV
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Boolean.valueOf(C33431mwN.copydefault());
        }
    });
    public static final int OLrzqt = 8;

    private C33431mwN() {
    }

    public final boolean EZpvd() {
        return C59449zhJ.equals$default(ABTestManager.getValue$default(ABTestManager.AEQbTJ, "lite-mode-switch-segment-view", null, 2, null), "treatment", false, 2, null);
    }

    public final boolean AEQbTJ() {
        return ((java.lang.Boolean) AEQbTJ.getValue()).booleanValue();
    }

    public static final boolean copydefault() {
        java.lang.Object objM7377constructorimpl;
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(java.lang.Boolean.valueOf(C59449zhJ.equals$default(ABTestManager.getValue$default(ABTestManager.AEQbTJ, "mobile_infra_okapp_mode_refactor", null, 2, null), DebugKt.DEBUG_PROPERTY_VALUE_ON, false, 2, null)));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = bool;
        }
        boolean zBooleanValue = ((java.lang.Boolean) objM7377constructorimpl).booleanValue();
        pUU.KWHzl("ModeSwitch-Flag", "mode refactor flag: " + zBooleanValue);
        return zBooleanValue;
    }

    public final boolean KWHzl() {
        return AEQbTJ();
    }
}
