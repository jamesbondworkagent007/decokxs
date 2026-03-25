package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class eWS {
    public final C10854bwM EZpvd;
    public final java.lang.String KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ eWS copy$default(eWS ews, java.lang.String str, C10854bwM c10854bwM, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = ews.KWHzl;
        }
        if ((i & 2) != 0) {
            c10854bwM = ews.EZpvd;
        }
        return ews.OLrzqt(str, c10854bwM);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C10854bwM AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final eWS OLrzqt(@NotNull java.lang.String str, C10854bwM c10854bwM) {
        Intrinsics.checkNotNullParameter(str, "");
        return new eWS(str, c10854bwM);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eWS)) {
            return false;
        }
        eWS ews = (eWS) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) ews.KWHzl) && Intrinsics.EZpvd(this.EZpvd, ews.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.KWHzl.hashCode();
        C10854bwM c10854bwM = this.EZpvd;
        return (iHashCode * 31) + (c10854bwM == null ? 0 : c10854bwM.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ProfileChainInfo(chainName=" + this.KWHzl + ", coinMeta=" + this.EZpvd + ")";
    }

    public eWS(@NotNull java.lang.String str, C10854bwM c10854bwM) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = str;
        this.EZpvd = c10854bwM;
    }
}
