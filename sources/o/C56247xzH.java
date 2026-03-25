package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.StrategyHistoryListReq;
import com.okinc.unify_trade.biz.subscribe.StrategyHistoryListResp;
import com.okinc.unify_trade.net.BizApiService;

/* JADX INFO: renamed from: o.xzH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C56247xzH extends xKE<java.util.List<? extends StrategyHistoryListResp>> {
    public StrategyHistoryListReq EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(StrategyHistoryListReq strategyHistoryListReq) {
        this.EZpvd = strategyHistoryListReq;
    }

    public static /* synthetic */ void setReq$default(C56247xzH c56247xzH, StrategyHistoryListReq strategyHistoryListReq, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            strategyHistoryListReq = null;
        }
        c56247xzH.copydefault(strategyHistoryListReq);
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.subscribe.StrategyHistoryListResp>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends StrategyHistoryListResp>>> EZpvd() {
        BizApiService bizApiService = (BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null);
        StrategyHistoryListReq strategyHistoryListReq = this.EZpvd;
        java.lang.String limit = strategyHistoryListReq != null ? strategyHistoryListReq.getLimit() : null;
        StrategyHistoryListReq strategyHistoryListReq2 = this.EZpvd;
        java.lang.String after = strategyHistoryListReq2 != null ? strategyHistoryListReq2.getAfter() : null;
        StrategyHistoryListReq strategyHistoryListReq3 = this.EZpvd;
        java.lang.String start = strategyHistoryListReq3 != null ? strategyHistoryListReq3.getStart() : null;
        StrategyHistoryListReq strategyHistoryListReq4 = this.EZpvd;
        java.lang.String end = strategyHistoryListReq4 != null ? strategyHistoryListReq4.getEnd() : null;
        StrategyHistoryListReq strategyHistoryListReq5 = this.EZpvd;
        java.lang.String systemSource = strategyHistoryListReq5 != null ? strategyHistoryListReq5.getSystemSource() : null;
        StrategyHistoryListReq strategyHistoryListReq6 = this.EZpvd;
        java.lang.String nmpUnderlyingIds = strategyHistoryListReq6 != null ? strategyHistoryListReq6.getNmpUnderlyingIds() : null;
        StrategyHistoryListReq strategyHistoryListReq7 = this.EZpvd;
        return bizApiService.getAllBotHistoryList(limit, after, start, end, systemSource, nmpUnderlyingIds, strategyHistoryListReq7 != null ? strategyHistoryListReq7.getRequireProfits() : false);
    }
}
