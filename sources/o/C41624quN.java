package o;

import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.market.ranking.core.model.RankingHotCryptoVo;
import com.okinc.market.time.filter.PeriodEnum;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.quN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C41624quN implements InterfaceC41634quX {
    @Override // o.InterfaceC41634quX
    public void copydefault(@NotNull final java.lang.String str, @NotNull final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C32866mlf.onEvent$default("RankingPage_Filter_Timeframe_Click", (TrackChannel[]) null, new Function1() { // from class: o.quR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C41624quN.copydefault(str2, str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit copydefault(java.lang.String str, java.lang.String str2, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "tab", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "timeframe", str2, false, 4, null);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC41634quX
    public void AEQbTJ(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C32866mlf.onEvent$default("RankingPage_Filter_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.quQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C41624quN.OLrzqt(str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit OLrzqt(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "tab", str, false, 4, null);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC41634quX
    public void AEQbTJ(@NotNull final RankingHotCryptoVo rankingHotCryptoVo, final int i, @NotNull final java.lang.String str, @NotNull final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(rankingHotCryptoVo, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C32866mlf.onEvent$default("RankingPage_Ranking_TradingPair_Click", (TrackChannel[]) null, new Function1() { // from class: o.quW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C41624quN.AEQbTJ(str2, str, rankingHotCryptoVo, i, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit AEQbTJ(java.lang.String str, java.lang.String str2, RankingHotCryptoVo rankingHotCryptoVo, int i, EventParamsList eventParamsList) {
        java.lang.String trackEvent;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "sub_tab", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "tab", str2, false, 4, null);
        PeriodEnum period = rankingHotCryptoVo.getPeriod();
        if (period != null && (trackEvent = period.getTrackEvent()) != null) {
            EventParamsList.put$default(eventParamsList, "timeframe", trackEvent, false, 4, null);
        }
        EventParamsList.put$default(eventParamsList, "token_pair", rankingHotCryptoVo.getInstId(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "biz_type", rankingHotCryptoVo.getInstType(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "rank_order", java.lang.String.valueOf(i + 1), false, 4, null);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC41634quX
    public void AEQbTJ(@NotNull final java.lang.String str, @NotNull final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C32866mlf.onEvent$default("Rank_PageInteraction_Share_Click", (TrackChannel[]) null, new Function1() { // from class: o.quO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C41624quN.EZpvd(str, str2, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit EZpvd(java.lang.String str, java.lang.String str2, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "tab", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "sub_tab", str2, false, 4, null);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC41634quX
    public void OLrzqt(@NotNull final java.lang.String str, @NotNull final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C32866mlf.onEvent$default("RankingPage_Ranking_RankingTab_Click", (TrackChannel[]) null, new Function1() { // from class: o.quT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C41624quN.AhwBna(str, str2, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit AhwBna(java.lang.String str, java.lang.String str2, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "tab", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "sub_tab", str2, false, 4, null);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC41634quX
    public void OLrzqt(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        C32866mlf.onEvent$default("RankingPage_Ranking_Page_View", (TrackChannel[]) null, new Function1() { // from class: o.quV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C41624quN.AEQbTJ(str, str2, str3, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit AEQbTJ(java.lang.String str, java.lang.String str2, java.lang.String str3, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "tab", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "sub_tab", str2, false, 4, null);
        EventParamsList.put$default(eventParamsList, "timeframe", str3, false, 4, null);
        return Unit.INSTANCE;
    }
}
