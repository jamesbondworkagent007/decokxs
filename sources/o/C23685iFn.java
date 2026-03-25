package o;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: o.iFn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23685iFn {
    public static final Activity Companion = new Activity(null);
    public static final C23685iFn EZpvd = new C23685iFn(false, false, false, 7, null);
    public final boolean AEQbTJ;
    public final boolean OLrzqt;
    public final boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C23685iFn() {
        this(false, false, false, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C23685iFn copy$default(C23685iFn c23685iFn, boolean z, boolean z2, boolean z3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = c23685iFn.AEQbTJ;
        }
        if ((i & 2) != 0) {
            z2 = c23685iFn.OLrzqt;
        }
        if ((i & 4) != 0) {
            z3 = c23685iFn.copydefault;
        }
        return c23685iFn.OLrzqt(z, z2, z3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C23685iFn OLrzqt(boolean z, boolean z2, boolean z3) {
        return new C23685iFn(z, z2, z3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23685iFn)) {
            return false;
        }
        C23685iFn c23685iFn = (C23685iFn) obj;
        return this.AEQbTJ == c23685iFn.AEQbTJ && this.OLrzqt == c23685iFn.OLrzqt && this.copydefault == c23685iFn.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((java.lang.Boolean.hashCode(this.AEQbTJ) * 31) + java.lang.Boolean.hashCode(this.OLrzqt)) * 31) + java.lang.Boolean.hashCode(this.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ProductSectionVisibilityInfo(hasRate=" + this.AEQbTJ + ", hasRateChart=" + this.OLrzqt + ", hasRatePerformance=" + this.copydefault + ")";
    }

    public C23685iFn(boolean z, boolean z2, boolean z3) {
        this.AEQbTJ = z;
        this.OLrzqt = z2;
        this.copydefault = z3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? true : (r2v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? true : (r3v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? true : (r4v0 boolean))
 A[MD:(boolean, boolean, boolean):void (m)] (LINE:158) call: o.iFn.<init>(boolean, boolean, boolean):void type: THIS */
    public /* synthetic */ C23685iFn(boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? true : z3);
    }

    /* JADX INFO: renamed from: o.iFn$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.iFn.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C23685iFn OLrzqt() {
            return C23685iFn.EZpvd;
        }
    }
}
