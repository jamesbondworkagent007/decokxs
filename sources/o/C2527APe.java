package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.growth.PopupNextAction;

/* JADX INFO: renamed from: o.APe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C2527APe {
    public static final int $stable = 8;
    public PopupNextAction AEQbTJ;
    public java.lang.String KWHzl;
    public int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C2527APe copy$default(C2527APe c2527APe, int i, java.lang.String str, PopupNextAction popupNextAction, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = c2527APe.copydefault;
        }
        if ((i2 & 2) != 0) {
            str = c2527APe.KWHzl;
        }
        if ((i2 & 4) != 0) {
            popupNextAction = c2527APe.AEQbTJ;
        }
        return c2527APe.OLrzqt(i, str, popupNextAction);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C2527APe OLrzqt(int i, @NotNull java.lang.String str, @NotNull PopupNextAction popupNextAction) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(popupNextAction, "");
        return new C2527APe(i, str, popupNextAction);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PopupNextAction copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2527APe)) {
            return false;
        }
        C2527APe c2527APe = (C2527APe) obj;
        return this.copydefault == c2527APe.copydefault && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c2527APe.KWHzl) && this.AEQbTJ == c2527APe.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((java.lang.Integer.hashCode(this.copydefault) * 31) + this.KWHzl.hashCode()) * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "PopupResult(popupId=" + this.copydefault + ", triggerKey=" + this.KWHzl + ", nextAction=" + this.AEQbTJ + ")";
    }

    public C2527APe(int i, @NotNull java.lang.String str, @NotNull PopupNextAction popupNextAction) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(popupNextAction, "");
        this.copydefault = i;
        this.KWHzl = str;
        this.AEQbTJ = popupNextAction;
    }
}
