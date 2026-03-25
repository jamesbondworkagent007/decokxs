package o;

import com.okinc.market.watch.data.MarketUserFavorite;
import com.okinc.market.watch.data.UserGroup;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qWk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40453qWk {
    public final UserGroup KWHzl;
    public final java.util.List<MarketUserFavorite> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.qWk */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C40453qWk copy$default(C40453qWk c40453qWk, UserGroup userGroup, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            userGroup = c40453qWk.KWHzl;
        }
        if ((i & 2) != 0) {
            list = c40453qWk.OLrzqt;
        }
        return c40453qWk.AEQbTJ(userGroup, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C40453qWk AEQbTJ(@NotNull UserGroup userGroup, @NotNull java.util.List<MarketUserFavorite> list) {
        Intrinsics.checkNotNullParameter(userGroup, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new C40453qWk(userGroup, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UserGroup KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<MarketUserFavorite> copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40453qWk)) {
            return false;
        }
        C40453qWk c40453qWk = (C40453qWk) obj;
        return Intrinsics.EZpvd(this.KWHzl, c40453qWk.KWHzl) && Intrinsics.EZpvd(this.OLrzqt, c40453qWk.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.KWHzl.hashCode() * 31) + this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "UserGroupWithFavorites(userGroup=" + this.KWHzl + ", favorites=" + this.OLrzqt + ")";
    }

    public C40453qWk(@NotNull UserGroup userGroup, @NotNull java.util.List<MarketUserFavorite> list) {
        Intrinsics.checkNotNullParameter(userGroup, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.KWHzl = userGroup;
        this.OLrzqt = list;
    }
}
