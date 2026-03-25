package o;

import com.okinc.business.market.features.holders.domain.model.HolderDetailModel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jYw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C26287jYw {
    public final java.util.List<HolderDetailModel> AEQbTJ;
    public final jYC copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.jYw */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C26287jYw copy$default(C26287jYw c26287jYw, jYC jyc, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            jyc = c26287jYw.copydefault;
        }
        if ((i & 2) != 0) {
            list = c26287jYw.AEQbTJ;
        }
        return c26287jYw.AEQbTJ(jyc, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C26287jYw AEQbTJ(@NotNull jYC jyc, @NotNull java.util.List<HolderDetailModel> list) {
        Intrinsics.checkNotNullParameter(jyc, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new C26287jYw(jyc, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final jYC KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<HolderDetailModel> OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26287jYw)) {
            return false;
        }
        C26287jYw c26287jYw = (C26287jYw) obj;
        return Intrinsics.EZpvd(this.copydefault, c26287jYw.copydefault) && Intrinsics.EZpvd(this.AEQbTJ, c26287jYw.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.copydefault.hashCode() * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "HolderModel(summary=" + this.copydefault + ", listHolderDetail=" + this.AEQbTJ + ")";
    }

    public C26287jYw(@NotNull jYC jyc, @NotNull java.util.List<HolderDetailModel> list) {
        Intrinsics.checkNotNullParameter(jyc, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.copydefault = jyc;
        this.AEQbTJ = list;
    }
}
