package o;

import com.okinc.okimcore.model.im.group.GroupBillingType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class nTL {
    public final GroupBillingType KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ nTL copy$default(nTL ntl, GroupBillingType groupBillingType, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            groupBillingType = ntl.KWHzl;
        }
        if ((i & 2) != 0) {
            str = ntl.OLrzqt;
        }
        if ((i & 4) != 0) {
            str2 = ntl.copydefault;
        }
        return ntl.AEQbTJ(groupBillingType, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final nTL AEQbTJ(GroupBillingType groupBillingType, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new nTL(groupBillingType, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupBillingType OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nTL)) {
            return false;
        }
        nTL ntl = (nTL) obj;
        return this.KWHzl == ntl.KWHzl && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) ntl.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) ntl.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        GroupBillingType groupBillingType = this.KWHzl;
        return ((((groupBillingType == null ? 0 : groupBillingType.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "PaymentRequiredData(groupBillingType=" + this.KWHzl + ", unit=" + this.OLrzqt + ", price=" + this.copydefault + ")";
    }

    public nTL(GroupBillingType groupBillingType, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.KWHzl = groupBillingType;
        this.OLrzqt = str;
        this.copydefault = str2;
    }
}
