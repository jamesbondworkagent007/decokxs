package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import o.C52761wXj;

/* JADX INFO: renamed from: o.uzi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C50030uzi {
    public final float AEQbTJ;
    public final android.graphics.drawable.Drawable EZpvd;
    public final int OLrzqt;
    public final android.graphics.drawable.Drawable copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C50030uzi() {
        this(null, null, 0.0f, 0, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C50030uzi copy$default(C50030uzi c50030uzi, android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, float f, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            drawable = c50030uzi.copydefault;
        }
        if ((i2 & 2) != 0) {
            drawable2 = c50030uzi.EZpvd;
        }
        if ((i2 & 4) != 0) {
            f = c50030uzi.AEQbTJ;
        }
        if ((i2 & 8) != 0) {
            i = c50030uzi.OLrzqt;
        }
        return c50030uzi.KWHzl(drawable, drawable2, f, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.graphics.drawable.Drawable KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C50030uzi KWHzl(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, float f, int i) {
        return new C50030uzi(drawable, drawable2, f, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.graphics.drawable.Drawable copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C50030uzi)) {
            return false;
        }
        C50030uzi c50030uzi = (C50030uzi) obj;
        return Intrinsics.EZpvd(this.copydefault, c50030uzi.copydefault) && Intrinsics.EZpvd(this.EZpvd, c50030uzi.EZpvd) && java.lang.Float.compare(this.AEQbTJ, c50030uzi.AEQbTJ) == 0 && this.OLrzqt == c50030uzi.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        android.graphics.drawable.Drawable drawable = this.copydefault;
        int iHashCode = drawable == null ? 0 : drawable.hashCode();
        android.graphics.drawable.Drawable drawable2 = this.EZpvd;
        return (((((iHashCode * 31) + (drawable2 != null ? drawable2.hashCode() : 0)) * 31) + java.lang.Float.hashCode(this.AEQbTJ)) * 31) + java.lang.Integer.hashCode(this.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ImageBorderConfig(defaultRes=" + this.copydefault + ", placeHolder=" + this.EZpvd + ", borderWidth=" + this.AEQbTJ + ", borderColor=" + this.OLrzqt + ")";
    }

    public C50030uzi(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, float f, int i) {
        this.copydefault = drawable;
        this.EZpvd = drawable2;
        this.AEQbTJ = f;
        this.OLrzqt = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001f: CONSTRUCTOR 
  (wrap:android.graphics.drawable.Drawable:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:android.graphics.drawable.Drawable:0x0006: INVOKE (wrap:int:0x0004: SGET  A[WRAPPED] o.wXj.TaskDescription.dzCpvv int) STATIC call: o.mpX.KWHzl(int):android.graphics.drawable.Drawable A[MD:(int):android.graphics.drawable.Drawable (m), WRAPPED] (LINE:191)) : (r1v0 android.graphics.drawable.Drawable))
  (wrap:android.graphics.drawable.Drawable:?: TERNARY null = ((wrap:int:0x000a: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.graphics.drawable.Drawable) : (r2v0 android.graphics.drawable.Drawable))
  (wrap:float:?: TERNARY null = ((wrap:int:0x000f: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0.5f float) : (r3v0 float))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0015: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x001b: INVOKE (wrap:int:0x0019: SGET  A[WRAPPED] o.mPz.ActionBar.fJNWhG int) STATIC call: o.uzd.EZpvd(int):int A[MD:(int):int (m), WRAPPED] (LINE:194)) : (r4v0 int))
 A[MD:(android.graphics.drawable.Drawable, android.graphics.drawable.Drawable, float, int):void (m)] (LINE:190) call: o.uzi.<init>(android.graphics.drawable.Drawable, android.graphics.drawable.Drawable, float, int):void type: THIS */
    public /* synthetic */ C50030uzi(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, float f, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? C33070mpX.KWHzl(C52761wXj.TaskDescription.dzCpvv) : drawable, (i2 & 2) != 0 ? null : drawable2, (i2 & 4) != 0 ? 0.5f : f, (i2 & 8) != 0 ? C50025uzd.EZpvd(C32113mPz.ActionBar.fJNWhG) : i);
    }
}
