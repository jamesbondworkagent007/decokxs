package o;

import com.okinc.share.api.RedirectBehavior;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ueI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C48891ueI {
    public boolean AEQbTJ;
    public java.lang.String EZpvd;
    public RedirectBehavior KWHzl;
    public java.lang.String OLrzqt;
    public java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C48891ueI copy$default(C48891ueI c48891ueI, java.lang.String str, java.lang.String str2, boolean z, RedirectBehavior redirectBehavior, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c48891ueI.OLrzqt;
        }
        if ((i & 2) != 0) {
            str2 = c48891ueI.EZpvd;
        }
        java.lang.String str4 = str2;
        if ((i & 4) != 0) {
            z = c48891ueI.AEQbTJ;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            redirectBehavior = c48891ueI.KWHzl;
        }
        RedirectBehavior redirectBehavior2 = redirectBehavior;
        if ((i & 16) != 0) {
            str3 = c48891ueI.copydefault;
        }
        return c48891ueI.EZpvd(str, str4, z2, redirectBehavior2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C48891ueI EZpvd(@NotNull java.lang.String str, java.lang.String str2, boolean z, @NotNull RedirectBehavior redirectBehavior, java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(redirectBehavior, "");
        return new C48891ueI(str, str2, z, redirectBehavior, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RedirectBehavior KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.copydefault;
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
        if (!(obj instanceof C48891ueI)) {
            return false;
        }
        C48891ueI c48891ueI = (C48891ueI) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c48891ueI.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c48891ueI.EZpvd) && this.AEQbTJ == c48891ueI.AEQbTJ && this.KWHzl == c48891ueI.KWHzl && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c48891ueI.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.OLrzqt.hashCode();
        java.lang.String str = this.EZpvd;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        int iHashCode3 = java.lang.Boolean.hashCode(this.AEQbTJ);
        int iHashCode4 = this.KWHzl.hashCode();
        java.lang.String str2 = this.copydefault;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "CreateShortLinkParams(shareFrom=" + this.OLrzqt + ", deeplink=" + this.EZpvd + ", attachChannelCode=" + this.AEQbTJ + ", redirectBehavior=" + this.KWHzl + ", utmScene=" + this.copydefault + ")";
    }

    public C48891ueI(@NotNull java.lang.String str, java.lang.String str2, boolean z, @NotNull RedirectBehavior redirectBehavior, java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(redirectBehavior, "");
        this.OLrzqt = str;
        this.EZpvd = str2;
        this.AEQbTJ = z;
        this.KWHzl = redirectBehavior;
        this.copydefault = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001e: CONSTRUCTOR 
  (r8v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
  (wrap:boolean:0x000d: TERNARY null = ((wrap:int:0x0008: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r10v0 boolean))
  (wrap:com.okinc.share.api.RedirectBehavior:0x0014: TERNARY null = ((wrap:int:0x000e: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.share.api.RedirectBehavior:0x0012: SGET  A[WRAPPED] (LINE:32) com.okinc.share.api.RedirectBehavior.DEFAULT_ALLOW_DEEPLINK com.okinc.share.api.RedirectBehavior) : (r11v0 com.okinc.share.api.RedirectBehavior))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, boolean, com.okinc.share.api.RedirectBehavior, java.lang.String):void (m)] (LINE:8) call: o.ueI.<init>(java.lang.String, java.lang.String, boolean, com.okinc.share.api.RedirectBehavior, java.lang.String):void type: THIS */
    public /* synthetic */ C48891ueI(java.lang.String str, java.lang.String str2, boolean z, RedirectBehavior redirectBehavior, java.lang.String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? RedirectBehavior.DEFAULT_ALLOW_DEEPLINK : redirectBehavior, (i & 16) != 0 ? null : str3);
    }
}
