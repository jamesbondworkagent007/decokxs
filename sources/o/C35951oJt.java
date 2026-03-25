package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oJt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35951oJt {
    public final int AEQbTJ;
    public final java.lang.String KWHzl;
    public final int OLrzqt;
    public final int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C35951oJt copy$default(C35951oJt c35951oJt, int i, int i2, int i3, java.lang.String str, int i4, java.lang.Object obj) {
        if ((i4 & 1) != 0) {
            i = c35951oJt.OLrzqt;
        }
        if ((i4 & 2) != 0) {
            i2 = c35951oJt.copydefault;
        }
        if ((i4 & 4) != 0) {
            i3 = c35951oJt.AEQbTJ;
        }
        if ((i4 & 8) != 0) {
            str = c35951oJt.KWHzl;
        }
        return c35951oJt.KWHzl(i, i2, i3, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C35951oJt KWHzl(@androidx.annotation.StringRes int i, @androidx.annotation.DrawableRes int i2, int i3, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new C35951oJt(i, i2, i3, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35951oJt)) {
            return false;
        }
        C35951oJt c35951oJt = (C35951oJt) obj;
        return this.OLrzqt == c35951oJt.OLrzqt && this.copydefault == c35951oJt.copydefault && this.AEQbTJ == c35951oJt.AEQbTJ && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c35951oJt.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((java.lang.Integer.hashCode(this.OLrzqt) * 31) + java.lang.Integer.hashCode(this.copydefault)) * 31) + java.lang.Integer.hashCode(this.AEQbTJ)) * 31) + this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "QuickAction(titleRes=" + this.OLrzqt + ", iconRes=" + this.copydefault + ", action=" + this.AEQbTJ + ", eventTracker=" + this.KWHzl + ")";
    }

    public C35951oJt(@androidx.annotation.StringRes int i, @androidx.annotation.DrawableRes int i2, int i3, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = i;
        this.copydefault = i2;
        this.AEQbTJ = i3;
        this.KWHzl = str;
    }
}
