package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wrr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C53777wrr {
    public final java.lang.String AEQbTJ;
    public final boolean KWHzl;
    public final java.lang.String OLrzqt;
    public final uJQ copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C53777wrr copy$default(C53777wrr c53777wrr, java.lang.String str, uJQ ujq, java.lang.String str2, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c53777wrr.AEQbTJ;
        }
        if ((i & 2) != 0) {
            ujq = c53777wrr.copydefault;
        }
        if ((i & 4) != 0) {
            str2 = c53777wrr.OLrzqt;
        }
        if ((i & 8) != 0) {
            z = c53777wrr.KWHzl;
        }
        return c53777wrr.AEQbTJ(str, ujq, str2, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C53777wrr AEQbTJ(@NotNull java.lang.String str, @NotNull uJQ ujq, java.lang.String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(ujq, "");
        return new C53777wrr(str, ujq, str2, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final uJQ KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C53777wrr)) {
            return false;
        }
        C53777wrr c53777wrr = (C53777wrr) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c53777wrr.AEQbTJ) && Intrinsics.EZpvd(this.copydefault, c53777wrr.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c53777wrr.OLrzqt) && this.KWHzl == c53777wrr.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.AEQbTJ.hashCode();
        int iHashCode2 = this.copydefault.hashCode();
        java.lang.String str = this.OLrzqt;
        return (((((iHashCode * 31) + iHashCode2) * 31) + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Boolean.hashCode(this.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "BotShareRow(title=" + this.AEQbTJ + ", text=" + this.copydefault + ", icon=" + this.OLrzqt + ", isVisibleForStandardShare=" + this.KWHzl + ")";
    }

    public C53777wrr(@NotNull java.lang.String str, @NotNull uJQ ujq, java.lang.String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(ujq, "");
        this.AEQbTJ = str;
        this.copydefault = ujq;
        this.OLrzqt = str2;
        this.KWHzl = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 o.uJQ)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0005: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? true : (r4v0 boolean))
 A[MD:(java.lang.String, o.uJQ, java.lang.String, boolean):void (m)] (LINE:11) call: o.wrr.<init>(java.lang.String, o.uJQ, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ C53777wrr(java.lang.String str, uJQ ujq, java.lang.String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, ujq, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? true : z);
    }
}
