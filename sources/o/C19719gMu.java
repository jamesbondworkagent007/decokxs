package o;

import com.okinc.business.dex.tee.common.ws.data.domain.model.TeeWsToastData;
import com.okinc.business.dex.tee.common.ws.data.domain.model.TeeWsToastType;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gMu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C19719gMu implements gMJ {
    public final TeeWsToastType OLrzqt = TeeWsToastType.CreateBatchOrderSuccess;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.gMJ
    public TeeWsToastType AEQbTJ() {
        return this.OLrzqt;
    }

    @Override // o.gMJ
    public gML AEQbTJ(@NotNull gMA gma) {
        Intrinsics.checkNotNullParameter(gma, "");
        final TeeWsToastData teeWsToastDataCopydefault = gma.copydefault();
        if (teeWsToastDataCopydefault.getSuccessCount() <= 0) {
            return null;
        }
        return new gML(1, null, null, new Function1() { // from class: o.gMw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19719gMu.KWHzl(teeWsToastDataCopydefault, (TeeWsToastData) obj);
            }
        }, java.lang.Integer.valueOf(C52761wXj.TaskDescription.RXzakW), null, null, 102, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gMN KWHzl(TeeWsToastData teeWsToastData, TeeWsToastData teeWsToastData2) {
        Intrinsics.checkNotNullParameter(teeWsToastData2, "");
        return new gMN(teeWsToastData.getSuccessCount() == 1 ? C23274hvD.Fragment.accessgetOnBackPressedCallbacksp : C23274hvD.Fragment.ResultReceiverMyResultReceiver, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.String.valueOf(teeWsToastData.getSuccessCount()))));
    }
}
