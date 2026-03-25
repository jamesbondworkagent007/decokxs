package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.keX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28636keX {
    public final java.lang.String AEQbTJ;
    public final java.lang.String AYXKKw;
    public final long AhwBna;
    public final boolean EZpvd;
    public final boolean KWHzl;
    public final boolean OLrzqt;
    public final java.lang.String copydefault;
    public final java.lang.String gEmmrt;
    public final java.lang.String valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long KWHzl() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C28636keX KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, boolean z, boolean z2, boolean z3, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new C28636keX(str, str2, str3, str4, str5, z, z2, z3, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean djBIcL() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28636keX)) {
            return false;
        }
        C28636keX c28636keX = (C28636keX) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) c28636keX.valueOf) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) c28636keX.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c28636keX.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c28636keX.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) c28636keX.gEmmrt) && this.EZpvd == c28636keX.EZpvd && this.KWHzl == c28636keX.KWHzl && this.OLrzqt == c28636keX.OLrzqt && this.AhwBna == c28636keX.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean gEmmrt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((this.valueOf.hashCode() * 31) + this.AYXKKw.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + this.gEmmrt.hashCode()) * 31) + java.lang.Boolean.hashCode(this.EZpvd)) * 31) + java.lang.Boolean.hashCode(this.KWHzl)) * 31) + java.lang.Boolean.hashCode(this.OLrzqt)) * 31) + java.lang.Long.hashCode(this.AhwBna);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "BuySignal(transactionHash=" + this.valueOf + ", walletAddress=" + this.AYXKKw + ", tokenAddress=" + this.copydefault + ", tokenChainId=" + this.AEQbTJ + ", turnover=" + this.gEmmrt + ", signalFromFollowingChannel=" + this.EZpvd + ", isKOL=" + this.KWHzl + ", isSmartMoney=" + this.OLrzqt + ", transactionTime=" + this.AhwBna + ")";
    }

    public C28636keX(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, boolean z, boolean z2, boolean z3, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.valueOf = str;
        this.AYXKKw = str2;
        this.copydefault = str3;
        this.AEQbTJ = str4;
        this.gEmmrt = str5;
        this.EZpvd = z;
        this.KWHzl = z2;
        this.OLrzqt = z3;
        this.AhwBna = j;
    }
}
