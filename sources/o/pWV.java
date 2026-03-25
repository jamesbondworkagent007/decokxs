package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class pWV {
    public final Function1<android.content.Context, Unit> AEQbTJ;
    public final int EZpvd;
    public final java.lang.String OLrzqt;
    public final int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.pWV */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ pWV copy$default(pWV pwv, java.lang.String str, int i, int i2, Function1 function1, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            str = pwv.OLrzqt;
        }
        if ((i3 & 2) != 0) {
            i = pwv.copydefault;
        }
        if ((i3 & 4) != 0) {
            i2 = pwv.EZpvd;
        }
        if ((i3 & 8) != 0) {
            function1 = pwv.AEQbTJ;
        }
        return pwv.copydefault(str, i, i2, function1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function1<android.content.Context, Unit> copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final pWV copydefault(@NotNull java.lang.String str, int i, int i2, @NotNull Function1<? super android.content.Context, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        return new pWV(str, i, i2, function1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pWV)) {
            return false;
        }
        pWV pwv = (pWV) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) pwv.OLrzqt) && this.copydefault == pwv.copydefault && this.EZpvd == pwv.EZpvd && Intrinsics.EZpvd(this.AEQbTJ, pwv.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.OLrzqt.hashCode() * 31) + java.lang.Integer.hashCode(this.copydefault)) * 31) + java.lang.Integer.hashCode(this.EZpvd)) * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "DebugItem(title=" + this.OLrzqt + ", priority=" + this.copydefault + ", style=" + this.EZpvd + ", action=" + this.AEQbTJ + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function1<? super android.content.Context, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public pWV(@NotNull java.lang.String str, int i, int i2, @NotNull Function1<? super android.content.Context, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.OLrzqt = str;
        this.copydefault = i;
        this.EZpvd = i2;
        this.AEQbTJ = function1;
    }
}
