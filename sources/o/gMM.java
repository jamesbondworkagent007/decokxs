package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class gMM {
    public final Function1<android.app.Activity, Unit> AEQbTJ;
    public final int OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.gMM */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ gMM copy$default(gMM gmm, int i, Function1 function1, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = gmm.OLrzqt;
        }
        if ((i2 & 2) != 0) {
            function1 = gmm.AEQbTJ;
        }
        return gmm.AEQbTJ(i, function1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final gMM AEQbTJ(int i, @NotNull Function1<? super android.app.Activity, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        return new gMM(i, function1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gMM)) {
            return false;
        }
        gMM gmm = (gMM) obj;
        return this.OLrzqt == gmm.OLrzqt && Intrinsics.EZpvd(this.AEQbTJ, gmm.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (java.lang.Integer.hashCode(this.OLrzqt) * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ToastPrimaryAction(buttonTextRes=" + this.OLrzqt + ", onClick=" + this.AEQbTJ + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super android.app.Activity, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public gMM(int i, @NotNull Function1<? super android.app.Activity, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.OLrzqt = i;
        this.AEQbTJ = function1;
    }
}
