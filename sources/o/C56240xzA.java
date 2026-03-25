package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.BotAddInvestmentData;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xzA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C56240xzA extends xKE<java.lang.Object> {
    public BotAddInvestmentData OLrzqt = new BotAddInvestmentData((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.String) null, 63, (DefaultConstructorMarker) null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull BotAddInvestmentData botAddInvestmentData) {
        Intrinsics.checkNotNullParameter(botAddInvestmentData, "");
        this.OLrzqt = botAddInvestmentData;
    }

    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.lang.Object>> EZpvd() {
        return ((BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null)).botAddInvestment(this.OLrzqt);
    }
}
