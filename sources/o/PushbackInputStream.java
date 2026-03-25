package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class PushbackInputStream {
    public final java.lang.Boolean AEQbTJ;
    public final java.lang.String EZpvd;
    public final java.lang.Boolean KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PushbackInputStream() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PushbackInputStream copy$default(PushbackInputStream pushbackInputStream, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Boolean bool, java.lang.Boolean bool2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = pushbackInputStream.copydefault;
        }
        if ((i & 2) != 0) {
            str2 = pushbackInputStream.OLrzqt;
        }
        java.lang.String str4 = str2;
        if ((i & 4) != 0) {
            str3 = pushbackInputStream.EZpvd;
        }
        java.lang.String str5 = str3;
        if ((i & 8) != 0) {
            bool = pushbackInputStream.AEQbTJ;
        }
        java.lang.Boolean bool3 = bool;
        if ((i & 16) != 0) {
            bool2 = pushbackInputStream.KWHzl;
        }
        return pushbackInputStream.copydefault(str, str4, str5, bool3, bool2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Boolean OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Boolean copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PushbackInputStream copydefault(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Boolean bool, java.lang.Boolean bool2) {
        return new PushbackInputStream(str, str2, str3, bool, bool2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PushbackInputStream)) {
            return false;
        }
        PushbackInputStream pushbackInputStream = (PushbackInputStream) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) pushbackInputStream.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) pushbackInputStream.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) pushbackInputStream.EZpvd) && Intrinsics.EZpvd(this.AEQbTJ, pushbackInputStream.AEQbTJ) && Intrinsics.EZpvd(this.KWHzl, pushbackInputStream.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.String str = this.copydefault;
        int iHashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.OLrzqt;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.EZpvd;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        java.lang.Boolean bool = this.AEQbTJ;
        int iHashCode4 = bool == null ? 0 : bool.hashCode();
        java.lang.Boolean bool2 = this.KWHzl;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (bool2 != null ? bool2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "PartitionConfig(name=" + this.copydefault + ", dnsSuffix=" + this.OLrzqt + ", dualStackDnsSuffix=" + this.EZpvd + ", supportsFIPS=" + this.AEQbTJ + ", supportsDualStack=" + this.KWHzl + ')';
    }

    public PushbackInputStream(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Boolean bool, java.lang.Boolean bool2) {
        this.copydefault = str;
        this.OLrzqt = str2;
        this.EZpvd = str3;
        this.AEQbTJ = bool;
        this.KWHzl = bool2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r8v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r9v0 java.lang.Boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean):void (m)] (LINE:64) call: o.PushbackInputStream.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean):void type: THIS */
    public /* synthetic */ PushbackInputStream(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Boolean bool, java.lang.Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : bool2);
    }

    public final PushbackInputStream copydefault(@NotNull PushbackInputStream pushbackInputStream) {
        Intrinsics.checkNotNullParameter(pushbackInputStream, "");
        java.lang.String str = pushbackInputStream.copydefault;
        if (str == null) {
            str = this.copydefault;
        }
        java.lang.String str2 = str;
        java.lang.String str3 = pushbackInputStream.OLrzqt;
        if (str3 == null) {
            str3 = this.OLrzqt;
        }
        java.lang.String str4 = str3;
        java.lang.String str5 = pushbackInputStream.EZpvd;
        if (str5 == null) {
            str5 = this.EZpvd;
        }
        java.lang.String str6 = str5;
        java.lang.Boolean bool = pushbackInputStream.AEQbTJ;
        if (bool == null) {
            bool = this.AEQbTJ;
        }
        java.lang.Boolean bool2 = bool;
        java.lang.Boolean bool3 = pushbackInputStream.KWHzl;
        if (bool3 == null) {
            bool3 = this.KWHzl;
        }
        return new PushbackInputStream(str2, str4, str6, bool2, bool3);
    }
}
