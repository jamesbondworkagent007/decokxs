package o;

import com.okinc.business.invest_biz.data.bean.response.InvestedToken;
import com.okinc.business.invest_biz.data.bean.response.ProtocolDetailsResponse;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iEc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23647iEc {
    @yCM
    public C23647iEc() {
    }

    public final C23664iEt EZpvd(@NotNull ProtocolDetailsResponse protocolDetailsResponse, @NotNull InvestedToken investedToken) {
        Intrinsics.checkNotNullParameter(protocolDetailsResponse, "");
        Intrinsics.checkNotNullParameter(investedToken, "");
        return new C23664iEt(investedToken.isConnected(), investedToken.hDKMBd(), investedToken.KWHzl(), investedToken.fIwbmz(), investedToken.AkhnZx(), investedToken.fJNWhG(), protocolDetailsResponse.OLrzqt(), investedToken.AuCTelauCTel(), investedToken.zLjUOn(), protocolDetailsResponse.AEQbTJ());
    }
}
