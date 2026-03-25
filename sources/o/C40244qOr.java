package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C40239qOm;

/* JADX INFO: renamed from: o.qOr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40244qOr {
    public final C40239qOm.ActionBar.C0923ActionBar AEQbTJ;
    public final C40239qOm.ActionBar.Application KWHzl;
    public final boolean OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C40244qOr() {
        this(false, null, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C40244qOr copy$default(C40244qOr c40244qOr, boolean z, C40239qOm.ActionBar.C0923ActionBar c0923ActionBar, C40239qOm.ActionBar.Application application, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = c40244qOr.OLrzqt;
        }
        if ((i & 2) != 0) {
            c0923ActionBar = c40244qOr.AEQbTJ;
        }
        if ((i & 4) != 0) {
            application = c40244qOr.KWHzl;
        }
        return c40244qOr.AEQbTJ(z, c0923ActionBar, application);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C40239qOm.ActionBar.C0923ActionBar AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C40244qOr AEQbTJ(boolean z, C40239qOm.ActionBar.C0923ActionBar c0923ActionBar, C40239qOm.ActionBar.Application application) {
        return new C40244qOr(z, c0923ActionBar, application);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C40239qOm.ActionBar.Application KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40244qOr)) {
            return false;
        }
        C40244qOr c40244qOr = (C40244qOr) obj;
        return this.OLrzqt == c40244qOr.OLrzqt && Intrinsics.EZpvd(this.AEQbTJ, c40244qOr.AEQbTJ) && Intrinsics.EZpvd(this.KWHzl, c40244qOr.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = java.lang.Boolean.hashCode(this.OLrzqt);
        C40239qOm.ActionBar.C0923ActionBar c0923ActionBar = this.AEQbTJ;
        int iHashCode2 = c0923ActionBar == null ? 0 : c0923ActionBar.hashCode();
        C40239qOm.ActionBar.Application application = this.KWHzl;
        return (((iHashCode * 31) + iHashCode2) * 31) + (application != null ? application.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "NavSearchResultDisplayingListConfigVo(isShowAllSpotList=" + this.OLrzqt + ", futuresTabVo=" + this.AEQbTJ + ", optionsTabVo=" + this.KWHzl + ")";
    }

    public C40244qOr(boolean z, C40239qOm.ActionBar.C0923ActionBar c0923ActionBar, C40239qOm.ActionBar.Application application) {
        this.OLrzqt = z;
        this.AEQbTJ = c0923ActionBar;
        this.KWHzl = application;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
  (wrap:o.qOm$ActionBar$ActionBar:?: TERNARY null = ((wrap:int:0x0005: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null o.qOm$ActionBar$ActionBar) : (r3v0 o.qOm$ActionBar$ActionBar))
  (wrap:o.qOm$ActionBar$Application:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null o.qOm$ActionBar$Application) : (r4v0 o.qOm$ActionBar$Application))
 A[MD:(boolean, o.qOm$ActionBar$ActionBar, o.qOm$ActionBar$Application):void (m)] (LINE:109) call: o.qOr.<init>(boolean, o.qOm$ActionBar$ActionBar, o.qOm$ActionBar$Application):void type: THIS */
    public /* synthetic */ C40244qOr(boolean z, C40239qOm.ActionBar.C0923ActionBar c0923ActionBar, C40239qOm.ActionBar.Application application, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : c0923ActionBar, (i & 4) != 0 ? null : application);
    }
}
