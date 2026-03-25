package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.ContractDcaAvaData;
import com.okinc.unify_trade.net.BizApiService;

/* JADX INFO: renamed from: o.xxy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C56184xxy extends xKE<java.util.List<? extends ContractDcaAvaData>> {
    public java.lang.String AEQbTJ;
    public java.lang.String EZpvd;
    public java.lang.String OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56184xxy OLrzqt(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.OLrzqt = str;
        this.AEQbTJ = str2;
        this.EZpvd = str3;
        return this;
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.ContractDcaAvaData>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends ContractDcaAvaData>>> EZpvd() {
        return ((BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null)).checkContractDcaAddOrder(this.OLrzqt, this.AEQbTJ, this.EZpvd);
    }
}
