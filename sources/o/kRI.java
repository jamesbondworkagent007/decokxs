package o;

import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedChainListEvents;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedConfirmEvents;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedDefaultListEvents;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedDepthDisplayEvents;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedDepthTierEvents;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedOrderTypeEvents;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedSearchListEvents;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedSettingsEvents;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC9847bdM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@yCR
public final class kRI {
    public final java.util.Set<java.lang.Object> KWHzl;
    public final InterfaceC9847bdM OLrzqt;

    public kRI(@NotNull InterfaceC9847bdM interfaceC9847bdM) {
        Intrinsics.checkNotNullParameter(interfaceC9847bdM, "");
        this.OLrzqt = interfaceC9847bdM;
        this.KWHzl = yEE.AhwBna(AdvancedDefaultListEvents.TokenSelect, AdvancedChainListEvents.ChainSelect, AdvancedSearchListEvents.TokenSelect);
    }

    @yCM
    public kRI() {
        this((InterfaceC9847bdM) C43251rlk.copydefault(InterfaceC9847bdM.class));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.kRI */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void trackPageView$default(kRI kri, java.lang.String str, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            map = C56424yEw.KWHzl();
        }
        kri.valueOf(str, (java.util.Map<java.lang.String, java.lang.String>) map);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void valueOf(@NotNull final java.lang.String str, @NotNull final java.util.Map<java.lang.String, java.lang.String> map) {
        java.lang.String str2;
        java.lang.String str3;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        switch (str.hashCode()) {
            case -1453945952:
                if (str.equals("advanced_settings")) {
                    str3 = "DEXTrade_Setting_Page_View";
                    str2 = str3;
                }
                break;
            case -718837726:
                str.equals("advanced");
                break;
            case -225833492:
                if (str.equals("advanced_openorders")) {
                    str3 = "DEXTrade_Openorder_Page_View";
                    str2 = str3;
                }
                break;
            case 26653603:
                str2 = !str.equals("advanced_confirm") ? "DEXTrade_Home_FullPage_View" : "DEXTrade_Confirm_Page_View";
                break;
            case 790619706:
                if (str.equals("advanced_tokenlist")) {
                    str3 = "DEXTrade_Tokenlist_Page_View";
                    str2 = str3;
                }
                break;
            case 1467335585:
                if (str.equals("advanced_mypositions")) {
                    str3 = "DEXTrade_Myposition_Page_View";
                    str2 = str3;
                }
                break;
        }
        if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "DEXTrade_Home_FullPage_View") || Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "DEXTrade_Confirm_Page_View")) {
            InterfaceC9847bdM.StateListAnimator.event$default(this.OLrzqt, str2, new TrackChannel[0], new Function1() { // from class: o.kRS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return kRI.iwGUEr(str, map, (EventParamsList) obj);
                }
            }, false, 8, null);
        } else {
            C32866mlf.onEvent$default(str2, (TrackChannel[]) null, new Function1() { // from class: o.kRU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return kRI.hDKMBd(str, map, (EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
        }
    }

    public static final Unit iwGUEr(java.lang.String str, java.util.Map map, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "business_type", "advanced", false, 4, null);
        EventParamsList.put$default(eventParamsList, "page_name", str, false, 4, null);
        for (Map.Entry entry : map.entrySet()) {
            EventParamsList.put$default(eventParamsList, (java.lang.String) entry.getKey(), (java.lang.String) entry.getValue(), false, 4, null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit hDKMBd(java.lang.String str, java.util.Map map, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "page_name", str, false, 4, null);
        for (Map.Entry entry : map.entrySet()) {
            EventParamsList.put$default(eventParamsList, (java.lang.String) entry.getKey(), (java.lang.String) entry.getValue(), false, 4, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.kRI */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void trackHomeEvent$default(kRI kri, java.lang.String str, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            map = C56424yEw.KWHzl();
        }
        kri.KWHzl(str, (java.util.Map<java.lang.String, java.lang.String>) map);
    }

    public final void KWHzl(@NotNull final java.lang.String str, @NotNull final java.util.Map<java.lang.String, java.lang.String> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        InterfaceC9847bdM.StateListAnimator.event$default(this.OLrzqt, "DEXTrade_Home_FullPage_Click", new TrackChannel[0], new Function1() { // from class: o.kSc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kRI.fARcdN(str, map, (EventParamsList) obj);
            }
        }, false, 8, null);
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) AdvancedConfirmEvents.Confirm.getValue())) {
            KWHzl(map);
        }
    }

    public static final Unit fARcdN(java.lang.String str, java.util.Map map, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "page_name", "advanced", false, 4, null);
        EventParamsList.put$default(eventParamsList, "advanced_button_name", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, str, false, 4, null);
        for (Map.Entry entry : map.entrySet()) {
            EventParamsList.put$default(eventParamsList, (java.lang.String) entry.getKey(), (java.lang.String) entry.getValue(), false, 4, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.kRI */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void trackOrderTypeEvent$default(kRI kri, java.lang.String str, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            map = C56424yEw.KWHzl();
        }
        kri.djBIcL(str, map);
    }

    public final void djBIcL(@NotNull final java.lang.String str, @NotNull final java.util.Map<java.lang.String, java.lang.String> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        InterfaceC9847bdM.StateListAnimator.event$default(this.OLrzqt, "DEXTrade_Home_FullPage_Click", new TrackChannel[0], new Function1() { // from class: o.kRN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kRI.getNewProxyInstance(str, map, (EventParamsList) obj);
            }
        }, false, 8, null);
    }

    public static final Unit getNewProxyInstance(java.lang.String str, java.util.Map map, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "page_name", "advanced_ordertype", false, 4, null);
        EventParamsList.put$default(eventParamsList, "advanced_ordertype_button_name", AdvancedOrderTypeEvents.Select.getValue(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "advanced_ordertype_button_name", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, str, false, 4, null);
        for (Map.Entry entry : map.entrySet()) {
            EventParamsList.put$default(eventParamsList, (java.lang.String) entry.getKey(), (java.lang.String) entry.getValue(), false, 4, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.kRI */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void trackLimitByEvent$default(kRI kri, java.lang.String str, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            map = C56424yEw.KWHzl();
        }
        kri.copydefault(str, (java.util.Map<java.lang.String, java.lang.String>) map);
    }

    public final void copydefault(@NotNull final java.lang.String str, @NotNull final java.util.Map<java.lang.String, java.lang.String> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        C32866mlf.onEvent$default("DEXTrade_Home_FullPage_Click", (TrackChannel[]) null, new Function1() { // from class: o.kRY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kRI.fJNWhG(str, map, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit fJNWhG(java.lang.String str, java.util.Map map, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "page_name", "limit_condition", false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, str, false, 4, null);
        for (Map.Entry entry : map.entrySet()) {
            EventParamsList.put$default(eventParamsList, (java.lang.String) entry.getKey(), (java.lang.String) entry.getValue(), false, 4, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.kRI */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void trackDepthTierEvent$default(kRI kri, java.lang.String str, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            map = C56424yEw.KWHzl();
        }
        kri.OLrzqt(str, (java.util.Map<java.lang.String, java.lang.String>) map);
    }

    public final void OLrzqt(@NotNull final java.lang.String str, @NotNull final java.util.Map<java.lang.String, java.lang.String> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        InterfaceC9847bdM.StateListAnimator.event$default(this.OLrzqt, "DEXTrade_Home_FullPage_Click", new TrackChannel[0], new Function1() { // from class: o.kSa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kRI.AuCTel(str, map, (EventParamsList) obj);
            }
        }, false, 8, null);
    }

    public static final Unit AuCTel(java.lang.String str, java.util.Map map, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "page_name", "advanced_depthtier", false, 4, null);
        EventParamsList.put$default(eventParamsList, "advanced_depthtier_button_name", AdvancedDepthTierEvents.Select.getValue(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "advanced_depthtier_button_name", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, str, false, 4, null);
        for (Map.Entry entry : map.entrySet()) {
            EventParamsList.put$default(eventParamsList, (java.lang.String) entry.getKey(), (java.lang.String) entry.getValue(), false, 4, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.kRI */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void trackDepthDisplayEvent$default(kRI kri, java.lang.String str, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            map = C56424yEw.KWHzl();
        }
        kri.AEQbTJ(str, (java.util.Map<java.lang.String, java.lang.String>) map);
    }

    public final void AEQbTJ(@NotNull final java.lang.String str, @NotNull final java.util.Map<java.lang.String, java.lang.String> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        InterfaceC9847bdM.StateListAnimator.event$default(this.OLrzqt, "DEXTrade_Home_FullPage_Click", new TrackChannel[0], new Function1() { // from class: o.kSb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kRI.fIwbmz(str, map, (EventParamsList) obj);
            }
        }, false, 8, null);
    }

    public static final Unit fIwbmz(java.lang.String str, java.util.Map map, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "page_name", "advanced_depthdisplay", false, 4, null);
        EventParamsList.put$default(eventParamsList, "advanced_depthdisplay_button_name", AdvancedDepthDisplayEvents.Select.getValue(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "advanced_depthdisplay_button_name", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, str, false, 4, null);
        for (Map.Entry entry : map.entrySet()) {
            EventParamsList.put$default(eventParamsList, (java.lang.String) entry.getKey(), (java.lang.String) entry.getValue(), false, 4, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.kRI */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void trackOpenOrderEvent$default(kRI kri, java.lang.String str, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            map = C56424yEw.KWHzl();
        }
        kri.gEmmrt(str, map);
    }

    public final void gEmmrt(@NotNull final java.lang.String str, @NotNull final java.util.Map<java.lang.String, java.lang.String> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        C32866mlf.onEvent$default("DEXTrade_Openorder_Page_Click", (TrackChannel[]) null, new Function1() { // from class: o.kRQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kRI.getFieldNames(str, map, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit getFieldNames(java.lang.String str, java.util.Map map, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "page_name", "advanced_openorders", false, 4, null);
        EventParamsList.put$default(eventParamsList, "openorder_button_name", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, str, false, 4, null);
        for (Map.Entry entry : map.entrySet()) {
            EventParamsList.put$default(eventParamsList, (java.lang.String) entry.getKey(), (java.lang.String) entry.getValue(), false, 4, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.kRI */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void trackMyPositionsEvent$default(kRI kri, java.lang.String str, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            map = C56424yEw.KWHzl();
        }
        kri.AhwBna(str, (java.util.Map<java.lang.String, java.lang.String>) map);
    }

    public final void AhwBna(@NotNull final java.lang.String str, @NotNull final java.util.Map<java.lang.String, java.lang.String> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        C32866mlf.onEvent$default("DEXTrade_Myposition_Page_Click", (TrackChannel[]) null, new Function1() { // from class: o.kSg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kRI.ejfBZ(str, map, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit ejfBZ(java.lang.String str, java.util.Map map, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "page_name", "advanced_mypositions", false, 4, null);
        EventParamsList.put$default(eventParamsList, "myposition_button_name", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, str, false, 4, null);
        for (Map.Entry entry : map.entrySet()) {
            EventParamsList.put$default(eventParamsList, (java.lang.String) entry.getKey(), (java.lang.String) entry.getValue(), false, 4, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.kRI */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void trackTokenListEvent$default(kRI kri, InterfaceC30619lea interfaceC30619lea, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            map = C56424yEw.KWHzl();
        }
        kri.OLrzqt(interfaceC30619lea, (java.util.Map<java.lang.String, java.lang.String>) map);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OLrzqt(@NotNull final InterfaceC30619lea interfaceC30619lea, @NotNull final java.util.Map<java.lang.String, java.lang.String> map) {
        final java.lang.String str;
        Intrinsics.checkNotNullParameter(interfaceC30619lea, "");
        Intrinsics.checkNotNullParameter(map, "");
        if (!(interfaceC30619lea instanceof AdvancedDefaultListEvents)) {
            if (interfaceC30619lea instanceof AdvancedSearchListEvents) {
                str = "advanced_searchlist";
            } else {
                str = interfaceC30619lea instanceof AdvancedChainListEvents ? "advanced_chainlist" : "advanced_tokenlist";
            }
        }
        C32866mlf.onEvent$default("DEXTrade_Tokenlist_Page_Click", (TrackChannel[]) null, new Function1() { // from class: o.kSf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kRI.EZpvd(str, interfaceC30619lea, map, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        if (this.KWHzl.contains(interfaceC30619lea)) {
            DbNXlk(str, map);
        }
    }

    public static final Unit EZpvd(java.lang.String str, InterfaceC30619lea interfaceC30619lea, java.util.Map map, EventParamsList eventParamsList) {
        java.lang.String str2;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "page_name", str, false, 4, null);
        if (interfaceC30619lea instanceof AdvancedDefaultListEvents) {
            str2 = "default_list_button_name";
        } else if (interfaceC30619lea instanceof AdvancedSearchListEvents) {
            str2 = "search_list_button_name";
        } else {
            str2 = interfaceC30619lea instanceof AdvancedChainListEvents ? "chain_list_button_name" : "advanced_tokenlist";
        }
        EventParamsList.put$default(eventParamsList, str2, interfaceC30619lea.getValue(), false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, interfaceC30619lea.getValue(), false, 4, null);
        for (Map.Entry entry : map.entrySet()) {
            EventParamsList.put$default(eventParamsList, (java.lang.String) entry.getKey(), (java.lang.String) entry.getValue(), false, 4, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.kRI */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void trackConfirmEvents$default(kRI kri, java.lang.String str, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            map = C56424yEw.KWHzl();
        }
        kri.EZpvd(str, (java.util.Map<java.lang.String, java.lang.String>) map);
    }

    public final void EZpvd(@NotNull final java.lang.String str, @NotNull final java.util.Map<java.lang.String, java.lang.String> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        InterfaceC9847bdM.StateListAnimator.event$default(this.OLrzqt, "DEXTrade_Confirm_Page_Click", new TrackChannel[0], new Function1() { // from class: o.kRP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kRI.AkhnZx(str, map, (EventParamsList) obj);
            }
        }, false, 8, null);
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) AdvancedConfirmEvents.Confirm.getValue())) {
            KWHzl(map);
        }
    }

    public static final Unit AkhnZx(java.lang.String str, java.util.Map map, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "page_name", "advanced_confirm", false, 4, null);
        EventParamsList.put$default(eventParamsList, "advanced_button_name", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, str, false, 4, null);
        for (Map.Entry entry : map.entrySet()) {
            EventParamsList.put$default(eventParamsList, (java.lang.String) entry.getKey(), (java.lang.String) entry.getValue(), false, 4, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.kRI */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void trackSettingsEvents$default(kRI kri, java.lang.String str, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            map = C56424yEw.KWHzl();
        }
        kri.AYXKKw(str, (java.util.Map<java.lang.String, java.lang.String>) map);
    }

    public final void AYXKKw(@NotNull final java.lang.String str, @NotNull final java.util.Map<java.lang.String, java.lang.String> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        C32866mlf.onEvent$default("DEXTrade_Setting_Page_Click", (TrackChannel[]) null, new Function1() { // from class: o.kRT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kRI.uzCIH(str, map, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        Unit unit = Unit.INSTANCE;
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) AdvancedSettingsEvents.Confirm.getValue())) {
            copydefault(map);
        }
    }

    public static final Unit uzCIH(java.lang.String str, java.util.Map map, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "page_name", "advanced_settings", false, 4, null);
        EventParamsList.put$default(eventParamsList, "advanced_button_name", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, str, false, 4, null);
        for (Map.Entry entry : map.entrySet()) {
            EventParamsList.put$default(eventParamsList, (java.lang.String) entry.getKey(), (java.lang.String) entry.getValue(), false, 4, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.kRI */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void trackSettingsSubmit$default(kRI kri, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            map = C56424yEw.KWHzl();
        }
        kri.copydefault(map);
    }

    public final void copydefault(final java.util.Map<java.lang.String, java.lang.String> map) {
        C32866mlf.onEvent$default("DEXTrade_Setting_PageSubmit_Click", (TrackChannel[]) null, new Function1() { // from class: o.kSd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kRI.valueOf(map, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit valueOf(java.util.Map map, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "page_name", "advanced_settings", false, 4, null);
        for (Map.Entry entry : map.entrySet()) {
            EventParamsList.put$default(eventParamsList, (java.lang.String) entry.getKey(), (java.lang.String) entry.getValue(), false, 4, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.kRI */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void trackHomeSubmit$default(kRI kri, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            map = C56424yEw.KWHzl();
        }
        kri.KWHzl(map);
    }

    public final void KWHzl(final java.util.Map<java.lang.String, java.lang.String> map) {
        InterfaceC9847bdM.StateListAnimator.event$default(this.OLrzqt, "DEXTrade_Home_FullPageSubmit_Click", new TrackChannel[0], new Function1() { // from class: o.kRV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kRI.KWHzl(map, (EventParamsList) obj);
            }
        }, false, 8, null);
    }

    public static final Unit KWHzl(java.util.Map map, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "page_name", "advanced", false, 4, null);
        for (Map.Entry entry : map.entrySet()) {
            EventParamsList.put$default(eventParamsList, (java.lang.String) entry.getKey(), (java.lang.String) entry.getValue(), false, 4, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.kRI */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void trackTokenListSubmit$default(kRI kri, java.lang.String str, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            map = C56424yEw.KWHzl();
        }
        kri.DbNXlk(str, map);
    }

    public final void DbNXlk(final java.lang.String str, final java.util.Map<java.lang.String, java.lang.String> map) {
        C32866mlf.onEvent$default("DEXTrade_Tokenlist_PageSubmit_Click", (TrackChannel[]) null, new Function1() { // from class: o.kRW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kRI.zsXlph(str, map, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit zsXlph(java.lang.String str, java.util.Map map, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "page_name", str, false, 4, null);
        for (Map.Entry entry : map.entrySet()) {
            EventParamsList.put$default(eventParamsList, (java.lang.String) entry.getKey(), (java.lang.String) entry.getValue(), false, 4, null);
        }
        return Unit.INSTANCE;
    }

    public final void fetchVPNInfo(@NotNull final java.lang.String str, @NotNull final java.util.Map<java.lang.String, java.lang.String> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        C32866mlf.onEvent$default("DEXTrade_Home_FullPage_Click", (TrackChannel[]) null, new Function1() { // from class: o.kRO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kRI.zLjUOn(str, map, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit zLjUOn(java.lang.String str, java.util.Map map, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "page_name", "tpsl_edit", false, 4, null);
        EventParamsList.put$default(eventParamsList, "business_type", "advanced", false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, str, false, 4, null);
        for (Map.Entry entry : map.entrySet()) {
            EventParamsList.put$default(eventParamsList, (java.lang.String) entry.getKey(), (java.lang.String) entry.getValue(), false, 4, null);
        }
        return Unit.INSTANCE;
    }

    public final void isConnected(@NotNull final java.lang.String str, @NotNull final java.util.Map<java.lang.String, java.lang.String> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        C32866mlf.onEvent$default("DEXTrade_Home_FullPage_Click", (TrackChannel[]) null, new Function1() { // from class: o.kRX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kRI.AubY(str, map, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit AubY(java.lang.String str, java.util.Map map, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "page_name", "tpsl_add_strategy", false, 4, null);
        EventParamsList.put$default(eventParamsList, "business_type", "advanced", false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, str, false, 4, null);
        for (Map.Entry entry : map.entrySet()) {
            EventParamsList.put$default(eventParamsList, (java.lang.String) entry.getKey(), (java.lang.String) entry.getValue(), false, 4, null);
        }
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(@NotNull final java.util.Map<java.lang.String, java.lang.String> map) {
        Intrinsics.checkNotNullParameter(map, "");
        C32866mlf.onEvent$default("DexReferral_InviteeAction_ReferralAppliedInTrading_Click", (TrackChannel[]) null, new Function1() { // from class: o.kRZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kRI.AhwBna(map, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit AhwBna(java.util.Map map, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "page_name", "advanced", false, 4, null);
        EventParamsList.put$default(eventParamsList, "business_type", "advanced", false, 4, null);
        for (Map.Entry entry : map.entrySet()) {
            EventParamsList.put$default(eventParamsList, (java.lang.String) entry.getKey(), (java.lang.String) entry.getValue(), false, 4, null);
        }
        return Unit.INSTANCE;
    }

    public final void EZpvd(@NotNull final java.util.Map<java.lang.String, java.lang.String> map) {
        Intrinsics.checkNotNullParameter(map, "");
        C32866mlf.onEvent$default("DexReferral_InviteeAction_ReferralAppliedInTrading_View", (TrackChannel[]) null, new Function1() { // from class: o.kRR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kRI.AYXKKw(map, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit AYXKKw(java.util.Map map, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "page_name", "advanced", false, 4, null);
        EventParamsList.put$default(eventParamsList, "business_type", "advanced", false, 4, null);
        for (Map.Entry entry : map.entrySet()) {
            EventParamsList.put$default(eventParamsList, (java.lang.String) entry.getKey(), (java.lang.String) entry.getValue(), false, 4, null);
        }
        return Unit.INSTANCE;
    }
}
