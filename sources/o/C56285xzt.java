package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.BotSectorUnderlyingListBean;
import com.okinc.unify_trade.net.BizApiService;

/* JADX INFO: renamed from: o.xzt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C56285xzt extends xKE<java.util.List<? extends BotSectorUnderlyingListBean>> {
    public static final int copydefault = 0;

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.BotSectorUnderlyingListBean>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends BotSectorUnderlyingListBean>>> EZpvd() {
        return ((BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null)).getSectorUnderlyingList();
    }
}
