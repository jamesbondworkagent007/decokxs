package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kxP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29635kxP {
    public final java.lang.String AEQbTJ;
    public final android.graphics.drawable.Drawable EZpvd;
    public final boolean KWHzl;
    public final java.lang.Integer OLrzqt;
    public final java.lang.String copydefault;
    public final java.lang.String valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C29635kxP copy$default(C29635kxP c29635kxP, java.lang.String str, android.graphics.drawable.Drawable drawable, java.lang.String str2, java.lang.Integer num, boolean z, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c29635kxP.AEQbTJ;
        }
        if ((i & 2) != 0) {
            drawable = c29635kxP.EZpvd;
        }
        android.graphics.drawable.Drawable drawable2 = drawable;
        if ((i & 4) != 0) {
            str2 = c29635kxP.copydefault;
        }
        java.lang.String str4 = str2;
        if ((i & 8) != 0) {
            num = c29635kxP.OLrzqt;
        }
        java.lang.Integer num2 = num;
        if ((i & 16) != 0) {
            z = c29635kxP.KWHzl;
        }
        boolean z2 = z;
        if ((i & 32) != 0) {
            str3 = c29635kxP.valueOf;
        }
        return c29635kxP.OLrzqt(str, drawable2, str4, num2, z2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C29635kxP OLrzqt(@NotNull java.lang.String str, android.graphics.drawable.Drawable drawable, @NotNull java.lang.String str2, @androidx.annotation.DrawableRes java.lang.Integer num, boolean z, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new C29635kxP(str, drawable, str2, num, z, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.graphics.drawable.Drawable copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29635kxP)) {
            return false;
        }
        C29635kxP c29635kxP = (C29635kxP) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c29635kxP.AEQbTJ) && Intrinsics.EZpvd(this.EZpvd, c29635kxP.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c29635kxP.copydefault) && Intrinsics.EZpvd(this.OLrzqt, c29635kxP.OLrzqt) && this.KWHzl == c29635kxP.KWHzl && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) c29635kxP.valueOf);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.AEQbTJ.hashCode();
        android.graphics.drawable.Drawable drawable = this.EZpvd;
        int iHashCode2 = drawable == null ? 0 : drawable.hashCode();
        int iHashCode3 = this.copydefault.hashCode();
        java.lang.Integer num = this.OLrzqt;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (num != null ? num.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.KWHzl)) * 31) + this.valueOf.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SignalSelection(title=" + this.AEQbTJ + ", icon=" + this.EZpvd + ", iconUrl=" + this.copydefault + ", iconPlaceholder=" + this.OLrzqt + ", selected=" + this.KWHzl + ", value=" + this.valueOf + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String valueOf() {
        return this.valueOf;
    }

    public C29635kxP(@NotNull java.lang.String str, android.graphics.drawable.Drawable drawable, @NotNull java.lang.String str2, @androidx.annotation.DrawableRes java.lang.Integer num, boolean z, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.AEQbTJ = str;
        this.EZpvd = drawable;
        this.copydefault = str2;
        this.OLrzqt = num;
        this.KWHzl = z;
        this.valueOf = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0023: CONSTRUCTOR 
  (r10v0 java.lang.String)
  (wrap:android.graphics.drawable.Drawable:?: TERNARY null = ((wrap:int:0x0000: ARITH (r16v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.graphics.drawable.Drawable) : (r11v0 android.graphics.drawable.Drawable))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r16v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0011: ARITH (r16v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r13v0 java.lang.Integer))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0018: ARITH (r16v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r14v0 boolean))
  (r15v0 java.lang.String)
 A[MD:(java.lang.String, android.graphics.drawable.Drawable, java.lang.String, java.lang.Integer, boolean, java.lang.String):void (m)] (LINE:19) call: o.kxP.<init>(java.lang.String, android.graphics.drawable.Drawable, java.lang.String, java.lang.Integer, boolean, java.lang.String):void type: THIS */
    public /* synthetic */ C29635kxP(java.lang.String str, android.graphics.drawable.Drawable drawable, java.lang.String str2, java.lang.Integer num, boolean z, java.lang.String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : drawable, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? null : num, (i & 16) != 0 ? false : z, str3);
    }
}
