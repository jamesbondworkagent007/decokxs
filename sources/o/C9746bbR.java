package o;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: o.bbR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9746bbR {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;
    public android.graphics.drawable.Drawable AEQbTJ;
    public int EZpvd;
    public java.lang.CharSequence OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C9746bbR() {
        this(0, null, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.CharSequence AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.graphics.drawable.Drawable KWHzl() {
        return this.AEQbTJ;
    }

    public C9746bbR(int i, android.graphics.drawable.Drawable drawable, java.lang.CharSequence charSequence) {
        this.EZpvd = i;
        this.AEQbTJ = drawable;
        this.OLrzqt = charSequence;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r2v0 int))
  (wrap:android.graphics.drawable.Drawable:?: TERNARY null = ((wrap:int:0x0005: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.graphics.drawable.Drawable) : (r3v0 android.graphics.drawable.Drawable))
  (wrap:java.lang.CharSequence:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.CharSequence) : (r4v0 java.lang.CharSequence))
 A[MD:(int, android.graphics.drawable.Drawable, java.lang.CharSequence):void (m)] (LINE:6) call: o.bbR.<init>(int, android.graphics.drawable.Drawable, java.lang.CharSequence):void type: THIS */
    public /* synthetic */ C9746bbR(int i, android.graphics.drawable.Drawable drawable, java.lang.CharSequence charSequence, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : drawable, (i2 & 4) != 0 ? null : charSequence);
    }

    /* JADX INFO: renamed from: o.bbR$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.bbR.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }
}
