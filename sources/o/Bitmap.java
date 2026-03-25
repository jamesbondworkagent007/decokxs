package o;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public abstract class Bitmap<T> {
    public final T KWHzl;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.Object), (r2v0 java.lang.String) A[MD:(T, java.lang.String):void (m)] call: o.Bitmap.<init>(java.lang.Object, java.lang.String):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ Bitmap(java.lang.Object obj, java.lang.String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final T OLrzqt() {
        return this.KWHzl;
    }

    public Bitmap(T t, java.lang.String str) {
        this.KWHzl = t;
        this.copydefault = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.Object:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Object) : (r2v0 java.lang.Object))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (null kotlin.jvm.internal.DefaultConstructorMarker)
 A[MD:(java.lang.Object, java.lang.String, kotlin.jvm.internal.DefaultConstructorMarker):void (m)] (LINE:3) call: o.Bitmap.<init>(java.lang.Object, java.lang.String, kotlin.jvm.internal.DefaultConstructorMarker):void type: THIS */
    public /* synthetic */ Bitmap(java.lang.Object obj, java.lang.String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : obj, (i & 2) != 0 ? null : str, null);
    }

    public static final class StateListAnimator<T> extends Bitmap<T> {
        public StateListAnimator(T t) {
            super(t, null, 2, 0 == true ? 1 : 0);
        }
    }

    public static final class TaskDescription<T> extends Bitmap<T> {
        public TaskDescription() {
            super(null, 0 == true ? 1 : 0, 2, 0 == true ? 1 : 0);
        }
    }

    public static final class ActionBar<T> extends Bitmap<T> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public ActionBar(java.lang.String str, T t) {
            super(t, str, null);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.Object:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Object) : (r3v0 java.lang.Object))
 A[MD:(java.lang.String, T):void (m)] (LINE:9) call: o.Bitmap.ActionBar.<init>(java.lang.String, java.lang.Object):void type: THIS */
        public /* synthetic */ ActionBar(java.lang.String str, java.lang.Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : obj);
        }
    }
}
