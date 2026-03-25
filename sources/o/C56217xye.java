package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.GridProfitReq;
import com.okinc.unify_trade.biz.GridProfitResponse;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xye, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C56217xye extends xKE<java.util.List<? extends GridProfitResponse>> {
    public java.lang.String copydefault = "";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56217xye copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = str;
        return this;
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.GridProfitResponse>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends GridProfitResponse>>> EZpvd() {
        return ((BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null)).makeGridProfit(this.copydefault, new GridProfitReq((java.lang.String) null, 1, (DefaultConstructorMarker) null));
    }
}
