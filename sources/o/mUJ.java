package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import o.C52761wXj;

/* JADX INFO: loaded from: classes18.dex */
public final class mUJ {
    public final android.graphics.drawable.Drawable AEQbTJ;
    public final android.graphics.drawable.Drawable EZpvd;
    public final float KWHzl;
    public final int OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public mUJ() {
        this(null, null, 0.0f, 0, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ mUJ copy$default(mUJ muj, android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, float f, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            drawable = muj.AEQbTJ;
        }
        if ((i2 & 2) != 0) {
            drawable2 = muj.EZpvd;
        }
        if ((i2 & 4) != 0) {
            f = muj.KWHzl;
        }
        if ((i2 & 8) != 0) {
            i = muj.OLrzqt;
        }
        return muj.EZpvd(drawable, drawable2, f, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.graphics.drawable.Drawable AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final mUJ EZpvd(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, float f, int i) {
        return new mUJ(drawable, drawable2, f, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float OLrzqt() {
        return this.KWHzl;
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
        if (!(obj instanceof mUJ)) {
            return false;
        }
        mUJ muj = (mUJ) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, muj.AEQbTJ) && Intrinsics.EZpvd(this.EZpvd, muj.EZpvd) && java.lang.Float.compare(this.KWHzl, muj.KWHzl) == 0 && this.OLrzqt == muj.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        android.graphics.drawable.Drawable drawable = this.AEQbTJ;
        int iHashCode = drawable == null ? 0 : drawable.hashCode();
        android.graphics.drawable.Drawable drawable2 = this.EZpvd;
        return (((((iHashCode * 31) + (drawable2 != null ? drawable2.hashCode() : 0)) * 31) + java.lang.Float.hashCode(this.KWHzl)) * 31) + java.lang.Integer.hashCode(this.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ImageBorderConfig(defaultRes=" + this.AEQbTJ + ", placeHolder=" + this.EZpvd + ", borderWidth=" + this.KWHzl + ", borderColor=" + this.OLrzqt + ")";
    }

    public mUJ(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, float f, int i) {
        this.AEQbTJ = drawable;
        this.EZpvd = drawable2;
        this.KWHzl = f;
        this.OLrzqt = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001f: CONSTRUCTOR 
  (wrap:android.graphics.drawable.Drawable:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:android.graphics.drawable.Drawable:0x0006: INVOKE (wrap:int:0x0004: SGET  A[WRAPPED] o.wXj.TaskDescription.dzCpvv int) STATIC call: o.mpX.KWHzl(int):android.graphics.drawable.Drawable A[MD:(int):android.graphics.drawable.Drawable (m), WRAPPED] (LINE:108)) : (r1v0 android.graphics.drawable.Drawable))
  (wrap:android.graphics.drawable.Drawable:?: TERNARY null = ((wrap:int:0x000a: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.graphics.drawable.Drawable) : (r2v0 android.graphics.drawable.Drawable))
  (wrap:float:?: TERNARY null = ((wrap:int:0x000f: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0.5f float) : (r3v0 float))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0015: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x001b: INVOKE (wrap:int:0x0019: SGET  A[WRAPPED] o.mPz.ActionBar.fJNWhG int) STATIC call: o.mUM.copydefault(int):int A[MD:(int):int (m), WRAPPED] (LINE:111)) : (r4v0 int))
 A[MD:(android.graphics.drawable.Drawable, android.graphics.drawable.Drawable, float, int):void (m)] (LINE:107) call: o.mUJ.<init>(android.graphics.drawable.Drawable, android.graphics.drawable.Drawable, float, int):void type: THIS */
    public /* synthetic */ mUJ(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, float f, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? C33070mpX.KWHzl(C52761wXj.TaskDescription.dzCpvv) : drawable, (i2 & 2) != 0 ? null : drawable2, (i2 & 4) != 0 ? 0.5f : f, (i2 & 8) != 0 ? mUM.copydefault(C32113mPz.ActionBar.fJNWhG) : i);
    }
}
