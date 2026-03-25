package o;

import com.okinc.components.track.ABTestManager;
import com.okinc.components.track.amplitude.AmplitudeName;
import com.okinc.core.util.SPUtils;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qtH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41565qtH implements InterfaceC32861mla {
    public static final C41565qtH AEQbTJ;
    public static volatile boolean KWHzl;
    public static final int OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return KWHzl;
    }

    private C41565qtH() {
    }

    static {
        C41565qtH c41565qtH = new C41565qtH();
        AEQbTJ = c41565qtH;
        ABTestManager.registerCallback$default(ABTestManager.AEQbTJ, c41565qtH, null, 2, null);
        KWHzl = SPUtils.getBoolean("us_stock_token_cache", false);
        OLrzqt = 8;
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

    private final void copydefault() {
        java.lang.Object objM7377constructorimpl;
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(java.lang.Boolean.valueOf(C59449zhJ.equals$default(ABTestManager.getValue$default(ABTestManager.AEQbTJ, "us-stock-token", null, 2, null), "treatment", false, 2, null)));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = bool;
        }
        SPUtils.put("us_stock_token_cache", java.lang.Boolean.valueOf(((java.lang.Boolean) objM7377constructorimpl).booleanValue()));
    }
}
