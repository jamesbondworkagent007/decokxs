package o;

import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hve, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23301hve {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String AEQbTJ(int i) {
        return i != 4 ? i != 31 ? i != 32 ? "fast" : "standard" : "slow" : "custom";
    }

    public static final void KWHzl(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C32866mlf.onEvent$default("DEXSwap_ContractInteraction_Page_View", (TrackChannel[]) null, new Function1() { // from class: o.hvd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C23301hve.OLrzqt(str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit OLrzqt(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("business_type", str, true);
        return Unit.INSTANCE;
    }

    public static final void EZpvd(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3, @NotNull final java.lang.String str4, @NotNull final java.lang.String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        C32866mlf.onEvent$default("DEXSwap_ContractInteraction_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.hvc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C23301hve.AEQbTJ(str, str2, str3, str4, str5, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit AEQbTJ(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("wallet_address", str, true);
        eventParamsList.put("business_type", str2, true);
        eventParamsList.put("source", str3, true);
        eventParamsList.put(EopTrackEvent.KEY_BUTTON_NAME, str4, true);
        EventParamsList.put$default(eventParamsList, "MEV_status", str5, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3, @NotNull final java.lang.String str4, @NotNull final java.lang.String str5, @NotNull final java.lang.String str6, @NotNull final java.lang.String str7, @NotNull final java.lang.String str8, @NotNull final java.lang.String str9, @NotNull final java.lang.String str10, @NotNull final java.lang.String str11, @NotNull final java.lang.String str12, @NotNull final java.lang.String str13, @NotNull final java.lang.String str14, @NotNull final java.lang.String str15, @NotNull final java.lang.String str16, @NotNull final java.lang.String str17) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        C32866mlf.onEvent$default("DEXSwap_ContractInteraction_Action_Click", (TrackChannel[]) null, new Function1() { // from class: o.hvg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C23301hve.AEQbTJ(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit AEQbTJ(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.lang.String str11, java.lang.String str12, java.lang.String str13, java.lang.String str14, java.lang.String str15, java.lang.String str16, java.lang.String str17, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("wallet_address", str, true);
        eventParamsList.put("business_type", str2, true);
        eventParamsList.put("source", str3, true);
        eventParamsList.put("activity_name", str4, true);
        eventParamsList.put(EopTrackEvent.KEY_BUTTON_NAME, str5, true);
        eventParamsList.put("from_token_address", str6, true);
        eventParamsList.put("from_amount_usdt", str7, true);
        eventParamsList.put("to_token_address", str8, true);
        eventParamsList.put("to_amount_usdt", str9, true);
        eventParamsList.put("swap_type", str10, true);
        eventParamsList.put("balance_bracket", str11, true);
        eventParamsList.put("slippage", str12, true);
        eventParamsList.put("liquidity_source", str13, true);
        eventParamsList.put("bridge_selection", str14, true);
        eventParamsList.put("network_fee_details", str15, true);
        eventParamsList.put("authorize_amount", str16, true);
        EventParamsList.put$default(eventParamsList, "MEV_status", str17, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final void EZpvd(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        C32866mlf.onEvent$default("Web3_ShareLink_VisitAPP_View", (TrackChannel[]) null, new Function1() { // from class: o.hvb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C23301hve.AEQbTJ(str3, str, str2, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit AEQbTJ(java.lang.String str, java.lang.String str2, java.lang.String str3, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("from_channel_id", str, false);
        eventParamsList.put("from_module", str2, true);
        eventParamsList.put("to_module", str3, true);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void trackDexBridgeProviderListClick$default(java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        KWHzl(str, str2);
    }

    public static final void KWHzl(@NotNull final java.lang.String str, @NotNull final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C32866mlf.onEvent$default("DEXSwap_Bridge_ProviderList_Click", (TrackChannel[]) null, new Function1() { // from class: o.hva
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C23301hve.AEQbTJ(str, str2, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit AEQbTJ(java.lang.String str, java.lang.String str2, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put(EopTrackEvent.KEY_BUTTON_NAME, str, true);
        EventParamsList.put$default(eventParamsList, "rourter_name", str2, false, 4, null);
        return Unit.INSTANCE;
    }
}
