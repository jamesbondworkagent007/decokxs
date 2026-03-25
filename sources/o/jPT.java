package o;

import com.okinc.business.market.features.filter.domain.TokenFilter;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class jPT {
    public final boolean KWHzl;
    public final TokenFilter OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ jPT copy$default(jPT jpt, java.lang.String str, TokenFilter tokenFilter, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = jpt.copydefault;
        }
        if ((i & 2) != 0) {
            tokenFilter = jpt.OLrzqt;
        }
        if ((i & 4) != 0) {
            z = jpt.KWHzl;
        }
        return jpt.AEQbTJ(str, tokenFilter, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final jPT AEQbTJ(@NotNull java.lang.String str, @NotNull TokenFilter tokenFilter, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(tokenFilter, "");
        return new jPT(str, tokenFilter, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jPT)) {
            return false;
        }
        jPT jpt = (jPT) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) jpt.copydefault) && Intrinsics.EZpvd(this.OLrzqt, jpt.OLrzqt) && this.KWHzl == jpt.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.copydefault.hashCode() * 31) + this.OLrzqt.hashCode()) * 31) + java.lang.Boolean.hashCode(this.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "PendingRequestKey(lastItemId=" + this.copydefault + ", filter=" + this.OLrzqt + ", isDescOrder=" + this.KWHzl + ")";
    }

    public jPT(@NotNull java.lang.String str, @NotNull TokenFilter tokenFilter, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(tokenFilter, "");
        this.copydefault = str;
        this.OLrzqt = tokenFilter;
        this.KWHzl = z;
    }
}
