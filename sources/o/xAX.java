package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.SignalBotUpdateReq;
import com.okinc.unify_trade.biz.SignalListItem;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class xAX extends xKE<java.util.List<? extends SignalListItem>> {
    public SignalBotUpdateReq copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final xAX copydefault(@NotNull SignalBotUpdateReq signalBotUpdateReq) {
        Intrinsics.checkNotNullParameter(signalBotUpdateReq, "");
        this.copydefault = signalBotUpdateReq;
        return this;
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.SignalListItem>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends SignalListItem>>> EZpvd() {
        BizApiService bizApiService = (BizApiService) C43417ror.OLrzqt(C56524yIo.AEQbTJ(BizApiService.class));
        SignalBotUpdateReq signalBotUpdateReq = this.copydefault;
        if (signalBotUpdateReq == null) {
            Intrinsics.gEmmrt("");
            signalBotUpdateReq = null;
        }
        return bizApiService.updateSignalBotSign(signalBotUpdateReq);
    }
}
