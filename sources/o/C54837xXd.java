package o;

import com.okinc.wallet.api.bean.SignStatus;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xXd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C54837xXd {
    public final java.lang.Integer AEQbTJ;
    public final java.lang.Long EZpvd;
    public final java.lang.String KWHzl;
    public final SignStatus OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C54837xXd copy$default(C54837xXd c54837xXd, SignStatus signStatus, java.lang.String str, java.lang.String str2, java.lang.Long l, java.lang.Integer num, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            signStatus = c54837xXd.OLrzqt;
        }
        if ((i & 2) != 0) {
            str = c54837xXd.KWHzl;
        }
        java.lang.String str3 = str;
        if ((i & 4) != 0) {
            str2 = c54837xXd.copydefault;
        }
        java.lang.String str4 = str2;
        if ((i & 8) != 0) {
            l = c54837xXd.EZpvd;
        }
        java.lang.Long l2 = l;
        if ((i & 16) != 0) {
            num = c54837xXd.AEQbTJ;
        }
        return c54837xXd.EZpvd(signStatus, str3, str4, l2, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Long AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C54837xXd EZpvd(@NotNull SignStatus signStatus, @NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.Long l, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(signStatus, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new C54837xXd(signStatus, str, str2, l, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignStatus KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.KWHzl;
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
        if (!(obj instanceof C54837xXd)) {
            return false;
        }
        C54837xXd c54837xXd = (C54837xXd) obj;
        return this.OLrzqt == c54837xXd.OLrzqt && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c54837xXd.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c54837xXd.copydefault) && Intrinsics.EZpvd(this.EZpvd, c54837xXd.EZpvd) && Intrinsics.EZpvd(this.AEQbTJ, c54837xXd.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.OLrzqt.hashCode();
        int iHashCode2 = this.KWHzl.hashCode();
        int iHashCode3 = this.copydefault.hashCode();
        java.lang.Long l = this.EZpvd;
        int iHashCode4 = l == null ? 0 : l.hashCode();
        java.lang.Integer num = this.AEQbTJ;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (num != null ? num.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SignResult(status=" + this.OLrzqt + ", signResult=" + this.KWHzl + ", errMsg=" + this.copydefault + ", chainIndex=" + this.EZpvd + ", addressType=" + this.AEQbTJ + ")";
    }

    public C54837xXd(@NotNull SignStatus signStatus, @NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.Long l, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(signStatus, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.OLrzqt = signStatus;
        this.KWHzl = str;
        this.copydefault = str2;
        this.EZpvd = l;
        this.AEQbTJ = num;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0021: CONSTRUCTOR 
  (r8v0 com.okinc.wallet.api.bean.SignStatus)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0010: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r11v0 java.lang.Long))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0018: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r12v0 java.lang.Integer))
 A[MD:(com.okinc.wallet.api.bean.SignStatus, java.lang.String, java.lang.String, java.lang.Long, java.lang.Integer):void (m)] (LINE:92) call: o.xXd.<init>(com.okinc.wallet.api.bean.SignStatus, java.lang.String, java.lang.String, java.lang.Long, java.lang.Integer):void type: THIS */
    public /* synthetic */ C54837xXd(SignStatus signStatus, java.lang.String str, java.lang.String str2, java.lang.Long l, java.lang.Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(signStatus, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? null : l, (i & 16) != 0 ? null : num);
    }
}
