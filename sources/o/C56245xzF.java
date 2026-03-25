package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.subscribe.StrategyPendingListResp;
import com.okinc.unify_trade.net.BizApiService;

/* JADX INFO: renamed from: o.xzF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C56245xzF extends xKE<java.util.List<? extends StrategyPendingListResp>> {
    public java.lang.String AEQbTJ;
    public java.lang.String AYXKKw;
    public java.lang.String AhwBna;
    public boolean EZpvd = true;
    public java.lang.String KWHzl;
    public java.lang.String OLrzqt;
    public java.lang.String copydefault;
    public java.lang.String djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(java.lang.String str) {
        this.AYXKKw = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(boolean z) {
        this.EZpvd = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AhwBna(java.lang.String str) {
        this.djBIcL = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(java.lang.String str) {
        this.KWHzl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(java.lang.String str) {
        this.AEQbTJ = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(java.lang.String str) {
        this.AhwBna = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(java.lang.String str) {
        this.OLrzqt = str;
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.subscribe.StrategyPendingListResp>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends StrategyPendingListResp>>> EZpvd() {
        BizApiService bizApiService = (BizApiService) C43393roT.EZpvd(C56524yIo.AEQbTJ(BizApiService.class), C56032xvE.KWHzl());
        java.lang.String str = this.AEQbTJ;
        java.lang.String str2 = this.copydefault;
        java.lang.String str3 = this.djBIcL;
        java.lang.String str4 = this.OLrzqt;
        boolean z = this.EZpvd;
        return BizApiService.TaskDescription.getPendingStrategyOrderList$default(bizApiService, str2, null, null, null, null, str, null, null, null, null, null, null, this.AhwBna, null, null, null, java.lang.Boolean.valueOf(z), null, str3, str4, this.KWHzl, this.AYXKKw, 192478, null);
    }
}
