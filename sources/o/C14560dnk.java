package o;

import com.okinc.business.defi.api.bean.VerifyDAppDomainResponse;
import com.okinc.business.defi.common.track.AnalyticsEvent;
import com.okinc.components.track.bean.EventParam;
import kotlin.jvm.internal.Intrinsics;
import o.C14557dnh;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dnk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C14560dnk {
    public static final AnalyticsEvent OLrzqt(@NotNull C14557dnh.TaskDescription taskDescription, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new AnalyticsEvent("Web3Approvals_Full_Page_View", yDY.gEmmrt(new EventParam("wallet_id", str, false), new EventParam(VerifyDAppDomainResponse.LEVEL_RISK, str2, true), new EventParam("risk_address", str3, false), new EventParam("terminal", str4, true)), null, 4, null);
    }
}
