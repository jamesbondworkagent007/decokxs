package o;

import com.okinc.uilab.stateful.StatefulView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tuH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C47655tuH {
    public final boolean AEQbTJ;
    public final java.util.List<java.lang.Object> EZpvd;
    public final java.lang.String KWHzl;
    public final StatefulView.Status OLrzqt;
    public final boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.tuH */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C47655tuH copy$default(C47655tuH c47655tuH, StatefulView.Status status, java.util.List list, boolean z, boolean z2, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            status = c47655tuH.OLrzqt;
        }
        if ((i & 2) != 0) {
            list = c47655tuH.EZpvd;
        }
        java.util.List list2 = list;
        if ((i & 4) != 0) {
            z = c47655tuH.AEQbTJ;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            z2 = c47655tuH.copydefault;
        }
        boolean z4 = z2;
        if ((i & 16) != 0) {
            str = c47655tuH.KWHzl;
        }
        return c47655tuH.copydefault(status, list2, z3, z4, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StatefulView.Status EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.Object> KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C47655tuH copydefault(@NotNull StatefulView.Status status, @NotNull java.util.List<? extends java.lang.Object> list, boolean z, boolean z2, java.lang.String str) {
        Intrinsics.checkNotNullParameter(status, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new C47655tuH(status, list, z, z2, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47655tuH)) {
            return false;
        }
        C47655tuH c47655tuH = (C47655tuH) obj;
        return this.OLrzqt == c47655tuH.OLrzqt && Intrinsics.EZpvd(this.EZpvd, c47655tuH.EZpvd) && this.AEQbTJ == c47655tuH.AEQbTJ && this.copydefault == c47655tuH.copydefault && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c47655tuH.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.OLrzqt.hashCode();
        int iHashCode2 = this.EZpvd.hashCode();
        int iHashCode3 = java.lang.Boolean.hashCode(this.AEQbTJ);
        int iHashCode4 = java.lang.Boolean.hashCode(this.copydefault);
        java.lang.String str = this.KWHzl;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "PlanetListUIState(status=" + this.OLrzqt + ", list=" + this.EZpvd + ", hasMoreData=" + this.AEQbTJ + ", isRefresh=" + this.copydefault + ", errorMessage=" + this.KWHzl + ")";
    }

    public C47655tuH(@NotNull StatefulView.Status status, @NotNull java.util.List<? extends java.lang.Object> list, boolean z, boolean z2, java.lang.String str) {
        Intrinsics.checkNotNullParameter(status, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.OLrzqt = status;
        this.EZpvd = list;
        this.AEQbTJ = z;
        this.copydefault = z2;
        this.KWHzl = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (r7v0 com.okinc.uilab.stateful.StatefulView$Status)
  (r8v0 java.util.List)
  (r9v0 boolean)
  (r10v0 boolean)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
 A[MD:(com.okinc.uilab.stateful.StatefulView$Status, java.util.List<? extends java.lang.Object>, boolean, boolean, java.lang.String):void (m)] (LINE:5) call: o.tuH.<init>(com.okinc.uilab.stateful.StatefulView$Status, java.util.List, boolean, boolean, java.lang.String):void type: THIS */
    public /* synthetic */ C47655tuH(StatefulView.Status status, java.util.List list, boolean z, boolean z2, java.lang.String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(status, list, z, z2, (i & 16) != 0 ? "" : str);
    }
}
