package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import o.C52761wXj;

/* JADX INFO: renamed from: o.ivi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25385ivi {
    public final android.graphics.drawable.Drawable AEQbTJ;
    public final int EZpvd;
    public final float OLrzqt;
    public final android.graphics.drawable.Drawable copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C25385ivi() {
        this(null, null, 0.0f, 0, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C25385ivi copy$default(C25385ivi c25385ivi, android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, float f, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            drawable = c25385ivi.copydefault;
        }
        if ((i2 & 2) != 0) {
            drawable2 = c25385ivi.AEQbTJ;
        }
        if ((i2 & 4) != 0) {
            f = c25385ivi.OLrzqt;
        }
        if ((i2 & 8) != 0) {
            i = c25385ivi.EZpvd;
        }
        return c25385ivi.EZpvd(drawable, drawable2, f, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.graphics.drawable.Drawable EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C25385ivi EZpvd(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, float f, int i) {
        return new C25385ivi(drawable, drawable2, f, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.graphics.drawable.Drawable copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25385ivi)) {
            return false;
        }
        C25385ivi c25385ivi = (C25385ivi) obj;
        return Intrinsics.EZpvd(this.copydefault, c25385ivi.copydefault) && Intrinsics.EZpvd(this.AEQbTJ, c25385ivi.AEQbTJ) && java.lang.Float.compare(this.OLrzqt, c25385ivi.OLrzqt) == 0 && this.EZpvd == c25385ivi.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        android.graphics.drawable.Drawable drawable = this.copydefault;
        int iHashCode = drawable == null ? 0 : drawable.hashCode();
        android.graphics.drawable.Drawable drawable2 = this.AEQbTJ;
        return (((((iHashCode * 31) + (drawable2 != null ? drawable2.hashCode() : 0)) * 31) + java.lang.Float.hashCode(this.OLrzqt)) * 31) + java.lang.Integer.hashCode(this.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ImageBorderConfig(defaultRes=" + this.copydefault + ", placeHolder=" + this.AEQbTJ + ", borderWidth=" + this.OLrzqt + ", borderColor=" + this.EZpvd + ")";
    }

    public C25385ivi(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, float f, int i) {
        this.copydefault = drawable;
        this.AEQbTJ = drawable2;
        this.OLrzqt = f;
        this.EZpvd = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001f: CONSTRUCTOR 
  (wrap:android.graphics.drawable.Drawable:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:android.graphics.drawable.Drawable:0x0006: INVOKE (wrap:int:0x0004: SGET  A[WRAPPED] o.wXj.TaskDescription.dzCpvv int) STATIC call: o.mpX.KWHzl(int):android.graphics.drawable.Drawable A[MD:(int):android.graphics.drawable.Drawable (m), WRAPPED] (LINE:273)) : (r1v0 android.graphics.drawable.Drawable))
  (wrap:android.graphics.drawable.Drawable:?: TERNARY null = ((wrap:int:0x000a: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.graphics.drawable.Drawable) : (r2v0 android.graphics.drawable.Drawable))
  (wrap:float:?: TERNARY null = ((wrap:int:0x000f: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0.5f float) : (r3v0 float))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0015: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x001b: INVOKE (wrap:int:0x0019: SGET  A[WRAPPED] o.mPz.ActionBar.fJNWhG int) STATIC call: o.ivf.KWHzl(int):int A[MD:(int):int (m), WRAPPED] (LINE:276)) : (r4v0 int))
 A[MD:(android.graphics.drawable.Drawable, android.graphics.drawable.Drawable, float, int):void (m)] (LINE:272) call: o.ivi.<init>(android.graphics.drawable.Drawable, android.graphics.drawable.Drawable, float, int):void type: THIS */
    public /* synthetic */ C25385ivi(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, float f, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? C33070mpX.KWHzl(C52761wXj.TaskDescription.dzCpvv) : drawable, (i2 & 2) != 0 ? null : drawable2, (i2 & 4) != 0 ? 0.5f : f, (i2 & 8) != 0 ? C25382ivf.KWHzl(C32113mPz.ActionBar.fJNWhG) : i);
    }
}
