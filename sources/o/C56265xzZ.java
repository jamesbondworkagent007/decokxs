package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.StrategyDetailsResponse;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xzZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C56265xzZ extends xKE<java.util.List<? extends StrategyDetailsResponse>> {
    public java.lang.String copydefault = "";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56265xzZ EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = str;
        return this;
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.StrategyDetailsResponse>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends StrategyDetailsResponse>>> EZpvd() {
        return ((BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null)).getStrategyDetails(this.copydefault);
    }
}
