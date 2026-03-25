package o;

import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.unify_trade.biz.DexInstrument;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kDJ implements InterfaceC27809kEc {
    @Override // o.InterfaceC27809kEc
    public void EZpvd(@NotNull final java.lang.String str, final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        C32866mlf.onEvent$default("Explore_Market_Module_View", (TrackChannel[]) null, new Function1() { // from class: o.kDG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kDJ.copydefault(str, str2, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit copydefault(java.lang.String str, java.lang.String str2, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "tab", str, false, 4, null);
        if (str2 != null) {
            EventParamsList.put$default(eventParamsList, "sub_tab", str2, false, 4, null);
        }
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC27809kEc
    public void copydefault(@NotNull final java.lang.String str, final java.lang.String str2, final int i, final java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        C32866mlf.onEvent$default("Explore_Market_TradingPair_Click", (TrackChannel[]) null, new Function1() { // from class: o.kDP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kDJ.valueOf(str, i, str2, str3, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit valueOf(java.lang.String str, int i, java.lang.String str2, java.lang.String str3, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "tab", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "rank_order", java.lang.String.valueOf(i), false, 4, null);
        if (str2 != null) {
            EventParamsList.put$default(eventParamsList, "token_pair", str2 + "1", false, 4, null);
        }
        if (str3 != null) {
            EventParamsList.put$default(eventParamsList, "tokenContractAddress", str3, false, 4, null);
        }
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC27809kEc
    public void copydefault(@NotNull final java.lang.String str, final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        C32866mlf.onEvent$default("Explore_Market_ViewAll_Click", (TrackChannel[]) null, new Function1() { // from class: o.kDI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kDJ.OLrzqt(str, str2, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit OLrzqt(java.lang.String str, java.lang.String str2, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "tab", str, false, 4, null);
        if (str2 != null) {
            EventParamsList.put$default(eventParamsList, "sub_tab", str2, false, 4, null);
        }
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC27809kEc
    public void KWHzl(@NotNull final java.lang.String str, final java.lang.String str2, final int i, final java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        C32866mlf.onEvent$default("Explore_Market_LongPress_View", (TrackChannel[]) null, new Function1() { // from class: o.kDM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kDJ.copydefault(str, i, str2, str3, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit copydefault(java.lang.String str, int i, java.lang.String str2, java.lang.String str3, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "tab", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "rank_order", java.lang.String.valueOf(i), false, 4, null);
        if (str2 != null) {
            EventParamsList.put$default(eventParamsList, "token_pair", str2, false, 4, null);
        }
        if (str3 != null) {
            EventParamsList.put$default(eventParamsList, "tokenContractAddress", str3, false, 4, null);
        }
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC27809kEc
    public void OLrzqt(@NotNull final java.lang.String str, final java.lang.String str2, final int i, final java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        C32866mlf.onEvent$default("Explore_Market_LongPress_Click", (TrackChannel[]) null, new Function1() { // from class: o.kDH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kDJ.OLrzqt(str, i, str2, str3, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit OLrzqt(java.lang.String str, int i, java.lang.String str2, java.lang.String str3, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "tab", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "rank_order", java.lang.String.valueOf(i), false, 4, null);
        if (str2 != null) {
            EventParamsList.put$default(eventParamsList, "token_pair", str2, false, 4, null);
        }
        if (str3 != null) {
            EventParamsList.put$default(eventParamsList, "tokenContractAddress", str3, false, 4, null);
        }
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC27809kEc
    public void KWHzl(@NotNull final DexInstrument dexInstrument, @NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(dexInstrument, "");
        Intrinsics.checkNotNullParameter(str, "");
        C32866mlf.onEvent$default("Explore_Marketcard_BoostIcon_Click", (TrackChannel[]) null, new Function1() { // from class: o.kDK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kDJ.EZpvd(dexInstrument, str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit EZpvd(DexInstrument dexInstrument, java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "token_contract_address", dexInstrument.getTokenContractAddress(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "deal_name", dexInstrument.getTokenSymbol(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "chain_name", dexInstrument.getChainName(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "tab", str, false, 4, null);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC27809kEc
    public void AEQbTJ(@NotNull final DexInstrument dexInstrument, @NotNull final java.lang.String str, @NotNull final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(dexInstrument, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C32866mlf.onEvent$default("Explore_Marketcard_BoostIcon_Click", (TrackChannel[]) null, new Function1() { // from class: o.kDO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kDJ.EZpvd(dexInstrument, str, str2, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit EZpvd(DexInstrument dexInstrument, java.lang.String str, java.lang.String str2, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "token_contract_address", dexInstrument.getTokenContractAddress(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "deal_name", dexInstrument.getTokenSymbol(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "chain_name", dexInstrument.getChainName(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "tab", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, C27989kKu.Companion.AhwBna(), str2, false, 4, null);
        return Unit.INSTANCE;
    }
}
