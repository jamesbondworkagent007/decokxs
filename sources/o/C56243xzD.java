package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.DcaTradeListResponse;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xzD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C56243xzD extends xKE<java.util.List<? extends DcaTradeListResponse>> {
    public java.lang.String EZpvd;
    public java.lang.String KWHzl;
    public java.lang.String OLrzqt;
    public java.lang.String copydefault = "";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56243xzD EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = str;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56243xzD KWHzl(java.lang.String str) {
        this.EZpvd = str;
        return this;
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.DcaTradeListResponse>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends DcaTradeListResponse>>> EZpvd() {
        return ((BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null)).getSpotDcaTradeList(this.copydefault, this.EZpvd, this.OLrzqt, this.KWHzl);
    }
}
