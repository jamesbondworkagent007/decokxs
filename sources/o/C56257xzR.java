package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.FetchMultiInstsResult;
import com.okinc.unify_trade.net.BizApiService;

/* JADX INFO: renamed from: o.xzR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C56257xzR extends xKE<java.util.List<? extends FetchMultiInstsResult>> {
    public java.lang.String EZpvd;
    public java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(java.lang.String str, java.lang.String str2) {
        this.copydefault = str;
        this.EZpvd = str2;
    }

    public static /* synthetic */ void setParams$default(C56257xzR c56257xzR, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        c56257xzR.KWHzl(str, str2);
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.FetchMultiInstsResult>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends FetchMultiInstsResult>>> EZpvd() {
        return ((BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null)).fetchMultiInsts(this.copydefault, this.EZpvd);
    }
}
