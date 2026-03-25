package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.EmptyResp;
import com.okinc.unify_trade.biz.SignalSubsReq;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xzi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C56274xzi extends xKE<java.util.List<? extends EmptyResp>> {
    public SignalSubsReq KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull SignalSubsReq signalSubsReq) {
        Intrinsics.checkNotNullParameter(signalSubsReq, "");
        this.KWHzl = signalSubsReq;
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.EmptyResp>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends EmptyResp>>> EZpvd() {
        SignalSubsReq signalSubsReq = null;
        BizApiService bizApiService = (BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null);
        SignalSubsReq signalSubsReq2 = this.KWHzl;
        if (signalSubsReq2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            signalSubsReq = signalSubsReq2;
        }
        return bizApiService.signalSubscribe(signalSubsReq);
    }
}
