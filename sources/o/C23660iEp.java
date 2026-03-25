package o;

import com.okinc.business.invest_biz.data.bean.response.MarketInvestTokenInfo;
import com.okinc.business.invest_biz.data.bean.response.ProtocolDetailsResponse;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iEp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23660iEp {
    public final iDY AEQbTJ;
    public final C23648iEd EZpvd;
    public final C23652iEh OLrzqt;

    @yCM
    public C23660iEp(@NotNull C23652iEh c23652iEh, @NotNull C23648iEd c23648iEd, @NotNull iDY idy) {
        Intrinsics.checkNotNullParameter(c23652iEh, "");
        Intrinsics.checkNotNullParameter(c23648iEd, "");
        Intrinsics.checkNotNullParameter(idy, "");
        this.OLrzqt = c23652iEh;
        this.EZpvd = c23648iEd;
        this.AEQbTJ = idy;
    }

    public final iEB OLrzqt(@NotNull ProtocolDetailsResponse protocolDetailsResponse, @NotNull MarketInvestTokenInfo marketInvestTokenInfo) {
        Intrinsics.checkNotNullParameter(protocolDetailsResponse, "");
        Intrinsics.checkNotNullParameter(marketInvestTokenInfo, "");
        return new iEB(this.OLrzqt.AEQbTJ(protocolDetailsResponse, marketInvestTokenInfo), this.EZpvd.OLrzqt(protocolDetailsResponse, marketInvestTokenInfo), this.AEQbTJ.EZpvd(protocolDetailsResponse, marketInvestTokenInfo));
    }
}
