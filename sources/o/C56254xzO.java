package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.PinBotReq;
import com.okinc.unify_trade.biz.PinBotResp;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xzO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C56254xzO extends xKE<java.util.List<? extends PinBotResp>> {
    public PinBotReq AEQbTJ = new PinBotReq((java.lang.String) null, (java.lang.String) null, 3, (DefaultConstructorMarker) null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56254xzO EZpvd(@NotNull PinBotReq pinBotReq) {
        Intrinsics.checkNotNullParameter(pinBotReq, "");
        this.AEQbTJ = pinBotReq;
        return this;
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.PinBotResp>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends PinBotResp>>> EZpvd() {
        return ((BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null)).pinBot(this.AEQbTJ);
    }
}
