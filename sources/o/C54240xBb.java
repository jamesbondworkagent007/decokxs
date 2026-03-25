package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.EmptyResp;
import com.okinc.unify_trade.bot.data.SignalBotEditStrategyBean;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xBb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54240xBb extends xKE<java.util.List<? extends EmptyResp>> {
    public SignalBotEditStrategyBean OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull SignalBotEditStrategyBean signalBotEditStrategyBean) {
        Intrinsics.checkNotNullParameter(signalBotEditStrategyBean, "");
        this.OLrzqt = signalBotEditStrategyBean;
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.EmptyResp>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends EmptyResp>>> EZpvd() {
        BizApiService bizApiService = (BizApiService) C43417ror.OLrzqt(C56524yIo.AEQbTJ(BizApiService.class));
        SignalBotEditStrategyBean signalBotEditStrategyBean = this.OLrzqt;
        if (signalBotEditStrategyBean == null) {
            Intrinsics.gEmmrt("");
            signalBotEditStrategyBean = null;
        }
        return bizApiService.fetchEditStrategy(signalBotEditStrategyBean);
    }
}
