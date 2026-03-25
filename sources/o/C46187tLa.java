package o;

import com.okinc.rxutils.RxBus;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tLa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C46187tLa implements RxBus.Application {
    public final java.lang.String AEQbTJ;
    public final java.lang.String EZpvd;
    public final boolean KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C46187tLa copy$default(C46187tLa c46187tLa, boolean z, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = c46187tLa.KWHzl;
        }
        if ((i & 2) != 0) {
            str = c46187tLa.AEQbTJ;
        }
        java.lang.String str5 = str;
        if ((i & 4) != 0) {
            str2 = c46187tLa.copydefault;
        }
        java.lang.String str6 = str2;
        if ((i & 8) != 0) {
            str3 = c46187tLa.OLrzqt;
        }
        java.lang.String str7 = str3;
        if ((i & 16) != 0) {
            str4 = c46187tLa.EZpvd;
        }
        return c46187tLa.EZpvd(z, str5, str6, str7, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C46187tLa EZpvd(boolean z, @NotNull java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        return new C46187tLa(z, str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.KWHzl;
    }

    @Override // com.okinc.rxutils.RxBus.Application
    public boolean check(java.lang.String str) {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C46187tLa)) {
            return false;
        }
        C46187tLa c46187tLa = (C46187tLa) obj;
        return this.KWHzl == c46187tLa.KWHzl && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c46187tLa.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c46187tLa.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c46187tLa.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c46187tLa.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = java.lang.Boolean.hashCode(this.KWHzl);
        int iHashCode2 = this.AEQbTJ.hashCode();
        java.lang.String str = this.copydefault;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.OLrzqt;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.EZpvd;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "UserFollowEvent(isFollowing=" + this.KWHzl + ", authorId=" + this.AEQbTJ + ", nickName=" + this.copydefault + ", portrait=" + this.OLrzqt + ", source=" + this.EZpvd + ")";
    }

    public C46187tLa(boolean z, @NotNull java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = z;
        this.AEQbTJ = str;
        this.copydefault = str2;
        this.OLrzqt = str3;
        this.EZpvd = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001a: CONSTRUCTOR 
  (r8v0 boolean)
  (r9v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
 A[MD:(boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:5) call: o.tLa.<init>(boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ C46187tLa(boolean z, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4);
    }
}
