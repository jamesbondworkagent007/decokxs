package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.ContractDcaAvaData;
import com.okinc.unify_trade.net.BizApiService;

/* JADX INFO: renamed from: o.xxO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C56148xxO extends xKE<java.util.List<? extends ContractDcaAvaData>> {
    public java.lang.String KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56148xxO EZpvd(java.lang.String str) {
        this.KWHzl = str;
        return this;
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.ContractDcaAvaData>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends ContractDcaAvaData>>> EZpvd() {
        return ((BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null)).fetchContractDcaAva(this.KWHzl);
    }
}
