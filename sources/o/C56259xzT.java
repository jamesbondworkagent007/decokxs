package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.subscribe.StrategyHistoryListResp;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xzT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C56259xzT extends xKE<java.util.List<? extends StrategyHistoryListResp>> {
    public java.util.Map<java.lang.String, java.lang.String> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56259xzT copydefault(@NotNull java.util.Map<java.lang.String, java.lang.String> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.OLrzqt = map;
        return this;
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.subscribe.StrategyHistoryListResp>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends StrategyHistoryListResp>>> EZpvd() {
        java.util.Map<java.lang.String, java.lang.String> map = null;
        BizApiService bizApiService = (BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null);
        java.util.Map<java.lang.String, java.lang.String> map2 = this.OLrzqt;
        if (map2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            map = map2;
        }
        return bizApiService.getHistoryStrategyOrderList(map);
    }
}
