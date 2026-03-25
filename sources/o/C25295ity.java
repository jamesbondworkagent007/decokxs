package o;

import com.okinc.business.dexlogic.main.swap.trade.status.helper.SwapState;
import com.okinc.business.dexlogic.track.DexTrackEventParameter;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ity, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25295ity {

    /* JADX INFO: renamed from: o.ity$ActionBar */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[SwapState.values().length];
            try {
                iArr[SwapState.SWAP.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[SwapState.SWAP_CHAIN_MARKET_UNSUPPORTED_FOR_DAPP.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[SwapState.BRIDGE_UNSUPPORTED_CHAIN_PAIR_FOR_DAPP.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[SwapState.SWAP_UNSUPPORTED_FOR_DAPP.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[SwapState.INSUFFICIENT_BALANCE.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[SwapState.SWITCH_WALLET.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[SwapState.APPROVE.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[SwapState.APPROVED_AND_NEED_CANCEL_APPROVE.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr[SwapState.REGISTER.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            OLrzqt = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String KWHzl(int i) {
        return i != 0 ? i != 1 ? "advanced" : "buy" : "sell";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String copydefault(boolean z) {
        return z ? "yes" : "no";
    }

    public static final void AEQbTJ(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3, @NotNull final java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        C32866mlf.onEvent$default("DEXSwap_Home_Page_View", (TrackChannel[]) null, new Function1() { // from class: o.itA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C25295ity.KWHzl(str, str2, str3, str4, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit KWHzl(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "business_type", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "tab_name", str2, false, 4, null);
        EventParamsList.put$default(eventParamsList, "trade_dialog", str3, false, 4, null);
        EventParamsList.put$default(eventParamsList, "source", str4, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final void KWHzl(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3, @NotNull final java.lang.String str4, @NotNull final java.lang.String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        C32866mlf.onEvent$default("DEXSwap_Full_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.itv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C25295ity.AEQbTJ(str, str2, str3, str4, str5, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit AEQbTJ(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "business_type", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "tab_name", str2, false, 4, null);
        EventParamsList.put$default(eventParamsList, "trade_dialog", str3, false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, str4, false, 4, null);
        EventParamsList.put$default(eventParamsList, "chain", str5, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final void copydefault(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3, @NotNull final java.lang.String str4, @NotNull final java.lang.String str5, @NotNull final java.lang.String str6, @NotNull final java.lang.String str7, @NotNull final java.lang.String str8, @NotNull final java.lang.String str9, @NotNull final java.lang.String str10, @NotNull final java.lang.String str11, @NotNull final java.lang.String str12) {
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
        C32866mlf.onEvent$default("DEXSwap_Simplemode_Next_Click", (TrackChannel[]) null, new Function1() { // from class: o.itu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C25295ity.OLrzqt(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit OLrzqt(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.lang.String str11, java.lang.String str12, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "business_type", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "tab_name", str2, false, 4, null);
        EventParamsList.put$default(eventParamsList, "trade_dialog", str3, false, 4, null);
        EventParamsList.put$default(eventParamsList, "source", str4, false, 4, null);
        EventParamsList.put$default(eventParamsList, "from_token_address", str5, false, 4, null);
        EventParamsList.put$default(eventParamsList, "from_token_amount", str6, false, 4, null);
        EventParamsList.put$default(eventParamsList, "from_amount_usdt", str7, false, 4, null);
        EventParamsList.put$default(eventParamsList, "to_token_address", str8, false, 4, null);
        EventParamsList.put$default(eventParamsList, "to_token_amount", str9, false, 4, null);
        EventParamsList.put$default(eventParamsList, "to_amount_usdt", str10, false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, str11, false, 4, null);
        EventParamsList.put$default(eventParamsList, "chain", str12, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final java.lang.String EZpvd(@NotNull SwapState swapState) {
        Intrinsics.checkNotNullParameter(swapState, "");
        switch (ActionBar.OLrzqt[swapState.ordinal()]) {
            case 1:
                return "next";
            case 2:
            case 3:
            case 4:
                return "DAPP";
            case 5:
                return "insufficient_balance";
            case 6:
                return "switch_wallet";
            case 7:
            case 8:
            case 9:
                return "approve";
            default:
                return "";
        }
    }

    public static final java.lang.String AEQbTJ(int i) {
        if (i == 0) {
            return DexTrackEventParameter.ButtonName.BUY_TAB.getValue();
        }
        if (i == 1) {
            return DexTrackEventParameter.ButtonName.SELL_TAB.getValue();
        }
        return DexTrackEventParameter.ButtonName.ADVANCED_TAB.getValue();
    }
}
