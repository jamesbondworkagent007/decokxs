package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.BotLeadProfitProfitDetails;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xyR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C56204xyR extends xKE<java.util.List<? extends BotLeadProfitProfitDetails>> {
    public static final int copydefault = 8;
    public java.lang.String AEQbTJ = "";
    public java.lang.String OLrzqt = "";
    public java.lang.String EZpvd = "";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56204xyR EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.AEQbTJ = str;
        this.OLrzqt = str2;
        this.EZpvd = str3;
        return this;
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.BotLeadProfitProfitDetails>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends BotLeadProfitProfitDetails>>> EZpvd() {
        return ((BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null)).loadBotProfitDetails(this.AEQbTJ, this.OLrzqt, this.EZpvd);
    }
}
