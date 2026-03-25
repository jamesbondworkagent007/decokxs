package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.bot.PreInvestDetail;
import com.okinc.unify_trade.net.BizApiService;

/* JADX INFO: renamed from: o.xBe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C54243xBe extends xKE<java.util.List<? extends PreInvestDetail>> {
    public java.lang.String AEQbTJ = "";
    public java.lang.String OLrzqt = "";
    public java.lang.String EZpvd = "";
    public java.lang.String copydefault = "";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        this.AEQbTJ = str;
        this.OLrzqt = str2;
        this.EZpvd = str3;
        this.copydefault = str4;
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.bot.PreInvestDetail>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends PreInvestDetail>>> EZpvd() {
        return ((BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null)).preInvestDetail(this.AEQbTJ, this.OLrzqt, this.EZpvd, this.copydefault);
    }
}
