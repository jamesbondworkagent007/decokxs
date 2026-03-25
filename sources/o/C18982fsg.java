package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fsg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18982fsg {
    public final java.lang.String AEQbTJ;
    public final C18988fsm copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C18982fsg copy$default(C18982fsg c18982fsg, C18988fsm c18988fsm, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            c18988fsm = c18982fsg.copydefault;
        }
        if ((i & 2) != 0) {
            str = c18982fsg.AEQbTJ;
        }
        return c18982fsg.EZpvd(c18988fsm, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C18982fsg EZpvd(@NotNull C18988fsm c18988fsm, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(c18988fsm, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new C18982fsg(c18988fsm, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C18988fsm copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18982fsg)) {
            return false;
        }
        C18982fsg c18982fsg = (C18982fsg) obj;
        return Intrinsics.EZpvd(this.copydefault, c18982fsg.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c18982fsg.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.copydefault.hashCode() * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ResultSearchUiModel(data=" + this.copydefault + ", keyword=" + this.AEQbTJ + ")";
    }

    public C18982fsg(@NotNull C18988fsm c18988fsm, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(c18988fsm, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = c18988fsm;
        this.AEQbTJ = str;
    }
}
