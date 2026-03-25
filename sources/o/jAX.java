package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class jAX {
    public final boolean AEQbTJ;
    public final boolean EZpvd;
    public final C25644jBa KWHzl;
    public final java.util.List<jAZ> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.jAX */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ jAX copy$default(jAX jax, C25644jBa c25644jBa, boolean z, java.util.List list, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            c25644jBa = jax.KWHzl;
        }
        if ((i & 2) != 0) {
            z = jax.EZpvd;
        }
        if ((i & 4) != 0) {
            list = jax.copydefault;
        }
        if ((i & 8) != 0) {
            z2 = jax.AEQbTJ;
        }
        return jax.EZpvd(c25644jBa, z, list, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final jAX EZpvd(@NotNull C25644jBa c25644jBa, boolean z, @NotNull java.util.List<jAZ> list, boolean z2) {
        Intrinsics.checkNotNullParameter(c25644jBa, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new jAX(c25644jBa, z, list, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jAX)) {
            return false;
        }
        jAX jax = (jAX) obj;
        return Intrinsics.EZpvd(this.KWHzl, jax.KWHzl) && this.EZpvd == jax.EZpvd && Intrinsics.EZpvd(this.copydefault, jax.copydefault) && this.AEQbTJ == jax.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.KWHzl.hashCode() * 31) + java.lang.Boolean.hashCode(this.EZpvd)) * 31) + this.copydefault.hashCode()) * 31) + java.lang.Boolean.hashCode(this.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "TrackingAddressList(pageId=" + this.KWHzl + ", shouldShowDisclaimer=" + this.EZpvd + ", addresses=" + this.copydefault + ", hasNext=" + this.AEQbTJ + ")";
    }

    public jAX(@NotNull C25644jBa c25644jBa, boolean z, @NotNull java.util.List<jAZ> list, boolean z2) {
        Intrinsics.checkNotNullParameter(c25644jBa, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.KWHzl = c25644jBa;
        this.EZpvd = z;
        this.copydefault = list;
        this.AEQbTJ = z2;
    }
}
