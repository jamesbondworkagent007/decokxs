package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.SimpleOptionsPositionVo;
import com.okinc.unify_trade.net.BizApiService;

/* JADX INFO: renamed from: o.xCy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54290xCy extends xKE<java.util.List<? extends SimpleOptionsPositionVo>> {
    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.SimpleOptionsPositionVo>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends SimpleOptionsPositionVo>>> EZpvd() {
        return ((BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null)).getSimpleOptionsPositions();
    }
}
