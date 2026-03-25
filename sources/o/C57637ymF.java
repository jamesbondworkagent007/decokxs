package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ymF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57637ymF {
    public final java.lang.String AEQbTJ;
    public final int EZpvd;
    public final float copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C57637ymF copy$default(C57637ymF c57637ymF, java.lang.String str, int i, float f, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = c57637ymF.AEQbTJ;
        }
        if ((i2 & 2) != 0) {
            i = c57637ymF.EZpvd;
        }
        if ((i2 & 4) != 0) {
            f = c57637ymF.copydefault;
        }
        return c57637ymF.copydefault(str, i, f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C57637ymF copydefault(@NotNull java.lang.String str, int i, float f) {
        Intrinsics.checkNotNullParameter(str, "");
        return new C57637ymF(str, i, f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C57637ymF)) {
            return false;
        }
        C57637ymF c57637ymF = (C57637ymF) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c57637ymF.AEQbTJ) && this.EZpvd == c57637ymF.EZpvd && java.lang.Float.compare(this.copydefault, c57637ymF.copydefault) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.AEQbTJ.hashCode() * 31) + java.lang.Integer.hashCode(this.EZpvd)) * 31) + java.lang.Float.hashCode(this.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "RecyclerViewEmpty(text=" + this.AEQbTJ + ", marginTop=" + this.EZpvd + ", padding=" + this.copydefault + ")";
    }

    public C57637ymF(@NotNull java.lang.String str, int i, float f) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = str;
        this.EZpvd = i;
        this.copydefault = f;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r2v0 int))
  (wrap:float:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (-1.0f float) : (r3v0 float))
 A[MD:(java.lang.String, int, float):void (m)] (LINE:50) call: o.ymF.<init>(java.lang.String, int, float):void type: THIS */
    public /* synthetic */ C57637ymF(java.lang.String str, int i, float f, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? -1.0f : f);
    }
}
