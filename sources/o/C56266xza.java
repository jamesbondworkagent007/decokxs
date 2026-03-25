package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.SignalBotSummaryBean;
import com.okinc.unify_trade.net.BizApiService;

/* JADX INFO: renamed from: o.xza, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C56266xza extends xKE<java.util.List<? extends SignalBotSummaryBean>> {
    public static final int KWHzl = 0;

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.SignalBotSummaryBean>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends SignalBotSummaryBean>>> EZpvd() {
        return ((BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null)).fetchSignalBotSummary();
    }
}
