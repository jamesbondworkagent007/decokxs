package o;

import com.okinc.business.defi.api.bean.passkeywallet.cedefi.OrderStatus;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bbm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9767bbm {
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;
    public final OrderStatus copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C9767bbm copy$default(C9767bbm c9767bbm, java.lang.String str, java.lang.String str2, OrderStatus orderStatus, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c9767bbm.EZpvd;
        }
        if ((i & 2) != 0) {
            str2 = c9767bbm.OLrzqt;
        }
        if ((i & 4) != 0) {
            orderStatus = c9767bbm.copydefault;
        }
        if ((i & 8) != 0) {
            str3 = c9767bbm.KWHzl;
        }
        return c9767bbm.OLrzqt(str, str2, orderStatus, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OrderStatus OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C9767bbm OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, OrderStatus orderStatus, java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new C9767bbm(str, str2, orderStatus, str3);
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
        if (!(obj instanceof C9767bbm)) {
            return false;
        }
        C9767bbm c9767bbm = (C9767bbm) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c9767bbm.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c9767bbm.OLrzqt) && this.copydefault == c9767bbm.copydefault && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c9767bbm.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.EZpvd.hashCode();
        int iHashCode2 = this.OLrzqt.hashCode();
        OrderStatus orderStatus = this.copydefault;
        int iHashCode3 = orderStatus == null ? 0 : orderStatus.hashCode();
        java.lang.String str = this.KWHzl;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str != null ? str.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "TxStatus(orderId=" + this.EZpvd + ", parentOrderId=" + this.OLrzqt + ", status=" + this.copydefault + ", uopHash=" + this.KWHzl + ")";
    }

    public C9767bbm(@NotNull java.lang.String str, @NotNull java.lang.String str2, OrderStatus orderStatus, java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.EZpvd = str;
        this.OLrzqt = str2;
        this.copydefault = orderStatus;
        this.KWHzl = str3;
    }
}
