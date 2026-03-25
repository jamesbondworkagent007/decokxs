package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class wYO {
    public final int AEQbTJ;
    public final java.lang.CharSequence EZpvd;
    public boolean KWHzl;
    public final boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ wYO copy$default(wYO wyo, java.lang.CharSequence charSequence, int i, boolean z, boolean z2, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            charSequence = wyo.EZpvd;
        }
        if ((i2 & 2) != 0) {
            i = wyo.AEQbTJ;
        }
        if ((i2 & 4) != 0) {
            z = wyo.KWHzl;
        }
        if ((i2 & 8) != 0) {
            z2 = wyo.copydefault;
        }
        return wyo.EZpvd(charSequence, i, z, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.CharSequence EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final wYO EZpvd(@NotNull java.lang.CharSequence charSequence, int i, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        return new wYO(charSequence, i, z, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(boolean z) {
        this.KWHzl = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wYO)) {
            return false;
        }
        wYO wyo = (wYO) obj;
        return Intrinsics.EZpvd(this.EZpvd, wyo.EZpvd) && this.AEQbTJ == wyo.AEQbTJ && this.KWHzl == wyo.KWHzl && this.copydefault == wyo.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.EZpvd.hashCode() * 31) + java.lang.Integer.hashCode(this.AEQbTJ)) * 31) + java.lang.Boolean.hashCode(this.KWHzl)) * 31) + java.lang.Boolean.hashCode(this.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        java.lang.CharSequence charSequence = this.EZpvd;
        return "OKSelectionChipBean(text=" + ((java.lang.Object) charSequence) + ", chipSize=" + this.AEQbTJ + ", selected=" + this.KWHzl + ", enabled=" + this.copydefault + ")";
    }

    public wYO(@NotNull java.lang.CharSequence charSequence, int i, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        this.EZpvd = charSequence;
        this.AEQbTJ = i;
        this.KWHzl = z;
        this.copydefault = z2;
    }
}
