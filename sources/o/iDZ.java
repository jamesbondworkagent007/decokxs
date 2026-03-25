package o;

import com.okinc.business.invest_biz.data.bean.response.InvestedToken;
import com.okinc.business.invest_biz.data.bean.response.ProtocolDetailsResponse;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class iDZ {
    @yCM
    public iDZ() {
    }

    public final iEA EZpvd(@NotNull ProtocolDetailsResponse protocolDetailsResponse, @NotNull InvestedToken investedToken) {
        Intrinsics.checkNotNullParameter(protocolDetailsResponse, "");
        Intrinsics.checkNotNullParameter(investedToken, "");
        return new iEA(protocolDetailsResponse.AhwBna(), protocolDetailsResponse.valueOf(), investedToken.DbNXlk(), investedToken.gEmmrt(), investedToken.djBIcL(), investedToken.fetchVPNInfo(), investedToken.getFieldNames(), investedToken.iwGUEr(), investedToken.copydefault(), investedToken.AYXKKw(), null, investedToken.fARcdN(), 1024, null);
    }
}
