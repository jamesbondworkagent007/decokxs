package o;

import com.okinc.uilab.stateful.StatefulView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.txy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C47857txy {
    public final java.util.List<java.lang.Object> AEQbTJ;
    public final boolean EZpvd;
    public final java.lang.String KWHzl;
    public final StatefulView.Status OLrzqt;
    public final int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.txy */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C47857txy copy$default(C47857txy c47857txy, StatefulView.Status status, java.util.List list, java.lang.String str, boolean z, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            status = c47857txy.OLrzqt;
        }
        if ((i2 & 2) != 0) {
            list = c47857txy.AEQbTJ;
        }
        java.util.List list2 = list;
        if ((i2 & 4) != 0) {
            str = c47857txy.KWHzl;
        }
        java.lang.String str2 = str;
        if ((i2 & 8) != 0) {
            z = c47857txy.EZpvd;
        }
        boolean z2 = z;
        if ((i2 & 16) != 0) {
            i = c47857txy.copydefault;
        }
        return c47857txy.KWHzl(status, list2, str2, z2, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StatefulView.Status AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AhwBna() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C47857txy KWHzl(@NotNull StatefulView.Status status, @NotNull java.util.List<? extends java.lang.Object> list, java.lang.String str, boolean z, int i) {
        Intrinsics.checkNotNullParameter(status, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new C47857txy(status, list, str, z, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.Object> OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47857txy)) {
            return false;
        }
        C47857txy c47857txy = (C47857txy) obj;
        return this.OLrzqt == c47857txy.OLrzqt && Intrinsics.EZpvd(this.AEQbTJ, c47857txy.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c47857txy.KWHzl) && this.EZpvd == c47857txy.EZpvd && this.copydefault == c47857txy.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.OLrzqt.hashCode();
        int iHashCode2 = this.AEQbTJ.hashCode();
        java.lang.String str = this.KWHzl;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Boolean.hashCode(this.EZpvd)) * 31) + java.lang.Integer.hashCode(this.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "EarningsListUIState(status=" + this.OLrzqt + ", list=" + this.AEQbTJ + ", nextCursor=" + this.KWHzl + ", isRefresh=" + this.EZpvd + ", errorCode=" + this.copydefault + ")";
    }

    public C47857txy(@NotNull StatefulView.Status status, @NotNull java.util.List<? extends java.lang.Object> list, java.lang.String str, boolean z, int i) {
        Intrinsics.checkNotNullParameter(status, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.OLrzqt = status;
        this.AEQbTJ = list;
        this.KWHzl = str;
        this.EZpvd = z;
        this.copydefault = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r7v0 com.okinc.uilab.stateful.StatefulView$Status)
  (r8v0 java.util.List)
  (r9v0 java.lang.String)
  (r10v0 boolean)
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r11v0 int))
 A[MD:(com.okinc.uilab.stateful.StatefulView$Status, java.util.List<? extends java.lang.Object>, java.lang.String, boolean, int):void (m)] (LINE:359) call: o.txy.<init>(com.okinc.uilab.stateful.StatefulView$Status, java.util.List, java.lang.String, boolean, int):void type: THIS */
    public /* synthetic */ C47857txy(StatefulView.Status status, java.util.List list, java.lang.String str, boolean z, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(status, list, str, z, (i2 & 16) != 0 ? 0 : i);
    }

    public final boolean EZpvd() {
        java.lang.String str = this.KWHzl;
        return !(str == null || str.length() == 0);
    }
}
