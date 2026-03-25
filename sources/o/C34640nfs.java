package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nfs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C34640nfs {
    public final android.graphics.drawable.Drawable AEQbTJ;
    public final java.lang.Object AYXKKw;
    public final java.lang.String EZpvd;
    public final java.lang.Integer KWHzl;
    public final java.lang.String OLrzqt;
    public final boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C34640nfs copy$default(C34640nfs c34640nfs, java.lang.String str, android.graphics.drawable.Drawable drawable, java.lang.String str2, java.lang.Integer num, boolean z, java.lang.Object obj, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            str = c34640nfs.OLrzqt;
        }
        if ((i & 2) != 0) {
            drawable = c34640nfs.AEQbTJ;
        }
        android.graphics.drawable.Drawable drawable2 = drawable;
        if ((i & 4) != 0) {
            str2 = c34640nfs.EZpvd;
        }
        java.lang.String str3 = str2;
        if ((i & 8) != 0) {
            num = c34640nfs.KWHzl;
        }
        java.lang.Integer num2 = num;
        if ((i & 16) != 0) {
            z = c34640nfs.copydefault;
        }
        boolean z2 = z;
        if ((i & 32) != 0) {
            obj = c34640nfs.AYXKKw;
        }
        return c34640nfs.copydefault(str, drawable2, str3, num2, z2, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.graphics.drawable.Drawable OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C34640nfs copydefault(@NotNull java.lang.String str, android.graphics.drawable.Drawable drawable, @NotNull java.lang.String str2, @androidx.annotation.DrawableRes java.lang.Integer num, boolean z, @NotNull java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(obj, "");
        return new C34640nfs(str, drawable, str2, num, z, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34640nfs)) {
            return false;
        }
        C34640nfs c34640nfs = (C34640nfs) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c34640nfs.OLrzqt) && Intrinsics.EZpvd(this.AEQbTJ, c34640nfs.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c34640nfs.EZpvd) && Intrinsics.EZpvd(this.KWHzl, c34640nfs.KWHzl) && this.copydefault == c34640nfs.copydefault && Intrinsics.EZpvd(this.AYXKKw, c34640nfs.AYXKKw);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Object gEmmrt() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.OLrzqt.hashCode();
        android.graphics.drawable.Drawable drawable = this.AEQbTJ;
        int iHashCode2 = drawable == null ? 0 : drawable.hashCode();
        int iHashCode3 = this.EZpvd.hashCode();
        java.lang.Integer num = this.KWHzl;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (num != null ? num.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.copydefault)) * 31) + this.AYXKKw.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "DexSelection(title=" + this.OLrzqt + ", icon=" + this.AEQbTJ + ", iconUrl=" + this.EZpvd + ", iconPlaceholder=" + this.KWHzl + ", selected=" + this.copydefault + ", value=" + this.AYXKKw + ")";
    }

    public C34640nfs(@NotNull java.lang.String str, android.graphics.drawable.Drawable drawable, @NotNull java.lang.String str2, @androidx.annotation.DrawableRes java.lang.Integer num, boolean z, @NotNull java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(obj, "");
        this.OLrzqt = str;
        this.AEQbTJ = drawable;
        this.EZpvd = str2;
        this.KWHzl = num;
        this.copydefault = z;
        this.AYXKKw = obj;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0023: CONSTRUCTOR 
  (r10v0 java.lang.String)
  (wrap:android.graphics.drawable.Drawable:?: TERNARY null = ((wrap:int:0x0000: ARITH (r16v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.graphics.drawable.Drawable) : (r11v0 android.graphics.drawable.Drawable))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r16v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0011: ARITH (r16v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r13v0 java.lang.Integer))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0018: ARITH (r16v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r14v0 boolean))
  (r15v0 java.lang.Object)
 A[MD:(java.lang.String, android.graphics.drawable.Drawable, java.lang.String, java.lang.Integer, boolean, java.lang.Object):void (m)] (LINE:23) call: o.nfs.<init>(java.lang.String, android.graphics.drawable.Drawable, java.lang.String, java.lang.Integer, boolean, java.lang.Object):void type: THIS */
    public /* synthetic */ C34640nfs(java.lang.String str, android.graphics.drawable.Drawable drawable, java.lang.String str2, java.lang.Integer num, boolean z, java.lang.Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : drawable, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? null : num, (i & 16) != 0 ? false : z, obj);
    }
}
