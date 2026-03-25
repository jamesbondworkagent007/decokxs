package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.BotLeadUserOrderHistorySummaryModel;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xze, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C56270xze extends xKE<java.util.List<? extends BotLeadUserOrderHistorySummaryModel>> {
    public java.lang.String EZpvd;
    public java.lang.String KWHzl;
    public java.lang.String OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56270xze AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = str;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56270xze OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = str;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56270xze copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = str;
        return this;
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.BotLeadUserOrderHistorySummaryModel>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends BotLeadUserOrderHistorySummaryModel>>> EZpvd() {
        java.lang.String str = this.KWHzl;
        java.lang.String str2 = null;
        if (str == null) {
            Intrinsics.gEmmrt("");
            str = null;
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            BizApiService bizApiService = (BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null);
            java.lang.String str3 = this.OLrzqt;
            if (str3 == null) {
                Intrinsics.gEmmrt("");
                str3 = null;
            }
            java.lang.String str4 = this.EZpvd;
            if (str4 == null) {
                Intrinsics.gEmmrt("");
                str4 = null;
            }
            java.lang.String str5 = this.KWHzl;
            if (str5 == null) {
                Intrinsics.gEmmrt("");
            } else {
                str2 = str5;
            }
            return bizApiService.loadBotTraderOrderHistorySummary(str3, str4, str2);
        }
        BizApiService bizApiService2 = (BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null);
        java.lang.String str6 = this.OLrzqt;
        if (str6 == null) {
            Intrinsics.gEmmrt("");
            str6 = null;
        }
        java.lang.String str7 = this.EZpvd;
        if (str7 == null) {
            Intrinsics.gEmmrt("");
        } else {
            str2 = str7;
        }
        return bizApiService2.loadBotTraderOrderHistorySefl(str6, str2);
    }
}
