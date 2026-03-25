package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.RecurringModifyInvestmentReq;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xAN extends xKE<java.util.List<? extends java.lang.Object>> {
    public RecurringModifyInvestmentReq KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull RecurringModifyInvestmentReq recurringModifyInvestmentReq) {
        Intrinsics.checkNotNullParameter(recurringModifyInvestmentReq, "");
        this.KWHzl = recurringModifyInvestmentReq;
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<java.lang.Object>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends java.lang.Object>>> EZpvd() {
        RecurringModifyInvestmentReq recurringModifyInvestmentReq = null;
        BizApiService bizApiService = (BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null);
        RecurringModifyInvestmentReq recurringModifyInvestmentReq2 = this.KWHzl;
        if (recurringModifyInvestmentReq2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            recurringModifyInvestmentReq = recurringModifyInvestmentReq2;
        }
        return bizApiService.recurringManualAddOrder(recurringModifyInvestmentReq);
    }
}
