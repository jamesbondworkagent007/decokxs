package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.InstrumentInfo;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xBP extends xKE<java.util.ArrayList<InstrumentInfo>> {
    public java.lang.String KWHzl = "";
    public java.lang.String EZpvd = "";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final xBP AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = str;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final xBP OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = str;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.xKE, o.xKK
    public java.lang.String bB_() {
        return "com.okinc.unify_trade.ProductsUseCase";
    }

    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.ArrayList<InstrumentInfo>>> EZpvd() {
        return BizApiService.TaskDescription.getInstrumentDetails$default((BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null), this.KWHzl, this.EZpvd, 0, 4, null);
    }
}
