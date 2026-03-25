package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bnp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC10406bnp {
    public final AbstractC12782ctV EZpvd;

    public abstract long gEmmrt();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AbstractC12782ctV values() {
        return this.EZpvd;
    }

    public AbstractC10406bnp(@NotNull AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        this.EZpvd = abstractC12782ctV;
    }

    public final C10854bwM isConnected() {
        return C10954byG.EZpvd.valueOf().copydefault(gEmmrt());
    }
}
