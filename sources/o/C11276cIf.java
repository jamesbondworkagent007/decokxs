package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cIf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C11276cIf {
    public final java.lang.String AEQbTJ;
    public final long EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;
    public final long copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C11276cIf copy$default(C11276cIf c11276cIf, java.lang.String str, java.lang.String str2, java.lang.String str3, long j, long j2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c11276cIf.AEQbTJ;
        }
        if ((i & 2) != 0) {
            str2 = c11276cIf.KWHzl;
        }
        java.lang.String str4 = str2;
        if ((i & 4) != 0) {
            str3 = c11276cIf.OLrzqt;
        }
        java.lang.String str5 = str3;
        if ((i & 8) != 0) {
            j = c11276cIf.copydefault;
        }
        long j3 = j;
        if ((i & 16) != 0) {
            j2 = c11276cIf.EZpvd;
        }
        return c11276cIf.KWHzl(str, str4, str5, j3, j2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C11276cIf KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, long j, long j2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new C11276cIf(str, str2, str3, j, j2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
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
        if (!(obj instanceof C11276cIf)) {
            return false;
        }
        C11276cIf c11276cIf = (C11276cIf) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c11276cIf.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c11276cIf.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c11276cIf.OLrzqt) && this.copydefault == c11276cIf.copydefault && this.EZpvd == c11276cIf.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.AEQbTJ.hashCode() * 31) + this.KWHzl.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + java.lang.Long.hashCode(this.copydefault)) * 31) + java.lang.Long.hashCode(this.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ReferralInfoEntity(walletType=" + this.AEQbTJ + ", walletAddress=" + this.KWHzl + ", encryptedReferralInfo=" + this.OLrzqt + ", createdTime=" + this.copydefault + ", updatedTime=" + this.EZpvd + ")";
    }

    public C11276cIf(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, long j, long j2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.AEQbTJ = str;
        this.KWHzl = str2;
        this.OLrzqt = str3;
        this.copydefault = j;
        this.EZpvd = j2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001b: CONSTRUCTOR 
  (r11v0 java.lang.String)
  (r12v0 java.lang.String)
  (r13v0 java.lang.String)
  (wrap:long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r18v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0008: INVOKE  STATIC call: java.lang.System.currentTimeMillis():long A[MD:():long (c), WRAPPED] (LINE:14)) : (r14v0 long))
  (wrap:long:?: TERNARY null = ((wrap:int:0x000b: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0013: INVOKE  STATIC call: java.lang.System.currentTimeMillis():long A[MD:():long (c), WRAPPED] (LINE:15)) : (r16v0 long))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, long, long):void (m)] (LINE:10) call: o.cIf.<init>(java.lang.String, java.lang.String, java.lang.String, long, long):void type: THIS */
    public /* synthetic */ C11276cIf(java.lang.String str, java.lang.String str2, java.lang.String str3, long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? java.lang.System.currentTimeMillis() : j, (i & 16) != 0 ? java.lang.System.currentTimeMillis() : j2);
    }
}
