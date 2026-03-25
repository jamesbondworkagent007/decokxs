package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xWY {
    public final java.util.List<java.lang.String> AEQbTJ;
    public final java.lang.String EZpvd;
    public final long OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.xWY */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ xWY copy$default(xWY xwy, long j, java.lang.String str, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = xwy.OLrzqt;
        }
        if ((i & 2) != 0) {
            str = xwy.EZpvd;
        }
        if ((i & 4) != 0) {
            list = xwy.AEQbTJ;
        }
        return xwy.OLrzqt(j, str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final xWY OLrzqt(long j, @NotNull java.lang.String str, @NotNull java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new xWY(j, str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xWY)) {
            return false;
        }
        xWY xwy = (xWY) obj;
        return this.OLrzqt == xwy.OLrzqt && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) xwy.EZpvd) && Intrinsics.EZpvd(this.AEQbTJ, xwy.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((java.lang.Long.hashCode(this.OLrzqt) * 31) + this.EZpvd.hashCode()) * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SegAddressBean(chainId=" + this.OLrzqt + ", selectAddress=" + this.EZpvd + ", segAddressList=" + this.AEQbTJ + ")";
    }

    public xWY(long j, @NotNull java.lang.String str, @NotNull java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.OLrzqt = j;
        this.EZpvd = str;
        this.AEQbTJ = list;
    }
}
