package o;

import com.okinc.components.track.ABTestManager;
import com.okinc.components.track.amplitude.AmplitudeName;
import com.okinc.core.util.SPUtils;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.msK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33216msK implements InterfaceC32861mla {
    public static boolean AEQbTJ;
    public static final int EZpvd;
    public static final C33216msK KWHzl;
    public static Function0<java.lang.Boolean> OLrzqt;
    public static volatile boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(Function0<java.lang.Boolean> function0) {
        OLrzqt = function0;
    }

    private C33216msK() {
    }

    static {
        C33216msK c33216msK = new C33216msK();
        KWHzl = c33216msK;
        ABTestManager.registerCallback$default(ABTestManager.AEQbTJ, c33216msK, null, 2, null);
        copydefault = SPUtils.getBoolean("feat_planet_cache", false);
        boolean z = SPUtils.getBoolean("feat_planet_fr_visibility_cache", false);
        AEQbTJ = z;
        pUU.KWHzl("OKAppFeatureFlag", "orbit init isPlanetFrLimitCache = " + z);
        EZpvd = 8;
    }

    public final boolean KWHzl() {
        pUU.KWHzl("OKAppFeatureFlag", "orbit isPlanetFrLimitCache = " + AEQbTJ);
        return copydefault || AEQbTJ;
    }

    public final boolean OLrzqt() {
        Function0<java.lang.Boolean> function0 = OLrzqt;
        java.lang.Boolean boolInvoke = function0 != null ? function0.invoke() : null;
        boolean z = SPUtils.getBoolean("feat_planet_cache", false);
        pUU.KWHzl("OKAppFeatureFlag", "isCacheInvalid-isPlanetFrLimitCache = " + AEQbTJ + " ,isFrLimitNew =" + boolInvoke);
        return (z == copydefault && Intrinsics.EZpvd(java.lang.Boolean.valueOf(AEQbTJ), boolInvoke)) ? false : true;
    }

    public final void OLrzqt(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        copydefault();
        boolean z = SPUtils.getBoolean("feat_planet_cache", false);
        Function0<java.lang.Boolean> function02 = OLrzqt;
        boolean zBooleanValue = function02 != null ? function02.invoke().booleanValue() : true;
        pUU.KWHzl("OKAppFeatureFlag", "updateCache isPlanetFrLimitCache =" + AEQbTJ + ",isFrLimitNew = " + zBooleanValue);
        if (z == copydefault && AEQbTJ == zBooleanValue) {
            return;
        }
        copydefault = z;
        AEQbTJ = zBooleanValue;
        EZpvd();
        function0.invoke();
    }

    @Override // o.InterfaceC32861mla
    public void EZpvd(@NotNull AmplitudeName amplitudeName) {
        Intrinsics.checkNotNullParameter(amplitudeName, "");
        copydefault();
    }

    @Override // o.InterfaceC32861mla
    public void KWHzl(@NotNull AmplitudeName amplitudeName) {
        Intrinsics.checkNotNullParameter(amplitudeName, "");
        copydefault();
    }

    public final void copydefault() {
        java.lang.Object objM7377constructorimpl;
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(java.lang.Boolean.valueOf(C59449zhJ.equals$default(ABTestManager.getValue$default(ABTestManager.AEQbTJ, "feat_planet", null, 2, null), "treatment", false, 2, null)));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = bool;
        }
        SPUtils.put("feat_planet_cache", java.lang.Boolean.valueOf(((java.lang.Boolean) objM7377constructorimpl).booleanValue()));
    }

    public final void EZpvd() {
        SPUtils.put("feat_planet_fr_visibility_cache", java.lang.Boolean.valueOf(AEQbTJ));
    }
}
