package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.CancelSpotDcaOrderBody;
import com.okinc.unify_trade.biz.StrategyResponse;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xzv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C56287xzv extends xKE<java.util.List<? extends StrategyResponse>> {
    public CancelSpotDcaOrderBody OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56287xzv EZpvd(@NotNull CancelSpotDcaOrderBody cancelSpotDcaOrderBody) {
        Intrinsics.checkNotNullParameter(cancelSpotDcaOrderBody, "");
        this.OLrzqt = cancelSpotDcaOrderBody;
        return this;
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.StrategyResponse>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends StrategyResponse>>> EZpvd() {
        CancelSpotDcaOrderBody cancelSpotDcaOrderBody = null;
        BizApiService bizApiService = (BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null);
        CancelSpotDcaOrderBody cancelSpotDcaOrderBody2 = this.OLrzqt;
        if (cancelSpotDcaOrderBody2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            cancelSpotDcaOrderBody = cancelSpotDcaOrderBody2;
        }
        return bizApiService.cancelSpotDcaManualOrder(cancelSpotDcaOrderBody);
    }
}
