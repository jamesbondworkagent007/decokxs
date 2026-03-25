package o;

import com.amplitude.common.Logger;
import com.amplitude.core.Storage;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class JG implements InterfaceC5243Kf {
    @Override // o.InterfaceC5243Kf
    public Storage KWHzl(@NotNull JZ jz, java.lang.String str) {
        Intrinsics.checkNotNullParameter(jz, "");
        C5244Kg c5244KgDjBIcL = jz.djBIcL();
        Intrinsics.copydefault(c5244KgDjBIcL, "");
        C5216Je c5216Je = (C5216Je) c5244KgDjBIcL;
        android.content.SharedPreferences sharedPreferences = c5216Je.copydefault().getSharedPreferences("amplitude-identify-intercept-" + c5216Je.fetchVPNInfo(), 0);
        java.lang.String strFetchVPNInfo = c5216Je.fetchVPNInfo();
        Logger logger = c5216Je.AuCTel().getLogger(jz);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "");
        return new JM(strFetchVPNInfo, logger, sharedPreferences, JJ.copydefault.copydefault(c5216Je), jz.values());
    }
}
