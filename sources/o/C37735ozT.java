package o;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.ozT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C37735ozT {
    public final java.lang.CharSequence AEQbTJ;
    public final android.graphics.drawable.Drawable KWHzl;
    public final int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C37735ozT copy$default(C37735ozT c37735ozT, int i, android.graphics.drawable.Drawable drawable, java.lang.CharSequence charSequence, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = c37735ozT.copydefault;
        }
        if ((i2 & 2) != 0) {
            drawable = c37735ozT.KWHzl;
        }
        if ((i2 & 4) != 0) {
            charSequence = c37735ozT.AEQbTJ;
        }
        return c37735ozT.EZpvd(i, drawable, charSequence);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.graphics.drawable.Drawable EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C37735ozT EZpvd(int i, android.graphics.drawable.Drawable drawable, java.lang.CharSequence charSequence) {
        return new C37735ozT(i, drawable, charSequence);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.CharSequence OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37735ozT)) {
            return false;
        }
        C37735ozT c37735ozT = (C37735ozT) obj;
        return this.copydefault == c37735ozT.copydefault && Intrinsics.EZpvd(this.KWHzl, c37735ozT.KWHzl) && Intrinsics.EZpvd(this.AEQbTJ, c37735ozT.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = java.lang.Integer.hashCode(this.copydefault);
        android.graphics.drawable.Drawable drawable = this.KWHzl;
        int iHashCode2 = drawable == null ? 0 : drawable.hashCode();
        java.lang.CharSequence charSequence = this.AEQbTJ;
        return (((iHashCode * 31) + iHashCode2) * 31) + (charSequence != null ? charSequence.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "EmptyEntry(id=" + this.copydefault + ", icon=" + this.KWHzl + ", title=" + ((java.lang.Object) this.AEQbTJ) + ")";
    }

    public C37735ozT(int i, android.graphics.drawable.Drawable drawable, java.lang.CharSequence charSequence) {
        this.copydefault = i;
        this.KWHzl = drawable;
        this.AEQbTJ = charSequence;
    }
}
