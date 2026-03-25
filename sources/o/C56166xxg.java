package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.RiskStatus;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xxg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C56166xxg extends xKE<java.util.List<? extends RiskStatus>> {
    public java.lang.String KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56166xxg AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = str;
        return this;
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.RiskStatus>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends RiskStatus>>> EZpvd() {
        java.lang.String str = null;
        BizApiService bizApiService = (BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null);
        java.lang.String str2 = this.KWHzl;
        if (str2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            str = str2;
        }
        return bizApiService.getCurrentStatus(str);
    }
}
