package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.bot.grid.bean.ResumeSpotGridData;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xyp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C56228xyp extends xKE<java.util.List<? extends ResumeSpotGridData>> {
    public java.lang.String KWHzl = "";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = str;
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.bot.grid.bean.ResumeSpotGridData>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends ResumeSpotGridData>>> EZpvd() {
        return ((BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null)).querySpotGrid(this.KWHzl);
    }
}
