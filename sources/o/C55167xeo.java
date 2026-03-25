package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xeo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C55167xeo {
    public static final int copydefault = 8;
    public final int AEQbTJ;
    public final java.lang.CharSequence AhwBna;
    public final java.lang.CharSequence EZpvd;
    public final android.view.View KWHzl;
    public final int OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C55167xeo copy$default(C55167xeo c55167xeo, int i, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, android.view.View view, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = c55167xeo.AEQbTJ;
        }
        if ((i3 & 2) != 0) {
            charSequence = c55167xeo.AhwBna;
        }
        java.lang.CharSequence charSequence3 = charSequence;
        if ((i3 & 4) != 0) {
            charSequence2 = c55167xeo.EZpvd;
        }
        java.lang.CharSequence charSequence4 = charSequence2;
        if ((i3 & 8) != 0) {
            view = c55167xeo.KWHzl;
        }
        android.view.View view2 = view;
        if ((i3 & 16) != 0) {
            i2 = c55167xeo.OLrzqt;
        }
        return c55167xeo.OLrzqt(i, charSequence3, charSequence4, view2, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.CharSequence EZpvd() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.CharSequence OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C55167xeo OLrzqt(@androidx.annotation.DrawableRes int i, @NotNull java.lang.CharSequence charSequence, @NotNull java.lang.CharSequence charSequence2, android.view.View view, @androidx.annotation.LayoutRes int i2) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(charSequence2, "");
        return new C55167xeo(i, charSequence, charSequence2, view, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.view.View copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C55167xeo)) {
            return false;
        }
        C55167xeo c55167xeo = (C55167xeo) obj;
        return this.AEQbTJ == c55167xeo.AEQbTJ && Intrinsics.EZpvd(this.AhwBna, c55167xeo.AhwBna) && Intrinsics.EZpvd(this.EZpvd, c55167xeo.EZpvd) && Intrinsics.EZpvd(this.KWHzl, c55167xeo.KWHzl) && this.OLrzqt == c55167xeo.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = java.lang.Integer.hashCode(this.AEQbTJ);
        int iHashCode2 = this.AhwBna.hashCode();
        int iHashCode3 = this.EZpvd.hashCode();
        android.view.View view = this.KWHzl;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (view == null ? 0 : view.hashCode())) * 31) + java.lang.Integer.hashCode(this.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        int i = this.AEQbTJ;
        java.lang.CharSequence charSequence = this.AhwBna;
        java.lang.CharSequence charSequence2 = this.EZpvd;
        return "OKOutlinedCardData(iconResId=" + i + ", title=" + ((java.lang.Object) charSequence) + ", description=" + ((java.lang.Object) charSequence2) + ", attachingView=" + this.KWHzl + ", attachmentViewId=" + this.OLrzqt + ")";
    }

    public C55167xeo(@androidx.annotation.DrawableRes int i, @NotNull java.lang.CharSequence charSequence, @NotNull java.lang.CharSequence charSequence2, android.view.View view, @androidx.annotation.LayoutRes int i2) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(charSequence2, "");
        this.AEQbTJ = i;
        this.AhwBna = charSequence;
        this.EZpvd = charSequence2;
        this.KWHzl = view;
        this.OLrzqt = i2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0018: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r8v0 int))
  (r9v0 java.lang.CharSequence)
  (r10v0 java.lang.CharSequence)
  (wrap:android.view.View:0x000d: TERNARY null = ((wrap:int:0x0008: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null android.view.View) : (r11v0 android.view.View))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000e: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r12v0 int))
 A[MD:(int, java.lang.CharSequence, java.lang.CharSequence, android.view.View, int):void (m)] (LINE:9) call: o.xeo.<init>(int, java.lang.CharSequence, java.lang.CharSequence, android.view.View, int):void type: THIS */
    public /* synthetic */ C55167xeo(int i, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, android.view.View view, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? -1 : i, charSequence, charSequence2, (i3 & 8) != 0 ? null : view, (i3 & 16) != 0 ? -1 : i2);
    }
}
