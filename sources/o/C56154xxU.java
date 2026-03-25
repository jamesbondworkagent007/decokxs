package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.DcaMinMarginResponse;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xxU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C56154xxU extends xKE<java.util.List<? extends DcaMinMarginResponse>> {
    public java.lang.String EZpvd;
    public java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56154xxU OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.copydefault = str;
        this.EZpvd = str2;
        return this;
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.DcaMinMarginResponse>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends DcaMinMarginResponse>>> EZpvd() {
        return ((BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null)).getContractDcaMinMargin(this.copydefault, this.EZpvd);
    }
}
