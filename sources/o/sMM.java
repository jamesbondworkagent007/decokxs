package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@yCR
public final class sMM implements sML {
    public final sMN EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.sMN
    public void OLrzqt(int i) {
        this.EZpvd.OLrzqt(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.sMN
    public void copydefault(int i) {
        this.EZpvd.copydefault(i);
    }

    @yCM
    public sMM(@NotNull sMN smn) {
        Intrinsics.checkNotNullParameter(smn, "");
        this.EZpvd = smn;
    }
}
