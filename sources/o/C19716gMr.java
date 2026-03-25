package o;

import com.okinc.business.dex.tee.common.ws.data.domain.model.TeeWsToastType;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gMr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C19716gMr implements gMJ {
    public final TeeWsToastType copydefault = TeeWsToastType.ApproveSuccess;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.gMJ
    public TeeWsToastType AEQbTJ() {
        return this.copydefault;
    }

    @Override // o.gMJ
    public gML AEQbTJ(@NotNull gMA gma) {
        Intrinsics.checkNotNullParameter(gma, "");
        int i = C23274hvD.Fragment.createSession;
        return new gML(2, java.lang.Integer.valueOf(i), C56423yEv.EZpvd(C56390yDp.OLrzqt("token", gma.copydefault().getFromTokenSymbol())), null, null, null, null, 120, null);
    }
}
