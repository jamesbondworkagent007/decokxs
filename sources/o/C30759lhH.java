package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lhH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C30759lhH {
    public final android.widget.ImageView AEQbTJ;
    public final android.widget.ImageView EZpvd;
    public final android.widget.TextView KWHzl;
    public final C55258xgZ OLrzqt;
    public final C55258xgZ copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C30759lhH copy$default(C30759lhH c30759lhH, C55258xgZ c55258xgZ, android.widget.TextView textView, C55258xgZ c55258xgZ2, android.widget.ImageView imageView, android.widget.ImageView imageView2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            c55258xgZ = c30759lhH.copydefault;
        }
        if ((i & 2) != 0) {
            textView = c30759lhH.KWHzl;
        }
        android.widget.TextView textView2 = textView;
        if ((i & 4) != 0) {
            c55258xgZ2 = c30759lhH.OLrzqt;
        }
        C55258xgZ c55258xgZ3 = c55258xgZ2;
        if ((i & 8) != 0) {
            imageView = c30759lhH.EZpvd;
        }
        android.widget.ImageView imageView3 = imageView;
        if ((i & 16) != 0) {
            imageView2 = c30759lhH.AEQbTJ;
        }
        return c30759lhH.EZpvd(c55258xgZ, textView2, c55258xgZ3, imageView3, imageView2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.widget.ImageView AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C30759lhH EZpvd(@NotNull C55258xgZ c55258xgZ, @NotNull android.widget.TextView textView, @NotNull C55258xgZ c55258xgZ2, @NotNull android.widget.ImageView imageView, @NotNull android.widget.ImageView imageView2) {
        Intrinsics.checkNotNullParameter(c55258xgZ, "");
        Intrinsics.checkNotNullParameter(textView, "");
        Intrinsics.checkNotNullParameter(c55258xgZ2, "");
        Intrinsics.checkNotNullParameter(imageView, "");
        Intrinsics.checkNotNullParameter(imageView2, "");
        return new C30759lhH(c55258xgZ, textView, c55258xgZ2, imageView, imageView2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C55258xgZ EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C55258xgZ KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.widget.TextView OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.widget.ImageView copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30759lhH)) {
            return false;
        }
        C30759lhH c30759lhH = (C30759lhH) obj;
        return Intrinsics.EZpvd(this.copydefault, c30759lhH.copydefault) && Intrinsics.EZpvd(this.KWHzl, c30759lhH.KWHzl) && Intrinsics.EZpvd(this.OLrzqt, c30759lhH.OLrzqt) && Intrinsics.EZpvd(this.EZpvd, c30759lhH.EZpvd) && Intrinsics.EZpvd(this.AEQbTJ, c30759lhH.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.copydefault.hashCode() * 31) + this.KWHzl.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "UIOrderInfo(label=" + this.copydefault + ", value=" + this.KWHzl + ", valueEst=" + this.OLrzqt + ", iconStart=" + this.EZpvd + ", iconEnd=" + this.AEQbTJ + ")";
    }

    public C30759lhH(@NotNull C55258xgZ c55258xgZ, @NotNull android.widget.TextView textView, @NotNull C55258xgZ c55258xgZ2, @NotNull android.widget.ImageView imageView, @NotNull android.widget.ImageView imageView2) {
        Intrinsics.checkNotNullParameter(c55258xgZ, "");
        Intrinsics.checkNotNullParameter(textView, "");
        Intrinsics.checkNotNullParameter(c55258xgZ2, "");
        Intrinsics.checkNotNullParameter(imageView, "");
        Intrinsics.checkNotNullParameter(imageView2, "");
        this.copydefault = c55258xgZ;
        this.KWHzl = textView;
        this.OLrzqt = c55258xgZ2;
        this.EZpvd = imageView;
        this.AEQbTJ = imageView2;
    }
}
