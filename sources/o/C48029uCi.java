package o;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: o.uCi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C48029uCi {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final C48029uCi OLrzqt = new C48029uCi(false, false, false, false, 15, null);
    public final boolean AEQbTJ;
    public final boolean EZpvd;
    public final boolean KWHzl;
    public final boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C48029uCi() {
        this(false, false, false, false, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C48029uCi copy$default(C48029uCi c48029uCi, boolean z, boolean z2, boolean z3, boolean z4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = c48029uCi.KWHzl;
        }
        if ((i & 2) != 0) {
            z2 = c48029uCi.copydefault;
        }
        if ((i & 4) != 0) {
            z3 = c48029uCi.EZpvd;
        }
        if ((i & 8) != 0) {
            z4 = c48029uCi.AEQbTJ;
        }
        return c48029uCi.OLrzqt(z, z2, z3, z4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C48029uCi OLrzqt(boolean z, boolean z2, boolean z3, boolean z4) {
        return new C48029uCi(z, z2, z3, z4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C48029uCi)) {
            return false;
        }
        C48029uCi c48029uCi = (C48029uCi) obj;
        return this.KWHzl == c48029uCi.KWHzl && this.copydefault == c48029uCi.copydefault && this.EZpvd == c48029uCi.EZpvd && this.AEQbTJ == c48029uCi.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((java.lang.Boolean.hashCode(this.KWHzl) * 31) + java.lang.Boolean.hashCode(this.copydefault)) * 31) + java.lang.Boolean.hashCode(this.EZpvd)) * 31) + java.lang.Boolean.hashCode(this.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "PnlLineChartConfig(showMarker=" + this.KWHzl + ", showMinMaxLabel=" + this.copydefault + ", enablePositiveNegativeColoring=" + this.EZpvd + ", enableHapticFeedback=" + this.AEQbTJ + ")";
    }

    public C48029uCi(boolean z, boolean z2, boolean z3, boolean z4) {
        this.KWHzl = z;
        this.copydefault = z2;
        this.EZpvd = z3;
        this.AEQbTJ = z4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? true : (r2v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? true : (r3v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? true : (r4v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? true : (r5v0 boolean))
 A[MD:(boolean, boolean, boolean, boolean):void (m)] (LINE:11) call: o.uCi.<init>(boolean, boolean, boolean, boolean):void type: THIS */
    public /* synthetic */ C48029uCi(boolean z, boolean z2, boolean z3, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? true : z3, (i & 8) != 0 ? true : z4);
    }

    /* JADX INFO: renamed from: o.uCi$TaskDescription */
    /* JADX INFO: loaded from: classes24.dex */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.uCi.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C48029uCi OLrzqt() {
            return C48029uCi.OLrzqt;
        }
    }
}
