package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.BotLeadProfitOverviewModel;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xzb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C56267xzb extends xKE<java.util.List<? extends BotLeadProfitOverviewModel>> {
    public static final int AEQbTJ = 8;
    public java.lang.String KWHzl;
    public java.lang.String OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56267xzb EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = str;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56267xzb KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = str;
        return this;
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.BotLeadProfitOverviewModel>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends BotLeadProfitOverviewModel>>> EZpvd() {
        java.lang.String str = null;
        BizApiService bizApiService = (BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null);
        java.lang.String str2 = this.OLrzqt;
        if (str2 == null) {
            Intrinsics.gEmmrt("");
            str2 = null;
        }
        java.lang.String str3 = this.KWHzl;
        if (str3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            str = str3;
        }
        return bizApiService.loadBotTraderProfitSummary(str2, str);
    }
}
