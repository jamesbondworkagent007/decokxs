package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.ThirdSignalDetail;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class xAZ extends xKE<java.util.List<? extends ThirdSignalDetail>> {
    public java.lang.String KWHzl = "";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = str;
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.ThirdSignalDetail>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends ThirdSignalDetail>>> EZpvd() {
        return ((BizApiService) C43417ror.OLrzqt(C56524yIo.AEQbTJ(BizApiService.class))).fetchSignalDetail(this.KWHzl);
    }
}
