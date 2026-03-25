package o;

import com.okinc.business.dexlogic.bean.DefiChainInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hiL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C22593hiL {
    public final DefiChainInfo KWHzl;
    public final boolean OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C22593hiL copy$default(C22593hiL c22593hiL, DefiChainInfo defiChainInfo, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            defiChainInfo = c22593hiL.KWHzl;
        }
        if ((i & 2) != 0) {
            z = c22593hiL.OLrzqt;
        }
        return c22593hiL.AEQbTJ(defiChainInfo, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C22593hiL AEQbTJ(@NotNull DefiChainInfo defiChainInfo, boolean z) {
        Intrinsics.checkNotNullParameter(defiChainInfo, "");
        return new C22593hiL(defiChainInfo, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DefiChainInfo KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22593hiL)) {
            return false;
        }
        C22593hiL c22593hiL = (C22593hiL) obj;
        return Intrinsics.EZpvd(this.KWHzl, c22593hiL.KWHzl) && this.OLrzqt == c22593hiL.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.KWHzl.hashCode() * 31) + java.lang.Boolean.hashCode(this.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ChainInfoUiData(chainInfo=" + this.KWHzl + ", clickable=" + this.OLrzqt + ")";
    }

    public C22593hiL(@NotNull DefiChainInfo defiChainInfo, boolean z) {
        Intrinsics.checkNotNullParameter(defiChainInfo, "");
        this.KWHzl = defiChainInfo;
        this.OLrzqt = z;
    }
}
