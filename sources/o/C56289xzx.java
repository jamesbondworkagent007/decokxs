package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.ContractGridAdjustMarginReq;
import com.okinc.unify_trade.biz.ContractGridAdjustMarginResp;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xzx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C56289xzx extends xKE<java.util.List<? extends ContractGridAdjustMarginResp>> {
    public ContractGridAdjustMarginReq EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull ContractGridAdjustMarginReq contractGridAdjustMarginReq) {
        Intrinsics.checkNotNullParameter(contractGridAdjustMarginReq, "");
        this.EZpvd = contractGridAdjustMarginReq;
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.ContractGridAdjustMarginResp>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends ContractGridAdjustMarginResp>>> EZpvd() {
        ContractGridAdjustMarginReq contractGridAdjustMarginReq = null;
        BizApiService bizApiService = (BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null);
        ContractGridAdjustMarginReq contractGridAdjustMarginReq2 = this.EZpvd;
        if (contractGridAdjustMarginReq2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            contractGridAdjustMarginReq = contractGridAdjustMarginReq2;
        }
        return bizApiService.contractGridAdjustMargin(contractGridAdjustMarginReq);
    }
}
