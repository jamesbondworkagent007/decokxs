package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.piY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C38920piY {
    public java.lang.String AEQbTJ;
    public java.lang.String KWHzl;
    public int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C38920piY copy$default(C38920piY c38920piY, int i, java.lang.String str, java.lang.String str2, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = c38920piY.copydefault;
        }
        if ((i2 & 2) != 0) {
            str = c38920piY.KWHzl;
        }
        if ((i2 & 4) != 0) {
            str2 = c38920piY.AEQbTJ;
        }
        return c38920piY.copydefault(i, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C38920piY copydefault(int i, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new C38920piY(i, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38920piY)) {
            return false;
        }
        C38920piY c38920piY = (C38920piY) obj;
        return this.copydefault == c38920piY.copydefault && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c38920piY.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c38920piY.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((java.lang.Integer.hashCode(this.copydefault) * 31) + this.KWHzl.hashCode()) * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "Resource(image=" + this.copydefault + ", text=" + this.KWHzl + ", url=" + this.AEQbTJ + ")";
    }

    public C38920piY(int i, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.copydefault = i;
        this.KWHzl = str;
        this.AEQbTJ = str2;
    }
}
