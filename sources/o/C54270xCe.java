package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.InstrumentInfo;
import com.okinc.unify_trade.net.BizApiService;

/* JADX INFO: renamed from: o.xCe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54270xCe extends xKE<java.util.List<? extends InstrumentInfo>> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.xKE, o.xKK
    public java.lang.String bB_() {
        return "com.okinc.unify_trade.SpotSimpleProductUseCase";
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.InstrumentInfo>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends InstrumentInfo>>> EZpvd() {
        return BizApiService.TaskDescription.getSimpleInstrumentsInfo$default((BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null), "SPOT", 0, 2, null);
    }
}
