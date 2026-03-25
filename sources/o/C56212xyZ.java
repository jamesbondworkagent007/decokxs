package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.SignalBotSignalListBean;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xyZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C56212xyZ extends xKE<java.util.List<? extends SignalBotSignalListBean>> {
    public java.lang.String AEQbTJ;
    public java.lang.String KWHzl;
    public java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.KWHzl = str;
        this.AEQbTJ = str2;
        this.copydefault = str3;
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.SignalBotSignalListBean>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends SignalBotSignalListBean>>> EZpvd() {
        java.lang.String str = null;
        BizApiService bizApiService = (BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null);
        java.lang.String str2 = this.KWHzl;
        if (str2 == null) {
            Intrinsics.gEmmrt("");
            str2 = null;
        }
        java.lang.String str3 = this.AEQbTJ;
        if (str3 == null) {
            Intrinsics.gEmmrt("");
            str3 = null;
        }
        java.lang.String str4 = this.copydefault;
        if (str4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            str = str4;
        }
        return bizApiService.getSignalProviderSignals(str2, str3, str);
    }
}
