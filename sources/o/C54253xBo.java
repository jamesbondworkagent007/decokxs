package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.OrderPositions;
import com.okinc.unify_trade.net.BizApiService;

/* JADX INFO: renamed from: o.xBo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54253xBo extends xKE<java.util.List<? extends OrderPositions>> {
    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.OrderPositions>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends OrderPositions>>> EZpvd() {
        return BizApiService.TaskDescription.getDexPrivateSummary$default((BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null), null, 1, null);
    }
}
