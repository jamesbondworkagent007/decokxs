package o;

import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.p2p.api.OtcExtraKeys;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC9847bdM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iwh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25437iwh {
    public static final void EZpvd(@NotNull EventParamsList eventParamsList, @NotNull C22402heg c22402heg) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        Intrinsics.checkNotNullParameter(c22402heg, "");
        EventParamsList.put$default(eventParamsList, "terminal", "android", false, 4, null);
        EventParamsList.put$default(eventParamsList, "wallet_address", c22402heg.AYXKKw(), false, 4, null);
        eventParamsList.put("is_trade_dialog", c22402heg.djBIcL(), true);
        eventParamsList.put(OtcExtraKeys.ORDER_FROM, c22402heg.OLrzqt(), true);
        eventParamsList.put("business_type", c22402heg.KWHzl(), true);
        eventParamsList.put(OtcExtraKeys.CRYPTO_ORDER_TYPE, c22402heg.copydefault(), true);
        eventParamsList.put("trade_direction", c22402heg.EZpvd(), true);
        eventParamsList.put("page_name", c22402heg.AEQbTJ(), true);
        java.lang.String strGEmmrt = c22402heg.gEmmrt();
        EventParamsList.put$default(eventParamsList, "is_tee", strGEmmrt == null ? "" : strGEmmrt, false, 4, null);
    }

    public static final void EZpvd(@NotNull EventParamsList eventParamsList, @NotNull C22396hea c22396hea) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        Intrinsics.checkNotNullParameter(c22396hea, "");
        eventParamsList.put("submit_type", c22396hea.copydefault(), true);
        copydefault(eventParamsList, c22396hea.OLrzqt());
        C22342hdZ c22342hdZKWHzl = c22396hea.KWHzl();
        EventParamsList.put$default(eventParamsList, "slippage", c22342hdZKWHzl.gEmmrt(), false, 4, null);
        eventParamsList.put("mev_protection", c22342hdZKWHzl.KWHzl(), true);
        eventParamsList.put("mev_route_select", c22342hdZKWHzl.valueOf(), true);
        eventParamsList.put("mev_route_type", c22342hdZKWHzl.AhwBna(), true);
        EventParamsList.put$default(eventParamsList, "priority_fee", c22342hdZKWHzl.AYXKKw(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "gas_price", c22342hdZKWHzl.OLrzqt(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "max_tx_fee", c22342hdZKWHzl.AEQbTJ(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "expire_time", c22342hdZKWHzl.copydefault(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "provider_name", c22342hdZKWHzl.djBIcL(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "provider_router", c22342hdZKWHzl.EZpvd(), false, 4, null);
        C22411hep c22411hepEZpvd = c22396hea.EZpvd();
        eventParamsList.put("slippage_auto", c22411hepEZpvd.values(), true);
        eventParamsList.put("priority_fee_tier", c22411hepEZpvd.DbNXlk(), true);
        eventParamsList.put("gas_price_tier", c22411hepEZpvd.valueOf(), true);
        eventParamsList.put("if_preset", c22411hepEZpvd.gEmmrt(), true);
        eventParamsList.put("if_preset_default", c22411hepEZpvd.AYXKKw(), true);
        eventParamsList.put("if_provider_default", c22411hepEZpvd.AhwBna(), true);
        eventParamsList.put("if_liquidity_default", c22411hepEZpvd.djBIcL(), true);
        eventParamsList.put("amount_enter_by", c22411hepEZpvd.EZpvd(), true);
        EventParamsList.put$default(eventParamsList, "amount_tier", c22411hepEZpvd.KWHzl(), false, 4, null);
        eventParamsList.put("condition_enter_by", c22411hepEZpvd.OLrzqt(), true);
        EventParamsList.put$default(eventParamsList, "condition_tier", c22411hepEZpvd.copydefault(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "basic_token", c22411hepEZpvd.AEQbTJ(), false, 4, null);
    }

    public static final void copydefault(@NotNull EventParamsList eventParamsList, @NotNull C22404hei c22404hei) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        Intrinsics.checkNotNullParameter(c22404hei, "");
        EventParamsList.put$default(eventParamsList, "chain_name", c22404hei.OLrzqt(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "chain_name_bridgeto", c22404hei.EZpvd(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "from_token_address", c22404hei.copydefault(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "to_token_address", c22404hei.gEmmrt(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "from_token_symbol", c22404hei.KWHzl(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "to_token_symbol", c22404hei.valueOf(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "from_token_amount", c22404hei.AEQbTJ(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "to_token_amount", c22404hei.djBIcL(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "from_token_usdt", c22404hei.AYXKKw(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "to_token_usdt", c22404hei.AhwBna(), false, 4, null);
    }

    public static /* synthetic */ void trackViewEventClick$default(java.lang.String str, C22402heg c22402heg, java.util.Map map, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            map = null;
        }
        if ((i & 8) != 0) {
            list = yDY.AhwBna();
        }
        KWHzl(str, c22402heg, (java.util.Map<java.lang.String, java.lang.String>) map, (java.util.List<java.lang.String>) list);
    }

    public static final void KWHzl(@NotNull java.lang.String str, @NotNull final C22402heg c22402heg, final java.util.Map<java.lang.String, java.lang.String> map, @NotNull final java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(c22402heg, "");
        Intrinsics.checkNotNullParameter(list, "");
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "DEXTrade_Home_FullPage_Click")) {
            InterfaceC9847bdM.StateListAnimator.event$default((InterfaceC9847bdM) C43251rlk.copydefault(InterfaceC9847bdM.class), str, new TrackChannel[0], new Function1() { // from class: o.iwl
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C25437iwh.AhwBna(c22402heg, map, list, (EventParamsList) obj);
                }
            }, false, 8, null);
        } else {
            C32866mlf.onEvent$default(str, (TrackChannel[]) null, new Function1() { // from class: o.iwj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C25437iwh.gEmmrt(c22402heg, map, list, (EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
        }
    }

    public static final Unit AhwBna(C22402heg c22402heg, java.util.Map map, java.util.List list, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EZpvd(eventParamsList, c22402heg);
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                java.lang.String str = (java.lang.String) entry.getKey();
                eventParamsList.put(str, (java.lang.String) entry.getValue(), list.indexOf(str) != -1);
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(C22402heg c22402heg, java.util.Map map, java.util.List list, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EZpvd(eventParamsList, c22402heg);
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                java.lang.String str = (java.lang.String) entry.getKey();
                eventParamsList.put(str, (java.lang.String) entry.getValue(), list.indexOf(str) != -1);
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void trackFullPageSubmitEventClick$default(java.lang.String str, C22402heg c22402heg, C22396hea c22396hea, java.util.Map map, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            map = null;
        }
        if ((i & 16) != 0) {
            list = yDY.AhwBna();
        }
        OLrzqt(str, c22402heg, c22396hea, map, list);
    }

    public static final void OLrzqt(@NotNull java.lang.String str, @NotNull final C22402heg c22402heg, @NotNull final C22396hea c22396hea, final java.util.Map<java.lang.String, java.lang.String> map, @NotNull final java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(c22402heg, "");
        Intrinsics.checkNotNullParameter(c22396hea, "");
        Intrinsics.checkNotNullParameter(list, "");
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "DEXTrade_Home_FullPageSubmit_Click")) {
            InterfaceC9847bdM.StateListAnimator.event$default((InterfaceC9847bdM) C43251rlk.copydefault(InterfaceC9847bdM.class), str, new TrackChannel[0], new Function1() { // from class: o.iwi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C25437iwh.copydefault(c22402heg, c22396hea, map, list, (EventParamsList) obj);
                }
            }, false, 8, null);
        } else {
            C32866mlf.onEvent$default(str, (TrackChannel[]) null, new Function1() { // from class: o.iwe
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C25437iwh.AEQbTJ(c22402heg, c22396hea, map, list, (EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
        }
    }

    public static final Unit copydefault(C22402heg c22402heg, C22396hea c22396hea, java.util.Map map, java.util.List list, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EZpvd(eventParamsList, c22402heg);
        EZpvd(eventParamsList, c22396hea);
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                java.lang.String str = (java.lang.String) entry.getKey();
                eventParamsList.put(str, (java.lang.String) entry.getValue(), list.indexOf(str) != -1);
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C22402heg c22402heg, C22396hea c22396hea, java.util.Map map, java.util.List list, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EZpvd(eventParamsList, c22402heg);
        EZpvd(eventParamsList, c22396hea);
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                java.lang.String str = (java.lang.String) entry.getKey();
                eventParamsList.put(str, (java.lang.String) entry.getValue(), list.indexOf(str) != -1);
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void trackDexTradeSelectDappEvent$default(java.lang.String str, C22402heg c22402heg, C22404hei c22404hei, java.util.Map map, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            map = null;
        }
        if ((i & 16) != 0) {
            list = yDY.AhwBna();
        }
        AEQbTJ(str, c22402heg, c22404hei, (java.util.Map<java.lang.String, java.lang.String>) map, (java.util.List<java.lang.String>) list);
    }

    public static final void AEQbTJ(@NotNull java.lang.String str, @NotNull final C22402heg c22402heg, @NotNull final C22404hei c22404hei, final java.util.Map<java.lang.String, java.lang.String> map, @NotNull final java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(c22402heg, "");
        Intrinsics.checkNotNullParameter(c22404hei, "");
        Intrinsics.checkNotNullParameter(list, "");
        C32866mlf.onEvent$default(str, (TrackChannel[]) null, new Function1() { // from class: o.iwn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C25437iwh.KWHzl(c22402heg, c22404hei, map, list, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit KWHzl(C22402heg c22402heg, C22404hei c22404hei, java.util.Map map, java.util.List list, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EZpvd(eventParamsList, c22402heg);
        copydefault(eventParamsList, c22404hei);
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                java.lang.String str = (java.lang.String) entry.getKey();
                eventParamsList.put(str, (java.lang.String) entry.getValue(), list.indexOf(str) != -1);
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void trackPageViewEvent$default(java.lang.String str, C22402heg c22402heg, java.util.Map map, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            map = null;
        }
        if ((i & 8) != 0) {
            list = yDY.AhwBna();
        }
        EZpvd(str, c22402heg, (java.util.Map<java.lang.String, java.lang.String>) map, (java.util.List<java.lang.String>) list);
    }

    public static final void EZpvd(@NotNull java.lang.String str, @NotNull final C22402heg c22402heg, final java.util.Map<java.lang.String, java.lang.String> map, @NotNull final java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(c22402heg, "");
        Intrinsics.checkNotNullParameter(list, "");
        int iHashCode = str.hashCode();
        if (iHashCode == -712266908 ? str.equals("DEXTrade_Confirm_Page_View") : !(iHashCode == -622891863 ? !str.equals("DEXTrade_Confirm_Page_Click") : !(iHashCode == 1476845336 && str.equals("DEXTrade_Home_FullPage_View")))) {
            InterfaceC9847bdM.StateListAnimator.event$default((InterfaceC9847bdM) C43251rlk.copydefault(InterfaceC9847bdM.class), str, new TrackChannel[0], new Function1() { // from class: o.iwk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C25437iwh.AEQbTJ(c22402heg, map, list, (EventParamsList) obj);
                }
            }, false, 8, null);
        } else {
            C32866mlf.onEvent$default(str, (TrackChannel[]) null, new Function1() { // from class: o.iwm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C25437iwh.valueOf(c22402heg, map, list, (EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
        }
    }

    public static final Unit AEQbTJ(C22402heg c22402heg, java.util.Map map, java.util.List list, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EZpvd(eventParamsList, c22402heg);
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                java.lang.String str = (java.lang.String) entry.getKey();
                eventParamsList.put(str, (java.lang.String) entry.getValue(), list.indexOf(str) != -1);
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(C22402heg c22402heg, java.util.Map map, java.util.List list, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EZpvd(eventParamsList, c22402heg);
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                java.lang.String str = (java.lang.String) entry.getKey();
                eventParamsList.put(str, (java.lang.String) entry.getValue(), list.indexOf(str) != -1);
            }
        }
        return Unit.INSTANCE;
    }
}
