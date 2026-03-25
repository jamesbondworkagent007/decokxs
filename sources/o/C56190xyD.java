package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.RsiTrigger;
import com.okinc.unify_trade.net.BizApiService;

/* JADX INFO: renamed from: o.xyD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C56190xyD extends xKE<java.util.List<? extends RsiTrigger>> {
    public java.lang.String AEQbTJ;
    public java.lang.String EZpvd;
    public java.lang.String KWHzl;
    public java.lang.String OLrzqt;
    public java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        this.OLrzqt = str;
        this.copydefault = str2;
        this.KWHzl = str3;
        this.AEQbTJ = str4;
        this.EZpvd = str5;
    }

    public static /* synthetic */ void setParams$default(C56190xyD c56190xyD, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            str5 = null;
        }
        c56190xyD.OLrzqt(str, str2, str3, str4, str5);
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.RsiTrigger>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends RsiTrigger>>> EZpvd() {
        return ((BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null)).queryRsiTrigger(this.OLrzqt, this.copydefault, this.KWHzl, this.AEQbTJ, this.EZpvd);
    }
}
