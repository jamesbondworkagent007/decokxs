package o;

import com.okinc.business.defi.common.track.AnalyticsEvent;
import com.okinc.components.track.bean.EventParam;
import kotlin.jvm.internal.Intrinsics;
import o.C14557dnh;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dnm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C14562dnm {
    public static final AnalyticsEvent AEQbTJ(@NotNull C14557dnh.Application application, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new AnalyticsEvent("Web3Onboarding_Card_ImportWallet_Click", C56402yEa.EZpvd(new EventParam(str, str2, true)), null, 4, null);
    }

    public static final AnalyticsEvent EZpvd(@NotNull C14557dnh.Application application, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new AnalyticsEvent("Web3AddWallet_Card_ImportWallet_Click", C56402yEa.EZpvd(new EventParam(str, str2, true)), null, 4, null);
    }
}
