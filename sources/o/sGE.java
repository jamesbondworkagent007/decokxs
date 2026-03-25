package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class sGE {
    public final boolean AEQbTJ;
    public final sGD copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ sGE copy$default(sGE sge, sGD sgd, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            sgd = sge.copydefault;
        }
        if ((i & 2) != 0) {
            z = sge.AEQbTJ;
        }
        return sge.EZpvd(sgd, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final sGE EZpvd(@NotNull sGD sgd, boolean z) {
        Intrinsics.checkNotNullParameter(sgd, "");
        return new sGE(sgd, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final sGD copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sGE)) {
            return false;
        }
        sGE sge = (sGE) obj;
        return Intrinsics.EZpvd(this.copydefault, sge.copydefault) && this.AEQbTJ == sge.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.copydefault.hashCode() * 31) + java.lang.Boolean.hashCode(this.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "UnReadMsgChangeListenerWrapper(listener=" + this.copydefault + ", isP2P=" + this.AEQbTJ + ")";
    }

    public sGE(@NotNull sGD sgd, boolean z) {
        Intrinsics.checkNotNullParameter(sgd, "");
        this.copydefault = sgd;
        this.AEQbTJ = z;
    }
}
