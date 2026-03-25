package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.bot.MaxCapital;
import com.okinc.unify_trade.net.BizApiService;

/* JADX INFO: renamed from: o.xBf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C54244xBf extends xKE<java.util.List<? extends MaxCapital>> {
    public java.lang.String OLrzqt = "";
    public java.lang.String KWHzl = "";
    public java.lang.String AEQbTJ = "";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.OLrzqt = str;
        this.KWHzl = str2;
        this.AEQbTJ = str3;
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.bot.MaxCapital>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends MaxCapital>>> EZpvd() {
        return ((BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null)).maxCapital(this.OLrzqt, this.KWHzl, this.AEQbTJ);
    }
}
