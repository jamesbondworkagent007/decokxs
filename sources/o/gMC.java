package o;

import com.okinc.business.dex.tee.common.ws.data.domain.model.TeeWsToastData;
import com.okinc.business.dex.tee.common.ws.data.domain.model.TeeWsToastType;
import java.math.RoundingMode;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class gMC implements gMJ {
    public final TeeWsToastType AEQbTJ = TeeWsToastType.ExceedBatchOrderAmountMinLimit;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.gMJ
    public TeeWsToastType AEQbTJ() {
        return this.AEQbTJ;
    }

    @Override // o.gMJ
    public gML AEQbTJ(@NotNull gMA gma) {
        Intrinsics.checkNotNullParameter(gma, "");
        final TeeWsToastData teeWsToastDataCopydefault = gma.copydefault();
        if (teeWsToastDataCopydefault.getFailedCount() <= 0 || teeWsToastDataCopydefault.getTpSlTradeMinUSD().length() == 0) {
            return null;
        }
        return new gML(3, null, null, new Function1() { // from class: o.gMB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return gMC.EZpvd(teeWsToastDataCopydefault, (TeeWsToastData) obj);
            }
        }, null, null, null, 118, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gMN EZpvd(TeeWsToastData teeWsToastData, TeeWsToastData teeWsToastData2) {
        Intrinsics.checkNotNullParameter(teeWsToastData2, "");
        return new gMN(teeWsToastData.getFailedCount() == 1 ? C23274hvD.Fragment.ResultReceiverMyRunnable : C23274hvD.Fragment.ActivityViewModelLazyKt, C56424yEw.gEmmrt(C56390yDp.OLrzqt("num", java.lang.String.valueOf(teeWsToastData.getFailedCount())), C56390yDp.OLrzqt("amt", C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, teeWsToastData.getTpSlTradeMinUSD(), false, RoundingMode.DOWN, false, false, false, false, null, false, false, 509, null))));
    }
}
