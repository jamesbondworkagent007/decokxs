package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.tradeapi.bean.TradeBehaviorBean;
import com.okinc.unify_trade.net.BizApiService;

/* JADX INFO: renamed from: o.xCg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54272xCg extends xKE<TradeBehaviorBean> {
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<TradeBehaviorBean>> EZpvd() {
        return ((BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null)).getTradeBehavior();
    }
}
