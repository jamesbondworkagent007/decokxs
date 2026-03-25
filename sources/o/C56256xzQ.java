package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.StrategyOrderBillDetailsResponse;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xzQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C56256xzQ extends xKE<java.util.List<? extends StrategyOrderBillDetailsResponse>> {
    public java.util.Map<java.lang.String, java.lang.String> AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56256xzQ AEQbTJ(@NotNull java.util.Map<java.lang.String, java.lang.String> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.AEQbTJ = map;
        return this;
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.StrategyOrderBillDetailsResponse>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends StrategyOrderBillDetailsResponse>>> EZpvd() {
        java.util.Map<java.lang.String, java.lang.String> map = null;
        BizApiService bizApiService = (BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null);
        java.util.Map<java.lang.String, java.lang.String> map2 = this.AEQbTJ;
        if (map2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            map = map2;
        }
        return bizApiService.getStrategyTradeBill(map);
    }
}
