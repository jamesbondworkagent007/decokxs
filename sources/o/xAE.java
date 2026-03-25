package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.StrategyResponse;
import com.okinc.unify_trade.biz.ToggleReinvestmentReq;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xAE extends xKE<java.util.List<? extends StrategyResponse>> {
    public ToggleReinvestmentReq EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull ToggleReinvestmentReq toggleReinvestmentReq) {
        Intrinsics.checkNotNullParameter(toggleReinvestmentReq, "");
        this.EZpvd = toggleReinvestmentReq;
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.StrategyResponse>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends StrategyResponse>>> EZpvd() {
        ToggleReinvestmentReq toggleReinvestmentReq = null;
        BizApiService bizApiService = (BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null);
        ToggleReinvestmentReq toggleReinvestmentReq2 = this.EZpvd;
        if (toggleReinvestmentReq2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            toggleReinvestmentReq = toggleReinvestmentReq2;
        }
        return bizApiService.toggleReinvestment(toggleReinvestmentReq);
    }
}
