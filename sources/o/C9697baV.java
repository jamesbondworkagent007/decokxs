package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.baV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C9697baV {
    public final boolean AEQbTJ;
    public final java.lang.String KWHzl;
    public final boolean OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C9697baV copy$default(C9697baV c9697baV, boolean z, boolean z2, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = c9697baV.AEQbTJ;
        }
        if ((i & 2) != 0) {
            z2 = c9697baV.OLrzqt;
        }
        if ((i & 4) != 0) {
            str = c9697baV.KWHzl;
        }
        if ((i & 8) != 0) {
            str2 = c9697baV.copydefault;
        }
        return c9697baV.OLrzqt(z, z2, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C9697baV OLrzqt(boolean z, boolean z2, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new C9697baV(z, z2, str, str2);
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
        if (!(obj instanceof C9697baV)) {
            return false;
        }
        C9697baV c9697baV = (C9697baV) obj;
        return this.AEQbTJ == c9697baV.AEQbTJ && this.OLrzqt == c9697baV.OLrzqt && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c9697baV.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c9697baV.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((java.lang.Boolean.hashCode(this.AEQbTJ) * 31) + java.lang.Boolean.hashCode(this.OLrzqt)) * 31) + this.KWHzl.hashCode()) * 31) + this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "CloudBackupResult(result=" + this.AEQbTJ + ", authorized=" + this.OLrzqt + ", errorMessage=" + this.KWHzl + ", originErrorMessage=" + this.copydefault + ")";
    }

    public C9697baV(boolean z, boolean z2, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.AEQbTJ = z;
        this.OLrzqt = z2;
        this.KWHzl = str;
        this.copydefault = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (r2v0 boolean)
  (r3v0 boolean)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
 A[MD:(boolean, boolean, java.lang.String, java.lang.String):void (m)] (LINE:3) call: o.baV.<init>(boolean, boolean, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ C9697baV(boolean z, boolean z2, java.lang.String str, java.lang.String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, z2, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2);
    }
}
