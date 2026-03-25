package o;

import androidx.annotation.GravityInt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oFS {
    public final java.lang.String EZpvd;
    public final Function1<android.content.Context, android.graphics.drawable.Drawable> KWHzl;
    public final java.lang.Integer OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.oFS */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ oFS copy$default(oFS ofs, java.lang.String str, Function1 function1, java.lang.Integer num, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = ofs.EZpvd;
        }
        if ((i & 2) != 0) {
            function1 = ofs.KWHzl;
        }
        if ((i & 4) != 0) {
            num = ofs.OLrzqt;
        }
        return ofs.OLrzqt(str, function1, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final oFS OLrzqt(java.lang.String str, @NotNull Function1<? super android.content.Context, ? extends android.graphics.drawable.Drawable> function1, @GravityInt java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(function1, "");
        return new oFS(str, function1, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function1<android.content.Context, android.graphics.drawable.Drawable> copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oFS)) {
            return false;
        }
        oFS ofs = (oFS) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) ofs.EZpvd) && Intrinsics.EZpvd(this.KWHzl, ofs.KWHzl) && Intrinsics.EZpvd(this.OLrzqt, ofs.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.String str = this.EZpvd;
        int iHashCode = str == null ? 0 : str.hashCode();
        int iHashCode2 = this.KWHzl.hashCode();
        java.lang.Integer num = this.OLrzqt;
        return (((iHashCode * 31) + iHashCode2) * 31) + (num != null ? num.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ToolbarSubtitleModel(text=" + this.EZpvd + ", iconProducer=" + this.KWHzl + ", gravity=" + this.OLrzqt + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super android.content.Context, ? extends android.graphics.drawable.Drawable> */
    /* JADX WARN: Multi-variable type inference failed */
    public oFS(java.lang.String str, @NotNull Function1<? super android.content.Context, ? extends android.graphics.drawable.Drawable> function1, @GravityInt java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.EZpvd = str;
        this.KWHzl = function1;
        this.OLrzqt = num;
    }
}
