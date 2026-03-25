package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.BotMaxAvailableResult;
import com.okinc.unify_trade.net.BizApiService;

/* JADX INFO: renamed from: o.xzN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C56253xzN extends xKE<java.util.List<? extends BotMaxAvailableResult>> {
    public java.lang.String EZpvd;
    public java.lang.String KWHzl;
    public java.lang.String OLrzqt;
    public java.lang.Boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(java.lang.String str, java.lang.Boolean bool, java.lang.String str2, java.lang.String str3) {
        this.OLrzqt = str;
        this.copydefault = bool;
        this.EZpvd = str2;
        this.KWHzl = str3;
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.BotMaxAvailableResult>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends BotMaxAvailableResult>>> EZpvd() {
        return ((BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null)).fetchBotMaxAvailable(this.OLrzqt, this.copydefault, this.EZpvd, this.KWHzl);
    }
}
