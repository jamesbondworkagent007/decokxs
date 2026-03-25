package o;

import com.okinc.okimcore.model.other.VipManagerRelationInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oqG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C37245oqG {
    public static final int copydefault = VipManagerRelationInfo.$stable;
    public final java.lang.String EZpvd;
    public final VipManagerRelationInfo KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C37245oqG copy$default(C37245oqG c37245oqG, VipManagerRelationInfo vipManagerRelationInfo, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            vipManagerRelationInfo = c37245oqG.KWHzl;
        }
        if ((i & 2) != 0) {
            str = c37245oqG.EZpvd;
        }
        return c37245oqG.OLrzqt(vipManagerRelationInfo, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final VipManagerRelationInfo AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C37245oqG OLrzqt(@NotNull VipManagerRelationInfo vipManagerRelationInfo, java.lang.String str) {
        Intrinsics.checkNotNullParameter(vipManagerRelationInfo, "");
        return new C37245oqG(vipManagerRelationInfo, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37245oqG)) {
            return false;
        }
        C37245oqG c37245oqG = (C37245oqG) obj;
        return Intrinsics.EZpvd(this.KWHzl, c37245oqG.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c37245oqG.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.KWHzl.hashCode();
        java.lang.String str = this.EZpvd;
        return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SearchVipManager(relationInfo=" + this.KWHzl + ", keyword=" + this.EZpvd + ")";
    }

    public C37245oqG(@NotNull VipManagerRelationInfo vipManagerRelationInfo, java.lang.String str) {
        Intrinsics.checkNotNullParameter(vipManagerRelationInfo, "");
        this.KWHzl = vipManagerRelationInfo;
        this.EZpvd = str;
    }
}
