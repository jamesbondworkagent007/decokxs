package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.SignalBotManualOrderReq;
import com.okinc.unify_trade.biz.StrategyResponse;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xBa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54239xBa extends xKE<java.util.List<? extends StrategyResponse>> {
    public SignalBotManualOrderReq OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C54239xBa copydefault(@NotNull SignalBotManualOrderReq signalBotManualOrderReq) {
        Intrinsics.checkNotNullParameter(signalBotManualOrderReq, "");
        this.OLrzqt = signalBotManualOrderReq;
        return this;
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.StrategyResponse>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends StrategyResponse>>> EZpvd() {
        BizApiService bizApiService = (BizApiService) C43417ror.OLrzqt(C56524yIo.AEQbTJ(BizApiService.class));
        SignalBotManualOrderReq signalBotManualOrderReq = this.OLrzqt;
        if (signalBotManualOrderReq == null) {
            Intrinsics.gEmmrt("");
            signalBotManualOrderReq = null;
        }
        return bizApiService.addSignalBotManualOrder(signalBotManualOrderReq);
    }
}
