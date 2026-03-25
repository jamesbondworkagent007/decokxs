package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.StrategyOrderBillDetailsResponse;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class xCW extends xKE<java.util.List<? extends StrategyOrderBillDetailsResponse>> {
    public java.lang.String AEQbTJ = "";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = str;
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.StrategyOrderBillDetailsResponse>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends StrategyOrderBillDetailsResponse>>> EZpvd() {
        return BizApiService.TaskDescription.fetchDcaNoCloseOpenOrder$default((BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null), this.AEQbTJ, null, null, null, null, 30, null);
    }
}
