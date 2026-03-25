package o;

import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.okinc.business.market.features.home.domain.HomeTab;
import com.okinc.business.market.features.meme.filter.domain.MemeFilter;
import com.okinc.business.market.features.meme.filter.domain.TokenAgeType;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.InterfaceC9847bdM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kph, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29229kph {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String AEQbTJ(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "" : "migrated" : "migrating_soon" : "new_pairs";
    }

    public static final boolean OLrzqt() {
        InterfaceC9738bbJ interfaceC9738bbJ = (InterfaceC9738bbJ) CollectionsKt___CollectionsKt.AkhnZx(((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).gEmmrt().copydefault(), 0);
        if (interfaceC9738bbJ != null) {
            return interfaceC9738bbJ.RJOkX();
        }
        return false;
    }

    public static final void EZpvd(@NotNull final java.lang.String str, final int i, final C29286kql c29286kql) {
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC9847bdM.StateListAnimator.event$default((InterfaceC9847bdM) C43251rlk.copydefault(InterfaceC9847bdM.class), "DEXMarket_Scanner_FullPage_Click", new TrackChannel[0], new Function1() { // from class: o.kpX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29229kph.EZpvd(i, c29286kql, str, (EventParamsList) obj);
            }
        }, false, 8, null);
    }

    public static final Unit EZpvd(int i, C29286kql c29286kql, java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "is_tee", java.lang.String.valueOf(OLrzqt()), false, 4, null);
        EventParamsList.put$default(eventParamsList, "module", "scanner", false, 4, null);
        EventParamsList.put$default(eventParamsList, "product_type", EZpvd(i, c29286kql), false, 4, null);
        java.lang.String strKWHzl = KWHzl(i, c29286kql);
        java.util.Locale locale = java.util.Locale.ROOT;
        java.lang.String lowerCase = strKWHzl.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        EventParamsList.put$default(eventParamsList, "page_name", lowerCase, false, 4, null);
        java.lang.String lowerCase2 = str.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, lowerCase2, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final java.lang.String EZpvd(int i, C29286kql c29286kql) {
        return c29286kql == null ? i != 0 ? i != 1 ? i != 2 ? "" : "watchlist" : "memepump" : "surge" : i == 1 ? "surge" : i == c29286kql.OLrzqt() ? "memepump" : i == c29286kql.AEQbTJ() ? "watchlist" : c29286kql.KWHzl(i) ? "market" : "";
    }

    public static final java.lang.String KWHzl(int i, C29286kql c29286kql) {
        java.lang.String strEZpvd;
        if (c29286kql == null) {
            return i != 0 ? i != 1 ? i != 2 ? "" : "watchlist" : "trenches" : "surge";
        }
        if (i == 1) {
            return "surge";
        }
        if (i == c29286kql.OLrzqt()) {
            return "trenches";
        }
        if (i == c29286kql.AEQbTJ()) {
            return "watchlist";
        }
        HomeTab homeTabAEQbTJ = c29286kql.AEQbTJ(i);
        return (homeTabAEQbTJ == null || (strEZpvd = homeTabAEQbTJ.EZpvd()) == null) ? "unknown_key" : strEZpvd;
    }

    public static final void AEQbTJ() {
        InterfaceC9847bdM.StateListAnimator.event$default((InterfaceC9847bdM) C43251rlk.copydefault(InterfaceC9847bdM.class), "DEXMarket_Surge_FullPage_View", new TrackChannel[0], new Function1() { // from class: o.kpV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29229kph.copydefault((EventParamsList) obj);
            }
        }, false, 8, null);
    }

    public static final Unit copydefault(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "is_tee", java.lang.String.valueOf(OLrzqt()), false, 4, null);
        EventParamsList.put$default(eventParamsList, "module", "scanner", false, 4, null);
        EventParamsList.put$default(eventParamsList, "product_type", "surge", false, 4, null);
        EventParamsList.put$default(eventParamsList, "page_name", "surge", false, 4, null);
        return Unit.INSTANCE;
    }

    public static final void EZpvd() {
        InterfaceC9847bdM.StateListAnimator.event$default((InterfaceC9847bdM) C43251rlk.copydefault(InterfaceC9847bdM.class), "DEXMarket_Memefactory_FullPage_View", new TrackChannel[0], new Function1() { // from class: o.kqc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29229kph.OLrzqt((EventParamsList) obj);
            }
        }, false, 8, null);
    }

    public static final Unit OLrzqt(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "is_tee", java.lang.String.valueOf(OLrzqt()), false, 4, null);
        EventParamsList.put$default(eventParamsList, "module", "scanner", false, 4, null);
        EventParamsList.put$default(eventParamsList, "product_type", "memepump", false, 4, null);
        EventParamsList.put$default(eventParamsList, "page_name", "trenches", false, 4, null);
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(final boolean z) {
        InterfaceC9847bdM.StateListAnimator.event$default((InterfaceC9847bdM) C43251rlk.copydefault(InterfaceC9847bdM.class), "DEXMarket_Watchlist_Page_View", new TrackChannel[0], new Function1() { // from class: o.kpj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29229kph.AEQbTJ(z, (EventParamsList) obj);
            }
        }, false, 8, null);
    }

    public static final Unit AEQbTJ(boolean z, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "is_tee", java.lang.String.valueOf(OLrzqt()), false, 4, null);
        EventParamsList.put$default(eventParamsList, "module", z ? "scanner" : "token_watchlist", false, 4, null);
        EventParamsList.put$default(eventParamsList, "product_type", "watchlist", false, 4, null);
        EventParamsList.put$default(eventParamsList, "page_name", "watchlist", false, 4, null);
        return Unit.INSTANCE;
    }

    public static final void KWHzl(final boolean z, @NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC9847bdM.StateListAnimator.event$default((InterfaceC9847bdM) C43251rlk.copydefault(InterfaceC9847bdM.class), "DEXMarket_Watchlist_Button_Click", new TrackChannel[0], new Function1() { // from class: o.kpf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29229kph.OLrzqt(z, str, (EventParamsList) obj);
            }
        }, false, 8, null);
    }

    public static final Unit OLrzqt(boolean z, java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "is_tee", java.lang.String.valueOf(OLrzqt()), false, 4, null);
        EventParamsList.put$default(eventParamsList, "module", z ? "scanner" : "token_watchlist", false, 4, null);
        EventParamsList.put$default(eventParamsList, "product_type", "watchlist", false, 4, null);
        EventParamsList.put$default(eventParamsList, "page_name", "watchlist", false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, str, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final void KWHzl(final boolean z) {
        InterfaceC9847bdM.StateListAnimator.event$default((InterfaceC9847bdM) C43251rlk.copydefault(InterfaceC9847bdM.class), "DEXMarket_Global_FloatingComponent_View", new TrackChannel[0], new Function1() { // from class: o.kpZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29229kph.copydefault(z, (EventParamsList) obj);
            }
        }, false, 8, null);
    }

    public static final Unit copydefault(boolean z, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "is_tee", java.lang.String.valueOf(OLrzqt()), false, 4, null);
        EventParamsList.put$default(eventParamsList, "state", z ? "minimized" : "expanded", false, 4, null);
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC9847bdM.StateListAnimator.event$default((InterfaceC9847bdM) C43251rlk.copydefault(InterfaceC9847bdM.class), "DEXMarket_Global_FloatingComponent_Click", new TrackChannel[0], new Function1() { // from class: o.kpT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29229kph.EZpvd(str, (EventParamsList) obj);
            }
        }, false, 8, null);
    }

    public static final Unit EZpvd(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "is_tee", java.lang.String.valueOf(OLrzqt()), false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, str, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(@NotNull final java.lang.String str, final int i) {
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC9847bdM.StateListAnimator.event$default((InterfaceC9847bdM) C43251rlk.copydefault(InterfaceC9847bdM.class), "DEXMarket_Memefactory_FullPage_Click", new TrackChannel[0], new Function1() { // from class: o.kpW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29229kph.EZpvd(i, str, (EventParamsList) obj);
            }
        }, false, 8, null);
    }

    public static final Unit EZpvd(int i, java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "is_tee", java.lang.String.valueOf(OLrzqt()), false, 4, null);
        EventParamsList.put$default(eventParamsList, "module", "scanner", false, 4, null);
        EventParamsList.put$default(eventParamsList, "product_type", "memepump", false, 4, null);
        EventParamsList.put$default(eventParamsList, "page_name", "trenches", false, 4, null);
        EventParamsList.put$default(eventParamsList, "token_column", AEQbTJ(i), false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, str, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final void copydefault(int i, int i2) {
        AEQbTJ(AEQbTJ(i2), i);
    }

    public static final void copydefault(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, final int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        InterfaceC9847bdM.StateListAnimator.event$default((InterfaceC9847bdM) C43251rlk.copydefault(InterfaceC9847bdM.class), "DEXMarket_Memefactory_FullPage_Click", new TrackChannel[0], new Function1() { // from class: o.kpQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29229kph.KWHzl(i, str, str2, (EventParamsList) obj);
            }
        }, false, 8, null);
    }

    public static final Unit KWHzl(int i, java.lang.String str, java.lang.String str2, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "is_tee", java.lang.String.valueOf(OLrzqt()), false, 4, null);
        EventParamsList.put$default(eventParamsList, "module", "scanner", false, 4, null);
        EventParamsList.put$default(eventParamsList, "product_type", "memepump", false, 4, null);
        EventParamsList.put$default(eventParamsList, "page_name", "trenches", false, 4, null);
        EventParamsList.put$default(eventParamsList, "token_column", AEQbTJ(i), false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, "network_selected", false, 4, null);
        EventParamsList.put$default(eventParamsList, "selected_chain_id", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "selected_chain_symbol", str2, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final void KWHzl(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC9847bdM.StateListAnimator.event$default((InterfaceC9847bdM) C43251rlk.copydefault(InterfaceC9847bdM.class), "DEXMarket_Surge_FullPage_Click", new TrackChannel[0], new Function1() { // from class: o.kqa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29229kph.AEQbTJ(str, (EventParamsList) obj);
            }
        }, false, 8, null);
    }

    public static final Unit AEQbTJ(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "is_tee", java.lang.String.valueOf(OLrzqt()), false, 4, null);
        EventParamsList.put$default(eventParamsList, "module", "scanner", false, 4, null);
        EventParamsList.put$default(eventParamsList, "product_type", "surge", false, 4, null);
        EventParamsList.put$default(eventParamsList, "page_name", "surge", false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, str, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(@NotNull final C29264kqP c29264kqP, @NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(c29264kqP, "");
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC9847bdM.StateListAnimator.event$default((InterfaceC9847bdM) C43251rlk.copydefault(InterfaceC9847bdM.class), "DEXMarket_Surge_Filter_Click", new TrackChannel[0], new Function1() { // from class: o.kpi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29229kph.AEQbTJ(c29264kqP, str, (EventParamsList) obj);
            }
        }, false, 8, null);
    }

    public static final Unit AEQbTJ(final C29264kqP c29264kqP, java.lang.String str, final EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "is_tee", java.lang.String.valueOf(OLrzqt()), false, 4, null);
        EventParamsList.put$default(eventParamsList, "module", "scanner", false, 4, null);
        EventParamsList.put$default(eventParamsList, "product_type", "surge", false, 4, null);
        EventParamsList.put$default(eventParamsList, "page_name", "surge", false, 4, null);
        EventParamsList.put$default(eventParamsList, CrashHianalyticsData.TIME, c29264kqP.KWHzl(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "protocols", str, false, 4, null);
        C31256lqb.EZpvd(c29264kqP.EZpvd().OLrzqt(), new Function1() { // from class: o.kpr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29229kph.QKudOq(eventParamsList, (java.lang.String) obj);
            }
        });
        C31256lqb.EZpvd(c29264kqP.EZpvd().AEQbTJ(), new Function1() { // from class: o.kpI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29229kph.DXXBbs(eventParamsList, (java.lang.String) obj);
            }
        });
        C31256lqb.EZpvd(c29264kqP.EZpvd().gEmmrt(), new Function1() { // from class: o.kpO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29229kph.DarRvM(eventParamsList, (java.lang.String) obj);
            }
        });
        C31256lqb.EZpvd(c29264kqP.EZpvd().valueOf(), new Function1() { // from class: o.kqb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29229kph.OqFWZa(eventParamsList, (java.lang.String) obj);
            }
        });
        C31256lqb.EZpvd(c29264kqP.EZpvd().djBIcL(), new Function1() { // from class: o.kpY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29229kph.DCJXGO(eventParamsList, (java.lang.String) obj);
            }
        });
        C31256lqb.EZpvd(c29264kqP.EZpvd().copydefault(), new Function1() { // from class: o.kqe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29229kph.ODWQjV(eventParamsList, (java.lang.String) obj);
            }
        });
        C31256lqb.EZpvd(c29264kqP.EZpvd().djBIcL() + c29264kqP.EZpvd().copydefault(), new Function1() { // from class: o.kqh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29229kph.OLrzqt(eventParamsList, c29264kqP, (java.lang.String) obj);
            }
        });
        C31256lqb.EZpvd(c29264kqP.EZpvd().KWHzl(), new Function1() { // from class: o.kqg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29229kph.OuxcSI(eventParamsList, (java.lang.String) obj);
            }
        });
        EventParamsList.put$default(eventParamsList, "atleast_one_social_link", java.lang.String.valueOf(c29264kqP.EZpvd().EZpvd()), false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit QKudOq(EventParamsList eventParamsList, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        EventParamsList.put$default(eventParamsList, "metrics_market_cap_min", str, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit DXXBbs(EventParamsList eventParamsList, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        EventParamsList.put$default(eventParamsList, "metrics_market_cap_max", str, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit DarRvM(EventParamsList eventParamsList, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        EventParamsList.put$default(eventParamsList, "metrics_volume_min", str, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit OqFWZa(EventParamsList eventParamsList, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        EventParamsList.put$default(eventParamsList, "metrics_volume_max", str, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit DCJXGO(EventParamsList eventParamsList, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        EventParamsList.put$default(eventParamsList, "metrics_token_age_min", str, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit ODWQjV(EventParamsList eventParamsList, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        EventParamsList.put$default(eventParamsList, "metrics_token_age_max", str, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(EventParamsList eventParamsList, C29264kqP c29264kqP, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        EventParamsList.put$default(eventParamsList, "metrics_token_age_unit", TokenAgeType.Companion.KWHzl(c29264kqP.EZpvd().AYXKKw()), false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit OuxcSI(EventParamsList eventParamsList, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        EventParamsList.put$default(eventParamsList, "keyword_include", str, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final void KWHzl(@NotNull final MemeFilter memeFilter, @NotNull final java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(memeFilter, "");
        Intrinsics.checkNotNullParameter(list, "");
        InterfaceC9847bdM.StateListAnimator.event$default((InterfaceC9847bdM) C43251rlk.copydefault(InterfaceC9847bdM.class), "DEXMarket_Memefactory_Filter_Click", new TrackChannel[0], new Function1() { // from class: o.kpU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29229kph.OLrzqt(memeFilter, list, (EventParamsList) obj);
            }
        }, false, 8, null);
    }

    public static final Unit OLrzqt(MemeFilter memeFilter, java.util.List list, final EventParamsList eventParamsList) {
        java.lang.String tokenAgeMax;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "is_tee", java.lang.String.valueOf(OLrzqt()), false, 4, null);
        EventParamsList.put$default(eventParamsList, "module", "scanner", false, 4, null);
        EventParamsList.put$default(eventParamsList, "product_type", "memepump", false, 4, null);
        EventParamsList.put$default(eventParamsList, "page_name", "trenches", false, 4, null);
        C31256lqb.EZpvd(memeFilter.getTop10HoldingMin(), new Function1() { // from class: o.kpm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29229kph.QOLQEE(eventParamsList, (java.lang.String) obj);
            }
        });
        C31256lqb.EZpvd(memeFilter.getTop10HoldingMax(), new Function1() { // from class: o.kpy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29229kph.QKVWgx(eventParamsList, (java.lang.String) obj);
            }
        });
        C31256lqb.EZpvd(memeFilter.getDevHoldingMin(), new Function1() { // from class: o.kpG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29229kph.QUSxYX(eventParamsList, (java.lang.String) obj);
            }
        });
        C31256lqb.EZpvd(memeFilter.getDevHoldingMax(), new Function1() { // from class: o.kpJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29229kph.QfsBiF(eventParamsList, (java.lang.String) obj);
            }
        });
        C31256lqb.EZpvd(memeFilter.getInsiderMin(), new Function1() { // from class: o.kpK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29229kph.RJOkX(eventParamsList, (java.lang.String) obj);
            }
        });
        C31256lqb.EZpvd(memeFilter.getInsiderMax(), new Function1() { // from class: o.kpM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29229kph.QVAiDq(eventParamsList, (java.lang.String) obj);
            }
        });
        C31256lqb.EZpvd(memeFilter.getSniperMin(), new Function1() { // from class: o.kpL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29229kph.QbewEr(eventParamsList, (java.lang.String) obj);
            }
        });
        C31256lqb.EZpvd(memeFilter.getSniperMax(), new Function1() { // from class: o.kpP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29229kph.aKErDB(eventParamsList, (java.lang.String) obj);
            }
        });
        C31256lqb.EZpvd(memeFilter.getBundleMin(), new Function1() { // from class: o.kpR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29229kph.djSkpj(eventParamsList, (java.lang.String) obj);
            }
        });
        C31256lqb.EZpvd(memeFilter.getBundleMax(), new Function1() { // from class: o.kpS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29229kph.dNCPSb(eventParamsList, (java.lang.String) obj);
            }
        });
        C31256lqb.EZpvd(memeFilter.getFreshHoldMin(), new Function1() { // from class: o.kpo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29229kph.RcXXUw(eventParamsList, (java.lang.String) obj);
            }
        });
        C31256lqb.EZpvd(memeFilter.getFreshHoldMax(), new Function1() { // from class: o.kpn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29229kph.UeEOUB(eventParamsList, (java.lang.String) obj);
            }
        });
        C31256lqb.EZpvd(memeFilter.getPhishHoldMin(), new Function1() { // from class: o.kpk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29229kph.dxcTrN(eventParamsList, (java.lang.String) obj);
            }
        });
        C31256lqb.EZpvd(memeFilter.getPhishHoldMax(), new Function1() { // from class: o.kpl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29229kph.finit(eventParamsList, (java.lang.String) obj);
            }
        });
        C31256lqb.EZpvd(memeFilter.getMigratedTokensMin(), new Function1() { // from class: o.kps
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29229kph.dvKsVJ(eventParamsList, (java.lang.String) obj);
            }
        });
        C31256lqb.EZpvd(memeFilter.getMigratedTokensMax(), new Function1() { // from class: o.kpq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29229kph.fZBcTu(eventParamsList, (java.lang.String) obj);
            }
        });
        C31256lqb.EZpvd(memeFilter.getMarketCapMin(), new Function1() { // from class: o.kpp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29229kph.fFgQHt(eventParamsList, (java.lang.String) obj);
            }
        });
        C31256lqb.EZpvd(memeFilter.getMarketCapMax(), new Function1() { // from class: o.kpt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29229kph.flVtFt(eventParamsList, (java.lang.String) obj);
            }
        });
        C31256lqb.EZpvd(memeFilter.getVolumeMin(), new Function1() { // from class: o.kpw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29229kph.gasjUx(eventParamsList, (java.lang.String) obj);
            }
        });
        C31256lqb.EZpvd(memeFilter.getVolumeMax(), new Function1() { // from class: o.kpu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29229kph.gGvvIC(eventParamsList, (java.lang.String) obj);
            }
        });
        C31256lqb.EZpvd(memeFilter.getHoldersMin(), new Function1() { // from class: o.kpv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29229kph.giSNqX(eventParamsList, (java.lang.String) obj);
            }
        });
        C31256lqb.EZpvd(memeFilter.getHoldersMax(), new Function1() { // from class: o.kpx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29229kph.fvQaOB(eventParamsList, (java.lang.String) obj);
            }
        });
        C31256lqb.EZpvd(memeFilter.getTokenAgeMin(), new Function1() { // from class: o.kpB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29229kph.hUfVAv(eventParamsList, (java.lang.String) obj);
            }
        });
        C31256lqb.EZpvd(memeFilter.getTokenAgeMax(), new Function1() { // from class: o.kpz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29229kph.AxsJAYaxsJAY(eventParamsList, (java.lang.String) obj);
            }
        });
        java.lang.String tokenAgeMin = memeFilter.getTokenAgeMin();
        if ((tokenAgeMin != null && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) tokenAgeMin)) || ((tokenAgeMax = memeFilter.getTokenAgeMax()) != null && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) tokenAgeMax))) {
            EventParamsList.put$default(eventParamsList, "metrics_token_age_unit", memeFilter.getTokenAgeUnit().name(), false, 4, null);
        }
        C31256lqb.EZpvd(memeFilter.getTransactionsMin(), new Function1() { // from class: o.kpD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29229kph.gkJEwt(eventParamsList, (java.lang.String) obj);
            }
        });
        C31256lqb.EZpvd(memeFilter.getTransactionsMax(), new Function1() { // from class: o.kpC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29229kph.iRxXKY(eventParamsList, (java.lang.String) obj);
            }
        });
        C31256lqb.EZpvd(memeFilter.getBuyMin(), new Function1() { // from class: o.kpA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29229kph.iZzfmt(eventParamsList, (java.lang.String) obj);
            }
        });
        C31256lqb.EZpvd(memeFilter.getBuyMax(), new Function1() { // from class: o.kpE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29229kph.AxsJAYsNCnLh(eventParamsList, (java.lang.String) obj);
            }
        });
        C31256lqb.EZpvd(memeFilter.getSellMin(), new Function1() { // from class: o.kpH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29229kph.RlQdEF(eventParamsList, (java.lang.String) obj);
            }
        });
        C31256lqb.EZpvd(memeFilter.getSellMax(), new Function1() { // from class: o.kpF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29229kph.DAIeex(eventParamsList, (java.lang.String) obj);
            }
        });
        C31256lqb.EZpvd(memeFilter.getKeyword(), new Function1() { // from class: o.kpN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29229kph.accept(eventParamsList, (java.lang.String) obj);
            }
        });
        EventParamsList.put$default(eventParamsList, "protocols", CollectionsKt___CollectionsKt.joinToString$default(list, ",", null, null, 0, null, null, 62, null), false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit QOLQEE(EventParamsList eventParamsList, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        EventParamsList.put$default(eventParamsList, "audit_top_ten_holdings_ratio_min", str, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit QKVWgx(EventParamsList eventParamsList, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        EventParamsList.put$default(eventParamsList, "audit_top_ten_holdings_ratio_max", str, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit QUSxYX(EventParamsList eventParamsList, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        EventParamsList.put$default(eventParamsList, "audit_dev_holding_ratio_min", str, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit QfsBiF(EventParamsList eventParamsList, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        EventParamsList.put$default(eventParamsList, "audit_dev_holding_ratio_max", str, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit RJOkX(EventParamsList eventParamsList, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        EventParamsList.put$default(eventParamsList, "audit_insider_holding_ratio_min", str, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit QVAiDq(EventParamsList eventParamsList, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        EventParamsList.put$default(eventParamsList, "audit_insider_holding_ratio_max", str, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit QbewEr(EventParamsList eventParamsList, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        EventParamsList.put$default(eventParamsList, "audit_snipers_min", str, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit aKErDB(EventParamsList eventParamsList, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        EventParamsList.put$default(eventParamsList, "audit_snipers_max", str, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit djSkpj(EventParamsList eventParamsList, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        EventParamsList.put$default(eventParamsList, "audit_bundlers_min", str, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit dNCPSb(EventParamsList eventParamsList, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        EventParamsList.put$default(eventParamsList, "audit_bundlers_max", str, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit RcXXUw(EventParamsList eventParamsList, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        EventParamsList.put$default(eventParamsList, "audit_fresh_min", str, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit UeEOUB(EventParamsList eventParamsList, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        EventParamsList.put$default(eventParamsList, "audit_fresh_max", str, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit dxcTrN(EventParamsList eventParamsList, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        EventParamsList.put$default(eventParamsList, "audit_phishing_min", str, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit finit(EventParamsList eventParamsList, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        EventParamsList.put$default(eventParamsList, "audit_phishing_max", str, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit dvKsVJ(EventParamsList eventParamsList, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        EventParamsList.put$default(eventParamsList, "migrated_tokens_min", str, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit fZBcTu(EventParamsList eventParamsList, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        EventParamsList.put$default(eventParamsList, "migrated_tokens_max", str, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit fFgQHt(EventParamsList eventParamsList, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        EventParamsList.put$default(eventParamsList, "metrics_market_cap_min", str, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit flVtFt(EventParamsList eventParamsList, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        EventParamsList.put$default(eventParamsList, "metrics_market_cap_max", str, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit gasjUx(EventParamsList eventParamsList, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        EventParamsList.put$default(eventParamsList, "metrics_volume_min", str, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit gGvvIC(EventParamsList eventParamsList, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        EventParamsList.put$default(eventParamsList, "metrics_volume_max", str, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit giSNqX(EventParamsList eventParamsList, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        EventParamsList.put$default(eventParamsList, "metrics_holders_min", str, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit fvQaOB(EventParamsList eventParamsList, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        EventParamsList.put$default(eventParamsList, "metrics_holders_max", str, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit hUfVAv(EventParamsList eventParamsList, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        EventParamsList.put$default(eventParamsList, "metrics_token_age_min", str, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit AxsJAYaxsJAY(EventParamsList eventParamsList, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        EventParamsList.put$default(eventParamsList, "metrics_token_age_max", str, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit gkJEwt(EventParamsList eventParamsList, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        EventParamsList.put$default(eventParamsList, "metrics_txn_count_min", str, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit iRxXKY(EventParamsList eventParamsList, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        EventParamsList.put$default(eventParamsList, "metrics_txn_count_max", str, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit iZzfmt(EventParamsList eventParamsList, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        EventParamsList.put$default(eventParamsList, "metrics_buy_txn_count_min", str, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit AxsJAYsNCnLh(EventParamsList eventParamsList, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        EventParamsList.put$default(eventParamsList, "metrics_buy_txn_count_max", str, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit RlQdEF(EventParamsList eventParamsList, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        EventParamsList.put$default(eventParamsList, "metrics_sell_txn_count_min", str, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit DAIeex(EventParamsList eventParamsList, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        EventParamsList.put$default(eventParamsList, "metrics_sell_txn_count_max", str, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit accept(EventParamsList eventParamsList, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        EventParamsList.put$default(eventParamsList, "keyword_include", str, false, 4, null);
        return Unit.INSTANCE;
    }
}
