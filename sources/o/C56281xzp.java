package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.HomeSignalCardResult;
import com.okinc.unify_trade.net.BizApiService;

/* JADX INFO: renamed from: o.xzp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C56281xzp extends xKE<java.util.List<? extends HomeSignalCardResult>> {
    public java.lang.String AEQbTJ;
    public java.lang.String EZpvd;
    public java.lang.String KWHzl;
    public java.lang.String OLrzqt;
    public java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        this.EZpvd = str;
        this.KWHzl = str2;
        this.OLrzqt = str3;
        this.AEQbTJ = str4;
        this.copydefault = str5;
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.HomeSignalCardResult>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends HomeSignalCardResult>>> EZpvd() {
        return ((BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null)).fetchSignalList(this.EZpvd, this.KWHzl, this.OLrzqt, this.AEQbTJ, this.copydefault);
    }
}
