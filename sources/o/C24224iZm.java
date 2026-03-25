package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iZm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C24224iZm {
    public final java.lang.String AEQbTJ;
    public final java.util.List<C24227iZp> EZpvd;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.iZm */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C24224iZm copy$default(C24224iZm c24224iZm, java.lang.String str, java.lang.String str2, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c24224iZm.copydefault;
        }
        if ((i & 2) != 0) {
            str2 = c24224iZm.AEQbTJ;
        }
        if ((i & 4) != 0) {
            list = c24224iZm.EZpvd;
        }
        return c24224iZm.OLrzqt(str, str2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C24227iZp> OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C24224iZm OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.util.List<C24227iZp> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new C24224iZm(str, str2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24224iZm)) {
            return false;
        }
        C24224iZm c24224iZm = (C24224iZm) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c24224iZm.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c24224iZm.AEQbTJ) && Intrinsics.EZpvd(this.EZpvd, c24224iZm.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.copydefault.hashCode() * 31) + this.AEQbTJ.hashCode()) * 31) + this.EZpvd.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "AssetsSection(label=" + this.copydefault + ", rightLabel=" + this.AEQbTJ + ", items=" + this.EZpvd + ")";
    }

    public C24224iZm(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.util.List<C24227iZp> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.copydefault = str;
        this.AEQbTJ = str2;
        this.EZpvd = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (r3v0 java.util.List)
 A[MD:(java.lang.String, java.lang.String, java.util.List<o.iZp>):void (m)] (LINE:64) call: o.iZm.<init>(java.lang.String, java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ C24224iZm(java.lang.String str, java.lang.String str2, java.util.List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "" : str2, list);
    }
}
