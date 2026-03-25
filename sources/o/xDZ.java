package o;

import com.okinc.unify_trade.biz.StrategyProfitResponse;
import com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xDZ {
    public static final <T> void EZpvd(@NotNull CopyOnWriteArrayList<T> copyOnWriteArrayList, int i, T t) {
        java.lang.Object objM7377constructorimpl;
        Intrinsics.checkNotNullParameter(copyOnWriteArrayList, "");
        try {
            Result.Application application = Result.Companion;
            BizTradeStrategyInfo bizTradeStrategyInfo = t instanceof BizTradeStrategyInfo ? (BizTradeStrategyInfo) t : null;
            StrategyProfitResponse latestProfitData = bizTradeStrategyInfo != null ? bizTradeStrategyInfo.getLatestProfitData() : null;
            java.lang.Object objAkhnZx = CollectionsKt___CollectionsKt.AkhnZx(copyOnWriteArrayList, i);
            BizTradeStrategyInfo bizTradeStrategyInfo2 = objAkhnZx instanceof BizTradeStrategyInfo ? (BizTradeStrategyInfo) objAkhnZx : null;
            java.util.List<StrategyProfitResponse> ongoingProfitSnapshots = bizTradeStrategyInfo2 != null ? bizTradeStrategyInfo2.getOngoingProfitSnapshots() : null;
            if (!Intrinsics.EZpvd(latestProfitData, ongoingProfitSnapshots != null ? (StrategyProfitResponse) CollectionsKt___CollectionsKt.firstOrNull(ongoingProfitSnapshots) : null)) {
                if ((ongoingProfitSnapshots != null ? (StrategyProfitResponse) CollectionsKt___CollectionsKt.AkhnZx(ongoingProfitSnapshots, 0) : null) != null && latestProfitData != null) {
                    ongoingProfitSnapshots.set(0, latestProfitData);
                }
            }
            java.lang.Object objAkhnZx2 = CollectionsKt___CollectionsKt.AkhnZx(copyOnWriteArrayList, i);
            BizTradeStrategyInfo bizTradeStrategyInfo3 = objAkhnZx2 instanceof BizTradeStrategyInfo ? (BizTradeStrategyInfo) objAkhnZx2 : null;
            if ((bizTradeStrategyInfo3 != null ? bizTradeStrategyInfo3.getOngoingProfitSnapshots() : null) != null) {
                BizTradeStrategyInfo bizTradeStrategyInfo4 = t instanceof BizTradeStrategyInfo ? (BizTradeStrategyInfo) t : null;
                if (bizTradeStrategyInfo4 != null) {
                    java.lang.Object objAkhnZx3 = CollectionsKt___CollectionsKt.AkhnZx(copyOnWriteArrayList, i);
                    BizTradeStrategyInfo bizTradeStrategyInfo5 = objAkhnZx3 instanceof BizTradeStrategyInfo ? (BizTradeStrategyInfo) objAkhnZx3 : null;
                    bizTradeStrategyInfo4.setOngoingProfitSnapshots(bizTradeStrategyInfo5 != null ? bizTradeStrategyInfo5.getOngoingProfitSnapshots() : null);
                }
            }
            if (CollectionsKt___CollectionsKt.AkhnZx(copyOnWriteArrayList, i) != null) {
                copyOnWriteArrayList.set(i, t);
            }
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
            pUU.copydefault("BotOrderListTask", "safe set error, index: " + i);
        }
    }
}
