package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.SmartArbHisOrderItem;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xAk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C54222xAk extends xKE<java.util.List<? extends SmartArbHisOrderItem>> {
    public java.lang.String EZpvd = "";
    public java.lang.String OLrzqt = "";
    public java.lang.String KWHzl = "";
    public java.lang.String AEQbTJ = "";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = str;
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.SmartArbHisOrderItem>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends SmartArbHisOrderItem>>> EZpvd() {
        return ((BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null)).getSmartArbHistoryOrder(this.EZpvd, this.OLrzqt, this.KWHzl, this.AEQbTJ);
    }
}
