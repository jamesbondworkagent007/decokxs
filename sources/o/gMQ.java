package o;

import com.okinc.business.dex.tee.common.ws.data.domain.model.TeeWsToastType;
import com.okinc.business.dexlogic.track.DexTrackEventParameter;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class gMQ implements gMJ {
    public final TeeWsToastType OLrzqt = TeeWsToastType.TradeFailedWithRetry;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.gMJ
    public TeeWsToastType AEQbTJ() {
        return this.OLrzqt;
    }

    @Override // o.gMJ
    public gML AEQbTJ(@NotNull gMA gma) {
        Intrinsics.checkNotNullParameter(gma, "");
        int i = C23274hvD.Fragment.MediaSessionCompatToken1;
        return new gML(1, java.lang.Integer.valueOf(i), gma.OLrzqt(), null, java.lang.Integer.valueOf(C52761wXj.TaskDescription.ORWKdN), null, new Function0() { // from class: o.gMS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return gMQ.EZpvd();
            }
        }, 40, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EZpvd() {
        C23243huZ.OLrzqt(DexTrackEventParameter.TxStatus.FAILURE.getStatus());
        return Unit.INSTANCE;
    }
}
