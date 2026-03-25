package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.LeverageReq;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xxp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C56175xxp extends xKE<java.util.ArrayList<LeverageReq>> {
    public static final int copydefault = 8;
    public LeverageReq KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56175xxp AEQbTJ(@NotNull LeverageReq leverageReq) {
        Intrinsics.checkNotNullParameter(leverageReq, "");
        this.KWHzl = leverageReq;
        return this;
    }

    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.ArrayList<LeverageReq>>> EZpvd() {
        LeverageReq leverageReq = null;
        BizApiService bizApiService = (BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null);
        LeverageReq leverageReq2 = this.KWHzl;
        if (leverageReq2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            leverageReq = leverageReq2;
        }
        return bizApiService.setLeverage(leverageReq);
    }
}
