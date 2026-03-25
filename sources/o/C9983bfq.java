package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bfq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9983bfq {
    public final android.graphics.drawable.Drawable EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C9983bfq copy$default(C9983bfq c9983bfq, android.graphics.drawable.Drawable drawable, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            drawable = c9983bfq.EZpvd;
        }
        if ((i & 2) != 0) {
            str = c9983bfq.copydefault;
        }
        if ((i & 4) != 0) {
            str2 = c9983bfq.KWHzl;
        }
        return c9983bfq.EZpvd(drawable, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C9983bfq EZpvd(android.graphics.drawable.Drawable drawable, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new C9983bfq(drawable, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.copydefault;
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
        if (!(obj instanceof C9983bfq)) {
            return false;
        }
        C9983bfq c9983bfq = (C9983bfq) obj;
        return Intrinsics.EZpvd(this.EZpvd, c9983bfq.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c9983bfq.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c9983bfq.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        android.graphics.drawable.Drawable drawable = this.EZpvd;
        return ((((drawable == null ? 0 : drawable.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ItemData(icon=" + this.EZpvd + ", title=" + this.copydefault + ", content=" + this.KWHzl + ")";
    }

    public C9983bfq(android.graphics.drawable.Drawable drawable, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.EZpvd = drawable;
        this.copydefault = str;
        this.KWHzl = str2;
    }
}
