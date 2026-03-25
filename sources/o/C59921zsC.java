package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zsC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C59921zsC {
    public final java.math.BigInteger KWHzl;
    public final java.math.BigInteger OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C59921zsC copy$default(C59921zsC c59921zsC, java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            bigInteger = c59921zsC.KWHzl;
        }
        if ((i & 2) != 0) {
            bigInteger2 = c59921zsC.OLrzqt;
        }
        return c59921zsC.KWHzl(bigInteger, bigInteger2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.math.BigInteger AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.math.BigInteger EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C59921zsC KWHzl(@NotNull java.math.BigInteger bigInteger, @NotNull java.math.BigInteger bigInteger2) {
        Intrinsics.checkNotNullParameter(bigInteger, "");
        Intrinsics.checkNotNullParameter(bigInteger2, "");
        return new C59921zsC(bigInteger, bigInteger2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C59921zsC)) {
            return false;
        }
        C59921zsC c59921zsC = (C59921zsC) obj;
        return Intrinsics.EZpvd(this.KWHzl, c59921zsC.KWHzl) && Intrinsics.EZpvd(this.OLrzqt, c59921zsC.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.KWHzl.hashCode() * 31) + this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ECDSASignature(r=" + this.KWHzl + ", s=" + this.OLrzqt + ')';
    }

    public C59921zsC(@NotNull java.math.BigInteger bigInteger, @NotNull java.math.BigInteger bigInteger2) {
        Intrinsics.checkNotNullParameter(bigInteger, "");
        Intrinsics.checkNotNullParameter(bigInteger2, "");
        this.KWHzl = bigInteger;
        this.OLrzqt = bigInteger2;
    }
}
