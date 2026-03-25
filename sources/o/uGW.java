package o;

import com.okinc.tradingbot.impl.aiBot.domain.model.Indicator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class uGW {
    public static final java.lang.String KWHzl(@NotNull Indicator indicator) {
        Intrinsics.checkNotNullParameter(indicator, "");
        java.lang.String strCopydefault = indicator.copydefault();
        if (strCopydefault != null) {
            if (strCopydefault.length() <= 0) {
                strCopydefault = null;
            }
            if (strCopydefault != null) {
                java.lang.String str = indicator.djBIcL() + "(" + strCopydefault + ")";
                if (str != null) {
                    return str;
                }
            }
        }
        return indicator.djBIcL();
    }
}
