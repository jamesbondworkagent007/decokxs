package o;

import com.okinc.okimcore.model.remote.OfficialTagInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sQr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44461sQr {
    public final java.lang.String AEQbTJ;
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final boolean OLrzqt;
    public final java.lang.String copydefault;
    public final OfficialTagInfo gEmmrt;
    public final java.lang.String valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C44461sQr() {
        this(null, null, null, false, null, null, null, 127, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C44461sQr copy$default(C44461sQr c44461sQr, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, java.lang.String str4, java.lang.String str5, OfficialTagInfo officialTagInfo, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c44461sQr.AEQbTJ;
        }
        if ((i & 2) != 0) {
            str2 = c44461sQr.EZpvd;
        }
        java.lang.String str6 = str2;
        if ((i & 4) != 0) {
            str3 = c44461sQr.KWHzl;
        }
        java.lang.String str7 = str3;
        if ((i & 8) != 0) {
            z = c44461sQr.OLrzqt;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            str4 = c44461sQr.valueOf;
        }
        java.lang.String str8 = str4;
        if ((i & 32) != 0) {
            str5 = c44461sQr.copydefault;
        }
        java.lang.String str9 = str5;
        if ((i & 64) != 0) {
            officialTagInfo = c44461sQr.gEmmrt;
        }
        return c44461sQr.AEQbTJ(str, str6, str7, z2, str8, str9, officialTagInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C44461sQr AEQbTJ(@NotNull java.lang.String str, java.lang.String str2, @NotNull java.lang.String str3, boolean z, java.lang.String str4, java.lang.String str5, OfficialTagInfo officialTagInfo) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new C44461sQr(str, str2, str3, z, str4, str5, officialTagInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OfficialTagInfo EZpvd() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C44461sQr)) {
            return false;
        }
        C44461sQr c44461sQr = (C44461sQr) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c44461sQr.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c44461sQr.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c44461sQr.KWHzl) && this.OLrzqt == c44461sQr.OLrzqt && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) c44461sQr.valueOf) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c44461sQr.copydefault) && Intrinsics.EZpvd(this.gEmmrt, c44461sQr.gEmmrt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gEmmrt() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.AEQbTJ.hashCode();
        java.lang.String str = this.EZpvd;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        int iHashCode3 = this.KWHzl.hashCode();
        int iHashCode4 = java.lang.Boolean.hashCode(this.OLrzqt);
        java.lang.String str2 = this.valueOf;
        int iHashCode5 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.copydefault;
        int iHashCode6 = str3 == null ? 0 : str3.hashCode();
        OfficialTagInfo officialTagInfo = this.gEmmrt;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (officialTagInfo != null ? officialTagInfo.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "IMDisplayUserInfo(name=" + this.AEQbTJ + ", enName=" + this.EZpvd + ", avatar=" + this.KWHzl + ", isUseRemarkName=" + this.OLrzqt + ", phoneName=" + this.valueOf + ", displayName=" + this.copydefault + ", officialTags=" + this.gEmmrt + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean valueOf() {
        return this.OLrzqt;
    }

    public C44461sQr(@NotNull java.lang.String str, java.lang.String str2, @NotNull java.lang.String str3, boolean z, java.lang.String str4, java.lang.String str5, OfficialTagInfo officialTagInfo) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.AEQbTJ = str;
        this.EZpvd = str2;
        this.KWHzl = str3;
        this.OLrzqt = z;
        this.valueOf = str4;
        this.copydefault = str5;
        this.gEmmrt = officialTagInfo;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0039: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r14v0 int) & (4 int) A[WRAPPED]) == (0 int)) ? (r9v0 java.lang.String) : (""))
  (wrap:boolean:0x001c: TERNARY null = ((wrap:int:0x0017: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r10v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:com.okinc.okimcore.model.remote.OfficialTagInfo:?: TERNARY null = ((wrap:int:0x002b: ARITH (r14v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.remote.OfficialTagInfo) : (r13v0 com.okinc.okimcore.model.remote.OfficialTagInfo))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, com.okinc.okimcore.model.remote.OfficialTagInfo):void (m)] (LINE:11) call: o.sQr.<init>(java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, com.okinc.okimcore.model.remote.OfficialTagInfo):void type: THIS */
    public /* synthetic */ C44461sQr(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, java.lang.String str4, java.lang.String str5, OfficialTagInfo officialTagInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) == 0 ? str3 : "", (i & 8) != 0 ? false : z, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : officialTagInfo);
    }

    public final boolean djBIcL() {
        return this.AEQbTJ.length() == 0 && this.KWHzl.length() == 0;
    }
}
