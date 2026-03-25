package o;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.ooS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C37151ooS {
    public final android.graphics.drawable.Drawable KWHzl;
    public final java.lang.CharSequence copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C37151ooS copy$default(C37151ooS c37151ooS, java.lang.CharSequence charSequence, android.graphics.drawable.Drawable drawable, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            charSequence = c37151ooS.copydefault;
        }
        if ((i & 2) != 0) {
            drawable = c37151ooS.KWHzl;
        }
        return c37151ooS.OLrzqt(charSequence, drawable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.graphics.drawable.Drawable EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.CharSequence OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C37151ooS OLrzqt(java.lang.CharSequence charSequence, android.graphics.drawable.Drawable drawable) {
        return new C37151ooS(charSequence, drawable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37151ooS)) {
            return false;
        }
        C37151ooS c37151ooS = (C37151ooS) obj;
        return Intrinsics.EZpvd(this.copydefault, c37151ooS.copydefault) && Intrinsics.EZpvd(this.KWHzl, c37151ooS.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.CharSequence charSequence = this.copydefault;
        int iHashCode = charSequence == null ? 0 : charSequence.hashCode();
        android.graphics.drawable.Drawable drawable = this.KWHzl;
        return (iHashCode * 31) + (drawable != null ? drawable.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        java.lang.CharSequence charSequence = this.copydefault;
        return "OfficialTagUiInfo(label=" + ((java.lang.Object) charSequence) + ", iconDrawable=" + this.KWHzl + ")";
    }

    public C37151ooS(java.lang.CharSequence charSequence, android.graphics.drawable.Drawable drawable) {
        this.copydefault = charSequence;
        this.KWHzl = drawable;
    }
}
