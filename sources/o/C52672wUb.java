package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.ContractGridSyncParamReq;
import com.okinc.unify_trade.biz.ContractGridSyncParamResp;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wUb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C52672wUb extends xKE<java.util.List<? extends ContractGridSyncParamResp>> {
    public ContractGridSyncParamReq EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull ContractGridSyncParamReq contractGridSyncParamReq) {
        Intrinsics.checkNotNullParameter(contractGridSyncParamReq, "");
        this.EZpvd = contractGridSyncParamReq;
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.ContractGridSyncParamResp>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends ContractGridSyncParamResp>>> EZpvd() {
        ContractGridSyncParamReq contractGridSyncParamReq = null;
        BizApiService bizApiService = (BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null);
        ContractGridSyncParamReq contractGridSyncParamReq2 = this.EZpvd;
        if (contractGridSyncParamReq2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            contractGridSyncParamReq = contractGridSyncParamReq2;
        }
        return bizApiService.ContractGridSyncParam(contractGridSyncParamReq);
    }
}
