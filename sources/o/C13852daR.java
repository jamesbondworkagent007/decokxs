package o;

import com.okinc.business.defi.biz.constant.EOSState;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.daR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C13852daR {
    public java.lang.String AEQbTJ;
    public EOSState AhwBna;
    public java.lang.String EZpvd;
    public java.lang.String KWHzl;
    public java.lang.String OLrzqt;
    public boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C13852daR() {
        this(null, null, null, null, null, false, 63, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C13852daR copy$default(C13852daR c13852daR, java.lang.String str, EOSState eOSState, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c13852daR.OLrzqt;
        }
        if ((i & 2) != 0) {
            eOSState = c13852daR.AhwBna;
        }
        EOSState eOSState2 = eOSState;
        if ((i & 4) != 0) {
            str2 = c13852daR.AEQbTJ;
        }
        java.lang.String str5 = str2;
        if ((i & 8) != 0) {
            str3 = c13852daR.EZpvd;
        }
        java.lang.String str6 = str3;
        if ((i & 16) != 0) {
            str4 = c13852daR.KWHzl;
        }
        java.lang.String str7 = str4;
        if ((i & 32) != 0) {
            z = c13852daR.copydefault;
        }
        return c13852daR.EZpvd(str, eOSState2, str5, str6, str7, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(boolean z) {
        this.copydefault = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C13852daR EZpvd(@NotNull java.lang.String str, @NotNull EOSState eOSState, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(eOSState, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new C13852daR(str, eOSState, str2, str3, str4, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull EOSState eOSState) {
        Intrinsics.checkNotNullParameter(eOSState, "");
        this.AhwBna = eOSState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = str;
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
        if (!(obj instanceof C13852daR)) {
            return false;
        }
        C13852daR c13852daR = (C13852daR) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c13852daR.OLrzqt) && this.AhwBna == c13852daR.AhwBna && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c13852daR.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c13852daR.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c13852daR.KWHzl) && this.copydefault == c13852daR.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.OLrzqt.hashCode() * 31) + this.AhwBna.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + java.lang.Boolean.hashCode(this.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "EosInfo(accountName=" + this.OLrzqt + ", state=" + this.AhwBna + ", pubKey=" + this.AEQbTJ + ", activeKey=" + this.EZpvd + ", ownerKey=" + this.KWHzl + ", showBeDeleted=" + this.copydefault + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EOSState valueOf() {
        return this.AhwBna;
    }

    public C13852daR(@NotNull java.lang.String str, @NotNull EOSState eOSState, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(eOSState, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.OLrzqt = str;
        this.AhwBna = eOSState;
        this.AEQbTJ = str2;
        this.EZpvd = str3;
        this.KWHzl = str4;
        this.copydefault = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0030: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r11v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:com.okinc.business.defi.biz.constant.EOSState:0x000f: TERNARY null = ((wrap:int:0x0009: ARITH (r11v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.defi.biz.constant.EOSState:0x000d: SGET  A[WRAPPED] (LINE:7) com.okinc.business.defi.biz.constant.EOSState.Unknown com.okinc.business.defi.biz.constant.EOSState) : (r6v0 com.okinc.business.defi.biz.constant.EOSState))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r11v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r11v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r11v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r9v0 java.lang.String) : (""))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0024: ARITH (r11v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? false : (r10v0 boolean))
 A[MD:(java.lang.String, com.okinc.business.defi.biz.constant.EOSState, java.lang.String, java.lang.String, java.lang.String, boolean):void (m)] (LINE:5) call: o.daR.<init>(java.lang.String, com.okinc.business.defi.biz.constant.EOSState, java.lang.String, java.lang.String, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ C13852daR(java.lang.String str, EOSState eOSState, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? EOSState.Unknown : eOSState, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) == 0 ? str4 : "", (i & 32) != 0 ? false : z);
    }

    public final boolean AhwBna() {
        return this.AhwBna == EOSState.Unopened && this.AEQbTJ.length() > 0;
    }
}
