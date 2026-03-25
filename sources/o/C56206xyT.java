package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.BotShareResult;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xyT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C56206xyT extends xKE<java.util.List<? extends BotShareResult>> {
    public static final int copydefault = 8;
    public java.lang.String AEQbTJ;
    public java.lang.String EZpvd;
    public java.lang.String KWHzl;
    public java.lang.String OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.EZpvd = str;
        this.OLrzqt = str2;
        this.AEQbTJ = str3;
        this.KWHzl = str4;
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.BotShareResult>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends BotShareResult>>> EZpvd() {
        java.lang.String str = null;
        BizApiService bizApiService = (BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null);
        java.lang.String str2 = this.EZpvd;
        if (str2 == null) {
            Intrinsics.gEmmrt("");
            str2 = null;
        }
        java.lang.String str3 = this.OLrzqt;
        if (str3 == null) {
            Intrinsics.gEmmrt("");
            str3 = null;
        }
        java.lang.String str4 = this.AEQbTJ;
        if (str4 == null) {
            Intrinsics.gEmmrt("");
            str4 = null;
        }
        java.lang.String str5 = this.KWHzl;
        if (str5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            str = str5;
        }
        return bizApiService.fetchBotShareUrl(str2, str3, str4, str);
    }
}
