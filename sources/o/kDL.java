package o;

import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.unify_trade.biz.DexInstrument;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kDL implements InterfaceC27808kEb {
    @Override // o.InterfaceC27808kEb
    public void copydefault(@NotNull final java.lang.String str, final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        C32866mlf.onEvent$default("HomePage_Ranking_Module_View", (TrackChannel[]) null, new Function1() { // from class: o.kDN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kDL.copydefault(str, str2, (EventParamsList) obj);
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

    @Override // o.InterfaceC27808kEb
    public void EZpvd(@NotNull final java.lang.String str, final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        C32866mlf.onEvent$default("HomePage_Ranking_RankingTab_Click", (TrackChannel[]) null, new Function1() { // from class: o.kDX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kDL.AEQbTJ(str, str2, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit AEQbTJ(java.lang.String str, java.lang.String str2, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "tab", str, false, 4, null);
        if (str2 != null) {
            EventParamsList.put$default(eventParamsList, "sub_tab", str2, false, 4, null);
        }
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC27808kEb
    public void copydefault(@NotNull final java.lang.String str, final java.lang.String str2, @NotNull final java.lang.String str3, @NotNull final java.lang.String str4, @NotNull final java.lang.String str5, final java.lang.String str6, final java.lang.Boolean bool) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        C32866mlf.onEvent$default("HomePage_Ranking_TradingPair_Click", (TrackChannel[]) null, new Function1() { // from class: o.kDR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kDL.EZpvd(str, str2, str3, str4, str5, str6, bool, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit EZpvd(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.Boolean bool, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "tab", str, false, 4, null);
        if (str2 != null) {
            EventParamsList.put$default(eventParamsList, "sub_tab", str2, false, 4, null);
        }
        EventParamsList.put$default(eventParamsList, "rank_order", str3, false, 4, null);
        EventParamsList.put$default(eventParamsList, "token_pair", str4, false, 4, null);
        EventParamsList.put$default(eventParamsList, "biz_type", str5, false, 4, null);
        if (str6 != null) {
            EventParamsList.put$default(eventParamsList, "token_contract_address", str6, false, 4, null);
        }
        EventParamsList.put$default(eventParamsList, "is_boost", C33129mqd.gEmmrt(bool), false, 4, null);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC27808kEb
    public void OLrzqt(@NotNull final java.lang.String str, final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        C32866mlf.onEvent$default("HomePage_Ranking_ViewAll_Click", (TrackChannel[]) null, new Function1() { // from class: o.kDT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kDL.AhwBna(str, str2, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit AhwBna(java.lang.String str, java.lang.String str2, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "tab", str, false, 4, null);
        if (str2 != null) {
            EventParamsList.put$default(eventParamsList, "sub_tab", str2, false, 4, null);
        }
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC27808kEb
    public void ba_() {
        C32866mlf.onEvent$default("HomePage_Ranking_FavouriteDropDown_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
    }

    @Override // o.InterfaceC27808kEb
    public void AEQbTJ(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C32866mlf.onEvent$default("HomePage_Favourites_BottomSheet_Click", (TrackChannel[]) null, new Function1() { // from class: o.kDQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kDL.copydefault(str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit copydefault(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "select_tab", str, false, 4, null);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC27808kEb
    public void OLrzqt() {
        C32866mlf.onEvent$default("HomePage_FavouriteBottomSheet_Manage_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
    }

    @Override // o.InterfaceC27808kEb
    public void aZ_() {
        C32866mlf.onEvent$default("HomePage_FavouriteBottomSheet_Item_Drag", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
    }

    @Override // o.InterfaceC27808kEb
    public void EZpvd(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3, @NotNull final java.lang.String str4, @NotNull final java.lang.String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        C32866mlf.onEvent$default("HomePage_Favorites_Token_Drag", (TrackChannel[]) null, new Function1() { // from class: o.kDU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kDL.copydefault(str, str2, str3, str4, str5, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit copydefault(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("token_pair", str, false);
        eventParamsList.put("biz_type", str2, true);
        eventParamsList.put("from_position", str3, false);
        eventParamsList.put("to_position", str4, true);
        eventParamsList.put("token_contract_address", str5, false);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC27808kEb
    public void AEQbTJ(@NotNull final java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C32866mlf.onEvent$default("HomePage_Favorites_FloatingWindow_View", (TrackChannel[]) null, new Function1() { // from class: o.kDZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kDL.EZpvd(str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit EZpvd(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("token_pair", str, false);
        eventParamsList.put("biz_type", str, true);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC27808kEb
    public void AEQbTJ(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3, @NotNull final java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        C32866mlf.onEvent$default("DiscoverPage_Favorites_FloatingWindow_Click", (TrackChannel[]) null, new Function1() { // from class: o.kDS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kDL.AEQbTJ(str, str2, str3, str4, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit AEQbTJ(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("token_pair", str, false);
        eventParamsList.put("biz_type", str2, true);
        eventParamsList.put("tab", str3, true);
        eventParamsList.put("button_type", str4, false);
        return Unit.INSTANCE;
    }

    public void copydefault(final java.lang.String str) {
        C32866mlf.onEvent$default("HomePage_Ranking_BusinessSwitch_Click", (TrackChannel[]) null, new Function1() { // from class: o.kDY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kDL.valueOf(str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit valueOf(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("ranking", Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "SWAP") ? "futures" : "spot", true);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC27808kEb
    public void EZpvd(@NotNull final DexInstrument dexInstrument, @NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(dexInstrument, "");
        Intrinsics.checkNotNullParameter(str, "");
        C32866mlf.onEvent$default("Cedefi_Tag_Icon_Click", (TrackChannel[]) null, new Function1() { // from class: o.kDV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kDL.KWHzl(dexInstrument, str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit KWHzl(DexInstrument dexInstrument, java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "token_contract_address", dexInstrument.getTokenContractAddress(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "deal_name", dexInstrument.getTokenSymbol(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "chain_name", dexInstrument.getChainName(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "tab", str, false, 4, null);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC27808kEb
    public void OLrzqt(@NotNull final DexInstrument dexInstrument, @NotNull final java.lang.String str, @NotNull final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(dexInstrument, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C32866mlf.onEvent$default("HomePage_Ranking_BoostIcon_Click", (TrackChannel[]) null, new Function1() { // from class: o.kDW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kDL.EZpvd(dexInstrument, str, str2, (EventParamsList) obj);
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
