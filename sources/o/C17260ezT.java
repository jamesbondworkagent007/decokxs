package o;

import androidx.appcompat.app.AppCompatActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ezT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C17260ezT {
    public final boolean AEQbTJ;
    public final Function1<java.lang.String, Unit> EZpvd;
    public final AppCompatActivity OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.ezT */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C17260ezT copy$default(C17260ezT c17260ezT, AppCompatActivity appCompatActivity, java.lang.String str, boolean z, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            appCompatActivity = c17260ezT.OLrzqt;
        }
        if ((i & 2) != 0) {
            str = c17260ezT.copydefault;
        }
        if ((i & 4) != 0) {
            z = c17260ezT.AEQbTJ;
        }
        if ((i & 8) != 0) {
            function1 = c17260ezT.EZpvd;
        }
        return c17260ezT.KWHzl(appCompatActivity, str, z, function1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C17260ezT KWHzl(@NotNull AppCompatActivity appCompatActivity, java.lang.String str, boolean z, Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(appCompatActivity, "");
        return new C17260ezT(appCompatActivity, str, z, function1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AppCompatActivity OLrzqt() {
        return this.OLrzqt;
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
        if (!(obj instanceof C17260ezT)) {
            return false;
        }
        C17260ezT c17260ezT = (C17260ezT) obj;
        return Intrinsics.EZpvd(this.OLrzqt, c17260ezT.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c17260ezT.copydefault) && this.AEQbTJ == c17260ezT.AEQbTJ && Intrinsics.EZpvd(this.EZpvd, c17260ezT.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.OLrzqt.hashCode();
        java.lang.String str = this.copydefault;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        int iHashCode3 = java.lang.Boolean.hashCode(this.AEQbTJ);
        Function1<java.lang.String, Unit> function1 = this.EZpvd;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (function1 != null ? function1.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "WalletResetParams(activity=" + this.OLrzqt + ", screenName=" + this.copydefault + ", needBackup=" + this.AEQbTJ + ", onWalletReset=" + this.EZpvd + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C17260ezT(@NotNull AppCompatActivity appCompatActivity, java.lang.String str, boolean z, Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(appCompatActivity, "");
        this.OLrzqt = appCompatActivity;
        this.copydefault = str;
        this.AEQbTJ = z;
        this.EZpvd = function1;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r2v0 androidx.appcompat.app.AppCompatActivity)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (r4v0 boolean)
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r5v0 kotlin.jvm.functions.Function1))
 A[MD:(androidx.appcompat.app.AppCompatActivity, java.lang.String, boolean, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>):void (m)] (LINE:21) call: o.ezT.<init>(androidx.appcompat.app.AppCompatActivity, java.lang.String, boolean, kotlin.jvm.functions.Function1):void type: THIS */
    public /* synthetic */ C17260ezT(AppCompatActivity appCompatActivity, java.lang.String str, boolean z, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(appCompatActivity, (i & 2) != 0 ? null : str, z, (i & 8) != 0 ? null : function1);
    }
}
