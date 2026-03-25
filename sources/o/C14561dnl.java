package o;

import com.okinc.business.defi.common.track.AnalyticsEvent;
import com.okinc.components.track.bean.EventParam;
import com.okinc.liveness.lca.EopTrackEvent;
import kotlin.jvm.internal.Intrinsics;
import o.C14557dnh;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dnl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C14561dnl {
    public static final AnalyticsEvent AEQbTJ(@NotNull C14557dnh.Activity activity, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return new AnalyticsEvent("Web3WalletCoin_Button_Page_Click", yDY.gEmmrt(new EventParam("state", str, false), new EventParam(EopTrackEvent.KEY_BUTTON_NAME, str2, false), new EventParam("chain", str3, false), new EventParam("token_name", str4, false), new EventParam("token_type", str5, false), new EventParam("protocol_id", str6, false)), null, 4, null);
    }
}
