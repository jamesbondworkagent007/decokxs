package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jvj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C27467jvj implements InterfaceC27436jvE {
    public final java.lang.String EZpvd;
    public final int KWHzl;
    public final java.lang.String OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C27467jvj() {
        this(null, null, 0, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C27467jvj copy$default(C27467jvj c27467jvj, java.lang.String str, java.lang.String str2, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = c27467jvj.EZpvd;
        }
        if ((i2 & 2) != 0) {
            str2 = c27467jvj.OLrzqt;
        }
        if ((i2 & 4) != 0) {
            i = c27467jvj.KWHzl;
        }
        return c27467jvj.OLrzqt(str, str2, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C27467jvj OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @androidx.annotation.ColorRes int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new C27467jvj(str, str2, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27467jvj)) {
            return false;
        }
        C27467jvj c27467jvj = (C27467jvj) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c27467jvj.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c27467jvj.OLrzqt) && this.KWHzl == c27467jvj.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.EZpvd.hashCode() * 31) + this.OLrzqt.hashCode()) * 31) + java.lang.Integer.hashCode(this.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "UiBonusRulesTitle(calculationMethod=" + this.EZpvd + ", title=" + this.OLrzqt + ", textColor=" + this.KWHzl + ")";
    }

    public C27467jvj(@NotNull java.lang.String str, @NotNull java.lang.String str2, @androidx.annotation.ColorRes int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.EZpvd = str;
        this.OLrzqt = str2;
        this.KWHzl = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0012: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0010: SGET  A[WRAPPED] o.wXj.Activity.DCUTEIddSDPG int) : (r4v0 int))
 A[MD:(java.lang.String, java.lang.String, int):void (m)] (LINE:25) call: o.jvj.<init>(java.lang.String, java.lang.String, int):void type: THIS */
    public /* synthetic */ C27467jvj(java.lang.String str, java.lang.String str2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? C52761wXj.Activity.DCUTEIddSDPG : i);
    }
}
