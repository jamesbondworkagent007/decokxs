package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.ContractGridClosePositionData;
import com.okinc.unify_trade.biz.ContractGridClosePositionReq;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xzr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C56283xzr extends xKE<java.util.List<? extends ContractGridClosePositionData>> {
    public ContractGridClosePositionReq AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull ContractGridClosePositionReq contractGridClosePositionReq) {
        Intrinsics.checkNotNullParameter(contractGridClosePositionReq, "");
        this.AEQbTJ = contractGridClosePositionReq;
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.ContractGridClosePositionData>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends ContractGridClosePositionData>>> EZpvd() {
        ContractGridClosePositionReq contractGridClosePositionReq = null;
        BizApiService bizApiService = (BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null);
        ContractGridClosePositionReq contractGridClosePositionReq2 = this.AEQbTJ;
        if (contractGridClosePositionReq2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            contractGridClosePositionReq = contractGridClosePositionReq2;
        }
        return bizApiService.contractGridClosePosition(contractGridClosePositionReq);
    }
}
