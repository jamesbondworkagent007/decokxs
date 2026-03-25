package o;

import com.okinc.business.invest_biz.data.bean.response.MarketInvestTokenInfo;
import com.okinc.business.invest_biz.data.bean.response.ProtocolDetailsResponse;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iEd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23648iEd {
    @yCM
    public C23648iEd() {
    }

    public final C23668iEx OLrzqt(@NotNull ProtocolDetailsResponse protocolDetailsResponse, @NotNull MarketInvestTokenInfo marketInvestTokenInfo) {
        Intrinsics.checkNotNullParameter(protocolDetailsResponse, "");
        Intrinsics.checkNotNullParameter(marketInvestTokenInfo, "");
        return new C23668iEx(protocolDetailsResponse.AhwBna(), protocolDetailsResponse.valueOf());
    }
}
