package o;

import com.okinc.kline.ui.unlock.ui.model.UnlockTokenStageDataVo;
import com.okinc.localization.util.currency.Notation;
import java.math.RoundingMode;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import o.C35964oKf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pxV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C39710pxV {
    public static final java.lang.String AEQbTJ(@NotNull UnlockTokenStageDataVo unlockTokenStageDataVo) {
        Intrinsics.checkNotNullParameter(unlockTokenStageDataVo, "");
        return pTA.formatStandardDate$default(new Date(C33129mqd.valueOf(unlockTokenStageDataVo.copydefault())), null, 1, null);
    }

    public static final java.lang.String KWHzl(@NotNull UnlockTokenStageDataVo unlockTokenStageDataVo) {
        Intrinsics.checkNotNullParameter(unlockTokenStageDataVo, "");
        return pTB.formatICUCompact$default(java.lang.Long.valueOf(C33129mqd.valueOf(unlockTokenStageDataVo.KWHzl())), RoundingMode.HALF_UP, null, null, null, 14, null) + " " + unlockTokenStageDataVo.OLrzqt();
    }

    public static final java.lang.String copydefault(@NotNull UnlockTokenStageDataVo unlockTokenStageDataVo) {
        Intrinsics.checkNotNullParameter(unlockTokenStageDataVo, "");
        return C33069mpW.KWHzl(C43246rlf.OLrzqt.valueOf(), C35964oKf.Fragment.hQufeQ, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("percent", pTB.formatICUPercent$default(java.lang.Double.valueOf(C33129mqd.AEQbTJ(unlockTokenStageDataVo.EZpvd()) * 100.0d), RoundingMode.HALF_UP, null, null, null, null, 30, null))));
    }

    public static final java.lang.String OLrzqt(@NotNull UnlockTokenStageDataVo unlockTokenStageDataVo) {
        Intrinsics.checkNotNullParameter(unlockTokenStageDataVo, "");
        return C38305pTw.formatFiatSymbol$default(java.lang.Double.valueOf(C33129mqd.AEQbTJ(unlockTokenStageDataVo.valueOf())), "USD", null, null, null, Notation.COMPACT_SHORT, null, 46, null);
    }

    public static final java.lang.String EZpvd(@NotNull UnlockTokenStageDataVo unlockTokenStageDataVo) {
        Intrinsics.checkNotNullParameter(unlockTokenStageDataVo, "");
        return C33069mpW.KWHzl(C43246rlf.OLrzqt.valueOf(), C35964oKf.Fragment.hBUiXU, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("percent", pTB.formatICUPercent$default(java.lang.Double.valueOf(C33129mqd.AEQbTJ(unlockTokenStageDataVo.djBIcL()) * 100.0d), RoundingMode.HALF_UP, null, null, null, null, 30, null))));
    }
}
