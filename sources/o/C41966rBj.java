package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.rBj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C41966rBj {
    public final java.lang.String AEQbTJ;
    public final boolean KWHzl;
    public final java.lang.String OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C41966rBj copy$default(C41966rBj c41966rBj, boolean z, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = c41966rBj.KWHzl;
        }
        if ((i & 2) != 0) {
            str = c41966rBj.OLrzqt;
        }
        if ((i & 4) != 0) {
            str2 = c41966rBj.AEQbTJ;
        }
        return c41966rBj.EZpvd(z, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C41966rBj EZpvd(boolean z, java.lang.String str, java.lang.String str2) {
        return new C41966rBj(z, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41966rBj)) {
            return false;
        }
        C41966rBj c41966rBj = (C41966rBj) obj;
        return this.KWHzl == c41966rBj.KWHzl && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c41966rBj.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c41966rBj.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = java.lang.Boolean.hashCode(this.KWHzl);
        java.lang.String str = this.OLrzqt;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.AEQbTJ;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "KYCFormFieldValidationResult(ok=" + this.KWHzl + ", feedback=" + this.OLrzqt + ", error=" + this.AEQbTJ + ")";
    }

    public C41966rBj(boolean z, java.lang.String str, java.lang.String str2) {
        this.KWHzl = z;
        this.OLrzqt = str;
        this.AEQbTJ = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r2v0 boolean)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
 A[MD:(boolean, java.lang.String, java.lang.String):void (m)] (LINE:3) call: o.rBj.<init>(boolean, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ C41966rBj(boolean z, java.lang.String str, java.lang.String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }
}
