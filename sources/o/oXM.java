package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C32113mPz;
import o.C52761wXj;

/* JADX INFO: loaded from: classes8.dex */
public final class oXM {
    public final int AEQbTJ;
    public final android.graphics.Typeface EZpvd;
    public final int OLrzqt;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;
    public static final oXM KWHzl = new oXM(C33070mpX.copydefault(C32113mPz.ActionBar.fetchVPNInfo), C33070mpX.OLrzqt(C52761wXj.StateListAnimator.gkJEwt), null, 4, null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.graphics.Typeface OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return this.OLrzqt;
    }

    public oXM(@androidx.annotation.ColorInt int i, @androidx.annotation.Dimension(unit = 1) int i2, android.graphics.Typeface typeface) {
        this.OLrzqt = i;
        this.AEQbTJ = i2;
        this.EZpvd = typeface;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 int)
  (r2v0 int)
  (wrap:android.graphics.Typeface:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null android.graphics.Typeface) : (r3v0 android.graphics.Typeface))
 A[MD:(int, int, android.graphics.Typeface):void (m)] (LINE:137) call: o.oXM.<init>(int, int, android.graphics.Typeface):void type: THIS */
    public /* synthetic */ oXM(int i, int i2, android.graphics.Typeface typeface, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, (i3 & 4) != 0 ? null : typeface);
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oXM.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final oXM OLrzqt() {
            return oXM.KWHzl;
        }
    }
}
