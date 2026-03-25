package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pxR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C39706pxR {
    public final C39711pxW AEQbTJ;
    public final C39711pxW EZpvd;
    public final C39711pxW KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C39706pxR copy$default(C39706pxR c39706pxR, C39711pxW c39711pxW, C39711pxW c39711pxW2, C39711pxW c39711pxW3, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            c39711pxW = c39706pxR.EZpvd;
        }
        if ((i & 2) != 0) {
            c39711pxW2 = c39706pxR.KWHzl;
        }
        C39711pxW c39711pxW4 = c39711pxW2;
        if ((i & 4) != 0) {
            c39711pxW3 = c39706pxR.AEQbTJ;
        }
        C39711pxW c39711pxW5 = c39711pxW3;
        if ((i & 8) != 0) {
            str = c39706pxR.OLrzqt;
        }
        java.lang.String str3 = str;
        if ((i & 16) != 0) {
            str2 = c39706pxR.copydefault;
        }
        return c39706pxR.copydefault(c39711pxW, c39711pxW4, c39711pxW5, str3, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C39711pxW AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C39711pxW EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C39711pxW OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C39706pxR copydefault(@NotNull C39711pxW c39711pxW, @NotNull C39711pxW c39711pxW2, @NotNull C39711pxW c39711pxW3, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(c39711pxW, "");
        Intrinsics.checkNotNullParameter(c39711pxW2, "");
        Intrinsics.checkNotNullParameter(c39711pxW3, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new C39706pxR(c39711pxW, c39711pxW2, c39711pxW3, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39706pxR)) {
            return false;
        }
        C39706pxR c39706pxR = (C39706pxR) obj;
        return Intrinsics.EZpvd(this.EZpvd, c39706pxR.EZpvd) && Intrinsics.EZpvd(this.KWHzl, c39706pxR.KWHzl) && Intrinsics.EZpvd(this.AEQbTJ, c39706pxR.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c39706pxR.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c39706pxR.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.EZpvd.hashCode() * 31) + this.KWHzl.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "LockProgressDashTable(unlockInfo=" + this.EZpvd + ", lockedInfo=" + this.KWHzl + ", untrackedInfo=" + this.AEQbTJ + ", note=" + this.OLrzqt + ", dataSourceInfo=" + this.copydefault + ")";
    }

    public C39706pxR(@NotNull C39711pxW c39711pxW, @NotNull C39711pxW c39711pxW2, @NotNull C39711pxW c39711pxW3, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(c39711pxW, "");
        Intrinsics.checkNotNullParameter(c39711pxW2, "");
        Intrinsics.checkNotNullParameter(c39711pxW3, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.EZpvd = c39711pxW;
        this.KWHzl = c39711pxW2;
        this.AEQbTJ = c39711pxW3;
        this.OLrzqt = str;
        this.copydefault = str2;
    }
}
