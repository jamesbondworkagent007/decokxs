package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.manager.CoinLoanCheckBoxBean;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xxe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C56164xxe extends xKE<java.util.ArrayList<CoinLoanCheckBoxBean>> {
    public java.lang.String AEQbTJ = "";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56164xxe AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = str;
        return this;
    }

    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.ArrayList<CoinLoanCheckBoxBean>>> EZpvd() {
        return ((BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null)).getCoinLoanCheckBox(this.AEQbTJ);
    }
}
