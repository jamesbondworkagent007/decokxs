package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tlS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C47193tlS {
    public final double AEQbTJ;
    public final double OLrzqt;
    public final C47190tlP copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C47193tlS copy$default(C47193tlS c47193tlS, C47190tlP c47190tlP, double d, double d2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            c47190tlP = c47193tlS.copydefault;
        }
        if ((i & 2) != 0) {
            d = c47193tlS.AEQbTJ;
        }
        double d3 = d;
        if ((i & 4) != 0) {
            d2 = c47193tlS.OLrzqt;
        }
        return c47193tlS.EZpvd(c47190tlP, d3, d2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C47193tlS EZpvd(@NotNull C47190tlP c47190tlP, double d, double d2) {
        Intrinsics.checkNotNullParameter(c47190tlP, "");
        return new C47193tlS(c47190tlP, d, d2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double KWHzl() {
        return this.AEQbTJ * this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C47190tlP copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47193tlS)) {
            return false;
        }
        C47193tlS c47193tlS = (C47193tlS) obj;
        return Intrinsics.EZpvd(this.copydefault, c47193tlS.copydefault) && java.lang.Double.compare(this.AEQbTJ, c47193tlS.AEQbTJ) == 0 && java.lang.Double.compare(this.OLrzqt, c47193tlS.OLrzqt) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.copydefault.hashCode() * 31) + java.lang.Double.hashCode(this.AEQbTJ)) * 31) + java.lang.Double.hashCode(this.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "Candidate(position=" + this.copydefault + ", similarity=" + this.AEQbTJ + ", positionSimilarity=" + this.OLrzqt + ")";
    }

    public C47193tlS(@NotNull C47190tlP c47190tlP, double d, double d2) {
        Intrinsics.checkNotNullParameter(c47190tlP, "");
        this.copydefault = c47190tlP;
        this.AEQbTJ = d;
        this.OLrzqt = d2;
    }
}
