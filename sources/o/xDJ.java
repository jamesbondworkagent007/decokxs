package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.ArbitrageFavoriteBean;
import com.okinc.unify_trade.net.BizApiService;

/* JADX INFO: loaded from: classes12.dex */
public final class xDJ extends xKE<java.util.List<? extends ArbitrageFavoriteBean>> {
    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.ArbitrageFavoriteBean>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends ArbitrageFavoriteBean>>> EZpvd() {
        return ((BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null)).getFavoriteList();
    }
}
