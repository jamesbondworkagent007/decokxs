package o;

import com.okinc.business.dex.tee.common.ws.data.domain.model.TeeWsToastType;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class gMU implements gMJ {
    public final TeeWsToastType EZpvd = TeeWsToastType.UpdateStrategyOrderSuccess;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.gMJ
    public TeeWsToastType AEQbTJ() {
        return this.EZpvd;
    }

    @Override // o.gMJ
    public gML AEQbTJ(@NotNull gMA gma) {
        Intrinsics.checkNotNullParameter(gma, "");
        return new gML(2, java.lang.Integer.valueOf(C23274hvD.Fragment.addCancellableCallbackactivity_release), null, null, null, null, null, 124, null);
    }
}
