package o;

import com.okinc.productmatrix.api.bean.StringPair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fyq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C19310fyq {
    public final boolean AEQbTJ;
    public final boolean EZpvd;
    public final java.util.List<StringPair> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.fyq */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C19310fyq copy$default(C19310fyq c19310fyq, java.util.List list, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = c19310fyq.OLrzqt;
        }
        if ((i & 2) != 0) {
            z = c19310fyq.AEQbTJ;
        }
        if ((i & 4) != 0) {
            z2 = c19310fyq.EZpvd;
        }
        return c19310fyq.OLrzqt(list, z, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<StringPair> KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C19310fyq OLrzqt(@NotNull java.util.List<StringPair> list, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(list, "");
        return new C19310fyq(list, z, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19310fyq)) {
            return false;
        }
        C19310fyq c19310fyq = (C19310fyq) obj;
        return Intrinsics.EZpvd(this.OLrzqt, c19310fyq.OLrzqt) && this.AEQbTJ == c19310fyq.AEQbTJ && this.EZpvd == c19310fyq.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.OLrzqt.hashCode() * 31) + java.lang.Boolean.hashCode(this.AEQbTJ)) * 31) + java.lang.Boolean.hashCode(this.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SettingCenterViewState(productMatrixExtras=" + this.OLrzqt + ", isPreLogin=" + this.AEQbTJ + ", hasNewAppVersion=" + this.EZpvd + ")";
    }

    public C19310fyq(@NotNull java.util.List<StringPair> list, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(list, "");
        this.OLrzqt = list;
        this.AEQbTJ = z;
        this.EZpvd = z2;
    }
}
