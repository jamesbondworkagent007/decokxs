package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class pIC {
    public static C38002pIp AEQbTJ;
    public static final pIC EZpvd = new pIC();
    public static final int copydefault = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull C38002pIp c38002pIp) {
        Intrinsics.checkNotNullParameter(c38002pIp, "");
        AEQbTJ = c38002pIp;
    }

    private pIC() {
    }

    public final C38002pIp KWHzl() {
        C38002pIp c38002pIp = AEQbTJ;
        if (c38002pIp != null) {
            return c38002pIp;
        }
        Intrinsics.gEmmrt("");
        return null;
    }
}
