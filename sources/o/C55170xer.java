package o;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: o.xer, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55170xer {
    public final float EZpvd;
    public final float OLrzqt;
    public final float copydefault;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final C55170xer AEQbTJ = new C55170xer(Float.NEGATIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C55170xer copy$default(C55170xer c55170xer, float f, float f2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = c55170xer.copydefault;
        }
        if ((i & 2) != 0) {
            f2 = c55170xer.OLrzqt;
        }
        return c55170xer.copydefault(f, f2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C55170xer copydefault(float f, float f2) {
        return new C55170xer(f, f2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C55170xer)) {
            return false;
        }
        C55170xer c55170xer = (C55170xer) obj;
        return java.lang.Float.compare(this.copydefault, c55170xer.copydefault) == 0 && java.lang.Float.compare(this.OLrzqt, c55170xer.OLrzqt) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (java.lang.Float.hashCode(this.copydefault) * 31) + java.lang.Float.hashCode(this.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "Axis(min=" + this.copydefault + ", max=" + this.OLrzqt + ")";
    }

    public C55170xer(float f, float f2) {
        this.copydefault = f;
        this.OLrzqt = f2;
        if (f <= f2) {
            this.EZpvd = f2 - f;
            return;
        }
        throw new java.lang.IllegalArgumentException(("min must not be greater than max, but min(" + f + ") > max(" + f2 + ")").toString());
    }

    /* JADX INFO: renamed from: o.xer$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xer.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C55170xer copydefault() {
            return C55170xer.AEQbTJ;
        }
    }
}
