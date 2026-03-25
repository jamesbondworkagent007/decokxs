package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.GridStatistics;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xyP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C56202xyP extends xKE<java.util.List<? extends GridStatistics>> {
    public java.lang.String OLrzqt = "";
    public java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = str;
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.GridStatistics>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends GridStatistics>>> EZpvd() {
        return ((BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null)).queryGridStatistics(this.copydefault, this.OLrzqt);
    }
}
