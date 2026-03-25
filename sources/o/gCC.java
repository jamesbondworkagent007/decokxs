package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class gCC {
    public final java.lang.String AEQbTJ;
    public final AbstractC12782ctV EZpvd;
    public final int OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ gCC copy$default(gCC gcc, java.lang.String str, int i, java.lang.String str2, AbstractC12782ctV abstractC12782ctV, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = gcc.AEQbTJ;
        }
        if ((i2 & 2) != 0) {
            i = gcc.OLrzqt;
        }
        if ((i2 & 4) != 0) {
            str2 = gcc.copydefault;
        }
        if ((i2 & 8) != 0) {
            abstractC12782ctV = gcc.EZpvd;
        }
        return gcc.OLrzqt(str, i, str2, abstractC12782ctV);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC12782ctV KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final gCC OLrzqt(@NotNull java.lang.String str, int i, @NotNull java.lang.String str2, @NotNull AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        return new gCC(str, i, str2, abstractC12782ctV);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gCC)) {
            return false;
        }
        gCC gcc = (gCC) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) gcc.AEQbTJ) && this.OLrzqt == gcc.OLrzqt && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) gcc.copydefault) && Intrinsics.EZpvd(this.EZpvd, gcc.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.AEQbTJ.hashCode() * 31) + java.lang.Integer.hashCode(this.OLrzqt)) * 31) + this.copydefault.hashCode()) * 31) + this.EZpvd.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "UpdateAggregationAddressResult(address=" + this.AEQbTJ + ", addressType=" + this.OLrzqt + ", chainName=" + this.copydefault + ", wallet=" + this.EZpvd + ")";
    }

    public gCC(@NotNull java.lang.String str, int i, @NotNull java.lang.String str2, @NotNull AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        this.AEQbTJ = str;
        this.OLrzqt = i;
        this.copydefault = str2;
        this.EZpvd = abstractC12782ctV;
    }
}
