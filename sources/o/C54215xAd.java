package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.StrategyStopReq;
import com.okinc.unify_trade.biz.StrategyStopResponse;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xAd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54215xAd extends xKE<java.util.List<? extends StrategyStopResponse>> {
    public java.util.List<StrategyStopReq> KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C54215xAd copydefault(@NotNull java.util.List<StrategyStopReq> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.KWHzl = list;
        return this;
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.StrategyStopResponse>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends StrategyStopResponse>>> EZpvd() {
        java.util.List<StrategyStopReq> list = null;
        BizApiService bizApiService = (BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null);
        java.util.List<StrategyStopReq> list2 = this.KWHzl;
        if (list2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            list = list2;
        }
        return bizApiService.stopStrategyOrder(list);
    }
}
