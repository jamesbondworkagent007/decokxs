package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.MinInvestReq;
import com.okinc.unify_trade.biz.MinInvestResp;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xxx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C56183xxx extends xKE<java.util.List<? extends MinInvestResp>> {
    public MinInvestReq AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull MinInvestReq minInvestReq) {
        Intrinsics.checkNotNullParameter(minInvestReq, "");
        this.AEQbTJ = minInvestReq;
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.MinInvestResp>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends MinInvestResp>>> EZpvd() {
        MinInvestReq minInvestReq = null;
        BizApiService bizApiService = (BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null);
        MinInvestReq minInvestReq2 = this.AEQbTJ;
        if (minInvestReq2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            minInvestReq = minInvestReq2;
        }
        return bizApiService.recurringMinInvest(minInvestReq);
    }
}
