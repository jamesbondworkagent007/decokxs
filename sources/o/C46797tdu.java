package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tdu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46797tdu<T> {
    public boolean AEQbTJ;
    public final T EZpvd;
    public int KWHzl;
    public final InterfaceC56387yDm<java.lang.Integer> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC56387yDm<java.lang.Integer> EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final T copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(int i) {
        this.KWHzl = i;
    }

    public C46797tdu(T t, @NotNull InterfaceC56387yDm<java.lang.Integer> interfaceC56387yDm, int i, boolean z) {
        Intrinsics.checkNotNullParameter(interfaceC56387yDm, "");
        this.EZpvd = t;
        this.OLrzqt = interfaceC56387yDm;
        this.KWHzl = i;
        this.AEQbTJ = z;
    }
}
