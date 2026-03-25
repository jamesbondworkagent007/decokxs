package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Kd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5241Kd {
    public final java.util.List<AbstractC5258Ku> AEQbTJ = new java.util.ArrayList();
    public java.lang.String KWHzl;
    public java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.copydefault;
    }

    public final boolean EZpvd(@NotNull AbstractC5258Ku abstractC5258Ku, @NotNull JZ jz) {
        boolean zAdd;
        Intrinsics.checkNotNullParameter(abstractC5258Ku, "");
        Intrinsics.checkNotNullParameter(jz, "");
        synchronized (this.AEQbTJ) {
            abstractC5258Ku.KWHzl(jz);
            zAdd = this.AEQbTJ.add(abstractC5258Ku);
        }
        return zAdd;
    }

    public final void AEQbTJ(java.lang.String str) {
        this.copydefault = str;
        java.util.Iterator<T> it = this.AEQbTJ.iterator();
        while (it.hasNext()) {
            ((AbstractC5258Ku) it.next()).copydefault(str);
        }
    }

    public final void copydefault(java.lang.String str) {
        this.KWHzl = str;
        java.util.Iterator<T> it = this.AEQbTJ.iterator();
        while (it.hasNext()) {
            ((AbstractC5258Ku) it.next()).EZpvd(str);
        }
    }
}
