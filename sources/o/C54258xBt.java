package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.BannerOrderDetails;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xBt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C54258xBt extends xKE<java.util.List<? extends BannerOrderDetails>> {
    public java.lang.String OLrzqt = "";
    public java.lang.String AEQbTJ = "";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = str;
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.BannerOrderDetails>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends BannerOrderDetails>>> EZpvd() {
        return ((BizApiService) C43417ror.OLrzqt(C56524yIo.AEQbTJ(BizApiService.class))).getBannerOrderDetails(this.OLrzqt, this.AEQbTJ);
    }
}
