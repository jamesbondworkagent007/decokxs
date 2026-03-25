package o;

import com.okinc.business.invest_biz.data.bean.InvestLogoBaseVo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iDj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23627iDj {
    public static final C23625iDh copydefault(@NotNull InvestLogoBaseVo investLogoBaseVo) {
        Intrinsics.checkNotNullParameter(investLogoBaseVo, "");
        java.lang.String tokenLogo = investLogoBaseVo.getTokenLogo();
        return new C23625iDh(tokenLogo == null ? "" : tokenLogo, null, null, 6, null);
    }
}
