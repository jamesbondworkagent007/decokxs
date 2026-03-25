package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.PortfolioData;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xyH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C56194xyH extends xKE<java.util.List<? extends PortfolioData>> {
    public java.lang.String AEQbTJ;
    public java.lang.String KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.KWHzl = str;
        this.AEQbTJ = str2;
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.PortfolioData>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends PortfolioData>>> EZpvd() {
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
        } else {
            str = str3;
        }
        return bizApiService.getPortfolioWeight(str2, str);
    }
}
