package o;

import com.okinc.components.track.ABTestManager;
import com.okinc.components.track.amplitude.AmplitudeName;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jak, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C26355jak implements InterfaceC26357jam {
    @yCM
    public C26355jak() {
    }

    @Override // o.InterfaceC26357jam
    public java.lang.Object copydefault(@NotNull Continuation<? super Result<java.lang.Boolean>> continuation) {
        boolean zEZpvd = Intrinsics.EZpvd((java.lang.Object) ABTestManager.AEQbTJ.AEQbTJ("mobile_web3_defi_dashboardv3_enabled", AmplitudeName.WEB3), (java.lang.Object) "false");
        pUU.EZpvd("DashboardV3", "AB = " + zEZpvd);
        Result.Application application = Result.Companion;
        return Result.m7377constructorimpl(C56443yFo.KWHzl(!zEZpvd));
    }
}
