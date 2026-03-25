package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iFh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23679iFh {
    public final java.lang.Long AhwBna;
    public final java.lang.String EZpvd;
    public final java.lang.Long KWHzl;
    public final java.lang.Long OLrzqt;
    public final long copydefault;
    public static final ActionBar Companion = new ActionBar(null);
    public static final C23679iFh AEQbTJ = new C23679iFh(0, null, null, null, null, 31, null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C23679iFh() {
        this(0L, null, null, null, null, 31, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C23679iFh copy$default(C23679iFh c23679iFh, long j, java.lang.Long l, java.lang.Long l2, java.lang.Long l3, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = c23679iFh.copydefault;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            l = c23679iFh.OLrzqt;
        }
        java.lang.Long l4 = l;
        if ((i & 4) != 0) {
            l2 = c23679iFh.AhwBna;
        }
        java.lang.Long l5 = l2;
        if ((i & 8) != 0) {
            l3 = c23679iFh.KWHzl;
        }
        java.lang.Long l6 = l3;
        if ((i & 16) != 0) {
            str = c23679iFh.EZpvd;
        }
        return c23679iFh.EZpvd(j2, l4, l5, l6, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Long EZpvd() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C23679iFh EZpvd(long j, java.lang.Long l, java.lang.Long l2, java.lang.Long l3, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new C23679iFh(j, l, l2, l3, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Long KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Long OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23679iFh)) {
            return false;
        }
        C23679iFh c23679iFh = (C23679iFh) obj;
        return this.copydefault == c23679iFh.copydefault && Intrinsics.EZpvd(this.OLrzqt, c23679iFh.OLrzqt) && Intrinsics.EZpvd(this.AhwBna, c23679iFh.AhwBna) && Intrinsics.EZpvd(this.KWHzl, c23679iFh.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c23679iFh.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = java.lang.Long.hashCode(this.copydefault);
        java.lang.Long l = this.OLrzqt;
        int iHashCode2 = l == null ? 0 : l.hashCode();
        java.lang.Long l2 = this.AhwBna;
        int iHashCode3 = l2 == null ? 0 : l2.hashCode();
        java.lang.Long l3 = this.KWHzl;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (l3 != null ? l3.hashCode() : 0)) * 31) + this.EZpvd.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ProductIds(investmentId=" + this.copydefault + ", aggregateInvestmentId=" + this.OLrzqt + ", sourceInvestmentId=" + this.AhwBna + ", analyticId=" + this.KWHzl + ", activeInvestmentId=" + this.EZpvd + ")";
    }

    public C23679iFh(long j, java.lang.Long l, java.lang.Long l2, java.lang.Long l3, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = j;
        this.OLrzqt = l;
        this.AhwBna = l2;
        this.KWHzl = l3;
        this.EZpvd = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0025: CONSTRUCTOR 
  (wrap:long:0x0006: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r8v0 long))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0007: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r10v0 java.lang.Long))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x000f: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r11v0 java.lang.Long))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0016: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r12v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
 A[MD:(long, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.String):void (m)] (LINE:50) call: o.iFh.<init>(long, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.String):void type: THIS */
    public /* synthetic */ C23679iFh(long j, java.lang.Long l, java.lang.Long l2, java.lang.Long l3, java.lang.String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : l2, (i & 8) != 0 ? null : l3, (i & 16) != 0 ? "" : str);
    }

    /* JADX INFO: renamed from: o.iFh$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.iFh.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C23679iFh EZpvd() {
            return C23679iFh.AEQbTJ;
        }
    }
}
