package o;

import com.okinc.business.defi.biz.net.bean.ApproveToken;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class dXZ {
    public final ApproveToken AEQbTJ;
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ dXZ copy$default(dXZ dxz, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, ApproveToken approveToken, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = dxz.KWHzl;
        }
        if ((i & 2) != 0) {
            str2 = dxz.copydefault;
        }
        java.lang.String str5 = str2;
        if ((i & 4) != 0) {
            str3 = dxz.OLrzqt;
        }
        java.lang.String str6 = str3;
        if ((i & 8) != 0) {
            str4 = dxz.EZpvd;
        }
        java.lang.String str7 = str4;
        if ((i & 16) != 0) {
            approveToken = dxz.AEQbTJ;
        }
        return dxz.OLrzqt(str, str5, str6, str7, approveToken);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ApproveToken OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final dXZ OLrzqt(java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull ApproveToken approveToken) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(approveToken, "");
        return new dXZ(str, str2, str3, str4, approveToken);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dXZ)) {
            return false;
        }
        dXZ dxz = (dXZ) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) dxz.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) dxz.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) dxz.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) dxz.EZpvd) && Intrinsics.EZpvd(this.AEQbTJ, dxz.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.String str = this.KWHzl;
        return ((((((((str == null ? 0 : str.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ApproveTokenItem(icon=" + this.KWHzl + ", title=" + this.copydefault + ", approveAmount=" + this.OLrzqt + ", status=" + this.EZpvd + ", tag=" + this.AEQbTJ + ")";
    }

    public dXZ(java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull ApproveToken approveToken) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(approveToken, "");
        this.KWHzl = str;
        this.copydefault = str2;
        this.OLrzqt = str3;
        this.EZpvd = str4;
        this.AEQbTJ = approveToken;
    }
}
