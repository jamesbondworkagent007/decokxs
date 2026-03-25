package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes25.dex */
public final class APG {
    public static final int $stable = 8;
    public java.util.List<java.lang.Integer> AEQbTJ;
    public int EZpvd;
    public int KWHzl;
    public int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.APG */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ APG copy$default(APG apg, java.util.List list, int i, int i2, int i3, int i4, java.lang.Object obj) {
        if ((i4 & 1) != 0) {
            list = apg.AEQbTJ;
        }
        if ((i4 & 2) != 0) {
            i = apg.EZpvd;
        }
        if ((i4 & 4) != 0) {
            i2 = apg.copydefault;
        }
        if ((i4 & 8) != 0) {
            i3 = apg.KWHzl;
        }
        return apg.copydefault(list, i, i2, i3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.Integer> copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final APG copydefault(@NotNull java.util.List<java.lang.Integer> list, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(list, "");
        return new APG(list, i, i2, i3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof APG)) {
            return false;
        }
        APG apg = (APG) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, apg.AEQbTJ) && this.EZpvd == apg.EZpvd && this.copydefault == apg.copydefault && this.KWHzl == apg.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.AEQbTJ.hashCode() * 31) + java.lang.Integer.hashCode(this.EZpvd)) * 31) + java.lang.Integer.hashCode(this.copydefault)) * 31) + java.lang.Integer.hashCode(this.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ShareChannelConfig(channels=" + this.AEQbTJ + ", socialMaxLimit=" + this.EZpvd + ", internalMaxLimit=" + this.copydefault + ", functionMaxLimit=" + this.KWHzl + ")";
    }

    public APG(@NotNull java.util.List<java.lang.Integer> list, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(list, "");
        this.AEQbTJ = list;
        this.EZpvd = i;
        this.copydefault = i2;
        this.KWHzl = i3;
    }
}
