package o;

import com.okinc.business.dex.tee.common.ws.data.domain.model.TeeWsToastType;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gMz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C19724gMz implements gMJ {
    public final TeeWsToastType AEQbTJ = TeeWsToastType.OrderCanceled;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.gMJ
    public TeeWsToastType AEQbTJ() {
        return this.AEQbTJ;
    }

    @Override // o.gMJ
    public gML AEQbTJ(@NotNull gMA gma) {
        Intrinsics.checkNotNullParameter(gma, "");
        int i = C23274hvD.Fragment.OnBackPressedDispatcher1;
        return new gML(1, java.lang.Integer.valueOf(i), gma.OLrzqt(), null, java.lang.Integer.valueOf(C52761wXj.TaskDescription.ORWKdN), null, null, 104, null);
    }
}
