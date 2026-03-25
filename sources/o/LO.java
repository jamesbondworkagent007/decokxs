package o;

import androidx.work.WorkRequest;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class LO {
    public final java.lang.String AEQbTJ;
    public final java.lang.String EZpvd;
    public final long OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ LO copy$default(LO lo, java.lang.String str, java.lang.String str2, java.lang.String str3, long j, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = lo.AEQbTJ;
        }
        if ((i & 2) != 0) {
            str2 = lo.EZpvd;
        }
        java.lang.String str4 = str2;
        if ((i & 4) != 0) {
            str3 = lo.copydefault;
        }
        java.lang.String str5 = str3;
        if ((i & 8) != 0) {
            j = lo.OLrzqt;
        }
        return lo.copydefault(str, str4, str5, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LO copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new LO(str, str2, str3, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LO)) {
            return false;
        }
        LO lo = (LO) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) lo.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) lo.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) lo.copydefault) && this.OLrzqt == lo.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.AEQbTJ.hashCode();
        int iHashCode2 = this.EZpvd.hashCode();
        java.lang.String str = this.copydefault;
        return (((((iHashCode * 31) + iHashCode2) * 31) + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Long.hashCode(this.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "GetFlagsOptions(libraryName=" + this.AEQbTJ + ", libraryVersion=" + this.EZpvd + ", evaluationMode=" + this.copydefault + ", timeoutMillis=" + this.OLrzqt + ')';
    }

    public LO(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.AEQbTJ = str;
        this.EZpvd = str2;
        this.copydefault = str3;
        this.OLrzqt = j;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (r7v0 java.lang.String)
  (r8v0 java.lang.String)
  (wrap:java.lang.String:0x0005: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0006: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:long:0x000a: SGET  A[WRAPPED] androidx.work.WorkRequest.MIN_BACKOFF_MILLIS long) : (r10v0 long))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, long):void (m)] (LINE:19) call: o.LO.<init>(java.lang.String, java.lang.String, java.lang.String, long):void type: THIS */
    public /* synthetic */ LO(java.lang.String str, java.lang.String str2, java.lang.String str3, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? WorkRequest.MIN_BACKOFF_MILLIS : j);
    }
}
