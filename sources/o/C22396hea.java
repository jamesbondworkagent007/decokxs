package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hea, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C22396hea {
    public final java.lang.String AEQbTJ;
    public final C22342hdZ EZpvd;
    public final C22411hep OLrzqt;
    public final C22404hei copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C22396hea copy$default(C22396hea c22396hea, java.lang.String str, C22404hei c22404hei, C22342hdZ c22342hdZ, C22411hep c22411hep, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c22396hea.AEQbTJ;
        }
        if ((i & 2) != 0) {
            c22404hei = c22396hea.copydefault;
        }
        if ((i & 4) != 0) {
            c22342hdZ = c22396hea.EZpvd;
        }
        if ((i & 8) != 0) {
            c22411hep = c22396hea.OLrzqt;
        }
        return c22396hea.KWHzl(str, c22404hei, c22342hdZ, c22411hep);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C22411hep EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C22342hdZ KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C22396hea KWHzl(@NotNull java.lang.String str, @NotNull C22404hei c22404hei, @NotNull C22342hdZ c22342hdZ, @NotNull C22411hep c22411hep) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(c22404hei, "");
        Intrinsics.checkNotNullParameter(c22342hdZ, "");
        Intrinsics.checkNotNullParameter(c22411hep, "");
        return new C22396hea(str, c22404hei, c22342hdZ, c22411hep);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C22404hei OLrzqt() {
        return this.copydefault;
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
        if (!(obj instanceof C22396hea)) {
            return false;
        }
        C22396hea c22396hea = (C22396hea) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c22396hea.AEQbTJ) && Intrinsics.EZpvd(this.copydefault, c22396hea.copydefault) && Intrinsics.EZpvd(this.EZpvd, c22396hea.EZpvd) && Intrinsics.EZpvd(this.OLrzqt, c22396hea.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.AEQbTJ.hashCode() * 31) + this.copydefault.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "EventSubmitCommonProperty(submit_type=" + this.AEQbTJ + ", eventTransactionBaseProperty=" + this.copydefault + ", eventNetworkFeeProperty=" + this.EZpvd + ", userOperationProperty=" + this.OLrzqt + ")";
    }

    public C22396hea(@NotNull java.lang.String str, @NotNull C22404hei c22404hei, @NotNull C22342hdZ c22342hdZ, @NotNull C22411hep c22411hep) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(c22404hei, "");
        Intrinsics.checkNotNullParameter(c22342hdZ, "");
        Intrinsics.checkNotNullParameter(c22411hep, "");
        this.AEQbTJ = str;
        this.copydefault = c22404hei;
        this.EZpvd = c22342hdZ;
        this.OLrzqt = c22411hep;
    }
}
