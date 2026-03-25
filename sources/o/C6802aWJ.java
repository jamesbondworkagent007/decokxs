package o;

import com.okinc.biz.model.ModuleType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aWJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C6802aWJ {
    public final ModuleType AEQbTJ;
    public final java.lang.String OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C6802aWJ copy$default(C6802aWJ c6802aWJ, ModuleType moduleType, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            moduleType = c6802aWJ.AEQbTJ;
        }
        if ((i & 2) != 0) {
            str = c6802aWJ.OLrzqt;
        }
        return c6802aWJ.copydefault(moduleType, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ModuleType KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C6802aWJ copydefault(@NotNull ModuleType moduleType, java.lang.String str) {
        Intrinsics.checkNotNullParameter(moduleType, "");
        return new C6802aWJ(moduleType, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6802aWJ)) {
            return false;
        }
        C6802aWJ c6802aWJ = (C6802aWJ) obj;
        return this.AEQbTJ == c6802aWJ.AEQbTJ && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c6802aWJ.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.AEQbTJ.hashCode();
        java.lang.String str = this.OLrzqt;
        return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "RatingMetadataRequest(moduleType=" + this.AEQbTJ + ", businessId=" + this.OLrzqt + ")";
    }

    public C6802aWJ(@NotNull ModuleType moduleType, java.lang.String str) {
        Intrinsics.checkNotNullParameter(moduleType, "");
        this.AEQbTJ = moduleType;
        this.OLrzqt = str;
    }
}
