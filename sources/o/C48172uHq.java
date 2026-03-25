package o;

import com.okinc.unify_trade.biz.StrategyDetailsResponse;
import com.okinc.unify_trade.biz.StrategyProfitResponse;
import kotlin.Result;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uHq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C48172uHq {
    public static final java.util.List<StrategyProfitResponse> AEQbTJ(@NotNull StrategyDetailsResponse strategyDetailsResponse, @NotNull java.util.List<StrategyProfitResponse> list) {
        java.lang.Object objM7377constructorimpl;
        java.util.List<StrategyProfitResponse> listFJNWhG;
        Intrinsics.checkNotNullParameter(strategyDetailsResponse, "");
        Intrinsics.checkNotNullParameter(list, "");
        try {
            Result.Application application = Result.Companion;
            java.util.List<StrategyProfitResponse> profitSnapshots = strategyDetailsResponse.getProfitSnapshots();
            java.util.List listAxsJAYsNCnLh = profitSnapshots != null ? CollectionsKt___CollectionsKt.AxsJAYsNCnLh(profitSnapshots) : null;
            java.util.List listAxsJAYsNCnLh2 = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(list);
            StrategyProfitResponse latestProfit = strategyDetailsResponse.getLatestProfit();
            if (listAxsJAYsNCnLh == null || listAxsJAYsNCnLh.isEmpty()) {
                boolean z = latestProfit != null && ((C33129mqd.OLrzqt((java.lang.CharSequence) latestProfit.getTotalPnl()) && C33129mqd.OLrzqt((java.lang.CharSequence) latestProfit.getPnlRatio())) || (C33129mqd.OLrzqt((java.lang.CharSequence) latestProfit.getTotalPnlInSourceCcy()) && C33129mqd.OLrzqt((java.lang.CharSequence) latestProfit.getPnlRatioInSourceCcy())));
                if ((!listAxsJAYsNCnLh2.isEmpty()) && z) {
                    StrategyProfitResponse strategyProfitResponse = (StrategyProfitResponse) listAxsJAYsNCnLh2.get(0);
                    java.util.List<StrategyProfitResponse> listAhwBna = yDY.AhwBna(strategyProfitResponse.copy((512 & 1) != 0 ? strategyProfitResponse.cycleId : latestProfit.getCycleId(), (512 & 2) != 0 ? strategyProfitResponse.profitNum : latestProfit.getProfitNum(), (512 & 4) != 0 ? strategyProfitResponse.cTime : latestProfit.getCTime(), (512 & 8) != 0 ? strategyProfitResponse.totalPnl : latestProfit.getTotalPnl(), (512 & 16) != 0 ? strategyProfitResponse.pnlRatio : latestProfit.getPnlRatio(), (512 & 32) != 0 ? strategyProfitResponse.timeUnit : latestProfit.getTimeUnit(), (512 & 64) != 0 ? strategyProfitResponse.sourceCcy : latestProfit.getSourceCcy(), (512 & 128) != 0 ? strategyProfitResponse.pnlRatioInSourceCcy : latestProfit.getPnlRatioInSourceCcy(), (512 & 256) != 0 ? strategyProfitResponse.totalPnlInSourceCcy : latestProfit.getTotalPnlInSourceCcy(), (512 & 512) != 0 ? strategyProfitResponse.marginPerCcy : null));
                    listAhwBna.addAll(CollectionsKt___CollectionsKt.djBIcL((java.lang.Iterable) listAxsJAYsNCnLh2, 1));
                    strategyDetailsResponse.setProfitSnapshots(listAhwBna);
                    listFJNWhG = listAhwBna;
                    objM7377constructorimpl = Result.m7377constructorimpl(listFJNWhG);
                } else {
                    strategyDetailsResponse.setProfitSnapshots(list);
                    listFJNWhG = list;
                    objM7377constructorimpl = Result.m7377constructorimpl(listFJNWhG);
                }
            } else {
                if (listAxsJAYsNCnLh == listAxsJAYsNCnLh2 || !(!listAxsJAYsNCnLh.isEmpty())) {
                    listFJNWhG = list;
                } else {
                    listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) listAxsJAYsNCnLh);
                    list.clear();
                    list.addAll(listFJNWhG);
                }
                objM7377constructorimpl = Result.m7377constructorimpl(listFJNWhG);
            }
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
            objM7377constructorimpl = list;
        }
        return (java.util.List) objM7377constructorimpl;
    }
}
