package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.AdditionalInvest;
import com.okinc.unify_trade.biz.TrailingDownReq;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xxV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C56155xxV extends xKE<java.util.List<? extends AdditionalInvest>> {
    public TrailingDownReq EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull TrailingDownReq trailingDownReq) {
        Intrinsics.checkNotNullParameter(trailingDownReq, "");
        this.EZpvd = trailingDownReq;
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.AdditionalInvest>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends AdditionalInvest>>> EZpvd() {
        TrailingDownReq trailingDownReq = null;
        BizApiService bizApiService = (BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null);
        TrailingDownReq trailingDownReq2 = this.EZpvd;
        if (trailingDownReq2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            trailingDownReq = trailingDownReq2;
        }
        return bizApiService.getAdditionalInvest(trailingDownReq);
    }
}
