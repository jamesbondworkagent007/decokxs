package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Avp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C3961Avp {
    public static final int $stable = 8;
    public java.lang.String AEQbTJ;
    public boolean EZpvd;
    public boolean KWHzl;
    public int OLrzqt;
    public C3877AuI copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C3961Avp copy$default(C3961Avp c3961Avp, C3877AuI c3877AuI, java.lang.String str, int i, boolean z, boolean z2, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            c3877AuI = c3961Avp.copydefault;
        }
        if ((i2 & 2) != 0) {
            str = c3961Avp.AEQbTJ;
        }
        java.lang.String str2 = str;
        if ((i2 & 4) != 0) {
            i = c3961Avp.OLrzqt;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            z = c3961Avp.KWHzl;
        }
        boolean z3 = z;
        if ((i2 & 16) != 0) {
            z2 = c3961Avp.EZpvd;
        }
        return c3961Avp.KWHzl(c3877AuI, str2, i3, z3, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C3877AuI KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C3961Avp KWHzl(@NotNull C3877AuI c3877AuI, @NotNull java.lang.String str, int i, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(c3877AuI, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new C3961Avp(c3877AuI, str, i, z, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3961Avp)) {
            return false;
        }
        C3961Avp c3961Avp = (C3961Avp) obj;
        return Intrinsics.EZpvd(this.copydefault, c3961Avp.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c3961Avp.AEQbTJ) && this.OLrzqt == c3961Avp.OLrzqt && this.KWHzl == c3961Avp.KWHzl && this.EZpvd == c3961Avp.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.copydefault.hashCode() * 31) + this.AEQbTJ.hashCode()) * 31) + java.lang.Integer.hashCode(this.OLrzqt)) * 31) + java.lang.Boolean.hashCode(this.KWHzl)) * 31) + java.lang.Boolean.hashCode(this.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "RecurringBuyPlanOrderListState(content=" + this.copydefault + ", planId=" + this.AEQbTJ + ", nextPage=" + this.OLrzqt + ", canLoadMore=" + this.KWHzl + ", isLoadingNextPage=" + this.EZpvd + ")";
    }

    public C3961Avp(@NotNull C3877AuI c3877AuI, @NotNull java.lang.String str, int i, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(c3877AuI, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = c3877AuI;
        this.AEQbTJ = str;
        this.OLrzqt = i;
        this.KWHzl = z;
        this.EZpvd = z2;
    }
}
