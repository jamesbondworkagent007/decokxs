package o;

import com.immomo.mls.fun.ui.custom.data.JDImageInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.apy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C7766apy {
    public android.view.View AEQbTJ;
    public JDImageInfo KWHzl;
    public java.lang.String OLrzqt;
    public java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C7766apy() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C7766apy copy$default(C7766apy c7766apy, java.lang.String str, java.lang.String str2, JDImageInfo jDImageInfo, android.view.View view, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c7766apy.OLrzqt;
        }
        if ((i & 2) != 0) {
            str2 = c7766apy.copydefault;
        }
        if ((i & 4) != 0) {
            jDImageInfo = c7766apy.KWHzl;
        }
        if ((i & 8) != 0) {
            view = c7766apy.AEQbTJ;
        }
        return c7766apy.AEQbTJ(str, str2, jDImageInfo, view);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C7766apy AEQbTJ(java.lang.String str, java.lang.String str2, JDImageInfo jDImageInfo, android.view.View view) {
        return new C7766apy(str, str2, jDImageInfo, view);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(android.view.View view) {
        this.AEQbTJ = view;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(java.lang.String str) {
        this.OLrzqt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JDImageInfo EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(java.lang.String str) {
        this.copydefault = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.view.View OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(JDImageInfo jDImageInfo) {
        this.KWHzl = jDImageInfo;
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
        if (!(obj instanceof C7766apy)) {
            return false;
        }
        C7766apy c7766apy = (C7766apy) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c7766apy.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c7766apy.copydefault) && Intrinsics.EZpvd(this.KWHzl, c7766apy.KWHzl) && Intrinsics.EZpvd(this.AEQbTJ, c7766apy.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.String str = this.OLrzqt;
        int iHashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.copydefault;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        JDImageInfo jDImageInfo = this.KWHzl;
        int iHashCode3 = jDImageInfo == null ? 0 : jDImageInfo.hashCode();
        android.view.View view = this.AEQbTJ;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (view != null ? view.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "Selection(title=" + this.OLrzqt + ", description=" + this.copydefault + ", image=" + this.KWHzl + ", attachment=" + this.AEQbTJ + ")";
    }

    public C7766apy(java.lang.String str, java.lang.String str2, JDImageInfo jDImageInfo, android.view.View view) {
        this.OLrzqt = str;
        this.copydefault = str2;
        this.KWHzl = jDImageInfo;
        this.AEQbTJ = view;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:com.immomo.mls.fun.ui.custom.data.JDImageInfo:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.immomo.mls.fun.ui.custom.data.JDImageInfo) : (r4v0 com.immomo.mls.fun.ui.custom.data.JDImageInfo))
  (wrap:android.view.View:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null android.view.View) : (r5v0 android.view.View))
 A[MD:(java.lang.String, java.lang.String, com.immomo.mls.fun.ui.custom.data.JDImageInfo, android.view.View):void (m)] (LINE:6) call: o.apy.<init>(java.lang.String, java.lang.String, com.immomo.mls.fun.ui.custom.data.JDImageInfo, android.view.View):void type: THIS */
    public /* synthetic */ C7766apy(java.lang.String str, java.lang.String str2, JDImageInfo jDImageInfo, android.view.View view, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : jDImageInfo, (i & 8) != 0 ? null : view);
    }
}
