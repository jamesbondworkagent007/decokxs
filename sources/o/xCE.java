package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.subscribe.ArbitrageSpreadResp;
import com.okinc.unify_trade.net.BizApiService;

/* JADX INFO: loaded from: classes12.dex */
public final class xCE extends xKE<ArbitrageSpreadResp> {
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<ArbitrageSpreadResp>> EZpvd() {
        return ((BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null)).loadSpreadArbitrageInfo();
    }
}
