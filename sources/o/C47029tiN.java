package o;

import com.okinc.okrisk.service.ProfileStatus;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tiN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C47029tiN {
    public final ProfileStatus AEQbTJ;
    public final java.lang.String EZpvd;
    public final java.lang.String OLrzqt;
    public final java.lang.Integer copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C47029tiN copy$default(C47029tiN c47029tiN, java.lang.String str, java.lang.String str2, ProfileStatus profileStatus, java.lang.Integer num, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c47029tiN.EZpvd;
        }
        if ((i & 2) != 0) {
            str2 = c47029tiN.OLrzqt;
        }
        if ((i & 4) != 0) {
            profileStatus = c47029tiN.AEQbTJ;
        }
        if ((i & 8) != 0) {
            num = c47029tiN.copydefault;
        }
        return c47029tiN.KWHzl(str, str2, profileStatus, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C47029tiN KWHzl(java.lang.String str, java.lang.String str2, @NotNull ProfileStatus profileStatus, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(profileStatus, "");
        return new C47029tiN(str, str2, profileStatus, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ProfileStatus OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47029tiN)) {
            return false;
        }
        C47029tiN c47029tiN = (C47029tiN) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c47029tiN.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c47029tiN.OLrzqt) && this.AEQbTJ == c47029tiN.AEQbTJ && Intrinsics.EZpvd(this.copydefault, c47029tiN.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.String str = this.EZpvd;
        int iHashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.OLrzqt;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        int iHashCode3 = this.AEQbTJ.hashCode();
        java.lang.Integer num = this.copydefault;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (num != null ? num.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ProfileStatusDTO(riskId=" + this.EZpvd + ", riskToken=" + this.OLrzqt + ", code=" + this.AEQbTJ + ", aliCode=" + this.copydefault + ")";
    }

    public C47029tiN(java.lang.String str, java.lang.String str2, @NotNull ProfileStatus profileStatus, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(profileStatus, "");
        this.EZpvd = str;
        this.OLrzqt = str2;
        this.AEQbTJ = profileStatus;
        this.copydefault = num;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0014: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (r4v0 com.okinc.okrisk.service.ProfileStatus)
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r5v0 java.lang.Integer))
 A[MD:(java.lang.String, java.lang.String, com.okinc.okrisk.service.ProfileStatus, java.lang.Integer):void (m)] (LINE:11) call: o.tiN.<init>(java.lang.String, java.lang.String, com.okinc.okrisk.service.ProfileStatus, java.lang.Integer):void type: THIS */
    public /* synthetic */ C47029tiN(java.lang.String str, java.lang.String str2, ProfileStatus profileStatus, java.lang.Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, profileStatus, (i & 8) != 0 ? 0 : num);
    }
}
