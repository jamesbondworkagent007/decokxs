package o;

import com.okinc.business.dex.tee.common.ws.data.domain.model.TeeWsToastType;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gMp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C19714gMp implements gMJ {
    public final TeeWsToastType KWHzl = TeeWsToastType.ApproveFailed;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.gMJ
    public TeeWsToastType AEQbTJ() {
        return this.KWHzl;
    }

    @Override // o.gMJ
    public gML AEQbTJ(@NotNull gMA gma) {
        Intrinsics.checkNotNullParameter(gma, "");
        int i = C23274hvD.Fragment.verifyToken;
        return new gML(3, java.lang.Integer.valueOf(i), C56423yEv.EZpvd(C56390yDp.OLrzqt("token", gma.copydefault().getFromTokenSymbol())), null, null, null, null, 120, null);
    }
}
