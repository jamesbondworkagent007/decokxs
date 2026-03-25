package o;

import com.okinc.business.dex.tee.common.ws.data.domain.model.TeeWsToastData;
import com.okinc.business.dex.tee.common.ws.data.domain.model.TeeWsToastType;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gMt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C19718gMt implements gMJ {
    public final TeeWsToastType KWHzl = TeeWsToastType.CreateBatchOrderFailed;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.gMJ
    public TeeWsToastType AEQbTJ() {
        return this.KWHzl;
    }

    @Override // o.gMJ
    public gML AEQbTJ(@NotNull gMA gma) {
        Intrinsics.checkNotNullParameter(gma, "");
        final TeeWsToastData teeWsToastDataCopydefault = gma.copydefault();
        if (teeWsToastDataCopydefault.getFailedCount() <= 0) {
            return null;
        }
        return new gML(3, null, null, new Function1() { // from class: o.gMv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19718gMt.OLrzqt(teeWsToastDataCopydefault, (TeeWsToastData) obj);
            }
        }, null, null, null, 118, null);
    }

    public static final gMN OLrzqt(TeeWsToastData teeWsToastData, TeeWsToastData teeWsToastData2) {
        Intrinsics.checkNotNullParameter(teeWsToastData2, "");
        return new gMN(teeWsToastData.getFailedCount() == 1 ? C23274hvD.Fragment.addCallback : C23274hvD.Fragment.viewModels, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.String.valueOf(teeWsToastData.getFailedCount()))));
    }
}
