package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.ContractDcaLiqPxResult;
import com.okinc.unify_trade.net.BizApiService;

/* JADX INFO: renamed from: o.xxR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C56151xxR extends xKE<java.util.List<? extends ContractDcaLiqPxResult>> {
    public java.lang.String AEQbTJ;
    public java.lang.String EZpvd;
    public java.lang.String KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56151xxR copydefault(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.AEQbTJ = str;
        this.EZpvd = str2;
        this.KWHzl = str3;
        return this;
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.ContractDcaLiqPxResult>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends ContractDcaLiqPxResult>>> EZpvd() {
        return ((BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null)).getContractDcaLiqPx(this.AEQbTJ, this.EZpvd, this.KWHzl);
    }
}
