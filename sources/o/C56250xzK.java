package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.EditStrategyNameReq;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xzK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C56250xzK extends xKE<java.util.List<? extends java.lang.Object>> {
    public EditStrategyNameReq AEQbTJ = new EditStrategyNameReq((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 7, (DefaultConstructorMarker) null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56250xzK AEQbTJ(@NotNull EditStrategyNameReq editStrategyNameReq) {
        Intrinsics.checkNotNullParameter(editStrategyNameReq, "");
        this.AEQbTJ = editStrategyNameReq;
        return this;
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<java.lang.Object>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends java.lang.Object>>> EZpvd() {
        return ((BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null)).amendBotName(this.AEQbTJ);
    }
}
