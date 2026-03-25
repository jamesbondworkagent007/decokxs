package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class hLE {
    public final hKZ KWHzl;
    public gLQ OLrzqt;
    public final C22495hgT copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final gLQ copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(gLQ glq) {
        this.OLrzqt = glq;
    }

    public hLE(@NotNull C22495hgT c22495hgT, @NotNull hKZ hkz) {
        Intrinsics.checkNotNullParameter(c22495hgT, "");
        Intrinsics.checkNotNullParameter(hkz, "");
        this.copydefault = c22495hgT;
        this.KWHzl = hkz;
    }
}
