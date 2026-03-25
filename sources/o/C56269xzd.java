package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.BotLeadOverviewModel;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xzd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C56269xzd extends xKE<java.util.List<? extends BotLeadOverviewModel>> {
    public static final int copydefault = 8;
    public java.lang.String EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56269xzd EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = str;
        return this;
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.BotLeadOverviewModel>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends BotLeadOverviewModel>>> EZpvd() {
        java.lang.String str = null;
        BizApiService bizApiService = (BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null);
        java.lang.String str2 = this.EZpvd;
        if (str2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            str = str2;
        }
        return bizApiService.loadBotTraderSummary(str);
    }
}
