package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.BizModifyOrderReq;
import com.okinc.unify_trade.biz.OrderExpResp;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class xDB extends xKE<java.util.List<? extends OrderExpResp>> {
    public BizModifyOrderReq EZpvd;

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.OrderExpResp>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends OrderExpResp>>> EZpvd() {
        BizApiService bizApiService = (BizApiService) C43417ror.OLrzqt(C56524yIo.AEQbTJ(BizApiService.class));
        BizModifyOrderReq bizModifyOrderReq = this.EZpvd;
        Intrinsics.copydefault(bizModifyOrderReq);
        return bizApiService.modifyOrder(bizModifyOrderReq);
    }
}
