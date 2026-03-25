package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.subscribe.SpreadArbitrageData;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xCz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54291xCz extends xKE<java.util.List<? extends SpreadArbitrageData>> {
    public java.lang.String EZpvd = "";
    public java.lang.String AEQbTJ = "spread_arbitrage";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C54291xCz AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = str;
        return this;
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.subscribe.SpreadArbitrageData>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends SpreadArbitrageData>>> EZpvd() {
        return ((BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null)).getSpreadArbitrageDetail(this.EZpvd, this.AEQbTJ);
    }
}
