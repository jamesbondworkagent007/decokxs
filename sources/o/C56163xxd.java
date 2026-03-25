package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.subscribe.WsAccountSummaryData;
import com.okinc.unify_trade.net.BizApiService;

/* JADX INFO: renamed from: o.xxd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C56163xxd extends xKE<java.util.List<? extends WsAccountSummaryData>> {
    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.subscribe.WsAccountSummaryData>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends WsAccountSummaryData>>> EZpvd() {
        return ((BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null)).getAccountSummary();
    }
}
