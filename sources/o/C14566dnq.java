package o;

import com.okinc.business.defi.common.track.AnalyticsEvent;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParam;
import kotlin.jvm.internal.Intrinsics;
import o.C14557dnh;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dnq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C14566dnq {
    public static final AnalyticsEvent OLrzqt(@NotNull C14557dnh.ActionBar actionBar, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        java.util.List listGEmmrt = yDY.gEmmrt(new EventParam("walletCount", str, false), new EventParam("info", str2, false));
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        return new AnalyticsEvent("app_defi_hub_reset_wallet", listGEmmrt, (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length));
    }
}
