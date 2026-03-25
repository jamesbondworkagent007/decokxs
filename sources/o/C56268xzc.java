package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.BotLeadProfitSummaryModel;
import com.okinc.unify_trade.net.BizApiService;

/* JADX INFO: renamed from: o.xzc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C56268xzc extends xKE<java.util.List<? extends BotLeadProfitSummaryModel>> {
    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.BotLeadProfitSummaryModel>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends BotLeadProfitSummaryModel>>> EZpvd() {
        return ((BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null)).loadBotLeadProfitSummary();
    }
}
