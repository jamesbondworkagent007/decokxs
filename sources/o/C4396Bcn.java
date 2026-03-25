package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.network.SignAlgoKind;

/* JADX INFO: renamed from: o.Bcn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C4396Bcn {
    public static final int $stable = 8;
    public SignAlgoKind EZpvd;
    public C2786AZe KWHzl;
    public C4398Bcp copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C4396Bcn copy$default(C4396Bcn c4396Bcn, SignAlgoKind signAlgoKind, C4398Bcp c4398Bcp, C2786AZe c2786AZe, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            signAlgoKind = c4396Bcn.EZpvd;
        }
        if ((i & 2) != 0) {
            c4398Bcp = c4396Bcn.copydefault;
        }
        if ((i & 4) != 0) {
            c2786AZe = c4396Bcn.KWHzl;
        }
        return c4396Bcn.OLrzqt(signAlgoKind, c4398Bcp, c2786AZe);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignAlgoKind EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C2786AZe KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C4396Bcn OLrzqt(@NotNull SignAlgoKind signAlgoKind, C4398Bcp c4398Bcp, C2786AZe c2786AZe) {
        Intrinsics.checkNotNullParameter(signAlgoKind, "");
        return new C4396Bcn(signAlgoKind, c4398Bcp, c2786AZe);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C4398Bcp OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4396Bcn)) {
            return false;
        }
        C4396Bcn c4396Bcn = (C4396Bcn) obj;
        return this.EZpvd == c4396Bcn.EZpvd && Intrinsics.EZpvd(this.copydefault, c4396Bcn.copydefault) && Intrinsics.EZpvd(this.KWHzl, c4396Bcn.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.EZpvd.hashCode();
        C4398Bcp c4398Bcp = this.copydefault;
        int iHashCode2 = c4398Bcp == null ? 0 : c4398Bcp.hashCode();
        C2786AZe c2786AZe = this.KWHzl;
        return (((iHashCode * 31) + iHashCode2) * 31) + (c2786AZe != null ? c2786AZe.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SignConfig(algo=" + this.EZpvd + ", symmetric=" + this.copydefault + ", asymmetric=" + this.KWHzl + ")";
    }

    public C4396Bcn(@NotNull SignAlgoKind signAlgoKind, C4398Bcp c4398Bcp, C2786AZe c2786AZe) {
        Intrinsics.checkNotNullParameter(signAlgoKind, "");
        this.EZpvd = signAlgoKind;
        this.copydefault = c4398Bcp;
        this.KWHzl = c2786AZe;
    }
}
