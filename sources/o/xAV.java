package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.SignalBotSignParamsResult;
import com.okinc.unify_trade.net.BizApiService;

/* JADX INFO: loaded from: classes19.dex */
public final class xAV extends xKE<java.util.List<? extends SignalBotSignParamsResult>> {
    public java.lang.String OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final xAV AEQbTJ(java.lang.String str) {
        this.OLrzqt = str;
        return this;
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.SignalBotSignParamsResult>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends SignalBotSignParamsResult>>> EZpvd() {
        return ((BizApiService) C43417ror.OLrzqt(C56524yIo.AEQbTJ(BizApiService.class))).fetchSignalBotSignParams(this.OLrzqt);
    }
}
