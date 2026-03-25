package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class wVQ {
    public final java.lang.String AEQbTJ;
    public final boolean KWHzl;
    public final boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ wVQ copy$default(wVQ wvq, java.lang.String str, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = wvq.AEQbTJ;
        }
        if ((i & 2) != 0) {
            z = wvq.KWHzl;
        }
        if ((i & 4) != 0) {
            z2 = wvq.copydefault;
        }
        return wvq.copydefault(str, z, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final wVQ copydefault(@NotNull java.lang.String str, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        return new wVQ(str, z, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wVQ)) {
            return false;
        }
        wVQ wvq = (wVQ) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) wvq.AEQbTJ) && this.KWHzl == wvq.KWHzl && this.copydefault == wvq.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.AEQbTJ.hashCode() * 31) + java.lang.Boolean.hashCode(this.KWHzl)) * 31) + java.lang.Boolean.hashCode(this.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "Chip(text=" + this.AEQbTJ + ", selected=" + this.KWHzl + ", enabled=" + this.copydefault + ")";
    }

    public wVQ(@NotNull java.lang.String str, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = str;
        this.KWHzl = z;
        this.copydefault = z2;
    }
}
