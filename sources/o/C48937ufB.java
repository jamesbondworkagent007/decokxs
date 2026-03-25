package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ufB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C48937ufB {
    public final java.lang.CharSequence AEQbTJ;
    public final android.graphics.drawable.Drawable copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C48937ufB copy$default(C48937ufB c48937ufB, android.graphics.drawable.Drawable drawable, java.lang.CharSequence charSequence, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            drawable = c48937ufB.copydefault;
        }
        if ((i & 2) != 0) {
            charSequence = c48937ufB.AEQbTJ;
        }
        return c48937ufB.OLrzqt(drawable, charSequence);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.CharSequence KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C48937ufB OLrzqt(@NotNull android.graphics.drawable.Drawable drawable, @NotNull java.lang.CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(drawable, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        return new C48937ufB(drawable, charSequence);
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
        if (!(obj instanceof C48937ufB)) {
            return false;
        }
        C48937ufB c48937ufB = (C48937ufB) obj;
        return Intrinsics.EZpvd(this.copydefault, c48937ufB.copydefault) && Intrinsics.EZpvd(this.AEQbTJ, c48937ufB.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.copydefault.hashCode() * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "EditEntry(icon=" + this.copydefault + ", label=" + ((java.lang.Object) this.AEQbTJ) + ")";
    }

    public C48937ufB(@NotNull android.graphics.drawable.Drawable drawable, @NotNull java.lang.CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(drawable, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        this.copydefault = drawable;
        this.AEQbTJ = charSequence;
    }
}
