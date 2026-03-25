package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Aeq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C3063Aeq {
    public static final int $stable = 8;
    public java.lang.String AEQbTJ;
    public C58384zAj EZpvd;
    public java.lang.String KWHzl;
    public C3065Aes OLrzqt;
    public java.lang.String copydefault;
    public java.lang.String djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C3063Aeq copy$default(C3063Aeq c3063Aeq, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, C3065Aes c3065Aes, C58384zAj c58384zAj, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c3063Aeq.djBIcL;
        }
        if ((i & 2) != 0) {
            str2 = c3063Aeq.copydefault;
        }
        java.lang.String str5 = str2;
        if ((i & 4) != 0) {
            str3 = c3063Aeq.AEQbTJ;
        }
        java.lang.String str6 = str3;
        if ((i & 8) != 0) {
            str4 = c3063Aeq.KWHzl;
        }
        java.lang.String str7 = str4;
        if ((i & 16) != 0) {
            c3065Aes = c3063Aeq.OLrzqt;
        }
        C3065Aes c3065Aes2 = c3065Aes;
        if ((i & 32) != 0) {
            c58384zAj = c3063Aeq.EZpvd;
        }
        return c3063Aeq.KWHzl(str, str5, str6, str7, c3065Aes2, c58384zAj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C58384zAj AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C3063Aeq KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, java.lang.String str4, @NotNull C3065Aes c3065Aes, C58384zAj c58384zAj) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(c3065Aes, "");
        return new C3063Aeq(str, str2, str3, str4, c3065Aes, c58384zAj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C3065Aes OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3063Aeq)) {
            return false;
        }
        C3063Aeq c3063Aeq = (C3063Aeq) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) c3063Aeq.djBIcL) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c3063Aeq.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c3063Aeq.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c3063Aeq.KWHzl) && Intrinsics.EZpvd(this.OLrzqt, c3063Aeq.OLrzqt) && Intrinsics.EZpvd(this.EZpvd, c3063Aeq.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.djBIcL.hashCode();
        int iHashCode2 = this.copydefault.hashCode();
        java.lang.String str = this.AEQbTJ;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.KWHzl;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        int iHashCode5 = this.OLrzqt.hashCode();
        C58384zAj c58384zAj = this.EZpvd;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (c58384zAj != null ? c58384zAj.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ResponseJson(responseType=" + this.djBIcL + ", id=" + this.copydefault + ", rawId=" + this.AEQbTJ + ", authenticatorAttachment=" + this.KWHzl + ", response=" + this.OLrzqt + ", clientExtensionResults=" + this.EZpvd + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String valueOf() {
        return this.djBIcL;
    }

    public C3063Aeq(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, java.lang.String str4, @NotNull C3065Aes c3065Aes, C58384zAj c58384zAj) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(c3065Aes, "");
        this.djBIcL = str;
        this.copydefault = str2;
        this.AEQbTJ = str3;
        this.KWHzl = str4;
        this.OLrzqt = c3065Aes;
        this.EZpvd = c58384zAj;
    }
}
