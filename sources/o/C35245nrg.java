package o;

import com.okinc.im.config.page.IMPageType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nrg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35245nrg {
    public final C35285nsT AEQbTJ;
    public final IMPageType OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C35245nrg copy$default(C35245nrg c35245nrg, IMPageType iMPageType, C35285nsT c35285nsT, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            iMPageType = c35245nrg.OLrzqt;
        }
        if ((i & 2) != 0) {
            c35285nsT = c35245nrg.AEQbTJ;
        }
        return c35245nrg.OLrzqt(iMPageType, c35285nsT);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C35285nsT EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final IMPageType OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C35245nrg OLrzqt(@NotNull IMPageType iMPageType, @NotNull C35285nsT c35285nsT) {
        Intrinsics.checkNotNullParameter(iMPageType, "");
        Intrinsics.checkNotNullParameter(c35285nsT, "");
        return new C35245nrg(iMPageType, c35285nsT);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35245nrg)) {
            return false;
        }
        C35245nrg c35245nrg = (C35245nrg) obj;
        return this.OLrzqt == c35245nrg.OLrzqt && Intrinsics.EZpvd(this.AEQbTJ, c35245nrg.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.OLrzqt.hashCode() * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "PageConfigData(pageType=" + this.OLrzqt + ", pageConfig=" + this.AEQbTJ + ")";
    }

    public C35245nrg(@NotNull IMPageType iMPageType, @NotNull C35285nsT c35285nsT) {
        Intrinsics.checkNotNullParameter(iMPageType, "");
        Intrinsics.checkNotNullParameter(c35285nsT, "");
        this.OLrzqt = iMPageType;
        this.AEQbTJ = c35285nsT;
    }
}
