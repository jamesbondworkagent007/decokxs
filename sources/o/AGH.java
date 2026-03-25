package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class AGH {
    public static final int $stable = 8;
    public boolean AEQbTJ;
    public boolean EZpvd;
    public long KWHzl;
    public java.lang.String OLrzqt;
    public boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AGH copy$default(AGH agh, java.lang.String str, boolean z, boolean z2, boolean z3, long j, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = agh.OLrzqt;
        }
        if ((i & 2) != 0) {
            z = agh.copydefault;
        }
        boolean z4 = z;
        if ((i & 4) != 0) {
            z2 = agh.EZpvd;
        }
        boolean z5 = z2;
        if ((i & 8) != 0) {
            z3 = agh.AEQbTJ;
        }
        boolean z6 = z3;
        if ((i & 16) != 0) {
            j = agh.KWHzl;
        }
        return agh.copydefault(str, z4, z5, z6, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AGH copydefault(@NotNull java.lang.String str, boolean z, boolean z2, boolean z3, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        return new AGH(str, z, z2, z3, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AGH)) {
            return false;
        }
        AGH agh = (AGH) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) agh.OLrzqt) && this.copydefault == agh.copydefault && this.EZpvd == agh.EZpvd && this.AEQbTJ == agh.AEQbTJ && this.KWHzl == agh.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.OLrzqt.hashCode() * 31) + java.lang.Boolean.hashCode(this.copydefault)) * 31) + java.lang.Boolean.hashCode(this.EZpvd)) * 31) + java.lang.Boolean.hashCode(this.AEQbTJ)) * 31) + java.lang.Long.hashCode(this.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SurplusDetail(displayMinUsdValue=" + this.OLrzqt + ", supportLimitSwap=" + this.copydefault + ", supportLimitU=" + this.EZpvd + ", supportTpSl=" + this.AEQbTJ + ", surplusType=" + this.KWHzl + ")";
    }

    public AGH(@NotNull java.lang.String str, boolean z, boolean z2, boolean z3, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = str;
        this.copydefault = z;
        this.EZpvd = z2;
        this.AEQbTJ = z3;
        this.KWHzl = j;
    }
}
