package o;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.zAj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C58384zAj {
    public static final int $stable = 8;
    public zAO KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C58384zAj copy$default(C58384zAj c58384zAj, zAO zao, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            zao = c58384zAj.KWHzl;
        }
        return c58384zAj.KWHzl(zao);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final zAO KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C58384zAj KWHzl(zAO zao) {
        return new C58384zAj(zao);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C58384zAj) && Intrinsics.EZpvd(this.KWHzl, ((C58384zAj) obj).KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        zAO zao = this.KWHzl;
        if (zao == null) {
            return 0;
        }
        return zao.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ClientExtensionResultsData(credProps=" + this.KWHzl + ")";
    }

    public C58384zAj(zAO zao) {
        this.KWHzl = zao;
    }
}
