package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.bot.RecommendedParamsDto;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xyL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C56198xyL extends xKE<java.util.List<? extends RecommendedParamsDto>> {
    public java.lang.String EZpvd;
    public java.lang.String KWHzl;
    public java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(java.lang.String str) {
        this.copydefault = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = str;
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.bot.RecommendedParamsDto>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends RecommendedParamsDto>>> EZpvd() {
        java.lang.String str = null;
        BizApiService bizApiService = (BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null);
        java.lang.String str2 = this.copydefault;
        java.lang.String str3 = this.EZpvd;
        if (str3 == null) {
            Intrinsics.gEmmrt("");
            str3 = null;
        }
        java.lang.String str4 = this.KWHzl;
        if (str4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            str = str4;
        }
        return bizApiService.getRecommendedParam(str2, str3, str);
    }
}
