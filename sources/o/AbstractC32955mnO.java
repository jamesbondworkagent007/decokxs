package o;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: o.mnO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC32955mnO<T> {
    public final T AEQbTJ;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.Object), (r2v0 java.lang.String) A[MD:(T, java.lang.String):void (m)] call: o.mnO.<init>(java.lang.Object, java.lang.String):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC32955mnO(java.lang.Object obj, java.lang.String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final T AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.copydefault;
    }

    /* JADX INFO: renamed from: o.mnO$ActionBar */
    public static final class ActionBar<T> extends AbstractC32955mnO<T> {
        public ActionBar(T t) {
            super(t, null, 2, 0 == true ? 1 : 0);
        }
    }

    public AbstractC32955mnO(T t, java.lang.String str) {
        this.AEQbTJ = t;
        this.copydefault = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.Object:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Object) : (r2v0 java.lang.Object))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (null kotlin.jvm.internal.DefaultConstructorMarker)
 A[MD:(java.lang.Object, java.lang.String, kotlin.jvm.internal.DefaultConstructorMarker):void (m)] (LINE:5) call: o.mnO.<init>(java.lang.Object, java.lang.String, kotlin.jvm.internal.DefaultConstructorMarker):void type: THIS */
    public /* synthetic */ AbstractC32955mnO(java.lang.Object obj, java.lang.String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : obj, (i & 2) != 0 ? null : str, null);
    }

    /* JADX INFO: renamed from: o.mnO$TaskDescription */
    public static final class TaskDescription<T> extends AbstractC32955mnO<T> {
        public TaskDescription() {
            super(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }

    /* JADX INFO: renamed from: o.mnO$Activity */
    public static final class Activity<T> extends AbstractC32955mnO<T> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Activity(java.lang.String str) {
            DefaultConstructorMarker defaultConstructorMarker = null;
            super(defaultConstructorMarker, str, defaultConstructorMarker);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:8) call: o.mnO.Activity.<init>(java.lang.String):void type: THIS */
        public /* synthetic */ Activity(java.lang.String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }
    }
}
