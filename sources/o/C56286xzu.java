package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.EmptyResp;
import com.okinc.unify_trade.biz.SwitchRenewData;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xzu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C56286xzu extends xKE<java.util.List<? extends EmptyResp>> {
    public SwitchRenewData OLrzqt = new SwitchRenewData((java.lang.String) null, (java.lang.Boolean) null, 3, (DefaultConstructorMarker) null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56286xzu copydefault(@NotNull SwitchRenewData switchRenewData) {
        Intrinsics.checkNotNullParameter(switchRenewData, "");
        this.OLrzqt = switchRenewData;
        return this;
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.EmptyResp>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends EmptyResp>>> EZpvd() {
        return ((BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null)).manualRenew(this.OLrzqt);
    }
}
