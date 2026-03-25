package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.AuC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C3871AuC {
    public static final int $stable = 8;
    public java.lang.String AEQbTJ;
    public java.lang.String AYXKKw;
    public java.lang.String AhwBna;
    public boolean EZpvd;
    public boolean KWHzl;
    public C3829AtN OLrzqt;
    public int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C3871AuC copy$default(C3871AuC c3871AuC, C3829AtN c3829AtN, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, boolean z, boolean z2, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            c3829AtN = c3871AuC.OLrzqt;
        }
        if ((i2 & 2) != 0) {
            str = c3871AuC.AEQbTJ;
        }
        java.lang.String str4 = str;
        if ((i2 & 4) != 0) {
            str2 = c3871AuC.AhwBna;
        }
        java.lang.String str5 = str2;
        if ((i2 & 8) != 0) {
            str3 = c3871AuC.AYXKKw;
        }
        java.lang.String str6 = str3;
        if ((i2 & 16) != 0) {
            i = c3871AuC.copydefault;
        }
        int i3 = i;
        if ((i2 & 32) != 0) {
            z = c3871AuC.EZpvd;
        }
        boolean z3 = z;
        if ((i2 & 64) != 0) {
            z2 = c3871AuC.KWHzl;
        }
        return c3871AuC.KWHzl(c3829AtN, str4, str5, str6, i3, z3, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AhwBna() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C3871AuC KWHzl(@NotNull C3829AtN c3829AtN, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(c3829AtN, "");
        return new C3871AuC(c3829AtN, str, str2, str3, i, z, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C3829AtN copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String djBIcL() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3871AuC)) {
            return false;
        }
        C3871AuC c3871AuC = (C3871AuC) obj;
        return Intrinsics.EZpvd(this.OLrzqt, c3871AuC.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c3871AuC.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) c3871AuC.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) c3871AuC.AYXKKw) && this.copydefault == c3871AuC.copydefault && this.EZpvd == c3871AuC.EZpvd && this.KWHzl == c3871AuC.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.OLrzqt.hashCode();
        java.lang.String str = this.AEQbTJ;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.AhwBna;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.AYXKKw;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + java.lang.Integer.hashCode(this.copydefault)) * 31) + java.lang.Boolean.hashCode(this.EZpvd)) * 31) + java.lang.Boolean.hashCode(this.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "RecurringBuyPlanListState(content=" + this.OLrzqt + ", baseCurrency=" + this.AEQbTJ + ", quoteCurrency=" + this.AhwBna + ", status=" + this.AYXKKw + ", nextPage=" + this.copydefault + ", canLoadMore=" + this.EZpvd + ", isLoadingNextPage=" + this.KWHzl + ")";
    }

    public C3871AuC(@NotNull C3829AtN c3829AtN, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(c3829AtN, "");
        this.OLrzqt = c3829AtN;
        this.AEQbTJ = str;
        this.AhwBna = str2;
        this.AYXKKw = str3;
        this.copydefault = i;
        this.EZpvd = z;
        this.KWHzl = z2;
    }
}
