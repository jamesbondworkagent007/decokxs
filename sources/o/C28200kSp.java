package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kSp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28200kSp {
    public final java.lang.String AEQbTJ;
    public final boolean OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C28200kSp() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C28200kSp copy$default(C28200kSp c28200kSp, boolean z, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = c28200kSp.OLrzqt;
        }
        if ((i & 2) != 0) {
            str = c28200kSp.AEQbTJ;
        }
        return c28200kSp.KWHzl(z, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C28200kSp KWHzl(boolean z, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new C28200kSp(z, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28200kSp)) {
            return false;
        }
        C28200kSp c28200kSp = (C28200kSp) obj;
        return this.OLrzqt == c28200kSp.OLrzqt && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c28200kSp.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (java.lang.Boolean.hashCode(this.OLrzqt) * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "AdvancedKLineInfo(hasMCapData=" + this.OLrzqt + ", circulatingSupply=" + this.AEQbTJ + ")";
    }

    public C28200kSp(boolean z, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = z;
        this.AEQbTJ = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r1v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0005: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
 A[MD:(boolean, java.lang.String):void (m)] (LINE:76) call: o.kSp.<init>(boolean, java.lang.String):void type: THIS */
    public /* synthetic */ C28200kSp(boolean z, java.lang.String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "" : str);
    }
}
