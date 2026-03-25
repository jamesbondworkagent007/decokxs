package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.GridInstantTriggerReq;
import com.okinc.unify_trade.biz.GridTriggerResp;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xzX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C56263xzX extends xKE<java.util.List<? extends GridTriggerResp>> {
    public GridInstantTriggerReq AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull GridInstantTriggerReq gridInstantTriggerReq) {
        Intrinsics.checkNotNullParameter(gridInstantTriggerReq, "");
        this.AEQbTJ = gridInstantTriggerReq;
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.GridTriggerResp>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends GridTriggerResp>>> EZpvd() {
        GridInstantTriggerReq gridInstantTriggerReq = null;
        BizApiService bizApiService = (BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null);
        GridInstantTriggerReq gridInstantTriggerReq2 = this.AEQbTJ;
        if (gridInstantTriggerReq2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            gridInstantTriggerReq = gridInstantTriggerReq2;
        }
        return bizApiService.gridInstantTrigger(gridInstantTriggerReq);
    }
}
