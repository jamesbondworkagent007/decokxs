package o;

import com.okinc.business.defi.common.track.AnalyticsEvent;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParam;
import kotlin.jvm.internal.Intrinsics;
import o.C14557dnh;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dno, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C14564dno {
    public static final AnalyticsEvent copydefault(@NotNull C14557dnh.StateListAnimator stateListAnimator, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7, @NotNull java.lang.String str8, @NotNull java.lang.String str9, java.lang.String str10) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        java.util.List listGEmmrt = yDY.gEmmrt(new EventParam("wallet_id", str, false), new EventParam("coin_balance", str2, false), new EventParam("defi_balance", str3, false), new EventParam("nft_balance", str4, false), new EventParam("wallet_type", str5, true), new EventParam("account_type", str6, true), new EventParam("channelid", str8, false), new EventParam("platform_coin_balance", str7, false), new EventParam("main_coin_number_by_networks", str9, false), new EventParam("web3_c_ref", C33129mqd.gEmmrt(str10), false));
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        return new AnalyticsEvent("app_metax_wallet_balance_show", listGEmmrt, (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length));
    }

    public static final AnalyticsEvent OLrzqt(@NotNull C14557dnh.StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        return new AnalyticsEvent("app_start_wallet", null, null, 6, null);
    }

    public static final AnalyticsEvent AEQbTJ(@NotNull C14557dnh.StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        return new AnalyticsEvent("app_home_exchangeTransferBanner_click", null, null, 6, null);
    }

    public static final AnalyticsEvent EZpvd(@NotNull C14557dnh.StateListAnimator stateListAnimator, int i, @NotNull java.lang.String str, java.lang.String str2, java.lang.String str3, @NotNull java.lang.String str4, java.lang.String str5) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str4, "");
        java.util.List listGEmmrt = yDY.gEmmrt(new EventParam("Amount", C33129mqd.gEmmrt(java.lang.Integer.valueOf(i)), false), new EventParam("WalletIds", str, false), new EventParam("channelid", C33129mqd.gEmmrt(str2), false), new EventParam("wallet_id", C33129mqd.gEmmrt(str3), false), new EventParam("smart_account_status", str4, false), new EventParam("web3_c_ref", C33129mqd.gEmmrt(str5), false));
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        return new AnalyticsEvent("app_defi_hub_show", listGEmmrt, (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length));
    }

    public static final AnalyticsEvent EZpvd(@NotNull C14557dnh.StateListAnimator stateListAnimator, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new AnalyticsEvent("Web3HomePage_Mid_Banner_Click", C56402yEa.EZpvd(new EventParam("banner_id", str, false)), null, 4, null);
    }
}
