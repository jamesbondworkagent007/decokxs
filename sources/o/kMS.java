package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kMS {
    public final java.lang.String AEQbTJ;
    public final boolean EZpvd;
    public final android.graphics.drawable.Drawable KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.Integer copydefault;
    public final java.lang.Object valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ kMS copy$default(kMS kms, java.lang.String str, android.graphics.drawable.Drawable drawable, java.lang.String str2, java.lang.Integer num, boolean z, java.lang.Object obj, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            str = kms.AEQbTJ;
        }
        if ((i & 2) != 0) {
            drawable = kms.KWHzl;
        }
        android.graphics.drawable.Drawable drawable2 = drawable;
        if ((i & 4) != 0) {
            str2 = kms.OLrzqt;
        }
        java.lang.String str3 = str2;
        if ((i & 8) != 0) {
            num = kms.copydefault;
        }
        java.lang.Integer num2 = num;
        if ((i & 16) != 0) {
            z = kms.EZpvd;
        }
        boolean z2 = z;
        if ((i & 32) != 0) {
            obj = kms.valueOf;
        }
        return kms.AEQbTJ(str, drawable2, str3, num2, z2, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final kMS AEQbTJ(@NotNull java.lang.String str, android.graphics.drawable.Drawable drawable, @NotNull java.lang.String str2, @androidx.annotation.DrawableRes java.lang.Integer num, boolean z, @NotNull java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(obj, "");
        return new kMS(str, drawable, str2, num, z, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Object AYXKKw() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.graphics.drawable.Drawable copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kMS)) {
            return false;
        }
        kMS kms = (kMS) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) kms.AEQbTJ) && Intrinsics.EZpvd(this.KWHzl, kms.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) kms.OLrzqt) && Intrinsics.EZpvd(this.copydefault, kms.copydefault) && this.EZpvd == kms.EZpvd && Intrinsics.EZpvd(this.valueOf, kms.valueOf);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.AEQbTJ.hashCode();
        android.graphics.drawable.Drawable drawable = this.KWHzl;
        int iHashCode2 = drawable == null ? 0 : drawable.hashCode();
        int iHashCode3 = this.OLrzqt.hashCode();
        java.lang.Integer num = this.copydefault;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (num != null ? num.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.EZpvd)) * 31) + this.valueOf.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "DexSelection(title=" + this.AEQbTJ + ", icon=" + this.KWHzl + ", iconUrl=" + this.OLrzqt + ", iconPlaceholder=" + this.copydefault + ", selected=" + this.EZpvd + ", value=" + this.valueOf + ")";
    }

    public kMS(@NotNull java.lang.String str, android.graphics.drawable.Drawable drawable, @NotNull java.lang.String str2, @androidx.annotation.DrawableRes java.lang.Integer num, boolean z, @NotNull java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(obj, "");
        this.AEQbTJ = str;
        this.KWHzl = drawable;
        this.OLrzqt = str2;
        this.copydefault = num;
        this.EZpvd = z;
        this.valueOf = obj;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0023: CONSTRUCTOR 
  (r10v0 java.lang.String)
  (wrap:android.graphics.drawable.Drawable:?: TERNARY null = ((wrap:int:0x0000: ARITH (r16v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.graphics.drawable.Drawable) : (r11v0 android.graphics.drawable.Drawable))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r16v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0011: ARITH (r16v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r13v0 java.lang.Integer))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0018: ARITH (r16v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r14v0 boolean))
  (r15v0 java.lang.Object)
 A[MD:(java.lang.String, android.graphics.drawable.Drawable, java.lang.String, java.lang.Integer, boolean, java.lang.Object):void (m)] (LINE:22) call: o.kMS.<init>(java.lang.String, android.graphics.drawable.Drawable, java.lang.String, java.lang.Integer, boolean, java.lang.Object):void type: THIS */
    public /* synthetic */ kMS(java.lang.String str, android.graphics.drawable.Drawable drawable, java.lang.String str2, java.lang.Integer num, boolean z, java.lang.Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : drawable, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? null : num, (i & 16) != 0 ? false : z, obj);
    }
}
