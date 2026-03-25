package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.EmptyResp;
import com.okinc.unify_trade.biz.TradeUnitReq;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xxs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C56178xxs extends xKE<java.util.List<? extends EmptyResp>> {
    public TradeUnitReq copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56178xxs AEQbTJ(@NotNull TradeUnitReq tradeUnitReq) {
        Intrinsics.checkNotNullParameter(tradeUnitReq, "");
        this.copydefault = tradeUnitReq;
        return this;
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.EmptyResp>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends EmptyResp>>> EZpvd() {
        TradeUnitReq tradeUnitReq = null;
        BizApiService bizApiService = (BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null);
        TradeUnitReq tradeUnitReq2 = this.copydefault;
        if (tradeUnitReq2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            tradeUnitReq = tradeUnitReq2;
        }
        return bizApiService.setTradeUnit(tradeUnitReq);
    }
}
