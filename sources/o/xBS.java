package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.TradeCoinInfo;
import com.okinc.unify_trade.net.BizApiService;

/* JADX INFO: loaded from: classes12.dex */
public final class xBS extends xKE<java.util.ArrayList<TradeCoinInfo>> {
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.ArrayList<TradeCoinInfo>>> EZpvd() {
        return ((BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null)).getTradeCoins();
    }
}
