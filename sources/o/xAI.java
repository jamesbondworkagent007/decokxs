package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.RecurringEditPriceRangeReq;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xAI extends xKE<java.util.List<? extends java.lang.Object>> {
    public RecurringEditPriceRangeReq KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull RecurringEditPriceRangeReq recurringEditPriceRangeReq) {
        Intrinsics.checkNotNullParameter(recurringEditPriceRangeReq, "");
        this.KWHzl = recurringEditPriceRangeReq;
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<java.lang.Object>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends java.lang.Object>>> EZpvd() {
        RecurringEditPriceRangeReq recurringEditPriceRangeReq = null;
        BizApiService bizApiService = (BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null);
        RecurringEditPriceRangeReq recurringEditPriceRangeReq2 = this.KWHzl;
        if (recurringEditPriceRangeReq2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            recurringEditPriceRangeReq = recurringEditPriceRangeReq2;
        }
        return bizApiService.recurringEditPriceRange(recurringEditPriceRangeReq);
    }
}
