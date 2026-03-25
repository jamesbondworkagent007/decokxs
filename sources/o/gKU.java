package o;

import com.okinc.business.dex.api.bean.OrderStatus;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class gKU {
    public final java.lang.String EZpvd;
    public final java.util.List<java.lang.String> KWHzl;
    public final java.util.List<java.lang.Long> OLrzqt;
    public final java.util.List<OrderStatus> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.gKU */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ gKU copy$default(gKU gku, java.lang.String str, java.util.List list, java.util.List list2, java.util.List list3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = gku.EZpvd;
        }
        if ((i & 2) != 0) {
            list = gku.KWHzl;
        }
        if ((i & 4) != 0) {
            list2 = gku.OLrzqt;
        }
        if ((i & 8) != 0) {
            list3 = gku.copydefault;
        }
        return gku.AEQbTJ(str, list, list2, list3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final gKU AEQbTJ(@NotNull java.lang.String str, @NotNull java.util.List<java.lang.String> list, java.util.List<java.lang.Long> list2, java.util.List<? extends OrderStatus> list3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new gKU(str, list, list2, list3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<OrderStatus> EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gKU)) {
            return false;
        }
        gKU gku = (gKU) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) gku.EZpvd) && Intrinsics.EZpvd(this.KWHzl, gku.KWHzl) && Intrinsics.EZpvd(this.OLrzqt, gku.OLrzqt) && Intrinsics.EZpvd(this.copydefault, gku.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.EZpvd.hashCode();
        int iHashCode2 = this.KWHzl.hashCode();
        java.util.List<java.lang.Long> list = this.OLrzqt;
        int iHashCode3 = list == null ? 0 : list.hashCode();
        java.util.List<OrderStatus> list2 = this.copydefault;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (list2 != null ? list2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "StrategyOrderCountRequest(accountId=" + this.EZpvd + ", walletAddressList=" + this.KWHzl + ", chainIdList=" + this.OLrzqt + ", statusList=" + this.copydefault + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: java.util.List<? extends com.okinc.business.dex.api.bean.OrderStatus> */
    /* JADX WARN: Multi-variable type inference failed */
    public gKU(@NotNull java.lang.String str, @NotNull java.util.List<java.lang.String> list, java.util.List<java.lang.Long> list2, java.util.List<? extends OrderStatus> list3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.EZpvd = str;
        this.KWHzl = list;
        this.OLrzqt = list2;
        this.copydefault = list3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r2v0 java.lang.String)
  (r3v0 java.util.List)
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r4v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r5v0 java.util.List))
 A[MD:(java.lang.String, java.util.List<java.lang.String>, java.util.List<java.lang.Long>, java.util.List<? extends com.okinc.business.dex.api.bean.OrderStatus>):void (m)] (LINE:379) call: o.gKU.<init>(java.lang.String, java.util.List, java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ gKU(java.lang.String str, java.util.List list, java.util.List list2, java.util.List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? null : list3);
    }
}
