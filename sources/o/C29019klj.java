package o;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: o.klj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C29019klj {
    public static final ActionBar Companion = new ActionBar(null);
    public final boolean AEQbTJ;
    public final boolean AYXKKw;
    public final float AhwBna;
    public final float EZpvd;
    public final float KWHzl;
    public final long OLrzqt;
    public final boolean copydefault;
    public final long djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C29019klj() {
        this(0.0f, 0L, 0.0f, false, false, false, 0.0f, 0L, 255, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float AhwBna() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C29019klj KWHzl(float f, long j, float f2, boolean z, boolean z2, boolean z3, float f3, long j2) {
        return new C29019klj(f, j, f2, z, z2, z3, f3, j2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29019klj)) {
            return false;
        }
        C29019klj c29019klj = (C29019klj) obj;
        return java.lang.Float.compare(this.KWHzl, c29019klj.KWHzl) == 0 && this.djBIcL == c29019klj.djBIcL && java.lang.Float.compare(this.AhwBna, c29019klj.AhwBna) == 0 && this.AEQbTJ == c29019klj.AEQbTJ && this.copydefault == c29019klj.copydefault && this.AYXKKw == c29019klj.AYXKKw && java.lang.Float.compare(this.EZpvd, c29019klj.EZpvd) == 0 && this.OLrzqt == c29019klj.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long gEmmrt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((java.lang.Float.hashCode(this.KWHzl) * 31) + java.lang.Long.hashCode(this.djBIcL)) * 31) + java.lang.Float.hashCode(this.AhwBna)) * 31) + java.lang.Boolean.hashCode(this.AEQbTJ)) * 31) + java.lang.Boolean.hashCode(this.copydefault)) * 31) + java.lang.Boolean.hashCode(this.AYXKKw)) * 31) + java.lang.Float.hashCode(this.EZpvd)) * 31) + java.lang.Long.hashCode(this.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "BoostCarouselConfig(autoScrollVelocity=" + this.KWHzl + ", timeUpdateInterval=" + this.djBIcL + ", itemSpacing=" + this.AhwBna + ", enableAutoScroll=" + this.AEQbTJ + ", enableTimeUpdate=" + this.copydefault + ", showFadingEdge=" + this.AYXKKw + ", fadingEdgeWidth=" + this.EZpvd + ", initialDelay=" + this.OLrzqt + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean valueOf() {
        return this.AYXKKw;
    }

    public C29019klj(float f, long j, float f2, boolean z, boolean z2, boolean z3, float f3, long j2) {
        this.KWHzl = f;
        this.djBIcL = j;
        this.AhwBna = f2;
        this.AEQbTJ = z;
        this.copydefault = z2;
        this.AYXKKw = z3;
        this.EZpvd = f3;
        this.OLrzqt = j2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0052: CONSTRUCTOR 
  (wrap:float:?: TERNARY null = ((wrap:int:0x0002: ARITH (r22v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (60.0f float) : (r12v0 float))
  (wrap:long:?: TERNARY null = ((wrap:int:0x000b: ARITH (r22v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (1000 long) : (r13v0 long))
  (wrap:float:?: TERNARY null = ((wrap:int:0x0013: ARITH (r22v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (12.0f float) : (r15v0 float))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x001b: ARITH (r22v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? true : (r16v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0024: ARITH (r22v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? true : (r17v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x002c: ARITH (r22v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r18v0 boolean) : true)
  (wrap:float:?: TERNARY null = ((wrap:int:0x0033: ARITH (r22v0 int) & (64 int) A[WRAPPED]) == (0 int)) ? (r19v0 float) : (60.0f float))
  (wrap:long:?: TERNARY null = ((wrap:int:0x003a: ARITH (r22v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (500 long) : (r20v0 long))
 A[MD:(float, long, float, boolean, boolean, boolean, float, long):void (m)] (LINE:7) call: o.klj.<init>(float, long, float, boolean, boolean, boolean, float, long):void type: THIS */
    public /* synthetic */ C29019klj(float f, long j, float f2, boolean z, boolean z2, boolean z3, float f3, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 60.0f : f, (i & 2) != 0 ? 1000L : j, (i & 4) != 0 ? 12.0f : f2, (i & 8) != 0 ? true : z, (i & 16) != 0 ? true : z2, (i & 32) == 0 ? z3 : true, (i & 64) == 0 ? f3 : 60.0f, (i & 128) != 0 ? 500L : j2);
    }

    /* JADX INFO: renamed from: o.klj$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.klj.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C29019klj EZpvd() {
            return new C29019klj(0.0f, 0L, 0.0f, false, false, false, 0.0f, 0L, 255, null);
        }
    }
}
