package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.ArbitrageOrderData;
import com.okinc.unify_trade.biz.ArbitrageOrderResponse;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xzI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C56248xzI extends xKE<java.util.List<? extends ArbitrageOrderResponse>> {
    public ArbitrageOrderData AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56248xzI AEQbTJ(@NotNull ArbitrageOrderData arbitrageOrderData) {
        Intrinsics.checkNotNullParameter(arbitrageOrderData, "");
        this.AEQbTJ = arbitrageOrderData;
        return this;
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.ArbitrageOrderResponse>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends ArbitrageOrderResponse>>> EZpvd() {
        ArbitrageOrderData arbitrageOrderData = null;
        BizApiService bizApiService = (BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null);
        ArbitrageOrderData arbitrageOrderData2 = this.AEQbTJ;
        if (arbitrageOrderData2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            arbitrageOrderData = arbitrageOrderData2;
        }
        return bizApiService.arbitrageOrder(arbitrageOrderData);
    }
}
