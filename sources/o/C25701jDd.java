package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jDd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25701jDd {
    public final boolean EZpvd;
    public final android.text.Spannable OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C25701jDd copy$default(C25701jDd c25701jDd, boolean z, android.text.Spannable spannable, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = c25701jDd.EZpvd;
        }
        if ((i & 2) != 0) {
            spannable = c25701jDd.OLrzqt;
        }
        return c25701jDd.OLrzqt(z, spannable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C25701jDd OLrzqt(boolean z, @NotNull android.text.Spannable spannable) {
        Intrinsics.checkNotNullParameter(spannable, "");
        return new C25701jDd(z, spannable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.text.Spannable copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25701jDd)) {
            return false;
        }
        C25701jDd c25701jDd = (C25701jDd) obj;
        return this.EZpvd == c25701jDd.EZpvd && Intrinsics.EZpvd(this.OLrzqt, c25701jDd.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (java.lang.Boolean.hashCode(this.EZpvd) * 31) + this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "LeaderBoardDisplayChip(isDisplayToken=" + this.EZpvd + ", displayText=" + ((java.lang.Object) this.OLrzqt) + ")";
    }

    public C25701jDd(boolean z, @NotNull android.text.Spannable spannable) {
        Intrinsics.checkNotNullParameter(spannable, "");
        this.EZpvd = z;
        this.OLrzqt = spannable;
    }
}
