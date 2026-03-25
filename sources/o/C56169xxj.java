package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.LeverageInfo;
import com.okinc.unify_trade.net.BizApiService;

/* JADX INFO: renamed from: o.xxj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C56169xxj extends xKE<java.util.List<? extends LeverageInfo>> {
    public java.lang.String AEQbTJ;
    public java.lang.String EZpvd;
    public java.lang.String OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56169xxj EZpvd(java.lang.String str) {
        this.AEQbTJ = str;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56169xxj OLrzqt(java.lang.String str) {
        this.OLrzqt = str;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56169xxj copydefault(java.lang.String str) {
        this.EZpvd = str;
        return this;
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.LeverageInfo>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends LeverageInfo>>> EZpvd() {
        return ((BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null)).getLeverageInfo(this.OLrzqt, this.AEQbTJ, this.EZpvd);
    }
}
