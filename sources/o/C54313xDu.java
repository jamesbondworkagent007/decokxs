package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.BizModifyAlgoOrderReq;
import com.okinc.unify_trade.biz.OrderExpResp;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.xDu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C54313xDu extends xKE<java.util.List<? extends OrderExpResp>> {
    public BizModifyAlgoOrderReq OLrzqt;

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.OrderExpResp>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends OrderExpResp>>> EZpvd() {
        BizApiService bizApiService = (BizApiService) C43417ror.OLrzqt(C56524yIo.AEQbTJ(BizApiService.class));
        BizModifyAlgoOrderReq bizModifyAlgoOrderReq = this.OLrzqt;
        Intrinsics.copydefault(bizModifyAlgoOrderReq);
        return bizApiService.modifyAlgoOrder(bizModifyAlgoOrderReq);
    }
}
