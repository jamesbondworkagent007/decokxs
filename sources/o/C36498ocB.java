package o;

import com.okinc.im.imui.livestream.model.UserRole;
import com.okinc.okimcore.model.remote.OfficialTagInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ocB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C36498ocB {
    public final boolean AEQbTJ;
    public final java.util.List<OfficialTagInfo> AYXKKw;
    public final long AhwBna;
    public final java.lang.String AkhnZx;
    public final java.lang.String EZpvd;
    public final OfficialTagInfo KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.String copydefault;
    public final long djBIcL;
    public final java.lang.String gEmmrt;
    public final UserRole valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C36498ocB AEQbTJ(long j, java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, java.lang.String str4, @NotNull java.lang.String str5, long j2, @NotNull UserRole userRole, @NotNull java.util.List<OfficialTagInfo> list, OfficialTagInfo officialTagInfo, boolean z) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(userRole, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new C36498ocB(j, str, str2, str3, str4, str5, j2, userRole, list, officialTagInfo, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AYXKKw() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long EZpvd() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OfficialTagInfo KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UserRole djBIcL() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36498ocB)) {
            return false;
        }
        C36498ocB c36498ocB = (C36498ocB) obj;
        return this.AhwBna == c36498ocB.AhwBna && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c36498ocB.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) c36498ocB.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.AkhnZx, (java.lang.Object) c36498ocB.AkhnZx) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c36498ocB.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c36498ocB.copydefault) && this.djBIcL == c36498ocB.djBIcL && this.valueOf == c36498ocB.valueOf && Intrinsics.EZpvd(this.AYXKKw, c36498ocB.AYXKKw) && Intrinsics.EZpvd(this.KWHzl, c36498ocB.KWHzl) && this.AEQbTJ == c36498ocB.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gEmmrt() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = java.lang.Long.hashCode(this.AhwBna);
        java.lang.String str = this.OLrzqt;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        int iHashCode3 = this.gEmmrt.hashCode();
        int iHashCode4 = this.AkhnZx.hashCode();
        java.lang.String str2 = this.EZpvd;
        int iHashCode5 = str2 == null ? 0 : str2.hashCode();
        int iHashCode6 = this.copydefault.hashCode();
        int iHashCode7 = java.lang.Long.hashCode(this.djBIcL);
        int iHashCode8 = this.valueOf.hashCode();
        int iHashCode9 = this.AYXKKw.hashCode();
        OfficialTagInfo officialTagInfo = this.KWHzl;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (officialTagInfo != null ? officialTagInfo.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "LivestreamChatMessage(seq=" + this.AhwBna + ", clientMsgId=" + this.OLrzqt + ", userId=" + this.gEmmrt + ", username=" + this.AkhnZx + ", avatarUrl=" + this.EZpvd + ", message=" + this.copydefault + ", timestamp=" + this.djBIcL + ", userRole=" + this.valueOf + ", tags=" + this.AYXKKw + ", officialTagInfo=" + this.KWHzl + ", isRecalled=" + this.AEQbTJ + ")";
    }

    public C36498ocB(long j, java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, java.lang.String str4, @NotNull java.lang.String str5, long j2, @NotNull UserRole userRole, @NotNull java.util.List<OfficialTagInfo> list, OfficialTagInfo officialTagInfo, boolean z) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(userRole, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.AhwBna = j;
        this.OLrzqt = str;
        this.gEmmrt = str2;
        this.AkhnZx = str3;
        this.EZpvd = str4;
        this.copydefault = str5;
        this.djBIcL = j2;
        this.valueOf = userRole;
        this.AYXKKw = list;
        this.KWHzl = officialTagInfo;
        this.AEQbTJ = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0039: CONSTRUCTOR 
  (r18v0 long)
  (r20v0 java.lang.String)
  (r21v0 java.lang.String)
  (r22v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r31v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r23v0 java.lang.String))
  (r24v0 java.lang.String)
  (r25v0 long)
  (wrap:com.okinc.im.imui.livestream.model.UserRole:?: TERNARY null = ((wrap:int:0x000b: ARITH (r31v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0011: SGET  A[WRAPPED] (LINE:16) com.okinc.im.imui.livestream.model.UserRole.VIEWER com.okinc.im.imui.livestream.model.UserRole) : (r27v0 com.okinc.im.imui.livestream.model.UserRole))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0015: ARITH (r31v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x001d: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:17)) : (r28v0 java.util.List))
  (wrap:com.okinc.okimcore.model.remote.OfficialTagInfo:?: TERNARY null = ((wrap:int:0x0021: ARITH (r31v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.remote.OfficialTagInfo) : (r29v0 com.okinc.okimcore.model.remote.OfficialTagInfo))
  (r30v0 boolean)
 A[MD:(long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, com.okinc.im.imui.livestream.model.UserRole, java.util.List<com.okinc.okimcore.model.remote.OfficialTagInfo>, com.okinc.okimcore.model.remote.OfficialTagInfo, boolean):void (m)] (LINE:8) call: o.ocB.<init>(long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, com.okinc.im.imui.livestream.model.UserRole, java.util.List, com.okinc.okimcore.model.remote.OfficialTagInfo, boolean):void type: THIS */
    public /* synthetic */ C36498ocB(long j, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, long j2, UserRole userRole, java.util.List list, OfficialTagInfo officialTagInfo, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, str, str2, str3, (i & 16) != 0 ? null : str4, str5, j2, (i & 128) != 0 ? UserRole.VIEWER : userRole, (i & 256) != 0 ? yDY.AhwBna() : list, (i & 512) != 0 ? null : officialTagInfo, z);
    }
}
