package o;

import com.okinc.business.defi.biz.net.bean.ApproveItem;
import com.okinc.business.defi.biz.net.bean.EIP7702RevokeInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class dXY {
    public final ApproveItem AEQbTJ;
    public final java.lang.Integer EZpvd;
    public final EIP7702RevokeInfo KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ dXY copy$default(dXY dxy, ApproveItem approveItem, java.lang.String str, java.lang.String str2, java.lang.Integer num, EIP7702RevokeInfo eIP7702RevokeInfo, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            approveItem = dxy.AEQbTJ;
        }
        if ((i & 2) != 0) {
            str = dxy.copydefault;
        }
        java.lang.String str3 = str;
        if ((i & 4) != 0) {
            str2 = dxy.OLrzqt;
        }
        java.lang.String str4 = str2;
        if ((i & 8) != 0) {
            num = dxy.EZpvd;
        }
        java.lang.Integer num2 = num;
        if ((i & 16) != 0) {
            eIP7702RevokeInfo = dxy.KWHzl;
        }
        return dxy.AEQbTJ(approveItem, str3, str4, num2, eIP7702RevokeInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final dXY AEQbTJ(@NotNull ApproveItem approveItem, java.lang.String str, @NotNull java.lang.String str2, java.lang.Integer num, @NotNull EIP7702RevokeInfo eIP7702RevokeInfo) {
        Intrinsics.checkNotNullParameter(approveItem, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(eIP7702RevokeInfo, "");
        return new dXY(approveItem, str, str2, num, eIP7702RevokeInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EIP7702RevokeInfo EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ApproveItem copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dXY)) {
            return false;
        }
        dXY dxy = (dXY) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, dxy.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) dxy.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) dxy.OLrzqt) && Intrinsics.EZpvd(this.EZpvd, dxy.EZpvd) && Intrinsics.EZpvd(this.KWHzl, dxy.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.AEQbTJ.hashCode();
        java.lang.String str = this.copydefault;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        int iHashCode3 = this.OLrzqt.hashCode();
        java.lang.Integer num = this.EZpvd;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (num != null ? num.hashCode() : 0)) * 31) + this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "EIP7702RevokeItem(rawApproveItem=" + this.AEQbTJ + ", icon=" + this.copydefault + ", title=" + this.OLrzqt + ", status=" + this.EZpvd + ", tag=" + this.KWHzl + ")";
    }

    public dXY(@NotNull ApproveItem approveItem, java.lang.String str, @NotNull java.lang.String str2, java.lang.Integer num, @NotNull EIP7702RevokeInfo eIP7702RevokeInfo) {
        Intrinsics.checkNotNullParameter(approveItem, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(eIP7702RevokeInfo, "");
        this.AEQbTJ = approveItem;
        this.copydefault = str;
        this.OLrzqt = str2;
        this.EZpvd = num;
        this.KWHzl = eIP7702RevokeInfo;
    }
}
