package o;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.okinc.business.defi.api.bean.VerifyDAppDomainResponse;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.dexkline.dexui.main.market.base.ActionOnMarketDetail;
import com.okinc.dexkline.market.features.coindetail.ui.chart.ChartDetailFragment;
import com.okinc.liveness.lca.EopTrackEvent;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class mRG {

    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ChartDetailFragment.Companion.SubChartTabType.values().length];
            try {
                iArr[ChartDetailFragment.Companion.SubChartTabType.HISTORY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[ChartDetailFragment.Companion.SubChartTabType.LIQUIDITY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[ChartDetailFragment.Companion.SubChartTabType.HOLDER.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[ChartDetailFragment.Companion.SubChartTabType.POSITION.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[ChartDetailFragment.Companion.SubChartTabType.TRADER.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            EZpvd = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String EZpvd() {
        return "unknown";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final void EZpvd(@NotNull ActionOnMarketDetail actionOnMarketDetail) {
        Intrinsics.checkNotNullParameter(actionOnMarketDetail, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String OLrzqt() {
        return "unknown";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0016 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0019 A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.String OLrzqt(int i, boolean z) {
        if (z) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        return i != 3 ? "" : VerifyDAppDomainResponse.LEVEL_RISK;
                    }
                    return "data";
                }
                return "chart";
            }
            return "info";
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                    }
                }
                return "data";
            }
            return "info";
        }
        return "chart";
    }

    public static final void KWHzl(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3, @NotNull final java.lang.String str4, @NotNull final java.lang.String str5, @NotNull final java.lang.String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        TrackChannel[] trackChannelArrEZpvd = C32167mRz.OLrzqt.EZpvd();
        C32866mlf.EZpvd("DEXMarket_Token_TokenLabel_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrEZpvd, trackChannelArrEZpvd.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.mRP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return mRG.KWHzl(str4, str2, str5, str, str3, str6, (EventParamsList) obj);
            }
        });
    }

    public static final Unit KWHzl(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "page_from", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "token_address", str2, false, 4, null);
        EventParamsList.put$default(eventParamsList, "token_symbol", str3, false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, str4, false, 4, null);
        EventParamsList.put$default(eventParamsList, "chain_id", str5, false, 4, null);
        EventParamsList.put$default(eventParamsList, "chain_name", str6, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3, @NotNull final java.lang.String str4, @NotNull final java.lang.String str5, @NotNull final java.lang.String str6, final java.lang.Boolean bool, final java.lang.String str7, final java.lang.Boolean bool2, final java.lang.String str8, final java.lang.Boolean bool3, final java.lang.Boolean bool4, final java.lang.Boolean bool5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        TrackChannel[] trackChannelArrEZpvd = C32167mRz.OLrzqt.EZpvd();
        C32866mlf.EZpvd("CedefiMarket_Token_Page_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrEZpvd, trackChannelArrEZpvd.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.mRS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return mRG.copydefault(str6, str, str2, str5, str3, str4, bool, bool4, bool5, str7, bool2, str8, bool3, (EventParamsList) obj);
            }
        });
    }

    public static final Unit copydefault(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.Boolean bool3, java.lang.String str7, java.lang.Boolean bool4, java.lang.String str8, java.lang.Boolean bool5, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "page_from", C34663ngO.AEQbTJ(str, new Function0() { // from class: o.mRI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return mRG.OLrzqt();
            }
        }), false, 4, null);
        EventParamsList.put$default(eventParamsList, "token_address", str2, false, 4, null);
        EventParamsList.put$default(eventParamsList, "token_symbol", str3, false, 4, null);
        EventParamsList.put$default(eventParamsList, "header_tab_name", str4, false, 4, null);
        EventParamsList.put$default(eventParamsList, "chain_id", str5, false, 4, null);
        EventParamsList.put$default(eventParamsList, "chain_name", str6, false, 4, null);
        if (bool != null) {
            bool.booleanValue();
            EventParamsList.put$default(eventParamsList, "favorite_click", "1", false, 4, null);
        }
        if (bool2 != null) {
            bool2.booleanValue();
            EventParamsList.put$default(eventParamsList, "trade_button", "1", false, 4, null);
        }
        if (bool3 != null) {
            bool3.booleanValue();
            EventParamsList.put$default(eventParamsList, "token_select_click", "1", false, 4, null);
        }
        if (str7 != null) {
            EventParamsList.put$default(eventParamsList, "history_tab_name", str7, false, 4, null);
        }
        if (bool4 != null) {
            bool4.booleanValue();
            EventParamsList.put$default(eventParamsList, "share_click", "1", false, 4, null);
        }
        if (str8 != null) {
            EventParamsList.put$default(eventParamsList, "copy_address_click", "1", false, 4, null);
        }
        if (bool5 != null) {
            bool5.booleanValue();
            EventParamsList.put$default(eventParamsList, "alert_click", "1", false, 4, null);
        }
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3, @NotNull final java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        C32866mlf.onEvent$default("CedefiMarket_Token_HistoryAddressLabel_View", (TrackChannel[]) null, new Function1() { // from class: o.mRQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return mRG.EZpvd(str, str2, str3, str4, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit EZpvd(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "token_address", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "token_symbol", str2, false, 4, null);
        EventParamsList.put$default(eventParamsList, "chain_id", str3, false, 4, null);
        EventParamsList.put$default(eventParamsList, "chain_name", str4, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3, @NotNull final java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        TrackChannel[] trackChannelArrEZpvd = C32167mRz.OLrzqt.EZpvd();
        C32866mlf.EZpvd("CedefiMarket_Share_Page_View", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrEZpvd, trackChannelArrEZpvd.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.mRM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return mRG.OLrzqt(str, str2, str3, str4, (EventParamsList) obj);
            }
        });
    }

    public static final Unit OLrzqt(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "token_address", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "token_symbol", str2, false, 4, null);
        EventParamsList.put$default(eventParamsList, "chain_id", str3, false, 4, null);
        EventParamsList.put$default(eventParamsList, "chain_name", str4, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final void copydefault(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3, @NotNull final java.lang.String str4, @NotNull final java.lang.String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        TrackChannel[] trackChannelArrEZpvd = C32167mRz.OLrzqt.EZpvd();
        C32866mlf.EZpvd("CedefiKline_TimeframePop_Button_View", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrEZpvd, trackChannelArrEZpvd.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.mRK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return mRG.EZpvd(str, str2, str3, str4, str5, (EventParamsList) obj);
            }
        });
    }

    public static final Unit EZpvd(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "token_address", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "token_symbol", str2, false, 4, null);
        EventParamsList.put$default(eventParamsList, "chain_id", str3, false, 4, null);
        EventParamsList.put$default(eventParamsList, "chain_name", str4, false, 4, null);
        EventParamsList.put$default(eventParamsList, "kline_time", str5, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3, @NotNull final java.lang.String str4, @NotNull final java.lang.String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        TrackChannel[] trackChannelArrEZpvd = C32167mRz.OLrzqt.EZpvd();
        C32866mlf.EZpvd("CedefiKline_MarketValueorPrice_Button_View", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrEZpvd, trackChannelArrEZpvd.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.mRT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return mRG.AEQbTJ(str, str2, str3, str4, str5, (EventParamsList) obj);
            }
        });
    }

    public static final Unit AEQbTJ(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "token_address", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "token_symbol", str2, false, 4, null);
        EventParamsList.put$default(eventParamsList, "chain_id", str3, false, 4, null);
        EventParamsList.put$default(eventParamsList, "chain_name", str4, false, 4, null);
        EventParamsList.put$default(eventParamsList, "mcap_or_price", str5, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3, @NotNull final java.lang.String str4, @NotNull final java.lang.String str5, @NotNull final java.lang.String str6, @NotNull final java.lang.String str7, java.lang.String str8, final java.lang.String str9) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        TrackChannel[] trackChannelArrEZpvd = C32167mRz.OLrzqt.EZpvd();
        C32866mlf.EZpvd("CedefiMarket_Token_Page_View", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrEZpvd, trackChannelArrEZpvd.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.mRL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return mRG.copydefault(str, str2, str5, str6, str3, str4, str9, str7, (EventParamsList) obj);
            }
        });
    }

    public static final Unit copydefault(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "token_address", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "token_symbol", str2, false, 4, null);
        EventParamsList.put$default(eventParamsList, "header_tab_name", str3, false, 4, null);
        EventParamsList.put$default(eventParamsList, "history_tab_name", str4, false, 4, null);
        java.lang.String str9 = (java.lang.String) C32935mmv.KWHzl.get("channel_id");
        EventParamsList.put$default(eventParamsList, "channel_id", str9 == null ? "" : str9, false, 4, null);
        EventParamsList.put$default(eventParamsList, "chain_id", str5, false, 4, null);
        EventParamsList.put$default(eventParamsList, "chain_name", str6, false, 4, null);
        EventParamsList.put$default(eventParamsList, "wallet_id", str7 != null ? str7 : "", false, 4, null);
        EventParamsList.put$default(eventParamsList, "page_from", C34663ngO.AEQbTJ(str8, new Function0() { // from class: o.mRN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return mRG.EZpvd();
            }
        }), false, 4, null);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.String getMarketDetailTabName$default(int i, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return OLrzqt(i, z);
    }

    public static final java.lang.String AEQbTJ(@NotNull java.util.List<C32311mXh> list, int i) {
        Intrinsics.checkNotNullParameter(list, "");
        C32311mXh c32311mXh = (C32311mXh) CollectionsKt___CollectionsKt.AkhnZx(list, i);
        ChartDetailFragment.Companion.SubChartTabType subChartTabTypeAEQbTJ = c32311mXh != null ? c32311mXh.AEQbTJ() : null;
        int i2 = subChartTabTypeAEQbTJ == null ? -1 : StateListAnimator.EZpvd[subChartTabTypeAEQbTJ.ordinal()];
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? "" : "trader" : "my_position" : "holders" : "liq" : "activities";
    }

    public static final void OLrzqt(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        TrackChannel[] trackChannelArrEZpvd = C32167mRz.OLrzqt.EZpvd();
        C32866mlf.EZpvd("DEXMarket_Token_Overview_Button_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrEZpvd, trackChannelArrEZpvd.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.mRO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return mRG.AEQbTJ(str, (EventParamsList) obj);
            }
        });
    }

    public static final Unit AEQbTJ(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, str, false, 4, null);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void trackDEXMarketTokenHistoryOrTokenPoolFilterCustomClick$default(java.lang.String str, boolean z, java.lang.Boolean bool, java.lang.Boolean bool2, boolean z2, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            bool = java.lang.Boolean.FALSE;
        }
        if ((i & 8) != 0) {
            bool2 = java.lang.Boolean.FALSE;
        }
        EZpvd(str, z, bool, bool2, z2);
    }

    public static final void EZpvd(@NotNull java.lang.String str, final boolean z, final java.lang.Boolean bool, final java.lang.Boolean bool2, final boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        TrackChannel[] trackChannelArrEZpvd = C32167mRz.OLrzqt.EZpvd();
        C32866mlf.EZpvd(str, (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrEZpvd, trackChannelArrEZpvd.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.mRR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return mRG.OLrzqt(z, bool, bool2, z2, (EventParamsList) obj);
            }
        });
    }

    public static final Unit OLrzqt(boolean z, java.lang.Boolean bool, java.lang.Boolean bool2, boolean z2, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "time_range", z ? "1" : "0", false, 4, null);
        java.lang.Boolean bool3 = java.lang.Boolean.TRUE;
        EventParamsList.put$default(eventParamsList, "turnover", Intrinsics.EZpvd(bool, bool3) ? "1" : "0", false, 4, null);
        EventParamsList.put$default(eventParamsList, FirebaseAnalytics.Param.PRICE, Intrinsics.EZpvd(bool2, bool3) ? "1" : "0", false, 4, null);
        EventParamsList.put$default(eventParamsList, WalletSearchRequest.SEARCH_SOURCE_ADDRESS, z2 ? "1" : "0", false, 4, null);
        return Unit.INSTANCE;
    }
}
