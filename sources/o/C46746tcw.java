package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import o.C52761wXj;

/* JADX INFO: renamed from: o.tcw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46746tcw {
    public final float AEQbTJ;
    public final int EZpvd;
    public final android.graphics.drawable.Drawable KWHzl;
    public final android.graphics.drawable.Drawable OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C46746tcw() {
        this(null, null, 0.0f, 0, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C46746tcw copy$default(C46746tcw c46746tcw, android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, float f, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            drawable = c46746tcw.KWHzl;
        }
        if ((i2 & 2) != 0) {
            drawable2 = c46746tcw.OLrzqt;
        }
        if ((i2 & 4) != 0) {
            f = c46746tcw.AEQbTJ;
        }
        if ((i2 & 8) != 0) {
            i = c46746tcw.EZpvd;
        }
        return c46746tcw.KWHzl(drawable, drawable2, f, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.graphics.drawable.Drawable EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.graphics.drawable.Drawable KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C46746tcw KWHzl(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, float f, int i) {
        return new C46746tcw(drawable, drawable2, f, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C46746tcw)) {
            return false;
        }
        C46746tcw c46746tcw = (C46746tcw) obj;
        return Intrinsics.EZpvd(this.KWHzl, c46746tcw.KWHzl) && Intrinsics.EZpvd(this.OLrzqt, c46746tcw.OLrzqt) && java.lang.Float.compare(this.AEQbTJ, c46746tcw.AEQbTJ) == 0 && this.EZpvd == c46746tcw.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        android.graphics.drawable.Drawable drawable = this.KWHzl;
        int iHashCode = drawable == null ? 0 : drawable.hashCode();
        android.graphics.drawable.Drawable drawable2 = this.OLrzqt;
        return (((((iHashCode * 31) + (drawable2 != null ? drawable2.hashCode() : 0)) * 31) + java.lang.Float.hashCode(this.AEQbTJ)) * 31) + java.lang.Integer.hashCode(this.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ImageBorderConfig(defaultRes=" + this.KWHzl + ", placeHolder=" + this.OLrzqt + ", borderWidth=" + this.AEQbTJ + ", borderColor=" + this.EZpvd + ")";
    }

    public C46746tcw(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, float f, int i) {
        this.KWHzl = drawable;
        this.OLrzqt = drawable2;
        this.AEQbTJ = f;
        this.EZpvd = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001f: CONSTRUCTOR 
  (wrap:android.graphics.drawable.Drawable:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:android.graphics.drawable.Drawable:0x0006: INVOKE (wrap:int:0x0004: SGET  A[WRAPPED] o.wXj.TaskDescription.dzCpvv int) STATIC call: o.mpX.KWHzl(int):android.graphics.drawable.Drawable A[MD:(int):android.graphics.drawable.Drawable (m), WRAPPED] (LINE:57)) : (r1v0 android.graphics.drawable.Drawable))
  (wrap:android.graphics.drawable.Drawable:?: TERNARY null = ((wrap:int:0x000a: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.graphics.drawable.Drawable) : (r2v0 android.graphics.drawable.Drawable))
  (wrap:float:?: TERNARY null = ((wrap:int:0x000f: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0.5f float) : (r3v0 float))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0015: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x001b: INVOKE (wrap:int:0x0019: SGET  A[WRAPPED] o.mPz.ActionBar.fJNWhG int) STATIC call: o.mpX.copydefault(int):int A[MD:(int):int (m), WRAPPED] (LINE:60)) : (r4v0 int))
 A[MD:(android.graphics.drawable.Drawable, android.graphics.drawable.Drawable, float, int):void (m)] (LINE:56) call: o.tcw.<init>(android.graphics.drawable.Drawable, android.graphics.drawable.Drawable, float, int):void type: THIS */
    public /* synthetic */ C46746tcw(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, float f, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? C33070mpX.KWHzl(C52761wXj.TaskDescription.dzCpvv) : drawable, (i2 & 2) != 0 ? null : drawable2, (i2 & 4) != 0 ? 0.5f : f, (i2 & 8) != 0 ? C33070mpX.copydefault(C32113mPz.ActionBar.fJNWhG) : i);
    }
}
