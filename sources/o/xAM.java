package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.RecurringEditCycleTimeReq;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xAM extends xKE<java.util.List<? extends java.lang.Object>> {
    public RecurringEditCycleTimeReq KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull RecurringEditCycleTimeReq recurringEditCycleTimeReq) {
        Intrinsics.checkNotNullParameter(recurringEditCycleTimeReq, "");
        this.KWHzl = recurringEditCycleTimeReq;
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<java.lang.Object>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends java.lang.Object>>> EZpvd() {
        RecurringEditCycleTimeReq recurringEditCycleTimeReq = null;
        BizApiService bizApiService = (BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null);
        RecurringEditCycleTimeReq recurringEditCycleTimeReq2 = this.KWHzl;
        if (recurringEditCycleTimeReq2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            recurringEditCycleTimeReq = recurringEditCycleTimeReq2;
        }
        return bizApiService.recurringEditCycleTime(recurringEditCycleTimeReq);
    }
}
