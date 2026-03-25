package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.ReportLevel;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yRr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56770yRr {
    public final C56385yDk AEQbTJ;
    public final ReportLevel KWHzl;
    public final ReportLevel copydefault;
    public static final TaskDescription OLrzqt = new TaskDescription(null);
    public static final C56770yRr EZpvd = new C56770yRr(ReportLevel.STRICT, null, null, 6, null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56385yDk EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ReportLevel OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ReportLevel copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C56770yRr)) {
            return false;
        }
        C56770yRr c56770yRr = (C56770yRr) obj;
        return this.KWHzl == c56770yRr.KWHzl && Intrinsics.EZpvd(this.AEQbTJ, c56770yRr.AEQbTJ) && this.copydefault == c56770yRr.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.KWHzl.hashCode();
        C56385yDk c56385yDk = this.AEQbTJ;
        return (((iHashCode * 31) + (c56385yDk == null ? 0 : c56385yDk.hashCode())) * 31) + this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "JavaNullabilityAnnotationsStatus(reportLevelBefore=" + this.KWHzl + ", sinceVersion=" + this.AEQbTJ + ", reportLevelAfter=" + this.copydefault + ')';
    }

    public C56770yRr(@NotNull ReportLevel reportLevel, C56385yDk c56385yDk, @NotNull ReportLevel reportLevel2) {
        Intrinsics.checkNotNullParameter(reportLevel, "");
        Intrinsics.checkNotNullParameter(reportLevel2, "");
        this.KWHzl = reportLevel;
        this.AEQbTJ = c56385yDk;
        this.copydefault = reportLevel2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (r2v0 kotlin.reflect.jvm.internal.impl.load.java.ReportLevel)
  (wrap:o.yDk:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:o.yDk:0x0008: CONSTRUCTOR (1 int), (0 int) A[MD:(int, int):void (m), WRAPPED] (LINE:10) call: o.yDk.<init>(int, int):void type: CONSTRUCTOR) : (r3v0 o.yDk))
  (wrap:kotlin.reflect.jvm.internal.impl.load.java.ReportLevel:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (r2v0 kotlin.reflect.jvm.internal.impl.load.java.ReportLevel) : (r4v0 kotlin.reflect.jvm.internal.impl.load.java.ReportLevel))
 A[MD:(kotlin.reflect.jvm.internal.impl.load.java.ReportLevel, o.yDk, kotlin.reflect.jvm.internal.impl.load.java.ReportLevel):void (m)] (LINE:8) call: o.yRr.<init>(kotlin.reflect.jvm.internal.impl.load.java.ReportLevel, o.yDk, kotlin.reflect.jvm.internal.impl.load.java.ReportLevel):void type: THIS */
    public /* synthetic */ C56770yRr(ReportLevel reportLevel, C56385yDk c56385yDk, ReportLevel reportLevel2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(reportLevel, (i & 2) != 0 ? new C56385yDk(1, 0) : c56385yDk, (i & 4) != 0 ? reportLevel : reportLevel2);
    }

    /* JADX INFO: renamed from: o.yRr$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.yRr.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C56770yRr EZpvd() {
            return C56770yRr.EZpvd;
        }
    }
}
