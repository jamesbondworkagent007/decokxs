package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.KlineFundingRateData;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xAs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C54230xAs extends xKE<java.util.ArrayList<KlineFundingRateData>> {
    public static final int KWHzl = 8;
    public java.lang.String copydefault = "";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C54230xAs EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = str;
        return this;
    }

    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.ArrayList<KlineFundingRateData>>> EZpvd() {
        return ((BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null)).getFundingRateSmartArbi(this.copydefault);
    }
}
