package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ySt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56799ySt implements InterfaceC56800ySu {
    public yZP copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull yZP yzp) {
        Intrinsics.checkNotNullParameter(yzp, "");
        this.copydefault = yzp;
    }

    @Override // o.InterfaceC56800ySu
    public InterfaceC56658yNn KWHzl(@NotNull yTT ytt) {
        Intrinsics.checkNotNullParameter(ytt, "");
        return OLrzqt().copydefault(ytt);
    }

    public final yZP OLrzqt() {
        yZP yzp = this.copydefault;
        if (yzp != null) {
            return yzp;
        }
        Intrinsics.gEmmrt("");
        return null;
    }
}
