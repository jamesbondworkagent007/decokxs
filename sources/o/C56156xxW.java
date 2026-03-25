package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.GridOrderTpSlReq;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xxW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C56156xxW extends xKE<java.util.List<? extends C56157xxX>> {
    public GridOrderTpSlReq copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull GridOrderTpSlReq gridOrderTpSlReq) {
        Intrinsics.checkNotNullParameter(gridOrderTpSlReq, "");
        this.copydefault = gridOrderTpSlReq;
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<o.xxX>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends C56157xxX>>> EZpvd() {
        GridOrderTpSlReq gridOrderTpSlReq = null;
        BizApiService bizApiService = (BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null);
        GridOrderTpSlReq gridOrderTpSlReq2 = this.copydefault;
        if (gridOrderTpSlReq2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            gridOrderTpSlReq = gridOrderTpSlReq2;
        }
        return bizApiService.contractGridAdjustOrderStop(gridOrderTpSlReq);
    }
}
