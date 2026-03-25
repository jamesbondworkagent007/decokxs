package o;

import com.okinc.business.invest_biz.data.bean.response.InvestedToken;
import com.okinc.business.invest_biz.data.bean.response.ProtocolDetailsResponse;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iEq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23661iEq {
    public final C23647iEc AEQbTJ;
    public final iDQ KWHzl;
    public final iDZ copydefault;

    @yCM
    public C23661iEq(@NotNull C23647iEc c23647iEc, @NotNull iDZ idz, @NotNull iDQ idq) {
        Intrinsics.checkNotNullParameter(c23647iEc, "");
        Intrinsics.checkNotNullParameter(idz, "");
        Intrinsics.checkNotNullParameter(idq, "");
        this.AEQbTJ = c23647iEc;
        this.copydefault = idz;
        this.KWHzl = idq;
    }

    public final C23669iEy copydefault(@NotNull ProtocolDetailsResponse protocolDetailsResponse, @NotNull InvestedToken investedToken) {
        Intrinsics.checkNotNullParameter(protocolDetailsResponse, "");
        Intrinsics.checkNotNullParameter(investedToken, "");
        return new C23669iEy(this.AEQbTJ.EZpvd(protocolDetailsResponse, investedToken), this.copydefault.EZpvd(protocolDetailsResponse, investedToken), this.KWHzl.copydefault(protocolDetailsResponse, investedToken));
    }
}
