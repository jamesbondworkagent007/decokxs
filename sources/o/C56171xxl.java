package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.DualLeverageReq;
import com.okinc.unify_trade.biz.DualLeverageResp;
import com.okinc.unify_trade.biz.LeverageReq;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xxl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C56171xxl extends xKE<java.util.ArrayList<DualLeverageResp>> {
    public DualLeverageReq copydefault;

    public final C56171xxl copydefault(@NotNull java.util.List<LeverageReq> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.copydefault = new DualLeverageReq(list);
        return this;
    }

    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.ArrayList<DualLeverageResp>>> EZpvd() {
        DualLeverageReq dualLeverageReq = null;
        BizApiService bizApiService = (BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null);
        DualLeverageReq dualLeverageReq2 = this.copydefault;
        if (dualLeverageReq2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            dualLeverageReq = dualLeverageReq2;
        }
        return bizApiService.setDualLeverage(dualLeverageReq);
    }
}
