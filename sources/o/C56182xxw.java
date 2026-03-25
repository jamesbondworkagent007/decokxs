package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.EditContractDcaReq;
import com.okinc.unify_trade.biz.StrategyResponse;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xxw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C56182xxw extends xKE<java.util.List<? extends StrategyResponse>> {
    public EditContractDcaReq OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56182xxw KWHzl(@NotNull EditContractDcaReq editContractDcaReq) {
        Intrinsics.checkNotNullParameter(editContractDcaReq, "");
        this.OLrzqt = editContractDcaReq;
        return this;
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.StrategyResponse>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends StrategyResponse>>> EZpvd() {
        EditContractDcaReq editContractDcaReq = null;
        BizApiService bizApiService = (BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null);
        EditContractDcaReq editContractDcaReq2 = this.OLrzqt;
        if (editContractDcaReq2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            editContractDcaReq = editContractDcaReq2;
        }
        return bizApiService.contractDcaAddOrder(editContractDcaReq);
    }
}
